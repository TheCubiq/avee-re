package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ie4 extends zzcn {
    public final kj6 A;
    @GuardedBy("this")
    public boolean B = false;
    public final Context p;
    public final zzchu q;
    public final ya5 r;
    public final sq5 s;
    public final px5 t;
    public final fg5 u;
    public final ky3 v;
    public final db5 w;
    public final dh5 x;
    public final yb3 y;
    public final vo6 z;

    public ie4(Context context, zzchu zzchuVar, ya5 ya5Var, sq5 sq5Var, px5 px5Var, fg5 fg5Var, ky3 ky3Var, db5 db5Var, dh5 dh5Var, yb3 yb3Var, vo6 vo6Var, kj6 kj6Var) {
        this.p = context;
        this.q = zzchuVar;
        this.r = ya5Var;
        this.s = sq5Var;
        this.t = px5Var;
        this.u = fg5Var;
        this.v = ky3Var;
        this.w = db5Var;
        this.x = dh5Var;
        this.y = yb3Var;
        this.z = vo6Var;
        this.A = kj6Var;
    }

    public final void g3(Runnable runnable) {
        ry0.e("Adapters must be initialized on the main thread.");
        Map e = zzt.zzo().h().zzh().e();
        if (e.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                k04.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.r.d()) {
            HashMap hashMap = new HashMap();
            for (vm3 vm3Var : e.values()) {
                for (um3 um3Var : vm3Var.a) {
                    String str = um3Var.k;
                    for (String str2 : um3Var.c) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    tq5 a = this.s.a(str3, jSONObject);
                    if (a != null) {
                        oj6 oj6Var = (oj6) a.b;
                        if (!oj6Var.c() && oj6Var.b()) {
                            oj6Var.o(this.p, (zs5) a.c, (List) entry.getValue());
                            k04.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (wi6 e2) {
                    k04.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e2);
                }
            }
        }
    }

    public final /* synthetic */ void k() {
        this.y.a(new jt3());
    }

    public final void zzb() {
        if (zzt.zzo().h().zzO()) {
            if (zzt.zzs().zzj(this.p, zzt.zzo().h().zzl(), this.q.p)) {
                return;
            }
            zzt.zzo().h().zzB(false);
            zzt.zzo().h().zzA("");
        }
    }

    public final /* synthetic */ void zzd() {
        wj6.b(this.p, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.q.p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return this.u.g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.t.f(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.u.l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
        try {
            lv6.j(this.p).o(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.B) {
            k04.zzj("Mobile ads is initialized already.");
            return;
        }
        g93.c(this.p);
        zzt.zzo().s(this.p, this.q);
        zzt.zzc().i(this.p);
        this.B = true;
        this.u.r();
        this.t.d();
        if (((Boolean) zzba.zzc().b(g93.w3)).booleanValue()) {
            this.w.c();
        }
        this.x.g();
        if (((Boolean) zzba.zzc().b(g93.m8)).booleanValue()) {
            z04.a.execute(new Runnable() { // from class: com.daaw.ee4
                @Override // java.lang.Runnable
                public final void run() {
                    ie4.this.zzb();
                }
            });
        }
        if (((Boolean) zzba.zzc().b(g93.b9)).booleanValue()) {
            z04.a.execute(new Runnable() { // from class: com.daaw.be4
                @Override // java.lang.Runnable
                public final void run() {
                    ie4.this.k();
                }
            });
        }
        if (((Boolean) zzba.zzc().b(g93.t2)).booleanValue()) {
            z04.a.execute(new Runnable() { // from class: com.daaw.fe4
                @Override // java.lang.Runnable
                public final void run() {
                    ie4.this.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, yd0 yd0Var) {
        String str2;
        Runnable runnable;
        g93.c(this.p);
        if (((Boolean) zzba.zzc().b(g93.A3)).booleanValue()) {
            zzt.zzp();
            str2 = zzs.zzo(this.p);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) zzba.zzc().b(g93.v3)).booleanValue();
        y83 y83Var = g93.K0;
        boolean booleanValue2 = booleanValue | ((Boolean) zzba.zzc().b(y83Var)).booleanValue();
        if (((Boolean) zzba.zzc().b(y83Var)).booleanValue()) {
            final Runnable runnable2 = (Runnable) nt0.M(yd0Var);
            runnable = new Runnable() { // from class: com.daaw.ge4
                @Override // java.lang.Runnable
                public final void run() {
                    final ie4 ie4Var = ie4.this;
                    final Runnable runnable3 = runnable2;
                    z04.e.execute(new Runnable() { // from class: com.daaw.he4
                        @Override // java.lang.Runnable
                        public final void run() {
                            ie4.this.g3(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = booleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            zzt.zza().zza(this.p, this.q, str3, runnable3, this.z);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        this.x.h(zzdaVar, ch5.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(yd0 yd0Var, String str) {
        if (yd0Var == null) {
            k04.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) nt0.M(yd0Var);
        if (context == null) {
            k04.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzas zzasVar = new zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.q.p);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(an3 an3Var) {
        this.A.e(an3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z) {
        zzt.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f) {
        zzt.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        g93.c(this.p);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzba.zzc().b(g93.v3)).booleanValue()) {
                zzt.zza().zza(this.p, this.q, str, null, this.z);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(gj3 gj3Var) {
        this.u.s(gj3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) zzba.zzc().b(g93.v8)).booleanValue()) {
            zzt.zzo().w(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        this.v.v(this.p, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return zzt.zzr().zze();
    }
}
