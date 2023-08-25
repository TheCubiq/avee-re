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
    public final Context p;
    public final gj6 q;
    public final fi6 r;
    public final th6 s;
    public final cq5 t;
    public Boolean u;
    public final boolean v = ((Boolean) zzba.zzc().b(g93.m6)).booleanValue();
    public final on6 w;
    public final String x;

    public ao5(Context context, gj6 gj6Var, fi6 fi6Var, th6 th6Var, cq5 cq5Var, on6 on6Var, String str) {
        this.p = context;
        this.q = gj6Var;
        this.r = fi6Var;
        this.s = th6Var;
        this.t = cq5Var;
        this.w = on6Var;
        this.x = str;
    }

    @Override // com.daaw.pq4
    public final void b(zze zzeVar) {
        zze zzeVar2;
        if (this.v) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String a = this.q.a(str);
            nn6 c = c("ifts");
            c.a("reason", "adapter");
            if (i >= 0) {
                c.a("arec", String.valueOf(i));
            }
            if (a != null) {
                c.a("areec", a);
            }
            this.w.a(c);
        }
    }

    public final nn6 c(String str) {
        nn6 b = nn6.b(str);
        b.h(this.r, null);
        b.f(this.s);
        b.a("request_id", this.x);
        if (!this.s.u.isEmpty()) {
            b.a("ancn", (String) this.s.u.get(0));
        }
        if (this.s.k0) {
            b.a("device_connectivity", true != zzt.zzo().x(this.p) ? "offline" : "online");
            b.a("event_timestamp", String.valueOf(zzt.zzB().a()));
            b.a("offline_ad", "1");
        }
        return b;
    }

    public final void e(nn6 nn6Var) {
        if (!this.s.k0) {
            this.w.a(nn6Var);
            return;
        }
        this.t.u(new eq5(zzt.zzB().a(), this.r.b.b.b, this.w.b(nn6Var), 2));
    }

    public final boolean f() {
        if (this.u == null) {
            synchronized (this) {
                if (this.u == null) {
                    String str = (String) zzba.zzc().b(g93.m1);
                    zzt.zzp();
                    String zzo = zzs.zzo(this.p);
                    boolean z = false;
                    if (str != null && zzo != null) {
                        try {
                            z = Pattern.matches(str, zzo);
                        } catch (RuntimeException e) {
                            zzt.zzo().u(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.u = Boolean.valueOf(z);
                }
            }
        }
        return this.u.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.s.k0) {
            e(c("click"));
        }
    }

    @Override // com.daaw.pq4
    public final void s(b15 b15Var) {
        if (this.v) {
            nn6 c = c("ifts");
            c.a("reason", "exception");
            if (!TextUtils.isEmpty(b15Var.getMessage())) {
                c.a("msg", b15Var.getMessage());
            }
            this.w.a(c);
        }
    }

    @Override // com.daaw.pq4
    public final void zzb() {
        if (this.v) {
            on6 on6Var = this.w;
            nn6 c = c("ifts");
            c.a("reason", "blocked");
            on6Var.a(c);
        }
    }

    @Override // com.daaw.sv4
    public final void zzd() {
        if (f()) {
            this.w.a(c("adapter_shown"));
        }
    }

    @Override // com.daaw.sv4
    public final void zze() {
        if (f()) {
            this.w.a(c("adapter_impression"));
        }
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        if (f() || this.s.k0) {
            e(c("impression"));
        }
    }
}
