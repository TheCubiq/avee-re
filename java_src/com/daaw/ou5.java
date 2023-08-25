package com.daaw;

import android.os.Bundle;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class ou5 extends nu5 {

    /* renamed from: a */
    public final b94 f22021a;

    /* renamed from: b */
    public final sp4 f22022b;

    /* renamed from: c */
    public final cx5 f22023c;

    /* renamed from: d */
    public final pw4 f22024d;

    /* renamed from: e */
    public final l15 f22025e;

    /* renamed from: f */
    public final jt4 f22026f;

    /* renamed from: g */
    public final ViewGroup f22027g;

    /* renamed from: h */
    public final wv4 f22028h;

    public ou5(b94 b94Var, sp4 sp4Var, cx5 cx5Var, pw4 pw4Var, l15 l15Var, jt4 jt4Var, ViewGroup viewGroup, wv4 wv4Var) {
        this.f22021a = b94Var;
        this.f22022b = sp4Var;
        this.f22023c = cx5Var;
        this.f22024d = pw4Var;
        this.f22025e = l15Var;
        this.f22026f = jt4Var;
        this.f22027g = viewGroup;
        this.f22028h = wv4Var;
    }

    @Override // com.daaw.nu5
    /* renamed from: c */
    public final f77 mo9850c(ri6 ri6Var, Bundle bundle) {
        yj4 mo26265j = this.f22021a.mo26265j();
        sp4 sp4Var = this.f22022b;
        sp4Var.m10063f(ri6Var);
        sp4Var.m10065d(bundle);
        mo26265j.mo3644n(sp4Var.m10062g());
        mo26265j.mo3645k(this.f22024d);
        mo26265j.mo3643o(this.f22023c);
        mo26265j.mo3647d(this.f22025e);
        mo26265j.mo3646i(new rl4(this.f22026f, this.f22028h));
        mo26265j.mo3648c(new wi4(this.f22027g));
        jn4 mo2199d = mo26265j.zzj().mo2199d();
        return mo2199d.m18383i(mo2199d.m18382j());
    }
}
