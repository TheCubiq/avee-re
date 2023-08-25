package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class at4 extends kw4 implements ir4, qs4 {

    /* renamed from: q */
    public final th6 f3577q;

    /* renamed from: r */
    public final AtomicBoolean f3578r;

    public at4(Set set, th6 th6Var) {
        super(set);
        this.f3578r = new AtomicBoolean();
        this.f3577q = th6Var;
    }

    /* renamed from: C0 */
    public final /* synthetic */ void m27042C0(ct4 ct4Var) {
        ct4Var.mo9172f(this.f3577q.f27693g0);
    }

    public final void zzb() {
        zzs zzsVar;
        if (((Boolean) zzba.zzc().m23658b(g93.f10608Y6)).booleanValue() && this.f3578r.compareAndSet(false, true) && (zzsVar = this.f3577q.f27693g0) != null && zzsVar.zza == 3) {
            m17378B0(new jw4() { // from class: com.daaw.zs4
                @Override // com.daaw.jw4
                public final void zza(Object obj) {
                    at4.this.m27042C0((ct4) obj);
                }
            });
        }
    }

    @Override // com.daaw.qs4
    public final void zzh() {
        if (this.f3577q.f27682b == 1) {
            zzb();
        }
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        int i = this.f3577q.f27682b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
