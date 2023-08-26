package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.ads.impl.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzaco implements zzacd<zzoq> {
    private final boolean zzbto;
    private final boolean zzcbk;
    private final boolean zzcbl;

    public zzaco(boolean z, boolean z2, boolean z3) {
        this.zzcbk = z;
        this.zzcbl = z2;
        this.zzbto = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    @Override // com.google.android.gms.internal.ads.zzacd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzoq zza(zzabv zzabvVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        String str;
        List<zzanz<zzon>> zza = zzabvVar.zza(jSONObject, "images", false, this.zzcbk, this.zzcbl);
        zzanz<zzon> zza2 = zzabvVar.zza(jSONObject, "secondary_image", false, this.zzcbk);
        zzanz<zzoj> zzg = zzabvVar.zzg(jSONObject);
        zzanz<zzaqw> zzc = zzabvVar.zzc(jSONObject, MimeTypes.BASE_TYPE_VIDEO);
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
                return new zzoq(str, arrayList, jSONObject.getString(TtmlNode.TAG_BODY), zza2.get(), jSONObject.getString("call_to_action"), jSONObject.getString("advertiser"), zzg.get(), new Bundle(), zzc2 == null ? zzc2.zztm() : null, zzc2 == null ? zzc2.getView() : null, null, null);
            }
        }
        str = string;
        return new zzoq(str, arrayList, jSONObject.getString(TtmlNode.TAG_BODY), zza2.get(), jSONObject.getString("call_to_action"), jSONObject.getString("advertiser"), zzg.get(), new Bundle(), zzc2 == null ? zzc2.zztm() : null, zzc2 == null ? zzc2.getView() : null, null, null);
    }
}
