package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class uw5 implements zzf {
    public final jq4 a;
    public final gr4 b;
    public final xy4 c;
    public final ny4 d;
    public final ah4 e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public uw5(jq4 jq4Var, gr4 gr4Var, xy4 xy4Var, ny4 ny4Var, ah4 ah4Var) {
        this.a = jq4Var;
        this.b = gr4Var;
        this.c = xy4Var;
        this.d = ny4Var;
        this.e = ah4Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.f.compareAndSet(false, true)) {
            this.e.zzl();
            this.d.C0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.f.get()) {
            this.a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.f.get()) {
            this.b.zza();
            this.c.zza();
        }
    }
}
