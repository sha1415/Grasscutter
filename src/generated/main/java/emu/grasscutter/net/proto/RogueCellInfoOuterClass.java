// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueCellInfo.proto

package emu.grasscutter.net.proto;

public final class RogueCellInfoOuterClass {
  private RogueCellInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueCellInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueCellInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 11;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>.RogueCellState state = 7;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.RogueCellState state = 7;</code>
     * @return The state.
     */
    emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState getState();

    /**
     * <code>uint32 cell_config_id = 8;</code>
     * @return The cellConfigId.
     */
    int getCellConfigId();

    /**
     * <code>uint32 cell_id = 3;</code>
     * @return The cellId.
     */
    int getCellId();

    /**
     * <code>uint32 cell_type = 15;</code>
     * @return The cellType.
     */
    int getCellType();
  }
  /**
   * <pre>
   * Obf: IAJBKKHPLDF
   * </pre>
   *
   * Protobuf type {@code RogueCellInfo}
   */
  public static final class RogueCellInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueCellInfo)
      RogueCellInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueCellInfo.newBuilder() to construct.
    private RogueCellInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueCellInfo() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueCellInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RogueCellInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              cellId_ = input.readUInt32();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
            case 64: {

              cellConfigId_ = input.readUInt32();
              break;
            }
            case 88: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 120: {

              cellType_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo.class, emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 11;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 11;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int STATE_FIELD_NUMBER = 7;
    private int state_;
    /**
     * <code>.RogueCellState state = 7;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.RogueCellState state = 7;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState result = emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState.valueOf(state_);
      return result == null ? emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState.UNRECOGNIZED : result;
    }

    public static final int CELL_CONFIG_ID_FIELD_NUMBER = 8;
    private int cellConfigId_;
    /**
     * <code>uint32 cell_config_id = 8;</code>
     * @return The cellConfigId.
     */
    @java.lang.Override
    public int getCellConfigId() {
      return cellConfigId_;
    }

    public static final int CELL_ID_FIELD_NUMBER = 3;
    private int cellId_;
    /**
     * <code>uint32 cell_id = 3;</code>
     * @return The cellId.
     */
    @java.lang.Override
    public int getCellId() {
      return cellId_;
    }

    public static final int CELL_TYPE_FIELD_NUMBER = 15;
    private int cellType_;
    /**
     * <code>uint32 cell_type = 15;</code>
     * @return The cellType.
     */
    @java.lang.Override
    public int getCellType() {
      return cellType_;
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
      if (cellId_ != 0) {
        output.writeUInt32(3, cellId_);
      }
      if (state_ != emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState.ROGUE_CELL_NONE.getNumber()) {
        output.writeEnum(7, state_);
      }
      if (cellConfigId_ != 0) {
        output.writeUInt32(8, cellConfigId_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(11, dungeonId_);
      }
      if (cellType_ != 0) {
        output.writeUInt32(15, cellType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, cellId_);
      }
      if (state_ != emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState.ROGUE_CELL_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, state_);
      }
      if (cellConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cellConfigId_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, dungeonId_);
      }
      if (cellType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, cellType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo other = (emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (state_ != other.state_) return false;
      if (getCellConfigId()
          != other.getCellConfigId()) return false;
      if (getCellId()
          != other.getCellId()) return false;
      if (getCellType()
          != other.getCellType()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + CELL_CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellConfigId();
      hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellId();
      hash = (37 * hash) + CELL_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCellType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo prototype) {
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
     * <pre>
     * Obf: IAJBKKHPLDF
     * </pre>
     *
     * Protobuf type {@code RogueCellInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueCellInfo)
        emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo.class, emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo.newBuilder()
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
        dungeonId_ = 0;

        state_ = 0;

        cellConfigId_ = 0;

        cellId_ = 0;

        cellType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo build() {
        emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo buildPartial() {
        emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo result = new emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo(this);
        result.dungeonId_ = dungeonId_;
        result.state_ = state_;
        result.cellConfigId_ = cellConfigId_;
        result.cellId_ = cellId_;
        result.cellType_ = cellType_;
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
        if (other instanceof emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo) {
          return mergeFrom((emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo other) {
        if (other == emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getCellConfigId() != 0) {
          setCellConfigId(other.getCellConfigId());
        }
        if (other.getCellId() != 0) {
          setCellId(other.getCellId());
        }
        if (other.getCellType() != 0) {
          setCellType(other.getCellType());
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
        emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 11;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 11;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.RogueCellState state = 7;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.RogueCellState state = 7;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RogueCellState state = 7;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState result = emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState.valueOf(state_);
        return result == null ? emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState.UNRECOGNIZED : result;
      }
      /**
       * <code>.RogueCellState state = 7;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.proto.RogueCellStateOuterClass.RogueCellState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RogueCellState state = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private int cellConfigId_ ;
      /**
       * <code>uint32 cell_config_id = 8;</code>
       * @return The cellConfigId.
       */
      @java.lang.Override
      public int getCellConfigId() {
        return cellConfigId_;
      }
      /**
       * <code>uint32 cell_config_id = 8;</code>
       * @param value The cellConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setCellConfigId(int value) {
        
        cellConfigId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_config_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellConfigId() {
        
        cellConfigId_ = 0;
        onChanged();
        return this;
      }

      private int cellId_ ;
      /**
       * <code>uint32 cell_id = 3;</code>
       * @return The cellId.
       */
      @java.lang.Override
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>uint32 cell_id = 3;</code>
       * @param value The cellId to set.
       * @return This builder for chaining.
       */
      public Builder setCellId(int value) {
        
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellId() {
        
        cellId_ = 0;
        onChanged();
        return this;
      }

      private int cellType_ ;
      /**
       * <code>uint32 cell_type = 15;</code>
       * @return The cellType.
       */
      @java.lang.Override
      public int getCellType() {
        return cellType_;
      }
      /**
       * <code>uint32 cell_type = 15;</code>
       * @param value The cellType to set.
       * @return This builder for chaining.
       */
      public Builder setCellType(int value) {
        
        cellType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_type = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellType() {
        
        cellType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RogueCellInfo)
    }

    // @@protoc_insertion_point(class_scope:RogueCellInfo)
    private static final emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo();
    }

    public static emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueCellInfo>
        PARSER = new com.google.protobuf.AbstractParser<RogueCellInfo>() {
      @java.lang.Override
      public RogueCellInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RogueCellInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RogueCellInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueCellInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RogueCellInfoOuterClass.RogueCellInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueCellInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueCellInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023RogueCellInfo.proto\032\024RogueCellState.pr" +
      "oto\"\177\n\rRogueCellInfo\022\022\n\ndungeon_id\030\013 \001(\r" +
      "\022\036\n\005state\030\007 \001(\0162\017.RogueCellState\022\026\n\016cell" +
      "_config_id\030\010 \001(\r\022\017\n\007cell_id\030\003 \001(\r\022\021\n\tcel" +
      "l_type\030\017 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RogueCellStateOuterClass.getDescriptor(),
        });
    internal_static_RogueCellInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueCellInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueCellInfo_descriptor,
        new java.lang.String[] { "DungeonId", "State", "CellConfigId", "CellId", "CellType", });
    emu.grasscutter.net.proto.RogueCellStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
