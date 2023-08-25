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

    /* renamed from: a */
    public final Context f6097a;

    /* renamed from: b */
    public final String f6098b;

    /* renamed from: c */
    public final Map f6099c = new TreeMap();

    /* renamed from: d */
    public String f6100d;

    /* renamed from: e */
    public String f6101e;

    /* renamed from: f */
    public final String f6102f;

    public cq8(Context context, String str) {
        String concat;
        this.f6097a = context.getApplicationContext();
        this.f6098b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + ez1.m22979a(context).m19341f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            k04.zzh("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f6102f = concat;
    }

    /* renamed from: a */
    public final String m25112a() {
        return this.f6102f;
    }

    /* renamed from: b */
    public final String m25111b() {
        return this.f6101e;
    }

    /* renamed from: c */
    public final String m25110c() {
        return this.f6098b;
    }

    /* renamed from: d */
    public final String m25109d() {
        return this.f6100d;
    }

    /* renamed from: e */
    public final Map m25108e() {
        return this.f6099c;
    }

    /* renamed from: f */
    public final void m25107f(zzl zzlVar, zzchu zzchuVar) {
        this.f6100d = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) oa3.f21196c.m16137e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f6101e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f6099c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f6099c.put("SDKVersion", zzchuVar.f36993p);
        if (((Boolean) oa3.f21194a.m16137e()).booleanValue()) {
            try {
                Bundle m22875a = f76.m22875a(this.f6097a, new JSONArray((String) oa3.f21195b.m16137e()));
                for (String str3 : m22875a.keySet()) {
                    this.f6099c.put(str3, m22875a.get(str3).toString());
                }
            } catch (JSONException e) {
                k04.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
            }
        }
    }
}
