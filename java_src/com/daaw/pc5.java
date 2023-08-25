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
    public final Context p;
    public final gj6 q;
    public final kd5 r;
    public final fi6 s;
    public final th6 t;
    public final cq5 u;
    public Boolean v;
    public final boolean w = ((Boolean) zzba.zzc().b(g93.m6)).booleanValue();

    public pc5(Context context, gj6 gj6Var, kd5 kd5Var, fi6 fi6Var, th6 th6Var, cq5 cq5Var) {
        this.p = context;
        this.q = gj6Var;
        this.r = kd5Var;
        this.s = fi6Var;
        this.t = th6Var;
        this.u = cq5Var;
    }

    @Override // com.daaw.pq4
    public final void b(zze zzeVar) {
        zze zzeVar2;
        if (this.w) {
            jd5 c = c("ifts");
            c.b("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                c.b("arec", String.valueOf(i));
            }
            String a = this.q.a(str);
            if (a != null) {
                c.b("areec", a);
            }
            c.g();
        }
    }

    public final jd5 c(String str) {
        jd5 a = this.r.a();
        a.e(this.s.b.b);
        a.d(this.t);
        a.b("action", str);
        if (!this.t.u.isEmpty()) {
            a.b("ancn", (String) this.t.u.get(0));
        }
        if (this.t.k0) {
            a.b("device_connectivity", true != zzt.zzo().x(this.p) ? "offline" : "online");
            a.b("event_timestamp", String.valueOf(zzt.zzB().a()));
            a.b("offline_ad", "1");
        }
        if (((Boolean) zzba.zzc().b(g93.v6)).booleanValue()) {
            boolean z = zzf.zze(this.s.a.a) != 1;
            a.b("scar", String.valueOf(z));
            if (z) {
                zzl zzlVar = this.s.a.a.d;
                a.c("ragent", zzlVar.zzp);
                a.c("rtype", zzf.zza(zzf.zzb(zzlVar)));
            }
        }
        return a;
    }

    public final void e(jd5 jd5Var) {
        if (!this.t.k0) {
            jd5Var.g();
            return;
        }
        this.u.u(new eq5(zzt.zzB().a(), this.s.b.b.b, jd5Var.f(), 2));
    }

    public final boolean f() {
        if (this.v == null) {
            synchronized (this) {
                if (this.v == null) {
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
                    this.v = Boolean.valueOf(z);
                }
            }
        }
        return this.v.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.t.k0) {
            e(c("click"));
        }
    }

    @Override // com.daaw.pq4
    public final void s(b15 b15Var) {
        if (this.w) {
            jd5 c = c("ifts");
            c.b("reason", "exception");
            if (!TextUtils.isEmpty(b15Var.getMessage())) {
                c.b("msg", b15Var.getMessage());
            }
            c.g();
        }
    }

    @Override // com.daaw.pq4
    public final void zzb() {
        if (this.w) {
            jd5 c = c("ifts");
            c.b("reason", "blocked");
            c.g();
        }
    }

    @Override // com.daaw.sv4
    public final void zzd() {
        if (f()) {
            c("adapter_shown").g();
        }
    }

    @Override // com.daaw.sv4
    public final void zze() {
        if (f()) {
            c("adapter_impression").g();
        }
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        if (f() || this.t.k0) {
            e(c("impression"));
        }
    }
}
