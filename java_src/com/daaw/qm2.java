package com.daaw;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class qm2 implements eu6 {

    /* renamed from: a */
    public final js6 f24183a;

    /* renamed from: b */
    public final at6 f24184b;

    /* renamed from: c */
    public final en2 f24185c;

    /* renamed from: d */
    public final pm2 f24186d;

    /* renamed from: e */
    public final wl2 f24187e;

    /* renamed from: f */
    public final gn2 f24188f;

    /* renamed from: g */
    public final xm2 f24189g;

    public qm2(js6 js6Var, at6 at6Var, en2 en2Var, pm2 pm2Var, wl2 wl2Var, gn2 gn2Var, xm2 xm2Var) {
        this.f24183a = js6Var;
        this.f24184b = at6Var;
        this.f24185c = en2Var;
        this.f24186d = pm2Var;
        this.f24187e = wl2Var;
        this.f24188f = gn2Var;
        this.f24189g = xm2Var;
    }

    /* renamed from: a */
    public final void m12336a(View view) {
        this.f24185c.m23351d(view);
    }

    /* renamed from: b */
    public final Map m12335b() {
        HashMap hashMap = new HashMap();
        fj2 m27040b = this.f24184b.m27040b();
        hashMap.put("v", this.f24183a.mo14843b());
        hashMap.put("gms", Boolean.valueOf(this.f24183a.mo14842c()));
        hashMap.put("int", m27040b.m22593J0());
        hashMap.put("up", Boolean.valueOf(this.f24186d.m13288a()));
        hashMap.put("t", new Throwable());
        xm2 xm2Var = this.f24189g;
        if (xm2Var != null) {
            hashMap.put("tcq", Long.valueOf(xm2Var.m5001c()));
            hashMap.put("tpq", Long.valueOf(this.f24189g.m4997g()));
            hashMap.put("tcv", Long.valueOf(this.f24189g.m5000d()));
            hashMap.put("tpv", Long.valueOf(this.f24189g.m4996h()));
            hashMap.put("tchv", Long.valueOf(this.f24189g.m5002b()));
            hashMap.put("tphv", Long.valueOf(this.f24189g.m4998f()));
            hashMap.put("tcc", Long.valueOf(this.f24189g.m5003a()));
            hashMap.put("tpc", Long.valueOf(this.f24189g.m4999e()));
        }
        return hashMap;
    }

    @Override // com.daaw.eu6
    public final Map zza() {
        Map m12335b = m12335b();
        m12335b.put("lts", Long.valueOf(this.f24185c.m23354a()));
        return m12335b;
    }

    @Override // com.daaw.eu6
    public final Map zzb() {
        Map m12335b = m12335b();
        fj2 m27041a = this.f24184b.m27041a();
        m12335b.put("gai", Boolean.valueOf(this.f24183a.mo14841d()));
        m12335b.put("did", m27041a.m22594I0());
        m12335b.put("dst", Integer.valueOf(m27041a.m22536x0() - 1));
        m12335b.put("doo", Boolean.valueOf(m27041a.m22539u0()));
        wl2 wl2Var = this.f24187e;
        if (wl2Var != null) {
            m12335b.put("nt", Long.valueOf(wl2Var.m6016a()));
        }
        gn2 gn2Var = this.f24188f;
        if (gn2Var != null) {
            m12335b.put("vs", Long.valueOf(gn2Var.m21438c()));
            m12335b.put("vf", Long.valueOf(this.f24188f.m21439b()));
        }
        return m12335b;
    }

    @Override // com.daaw.eu6
    public final Map zzc() {
        return m12335b();
    }
}
