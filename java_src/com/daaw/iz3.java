package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class iz3 {

    /* renamed from: a */
    public long f14128a = -1;

    /* renamed from: b */
    public long f14129b = -1;

    /* renamed from: c */
    public final /* synthetic */ jz3 f14130c;

    public iz3(jz3 jz3Var) {
        this.f14130c = jz3Var;
    }

    /* renamed from: a */
    public final long m19223a() {
        return this.f14129b;
    }

    /* renamed from: b */
    public final Bundle m19222b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f14128a);
        bundle.putLong("tclose", this.f14129b);
        return bundle;
    }

    /* renamed from: c */
    public final void m19221c() {
        InterfaceC0623ag interfaceC0623ag;
        interfaceC0623ag = this.f14130c.f15537a;
        this.f14129b = interfaceC0623ag.mo15859b();
    }

    /* renamed from: d */
    public final void m19220d() {
        InterfaceC0623ag interfaceC0623ag;
        interfaceC0623ag = this.f14130c.f15537a;
        this.f14128a = interfaceC0623ag.mo15859b();
    }
}
