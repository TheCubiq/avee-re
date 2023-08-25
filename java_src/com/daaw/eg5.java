package com.daaw;

import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class eg5 extends cj3 {

    /* renamed from: p */
    public final /* synthetic */ Object f8461p;

    /* renamed from: q */
    public final /* synthetic */ String f8462q;

    /* renamed from: r */
    public final /* synthetic */ long f8463r;

    /* renamed from: s */
    public final /* synthetic */ io6 f8464s;

    /* renamed from: t */
    public final /* synthetic */ e14 f8465t;

    /* renamed from: u */
    public final /* synthetic */ fg5 f8466u;

    public eg5(fg5 fg5Var, Object obj, String str, long j, io6 io6Var, e14 e14Var) {
        this.f8466u = fg5Var;
        this.f8461p = obj;
        this.f8462q = str;
        this.f8463r = j;
        this.f8464s = io6Var;
        this.f8465t = e14Var;
    }

    @Override // com.daaw.dj3
    /* renamed from: a */
    public final void mo23476a(String str) {
        td5 td5Var;
        wx4 wx4Var;
        vo6 vo6Var;
        synchronized (this.f8461p) {
            this.f8466u.m22668v(this.f8462q, false, str, (int) (zzt.zzB().mo15859b() - this.f8463r));
            td5Var = this.f8466u.f9572l;
            td5Var.m9278b(this.f8462q, "error");
            wx4Var = this.f8466u.f9575o;
            wx4Var.mo3090c(this.f8462q, "error");
            vo6Var = this.f8466u.f9576p;
            io6 io6Var = this.f8464s;
            io6Var.mo17582m(str);
            io6Var.zzf(false);
            vo6Var.m6969b(io6Var.zzl());
            this.f8465t.m23797b(Boolean.FALSE);
        }
    }

    @Override // com.daaw.dj3
    public final void zzf() {
        td5 td5Var;
        wx4 wx4Var;
        vo6 vo6Var;
        synchronized (this.f8461p) {
            this.f8466u.m22668v(this.f8462q, true, "", (int) (zzt.zzB().mo15859b() - this.f8463r));
            td5Var = this.f8466u.f9572l;
            td5Var.m9276d(this.f8462q);
            wx4Var = this.f8466u.f9575o;
            wx4Var.mo3089l(this.f8462q);
            vo6Var = this.f8466u.f9576p;
            io6 io6Var = this.f8464s;
            io6Var.zzf(true);
            vo6Var.m6969b(io6Var.zzl());
            this.f8465t.m23797b(Boolean.TRUE);
        }
    }
}
