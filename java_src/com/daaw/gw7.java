package com.daaw;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class gw7 {
    public static final Unsafe a;
    public static final Class b;
    public static final boolean c;
    public static final fw7 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final long h;
    public static final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    static {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gw7.<clinit>():void");
    }

    public static void A(Object obj, long j, float f2) {
        d.h(obj, j, f2);
    }

    public static void B(Object obj, long j, int i2) {
        d.p(obj, j, i2);
    }

    public static void C(Object obj, long j, long j2) {
        d.q(obj, j, j2);
    }

    public static void D(Object obj, long j, Object obj2) {
        d.r(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean E(Object obj, long j) {
        return ((byte) ((d.l(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean F(Object obj, long j) {
        return ((byte) ((d.l(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean G(Class cls) {
        int i2 = jq7.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean H(Object obj, long j) {
        return d.i(obj, j);
    }

    public static boolean a() {
        return f;
    }

    public static boolean b() {
        return e;
    }

    public static int c(Class cls) {
        if (f) {
            return d.j(cls);
        }
        return -1;
    }

    public static int d(Class cls) {
        if (f) {
            return d.k(cls);
        }
        return -1;
    }

    public static Field e() {
        int i2 = jq7.a;
        Field f2 = f(Buffer.class, "effectiveDirectAddress");
        if (f2 == null) {
            Field f3 = f(Buffer.class, "address");
            if (f3 == null || f3.getType() != Long.TYPE) {
                return null;
            }
            return f3;
        }
        return f2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void g(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        fw7 fw7Var = d;
        int i2 = ((((int) j) ^ (-1)) & 3) << 3;
        fw7Var.p(obj, j2, ((255 & b2) << i2) | (fw7Var.l(obj, j2) & ((255 << i2) ^ (-1))));
    }

    public static void h(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        fw7 fw7Var = d;
        int i2 = (((int) j) & 3) << 3;
        fw7Var.p(obj, j2, ((255 & b2) << i2) | (fw7Var.l(obj, j2) & ((255 << i2) ^ (-1))));
    }

    public static byte i(long j) {
        return d.a(j);
    }

    public static double j(Object obj, long j) {
        return d.b(obj, j);
    }

    public static float k(Object obj, long j) {
        return d.c(obj, j);
    }

    public static int l(Object obj, long j) {
        return d.l(obj, j);
    }

    public static long m(ByteBuffer byteBuffer) {
        return d.m(byteBuffer, h);
    }

    public static long n(Object obj, long j) {
        return d.m(obj, j);
    }

    public static Object o(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object p(Object obj, long j) {
        return d.o(obj, j);
    }

    public static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new cw7());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void r(Throwable th) {
        Logger.getLogger(gw7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void w(long j, byte[] bArr, long j2, long j3) {
        d.d(j, bArr, j2, j3);
    }

    public static void x(Object obj, long j, boolean z) {
        d.e(obj, j, z);
    }

    public static void y(byte[] bArr, long j, byte b2) {
        d.f(bArr, g + j, b2);
    }

    public static void z(Object obj, long j, double d2) {
        d.g(obj, j, d2);
    }
}
