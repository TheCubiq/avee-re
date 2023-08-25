package com.daaw;

import android.os.Handler;
import com.daaw.AbstractC2527pa;
/* loaded from: classes.dex */
public final class h02 implements AbstractC2527pa.InterfaceC2532e {

    /* renamed from: a */
    public final /* synthetic */ i02 f11920a;

    public h02(i02 i02Var) {
        this.f11920a = i02Var;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2532e
    /* renamed from: a */
    public final void mo13539a() {
        Handler handler;
        handler = this.f11920a.f13124B.f34538E;
        handler.post(new g02(this));
    }
}
