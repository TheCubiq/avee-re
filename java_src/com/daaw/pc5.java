package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class pc5 implements sv4, zza, ir4, pq4 {

    /* renamed from: p */
    public final Context f22835p;

    /* renamed from: q */
    public final gj6 f22836q;

    /* renamed from: r */
    public final kd5 f22837r;

    /* renamed from: s */
    public final fi6 f22838s;

    /* renamed from: t */
    public final th6 f22839t;

    /* renamed from: u */
    public final cq5 f22840u;

    /* renamed from: v */
    public Boolean f22841v;

    /* renamed from: w */
    public final boolean f22842w = ((Boolean) zzba.zzc().m23658b(g93.f10760m6)).booleanValue();

    public pc5(Context context, gj6 gj6Var, kd5 kd5Var, fi6 fi6Var, th6 th6Var, cq5 cq5Var) {
        this.f22835p = context;
        this.f22836q = gj6Var;
        this.f22837r = kd5Var;
        this.f22838s = fi6Var;
        this.f22839t = th6Var;
        this.f22840u = cq5Var;
    }

    @Override // com.daaw.pq4
    /* renamed from: b */
    public final void mo4815b(zze zzeVar) {
        zze zzeVar2;
        if (this.f22842w) {
            jd5 m13449c = m13449c("ifts");
            m13449c.m18590b("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                m13449c.m18590b("arec", String.valueOf(i));
            }
            String m21558a = this.f22836q.m21558a(str);
            if (m21558a != null) {
                m13449c.m18590b("areec", m21558a);
            }
            m13449c.m18585g();
        }
    }

    /* renamed from: c */
    public final jd5 m13449c(String str) {
        jd5 m17776a = this.f22837r.m17776a();
        m17776a.m18587e(this.f22838s.f9624b.f8508b);
        m17776a.m18588d(this.f22839t);
        m17776a.m18590b("action", str);
        if (!this.f22839t.f27716u.isEmpty()) {
            m17776a.m18590b("ancn", (String) this.f22839t.f27716u.get(0));
        }
        if (this.f22839t.f27701k0) {
            m17776a.m18590b("device_connectivity", true != zzt.zzo().m11899x(this.f22835p) ? "offline" : "online");
            m17776a.m18590b("event_timestamp", String.valueOf(zzt.zzB().mo15860a()));
            m17776a.m18590b("offline_ad", "1");
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10859v6)).booleanValue()) {
            boolean z = zzf.zze(this.f22838s.f9623a.f5824a) != 1;
            m17776a.m18590b("scar", String.valueOf(z));
            if (z) {
                zzl zzlVar = this.f22838s.f9623a.f5824a.f25344d;
                m17776a.m18589c("ragent", zzlVar.zzp);
                m17776a.m18589c("rtype", zzf.zza(zzf.zzb(zzlVar)));
            }
        }
        return m17776a;
    }

    /* renamed from: e */
    public final void m13448e(jd5 jd5Var) {
        if (!this.f22839t.f27701k0) {
            jd5Var.m18585g();
            return;
        }
        this.f22840u.m25118u(new eq5(zzt.zzB().mo15860a(), this.f22838s.f9624b.f8508b.f31252b, jd5Var.m18586f(), 2));
    }

    /* renamed from: f */
    public final boolean m13447f() {
        if (this.f22841v == null) {
            synchronized (this) {
                if (this.f22841v == null) {
                    String str = (String) zzba.zzc().m23658b(g93.f10755m1);
                    zzt.zzp();
                    String zzo = zzs.zzo(this.f22835p);
                    boolean z = false;
                    if (str != null && zzo != null) {
                        try {
                            z = Pattern.matches(str, zzo);
                        } catch (RuntimeException e) {
                            zzt.zzo().m11902u(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f22841v = Boolean.valueOf(z);
                }
            }
        }
        return this.f22841v.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.f22839t.f27701k0) {
            m13448e(m13449c("click"));
        }
    }

    @Override // com.daaw.pq4
    /* renamed from: s */
    public final void mo4814s(b15 b15Var) {
        if (this.f22842w) {
            jd5 m13449c = m13449c("ifts");
            m13449c.m18590b("reason", "exception");
            if (!TextUtils.isEmpty(b15Var.getMessage())) {
                m13449c.m18590b("msg", b15Var.getMessage());
            }
            m13449c.m18585g();
        }
    }

    @Override // com.daaw.pq4
    public final void zzb() {
        if (this.f22842w) {
            jd5 m13449c = m13449c("ifts");
            m13449c.m18590b("reason", "blocked");
            m13449c.m18585g();
        }
    }

    @Override // com.daaw.sv4
    public final void zzd() {
        if (m13447f()) {
            m13449c("adapter_shown").m18585g();
        }
    }

    @Override // com.daaw.sv4
    public final void zze() {
        if (m13447f()) {
            m13449c("adapter_impression").m18585g();
        }
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        if (m13447f() || this.f22839t.f27701k0) {
            m13448e(m13449c("impression"));
        }
    }
}
