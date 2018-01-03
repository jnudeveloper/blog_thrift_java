/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.blog.thrift.domain;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-01-03")
public class Comment implements org.apache.thrift.TBase<Comment, Comment._Fields>, java.io.Serializable, Cloneable, Comparable<Comment> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Comment");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField POST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("post_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PARENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parent_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("create_time", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("update_time", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField AUTHOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("author_id", org.apache.thrift.protocol.TType.I32, (short)8);
  private static final org.apache.thrift.protocol.TField APPROVE_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("approve_num", org.apache.thrift.protocol.TType.I32, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CommentStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CommentTupleSchemeFactory();

  public int id; // required
  public int post_id; // required
  public int parent_id; // required
  public byte status; // required
  public java.lang.String content; // required
  public int create_time; // required
  public int update_time; // required
  public int author_id; // required
  public int approve_num; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    POST_ID((short)2, "post_id"),
    PARENT_ID((short)3, "parent_id"),
    STATUS((short)4, "status"),
    CONTENT((short)5, "content"),
    CREATE_TIME((short)6, "create_time"),
    UPDATE_TIME((short)7, "update_time"),
    AUTHOR_ID((short)8, "author_id"),
    APPROVE_NUM((short)9, "approve_num");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // POST_ID
          return POST_ID;
        case 3: // PARENT_ID
          return PARENT_ID;
        case 4: // STATUS
          return STATUS;
        case 5: // CONTENT
          return CONTENT;
        case 6: // CREATE_TIME
          return CREATE_TIME;
        case 7: // UPDATE_TIME
          return UPDATE_TIME;
        case 8: // AUTHOR_ID
          return AUTHOR_ID;
        case 9: // APPROVE_NUM
          return APPROVE_NUM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __POST_ID_ISSET_ID = 1;
  private static final int __PARENT_ID_ISSET_ID = 2;
  private static final int __STATUS_ISSET_ID = 3;
  private static final int __CREATE_TIME_ISSET_ID = 4;
  private static final int __UPDATE_TIME_ISSET_ID = 5;
  private static final int __AUTHOR_ID_ISSET_ID = 6;
  private static final int __APPROVE_NUM_ISSET_ID = 7;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POST_ID, new org.apache.thrift.meta_data.FieldMetaData("post_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARENT_ID, new org.apache.thrift.meta_data.FieldMetaData("parent_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("create_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("update_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AUTHOR_ID, new org.apache.thrift.meta_data.FieldMetaData("author_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APPROVE_NUM, new org.apache.thrift.meta_data.FieldMetaData("approve_num", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Comment.class, metaDataMap);
  }

  public Comment() {
  }

  public Comment(
    int id,
    int post_id,
    int parent_id,
    byte status,
    java.lang.String content,
    int create_time,
    int update_time,
    int author_id,
    int approve_num)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.post_id = post_id;
    setPost_idIsSet(true);
    this.parent_id = parent_id;
    setParent_idIsSet(true);
    this.status = status;
    setStatusIsSet(true);
    this.content = content;
    this.create_time = create_time;
    setCreate_timeIsSet(true);
    this.update_time = update_time;
    setUpdate_timeIsSet(true);
    this.author_id = author_id;
    setAuthor_idIsSet(true);
    this.approve_num = approve_num;
    setApprove_numIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Comment(Comment other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.post_id = other.post_id;
    this.parent_id = other.parent_id;
    this.status = other.status;
    if (other.isSetContent()) {
      this.content = other.content;
    }
    this.create_time = other.create_time;
    this.update_time = other.update_time;
    this.author_id = other.author_id;
    this.approve_num = other.approve_num;
  }

  public Comment deepCopy() {
    return new Comment(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setPost_idIsSet(false);
    this.post_id = 0;
    setParent_idIsSet(false);
    this.parent_id = 0;
    setStatusIsSet(false);
    this.status = 0;
    this.content = null;
    setCreate_timeIsSet(false);
    this.create_time = 0;
    setUpdate_timeIsSet(false);
    this.update_time = 0;
    setAuthor_idIsSet(false);
    this.author_id = 0;
    setApprove_numIsSet(false);
    this.approve_num = 0;
  }

  public int getId() {
    return this.id;
  }

  public Comment setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getPost_id() {
    return this.post_id;
  }

  public Comment setPost_id(int post_id) {
    this.post_id = post_id;
    setPost_idIsSet(true);
    return this;
  }

  public void unsetPost_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POST_ID_ISSET_ID);
  }

  /** Returns true if field post_id is set (has been assigned a value) and false otherwise */
  public boolean isSetPost_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POST_ID_ISSET_ID);
  }

  public void setPost_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POST_ID_ISSET_ID, value);
  }

  public int getParent_id() {
    return this.parent_id;
  }

  public Comment setParent_id(int parent_id) {
    this.parent_id = parent_id;
    setParent_idIsSet(true);
    return this;
  }

  public void unsetParent_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARENT_ID_ISSET_ID);
  }

  /** Returns true if field parent_id is set (has been assigned a value) and false otherwise */
  public boolean isSetParent_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARENT_ID_ISSET_ID);
  }

  public void setParent_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARENT_ID_ISSET_ID, value);
  }

  public byte getStatus() {
    return this.status;
  }

  public Comment setStatus(byte status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public Comment setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public int getCreate_time() {
    return this.create_time;
  }

  public Comment setCreate_time(int create_time) {
    this.create_time = create_time;
    setCreate_timeIsSet(true);
    return this;
  }

  public void unsetCreate_time() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATE_TIME_ISSET_ID);
  }

  /** Returns true if field create_time is set (has been assigned a value) and false otherwise */
  public boolean isSetCreate_time() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATE_TIME_ISSET_ID);
  }

  public void setCreate_timeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATE_TIME_ISSET_ID, value);
  }

  public int getUpdate_time() {
    return this.update_time;
  }

  public Comment setUpdate_time(int update_time) {
    this.update_time = update_time;
    setUpdate_timeIsSet(true);
    return this;
  }

  public void unsetUpdate_time() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UPDATE_TIME_ISSET_ID);
  }

  /** Returns true if field update_time is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdate_time() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UPDATE_TIME_ISSET_ID);
  }

  public void setUpdate_timeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UPDATE_TIME_ISSET_ID, value);
  }

  public int getAuthor_id() {
    return this.author_id;
  }

  public Comment setAuthor_id(int author_id) {
    this.author_id = author_id;
    setAuthor_idIsSet(true);
    return this;
  }

  public void unsetAuthor_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AUTHOR_ID_ISSET_ID);
  }

  /** Returns true if field author_id is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthor_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AUTHOR_ID_ISSET_ID);
  }

  public void setAuthor_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AUTHOR_ID_ISSET_ID, value);
  }

  public int getApprove_num() {
    return this.approve_num;
  }

  public Comment setApprove_num(int approve_num) {
    this.approve_num = approve_num;
    setApprove_numIsSet(true);
    return this;
  }

  public void unsetApprove_num() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APPROVE_NUM_ISSET_ID);
  }

  /** Returns true if field approve_num is set (has been assigned a value) and false otherwise */
  public boolean isSetApprove_num() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APPROVE_NUM_ISSET_ID);
  }

  public void setApprove_numIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APPROVE_NUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case POST_ID:
      if (value == null) {
        unsetPost_id();
      } else {
        setPost_id((java.lang.Integer)value);
      }
      break;

    case PARENT_ID:
      if (value == null) {
        unsetParent_id();
      } else {
        setParent_id((java.lang.Integer)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.Byte)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((java.lang.String)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreate_time();
      } else {
        setCreate_time((java.lang.Integer)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdate_time();
      } else {
        setUpdate_time((java.lang.Integer)value);
      }
      break;

    case AUTHOR_ID:
      if (value == null) {
        unsetAuthor_id();
      } else {
        setAuthor_id((java.lang.Integer)value);
      }
      break;

    case APPROVE_NUM:
      if (value == null) {
        unsetApprove_num();
      } else {
        setApprove_num((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case POST_ID:
      return getPost_id();

    case PARENT_ID:
      return getParent_id();

    case STATUS:
      return getStatus();

    case CONTENT:
      return getContent();

    case CREATE_TIME:
      return getCreate_time();

    case UPDATE_TIME:
      return getUpdate_time();

    case AUTHOR_ID:
      return getAuthor_id();

    case APPROVE_NUM:
      return getApprove_num();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case POST_ID:
      return isSetPost_id();
    case PARENT_ID:
      return isSetParent_id();
    case STATUS:
      return isSetStatus();
    case CONTENT:
      return isSetContent();
    case CREATE_TIME:
      return isSetCreate_time();
    case UPDATE_TIME:
      return isSetUpdate_time();
    case AUTHOR_ID:
      return isSetAuthor_id();
    case APPROVE_NUM:
      return isSetApprove_num();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Comment)
      return this.equals((Comment)that);
    return false;
  }

  public boolean equals(Comment that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_post_id = true;
    boolean that_present_post_id = true;
    if (this_present_post_id || that_present_post_id) {
      if (!(this_present_post_id && that_present_post_id))
        return false;
      if (this.post_id != that.post_id)
        return false;
    }

    boolean this_present_parent_id = true;
    boolean that_present_parent_id = true;
    if (this_present_parent_id || that_present_parent_id) {
      if (!(this_present_parent_id && that_present_parent_id))
        return false;
      if (this.parent_id != that.parent_id)
        return false;
    }

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_create_time = true;
    boolean that_present_create_time = true;
    if (this_present_create_time || that_present_create_time) {
      if (!(this_present_create_time && that_present_create_time))
        return false;
      if (this.create_time != that.create_time)
        return false;
    }

    boolean this_present_update_time = true;
    boolean that_present_update_time = true;
    if (this_present_update_time || that_present_update_time) {
      if (!(this_present_update_time && that_present_update_time))
        return false;
      if (this.update_time != that.update_time)
        return false;
    }

    boolean this_present_author_id = true;
    boolean that_present_author_id = true;
    if (this_present_author_id || that_present_author_id) {
      if (!(this_present_author_id && that_present_author_id))
        return false;
      if (this.author_id != that.author_id)
        return false;
    }

    boolean this_present_approve_num = true;
    boolean that_present_approve_num = true;
    if (this_present_approve_num || that_present_approve_num) {
      if (!(this_present_approve_num && that_present_approve_num))
        return false;
      if (this.approve_num != that.approve_num)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + post_id;

    hashCode = hashCode * 8191 + parent_id;

    hashCode = hashCode * 8191 + (int) (status);

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    hashCode = hashCode * 8191 + create_time;

    hashCode = hashCode * 8191 + update_time;

    hashCode = hashCode * 8191 + author_id;

    hashCode = hashCode * 8191 + approve_num;

    return hashCode;
  }

  @Override
  public int compareTo(Comment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPost_id()).compareTo(other.isSetPost_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPost_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.post_id, other.post_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetParent_id()).compareTo(other.isSetParent_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParent_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parent_id, other.parent_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreate_time()).compareTo(other.isSetCreate_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreate_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.create_time, other.create_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdate_time()).compareTo(other.isSetUpdate_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdate_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.update_time, other.update_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAuthor_id()).compareTo(other.isSetAuthor_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthor_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.author_id, other.author_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApprove_num()).compareTo(other.isSetApprove_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApprove_num()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.approve_num, other.approve_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Comment(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("post_id:");
    sb.append(this.post_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("parent_id:");
    sb.append(this.parent_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("create_time:");
    sb.append(this.create_time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("update_time:");
    sb.append(this.update_time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("author_id:");
    sb.append(this.author_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("approve_num:");
    sb.append(this.approve_num);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CommentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CommentStandardScheme getScheme() {
      return new CommentStandardScheme();
    }
  }

  private static class CommentStandardScheme extends org.apache.thrift.scheme.StandardScheme<Comment> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Comment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // POST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.post_id = iprot.readI32();
              struct.setPost_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.parent_id = iprot.readI32();
              struct.setParent_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.status = iprot.readByte();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.create_time = iprot.readI32();
              struct.setCreate_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.update_time = iprot.readI32();
              struct.setUpdate_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // AUTHOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.author_id = iprot.readI32();
              struct.setAuthor_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // APPROVE_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.approve_num = iprot.readI32();
              struct.setApprove_numIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Comment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(POST_ID_FIELD_DESC);
      oprot.writeI32(struct.post_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PARENT_ID_FIELD_DESC);
      oprot.writeI32(struct.parent_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeByte(struct.status);
      oprot.writeFieldEnd();
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
      oprot.writeI32(struct.create_time);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
      oprot.writeI32(struct.update_time);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AUTHOR_ID_FIELD_DESC);
      oprot.writeI32(struct.author_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPROVE_NUM_FIELD_DESC);
      oprot.writeI32(struct.approve_num);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CommentTupleScheme getScheme() {
      return new CommentTupleScheme();
    }
  }

  private static class CommentTupleScheme extends org.apache.thrift.scheme.TupleScheme<Comment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Comment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetPost_id()) {
        optionals.set(1);
      }
      if (struct.isSetParent_id()) {
        optionals.set(2);
      }
      if (struct.isSetStatus()) {
        optionals.set(3);
      }
      if (struct.isSetContent()) {
        optionals.set(4);
      }
      if (struct.isSetCreate_time()) {
        optionals.set(5);
      }
      if (struct.isSetUpdate_time()) {
        optionals.set(6);
      }
      if (struct.isSetAuthor_id()) {
        optionals.set(7);
      }
      if (struct.isSetApprove_num()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetPost_id()) {
        oprot.writeI32(struct.post_id);
      }
      if (struct.isSetParent_id()) {
        oprot.writeI32(struct.parent_id);
      }
      if (struct.isSetStatus()) {
        oprot.writeByte(struct.status);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
      if (struct.isSetCreate_time()) {
        oprot.writeI32(struct.create_time);
      }
      if (struct.isSetUpdate_time()) {
        oprot.writeI32(struct.update_time);
      }
      if (struct.isSetAuthor_id()) {
        oprot.writeI32(struct.author_id);
      }
      if (struct.isSetApprove_num()) {
        oprot.writeI32(struct.approve_num);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Comment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.post_id = iprot.readI32();
        struct.setPost_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.parent_id = iprot.readI32();
        struct.setParent_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.status = iprot.readByte();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(4)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(5)) {
        struct.create_time = iprot.readI32();
        struct.setCreate_timeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.update_time = iprot.readI32();
        struct.setUpdate_timeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.author_id = iprot.readI32();
        struct.setAuthor_idIsSet(true);
      }
      if (incoming.get(8)) {
        struct.approve_num = iprot.readI32();
        struct.setApprove_numIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

