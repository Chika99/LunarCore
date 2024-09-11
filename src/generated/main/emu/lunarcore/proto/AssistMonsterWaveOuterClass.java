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
import us.hebi.quickbuf.RepeatedInt;

public final class AssistMonsterWaveOuterClass {
  /**
   * Protobuf type {@code AssistMonsterWave}
   */
  public static final class AssistMonsterWave extends ProtoMessage<AssistMonsterWave> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     */
    private final RepeatedInt entityIdList = RepeatedInt.newEmptyInstance();

    private AssistMonsterWave() {
    }

    /**
     * @return a new empty instance of {@code AssistMonsterWave}
     */
    public static AssistMonsterWave newInstance() {
      return new AssistMonsterWave();
    }

    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @return whether the entityIdList field is set
     */
    public boolean hasEntityIdList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @return this
     */
    public AssistMonsterWave clearEntityIdList() {
      bitField0_ &= ~0x00000001;
      entityIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntityIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getEntityIdList() {
      return entityIdList;
    }

    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableEntityIdList() {
      bitField0_ |= 0x00000001;
      return entityIdList;
    }

    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @param value the entityIdList to add
     * @return this
     */
    public AssistMonsterWave addEntityIdList(final int value) {
      bitField0_ |= 0x00000001;
      entityIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @param values the entityIdList to add
     * @return this
     */
    public AssistMonsterWave addAllEntityIdList(final int... values) {
      bitField0_ |= 0x00000001;
      entityIdList.addAll(values);
      return this;
    }

    @Override
    public AssistMonsterWave copyFrom(final AssistMonsterWave other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entityIdList.copyFrom(other.entityIdList);
      }
      return this;
    }

    @Override
    public AssistMonsterWave mergeFrom(final AssistMonsterWave other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntityIdList()) {
        getMutableEntityIdList().addAll(other.entityIdList);
      }
      return this;
    }

    @Override
    public AssistMonsterWave clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityIdList.clear();
      return this;
    }

    @Override
    public AssistMonsterWave clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof AssistMonsterWave)) {
        return false;
      }
      AssistMonsterWave other = (AssistMonsterWave) o;
      return bitField0_ == other.bitField0_
        && (!hasEntityIdList() || entityIdList.equals(other.entityIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < entityIdList.length(); i++) {
          output.writeRawByte((byte) 32);
          output.writeUInt32NoTag(entityIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * entityIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(entityIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public AssistMonsterWave mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 34: {
            // entityIdList [packed=true]
            input.readPackedUInt32(entityIdList, tag);
            bitField0_ |= 0x00000001;
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
          case 32: {
            // entityIdList [packed=false]
            tag = input.readRepeatedUInt32(entityIdList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.entityIdList, entityIdList);
      }
      output.endObject();
    }

    @Override
    public AssistMonsterWave mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 432358940:
          case -607564570: {
            if (input.isAtField(FieldNames.entityIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(entityIdList);
                bitField0_ |= 0x00000001;
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
    public AssistMonsterWave clone() {
      return new AssistMonsterWave().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static AssistMonsterWave parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new AssistMonsterWave(), data).checkInitialized();
    }

    public static AssistMonsterWave parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AssistMonsterWave(), input).checkInitialized();
    }

    public static AssistMonsterWave parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AssistMonsterWave(), input).checkInitialized();
    }

    /**
     * @return factory for creating AssistMonsterWave messages
     */
    public static MessageFactory<AssistMonsterWave> getFactory() {
      return AssistMonsterWaveFactory.INSTANCE;
    }

    private enum AssistMonsterWaveFactory implements MessageFactory<AssistMonsterWave> {
      INSTANCE;

      @Override
      public AssistMonsterWave create() {
        return AssistMonsterWave.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entityIdList = FieldName.forField("entityIdList", "entity_id_list");
    }
  }
}
