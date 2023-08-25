package com.daaw;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class kk4 extends zi4 {
    public final se3 i;
    public final Runnable j;
    public final Executor k;

    public kk4(yl4 yl4Var, se3 se3Var, Runnable runnable, Executor executor) {
        super(yl4Var);
        this.i = se3Var;
        this.j = runnable;
        this.k = executor;
    }

    public static /* synthetic */ void o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.daaw.zl4
    public final void b() {
        final ik4 ik4Var = new ik4(new AtomicReference(this.j));
        this.k.execute(new Runnable() { // from class: com.daaw.jk4
            @Override // java.lang.Runnable
            public final void run() {
                kk4.this.p(ik4Var);
            }
        });
    }

    @Override // com.daaw.zi4
    public final int h() {
        return 0;
    }

    @Override // com.daaw.zi4
    public final View i() {
        return null;
    }

    @Override // com.daaw.zi4
    public final zzdq j() {
        return null;
    }

    @Override // com.daaw.zi4
    public final uh6 k() {
        return null;
    }

    @Override // com.daaw.zi4
    public final uh6 l() {
        return null;
    }

    @Override // com.daaw.zi4
    public final void m() {
    }

    @Override // com.daaw.zi4
    public final void n(ViewGroup viewGroup, zzq zzqVar) {
    }

    public final /* synthetic */ void p(Runnable runnable) {
        try {
            if (this.i.zzb(nt0.g3(runnable))) {
                return;
            }
            o(((ik4) runnable).p);
        } catch (RemoteException unused) {
            o(((ik4) runnable).p);
        }
    }
}
