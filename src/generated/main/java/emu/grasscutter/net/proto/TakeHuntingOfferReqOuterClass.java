// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeHuntingOfferReq.proto

package emu.grasscutter.net.proto;

public final class TakeHuntingOfferReqOuterClass {
  private TakeHuntingOfferReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeHuntingOfferReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeHuntingOfferReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 city_id = 6;</code>
     * @return The cityId.
     */
    int getCityId();

    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     * @return Whether the huntingPair field is set.
     */
    boolean hasHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     * @return The huntingPair.
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4328
   * Obf: MMAJFKAOMBD
   * </pre>
   *
   * Protobuf type {@code TakeHuntingOfferReq}
   */
  public static final class TakeHuntingOfferReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeHuntingOfferReq)
      TakeHuntingOfferReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeHuntingOfferReq.newBuilder() to construct.
    private TakeHuntingOfferReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeHuntingOfferReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeHuntingOfferReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeHuntingOfferReq(
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
            case 34: {
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder subBuilder = null;
              if (huntingPair_ != null) {
                subBuilder = huntingPair_.toBuilder();
              }
              huntingPair_ = input.readMessage(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(huntingPair_);
                huntingPair_ = subBuilder.buildPartial();
              }

              break;
            }
            case 48: {

              cityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.internal_static_TakeHuntingOfferReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.internal_static_TakeHuntingOfferReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq.class, emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq.Builder.class);
    }

    public static final int CITY_ID_FIELD_NUMBER = 6;
    private int cityId_;
    /**
     * <code>uint32 city_id = 6;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
    }

    public static final int HUNTING_PAIR_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     * @return Whether the huntingPair field is set.
     */
    @java.lang.Override
    public boolean hasHuntingPair() {
      return huntingPair_ != null;
    }
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     * @return The huntingPair.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
      return huntingPair_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
    }
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
      return getHuntingPair();
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
      if (huntingPair_ != null) {
        output.writeMessage(4, getHuntingPair());
      }
      if (cityId_ != 0) {
        output.writeUInt32(6, cityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (huntingPair_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getHuntingPair());
      }
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, cityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq other = (emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq) obj;

      if (getCityId()
          != other.getCityId()) return false;
      if (hasHuntingPair() != other.hasHuntingPair()) return false;
      if (hasHuntingPair()) {
        if (!getHuntingPair()
            .equals(other.getHuntingPair())) return false;
      }
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
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      if (hasHuntingPair()) {
        hash = (37 * hash) + HUNTING_PAIR_FIELD_NUMBER;
        hash = (53 * hash) + getHuntingPair().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq prototype) {
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
     * CmdId: 4328
     * Obf: MMAJFKAOMBD
     * </pre>
     *
     * Protobuf type {@code TakeHuntingOfferReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeHuntingOfferReq)
        emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.internal_static_TakeHuntingOfferReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.internal_static_TakeHuntingOfferReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq.class, emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq.newBuilder()
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
        cityId_ = 0;

        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.internal_static_TakeHuntingOfferReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq build() {
        emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq buildPartial() {
        emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq result = new emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq(this);
        result.cityId_ = cityId_;
        if (huntingPairBuilder_ == null) {
          result.huntingPair_ = huntingPair_;
        } else {
          result.huntingPair_ = huntingPairBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq other) {
        if (other == emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq.getDefaultInstance()) return this;
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
        }
        if (other.hasHuntingPair()) {
          mergeHuntingPair(other.getHuntingPair());
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
        emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 6;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 6;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        
        cityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> huntingPairBuilder_;
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       * @return Whether the huntingPair field is set.
       */
      public boolean hasHuntingPair() {
        return huntingPairBuilder_ != null || huntingPair_ != null;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       * @return The huntingPair.
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
        if (huntingPairBuilder_ == null) {
          return huntingPair_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        } else {
          return huntingPairBuilder_.getMessage();
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public Builder setHuntingPair(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          huntingPair_ = value;
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public Builder setHuntingPair(
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder builderForValue) {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = builderForValue.build();
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public Builder mergeHuntingPair(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (huntingPair_ != null) {
            huntingPair_ =
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.newBuilder(huntingPair_).mergeFrom(value).buildPartial();
          } else {
            huntingPair_ = value;
          }
          onChanged();
        } else {
          huntingPairBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public Builder clearHuntingPair() {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
          onChanged();
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder getHuntingPairBuilder() {
        
        onChanged();
        return getHuntingPairFieldBuilder().getBuilder();
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
        if (huntingPairBuilder_ != null) {
          return huntingPairBuilder_.getMessageOrBuilder();
        } else {
          return huntingPair_ == null ?
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> 
          getHuntingPairFieldBuilder() {
        if (huntingPairBuilder_ == null) {
          huntingPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder>(
                  getHuntingPair(),
                  getParentForChildren(),
                  isClean());
          huntingPair_ = null;
        }
        return huntingPairBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TakeHuntingOfferReq)
    }

    // @@protoc_insertion_point(class_scope:TakeHuntingOfferReq)
    private static final emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq();
    }

    public static emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeHuntingOfferReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeHuntingOfferReq>() {
      @java.lang.Override
      public TakeHuntingOfferReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeHuntingOfferReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeHuntingOfferReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeHuntingOfferReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeHuntingOfferReqOuterClass.TakeHuntingOfferReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeHuntingOfferReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeHuntingOfferReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031TakeHuntingOfferReq.proto\032\021HuntingPair" +
      ".proto\"J\n\023TakeHuntingOfferReq\022\017\n\007city_id" +
      "\030\006 \001(\r\022\"\n\014hunting_pair\030\004 \001(\0132\014.HuntingPa" +
      "irB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor(),
        });
    internal_static_TakeHuntingOfferReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeHuntingOfferReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeHuntingOfferReq_descriptor,
        new java.lang.String[] { "CityId", "HuntingPair", });
    emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
