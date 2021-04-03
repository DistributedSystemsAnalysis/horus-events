// automatically generated by the FlatBuffers compiler, do not modify

package pt.haslab.horus.events.flatbuffers.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FalconEvent extends Table {
  public static FalconEvent getRootAsFalconEvent(ByteBuffer _bb) { return getRootAsFalconEvent(_bb, new FalconEvent()); }
  public static FalconEvent getRootAsFalconEvent(ByteBuffer _bb, FalconEvent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public FalconEvent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String id() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer idAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer idInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public long userTime() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long kernelTime() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public int type() { int o = __offset(10); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public long pid() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long tid() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public String comm() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer commAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer commInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }
  public String host() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer hostAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer hostInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }
  public byte eventType() { int o = __offset(20); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table event(Table obj) { int o = __offset(22); return o != 0 ? __union(obj, o) : null; }
  public String extraData() { int o = __offset(24); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer extraDataAsByteBuffer() { return __vector_as_bytebuffer(24, 1); }
  public ByteBuffer extraDataInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 24, 1); }

  public static int createFalconEvent(FlatBufferBuilder builder,
      int idOffset,
      long user_time,
      long kernel_time,
      int type,
      long pid,
      long tid,
      int commOffset,
      int hostOffset,
      byte event_type,
      int eventOffset,
      int extra_dataOffset) {
    builder.startObject(11);
    FalconEvent.addKernelTime(builder, kernel_time);
    FalconEvent.addUserTime(builder, user_time);
    FalconEvent.addExtraData(builder, extra_dataOffset);
    FalconEvent.addEvent(builder, eventOffset);
    FalconEvent.addHost(builder, hostOffset);
    FalconEvent.addComm(builder, commOffset);
    FalconEvent.addTid(builder, tid);
    FalconEvent.addPid(builder, pid);
    FalconEvent.addId(builder, idOffset);
    FalconEvent.addEventType(builder, event_type);
    FalconEvent.addType(builder, type);
    return FalconEvent.endFalconEvent(builder);
  }

  public static void startFalconEvent(FlatBufferBuilder builder) { builder.startObject(11); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static void addUserTime(FlatBufferBuilder builder, long userTime) { builder.addLong(1, userTime, 0L); }
  public static void addKernelTime(FlatBufferBuilder builder, long kernelTime) { builder.addLong(2, kernelTime, 0L); }
  public static void addType(FlatBufferBuilder builder, int type) { builder.addByte(3, (byte)type, (byte)0); }
  public static void addPid(FlatBufferBuilder builder, long pid) { builder.addInt(4, (int)pid, (int)0L); }
  public static void addTid(FlatBufferBuilder builder, long tid) { builder.addInt(5, (int)tid, (int)0L); }
  public static void addComm(FlatBufferBuilder builder, int commOffset) { builder.addOffset(6, commOffset, 0); }
  public static void addHost(FlatBufferBuilder builder, int hostOffset) { builder.addOffset(7, hostOffset, 0); }
  public static void addEventType(FlatBufferBuilder builder, byte eventType) { builder.addByte(8, eventType, 0); }
  public static void addEvent(FlatBufferBuilder builder, int eventOffset) { builder.addOffset(9, eventOffset, 0); }
  public static void addExtraData(FlatBufferBuilder builder, int extraDataOffset) { builder.addOffset(10, extraDataOffset, 0); }
  public static int endFalconEvent(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishFalconEventBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFalconEventBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

