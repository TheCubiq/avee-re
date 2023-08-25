package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class wn4 implements fs4, zza, pt4, ir4, lq4, hw4 {
    public final ag p;
    public final jz3 q;

    public wn4(ag agVar, jz3 jz3Var) {
        this.p = agVar;
        this.q = jz3Var;
    }

    @Override // com.daaw.hw4
    public final void A(v43 v43Var) {
    }

    @Override // com.daaw.pt4
    public final void F(fi6 fi6Var) {
        this.q.k(this.p.b());
    }

    @Override // com.daaw.hw4
    public final void H(v43 v43Var) {
        this.q.i();
    }

    @Override // com.daaw.hw4
    public final void S(boolean z) {
    }

    @Override // com.daaw.lq4
    public final void T() {
    }

    public final String b() {
        return this.q.c();
    }

    @Override // com.daaw.lq4
    public final void c() {
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
    }

    public final void f(zzl zzlVar) {
        this.q.j(zzlVar);
    }

    @Override // com.daaw.hw4
    public final void l0(v43 v43Var) {
        this.q.g();
    }

    @Override // com.daaw.lq4
    public final void m(cv3 cv3Var, String str, String str2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.q.d();
    }

    @Override // com.daaw.hw4
    public final void zzd() {
    }

    @Override // com.daaw.hw4
    public final void zzh(boolean z) {
    }

    @Override // com.daaw.lq4
    public final void zzj() {
        this.q.e();
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        this.q.f();
    }

    @Override // com.daaw.lq4
    public final void zzm() {
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        this.q.h(true);
    }

    @Override // com.daaw.lq4
    public final void zzo() {
    }
}
