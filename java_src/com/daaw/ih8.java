package com.daaw;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class ih8 {

    /* renamed from: a */
    public static final Unsafe f13645a;

    /* renamed from: b */
    public static final Class f13646b;

    /* renamed from: c */
    public static final boolean f13647c;

    /* renamed from: d */
    public static final gh8 f13648d;

    /* renamed from: e */
    public static final boolean f13649e;

    /* renamed from: f */
    public static final boolean f13650f;

    /* renamed from: g */
    public static final long f13651g;

    /* renamed from: h */
    public static final boolean f13652h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
    static {
        boolean z;
        gh8 gh8Var;
        boolean z2;
        Field m19811b;
        gh8 gh8Var2;
        Unsafe m19801l = m19801l();
        f13645a = m19801l;
        f13646b = b58.m26485a();
        Class<?> cls = Long.TYPE;
        boolean m19817A = m19817A(cls);
        f13647c = m19817A;
        boolean m19817A2 = m19817A(Integer.TYPE);
        gh8 gh8Var3 = null;
        if (m19801l != null) {
            if (m19817A) {
                gh8Var3 = new eh8(m19801l);
            } else if (m19817A2) {
                gh8Var3 = new ch8(m19801l);
            }
        }
        f13648d = gh8Var3;
        if (gh8Var3 != null) {
            try {
                Class<?> cls2 = gh8Var3.f11285a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m19800m(th);
            }
            if (m19811b() != null) {
                z = true;
                f13649e = z;
                gh8Var = f13648d;
                if (gh8Var != null) {
                    try {
                        Class<?> cls3 = gh8Var.f11285a.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        Class<?> cls4 = Long.TYPE;
                        cls3.getMethod("getInt", Object.class, cls4);
                        cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                        cls3.getMethod("getLong", Object.class, cls4);
                        cls3.getMethod("putLong", Object.class, cls4, cls4);
                        cls3.getMethod("getObject", Object.class, cls4);
                        cls3.getMethod("putObject", Object.class, cls4, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        m19800m(th2);
                    }
                    f13650f = z2;
                    f13651g = m19813E(byte[].class);
                    m19813E(boolean[].class);
                    m19812a(boolean[].class);
                    m19813E(int[].class);
                    m19812a(int[].class);
                    m19813E(long[].class);
                    m19812a(long[].class);
                    m19813E(float[].class);
                    m19812a(float[].class);
                    m19813E(double[].class);
                    m19812a(double[].class);
                    m19813E(Object[].class);
                    m19812a(Object[].class);
                    m19811b = m19811b();
                    if (m19811b != null && (gh8Var2 = f13648d) != null) {
                        gh8Var2.m21594l(m19811b);
                    }
                    f13652h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                f13650f = z2;
                f13651g = m19813E(byte[].class);
                m19813E(boolean[].class);
                m19812a(boolean[].class);
                m19813E(int[].class);
                m19812a(int[].class);
                m19813E(long[].class);
                m19812a(long[].class);
                m19813E(float[].class);
                m19812a(float[].class);
                m19813E(double[].class);
                m19812a(double[].class);
                m19813E(Object[].class);
                m19812a(Object[].class);
                m19811b = m19811b();
                if (m19811b != null) {
                    gh8Var2.m21594l(m19811b);
                }
                f13652h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        f13649e = z;
        gh8Var = f13648d;
        if (gh8Var != null) {
        }
        z2 = false;
        f13650f = z2;
        f13651g = m19813E(byte[].class);
        m19813E(boolean[].class);
        m19812a(boolean[].class);
        m19813E(int[].class);
        m19812a(int[].class);
        m19813E(long[].class);
        m19812a(long[].class);
        m19813E(float[].class);
        m19812a(float[].class);
        m19813E(double[].class);
        m19812a(double[].class);
        m19813E(Object[].class);
        m19812a(Object[].class);
        m19811b = m19811b();
        if (m19811b != null) {
        }
        f13652h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m19817A(Class cls) {
        int i = b58.f4320a;
        try {
            Class cls2 = f13646b;
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

    /* renamed from: B */
    public static boolean m19816B(Object obj, long j) {
        return f13648d.mo21599g(obj, j);
    }

    /* renamed from: C */
    public static boolean m19815C() {
        return f13650f;
    }

    /* renamed from: D */
    public static boolean m19814D() {
        return f13649e;
    }

    /* renamed from: E */
    public static int m19813E(Class cls) {
        if (f13650f) {
            return f13648d.m21598h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m19812a(Class cls) {
        if (f13650f) {
            return f13648d.m21597i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m19811b() {
        int i = b58.f4320a;
        Field m19810c = m19810c(Buffer.class, "effectiveDirectAddress");
        if (m19810c == null) {
            Field m19810c2 = m19810c(Buffer.class, "address");
            if (m19810c2 == null || m19810c2.getType() != Long.TYPE) {
                return null;
            }
            return m19810c2;
        }
        return m19810c;
    }

    /* renamed from: c */
    public static Field m19810c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m19809d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        gh8 gh8Var = f13648d;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        gh8Var.m21592n(obj, j2, ((255 & b) << i) | (gh8Var.m21596j(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* renamed from: e */
    public static void m19808e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        gh8 gh8Var = f13648d;
        int i = (((int) j) & 3) << 3;
        gh8Var.m21592n(obj, j2, ((255 & b) << i) | (gh8Var.m21596j(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* renamed from: f */
    public static double m19807f(Object obj, long j) {
        return f13648d.mo21605a(obj, j);
    }

    /* renamed from: g */
    public static float m19806g(Object obj, long j) {
        return f13648d.mo21604b(obj, j);
    }

    /* renamed from: h */
    public static int m19805h(Object obj, long j) {
        return f13648d.m21596j(obj, j);
    }

    /* renamed from: i */
    public static long m19804i(Object obj, long j) {
        return f13648d.m21595k(obj, j);
    }

    /* renamed from: j */
    public static Object m19803j(Class cls) {
        try {
            return f13645a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m19802k(Object obj, long j) {
        return f13648d.m21593m(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m19801l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ah8());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m19800m(Throwable th) {
        Logger.getLogger(ih8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: r */
    public static void m19795r(Object obj, long j, boolean z) {
        f13648d.mo21603c(obj, j, z);
    }

    /* renamed from: s */
    public static void m19794s(byte[] bArr, long j, byte b) {
        f13648d.mo21602d(bArr, f13651g + j, b);
    }

    /* renamed from: t */
    public static void m19793t(Object obj, long j, double d) {
        f13648d.mo21601e(obj, j, d);
    }

    /* renamed from: u */
    public static void m19792u(Object obj, long j, float f) {
        f13648d.mo21600f(obj, j, f);
    }

    /* renamed from: v */
    public static void m19791v(Object obj, long j, int i) {
        f13648d.m21592n(obj, j, i);
    }

    /* renamed from: w */
    public static void m19790w(Object obj, long j, long j2) {
        f13648d.m21591o(obj, j, j2);
    }

    /* renamed from: x */
    public static void m19789x(Object obj, long j, Object obj2) {
        f13648d.m21590p(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m19788y(Object obj, long j) {
        return ((byte) ((f13648d.m21596j(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m19787z(Object obj, long j) {
        return ((byte) ((f13648d.m21596j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
