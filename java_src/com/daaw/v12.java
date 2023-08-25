package com.daaw;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.daaw.C1897k3;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class v12<ResultT> extends q02 {

    /* renamed from: b */
    public final sj1<C1897k3.InterfaceC1899b, ResultT> f29716b;

    /* renamed from: c */
    public final tj1<ResultT> f29717c;

    /* renamed from: d */
    public final vf1 f29718d;

    public v12(int i, sj1<C1897k3.InterfaceC1899b, ResultT> sj1Var, tj1<ResultT> tj1Var, vf1 vf1Var) {
        super(i);
        this.f29717c = tj1Var;
        this.f29716b = sj1Var;
        this.f29718d = vf1Var;
        if (i == 2 && sj1Var.m10302c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.daaw.b22
    /* renamed from: a */
    public final void mo7553a(Status status) {
        this.f29717c.m9079d(this.f29718d.mo7196a(status));
    }

    @Override // com.daaw.b22
    /* renamed from: b */
    public final void mo7552b(Exception exc) {
        this.f29717c.m9079d(exc);
    }

    @Override // com.daaw.b22
    /* renamed from: c */
    public final void mo7551c(i02<?> i02Var) {
        try {
            this.f29716b.mo10303b(i02Var.m20236s(), this.f29717c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo7553a(b22.m26523e(e2));
        } catch (RuntimeException e3) {
            this.f29717c.m9079d(e3);
        }
    }

    @Override // com.daaw.b22
    /* renamed from: d */
    public final void mo4272d(tz1 tz1Var, boolean z) {
        tz1Var.m8667b(this.f29717c, z);
    }

    @Override // com.daaw.q02
    /* renamed from: f */
    public final boolean mo4271f(i02<?> i02Var) {
        return this.f29716b.m10302c();
    }

    @Override // com.daaw.q02
    /* renamed from: g */
    public final Feature[] mo4270g(i02<?> i02Var) {
        return this.f29716b.m10300e();
    }
}
