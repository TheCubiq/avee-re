package com.daaw;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class qm2 implements eu6 {
    public final js6 a;
    public final at6 b;
    public final en2 c;
    public final pm2 d;
    public final wl2 e;
    public final gn2 f;
    public final xm2 g;

    public qm2(js6 js6Var, at6 at6Var, en2 en2Var, pm2 pm2Var, wl2 wl2Var, gn2 gn2Var, xm2 xm2Var) {
        this.a = js6Var;
        this.b = at6Var;
        this.c = en2Var;
        this.d = pm2Var;
        this.e = wl2Var;
        this.f = gn2Var;
        this.g = xm2Var;
    }

    public final void a(View view) {
        this.c.d(view);
    }

    public final Map b() {
        HashMap hashMap = new HashMap();
        fj2 b = this.b.b();
        hashMap.put("v", this.a.b());
        hashMap.put("gms", Boolean.valueOf(this.a.c()));
        hashMap.put("int", b.J0());
        hashMap.put("up", Boolean.valueOf(this.d.a()));
        hashMap.put("t", new Throwable());
        xm2 xm2Var = this.g;
        if (xm2Var != null) {
            hashMap.put("tcq", Long.valueOf(xm2Var.c()));
            hashMap.put("tpq", Long.valueOf(this.g.g()));
            hashMap.put("tcv", Long.valueOf(this.g.d()));
            hashMap.put("tpv", Long.valueOf(this.g.h()));
            hashMap.put("tchv", Long.valueOf(this.g.b()));
            hashMap.put("tphv", Long.valueOf(this.g.f()));
            hashMap.put("tcc", Long.valueOf(this.g.a()));
            hashMap.put("tpc", Long.valueOf(this.g.e()));
        }
        return hashMap;
    }

    @Override // com.daaw.eu6
    public final Map zza() {
        Map b = b();
        b.put("lts", Long.valueOf(this.c.a()));
        return b;
    }

    @Override // com.daaw.eu6
    public final Map zzb() {
        Map b = b();
        fj2 a = this.b.a();
        b.put("gai", Boolean.valueOf(this.a.d()));
        b.put("did", a.I0());
        b.put("dst", Integer.valueOf(a.x0() - 1));
        b.put("doo", Boolean.valueOf(a.u0()));
        wl2 wl2Var = this.e;
        if (wl2Var != null) {
            b.put("nt", Long.valueOf(wl2Var.a()));
        }
        gn2 gn2Var = this.f;
        if (gn2Var != null) {
            b.put("vs", Long.valueOf(gn2Var.c()));
            b.put("vf", Long.valueOf(this.f.b()));
        }
        return b;
    }

    @Override // com.daaw.eu6
    public final Map zzc() {
        return b();
    }
}
