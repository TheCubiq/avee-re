package com.daaw;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class vg4 {

    /* renamed from: a */
    public final String f30197a;

    /* renamed from: b */
    public final jm3 f30198b;

    /* renamed from: c */
    public final Executor f30199c;

    /* renamed from: d */
    public ah4 f30200d;

    /* renamed from: e */
    public final zg3 f30201e = new sg4(this);

    /* renamed from: f */
    public final zg3 f30202f = new ug4(this);

    public vg4(String str, jm3 jm3Var, Executor executor) {
        this.f30197a = str;
        this.f30198b = jm3Var;
        this.f30199c = executor;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m7182g(vg4 vg4Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(vg4Var.f30197a);
    }

    /* renamed from: c */
    public final void m7186c(ah4 ah4Var) {
        this.f30198b.m18411b("/updateActiveView", this.f30201e);
        this.f30198b.m18411b("/untrackActiveViewUnit", this.f30202f);
        this.f30200d = ah4Var;
    }

    /* renamed from: d */
    public final void m7185d(a74 a74Var) {
        a74Var.mo6392y("/updateActiveView", this.f30201e);
        a74Var.mo6392y("/untrackActiveViewUnit", this.f30202f);
    }

    /* renamed from: e */
    public final void m7184e() {
        this.f30198b.m18410c("/updateActiveView", this.f30201e);
        this.f30198b.m18410c("/untrackActiveViewUnit", this.f30202f);
    }

    /* renamed from: f */
    public final void m7183f(a74 a74Var) {
        a74Var.mo6394x("/updateActiveView", this.f30201e);
        a74Var.mo6394x("/untrackActiveViewUnit", this.f30202f);
    }
}
