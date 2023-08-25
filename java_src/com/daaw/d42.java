package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d42 {
    public static List a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(c(b(((b & 255) << 8) | (b2 & 255))));
        arrayList.add(c(b(3840L)));
        return arrayList;
    }

    public static long b(long j) {
        return (j * 1000000000) / 48000;
    }

    public static byte[] c(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
