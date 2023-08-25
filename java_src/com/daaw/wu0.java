package com.daaw;

import com.daaw.InterfaceC1216es;
/* loaded from: classes2.dex */
public class wu0<T> implements b01<T>, InterfaceC1216es<T> {

    /* renamed from: c */
    public static final InterfaceC1216es.InterfaceC1217a<Object> f31514c = new InterfaceC1216es.InterfaceC1217a() { // from class: com.daaw.uu0
        @Override // com.daaw.InterfaceC1216es.InterfaceC1217a
        /* renamed from: a */
        public final void mo7704a(b01 b01Var) {
            wu0.m5788f(b01Var);
        }
    };

    /* renamed from: d */
    public static final b01<Object> f31515d = new b01() { // from class: com.daaw.vu0
        @Override // com.daaw.b01
        public final Object get() {
            Object m5787g;
            m5787g = wu0.m5787g();
            return m5787g;
        }
    };

    /* renamed from: a */
    public InterfaceC1216es.InterfaceC1217a<T> f31516a;

    /* renamed from: b */
    public volatile b01<T> f31517b;

    public wu0(InterfaceC1216es.InterfaceC1217a<T> interfaceC1217a, b01<T> b01Var) {
        this.f31516a = interfaceC1217a;
        this.f31517b = b01Var;
    }

    /* renamed from: e */
    public static <T> wu0<T> m5789e() {
        return new wu0<>(f31514c, f31515d);
    }

    /* renamed from: f */
    public static /* synthetic */ void m5788f(b01 b01Var) {
    }

    /* renamed from: g */
    public static /* synthetic */ Object m5787g() {
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m5786h(InterfaceC1216es.InterfaceC1217a interfaceC1217a, InterfaceC1216es.InterfaceC1217a interfaceC1217a2, b01 b01Var) {
        interfaceC1217a.mo7704a(b01Var);
        interfaceC1217a2.mo7704a(b01Var);
    }

    /* renamed from: i */
    public static <T> wu0<T> m5785i(b01<T> b01Var) {
        return new wu0<>(null, b01Var);
    }

    @Override // com.daaw.InterfaceC1216es
    /* renamed from: a */
    public void mo5793a(final InterfaceC1216es.InterfaceC1217a<T> interfaceC1217a) {
        b01<T> b01Var;
        b01<T> b01Var2 = this.f31517b;
        b01<Object> b01Var3 = f31515d;
        if (b01Var2 != b01Var3) {
            interfaceC1217a.mo7704a(b01Var2);
            return;
        }
        b01<T> b01Var4 = null;
        synchronized (this) {
            b01Var = this.f31517b;
            if (b01Var != b01Var3) {
                b01Var4 = b01Var;
            } else {
                final InterfaceC1216es.InterfaceC1217a<T> interfaceC1217a2 = this.f31516a;
                this.f31516a = new InterfaceC1216es.InterfaceC1217a() { // from class: com.daaw.tu0
                    @Override // com.daaw.InterfaceC1216es.InterfaceC1217a
                    /* renamed from: a */
                    public final void mo7704a(b01 b01Var5) {
                        wu0.m5786h(InterfaceC1216es.InterfaceC1217a.this, interfaceC1217a, b01Var5);
                    }
                };
            }
        }
        if (b01Var4 != null) {
            interfaceC1217a.mo7704a(b01Var);
        }
    }

    @Override // com.daaw.b01
    public T get() {
        return this.f31517b.get();
    }

    /* renamed from: j */
    public void m5784j(b01<T> b01Var) {
        InterfaceC1216es.InterfaceC1217a<T> interfaceC1217a;
        if (this.f31517b != f31515d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC1217a = this.f31516a;
            this.f31516a = null;
            this.f31517b = b01Var;
        }
        interfaceC1217a.mo7704a(b01Var);
    }
}
