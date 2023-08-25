package com.daaw;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.daaw.pa;
/* loaded from: classes.dex */
public final class f33 implements pa.a {
    public final /* synthetic */ h33 a;

    public f33(h33 h33Var) {
        this.a = h33Var;
    }

    @Override // com.daaw.pa.a
    public final void D(int i) {
        Object obj;
        Object obj2;
        obj = this.a.c;
        synchronized (obj) {
            this.a.f = null;
            obj2 = this.a.c;
            obj2.notifyAll();
        }
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        Object obj;
        Object obj2;
        j33 j33Var;
        j33 j33Var2;
        obj = this.a.c;
        synchronized (obj) {
            try {
                h33 h33Var = this.a;
                j33Var = h33Var.d;
                if (j33Var != null) {
                    j33Var2 = h33Var.d;
                    h33Var.f = j33Var2.K();
                }
            } catch (DeadObjectException e) {
                k04.zzh("Unable to obtain a cache service instance.", e);
                h33.h(this.a);
            }
            obj2 = this.a.c;
            obj2.notifyAll();
        }
    }
}
