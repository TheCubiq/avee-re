package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ml4 implements fs4, ir4 {
    public final Context p;
    public final a74 q;
    public final th6 r;
    public final zzchu s;
    @GuardedBy("this")
    public yd0 t;
    @GuardedBy("this")
    public boolean u;

    public ml4(Context context, a74 a74Var, th6 th6Var, zzchu zzchuVar) {
        this.p = context;
        this.q = a74Var;
        this.r = th6Var;
        this.s = zzchuVar;
    }

    public final synchronized void a() {
        oq5 oq5Var;
        pq5 pq5Var;
        if (this.r.U) {
            if (this.q == null) {
                return;
            }
            if (zzt.zzA().d(this.p)) {
                zzchu zzchuVar = this.s;
                String str = zzchuVar.q + "." + zzchuVar.r;
                String a = this.r.W.a();
                if (this.r.W.b() == 1) {
                    oq5Var = oq5.VIDEO;
                    pq5Var = pq5.DEFINED_BY_JAVASCRIPT;
                } else {
                    oq5Var = oq5.HTML_DISPLAY;
                    pq5Var = this.r.f == 1 ? pq5.ONE_PIXEL : pq5.BEGIN_TO_RENDER;
                }
                yd0 c = zzt.zzA().c(str, this.q.h(), "", "javascript", a, pq5Var, oq5Var, this.r.n0);
                this.t = c;
                a74 a74Var = this.q;
                if (c != null) {
                    zzt.zzA().b(this.t, (View) a74Var);
                    this.q.R(this.t);
                    zzt.zzA().zzd(this.t);
                    this.u = true;
                    this.q.T("onSdkLoaded", new g6());
                }
            }
        }
    }

    @Override // com.daaw.ir4
    public final synchronized void zzl() {
        a74 a74Var;
        if (!this.u) {
            a();
        }
        if (!this.r.U || this.t == null || (a74Var = this.q) == null) {
            return;
        }
        a74Var.T("onSdkImpression", new g6());
    }

    @Override // com.daaw.fs4
    public final synchronized void zzn() {
        if (this.u) {
            return;
        }
        a();
    }
}
