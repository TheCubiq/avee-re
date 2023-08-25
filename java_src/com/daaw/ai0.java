package com.daaw;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ai0 implements mt0, yr1 {
    public ai0 a = null;
    public boolean b = true;
    public final JsonWriter c;
    public final Map<Class<?>, lt0<?>> d;
    public final Map<Class<?>, xr1<?>> e;
    public final lt0<Object> f;
    public final boolean g;

    public ai0(Writer writer, Map<Class<?>, lt0<?>> map, Map<Class<?>, xr1<?>> map2, lt0<Object> lt0Var, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = lt0Var;
        this.g = z;
    }

    @Override // com.daaw.mt0
    public mt0 a(q00 q00Var, int i) {
        return k(q00Var.b(), i);
    }

    @Override // com.daaw.mt0
    public mt0 b(q00 q00Var, long j) {
        return l(q00Var.b(), j);
    }

    @Override // com.daaw.mt0
    public mt0 e(q00 q00Var, Object obj) {
        return m(q00Var.b(), obj);
    }

    @Override // com.daaw.mt0
    public mt0 f(q00 q00Var, boolean z) {
        return n(q00Var.b(), z);
    }

    public ai0 g(int i) {
        v();
        this.c.value(i);
        return this;
    }

    public ai0 h(long j) {
        v();
        this.c.value(j);
        return this;
    }

    public ai0 i(Object obj, boolean z) {
        int[] iArr;
        int i = 0;
        if (z && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new cx(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                for (Object obj2 : (Collection) obj) {
                    i(obj2, false);
                }
                this.c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new cx(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            } else {
                lt0<?> lt0Var = this.d.get(obj.getClass());
                if (lt0Var != null) {
                    return s(lt0Var, obj, z);
                }
                xr1<?> xr1Var = this.e.get(obj.getClass());
                if (xr1Var != null) {
                    xr1Var.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    c(((Enum) obj).name());
                    return this;
                } else {
                    return s(this.f, obj, z);
                }
            }
        } else if (obj instanceof byte[]) {
            return p((byte[]) obj);
        } else {
            this.c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    i(number, false);
                }
            } else {
                for (Object obj3 : (Object[]) obj) {
                    i(obj3, false);
                }
            }
            this.c.endArray();
            return this;
        }
    }

    @Override // com.daaw.yr1
    /* renamed from: j */
    public ai0 c(String str) {
        v();
        this.c.value(str);
        return this;
    }

    public ai0 k(String str, int i) {
        v();
        this.c.name(str);
        return g(i);
    }

    public ai0 l(String str, long j) {
        v();
        this.c.name(str);
        return h(j);
    }

    public ai0 m(String str, Object obj) {
        return this.g ? u(str, obj) : t(str, obj);
    }

    public ai0 n(String str, boolean z) {
        v();
        this.c.name(str);
        return d(z);
    }

    @Override // com.daaw.yr1
    /* renamed from: o */
    public ai0 d(boolean z) {
        v();
        this.c.value(z);
        return this;
    }

    public ai0 p(byte[] bArr) {
        v();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void r() {
        v();
        this.c.flush();
    }

    public ai0 s(lt0<Object> lt0Var, Object obj, boolean z) {
        if (!z) {
            this.c.beginObject();
        }
        lt0Var.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }

    public final ai0 t(String str, Object obj) {
        v();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        return i(obj, false);
    }

    public final ai0 u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        v();
        this.c.name(str);
        return i(obj, false);
    }

    public final void v() {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        ai0 ai0Var = this.a;
        if (ai0Var != null) {
            ai0Var.v();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }
}
