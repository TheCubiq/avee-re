package com.daaw;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbyi;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ya5 {

    /* renamed from: a */
    public final kj6 f33462a;

    /* renamed from: b */
    public final sa5 f33463b;

    public ya5(kj6 kj6Var, sa5 sa5Var) {
        this.f33462a = kj6Var;
        this.f33463b = sa5Var;
    }

    /* renamed from: a */
    public final an3 m3952a() {
        an3 m17698b = this.f33462a.m17698b();
        if (m17698b != null) {
            return m17698b;
        }
        k04.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: b */
    public final dp3 m3951b(String str) {
        dp3 mo3507m = m3952a().mo3507m(str);
        this.f33463b.m10476e(str, mo3507m);
        return mo3507m;
    }

    /* renamed from: c */
    public final oj6 m3950c(String str, JSONObject jSONObject) {
        dn3 zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new do3(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new do3(new zzbyi());
            } else {
                an3 m3952a = m3952a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = m3952a.mo3509a(string) ? m3952a.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : m3952a.mo3508l(string) ? m3952a.zzb(string) : m3952a.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        k04.zzh("Invalid custom event.", e);
                    }
                }
                zzb = m3952a.zzb(str);
            }
            oj6 oj6Var = new oj6(zzb);
            this.f33463b.m10477d(str, oj6Var);
            return oj6Var;
        } catch (Throwable th) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10828s8)).booleanValue()) {
                this.f33463b.m10477d(str, null);
            }
            throw new wi6(th);
        }
    }

    /* renamed from: d */
    public final boolean m3949d() {
        return this.f33462a.m17698b() != null;
    }
}
