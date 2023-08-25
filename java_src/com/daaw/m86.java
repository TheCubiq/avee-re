package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m86 implements h76 {

    /* renamed from: a */
    public final AdvertisingIdClient.Info f18659a;

    /* renamed from: b */
    public final String f18660b;

    /* renamed from: c */
    public final hv6 f18661c;

    public m86(AdvertisingIdClient.Info info, String str, hv6 hv6Var) {
        this.f18659a = info;
        this.f18660b = str;
        this.f18661c = hv6Var;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        try {
            JSONObject zzf = zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f18659a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f18660b;
                if (str != null) {
                    zzf.put("pdid", str);
                    zzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzf.put("rdid", this.f18659a.getId());
            zzf.put("is_lat", this.f18659a.isLimitAdTrackingEnabled());
            zzf.put("idtype", "adid");
            hv6 hv6Var = this.f18661c;
            if (hv6Var.m20385c()) {
                zzf.put("paidv1_id_android_3p", hv6Var.m20386b());
                zzf.put("paidv1_creation_time_android_3p", this.f18661c.m20387a());
            }
        } catch (JSONException e) {
            zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
