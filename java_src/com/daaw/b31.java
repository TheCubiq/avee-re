package com.daaw;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
/* loaded from: classes2.dex */
public class b31 {

    /* renamed from: a */
    public static final byte f4244a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f4245b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    public static String m26500b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m26499c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m26501a() {
        byte[] m26499c = m26499c(UUID.randomUUID(), new byte[17]);
        m26499c[16] = m26499c[0];
        m26499c[0] = (byte) ((f4245b & m26499c[0]) | f4244a);
        return m26500b(m26499c);
    }
}
