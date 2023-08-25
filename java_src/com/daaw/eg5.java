package com.daaw;

import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class eg5 extends cj3 {
    public final /* synthetic */ Object p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ io6 s;
    public final /* synthetic */ e14 t;
    public final /* synthetic */ fg5 u;

    public eg5(fg5 fg5Var, Object obj, String str, long j, io6 io6Var, e14 e14Var) {
        this.u = fg5Var;
        this.p = obj;
        this.q = str;
        this.r = j;
        this.s = io6Var;
        this.t = e14Var;
    }

    @Override // com.daaw.dj3
    public final void a(String str) {
        td5 td5Var;
        wx4 wx4Var;
        vo6 vo6Var;
        synchronized (this.p) {
            this.u.v(this.q, false, str, (int) (zzt.zzB().b() - this.r));
            td5Var = this.u.l;
            td5Var.b(this.q, "error");
            wx4Var = this.u.o;
            wx4Var.c(this.q, "error");
            vo6Var = this.u.p;
            io6 io6Var = this.s;
            io6Var.m(str);
            io6Var.zzf(false);
            vo6Var.b(io6Var.zzl());
            this.t.b(Boolean.FALSE);
        }
    }

    @Override // com.daaw.dj3
    public final void zzf() {
        td5 td5Var;
        wx4 wx4Var;
        vo6 vo6Var;
        synchronized (this.p) {
            this.u.v(this.q, true, "", (int) (zzt.zzB().b() - this.r));
            td5Var = this.u.l;
            td5Var.d(this.q);
            wx4Var = this.u.o;
            wx4Var.l(this.q);
            vo6Var = this.u.p;
            io6 io6Var = this.s;
            io6Var.zzf(true);
            vo6Var.b(io6Var.zzl());
            this.t.b(Boolean.TRUE);
        }
    }
}
