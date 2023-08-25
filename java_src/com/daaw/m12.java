package com.daaw;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class m12<T> extends q02 {
    public final tj1<T> b;

    public m12(int i, tj1<T> tj1Var) {
        super(i);
        this.b = tj1Var;
    }

    @Override // com.daaw.b22
    public final void a(Status status) {
        this.b.d(new l3(status));
    }

    @Override // com.daaw.b22
    public final void b(Exception exc) {
        this.b.d(exc);
    }

    @Override // com.daaw.b22
    public final void c(i02<?> i02Var) {
        try {
            h(i02Var);
        } catch (DeadObjectException e) {
            a(b22.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(b22.e(e2));
        } catch (RuntimeException e3) {
            this.b.d(e3);
        }
    }

    public abstract void h(i02<?> i02Var);
}
