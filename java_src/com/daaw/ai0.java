package com.daaw;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ai0 implements mt0, yr1 {

    /* renamed from: a */
    public ai0 f3215a = null;

    /* renamed from: b */
    public boolean f3216b = true;

    /* renamed from: c */
    public final JsonWriter f3217c;

    /* renamed from: d */
    public final Map<Class<?>, lt0<?>> f3218d;

    /* renamed from: e */
    public final Map<Class<?>, xr1<?>> f3219e;

    /* renamed from: f */
    public final lt0<Object> f3220f;

    /* renamed from: g */
    public final boolean f3221g;

    public ai0(Writer writer, Map<Class<?>, lt0<?>> map, Map<Class<?>, xr1<?>> map2, lt0<Object> lt0Var, boolean z) {
        this.f3217c = new JsonWriter(writer);
        this.f3218d = map;
        this.f3219e = map2;
        this.f3220f = lt0Var;
        this.f3221g = z;
    }

    @Override // com.daaw.mt0
    /* renamed from: a */
    public mt0 mo5703a(q00 q00Var, int i) {
        return m27464k(q00Var.m12815b(), i);
    }

    @Override // com.daaw.mt0
    /* renamed from: b */
    public mt0 mo5702b(q00 q00Var, long j) {
        return m27463l(q00Var.m12815b(), j);
    }

    @Override // com.daaw.mt0
    /* renamed from: e */
    public mt0 mo5699e(q00 q00Var, Object obj) {
        return m27462m(q00Var.m12815b(), obj);
    }

    @Override // com.daaw.mt0
    /* renamed from: f */
    public mt0 mo5698f(q00 q00Var, boolean z) {
        return m27461n(q00Var.m12815b(), z);
    }

    /* renamed from: g */
    public ai0 m27468g(int i) {
        m27453v();
        this.f3217c.value(i);
        return this;
    }

    /* renamed from: h */
    public ai0 m27467h(long j) {
        m27453v();
        this.f3217c.value(j);
        return this;
    }

    /* renamed from: i */
    public ai0 m27466i(Object obj, boolean z) {
        int[] iArr;
        int i = 0;
        if (z && m27458q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new C1012cx(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f3217c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f3217c.value((Number) obj);
            return this;
        } else if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f3217c.beginArray();
                for (Object obj2 : (Collection) obj) {
                    m27466i(obj2, false);
                }
                this.f3217c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f3217c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m27462m((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new C1012cx(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.f3217c.endObject();
                return this;
            } else {
                lt0<?> lt0Var = this.f3218d.get(obj.getClass());
                if (lt0Var != null) {
                    return m27456s(lt0Var, obj, z);
                }
                xr1<?> xr1Var = this.f3219e.get(obj.getClass());
                if (xr1Var != null) {
                    xr1Var.mo2307a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    mo1755c(((Enum) obj).name());
                    return this;
                } else {
                    return m27456s(this.f3220f, obj, z);
                }
            }
        } else if (obj instanceof byte[]) {
            return m27459p((byte[]) obj);
        } else {
            this.f3217c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f3217c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    m27467h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f3217c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f3217c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m27466i(number, false);
                }
            } else {
                for (Object obj3 : (Object[]) obj) {
                    m27466i(obj3, false);
                }
            }
            this.f3217c.endArray();
            return this;
        }
    }

    @Override // com.daaw.yr1
    /* renamed from: j */
    public ai0 mo1755c(String str) {
        m27453v();
        this.f3217c.value(str);
        return this;
    }

    /* renamed from: k */
    public ai0 m27464k(String str, int i) {
        m27453v();
        this.f3217c.name(str);
        return m27468g(i);
    }

    /* renamed from: l */
    public ai0 m27463l(String str, long j) {
        m27453v();
        this.f3217c.name(str);
        return m27467h(j);
    }

    /* renamed from: m */
    public ai0 m27462m(String str, Object obj) {
        return this.f3221g ? m27454u(str, obj) : m27455t(str, obj);
    }

    /* renamed from: n */
    public ai0 m27461n(String str, boolean z) {
        m27453v();
        this.f3217c.name(str);
        return mo1754d(z);
    }

    @Override // com.daaw.yr1
    /* renamed from: o */
    public ai0 mo1754d(boolean z) {
        m27453v();
        this.f3217c.value(z);
        return this;
    }

    /* renamed from: p */
    public ai0 m27459p(byte[] bArr) {
        m27453v();
        if (bArr == null) {
            this.f3217c.nullValue();
        } else {
            this.f3217c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: q */
    public final boolean m27458q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: r */
    public void m27457r() {
        m27453v();
        this.f3217c.flush();
    }

    /* renamed from: s */
    public ai0 m27456s(lt0<Object> lt0Var, Object obj, boolean z) {
        if (!z) {
            this.f3217c.beginObject();
        }
        lt0Var.mo2307a(obj, this);
        if (!z) {
            this.f3217c.endObject();
        }
        return this;
    }

    /* renamed from: t */
    public final ai0 m27455t(String str, Object obj) {
        m27453v();
        this.f3217c.name(str);
        if (obj == null) {
            this.f3217c.nullValue();
            return this;
        }
        return m27466i(obj, false);
    }

    /* renamed from: u */
    public final ai0 m27454u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m27453v();
        this.f3217c.name(str);
        return m27466i(obj, false);
    }

    /* renamed from: v */
    public final void m27453v() {
        if (!this.f3216b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        ai0 ai0Var = this.f3215a;
        if (ai0Var != null) {
            ai0Var.m27453v();
            this.f3215a.f3216b = false;
            this.f3215a = null;
            this.f3217c.endObject();
        }
    }
}
