// automatically generated by the FlatBuffers compiler, do not modify

package pt.haslab.horus.events.flatbuffers.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class SocketAccept extends Table {
  public static SocketAccept getRootAsSocketAccept(ByteBuffer _bb) { return getRootAsSocketAccept(_bb, new SocketAccept()); }
  public static SocketAccept getRootAsSocketAccept(ByteBuffer _bb, SocketAccept obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public SocketAccept __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startSocketAccept(FlatBufferBuilder builder) { builder.startObject(0); }
  public static int endSocketAccept(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

