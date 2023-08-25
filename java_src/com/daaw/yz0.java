package com.daaw;

import com.daaw.yz0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class yz0 {

    /* renamed from: a */
    public final Map<Class<?>, lt0<?>> f34283a;

    /* renamed from: b */
    public final Map<Class<?>, xr1<?>> f34284b;

    /* renamed from: c */
    public final lt0<Object> f34285c;

    /* renamed from: com.daaw.yz0$a */
    /* loaded from: classes2.dex */
    public static final class C3785a implements InterfaceC0779ax<C3785a> {

        /* renamed from: d */
        public static final lt0<Object> f34286d = new lt0() { // from class: com.daaw.xz0
            @Override // com.daaw.InterfaceC3756yw
            /* renamed from: a */
            public final void mo2307a(Object obj, mt0 mt0Var) {
                yz0.C3785a.m3022e(obj, mt0Var);
            }
        };

        /* renamed from: a */
        public final Map<Class<?>, lt0<?>> f34287a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, xr1<?>> f34288b = new HashMap();

        /* renamed from: c */
        public lt0<Object> f34289c = f34286d;

        /* renamed from: e */
        public static /* synthetic */ void m3022e(Object obj, mt0 mt0Var) {
            throw new C1012cx("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public yz0 m3024c() {
            return new yz0(new HashMap(this.f34287a), new HashMap(this.f34288b), this.f34289c);
        }

        /* renamed from: d */
        public C3785a m3023d(InterfaceC1090dj interfaceC1090dj) {
            interfaceC1090dj.mo7393a(this);
            return this;
        }

        @Override // com.daaw.InterfaceC0779ax
        /* renamed from: f */
        public <U> C3785a mo2325a(Class<U> cls, lt0<? super U> lt0Var) {
            this.f34287a.put(cls, lt0Var);
            this.f34288b.remove(cls);
            return this;
        }
    }

    public yz0(Map<Class<?>, lt0<?>> map, Map<Class<?>, xr1<?>> map2, lt0<Object> lt0Var) {
        this.f34283a = map;
        this.f34284b = map2;
        this.f34285c = lt0Var;
    }

    /* renamed from: a */
    public static C3785a m3028a() {
        return new C3785a();
    }

    /* renamed from: b */
    public void m3027b(Object obj, OutputStream outputStream) {
        new wz0(outputStream, this.f34283a, this.f34284b, this.f34285c).m5685s(obj);
    }

    /* renamed from: c */
    public byte[] m3026c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m3027b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
