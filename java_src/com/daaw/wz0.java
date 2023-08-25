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
    public static final Charset f = Charset.forName("UTF-8");
    public static final q00 g = q00.a("key").b(w6.b().c(1).a()).a();
    public static final q00 h = q00.a("value").b(w6.b().c(2).a()).a();
    public static final lt0<Map.Entry<Object, Object>> i = new lt0() { // from class: com.daaw.vz0
        @Override // com.daaw.yw
        public final void a(Object obj, mt0 mt0Var) {
            wz0.v((Map.Entry) obj, mt0Var);
        }
    };
    public OutputStream a;
    public final Map<Class<?>, lt0<?>> b;
    public final Map<Class<?>, xr1<?>> c;
    public final lt0<Object> d;
    public final zz0 e = new zz0(this);

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[uz0.a.values().length];
            a = iArr;
            try {
                iArr[uz0.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[uz0.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[uz0.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public wz0(OutputStream outputStream, Map<Class<?>, lt0<?>> map, Map<Class<?>, xr1<?>> map2, lt0<Object> lt0Var) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = lt0Var;
    }

    public static ByteBuffer o(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static uz0 t(q00 q00Var) {
        uz0 uz0Var = (uz0) q00Var.c(uz0.class);
        if (uz0Var != null) {
            return uz0Var;
        }
        throw new cx("Field has no @Protobuf config");
    }

    public static int u(q00 q00Var) {
        uz0 uz0Var = (uz0) q00Var.c(uz0.class);
        if (uz0Var != null) {
            return uz0Var.tag();
        }
        throw new cx("Field has no @Protobuf config");
    }

    public static /* synthetic */ void v(Map.Entry entry, mt0 mt0Var) {
        mt0Var.e(g, entry.getKey());
        mt0Var.e(h, entry.getValue());
    }

    public mt0 d(q00 q00Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        w((u(q00Var) << 3) | 1);
        this.a.write(o(8).putDouble(d).array());
        return this;
    }

    @Override // com.daaw.mt0
    public mt0 e(q00 q00Var, Object obj) {
        return h(q00Var, obj, true);
    }

    public mt0 g(q00 q00Var, float f2, boolean z) {
        if (z && f2 == 0.0f) {
            return this;
        }
        w((u(q00Var) << 3) | 5);
        this.a.write(o(4).putFloat(f2).array());
        return this;
    }

    public mt0 h(q00 q00Var, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            w((u(q00Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            w(bytes.length);
            this.a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                h(q00Var, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                q(i, q00Var, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return d(q00Var, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return g(q00Var, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return l(q00Var, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return n(q00Var, ((Boolean) obj).booleanValue(), z);
            }
            if (!(obj instanceof byte[])) {
                lt0<?> lt0Var = this.b.get(obj.getClass());
                if (lt0Var != null) {
                    return q(lt0Var, q00Var, obj, z);
                }
                xr1<?> xr1Var = this.c.get(obj.getClass());
                return xr1Var != null ? r(xr1Var, q00Var, obj, z) : obj instanceof tz0 ? a(q00Var, ((tz0) obj).a()) : obj instanceof Enum ? a(q00Var, ((Enum) obj).ordinal()) : q(this.d, q00Var, obj, z);
            }
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            w((u(q00Var) << 3) | 2);
            w(bArr.length);
            this.a.write(bArr);
            return this;
        }
    }

    @Override // com.daaw.mt0
    /* renamed from: i */
    public wz0 a(q00 q00Var, int i2) {
        return j(q00Var, i2, true);
    }

    public wz0 j(q00 q00Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return this;
        }
        uz0 t = t(q00Var);
        int i3 = a.a[t.intEncoding().ordinal()];
        if (i3 == 1) {
            w(t.tag() << 3);
            w(i2);
        } else if (i3 == 2) {
            w(t.tag() << 3);
            w((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            w((t.tag() << 3) | 5);
            this.a.write(o(4).putInt(i2).array());
        }
        return this;
    }

    @Override // com.daaw.mt0
    /* renamed from: k */
    public wz0 b(q00 q00Var, long j) {
        return l(q00Var, j, true);
    }

    public wz0 l(q00 q00Var, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        uz0 t = t(q00Var);
        int i2 = a.a[t.intEncoding().ordinal()];
        if (i2 == 1) {
            w(t.tag() << 3);
            x(j);
        } else if (i2 == 2) {
            w(t.tag() << 3);
            x((j >> 63) ^ (j << 1));
        } else if (i2 == 3) {
            w((t.tag() << 3) | 1);
            this.a.write(o(8).putLong(j).array());
        }
        return this;
    }

    @Override // com.daaw.mt0
    /* renamed from: m */
    public wz0 f(q00 q00Var, boolean z) {
        return n(q00Var, z, true);
    }

    public wz0 n(q00 q00Var, boolean z, boolean z2) {
        return j(q00Var, z ? 1 : 0, z2);
    }

    public final <T> long p(lt0<T> lt0Var, T t) {
        cj0 cj0Var = new cj0();
        try {
            OutputStream outputStream = this.a;
            this.a = cj0Var;
            lt0Var.a(t, this);
            this.a = outputStream;
            long d = cj0Var.d();
            cj0Var.close();
            return d;
        } catch (Throwable th) {
            try {
                cj0Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final <T> wz0 q(lt0<T> lt0Var, q00 q00Var, T t, boolean z) {
        long p = p(lt0Var, t);
        if (z && p == 0) {
            return this;
        }
        w((u(q00Var) << 3) | 2);
        x(p);
        lt0Var.a(t, this);
        return this;
    }

    public final <T> wz0 r(xr1<T> xr1Var, q00 q00Var, T t, boolean z) {
        this.e.b(q00Var, z);
        xr1Var.a(t, this.e);
        return this;
    }

    public wz0 s(Object obj) {
        if (obj == null) {
            return this;
        }
        lt0<?> lt0Var = this.b.get(obj.getClass());
        if (lt0Var != null) {
            lt0Var.a(obj, this);
            return this;
        }
        throw new cx("No encoder for " + obj.getClass());
    }

    public final void w(int i2) {
        while (true) {
            int i3 = ((i2 & (-128)) > 0L ? 1 : ((i2 & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i3 == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void x(long j) {
        while (true) {
            int i2 = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
