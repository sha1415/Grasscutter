// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EOIJDJGCEBA.proto

package emu.grasscutter.net.proto;

public final class EOIJDJGCEBAOuterClass {
  private EOIJDJGCEBAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EOIJDJGCEBAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EOIJDJGCEBA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 score_list = 12;</code>
     * @return A list containing the scoreList.
     */
    java.util.List<java.lang.Integer> getScoreListList();
    /**
     * <code>repeated uint32 score_list = 12;</code>
     * @return The count of scoreList.
     */
    int getScoreListCount();
    /**
     * <code>repeated uint32 score_list = 12;</code>
     * @param index The index of the element to return.
     * @return The scoreList at the given index.
     */
    int getScoreList(int index);

    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_new_record = 5;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * Protobuf type {@code EOIJDJGCEBA}
   */
  public static final class EOIJDJGCEBA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EOIJDJGCEBA)
      EOIJDJGCEBAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EOIJDJGCEBA.newBuilder() to construct.
    private EOIJDJGCEBA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EOIJDJGCEBA() {
      scoreList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EOIJDJGCEBA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EOIJDJGCEBA(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 56: {

              levelId_ = input.readUInt32();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                scoreList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              scoreList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                scoreList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                scoreList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          scoreList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.internal_static_EOIJDJGCEBA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.internal_static_EOIJDJGCEBA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA.class, emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA.Builder.class);
    }

    public static final int SCORE_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList scoreList_;
    /**
     * <code>repeated uint32 score_list = 12;</code>
     * @return A list containing the scoreList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getScoreListList() {
      return scoreList_;
    }
    /**
     * <code>repeated uint32 score_list = 12;</code>
     * @return The count of scoreList.
     */
    public int getScoreListCount() {
      return scoreList_.size();
    }
    /**
     * <code>repeated uint32 score_list = 12;</code>
     * @param index The index of the element to return.
     * @return The scoreList at the given index.
     */
    public int getScoreList(int index) {
      return scoreList_.getInt(index);
    }
    private int scoreListMemoizedSerializedSize = -1;

    public static final int LEVEL_ID_FIELD_NUMBER = 7;
    private int levelId_;
    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 5;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 5;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (isNewRecord_ != false) {
        output.writeBool(5, isNewRecord_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(7, levelId_);
      }
      if (getScoreListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(scoreListMemoizedSerializedSize);
      }
      for (int i = 0; i < scoreList_.size(); i++) {
        output.writeUInt32NoTag(scoreList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isNewRecord_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, levelId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < scoreList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(scoreList_.getInt(i));
        }
        size += dataSize;
        if (!getScoreListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        scoreListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA other = (emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA) obj;

      if (!getScoreListList()
          .equals(other.getScoreListList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getScoreListCount() > 0) {
        hash = (37 * hash) + SCORE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getScoreListList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code EOIJDJGCEBA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EOIJDJGCEBA)
        emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.internal_static_EOIJDJGCEBA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.internal_static_EOIJDJGCEBA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA.class, emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        scoreList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.internal_static_EOIJDJGCEBA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA build() {
        emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA buildPartial() {
        emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA result = new emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          scoreList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.scoreList_ = scoreList_;
        result.levelId_ = levelId_;
        result.isNewRecord_ = isNewRecord_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA) {
          return mergeFrom((emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA other) {
        if (other == emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA.getDefaultInstance()) return this;
        if (!other.scoreList_.isEmpty()) {
          if (scoreList_.isEmpty()) {
            scoreList_ = other.scoreList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureScoreListIsMutable();
            scoreList_.addAll(other.scoreList_);
          }
          onChanged();
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList scoreList_ = emptyIntList();
      private void ensureScoreListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          scoreList_ = mutableCopy(scoreList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 score_list = 12;</code>
       * @return A list containing the scoreList.
       */
      public java.util.List<java.lang.Integer>
          getScoreListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(scoreList_) : scoreList_;
      }
      /**
       * <code>repeated uint32 score_list = 12;</code>
       * @return The count of scoreList.
       */
      public int getScoreListCount() {
        return scoreList_.size();
      }
      /**
       * <code>repeated uint32 score_list = 12;</code>
       * @param index The index of the element to return.
       * @return The scoreList at the given index.
       */
      public int getScoreList(int index) {
        return scoreList_.getInt(index);
      }
      /**
       * <code>repeated uint32 score_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The scoreList to set.
       * @return This builder for chaining.
       */
      public Builder setScoreList(
          int index, int value) {
        ensureScoreListIsMutable();
        scoreList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 12;</code>
       * @param value The scoreList to add.
       * @return This builder for chaining.
       */
      public Builder addScoreList(int value) {
        ensureScoreListIsMutable();
        scoreList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 12;</code>
       * @param values The scoreList to add.
       * @return This builder for chaining.
       */
      public Builder addAllScoreList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureScoreListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, scoreList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScoreList() {
        scoreList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 7;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 5;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 5;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EOIJDJGCEBA)
    }

    // @@protoc_insertion_point(class_scope:EOIJDJGCEBA)
    private static final emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA();
    }

    public static emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EOIJDJGCEBA>
        PARSER = new com.google.protobuf.AbstractParser<EOIJDJGCEBA>() {
      @java.lang.Override
      public EOIJDJGCEBA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EOIJDJGCEBA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EOIJDJGCEBA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EOIJDJGCEBA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EOIJDJGCEBAOuterClass.EOIJDJGCEBA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EOIJDJGCEBA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EOIJDJGCEBA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EOIJDJGCEBA.proto\"J\n\013EOIJDJGCEBA\022\022\n\nsc" +
      "ore_list\030\014 \003(\r\022\020\n\010level_id\030\007 \001(\r\022\025\n\ris_n" +
      "ew_record\030\005 \001(\010B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EOIJDJGCEBA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EOIJDJGCEBA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EOIJDJGCEBA_descriptor,
        new java.lang.String[] { "ScoreList", "LevelId", "IsNewRecord", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
