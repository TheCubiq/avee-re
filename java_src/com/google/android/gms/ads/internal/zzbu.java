package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
final class zzbu {
    private final String zzabb;
    private final Map<String, String> zzabc = new TreeMap();
    private String zzabd;
    private String zzabe;

    public zzbu(String str) {
        this.zzabb = str;
    }

    public final String getQuery() {
        return this.zzabd;
    }

    public final void zza(zzjj zzjjVar, zzang zzangVar) {
        this.zzabd = zzjjVar.zzaqd.zzatn;
        Bundle bundle = zzjjVar.zzaqg != null ? zzjjVar.zzaqg.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle == null) {
            return;
        }
        String str = (String) zzkb.zzik().zzd(zznk.zzbda);
        for (String str2 : bundle.keySet()) {
            if (str.equals(str2)) {
                this.zzabe = bundle.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.zzabc.put(str2.substring(4), bundle.getString(str2));
            }
        }
        this.zzabc.put("SDKVersion", zzangVar.zzcw);
    }

    public final String zzec() {
        return this.zzabe;
    }

    public final String zzed() {
        return this.zzabb;
    }

    public final Map<String, String> zzee() {
        return this.zzabc;
    }
}
