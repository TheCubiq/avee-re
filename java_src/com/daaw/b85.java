package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class b85 extends xe3 {
    public final String p;
    public final e35 q;
    public final j35 r;

    public b85(String str, e35 e35Var, j35 j35Var) {
        this.p = str;
        this.q = e35Var;
        this.r = j35Var;
    }

    @Override // com.daaw.ye3
    public final void L0(zzdg zzdgVar) {
        this.q.s(zzdgVar);
    }

    @Override // com.daaw.ye3
    public final void M1(zzcs zzcsVar) {
        this.q.r(zzcsVar);
    }

    @Override // com.daaw.ye3
    public final void W2(Bundle bundle) {
        this.q.j(bundle);
    }

    @Override // com.daaw.ye3
    public final void Z0(Bundle bundle) {
        this.q.o(bundle);
    }

    @Override // com.daaw.ye3
    public final List b() {
        return this.r.e();
    }

    @Override // com.daaw.ye3
    public final void d2(ve3 ve3Var) {
        this.q.t(ve3Var);
    }

    @Override // com.daaw.ye3
    public final boolean g() {
        return (this.r.f().isEmpty() || this.r.S() == null) ? false : true;
    }

    @Override // com.daaw.ye3
    public final boolean g2(Bundle bundle) {
        return this.q.B(bundle);
    }

    @Override // com.daaw.ye3
    public final boolean j() {
        return this.q.y();
    }

    @Override // com.daaw.ye3
    public final void k() {
        this.q.Q();
    }

    @Override // com.daaw.ye3
    public final void v0(zzcw zzcwVar) {
        this.q.Y(zzcwVar);
    }

    @Override // com.daaw.ye3
    public final void zzA() {
        this.q.k();
    }

    @Override // com.daaw.ye3
    public final void zzC() {
        this.q.q();
    }

    @Override // com.daaw.ye3
    public final double zze() {
        return this.r.A();
    }

    @Override // com.daaw.ye3
    public final Bundle zzf() {
        return this.r.L();
    }

    @Override // com.daaw.ye3
    public final zzdn zzg() {
        if (((Boolean) zzba.zzc().b(g93.i6)).booleanValue()) {
            return this.q.c();
        }
        return null;
    }

    @Override // com.daaw.ye3
    public final zzdq zzh() {
        return this.r.R();
    }

    @Override // com.daaw.ye3
    public final nc3 zzi() {
        return this.r.T();
    }

    @Override // com.daaw.ye3
    public final sc3 zzj() {
        return this.q.I().a();
    }

    @Override // com.daaw.ye3
    public final vc3 zzk() {
        return this.r.V();
    }

    @Override // com.daaw.ye3
    public final yd0 zzl() {
        return this.r.b0();
    }

    @Override // com.daaw.ye3
    public final yd0 zzm() {
        return nt0.g3(this.q);
    }

    @Override // com.daaw.ye3
    public final String zzn() {
        return this.r.d0();
    }

    @Override // com.daaw.ye3
    public final String zzo() {
        return this.r.e0();
    }

    @Override // com.daaw.ye3
    public final String zzp() {
        return this.r.f0();
    }

    @Override // com.daaw.ye3
    public final String zzq() {
        return this.r.h0();
    }

    @Override // com.daaw.ye3
    public final String zzr() {
        return this.p;
    }

    @Override // com.daaw.ye3
    public final String zzs() {
        return this.r.b();
    }

    @Override // com.daaw.ye3
    public final String zzt() {
        return this.r.c();
    }

    @Override // com.daaw.ye3
    public final List zzv() {
        return g() ? this.r.f() : Collections.emptyList();
    }

    @Override // com.daaw.ye3
    public final void zzx() {
        this.q.a();
    }
}
