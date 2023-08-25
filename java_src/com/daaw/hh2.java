package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class hh2 {
    /* renamed from: a */
    public static double m20797a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    /* renamed from: b */
    public static double m20796b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d);
        return d / 65536.0d;
    }

    /* renamed from: c */
    public static int m20795c(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* renamed from: d */
    public static int m20794d(ByteBuffer byteBuffer) {
        return (m20795c(byteBuffer.get()) << 8) + m20795c(byteBuffer.get());
    }

    /* renamed from: e */
    public static long m20793e(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* renamed from: f */
    public static long m20792f(ByteBuffer byteBuffer) {
        long m20793e = m20793e(byteBuffer) << 32;
        if (m20793e >= 0) {
            return m20793e + m20793e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
