// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class PlayerCollectionInfoOuterClass {
  /**
   * Protobuf type {@code PlayerCollectionInfo}
   */
  public static final class PlayerCollectionInfo extends ProtoMessage<PlayerCollectionInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 DCIOBLHLICO = 1;</code>
     */
    private int dCIOBLHLICO;

    /**
     * <code>optional uint32 ILADMEOHHEC = 3;</code>
     */
    private int iLADMEOHHEC;

    /**
     * <code>optional uint32 EJMJIKCDIMM = 6;</code>
     */
    private int eJMJIKCDIMM;

    /**
     * <code>optional uint32 JFLFDIJPNEO = 14;</code>
     */
    private int jFLFDIJPNEO;

    /**
     * <code>optional uint32 KLLEONMNLDI = 15;</code>
     */
    private int kLLEONMNLDI;

    private PlayerCollectionInfo() {
    }

    /**
     * @return a new empty instance of {@code PlayerCollectionInfo}
     */
    public static PlayerCollectionInfo newInstance() {
      return new PlayerCollectionInfo();
    }

    /**
     * <code>optional uint32 DCIOBLHLICO = 1;</code>
     * @return whether the dCIOBLHLICO field is set
     */
    public boolean hasDCIOBLHLICO() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 DCIOBLHLICO = 1;</code>
     * @return this
     */
    public PlayerCollectionInfo clearDCIOBLHLICO() {
      bitField0_ &= ~0x00000001;
      dCIOBLHLICO = 0;
      return this;
    }

    /**
     * <code>optional uint32 DCIOBLHLICO = 1;</code>
     * @return the dCIOBLHLICO
     */
    public int getDCIOBLHLICO() {
      return dCIOBLHLICO;
    }

    /**
     * <code>optional uint32 DCIOBLHLICO = 1;</code>
     * @param value the dCIOBLHLICO to set
     * @return this
     */
    public PlayerCollectionInfo setDCIOBLHLICO(final int value) {
      bitField0_ |= 0x00000001;
      dCIOBLHLICO = value;
      return this;
    }

    /**
     * <code>optional uint32 ILADMEOHHEC = 3;</code>
     * @return whether the iLADMEOHHEC field is set
     */
    public boolean hasILADMEOHHEC() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 ILADMEOHHEC = 3;</code>
     * @return this
     */
    public PlayerCollectionInfo clearILADMEOHHEC() {
      bitField0_ &= ~0x00000002;
      iLADMEOHHEC = 0;
      return this;
    }

    /**
     * <code>optional uint32 ILADMEOHHEC = 3;</code>
     * @return the iLADMEOHHEC
     */
    public int getILADMEOHHEC() {
      return iLADMEOHHEC;
    }

    /**
     * <code>optional uint32 ILADMEOHHEC = 3;</code>
     * @param value the iLADMEOHHEC to set
     * @return this
     */
    public PlayerCollectionInfo setILADMEOHHEC(final int value) {
      bitField0_ |= 0x00000002;
      iLADMEOHHEC = value;
      return this;
    }

    /**
     * <code>optional uint32 EJMJIKCDIMM = 6;</code>
     * @return whether the eJMJIKCDIMM field is set
     */
    public boolean hasEJMJIKCDIMM() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 EJMJIKCDIMM = 6;</code>
     * @return this
     */
    public PlayerCollectionInfo clearEJMJIKCDIMM() {
      bitField0_ &= ~0x00000004;
      eJMJIKCDIMM = 0;
      return this;
    }

    /**
     * <code>optional uint32 EJMJIKCDIMM = 6;</code>
     * @return the eJMJIKCDIMM
     */
    public int getEJMJIKCDIMM() {
      return eJMJIKCDIMM;
    }

    /**
     * <code>optional uint32 EJMJIKCDIMM = 6;</code>
     * @param value the eJMJIKCDIMM to set
     * @return this
     */
    public PlayerCollectionInfo setEJMJIKCDIMM(final int value) {
      bitField0_ |= 0x00000004;
      eJMJIKCDIMM = value;
      return this;
    }

    /**
     * <code>optional uint32 JFLFDIJPNEO = 14;</code>
     * @return whether the jFLFDIJPNEO field is set
     */
    public boolean hasJFLFDIJPNEO() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 JFLFDIJPNEO = 14;</code>
     * @return this
     */
    public PlayerCollectionInfo clearJFLFDIJPNEO() {
      bitField0_ &= ~0x00000008;
      jFLFDIJPNEO = 0;
      return this;
    }

    /**
     * <code>optional uint32 JFLFDIJPNEO = 14;</code>
     * @return the jFLFDIJPNEO
     */
    public int getJFLFDIJPNEO() {
      return jFLFDIJPNEO;
    }

    /**
     * <code>optional uint32 JFLFDIJPNEO = 14;</code>
     * @param value the jFLFDIJPNEO to set
     * @return this
     */
    public PlayerCollectionInfo setJFLFDIJPNEO(final int value) {
      bitField0_ |= 0x00000008;
      jFLFDIJPNEO = value;
      return this;
    }

    /**
     * <code>optional uint32 KLLEONMNLDI = 15;</code>
     * @return whether the kLLEONMNLDI field is set
     */
    public boolean hasKLLEONMNLDI() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 KLLEONMNLDI = 15;</code>
     * @return this
     */
    public PlayerCollectionInfo clearKLLEONMNLDI() {
      bitField0_ &= ~0x00000010;
      kLLEONMNLDI = 0;
      return this;
    }

    /**
     * <code>optional uint32 KLLEONMNLDI = 15;</code>
     * @return the kLLEONMNLDI
     */
    public int getKLLEONMNLDI() {
      return kLLEONMNLDI;
    }

    /**
     * <code>optional uint32 KLLEONMNLDI = 15;</code>
     * @param value the kLLEONMNLDI to set
     * @return this
     */
    public PlayerCollectionInfo setKLLEONMNLDI(final int value) {
      bitField0_ |= 0x00000010;
      kLLEONMNLDI = value;
      return this;
    }

    @Override
    public PlayerCollectionInfo copyFrom(final PlayerCollectionInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dCIOBLHLICO = other.dCIOBLHLICO;
        iLADMEOHHEC = other.iLADMEOHHEC;
        eJMJIKCDIMM = other.eJMJIKCDIMM;
        jFLFDIJPNEO = other.jFLFDIJPNEO;
        kLLEONMNLDI = other.kLLEONMNLDI;
      }
      return this;
    }

    @Override
    public PlayerCollectionInfo mergeFrom(final PlayerCollectionInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDCIOBLHLICO()) {
        setDCIOBLHLICO(other.dCIOBLHLICO);
      }
      if (other.hasILADMEOHHEC()) {
        setILADMEOHHEC(other.iLADMEOHHEC);
      }
      if (other.hasEJMJIKCDIMM()) {
        setEJMJIKCDIMM(other.eJMJIKCDIMM);
      }
      if (other.hasJFLFDIJPNEO()) {
        setJFLFDIJPNEO(other.jFLFDIJPNEO);
      }
      if (other.hasKLLEONMNLDI()) {
        setKLLEONMNLDI(other.kLLEONMNLDI);
      }
      return this;
    }

    @Override
    public PlayerCollectionInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dCIOBLHLICO = 0;
      iLADMEOHHEC = 0;
      eJMJIKCDIMM = 0;
      jFLFDIJPNEO = 0;
      kLLEONMNLDI = 0;
      return this;
    }

    @Override
    public PlayerCollectionInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayerCollectionInfo)) {
        return false;
      }
      PlayerCollectionInfo other = (PlayerCollectionInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasDCIOBLHLICO() || dCIOBLHLICO == other.dCIOBLHLICO)
        && (!hasILADMEOHHEC() || iLADMEOHHEC == other.iLADMEOHHEC)
        && (!hasEJMJIKCDIMM() || eJMJIKCDIMM == other.eJMJIKCDIMM)
        && (!hasJFLFDIJPNEO() || jFLFDIJPNEO == other.jFLFDIJPNEO)
        && (!hasKLLEONMNLDI() || kLLEONMNLDI == other.kLLEONMNLDI);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(dCIOBLHLICO);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(iLADMEOHHEC);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(eJMJIKCDIMM);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(jFLFDIJPNEO);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(kLLEONMNLDI);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dCIOBLHLICO);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(iLADMEOHHEC);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eJMJIKCDIMM);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(jFLFDIJPNEO);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(kLLEONMNLDI);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerCollectionInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // dCIOBLHLICO
            dCIOBLHLICO = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // iLADMEOHHEC
            iLADMEOHHEC = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // eJMJIKCDIMM
            eJMJIKCDIMM = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // jFLFDIJPNEO
            jFLFDIJPNEO = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // kLLEONMNLDI
            kLLEONMNLDI = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.dCIOBLHLICO, dCIOBLHLICO);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.iLADMEOHHEC, iLADMEOHHEC);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.eJMJIKCDIMM, eJMJIKCDIMM);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.jFLFDIJPNEO, jFLFDIJPNEO);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.kLLEONMNLDI, kLLEONMNLDI);
      }
      output.endObject();
    }

    @Override
    public PlayerCollectionInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -81891486: {
            if (input.isAtField(FieldNames.dCIOBLHLICO)) {
              if (!input.trySkipNullValue()) {
                dCIOBLHLICO = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1683099505: {
            if (input.isAtField(FieldNames.iLADMEOHHEC)) {
              if (!input.trySkipNullValue()) {
                iLADMEOHHEC = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -134364028: {
            if (input.isAtField(FieldNames.eJMJIKCDIMM)) {
              if (!input.trySkipNullValue()) {
                eJMJIKCDIMM = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -804934505: {
            if (input.isAtField(FieldNames.jFLFDIJPNEO)) {
              if (!input.trySkipNullValue()) {
                jFLFDIJPNEO = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 89650743: {
            if (input.isAtField(FieldNames.kLLEONMNLDI)) {
              if (!input.trySkipNullValue()) {
                kLLEONMNLDI = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public PlayerCollectionInfo clone() {
      return new PlayerCollectionInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerCollectionInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerCollectionInfo(), data).checkInitialized();
    }

    public static PlayerCollectionInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerCollectionInfo(), input).checkInitialized();
    }

    public static PlayerCollectionInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerCollectionInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerCollectionInfo messages
     */
    public static MessageFactory<PlayerCollectionInfo> getFactory() {
      return PlayerCollectionInfoFactory.INSTANCE;
    }

    private enum PlayerCollectionInfoFactory implements MessageFactory<PlayerCollectionInfo> {
      INSTANCE;

      @Override
      public PlayerCollectionInfo create() {
        return PlayerCollectionInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName dCIOBLHLICO = FieldName.forField("DCIOBLHLICO");

      static final FieldName iLADMEOHHEC = FieldName.forField("ILADMEOHHEC");

      static final FieldName eJMJIKCDIMM = FieldName.forField("EJMJIKCDIMM");

      static final FieldName jFLFDIJPNEO = FieldName.forField("JFLFDIJPNEO");

      static final FieldName kLLEONMNLDI = FieldName.forField("KLLEONMNLDI");
    }
  }
}