/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jnudeveloper.blog.thriftgen.domain;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-01-25")
public class Request implements org.apache.thrift.TBase<Request, Request._Fields>, java.io.Serializable, Cloneable, Comparable<Request> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Request");

  private static final org.apache.thrift.protocol.TField CLIENT_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("clientIp", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("appId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField APP_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("appKey", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("requestId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField REQUEST_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("requestTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RequestTupleSchemeFactory();

  public long clientIp; // required
  public int appId; // required
  public java.lang.String appKey; // required
  public java.lang.String requestId; // required
  public long requestTime; // required
  public java.lang.String data; // required
  public java.lang.String version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLIENT_IP((short)1, "clientIp"),
    APP_ID((short)2, "appId"),
    APP_KEY((short)3, "appKey"),
    REQUEST_ID((short)4, "requestId"),
    REQUEST_TIME((short)5, "requestTime"),
    DATA((short)6, "data"),
    VERSION((short)7, "version");

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
        case 1: // CLIENT_IP
          return CLIENT_IP;
        case 2: // APP_ID
          return APP_ID;
        case 3: // APP_KEY
          return APP_KEY;
        case 4: // REQUEST_ID
          return REQUEST_ID;
        case 5: // REQUEST_TIME
          return REQUEST_TIME;
        case 6: // DATA
          return DATA;
        case 7: // VERSION
          return VERSION;
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
  private static final int __CLIENTIP_ISSET_ID = 0;
  private static final int __APPID_ISSET_ID = 1;
  private static final int __REQUESTTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLIENT_IP, new org.apache.thrift.meta_data.FieldMetaData("clientIp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.APP_ID, new org.apache.thrift.meta_data.FieldMetaData("appId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APP_KEY, new org.apache.thrift.meta_data.FieldMetaData("appKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_ID, new org.apache.thrift.meta_data.FieldMetaData("requestId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_TIME, new org.apache.thrift.meta_data.FieldMetaData("requestTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }

  public Request() {
  }

  public Request(
    long clientIp,
    int appId,
    java.lang.String appKey,
    java.lang.String requestId,
    long requestTime,
    java.lang.String data,
    java.lang.String version)
  {
    this();
    this.clientIp = clientIp;
    setClientIpIsSet(true);
    this.appId = appId;
    setAppIdIsSet(true);
    this.appKey = appKey;
    this.requestId = requestId;
    this.requestTime = requestTime;
    setRequestTimeIsSet(true);
    this.data = data;
    this.version = version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    __isset_bitfield = other.__isset_bitfield;
    this.clientIp = other.clientIp;
    this.appId = other.appId;
    if (other.isSetAppKey()) {
      this.appKey = other.appKey;
    }
    if (other.isSetRequestId()) {
      this.requestId = other.requestId;
    }
    this.requestTime = other.requestTime;
    if (other.isSetData()) {
      this.data = other.data;
    }
    if (other.isSetVersion()) {
      this.version = other.version;
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @Override
  public void clear() {
    setClientIpIsSet(false);
    this.clientIp = 0;
    setAppIdIsSet(false);
    this.appId = 0;
    this.appKey = null;
    this.requestId = null;
    setRequestTimeIsSet(false);
    this.requestTime = 0;
    this.data = null;
    this.version = null;
  }

  public long getClientIp() {
    return this.clientIp;
  }

  public Request setClientIp(long clientIp) {
    this.clientIp = clientIp;
    setClientIpIsSet(true);
    return this;
  }

  public void unsetClientIp() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CLIENTIP_ISSET_ID);
  }

  /** Returns true if field clientIp is set (has been assigned a value) and false otherwise */
  public boolean isSetClientIp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CLIENTIP_ISSET_ID);
  }

  public void setClientIpIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CLIENTIP_ISSET_ID, value);
  }

  public int getAppId() {
    return this.appId;
  }

  public Request setAppId(int appId) {
    this.appId = appId;
    setAppIdIsSet(true);
    return this;
  }

  public void unsetAppId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APPID_ISSET_ID);
  }

  /** Returns true if field appId is set (has been assigned a value) and false otherwise */
  public boolean isSetAppId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APPID_ISSET_ID);
  }

  public void setAppIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APPID_ISSET_ID, value);
  }

  public java.lang.String getAppKey() {
    return this.appKey;
  }

  public Request setAppKey(java.lang.String appKey) {
    this.appKey = appKey;
    return this;
  }

  public void unsetAppKey() {
    this.appKey = null;
  }

  /** Returns true if field appKey is set (has been assigned a value) and false otherwise */
  public boolean isSetAppKey() {
    return this.appKey != null;
  }

  public void setAppKeyIsSet(boolean value) {
    if (!value) {
      this.appKey = null;
    }
  }

  public java.lang.String getRequestId() {
    return this.requestId;
  }

  public Request setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  public void unsetRequestId() {
    this.requestId = null;
  }

  /** Returns true if field requestId is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestId() {
    return this.requestId != null;
  }

  public void setRequestIdIsSet(boolean value) {
    if (!value) {
      this.requestId = null;
    }
  }

  public long getRequestTime() {
    return this.requestTime;
  }

  public Request setRequestTime(long requestTime) {
    this.requestTime = requestTime;
    setRequestTimeIsSet(true);
    return this;
  }

  public void unsetRequestTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REQUESTTIME_ISSET_ID);
  }

  /** Returns true if field requestTime is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REQUESTTIME_ISSET_ID);
  }

  public void setRequestTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REQUESTTIME_ISSET_ID, value);
  }

  public java.lang.String getData() {
    return this.data;
  }

  public Request setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public java.lang.String getVersion() {
    return this.version;
  }

  public Request setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CLIENT_IP:
      if (value == null) {
        unsetClientIp();
      } else {
        setClientIp((java.lang.Long)value);
      }
      break;

    case APP_ID:
      if (value == null) {
        unsetAppId();
      } else {
        setAppId((java.lang.Integer)value);
      }
      break;

    case APP_KEY:
      if (value == null) {
        unsetAppKey();
      } else {
        setAppKey((java.lang.String)value);
      }
      break;

    case REQUEST_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        setRequestId((java.lang.String)value);
      }
      break;

    case REQUEST_TIME:
      if (value == null) {
        unsetRequestTime();
      } else {
        setRequestTime((java.lang.Long)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((java.lang.String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CLIENT_IP:
      return getClientIp();

    case APP_ID:
      return getAppId();

    case APP_KEY:
      return getAppKey();

    case REQUEST_ID:
      return getRequestId();

    case REQUEST_TIME:
      return getRequestTime();

    case DATA:
      return getData();

    case VERSION:
      return getVersion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CLIENT_IP:
      return isSetClientIp();
    case APP_ID:
      return isSetAppId();
    case APP_KEY:
      return isSetAppKey();
    case REQUEST_ID:
      return isSetRequestId();
    case REQUEST_TIME:
      return isSetRequestTime();
    case DATA:
      return isSetData();
    case VERSION:
      return isSetVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Request)
      return this.equals((Request)that);
    return false;
  }

  public boolean equals(Request that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_clientIp = true;
    boolean that_present_clientIp = true;
    if (this_present_clientIp || that_present_clientIp) {
      if (!(this_present_clientIp && that_present_clientIp))
        return false;
      if (this.clientIp != that.clientIp)
        return false;
    }

    boolean this_present_appId = true;
    boolean that_present_appId = true;
    if (this_present_appId || that_present_appId) {
      if (!(this_present_appId && that_present_appId))
        return false;
      if (this.appId != that.appId)
        return false;
    }

    boolean this_present_appKey = true && this.isSetAppKey();
    boolean that_present_appKey = true && that.isSetAppKey();
    if (this_present_appKey || that_present_appKey) {
      if (!(this_present_appKey && that_present_appKey))
        return false;
      if (!this.appKey.equals(that.appKey))
        return false;
    }

    boolean this_present_requestId = true && this.isSetRequestId();
    boolean that_present_requestId = true && that.isSetRequestId();
    if (this_present_requestId || that_present_requestId) {
      if (!(this_present_requestId && that_present_requestId))
        return false;
      if (!this.requestId.equals(that.requestId))
        return false;
    }

    boolean this_present_requestTime = true;
    boolean that_present_requestTime = true;
    if (this_present_requestTime || that_present_requestTime) {
      if (!(this_present_requestTime && that_present_requestTime))
        return false;
      if (this.requestTime != that.requestTime)
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(clientIp);

    hashCode = hashCode * 8191 + appId;

    hashCode = hashCode * 8191 + ((isSetAppKey()) ? 131071 : 524287);
    if (isSetAppKey())
      hashCode = hashCode * 8191 + appKey.hashCode();

    hashCode = hashCode * 8191 + ((isSetRequestId()) ? 131071 : 524287);
    if (isSetRequestId())
      hashCode = hashCode * 8191 + requestId.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(requestTime);

    hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
    if (isSetData())
      hashCode = hashCode * 8191 + data.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersion()) ? 131071 : 524287);
    if (isSetVersion())
      hashCode = hashCode * 8191 + version.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetClientIp()).compareTo(other.isSetClientIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientIp, other.clientIp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAppId()).compareTo(other.isSetAppId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appId, other.appId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAppKey()).compareTo(other.isSetAppKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appKey, other.appKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRequestId()).compareTo(other.isSetRequestId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestId, other.requestId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRequestTime()).compareTo(other.isSetRequestTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestTime, other.requestTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(");
    boolean first = true;

    sb.append("clientIp:");
    sb.append(this.clientIp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("appId:");
    sb.append(this.appId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("appKey:");
    if (this.appKey == null) {
      sb.append("null");
    } else {
      sb.append(this.appKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestId:");
    if (this.requestId == null) {
      sb.append("null");
    } else {
      sb.append(this.requestId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestTime:");
    sb.append(this.requestTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
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

  private static class RequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RequestStandardScheme getScheme() {
      return new RequestStandardScheme();
    }
  }

  private static class RequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<Request> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLIENT_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.clientIp = iprot.readI64();
              struct.setClientIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.appId = iprot.readI32();
              struct.setAppIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APP_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.appKey = iprot.readString();
              struct.setAppKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REQUEST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestId = iprot.readString();
              struct.setRequestIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REQUEST_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.requestTime = iprot.readI64();
              struct.setRequestTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.data = iprot.readString();
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.setVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Request struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CLIENT_IP_FIELD_DESC);
      oprot.writeI64(struct.clientIp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APP_ID_FIELD_DESC);
      oprot.writeI32(struct.appId);
      oprot.writeFieldEnd();
      if (struct.appKey != null) {
        oprot.writeFieldBegin(APP_KEY_FIELD_DESC);
        oprot.writeString(struct.appKey);
        oprot.writeFieldEnd();
      }
      if (struct.requestId != null) {
        oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
        oprot.writeString(struct.requestId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REQUEST_TIME_FIELD_DESC);
      oprot.writeI64(struct.requestTime);
      oprot.writeFieldEnd();
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        oprot.writeString(struct.data);
        oprot.writeFieldEnd();
      }
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeString(struct.version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RequestTupleScheme getScheme() {
      return new RequestTupleScheme();
    }
  }

  private static class RequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<Request> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetClientIp()) {
        optionals.set(0);
      }
      if (struct.isSetAppId()) {
        optionals.set(1);
      }
      if (struct.isSetAppKey()) {
        optionals.set(2);
      }
      if (struct.isSetRequestId()) {
        optionals.set(3);
      }
      if (struct.isSetRequestTime()) {
        optionals.set(4);
      }
      if (struct.isSetData()) {
        optionals.set(5);
      }
      if (struct.isSetVersion()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetClientIp()) {
        oprot.writeI64(struct.clientIp);
      }
      if (struct.isSetAppId()) {
        oprot.writeI32(struct.appId);
      }
      if (struct.isSetAppKey()) {
        oprot.writeString(struct.appKey);
      }
      if (struct.isSetRequestId()) {
        oprot.writeString(struct.requestId);
      }
      if (struct.isSetRequestTime()) {
        oprot.writeI64(struct.requestTime);
      }
      if (struct.isSetData()) {
        oprot.writeString(struct.data);
      }
      if (struct.isSetVersion()) {
        oprot.writeString(struct.version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.clientIp = iprot.readI64();
        struct.setClientIpIsSet(true);
      }
      if (incoming.get(1)) {
        struct.appId = iprot.readI32();
        struct.setAppIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.appKey = iprot.readString();
        struct.setAppKeyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.requestId = iprot.readString();
        struct.setRequestIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.requestTime = iprot.readI64();
        struct.setRequestTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.data = iprot.readString();
        struct.setDataIsSet(true);
      }
      if (incoming.get(6)) {
        struct.version = iprot.readString();
        struct.setVersionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

