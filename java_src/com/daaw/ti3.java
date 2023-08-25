package com.daaw;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.daaw.pa;
/* loaded from: classes.dex */
public final class ti3 implements pa.a {
    public final /* synthetic */ e14 a;
    public final /* synthetic */ vi3 b;

    public ti3(vi3 vi3Var, e14 e14Var) {
        this.b = vi3Var;
        this.a = e14Var;
    }

    @Override // com.daaw.pa.a
    public final void D(int i) {
        e14 e14Var = this.a;
        e14Var.c(new RuntimeException("onConnectionSuspended: " + i));
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        ki3 ki3Var;
        try {
            e14 e14Var = this.a;
            ki3Var = this.b.a;
            e14Var.b(ki3Var.J());
        } catch (DeadObjectException e) {
            this.a.c(e);
        }
    }
}
