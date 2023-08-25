package com.daaw;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class m12<T> extends q02 {

    /* renamed from: b */
    public final tj1<T> f17987b;

    public m12(int i, tj1<T> tj1Var) {
        super(i);
        this.f17987b = tj1Var;
    }

    @Override // com.daaw.b22
    /* renamed from: a */
    public final void mo7553a(Status status) {
        this.f17987b.m9079d(new C2009l3(status));
    }

    @Override // com.daaw.b22
    /* renamed from: b */
    public final void mo7552b(Exception exc) {
        this.f17987b.m9079d(exc);
    }

    @Override // com.daaw.b22
    /* renamed from: c */
    public final void mo7551c(i02<?> i02Var) {
        try {
            mo4269h(i02Var);
        } catch (DeadObjectException e) {
            mo7553a(b22.m26523e(e));
            throw e;
        } catch (RemoteException e2) {
            mo7553a(b22.m26523e(e2));
        } catch (RuntimeException e3) {
            this.f17987b.m9079d(e3);
        }
    }

    /* renamed from: h */
    public abstract void mo4269h(i02<?> i02Var);
}
