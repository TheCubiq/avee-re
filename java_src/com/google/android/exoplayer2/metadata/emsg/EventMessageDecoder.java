package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class EventMessageDecoder implements MetadataDecoder {
    @Override // com.google.android.exoplayer2.metadata.MetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = new ParsableByteArray(array, limit);
        String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
        String readNullTerminatedString2 = parsableByteArray.readNullTerminatedString();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        return new Metadata(new EventMessage(readNullTerminatedString, readNullTerminatedString2, Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt), parsableByteArray.readUnsignedInt(), Arrays.copyOfRange(array, parsableByteArray.getPosition(), limit), Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, readUnsignedInt)));
    }
}
