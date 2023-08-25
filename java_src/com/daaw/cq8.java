package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class cq8 {
    public final Context a;
    public final String b;
    public final Map c = new TreeMap();
    public String d;
    public String e;
    public final String f;

    public cq8(Context context, String str) {
        String concat;
        this.a = context.getApplicationContext();
        this.b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + ez1.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            k04.zzh("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f = concat;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final Map e() {
        return this.c;
    }

    public final void f(zzl zzlVar, zzchu zzchuVar) {
        this.d = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) oa3.c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.c.put("SDKVersion", zzchuVar.p);
        if (((Boolean) oa3.a.e()).booleanValue()) {
            try {
                Bundle a = f76.a(this.a, new JSONArray((String) oa3.b.e()));
                for (String str3 : a.keySet()) {
                    this.c.put(str3, a.get(str3).toString());
                }
            } catch (JSONException e) {
                k04.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
            }
        }
    }
}
