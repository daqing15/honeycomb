package com.nearinfinity.mysqlengine.jni;

import com.nearinfinity.hbaseclient.ResultParser;
import org.apache.hadoop.hbase.client.Result;
import org.apache.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class IndexRow {
    private byte[] uuid;
    private TreeMap<String, byte[]> rowMap;

    private static final Logger logger = Logger.getLogger(IndexRow.class);

    public IndexRow() {
        this.uuid = null;
    }

    public Map<String, byte[]> getRowMap() {
        return this.rowMap;
    }

    public byte[] getUUID() {
        return uuid;
    }

    public void setUUID(UUID rowUuid) {
        this.uuid = ByteBuffer.allocate(16)
                .putLong(rowUuid.getMostSignificantBits())
                .putLong(rowUuid.getLeastSignificantBits())
                .array();
    }

    @SuppressWarnings("unchecked")
    public void parseResult(Result result) {
        byte[] mapBytes = ResultParser.parseValueMap(result);

        try {
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(mapBytes));
            this.rowMap = (TreeMap<String, byte[]>)in.readObject();
            in.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }

        this.setUUID(ResultParser.parseUUID(result));
    }
}
