package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzano;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzpb;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
final class zzbe implements Callable<zzpb> {
    private final /* synthetic */ zzbc zzaaf;
    private final /* synthetic */ int zzaag;
    private final /* synthetic */ JSONArray zzaah;
    private final /* synthetic */ int zzaai;
    private final /* synthetic */ zzaji zzwg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbe(zzbc zzbcVar, int i, JSONArray jSONArray, int i2, zzaji zzajiVar) {
        this.zzaaf = zzbcVar;
        this.zzaag = i;
        this.zzaah = jSONArray;
        this.zzaai = i2;
        this.zzwg = zzajiVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzpb call() throws Exception {
        if (this.zzaag >= this.zzaah.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.zzaah.get(this.zzaag));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        zzbc zzbcVar = new zzbc(this.zzaaf.zzvw.zzrt, this.zzaaf.zzwc, this.zzaaf.zzvw.zzacv, this.zzaaf.zzvw.zzacp, this.zzaaf.zzwh, this.zzaaf.zzvw.zzacr, true);
        zzbc.zza(this.zzaaf.zzvw, zzbcVar.zzvw);
        zzbcVar.zzdq();
        zzbcVar.zza(this.zzaaf.zzvs);
        zznx zznxVar = zzbcVar.zzvr;
        int i = this.zzaag;
        zznxVar.zze("num_ads_requested", String.valueOf(this.zzaai));
        zznxVar.zze("ad_index", String.valueOf(i));
        zzaef zzaefVar = this.zzwg.zzcgs;
        String jSONObject2 = jSONObject.toString();
        Bundle bundle = zzaefVar.zzccv.extras != null ? new Bundle(zzaefVar.zzccv.extras) : new Bundle();
        bundle.putString("_ad", jSONObject2);
        zzbcVar.zza(new zzaeg(zzaefVar.zzccu, new zzjj(zzaefVar.zzccv.versionCode, zzaefVar.zzccv.zzapw, bundle, zzaefVar.zzccv.zzapx, zzaefVar.zzccv.zzapy, zzaefVar.zzccv.zzapz, zzaefVar.zzccv.zzaqa, zzaefVar.zzccv.zzaqb, zzaefVar.zzccv.zzaqc, zzaefVar.zzccv.zzaqd, zzaefVar.zzccv.zzaqe, zzaefVar.zzccv.zzaqf, zzaefVar.zzccv.zzaqg, zzaefVar.zzccv.zzaqh, zzaefVar.zzccv.zzaqi, zzaefVar.zzccv.zzaqj, zzaefVar.zzccv.zzaqk, zzaefVar.zzccv.zzaql), zzaefVar.zzacv, zzaefVar.zzacp, zzaefVar.applicationInfo, zzaefVar.zzccw, zzaefVar.zzccy, zzaefVar.zzccz, zzaefVar.zzacr, zzaefVar.zzcda, zzaefVar.zzads, zzaefVar.zzcdk, zzaefVar.zzcdc, zzaefVar.zzcdd, zzaefVar.zzcde, zzaefVar.zzcdf, zzaefVar.zzagu, zzaefVar.zzcdg, zzaefVar.zzcdh, zzaefVar.zzcdi, zzaefVar.zzcdj, zzaefVar.zzaco, zzaefVar.zzadj, zzaefVar.zzcdm, zzaefVar.zzcdn, zzaefVar.zzcdt, zzaefVar.zzcdo, zzaefVar.zzcdp, zzaefVar.zzcdq, zzaefVar.zzcdr, zzano.zzi(zzaefVar.zzcds), zzaefVar.zzcdu, zzaefVar.zzbss, zzaefVar.zzcdv, zzaefVar.zzcdw, zzaefVar.zzcdx, zzaefVar.zzadl, zzaefVar.zzcdy, zzaefVar.zzcdz, zzaefVar.zzced, zzano.zzi(zzaefVar.zzccx), zzaefVar.zzadn, zzaefVar.zzcee, zzaefVar.zzcef, 1, zzaefVar.zzceh, zzaefVar.zzcei, zzaefVar.zzcej, zzaefVar.zzcek), zzbcVar.zzvr);
        return zzbcVar.zzds().get();
    }
}
