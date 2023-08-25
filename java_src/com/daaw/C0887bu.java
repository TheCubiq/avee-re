package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: com.daaw.bu */
/* loaded from: classes2.dex */
public final class C0887bu<T> extends AbstractC1219eu<T> implements InterfaceC3343vl, InterfaceC1438gl<T> {

    /* renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5179w = AtomicReferenceFieldUpdater.newUpdater(C0887bu.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: s */
    public final AbstractC2557pl f5180s;

    /* renamed from: t */
    public final InterfaceC1438gl<T> f5181t;

    /* renamed from: u */
    public Object f5182u;

    /* renamed from: v */
    public final Object f5183v;

    /* JADX WARN: Multi-variable type inference failed */
    public C0887bu(AbstractC2557pl abstractC2557pl, InterfaceC1438gl<? super T> interfaceC1438gl) {
        super(-1);
        this.f5180s = abstractC2557pl;
        this.f5181t = interfaceC1438gl;
        this.f5182u = C1008cu.m24978a();
        this.f5183v = bl1.m26072b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // com.daaw.InterfaceC3343vl
    /* renamed from: a */
    public InterfaceC3343vl mo7066a() {
        InterfaceC1438gl<T> interfaceC1438gl = this.f5181t;
        if (interfaceC1438gl instanceof InterfaceC3343vl) {
            return (InterfaceC3343vl) interfaceC1438gl;
        }
        return null;
    }

    @Override // com.daaw.InterfaceC1438gl
    /* renamed from: b */
    public void mo7267b(Object obj) {
        InterfaceC2307nl context = this.f5181t.getContext();
        Object m11312d = C2862rh.m11312d(obj, null, 1, null);
        if (this.f5180s.mo11594U(context)) {
            this.f5182u = m11312d;
            this.f8831r = 0;
            this.f5180s.mo5048T(context, this);
            return;
        }
        AbstractC1150dy m25251a = cl1.f5936a.m25251a();
        if (m25251a.m23819c0()) {
            this.f5182u = m11312d;
            this.f8831r = 0;
            m25251a.m23822Y(this);
            return;
        }
        m25251a.m23821a0(true);
        try {
            InterfaceC2307nl context2 = getContext();
            Object m26071c = bl1.m26071c(context2, this.f5183v);
            this.f5181t.mo7267b(obj);
            lp1 lp1Var = lp1.f17593a;
            bl1.m26073a(context2, m26071c);
            do {
            } while (m25251a.m23817e0());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // com.daaw.AbstractC1219eu
    /* renamed from: c */
    public void mo7266c(Object obj, Throwable th) {
        if (obj instanceof C2440oh) {
            ((C2440oh) obj).f21558b.mo2829b(th);
        }
    }

    @Override // com.daaw.AbstractC1219eu
    /* renamed from: d */
    public InterfaceC1438gl<T> mo7265d() {
        return this;
    }

    @Override // com.daaw.InterfaceC1438gl
    public InterfaceC2307nl getContext() {
        return this.f5181t.getContext();
    }

    @Override // com.daaw.AbstractC1219eu
    /* renamed from: h */
    public Object mo7262h() {
        Object obj = this.f5182u;
        this.f5182u = C1008cu.m24978a();
        return obj;
    }

    /* renamed from: i */
    public final void m25830i() {
        do {
        } while (this._reusableCancellableContinuation == C1008cu.f6182b);
    }

    /* renamed from: j */
    public final C3324vd<?> m25829j() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C3324vd) {
            return (C3324vd) obj;
        }
        return null;
    }

    /* renamed from: k */
    public final boolean m25828k() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: l */
    public final void m25827l() {
        m25830i();
        C3324vd<?> m25829j = m25829j();
        if (m25829j == null) {
            return;
        }
        m25829j.m7258l();
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f5180s + ", " + C0666aq.m27225c(this.f5181t) + ']';
    }
}
