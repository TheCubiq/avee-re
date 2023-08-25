package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class ao5 implements sv4, zza, ir4, pq4 {

    /* renamed from: p */
    public final Context f3349p;

    /* renamed from: q */
    public final gj6 f3350q;

    /* renamed from: r */
    public final fi6 f3351r;

    /* renamed from: s */
    public final th6 f3352s;

    /* renamed from: t */
    public final cq5 f3353t;

    /* renamed from: u */
    public Boolean f3354u;

    /* renamed from: v */
    public final boolean f3355v = ((Boolean) zzba.zzc().m23658b(g93.f10760m6)).booleanValue();

    /* renamed from: w */
    public final on6 f3356w;

    /* renamed from: x */
    public final String f3357x;

    public ao5(Context context, gj6 gj6Var, fi6 fi6Var, th6 th6Var, cq5 cq5Var, on6 on6Var, String str) {
        this.f3349p = context;
        this.f3350q = gj6Var;
        this.f3351r = fi6Var;
        this.f3352s = th6Var;
        this.f3353t = cq5Var;
        this.f3356w = on6Var;
        this.f3357x = str;
    }

    @Override // com.daaw.pq4
    /* renamed from: b */
    public final void mo4815b(zze zzeVar) {
        zze zzeVar2;
        if (this.f3355v) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String m21558a = this.f3350q.m21558a(str);
            nn6 m27316c = m27316c("ifts");
            m27316c.m14954a("reason", "adapter");
            if (i >= 0) {
                m27316c.m14954a("arec", String.valueOf(i));
            }
            if (m21558a != null) {
                m27316c.m14954a("areec", m21558a);
            }
            this.f3356w.mo7889a(m27316c);
        }
    }

    /* renamed from: c */
    public final nn6 m27316c(String str) {
        nn6 m14953b = nn6.m14953b(str);
        m14953b.m14947h(this.f3351r, null);
        m14953b.m14949f(this.f3352s);
        m14953b.m14954a("request_id", this.f3357x);
        if (!this.f3352s.f27716u.isEmpty()) {
            m14953b.m14954a("ancn", (String) this.f3352s.f27716u.get(0));
        }
        if (this.f3352s.f27701k0) {
            m14953b.m14954a("device_connectivity", true != zzt.zzo().m11899x(this.f3349p) ? "offline" : "online");
            m14953b.m14954a("event_timestamp", String.valueOf(zzt.zzB().mo15860a()));
            m14953b.m14954a("offline_ad", "1");
        }
        return m14953b;
    }

    /* renamed from: e */
    public final void m27315e(nn6 nn6Var) {
        if (!this.f3352s.f27701k0) {
            this.f3356w.mo7889a(nn6Var);
            return;
        }
        this.f3353t.m25118u(new eq5(zzt.zzB().mo15860a(), this.f3351r.f9624b.f8508b.f31252b, this.f3356w.mo7888b(nn6Var), 2));
    }

    /* renamed from: f */
    public final boolean m27314f() {
        if (this.f3354u == null) {
            synchronized (this) {
                if (this.f3354u == null) {
                    String str = (String) zzba.zzc().m23658b(g93.f10755m1);
                    zzt.zzp();
                    String zzo = zzs.zzo(this.f3349p);
                    boolean z = false;
                    if (str != null && zzo != null) {
                        try {
                            z = Pattern.matches(str, zzo);
                        } catch (RuntimeException e) {
                            zzt.zzo().m11902u(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f3354u = Boolean.valueOf(z);
                }
            }
        }
        return this.f3354u.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.f3352s.f27701k0) {
            m27315e(m27316c("click"));
        }
    }

    @Override // com.daaw.pq4
    /* renamed from: s */
    public final void mo4814s(b15 b15Var) {
        if (this.f3355v) {
            nn6 m27316c = m27316c("ifts");
            m27316c.m14954a("reason", "exception");
            if (!TextUtils.isEmpty(b15Var.getMessage())) {
                m27316c.m14954a("msg", b15Var.getMessage());
            }
            this.f3356w.mo7889a(m27316c);
        }
    }

    @Override // com.daaw.pq4
    public final void zzb() {
        if (this.f3355v) {
            on6 on6Var = this.f3356w;
            nn6 m27316c = m27316c("ifts");
            m27316c.m14954a("reason", "blocked");
            on6Var.mo7889a(m27316c);
        }
    }

    @Override // com.daaw.sv4
    public final void zzd() {
        if (m27314f()) {
            this.f3356w.mo7889a(m27316c("adapter_shown"));
        }
    }

    @Override // com.daaw.sv4
    public final void zze() {
        if (m27314f()) {
            this.f3356w.mo7889a(m27316c("adapter_impression"));
        }
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        if (m27314f() || this.f3352s.f27701k0) {
            m27315e(m27316c("impression"));
        }
    }
}
