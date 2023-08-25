package com.daaw;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.daaw.AbstractC2527pa;
/* loaded from: classes.dex */
public final class ti3 implements AbstractC2527pa.InterfaceC2528a {

    /* renamed from: a */
    public final /* synthetic */ e14 f27764a;

    /* renamed from: b */
    public final /* synthetic */ vi3 f27765b;

    public ti3(vi3 vi3Var, e14 e14Var) {
        this.f27765b = vi3Var;
        this.f27764a = e14Var;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
        e14 e14Var = this.f27764a;
        e14Var.m23796c(new RuntimeException("onConnectionSuspended: " + i));
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        ki3 ki3Var;
        try {
            e14 e14Var = this.f27764a;
            ki3Var = this.f27765b.f30242a;
            e14Var.m23797b(ki3Var.m17717J());
        } catch (DeadObjectException e) {
            this.f27764a.m23796c(e);
        }
    }
}
