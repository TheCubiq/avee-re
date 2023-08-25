package com.daaw;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.daaw.k3;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class v12<ResultT> extends q02 {
    public final sj1<k3.b, ResultT> b;
    public final tj1<ResultT> c;
    public final vf1 d;

    public v12(int i, sj1<k3.b, ResultT> sj1Var, tj1<ResultT> tj1Var, vf1 vf1Var) {
        super(i);
        this.c = tj1Var;
        this.b = sj1Var;
        this.d = vf1Var;
        if (i == 2 && sj1Var.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.daaw.b22
    public final void a(Status status) {
        this.c.d(this.d.a(status));
    }

    @Override // com.daaw.b22
    public final void b(Exception exc) {
        this.c.d(exc);
    }

    @Override // com.daaw.b22
    public final void c(i02<?> i02Var) {
        try {
            this.b.b(i02Var.s(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(b22.e(e2));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // com.daaw.b22
    public final void d(tz1 tz1Var, boolean z) {
        tz1Var.b(this.c, z);
    }

    @Override // com.daaw.q02
    public final boolean f(i02<?> i02Var) {
        return this.b.c();
    }

    @Override // com.daaw.q02
    public final Feature[] g(i02<?> i02Var) {
        return this.b.e();
    }
}
