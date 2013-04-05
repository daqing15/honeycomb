/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.nearinfinity.honeycomb.mysql;

import java.util.Map;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TableSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TableSchema\",\"namespace\":\"com.nearinfinity.honeycomb.mysql.gen\",\"fields\":[{\"name\":\"columns\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"ColumnSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"ColumnType\",\"symbols\":[\"STRING\",\"BINARY\",\"ULONG\",\"LONG\",\"DOUBLE\",\"DECIMAL\",\"TIME\",\"DATE\",\"DATETIME\"]}},{\"name\":\"isNullable\",\"type\":\"boolean\",\"default\":true},{\"name\":\"isAutoIncrement\",\"type\":\"boolean\",\"default\":false},{\"name\":\"maxLength\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"scale\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"precision\",\"type\":[\"null\",\"int\"],\"default\":null}]},\"avro.java.string\":\"String\"}},{\"name\":\"indices\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"IndexSchema\",\"fields\":[{\"name\":\"columns\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"isUnique\",\"type\":\"boolean\",\"default\":false}]},\"avro.java.string\":\"String\"}}]}");
  @Deprecated public java.util.Map<java.lang.String,ColumnSchema> columns;
  @Deprecated public java.util.Map<java.lang.String,IndexSchema> indices;

  /**
   * Default constructor.
   */
  public TableSchema() {}

  /**
   * All-args constructor.
   */
  public TableSchema(Map<String, ColumnSchema> columns, Map<String, IndexSchema> indices) {
    this.columns = columns;
    this.indices = indices;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return columns;
    case 1: return indices;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: columns = (java.util.Map<java.lang.String,ColumnSchema>)value$; break;
    case 1: indices = (java.util.Map<java.lang.String,IndexSchema>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'columns' field.
   */
  public java.util.Map<java.lang.String,ColumnSchema> getColumns() {
    return columns;
  }

  /**
   * Sets the value of the 'columns' field.
   * @param value the value to set.
   */
  public void setColumns(java.util.Map<java.lang.String,ColumnSchema> value) {
    this.columns = value;
  }

  /**
   * Gets the value of the 'indices' field.
   */
  public java.util.Map<java.lang.String,IndexSchema> getIndices() {
    return indices;
  }

  /**
   * Sets the value of the 'indices' field.
   * @param value the value to set.
   */
  public void setIndices(java.util.Map<java.lang.String,IndexSchema> value) {
    this.indices = value;
  }

  /** Creates a new TableSchema RecordBuilder */
  public static TableSchema.Builder newBuilder() {
    return new TableSchema.Builder();
  }
  
  /** Creates a new TableSchema RecordBuilder by copying an existing Builder */
  public static TableSchema.Builder newBuilder(TableSchema.Builder other) {
    return new TableSchema.Builder(other);
  }
  
  /** Creates a new TableSchema RecordBuilder by copying an existing TableSchema instance */
  public static TableSchema.Builder newBuilder(TableSchema other) {
    return new TableSchema.Builder(other);
  }
  
  /**
   * RecordBuilder for TableSchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TableSchema>
    implements org.apache.avro.data.RecordBuilder<TableSchema> {

    private java.util.Map<java.lang.String,ColumnSchema> columns;
    private java.util.Map<java.lang.String,IndexSchema> indices;

    /** Creates a new Builder */
    private Builder() {
      super(TableSchema.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(TableSchema.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing TableSchema instance */
    private Builder(TableSchema other) {
            super(TableSchema.SCHEMA$);
      if (isValidValue(fields()[0], other.columns)) {
        this.columns = data().deepCopy(fields()[0].schema(), other.columns);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.indices)) {
        this.indices = data().deepCopy(fields()[1].schema(), other.indices);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'columns' field */
    public java.util.Map<java.lang.String,ColumnSchema> getColumns() {
      return columns;
    }
    
    /** Sets the value of the 'columns' field */
    public TableSchema.Builder setColumns(java.util.Map<java.lang.String,ColumnSchema> value) {
      validate(fields()[0], value);
      this.columns = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'columns' field has been set */
    public boolean hasColumns() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'columns' field */
    public TableSchema.Builder clearColumns() {
      columns = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'indices' field */
    public java.util.Map<java.lang.String,IndexSchema> getIndices() {
      return indices;
    }
    
    /** Sets the value of the 'indices' field */
    public TableSchema.Builder setIndices(java.util.Map<java.lang.String,IndexSchema> value) {
      validate(fields()[1], value);
      this.indices = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'indices' field has been set */
    public boolean hasIndices() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'indices' field */
    public TableSchema.Builder clearIndices() {
      indices = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public TableSchema build() {
      try {
        TableSchema record = new TableSchema();
        record.columns = fieldSetFlags()[0] ? this.columns : (java.util.Map<java.lang.String,ColumnSchema>) defaultValue(fields()[0]);
        record.indices = fieldSetFlags()[1] ? this.indices : (java.util.Map<java.lang.String,IndexSchema>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
