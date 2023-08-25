package com.daaw;

import com.daaw.yz0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class yz0 {
    public final Map<Class<?>, lt0<?>> a;
    public final Map<Class<?>, xr1<?>> b;
    public final lt0<Object> c;

    /* loaded from: classes2.dex */
    public static final class a implements ax<a> {
        public static final lt0<Object> d = new lt0() { // from class: com.daaw.xz0
            @Override // com.daaw.yw
            public final void a(Object obj, mt0 mt0Var) {
                yz0.a.e(obj, mt0Var);
            }
        };
        public final Map<Class<?>, lt0<?>> a = new HashMap();
        public final Map<Class<?>, xr1<?>> b = new HashMap();
        public lt0<Object> c = d;

        public static /* synthetic */ void e(Object obj, mt0 mt0Var) {
            throw new cx("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public yz0 c() {
            return new yz0(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(dj djVar) {
            djVar.a(this);
            return this;
        }

        @Override // com.daaw.ax
        /* renamed from: f */
        public <U> a a(Class<U> cls, lt0<? super U> lt0Var) {
            this.a.put(cls, lt0Var);
            this.b.remove(cls);
            return this;
        }
    }

    public yz0(Map<Class<?>, lt0<?>> map, Map<Class<?>, xr1<?>> map2, lt0<Object> lt0Var) {
        this.a = map;
        this.b = map2;
        this.c = lt0Var;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new wz0(outputStream, this.a, this.b, this.c).s(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
