package com.daaw;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class gw7 {

    /* renamed from: a */
    public static final Unsafe f11785a;

    /* renamed from: b */
    public static final Class f11786b;

    /* renamed from: c */
    public static final boolean f11787c;

    /* renamed from: d */
    public static final fw7 f11788d;

    /* renamed from: e */
    public static final boolean f11789e;

    /* renamed from: f */
    public static final boolean f11790f;

    /* renamed from: g */
    public static final long f11791g;

    /* renamed from: h */
    public static final long f11792h;

    /* renamed from: i */
    public static final boolean f11793i;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    static {
        boolean z;
        fw7 fw7Var;
        boolean z2;
        Field m21181e;
        long j;
        fw7 fw7Var2;
        Unsafe m21169q = m21169q();
        f11785a = m21169q;
        f11786b = jq7.m18334a();
        Class<?> cls = Long.TYPE;
        boolean m21187G = m21187G(cls);
        f11787c = m21187G;
        boolean m21187G2 = m21187G(Integer.TYPE);
        fw7 fw7Var3 = null;
        if (m21169q != null) {
            if (m21187G) {
                fw7Var3 = new ew7(m21169q);
            } else if (m21187G2) {
                fw7Var3 = new dw7(m21169q);
            }
        }
        f11788d = fw7Var3;
        if (fw7Var3 != null) {
            try {
                Class<?> cls2 = fw7Var3.f10039a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m21168r(th);
            }
            if (m21181e() != null) {
                z = true;
                f11789e = z;
                fw7Var = f11788d;
                if (fw7Var != null) {
                    try {
                        Class<?> cls3 = fw7Var.f10039a.getClass();
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
                        m21168r(th2);
                    }
                    f11790f = z2;
                    f11791g = m21183c(byte[].class);
                    m21183c(boolean[].class);
                    m21182d(boolean[].class);
                    m21183c(int[].class);
                    m21182d(int[].class);
                    m21183c(long[].class);
                    m21182d(long[].class);
                    m21183c(float[].class);
                    m21182d(float[].class);
                    m21183c(double[].class);
                    m21182d(double[].class);
                    m21183c(Object[].class);
                    m21182d(Object[].class);
                    m21181e = m21181e();
                    j = -1;
                    if (m21181e != null && (fw7Var2 = f11788d) != null) {
                        j = fw7Var2.m22187n(m21181e);
                    }
                    f11792h = j;
                    f11793i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                f11790f = z2;
                f11791g = m21183c(byte[].class);
                m21183c(boolean[].class);
                m21182d(boolean[].class);
                m21183c(int[].class);
                m21182d(int[].class);
                m21183c(long[].class);
                m21182d(long[].class);
                m21183c(float[].class);
                m21182d(float[].class);
                m21183c(double[].class);
                m21182d(double[].class);
                m21183c(Object[].class);
                m21182d(Object[].class);
                m21181e = m21181e();
                j = -1;
                if (m21181e != null) {
                    j = fw7Var2.m22187n(m21181e);
                }
                f11792h = j;
                f11793i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        f11789e = z;
        fw7Var = f11788d;
        if (fw7Var != null) {
        }
        z2 = false;
        f11790f = z2;
        f11791g = m21183c(byte[].class);
        m21183c(boolean[].class);
        m21182d(boolean[].class);
        m21183c(int[].class);
        m21182d(int[].class);
        m21183c(long[].class);
        m21182d(long[].class);
        m21183c(float[].class);
        m21182d(float[].class);
        m21183c(double[].class);
        m21182d(double[].class);
        m21183c(Object[].class);
        m21182d(Object[].class);
        m21181e = m21181e();
        j = -1;
        if (m21181e != null) {
        }
        f11792h = j;
        f11793i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: A */
    public static void m21193A(Object obj, long j, float f) {
        f11788d.mo22193h(obj, j, f);
    }

    /* renamed from: B */
    public static void m21192B(Object obj, long j, int i) {
        f11788d.m22185p(obj, j, i);
    }

    /* renamed from: C */
    public static void m21191C(Object obj, long j, long j2) {
        f11788d.m22184q(obj, j, j2);
    }

    /* renamed from: D */
    public static void m21190D(Object obj, long j, Object obj2) {
        f11788d.m22183r(obj, j, obj2);
    }

    /* renamed from: E */
    public static /* bridge */ /* synthetic */ boolean m21189E(Object obj, long j) {
        return ((byte) ((f11788d.m22189l(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: F */
    public static /* bridge */ /* synthetic */ boolean m21188F(Object obj, long j) {
        return ((byte) ((f11788d.m22189l(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public static boolean m21187G(Class cls) {
        int i = jq7.f15342a;
        try {
            Class cls2 = f11786b;
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

    /* renamed from: H */
    public static boolean m21186H(Object obj, long j) {
        return f11788d.mo22192i(obj, j);
    }

    /* renamed from: a */
    public static boolean m21185a() {
        return f11790f;
    }

    /* renamed from: b */
    public static boolean m21184b() {
        return f11789e;
    }

    /* renamed from: c */
    public static int m21183c(Class cls) {
        if (f11790f) {
            return f11788d.m22191j(cls);
        }
        return -1;
    }

    /* renamed from: d */
    public static int m21182d(Class cls) {
        if (f11790f) {
            return f11788d.m22190k(cls);
        }
        return -1;
    }

    /* renamed from: e */
    public static Field m21181e() {
        int i = jq7.f15342a;
        Field m21180f = m21180f(Buffer.class, "effectiveDirectAddress");
        if (m21180f == null) {
            Field m21180f2 = m21180f(Buffer.class, "address");
            if (m21180f2 == null || m21180f2.getType() != Long.TYPE) {
                return null;
            }
            return m21180f2;
        }
        return m21180f;
    }

    /* renamed from: f */
    public static Field m21180f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static void m21179g(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        fw7 fw7Var = f11788d;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        fw7Var.m22185p(obj, j2, ((255 & b) << i) | (fw7Var.m22189l(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* renamed from: h */
    public static void m21178h(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        fw7 fw7Var = f11788d;
        int i = (((int) j) & 3) << 3;
        fw7Var.m22185p(obj, j2, ((255 & b) << i) | (fw7Var.m22189l(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* renamed from: i */
    public static byte m21177i(long j) {
        return f11788d.mo22200a(j);
    }

    /* renamed from: j */
    public static double m21176j(Object obj, long j) {
        return f11788d.mo22199b(obj, j);
    }

    /* renamed from: k */
    public static float m21175k(Object obj, long j) {
        return f11788d.mo22198c(obj, j);
    }

    /* renamed from: l */
    public static int m21174l(Object obj, long j) {
        return f11788d.m22189l(obj, j);
    }

    /* renamed from: m */
    public static long m21173m(ByteBuffer byteBuffer) {
        return f11788d.m22188m(byteBuffer, f11792h);
    }

    /* renamed from: n */
    public static long m21172n(Object obj, long j) {
        return f11788d.m22188m(obj, j);
    }

    /* renamed from: o */
    public static Object m21171o(Class cls) {
        try {
            return f11785a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: p */
    public static Object m21170p(Object obj, long j) {
        return f11788d.m22186o(obj, j);
    }

    /* renamed from: q */
    public static Unsafe m21169q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new cw7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m21168r(Throwable th) {
        Logger.getLogger(gw7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: w */
    public static void m21163w(long j, byte[] bArr, long j2, long j3) {
        f11788d.mo22197d(j, bArr, j2, j3);
    }

    /* renamed from: x */
    public static void m21162x(Object obj, long j, boolean z) {
        f11788d.mo22196e(obj, j, z);
    }

    /* renamed from: y */
    public static void m21161y(byte[] bArr, long j, byte b) {
        f11788d.mo22195f(bArr, f11791g + j, b);
    }

    /* renamed from: z */
    public static void m21160z(Object obj, long j, double d) {
        f11788d.mo22194g(obj, j, d);
    }
}
