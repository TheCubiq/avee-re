package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.ads.impl.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzacn implements zzacd<zzoo> {
    private final boolean zzbto;
    private final boolean zzcbk;
    private final boolean zzcbl;

    public zzacn(boolean z, boolean z2, boolean z3) {
        this.zzcbk = z;
        this.zzcbl = z2;
        this.zzbto = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    @Override // com.google.android.gms.internal.ads.zzacd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzoo zza(zzabv zzabvVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        String str;
        List<zzanz<zzon>> zza = zzabvVar.zza(jSONObject, "images", false, this.zzcbk, this.zzcbl);
        zzanz<zzon> zza2 = zzabvVar.zza(jSONObject, "app_icon", true, this.zzcbk);
        zzanz<zzaqw> zzc = zzabvVar.zzc(jSONObject, MimeTypes.BASE_TYPE_VIDEO);
        zzanz<zzoj> zzg = zzabvVar.zzg(jSONObject);
        ArrayList arrayList = new ArrayList();
        for (zzanz<zzon> zzanzVar : zza) {
            arrayList.add(zzanzVar.get());
        }
        zzaqw zzc2 = zzabv.zzc(zzc);
        String string = jSONObject.getString("headline");
        if (this.zzbto) {
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbfr)).booleanValue()) {
                Resources resources = com.google.android.gms.ads.internal.zzbv.zzeo().getResources();
                str = resources != null ? resources.getString(R.string.s7) : "Test Ad";
                if (string != null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(string).length());
                    sb.append(str);
                    sb.append(" : ");
                    sb.append(string);
                    string = sb.toString();
                }
                return new zzoo(str, arrayList, jSONObject.getString(TtmlNode.TAG_BODY), zza2.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString(FirebaseAnalytics.Param.PRICE), zzg.get(), new Bundle(), zzc2 == null ? zzc2.zztm() : null, zzc2 == null ? zzc2.getView() : null, null, null);
            }
        }
        str = string;
        return new zzoo(str, arrayList, jSONObject.getString(TtmlNode.TAG_BODY), zza2.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString(FirebaseAnalytics.Param.PRICE), zzg.get(), new Bundle(), zzc2 == null ? zzc2.zztm() : null, zzc2 == null ? zzc2.getView() : null, null, null);
    }
}
