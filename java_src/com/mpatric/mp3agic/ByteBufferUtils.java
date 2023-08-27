package com.mpatric.mp3agic;

import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public class ByteBufferUtils {
    public static String extractNullTerminatedString(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        String str = new String(bArr);
        String substring = str.substring(0, str.indexOf(0));
        byteBuffer.position(position + substring.length() + 1);
        return substring;
    }
}
