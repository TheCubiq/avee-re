package com.daaw;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class d60 {

    /* renamed from: d */
    public static final mq0 f6538d = new C1054a();

    /* renamed from: a */
    public final Map<Class, Map<Class, nq0>> f6539a = new HashMap();

    /* renamed from: b */
    public final Map<Class, Map<Class, mq0>> f6540b = new HashMap();

    /* renamed from: c */
    public final Context f6541c;

    /* renamed from: com.daaw.d60$a */
    /* loaded from: classes.dex */
    public static class C1054a implements mq0 {
        @Override // com.daaw.mq0
        /* renamed from: a */
        public InterfaceC1744ip mo3764a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public d60(Context context) {
        this.f6541c = context.getApplicationContext();
    }

    /* renamed from: a */
    public synchronized <T, Y> mq0<T, Y> m24637a(Class<T> cls, Class<Y> cls2) {
        mq0<T, Y> m24634d = m24634d(cls, cls2);
        if (m24634d != null) {
            if (f6538d.equals(m24634d)) {
                return null;
            }
            return m24634d;
        }
        nq0<T, Y> m24633e = m24633e(cls, cls2);
        if (m24633e != null) {
            m24634d = m24633e.mo3945a(this.f6541c, this);
            m24636b(cls, cls2, m24634d);
        } else {
            m24635c(cls, cls2);
        }
        return m24634d;
    }

    /* renamed from: b */
    public final <T, Y> void m24636b(Class<T> cls, Class<Y> cls2, mq0<T, Y> mq0Var) {
        Map<Class, mq0> map = this.f6540b.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.f6540b.put(cls, map);
        }
        map.put(cls2, mq0Var);
    }

    /* renamed from: c */
    public final <T, Y> void m24635c(Class<T> cls, Class<Y> cls2) {
        m24636b(cls, cls2, f6538d);
    }

    /* renamed from: d */
    public final <T, Y> mq0<T, Y> m24634d(Class<T> cls, Class<Y> cls2) {
        Map<Class, mq0> map = this.f6540b.get(cls);
        if (map != null) {
            return map.get(cls2);
        }
        return null;
    }

    /* renamed from: e */
    public final <T, Y> nq0<T, Y> m24633e(Class<T> cls, Class<Y> cls2) {
        Map<Class, nq0> map;
        Map<Class, nq0> map2 = this.f6539a.get(cls);
        nq0 nq0Var = map2 != null ? map2.get(cls2) : null;
        if (nq0Var == null) {
            for (Class cls3 : this.f6539a.keySet()) {
                if (cls3.isAssignableFrom(cls) && (map = this.f6539a.get(cls3)) != null && (nq0Var = map.get(cls2)) != null) {
                    break;
                }
            }
        }
        return nq0Var;
    }

    /* renamed from: f */
    public synchronized <T, Y> nq0<T, Y> m24632f(Class<T> cls, Class<Y> cls2, nq0<T, Y> nq0Var) {
        nq0<T, Y> put;
        this.f6540b.clear();
        Map<Class, nq0> map = this.f6539a.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.f6539a.put(cls, map);
        }
        put = map.put(cls2, nq0Var);
        if (put != null) {
            Iterator<Map<Class, nq0>> it = this.f6539a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().containsValue(put)) {
                    put = null;
                    break;
                }
            }
        }
        return put;
    }
}
