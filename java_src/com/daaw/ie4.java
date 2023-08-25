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

    /* renamed from: A */
    public final kj6 f13566A;
    @GuardedBy("this")

    /* renamed from: B */
    public boolean f13567B = false;

    /* renamed from: p */
    public final Context f13568p;

    /* renamed from: q */
    public final zzchu f13569q;

    /* renamed from: r */
    public final ya5 f13570r;

    /* renamed from: s */
    public final sq5 f13571s;

    /* renamed from: t */
    public final px5 f13572t;

    /* renamed from: u */
    public final fg5 f13573u;

    /* renamed from: v */
    public final ky3 f13574v;

    /* renamed from: w */
    public final db5 f13575w;

    /* renamed from: x */
    public final dh5 f13576x;

    /* renamed from: y */
    public final yb3 f13577y;

    /* renamed from: z */
    public final vo6 f13578z;

    public ie4(Context context, zzchu zzchuVar, ya5 ya5Var, sq5 sq5Var, px5 px5Var, fg5 fg5Var, ky3 ky3Var, db5 db5Var, dh5 dh5Var, yb3 yb3Var, vo6 vo6Var, kj6 kj6Var) {
        this.f13568p = context;
        this.f13569q = zzchuVar;
        this.f13570r = ya5Var;
        this.f13571s = sq5Var;
        this.f13572t = px5Var;
        this.f13573u = fg5Var;
        this.f13574v = ky3Var;
        this.f13575w = db5Var;
        this.f13576x = dh5Var;
        this.f13577y = yb3Var;
        this.f13578z = vo6Var;
        this.f13566A = kj6Var;
    }

    /* renamed from: g3 */
    public final void m19880g3(Runnable runnable) {
        ry0.m10835e("Adapters must be initialized on the main thread.");
        Map m17292e = zzt.zzo().m11915h().zzh().m17292e();
        if (m17292e.isEmpty()) {
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
        if (this.f13570r.m3949d()) {
            HashMap hashMap = new HashMap();
            for (vm3 vm3Var : m17292e.values()) {
                for (um3 um3Var : vm3Var.f30321a) {
                    String str = um3Var.f29199k;
                    for (String str2 : um3Var.f29191c) {
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
                    tq5 mo9886a = this.f13571s.mo9886a(str3, jSONObject);
                    if (mo9886a != null) {
                        oj6 oj6Var = (oj6) mo9886a.f27988b;
                        if (!oj6Var.m14243c() && oj6Var.m14244b()) {
                            oj6Var.m14231o(this.f13568p, (zs5) mo9886a.f27989c, (List) entry.getValue());
                            k04.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (wi6 e) {
                    k04.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void m19879k() {
        this.f13577y.m3942a(new jt3());
    }

    public final void zzb() {
        if (zzt.zzo().m11915h().zzO()) {
            if (zzt.zzs().zzj(this.f13568p, zzt.zzo().m11915h().zzl(), this.f13569q.f36993p)) {
                return;
            }
            zzt.zzo().m11915h().zzB(false);
            zzt.zzo().m11915h().zzA("");
        }
    }

    public final /* synthetic */ void zzd() {
        wj6.m6044b(this.f13568p, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.f13569q.f36993p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return this.f13573u.m22683g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.f13572t.m12893f(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.f13573u.m22678l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
        try {
            lv6.m16482j(this.f13568p).m16477o(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.f13567B) {
            k04.zzj("Mobile ads is initialized already.");
            return;
        }
        g93.m21879c(this.f13568p);
        zzt.zzo().m11904s(this.f13568p, this.f13569q);
        zzt.zzc().m21047i(this.f13568p);
        this.f13567B = true;
        this.f13573u.m22672r();
        this.f13572t.m12895d();
        if (((Boolean) zzba.zzc().m23658b(g93.f10867w3)).booleanValue()) {
            this.f13575w.m24565c();
        }
        this.f13576x.m24404g();
        if (((Boolean) zzba.zzc().m23658b(g93.f10762m8)).booleanValue()) {
            z04.f34305a.execute(new Runnable() { // from class: com.daaw.ee4
                @Override // java.lang.Runnable
                public final void run() {
                    ie4.this.zzb();
                }
            });
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10642b9)).booleanValue()) {
            z04.f34305a.execute(new Runnable() { // from class: com.daaw.be4
                @Override // java.lang.Runnable
                public final void run() {
                    ie4.this.m19879k();
                }
            });
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10833t2)).booleanValue()) {
            z04.f34305a.execute(new Runnable() { // from class: com.daaw.fe4
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
        g93.m21879c(this.f13568p);
        if (((Boolean) zzba.zzc().m23658b(g93.f10363A3)).booleanValue()) {
            zzt.zzp();
            str2 = zzs.zzo(this.f13568p);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) zzba.zzc().m23658b(g93.f10856v3)).booleanValue();
        y83 y83Var = g93.f10462K0;
        boolean booleanValue2 = booleanValue | ((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue();
        if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue()) {
            final Runnable runnable2 = (Runnable) nt0.m14831M(yd0Var);
            runnable = new Runnable() { // from class: com.daaw.ge4
                @Override // java.lang.Runnable
                public final void run() {
                    final ie4 ie4Var = ie4.this;
                    final Runnable runnable3 = runnable2;
                    z04.f34309e.execute(new Runnable() { // from class: com.daaw.he4
                        @Override // java.lang.Runnable
                        public final void run() {
                            ie4.this.m19880g3(runnable3);
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
            zzt.zza().zza(this.f13568p, this.f13569q, str3, runnable3, this.f13578z);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        this.f13576x.m24403h(zzdaVar, ch5.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(yd0 yd0Var, String str) {
        if (yd0Var == null) {
            k04.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) nt0.m14831M(yd0Var);
        if (context == null) {
            k04.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzas zzasVar = new zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.f13569q.f36993p);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(an3 an3Var) {
        this.f13566A.m17695e(an3Var);
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
        g93.m21879c(this.f13568p);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10856v3)).booleanValue()) {
                zzt.zza().zza(this.f13568p, this.f13569q, str, null, this.f13578z);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(gj3 gj3Var) {
        this.f13573u.m22671s(gj3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10861v8)).booleanValue()) {
            zzt.zzo().m11900w(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        this.f13574v.m17321v(this.f13568p, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return zzt.zzr().zze();
    }
}
