package com.daaw;

import com.daaw.uz0;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes2.dex */
public final class wz0 implements mt0 {

    /* renamed from: f */
    public static final Charset f31674f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final q00 f31675g = q00.m12816a("key").m12811b(C3400w6.m6517b().m6516c(1).m6518a()).m12812a();

    /* renamed from: h */
    public static final q00 f31676h = q00.m12816a("value").m12811b(C3400w6.m6517b().m6516c(2).m6518a()).m12812a();

    /* renamed from: i */
    public static final lt0<Map.Entry<Object, Object>> f31677i = new lt0() { // from class: com.daaw.vz0
        @Override // com.daaw.InterfaceC3756yw
        /* renamed from: a */
        public final void mo2307a(Object obj, mt0 mt0Var) {
            wz0.m5682v((Map.Entry) obj, mt0Var);
        }
    };

    /* renamed from: a */
    public OutputStream f31678a;

    /* renamed from: b */
    public final Map<Class<?>, lt0<?>> f31679b;

    /* renamed from: c */
    public final Map<Class<?>, xr1<?>> f31680c;

    /* renamed from: d */
    public final lt0<Object> f31681d;

    /* renamed from: e */
    public final zz0 f31682e = new zz0(this);

    /* renamed from: com.daaw.wz0$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3486a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31683a;

        static {
            int[] iArr = new int[uz0.EnumC3272a.values().length];
            f31683a = iArr;
            try {
                iArr[uz0.EnumC3272a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31683a[uz0.EnumC3272a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31683a[uz0.EnumC3272a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public wz0(OutputStream outputStream, Map<Class<?>, lt0<?>> map, Map<Class<?>, xr1<?>> map2, lt0<Object> lt0Var) {
        this.f31678a = outputStream;
        this.f31679b = map;
        this.f31680c = map2;
        this.f31681d = lt0Var;
    }

    /* renamed from: o */
    public static ByteBuffer m5689o(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: t */
    public static uz0 m5684t(q00 q00Var) {
        uz0 uz0Var = (uz0) q00Var.m12814c(uz0.class);
        if (uz0Var != null) {
            return uz0Var;
        }
        throw new C1012cx("Field has no @Protobuf config");
    }

    /* renamed from: u */
    public static int m5683u(q00 q00Var) {
        uz0 uz0Var = (uz0) q00Var.m12814c(uz0.class);
        if (uz0Var != null) {
            return uz0Var.tag();
        }
        throw new C1012cx("Field has no @Protobuf config");
    }

    /* renamed from: v */
    public static /* synthetic */ void m5682v(Map.Entry entry, mt0 mt0Var) {
        mt0Var.mo5699e(f31675g, entry.getKey());
        mt0Var.mo5699e(f31676h, entry.getValue());
    }

    /* renamed from: d */
    public mt0 m5700d(q00 q00Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m5681w((m5683u(q00Var) << 3) | 1);
        this.f31678a.write(m5689o(8).putDouble(d).array());
        return this;
    }

    @Override // com.daaw.mt0
    /* renamed from: e */
    public mt0 mo5699e(q00 q00Var, Object obj) {
        return m5696h(q00Var, obj, true);
    }

    /* renamed from: g */
    public mt0 m5697g(q00 q00Var, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m5681w((m5683u(q00Var) << 3) | 5);
        this.f31678a.write(m5689o(4).putFloat(f).array());
        return this;
    }

    /* renamed from: h */
    public mt0 m5696h(q00 q00Var, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m5681w((m5683u(q00Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f31674f);
            m5681w(bytes.length);
            this.f31678a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m5696h(q00Var, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m5687q(f31677i, q00Var, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return m5700d(q00Var, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return m5697g(q00Var, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return m5692l(q00Var, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return m5690n(q00Var, ((Boolean) obj).booleanValue(), z);
            }
            if (!(obj instanceof byte[])) {
                lt0<?> lt0Var = this.f31679b.get(obj.getClass());
                if (lt0Var != null) {
                    return m5687q(lt0Var, q00Var, obj, z);
                }
                xr1<?> xr1Var = this.f31680c.get(obj.getClass());
                return xr1Var != null ? m5686r(xr1Var, q00Var, obj, z) : obj instanceof tz0 ? mo5703a(q00Var, ((tz0) obj).mo8669a()) : obj instanceof Enum ? mo5703a(q00Var, ((Enum) obj).ordinal()) : m5687q(this.f31681d, q00Var, obj, z);
            }
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m5681w((m5683u(q00Var) << 3) | 2);
            m5681w(bArr.length);
            this.f31678a.write(bArr);
            return this;
        }
    }

    @Override // com.daaw.mt0
    /* renamed from: i */
    public wz0 mo5703a(q00 q00Var, int i) {
        return m5694j(q00Var, i, true);
    }

    /* renamed from: j */
    public wz0 m5694j(q00 q00Var, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        uz0 m5684t = m5684t(q00Var);
        int i2 = C3486a.f31683a[m5684t.intEncoding().ordinal()];
        if (i2 == 1) {
            m5681w(m5684t.tag() << 3);
            m5681w(i);
        } else if (i2 == 2) {
            m5681w(m5684t.tag() << 3);
            m5681w((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m5681w((m5684t.tag() << 3) | 5);
            this.f31678a.write(m5689o(4).putInt(i).array());
        }
        return this;
    }

    @Override // com.daaw.mt0
    /* renamed from: k */
    public wz0 mo5702b(q00 q00Var, long j) {
        return m5692l(q00Var, j, true);
    }

    /* renamed from: l */
    public wz0 m5692l(q00 q00Var, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        uz0 m5684t = m5684t(q00Var);
        int i = C3486a.f31683a[m5684t.intEncoding().ordinal()];
        if (i == 1) {
            m5681w(m5684t.tag() << 3);
            m5680x(j);
        } else if (i == 2) {
            m5681w(m5684t.tag() << 3);
            m5680x((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m5681w((m5684t.tag() << 3) | 1);
            this.f31678a.write(m5689o(8).putLong(j).array());
        }
        return this;
    }

    @Override // com.daaw.mt0
    /* renamed from: m */
    public wz0 mo5698f(q00 q00Var, boolean z) {
        return m5690n(q00Var, z, true);
    }

    /* renamed from: n */
    public wz0 m5690n(q00 q00Var, boolean z, boolean z2) {
        return m5694j(q00Var, z ? 1 : 0, z2);
    }

    /* renamed from: p */
    public final <T> long m5688p(lt0<T> lt0Var, T t) {
        cj0 cj0Var = new cj0();
        try {
            OutputStream outputStream = this.f31678a;
            this.f31678a = cj0Var;
            lt0Var.mo2307a(t, this);
            this.f31678a = outputStream;
            long m25363d = cj0Var.m25363d();
            cj0Var.close();
            return m25363d;
        } catch (Throwable th) {
            try {
                cj0Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: q */
    public final <T> wz0 m5687q(lt0<T> lt0Var, q00 q00Var, T t, boolean z) {
        long m5688p = m5688p(lt0Var, t);
        if (z && m5688p == 0) {
            return this;
        }
        m5681w((m5683u(q00Var) << 3) | 2);
        m5680x(m5688p);
        lt0Var.mo2307a(t, this);
        return this;
    }

    /* renamed from: r */
    public final <T> wz0 m5686r(xr1<T> xr1Var, q00 q00Var, T t, boolean z) {
        this.f31682e.m1756b(q00Var, z);
        xr1Var.mo2307a(t, this.f31682e);
        return this;
    }

    /* renamed from: s */
    public wz0 m5685s(Object obj) {
        if (obj == null) {
            return this;
        }
        lt0<?> lt0Var = this.f31679b.get(obj.getClass());
        if (lt0Var != null) {
            lt0Var.mo2307a(obj, this);
            return this;
        }
        throw new C1012cx("No encoder for " + obj.getClass());
    }

    /* renamed from: w */
    public final void m5681w(int i) {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f31678a;
            if (i2 == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* renamed from: x */
    public final void m5680x(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f31678a;
            if (i == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
