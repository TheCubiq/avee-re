package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m86 implements h76 {
    public final AdvertisingIdClient.Info a;
    public final String b;
    public final hv6 c;

    public m86(AdvertisingIdClient.Info info, String str, hv6 hv6Var) {
        this.a = info;
        this.b = str;
        this.c = hv6Var;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            JSONObject zzf = zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.b;
                if (str != null) {
                    zzf.put("pdid", str);
                    zzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzf.put("rdid", this.a.getId());
            zzf.put("is_lat", this.a.isLimitAdTrackingEnabled());
            zzf.put("idtype", "adid");
            hv6 hv6Var = this.c;
            if (hv6Var.c()) {
                zzf.put("paidv1_id_android_3p", hv6Var.b());
                zzf.put("paidv1_creation_time_android_3p", this.c.a());
            }
        } catch (JSONException e) {
            zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
