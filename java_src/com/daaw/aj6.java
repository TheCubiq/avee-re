package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class aj6 {

    /* renamed from: a */
    public final th6 f3228a;

    /* renamed from: b */
    public final wh6 f3229b;

    /* renamed from: c */
    public final cq5 f3230c;

    /* renamed from: d */
    public final op6 f3231d;

    /* renamed from: e */
    public final to6 f3232e;

    public aj6(cq5 cq5Var, op6 op6Var, th6 th6Var, wh6 wh6Var, to6 to6Var) {
        this.f3228a = th6Var;
        this.f3229b = wh6Var;
        this.f3230c = cq5Var;
        this.f3231d = op6Var;
        this.f3232e = to6Var;
    }

    /* renamed from: a */
    public final void m27441a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m27440b((String) it.next(), 2);
        }
    }

    /* renamed from: b */
    public final void m27440b(String str, int i) {
        if (!this.f3228a.f27701k0) {
            this.f3231d.m14098c(str, this.f3232e);
            return;
        }
        this.f3230c.m25118u(new eq5(zzt.zzB().mo15860a(), this.f3229b.f31252b, str, i));
    }

    /* renamed from: c */
    public final void m27439c(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m27440b((String) it.next(), i);
        }
    }
}
