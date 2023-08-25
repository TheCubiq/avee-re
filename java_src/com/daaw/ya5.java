package com.daaw;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbyi;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ya5 {
    public final kj6 a;
    public final sa5 b;

    public ya5(kj6 kj6Var, sa5 sa5Var) {
        this.a = kj6Var;
        this.b = sa5Var;
    }

    public final an3 a() {
        an3 b = this.a.b();
        if (b != null) {
            return b;
        }
        k04.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final dp3 b(String str) {
        dp3 m = a().m(str);
        this.b.e(str, m);
        return m;
    }

    public final oj6 c(String str, JSONObject jSONObject) {
        dn3 zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new do3(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new do3(new zzbyi());
            } else {
                an3 a = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = a.a(string) ? a.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : a.l(string) ? a.zzb(string) : a.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        k04.zzh("Invalid custom event.", e);
                    }
                }
                zzb = a.zzb(str);
            }
            oj6 oj6Var = new oj6(zzb);
            this.b.d(str, oj6Var);
            return oj6Var;
        } catch (Throwable th) {
            if (((Boolean) zzba.zzc().b(g93.s8)).booleanValue()) {
                this.b.d(str, null);
            }
            throw new wi6(th);
        }
    }

    public final boolean d() {
        return this.a.b() != null;
    }
}
