package com.daaw;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class qm3 extends w84 {
    public final g5 p;

    public qm3(g5 g5Var) {
        this.p = g5Var;
    }

    @Override // com.daaw.x84
    public final void A2(String str, String str2, yd0 yd0Var) {
        this.p.u(str, str2, yd0Var != null ? nt0.M(yd0Var) : null);
    }

    @Override // com.daaw.x84
    public final void H(Bundle bundle) {
        this.p.s(bundle);
    }

    @Override // com.daaw.x84
    public final Map H2(String str, String str2, boolean z) {
        return this.p.m(str, str2, z);
    }

    @Override // com.daaw.x84
    public final List I1(String str, String str2) {
        return this.p.g(str, str2);
    }

    @Override // com.daaw.x84
    public final void S2(String str, String str2, Bundle bundle) {
        this.p.b(str, str2, bundle);
    }

    @Override // com.daaw.x84
    public final void Y1(String str, String str2, Bundle bundle) {
        this.p.n(str, str2, bundle);
    }

    @Override // com.daaw.x84
    public final void n(String str) {
        this.p.a(str);
    }

    @Override // com.daaw.x84
    public final void o(Bundle bundle) {
        this.p.o(bundle);
    }

    @Override // com.daaw.x84
    public final void u2(yd0 yd0Var, String str, String str2) {
        this.p.t(yd0Var != null ? (Activity) nt0.M(yd0Var) : null, str, str2);
    }

    @Override // com.daaw.x84
    public final Bundle x(Bundle bundle) {
        return this.p.p(bundle);
    }

    @Override // com.daaw.x84
    public final int zzb(String str) {
        return this.p.l(str);
    }

    @Override // com.daaw.x84
    public final long zzc() {
        return this.p.d();
    }

    @Override // com.daaw.x84
    public final String zze() {
        return this.p.e();
    }

    @Override // com.daaw.x84
    public final String zzf() {
        return this.p.f();
    }

    @Override // com.daaw.x84
    public final String zzg() {
        return this.p.h();
    }

    @Override // com.daaw.x84
    public final String zzh() {
        return this.p.i();
    }

    @Override // com.daaw.x84
    public final String zzi() {
        return this.p.j();
    }

    @Override // com.daaw.x84
    public final void zzn(String str) {
        this.p.c(str);
    }

    @Override // com.daaw.x84
    public final void zzq(Bundle bundle) {
        this.p.r(bundle);
    }
}
