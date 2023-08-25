package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;
/* loaded from: classes.dex */
public final class w75 extends od3 {
    public final String p;
    public final e35 q;
    public final j35 r;

    public w75(String str, e35 e35Var, j35 j35Var) {
        this.p = str;
        this.q = e35Var;
        this.r = j35Var;
    }

    @Override // com.daaw.pd3
    public final void E0(Bundle bundle) {
        this.q.j(bundle);
    }

    @Override // com.daaw.pd3
    public final void o(Bundle bundle) {
        this.q.o(bundle);
    }

    @Override // com.daaw.pd3
    public final Bundle zzb() {
        return this.r.L();
    }

    @Override // com.daaw.pd3
    public final zzdq zzc() {
        return this.r.R();
    }

    @Override // com.daaw.pd3
    public final nc3 zzd() {
        return this.r.T();
    }

    @Override // com.daaw.pd3
    public final vc3 zze() {
        return this.r.W();
    }

    @Override // com.daaw.pd3
    public final yd0 zzf() {
        return this.r.b0();
    }

    @Override // com.daaw.pd3
    public final yd0 zzg() {
        return nt0.g3(this.q);
    }

    @Override // com.daaw.pd3
    public final String zzh() {
        return this.r.d0();
    }

    @Override // com.daaw.pd3
    public final String zzi() {
        return this.r.e0();
    }

    @Override // com.daaw.pd3
    public final String zzj() {
        return this.r.f0();
    }

    @Override // com.daaw.pd3
    public final String zzk() {
        return this.r.h0();
    }

    @Override // com.daaw.pd3
    public final String zzl() {
        return this.p;
    }

    @Override // com.daaw.pd3
    public final List zzm() {
        return this.r.e();
    }

    @Override // com.daaw.pd3
    public final void zzn() {
        this.q.a();
    }

    @Override // com.daaw.pd3
    public final boolean zzq(Bundle bundle) {
        return this.q.B(bundle);
    }
}
