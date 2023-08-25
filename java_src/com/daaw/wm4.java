package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class wm4 implements zzo {

    /* renamed from: p */
    public final vr4 f31341p;

    /* renamed from: q */
    public final AtomicBoolean f31342q = new AtomicBoolean(false);

    /* renamed from: r */
    public final AtomicBoolean f31343r = new AtomicBoolean(false);

    public wm4(vr4 vr4Var) {
        this.f31341p = vr4Var;
    }

    /* renamed from: a */
    public final boolean m5978a() {
        return this.f31342q.get();
    }

    /* renamed from: b */
    public final void m5977b() {
        if (this.f31343r.get()) {
            return;
        }
        this.f31343r.set(true);
        this.f31341p.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        this.f31341p.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
        m5977b();
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
        this.f31342q.set(true);
        m5977b();
    }
}
