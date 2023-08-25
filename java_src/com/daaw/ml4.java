package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ml4 implements fs4, ir4 {

    /* renamed from: p */
    public final Context f18960p;

    /* renamed from: q */
    public final a74 f18961q;

    /* renamed from: r */
    public final th6 f18962r;

    /* renamed from: s */
    public final zzchu f18963s;
    @GuardedBy("this")

    /* renamed from: t */
    public yd0 f18964t;
    @GuardedBy("this")

    /* renamed from: u */
    public boolean f18965u;

    public ml4(Context context, a74 a74Var, th6 th6Var, zzchu zzchuVar) {
        this.f18960p = context;
        this.f18961q = a74Var;
        this.f18962r = th6Var;
        this.f18963s = zzchuVar;
    }

    /* renamed from: a */
    public final synchronized void m15963a() {
        oq5 oq5Var;
        pq5 pq5Var;
        if (this.f18962r.f27674U) {
            if (this.f18961q == null) {
                return;
            }
            if (zzt.zzA().mo14876d(this.f18960p)) {
                zzchu zzchuVar = this.f18963s;
                String str = zzchuVar.f36994q + "." + zzchuVar.f36995r;
                String m8112a = this.f18962r.f27676W.m8112a();
                if (this.f18962r.f27676W.m8111b() == 1) {
                    oq5Var = oq5.VIDEO;
                    pq5Var = pq5.DEFINED_BY_JAVASCRIPT;
                } else {
                    oq5Var = oq5.HTML_DISPLAY;
                    pq5Var = this.f18962r.f27690f == 1 ? pq5.ONE_PIXEL : pq5.BEGIN_TO_RENDER;
                }
                yd0 mo14877c = zzt.zzA().mo14877c(str, this.f18961q.mo6416h(), "", "javascript", m8112a, pq5Var, oq5Var, this.f18962r.f27707n0);
                this.f18964t = mo14877c;
                a74 a74Var = this.f18961q;
                if (mo14877c != null) {
                    zzt.zzA().mo14878b(this.f18964t, (View) a74Var);
                    this.f18961q.mo6438R(this.f18964t);
                    zzt.zzA().zzd(this.f18964t);
                    this.f18965u = true;
                    this.f18961q.mo6434T("onSdkLoaded", new C1370g6());
                }
            }
        }
    }

    @Override // com.daaw.ir4
    public final synchronized void zzl() {
        a74 a74Var;
        if (!this.f18965u) {
            m15963a();
        }
        if (!this.f18962r.f27674U || this.f18964t == null || (a74Var = this.f18961q) == null) {
            return;
        }
        a74Var.mo6434T("onSdkImpression", new C1370g6());
    }

    @Override // com.daaw.fs4
    public final synchronized void zzn() {
        if (this.f18965u) {
            return;
        }
        m15963a();
    }
}
