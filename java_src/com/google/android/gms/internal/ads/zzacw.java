package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzacw implements com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> {
    private final /* synthetic */ zzaqw zzcbq;
    private final /* synthetic */ zzaoj zzcbr;
    private final /* synthetic */ zzacq zzcbs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacw(zzacq zzacqVar, zzaqw zzaqwVar, zzaoj zzaojVar) {
        this.zzcbs = zzacqVar;
        this.zzcbq = zzaqwVar;
        this.zzcbr = zzaojVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        JSONObject jSONObject;
        boolean z;
        String str;
        try {
            String str2 = (String) map.get(FirebaseAnalytics.Param.SUCCESS);
            String str3 = (String) map.get("failure");
            if (TextUtils.isEmpty(str3)) {
                jSONObject = new JSONObject(str2);
                z = true;
            } else {
                jSONObject = new JSONObject(str3);
                z = false;
            }
            str = this.zzcbs.zzaae;
            if (str.equals(jSONObject.optString("ads_id", ""))) {
                this.zzcbq.zzb("/nativeAdPreProcess", this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, z);
                jSONObject2.put("json", jSONObject);
                this.zzcbr.set(jSONObject2);
            }
        } catch (Throwable th) {
            zzakb.zzb("Error while preprocessing json.", th);
            this.zzcbr.setException(th);
        }
    }
}
