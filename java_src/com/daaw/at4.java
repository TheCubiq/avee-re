package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class at4 extends kw4 implements ir4, qs4 {
    public final th6 q;
    public final AtomicBoolean r;

    public at4(Set set, th6 th6Var) {
        super(set);
        this.r = new AtomicBoolean();
        this.q = th6Var;
    }

    public final /* synthetic */ void C0(ct4 ct4Var) {
        ct4Var.f(this.q.g0);
    }

    public final void zzb() {
        zzs zzsVar;
        if (((Boolean) zzba.zzc().b(g93.Y6)).booleanValue() && this.r.compareAndSet(false, true) && (zzsVar = this.q.g0) != null && zzsVar.zza == 3) {
            B0(new jw4() { // from class: com.daaw.zs4
                @Override // com.daaw.jw4
                public final void zza(Object obj) {
                    at4.this.C0((ct4) obj);
                }
            });
        }
    }

    @Override // com.daaw.qs4
    public final void zzh() {
        if (this.q.b == 1) {
            zzb();
        }
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        int i = this.q.b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
