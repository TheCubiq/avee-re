package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class uw5 implements zzf {

    /* renamed from: a */
    public final jq4 f29584a;

    /* renamed from: b */
    public final gr4 f29585b;

    /* renamed from: c */
    public final xy4 f29586c;

    /* renamed from: d */
    public final ny4 f29587d;

    /* renamed from: e */
    public final ah4 f29588e;

    /* renamed from: f */
    public final AtomicBoolean f29589f = new AtomicBoolean(false);

    public uw5(jq4 jq4Var, gr4 gr4Var, xy4 xy4Var, ny4 ny4Var, ah4 ah4Var) {
        this.f29584a = jq4Var;
        this.f29585b = gr4Var;
        this.f29586c = xy4Var;
        this.f29587d = ny4Var;
        this.f29588e = ah4Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.f29589f.compareAndSet(false, true)) {
            this.f29588e.zzl();
            this.f29587d.m14720C0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.f29589f.get()) {
            this.f29584a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.f29589f.get()) {
            this.f29585b.zza();
            this.f29586c.zza();
        }
    }
}
