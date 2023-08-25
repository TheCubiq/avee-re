package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d42 {
    /* renamed from: a */
    public static List m24647a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m24645c(m24646b(((b & 255) << 8) | (b2 & 255))));
        arrayList.add(m24645c(m24646b(3840L)));
        return arrayList;
    }

    /* renamed from: b */
    public static long m24646b(long j) {
        return (j * 1000000000) / 48000;
    }

    /* renamed from: c */
    public static byte[] m24645c(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
