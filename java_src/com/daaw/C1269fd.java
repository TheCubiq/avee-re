package com.daaw;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: com.daaw.fd */
/* loaded from: classes2.dex */
public class C1269fd {

    /* renamed from: a */
    public static final AtomicLong f9443a = new AtomicLong(0);

    /* renamed from: b */
    public static String f9444b;

    public C1269fd(ue0 ue0Var) {
        byte[] bArr = new byte[10];
        m22797e(bArr);
        m22798d(bArr);
        m22799c(bArr);
        String m22641z = C1279fh.m22641z(ue0Var.mo8304a());
        String m22645v = C1279fh.m22645v(bArr);
        Locale locale = Locale.US;
        f9444b = String.format(locale, "%s%s%s%s", m22645v.substring(0, 12), m22645v.substring(12, 16), m22645v.subSequence(16, 20), m22641z.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m22801a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    public static byte[] m22800b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    public final void m22799c(byte[] bArr) {
        byte[] m22800b = m22800b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m22800b[0];
        bArr[9] = m22800b[1];
    }

    /* renamed from: d */
    public final void m22798d(byte[] bArr) {
        byte[] m22800b = m22800b(f9443a.incrementAndGet());
        bArr[6] = m22800b[0];
        bArr[7] = m22800b[1];
    }

    /* renamed from: e */
    public final void m22797e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m22801a = m22801a(time / 1000);
        bArr[0] = m22801a[0];
        bArr[1] = m22801a[1];
        bArr[2] = m22801a[2];
        bArr[3] = m22801a[3];
        byte[] m22800b = m22800b(time % 1000);
        bArr[4] = m22800b[0];
        bArr[5] = m22800b[1];
    }

    public String toString() {
        return f9444b;
    }
}
