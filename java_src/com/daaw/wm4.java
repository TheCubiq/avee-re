package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class wm4 implements zzo {
    public final vr4 p;
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);

    public wm4(vr4 vr4Var) {
        this.p = vr4Var;
    }

    public final boolean a() {
        return this.q.get();
    }

    public final void b() {
        if (this.r.get()) {
            return;
        }
        this.r.set(true);
        this.p.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        this.p.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.q.set(true);
        b();
    }
}
