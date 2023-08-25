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

    /* renamed from: i */
    public final se3 f16428i;

    /* renamed from: j */
    public final Runnable f16429j;

    /* renamed from: k */
    public final Executor f16430k;

    public kk4(yl4 yl4Var, se3 se3Var, Runnable runnable, Executor executor) {
        super(yl4Var);
        this.f16428i = se3Var;
        this.f16429j = runnable;
        this.f16430k = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m17683o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.daaw.zl4
    /* renamed from: b */
    public final void mo2131b() {
        final ik4 ik4Var = new ik4(new AtomicReference(this.f16429j));
        this.f16430k.execute(new Runnable() { // from class: com.daaw.jk4
            @Override // java.lang.Runnable
            public final void run() {
                kk4.this.m17682p(ik4Var);
            }
        });
    }

    @Override // com.daaw.zi4
    /* renamed from: h */
    public final int mo2275h() {
        return 0;
    }

    @Override // com.daaw.zi4
    /* renamed from: i */
    public final View mo2274i() {
        return null;
    }

    @Override // com.daaw.zi4
    /* renamed from: j */
    public final zzdq mo2273j() {
        return null;
    }

    @Override // com.daaw.zi4
    /* renamed from: k */
    public final uh6 mo2272k() {
        return null;
    }

    @Override // com.daaw.zi4
    /* renamed from: l */
    public final uh6 mo2271l() {
        return null;
    }

    @Override // com.daaw.zi4
    /* renamed from: m */
    public final void mo2270m() {
    }

    @Override // com.daaw.zi4
    /* renamed from: n */
    public final void mo2269n(ViewGroup viewGroup, zzq zzqVar) {
    }

    /* renamed from: p */
    public final /* synthetic */ void m17682p(Runnable runnable) {
        try {
            if (this.f16428i.zzb(nt0.m14830g3(runnable))) {
                return;
            }
            m17683o(((ik4) runnable).f13717p);
        } catch (RemoteException unused) {
            m17683o(((ik4) runnable).f13717p);
        }
    }
}
