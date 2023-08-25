package com.daaw;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class d60 {
    public static final mq0 d = new a();
    public final Map<Class, Map<Class, nq0>> a = new HashMap();
    public final Map<Class, Map<Class, mq0>> b = new HashMap();
    public final Context c;

    /* loaded from: classes.dex */
    public static class a implements mq0 {
        @Override // com.daaw.mq0
        public ip a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public d60(Context context) {
        this.c = context.getApplicationContext();
    }

    public synchronized <T, Y> mq0<T, Y> a(Class<T> cls, Class<Y> cls2) {
        mq0<T, Y> d2 = d(cls, cls2);
        if (d2 != null) {
            if (d.equals(d2)) {
                return null;
            }
            return d2;
        }
        nq0<T, Y> e = e(cls, cls2);
        if (e != null) {
            d2 = e.a(this.c, this);
            b(cls, cls2, d2);
        } else {
            c(cls, cls2);
        }
        return d2;
    }

    public final <T, Y> void b(Class<T> cls, Class<Y> cls2, mq0<T, Y> mq0Var) {
        Map<Class, mq0> map = this.b.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.b.put(cls, map);
        }
        map.put(cls2, mq0Var);
    }

    public final <T, Y> void c(Class<T> cls, Class<Y> cls2) {
        b(cls, cls2, d);
    }

    public final <T, Y> mq0<T, Y> d(Class<T> cls, Class<Y> cls2) {
        Map<Class, mq0> map = this.b.get(cls);
        if (map != null) {
            return map.get(cls2);
        }
        return null;
    }

    public final <T, Y> nq0<T, Y> e(Class<T> cls, Class<Y> cls2) {
        Map<Class, nq0> map;
        Map<Class, nq0> map2 = this.a.get(cls);
        nq0 nq0Var = map2 != null ? map2.get(cls2) : null;
        if (nq0Var == null) {
            for (Class cls3 : this.a.keySet()) {
                if (cls3.isAssignableFrom(cls) && (map = this.a.get(cls3)) != null && (nq0Var = map.get(cls2)) != null) {
                    break;
                }
            }
        }
        return nq0Var;
    }

    public synchronized <T, Y> nq0<T, Y> f(Class<T> cls, Class<Y> cls2, nq0<T, Y> nq0Var) {
        nq0<T, Y> put;
        this.b.clear();
        Map<Class, nq0> map = this.a.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.a.put(cls, map);
        }
        put = map.put(cls2, nq0Var);
        if (put != null) {
            Iterator<Map<Class, nq0>> it = this.a.values().iterator();
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
