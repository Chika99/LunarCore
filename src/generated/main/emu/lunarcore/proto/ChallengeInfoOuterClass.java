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

public final class ChallengeInfoOuterClass {
  /**
   * Protobuf type {@code ChallengeInfo}
   */
  public static final class ChallengeInfo extends ProtoMessage<ChallengeInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     */
    private int challengeId;

    /**
     * <code>optional uint32 score_two = 5;</code>
     */
    private int scoreTwo;

    /**
     * <code>optional uint32 round_count = 13;</code>
     */
    private int roundCount;

    /**
     * <code>optional uint32 score = 14;</code>
     */
    private int score;

    /**
     * <code>optional .ChallengeStatus status = 1;</code>
     */
    private int status;

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 11;</code>
     */
    private int extraLineupType;

    /**
     * <code>optional .ChallengeStoryInfo ext_info = 7;</code>
     */
    private final ChallengeStoryInfoOuterClass.ChallengeStoryInfo extInfo = ChallengeStoryInfoOuterClass.ChallengeStoryInfo.newInstance();

    private ChallengeInfo() {
    }

    /**
     * @return a new empty instance of {@code ChallengeInfo}
     */
    public static ChallengeInfo newInstance() {
      return new ChallengeInfo();
    }

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     * @return this
     */
    public ChallengeInfo clearChallengeId() {
      bitField0_ &= ~0x00000001;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     * @param value the challengeId to set
     * @return this
     */
    public ChallengeInfo setChallengeId(final int value) {
      bitField0_ |= 0x00000001;
      challengeId = value;
      return this;
    }

    /**
     * <code>optional uint32 score_two = 5;</code>
     * @return whether the scoreTwo field is set
     */
    public boolean hasScoreTwo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 score_two = 5;</code>
     * @return this
     */
    public ChallengeInfo clearScoreTwo() {
      bitField0_ &= ~0x00000002;
      scoreTwo = 0;
      return this;
    }

    /**
     * <code>optional uint32 score_two = 5;</code>
     * @return the scoreTwo
     */
    public int getScoreTwo() {
      return scoreTwo;
    }

    /**
     * <code>optional uint32 score_two = 5;</code>
     * @param value the scoreTwo to set
     * @return this
     */
    public ChallengeInfo setScoreTwo(final int value) {
      bitField0_ |= 0x00000002;
      scoreTwo = value;
      return this;
    }

    /**
     * <code>optional uint32 round_count = 13;</code>
     * @return whether the roundCount field is set
     */
    public boolean hasRoundCount() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 round_count = 13;</code>
     * @return this
     */
    public ChallengeInfo clearRoundCount() {
      bitField0_ &= ~0x00000004;
      roundCount = 0;
      return this;
    }

    /**
     * <code>optional uint32 round_count = 13;</code>
     * @return the roundCount
     */
    public int getRoundCount() {
      return roundCount;
    }

    /**
     * <code>optional uint32 round_count = 13;</code>
     * @param value the roundCount to set
     * @return this
     */
    public ChallengeInfo setRoundCount(final int value) {
      bitField0_ |= 0x00000004;
      roundCount = value;
      return this;
    }

    /**
     * <code>optional uint32 score = 14;</code>
     * @return whether the score field is set
     */
    public boolean hasScore() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 score = 14;</code>
     * @return this
     */
    public ChallengeInfo clearScore() {
      bitField0_ &= ~0x00000008;
      score = 0;
      return this;
    }

    /**
     * <code>optional uint32 score = 14;</code>
     * @return the score
     */
    public int getScore() {
      return score;
    }

    /**
     * <code>optional uint32 score = 14;</code>
     * @param value the score to set
     * @return this
     */
    public ChallengeInfo setScore(final int value) {
      bitField0_ |= 0x00000008;
      score = value;
      return this;
    }

    /**
     * <code>optional .ChallengeStatus status = 1;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .ChallengeStatus status = 1;</code>
     * @return this
     */
    public ChallengeInfo clearStatus() {
      bitField0_ &= ~0x00000010;
      status = 0;
      return this;
    }

    /**
     * <code>optional .ChallengeStatus status = 1;</code>
     * @return the status
     */
    public ChallengeStatusOuterClass.ChallengeStatus getStatus() {
      return ChallengeStatusOuterClass.ChallengeStatus.forNumber(status);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link ChallengeInfo#getStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getStatusValue() {
      return status;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ChallengeStatusOuterClass.ChallengeStatus}. Setting an invalid value
     * can cause {@link ChallengeInfo#getStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public ChallengeInfo setStatusValue(final int value) {
      bitField0_ |= 0x00000010;
      status = value;
      return this;
    }

    /**
     * <code>optional .ChallengeStatus status = 1;</code>
     * @param value the status to set
     * @return this
     */
    public ChallengeInfo setStatus(final ChallengeStatusOuterClass.ChallengeStatus value) {
      bitField0_ |= 0x00000010;
      status = value.getNumber();
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 11;</code>
     * @return whether the extraLineupType field is set
     */
    public boolean hasExtraLineupType() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 11;</code>
     * @return this
     */
    public ChallengeInfo clearExtraLineupType() {
      bitField0_ &= ~0x00000020;
      extraLineupType = 0;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 11;</code>
     * @return the extraLineupType
     */
    public ExtraLineupTypeOuterClass.ExtraLineupType getExtraLineupType() {
      return ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(extraLineupType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link ChallengeInfo#getExtraLineupType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getExtraLineupTypeValue() {
      return extraLineupType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ExtraLineupTypeOuterClass.ExtraLineupType}. Setting an invalid value
     * can cause {@link ChallengeInfo#getExtraLineupType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public ChallengeInfo setExtraLineupTypeValue(final int value) {
      bitField0_ |= 0x00000020;
      extraLineupType = value;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 11;</code>
     * @param value the extraLineupType to set
     * @return this
     */
    public ChallengeInfo setExtraLineupType(final ExtraLineupTypeOuterClass.ExtraLineupType value) {
      bitField0_ |= 0x00000020;
      extraLineupType = value.getNumber();
      return this;
    }

    /**
     * <code>optional .ChallengeStoryInfo ext_info = 7;</code>
     * @return whether the extInfo field is set
     */
    public boolean hasExtInfo() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional .ChallengeStoryInfo ext_info = 7;</code>
     * @return this
     */
    public ChallengeInfo clearExtInfo() {
      bitField0_ &= ~0x00000040;
      extInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeStoryInfo ext_info = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableExtInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeStoryInfoOuterClass.ChallengeStoryInfo getExtInfo() {
      return extInfo;
    }

    /**
     * <code>optional .ChallengeStoryInfo ext_info = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeStoryInfoOuterClass.ChallengeStoryInfo getMutableExtInfo() {
      bitField0_ |= 0x00000040;
      return extInfo;
    }

    /**
     * <code>optional .ChallengeStoryInfo ext_info = 7;</code>
     * @param value the extInfo to set
     * @return this
     */
    public ChallengeInfo setExtInfo(final ChallengeStoryInfoOuterClass.ChallengeStoryInfo value) {
      bitField0_ |= 0x00000040;
      extInfo.copyFrom(value);
      return this;
    }

    @Override
    public ChallengeInfo copyFrom(final ChallengeInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        challengeId = other.challengeId;
        scoreTwo = other.scoreTwo;
        roundCount = other.roundCount;
        score = other.score;
        status = other.status;
        extraLineupType = other.extraLineupType;
        extInfo.copyFrom(other.extInfo);
      }
      return this;
    }

    @Override
    public ChallengeInfo mergeFrom(final ChallengeInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasChallengeId()) {
        setChallengeId(other.challengeId);
      }
      if (other.hasScoreTwo()) {
        setScoreTwo(other.scoreTwo);
      }
      if (other.hasRoundCount()) {
        setRoundCount(other.roundCount);
      }
      if (other.hasScore()) {
        setScore(other.score);
      }
      if (other.hasStatus()) {
        setStatusValue(other.status);
      }
      if (other.hasExtraLineupType()) {
        setExtraLineupTypeValue(other.extraLineupType);
      }
      if (other.hasExtInfo()) {
        getMutableExtInfo().mergeFrom(other.extInfo);
      }
      return this;
    }

    @Override
    public ChallengeInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      challengeId = 0;
      scoreTwo = 0;
      roundCount = 0;
      score = 0;
      status = 0;
      extraLineupType = 0;
      extInfo.clear();
      return this;
    }

    @Override
    public ChallengeInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      extInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeInfo)) {
        return false;
      }
      ChallengeInfo other = (ChallengeInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasChallengeId() || challengeId == other.challengeId)
        && (!hasScoreTwo() || scoreTwo == other.scoreTwo)
        && (!hasRoundCount() || roundCount == other.roundCount)
        && (!hasScore() || score == other.score)
        && (!hasStatus() || status == other.status)
        && (!hasExtraLineupType() || extraLineupType == other.extraLineupType)
        && (!hasExtInfo() || extInfo.equals(other.extInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(scoreTwo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(roundCount);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(score);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 8);
        output.writeEnumNoTag(status);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 88);
        output.writeEnumNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(extInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(scoreTwo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(roundCount);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(score);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(status);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(extInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // scoreTwo
            scoreTwo = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // roundCount
            roundCount = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // score
            score = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // status
            final int value = input.readInt32();
            if (ChallengeStatusOuterClass.ChallengeStatus.forNumber(value) != null) {
              status = value;
              bitField0_ |= 0x00000010;
            }
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // extraLineupType
            final int value = input.readInt32();
            if (ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(value) != null) {
              extraLineupType = value;
              bitField0_ |= 0x00000020;
            }
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // extInfo
            input.readMessage(extInfo);
            bitField0_ |= 0x00000040;
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
        output.writeUInt32(FieldNames.challengeId, challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.scoreTwo, scoreTwo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.roundCount, roundCount);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.score, score);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeEnum(FieldNames.status, status, ChallengeStatusOuterClass.ChallengeStatus.converter());
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeEnum(FieldNames.extraLineupType, extraLineupType, ExtraLineupTypeOuterClass.ExtraLineupType.converter());
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeMessage(FieldNames.extInfo, extInfo);
      }
      output.endObject();
    }

    @Override
    public ChallengeInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -689112866:
          case 112359031: {
            if (input.isAtField(FieldNames.challengeId)) {
              if (!input.trySkipNullValue()) {
                challengeId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -485512614:
          case 2129303327: {
            if (input.isAtField(FieldNames.scoreTwo)) {
              if (!input.trySkipNullValue()) {
                scoreTwo = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -171935711:
          case -244677858: {
            if (input.isAtField(FieldNames.roundCount)) {
              if (!input.trySkipNullValue()) {
                roundCount = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109264530: {
            if (input.isAtField(FieldNames.score)) {
              if (!input.trySkipNullValue()) {
                score = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -892481550: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                final ChallengeStatusOuterClass.ChallengeStatus value = input.readEnum(ChallengeStatusOuterClass.ChallengeStatus.converter());
                if (value != null) {
                  status = value.getNumber();
                  bitField0_ |= 0x00000010;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -468135527:
          case -1144475077: {
            if (input.isAtField(FieldNames.extraLineupType)) {
              if (!input.trySkipNullValue()) {
                final ExtraLineupTypeOuterClass.ExtraLineupType value = input.readEnum(ExtraLineupTypeOuterClass.ExtraLineupType.converter());
                if (value != null) {
                  extraLineupType = value.getNumber();
                  bitField0_ |= 0x00000020;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1306498449:
          case -1826570228: {
            if (input.isAtField(FieldNames.extInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(extInfo);
                bitField0_ |= 0x00000040;
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
    public ChallengeInfo clone() {
      return new ChallengeInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeInfo(), data).checkInitialized();
    }

    public static ChallengeInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeInfo(), input).checkInitialized();
    }

    public static ChallengeInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeInfo messages
     */
    public static MessageFactory<ChallengeInfo> getFactory() {
      return ChallengeInfoFactory.INSTANCE;
    }

    private enum ChallengeInfoFactory implements MessageFactory<ChallengeInfo> {
      INSTANCE;

      @Override
      public ChallengeInfo create() {
        return ChallengeInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName challengeId = FieldName.forField("challengeId", "challenge_id");

      static final FieldName scoreTwo = FieldName.forField("scoreTwo", "score_two");

      static final FieldName roundCount = FieldName.forField("roundCount", "round_count");

      static final FieldName score = FieldName.forField("score");

      static final FieldName status = FieldName.forField("status");

      static final FieldName extraLineupType = FieldName.forField("extraLineupType", "extra_lineup_type");

      static final FieldName extInfo = FieldName.forField("extInfo", "ext_info");
    }
  }
}
