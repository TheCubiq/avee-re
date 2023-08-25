package com.daaw;

import com.daaw.InterfaceC2307nl;
/* renamed from: com.daaw.il */
/* loaded from: classes2.dex */
public abstract class AbstractC1718il extends AbstractC2271na {

    /* renamed from: q */
    public final InterfaceC2307nl f13759q;

    /* renamed from: r */
    public transient InterfaceC1438gl<Object> f13760r;

    @Override // com.daaw.AbstractC2271na
    /* renamed from: e */
    public void mo15371e() {
        InterfaceC1438gl<?> interfaceC1438gl = this.f13760r;
        if (interfaceC1438gl != null && interfaceC1438gl != this) {
            InterfaceC2307nl.InterfaceC2310b interfaceC2310b = getContext().get(InterfaceC1840jl.f15175b);
            ug0.m8271c(interfaceC2310b);
            ((InterfaceC1840jl) interfaceC2310b).mo13314E(interfaceC1438gl);
        }
        this.f13760r = C2175mh.f18873p;
    }

    /* renamed from: f */
    public final InterfaceC1438gl<Object> m19674f() {
        InterfaceC1438gl<Object> interfaceC1438gl = this.f13760r;
        if (interfaceC1438gl == null) {
            InterfaceC1840jl interfaceC1840jl = (InterfaceC1840jl) getContext().get(InterfaceC1840jl.f15175b);
            if (interfaceC1840jl == null || (interfaceC1438gl = interfaceC1840jl.mo13315D(this)) == null) {
                interfaceC1438gl = this;
            }
            this.f13760r = interfaceC1438gl;
        }
        return interfaceC1438gl;
    }

    @Override // com.daaw.InterfaceC1438gl
    public InterfaceC2307nl getContext() {
        InterfaceC2307nl interfaceC2307nl = this.f13759q;
        ug0.m8271c(interfaceC2307nl);
        return interfaceC2307nl;
    }
}
