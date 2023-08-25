package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class nu5 implements qq5 {
    public static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        return !TextUtils.isEmpty(th6Var.w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.daaw.qq5
    public final f77 b(fi6 fi6Var, th6 th6Var) {
        String optString = th6Var.w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        ri6 ri6Var = fi6Var.a.a;
        pi6 pi6Var = new pi6();
        pi6Var.G(ri6Var);
        pi6Var.J(optString);
        Bundle d = d(ri6Var.d.zzm);
        Bundle d2 = d(d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d2.putInt("gw", 1);
        String optString2 = th6Var.w.optString(AdMobAdapter.HOUSE_ADS_PARAMETER, null);
        if (optString2 != null) {
            d2.putString(AdMobAdapter.HOUSE_ADS_PARAMETER, optString2);
        }
        String optString3 = th6Var.w.optString(AdMobAdapter.AD_JSON_PARAMETER, null);
        if (optString3 != null) {
            d2.putString(AdMobAdapter.AD_PARAMETER, optString3);
        }
        d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = th6Var.E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = th6Var.E.optString(next, null);
            if (next != null) {
                d2.putString(next, optString4);
            }
        }
        d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d2);
        zzl zzlVar = ri6Var.d;
        pi6Var.e(new zzl(zzlVar.zza, zzlVar.zzb, d2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, d, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        ri6 g = pi6Var.g();
        Bundle bundle = new Bundle();
        wh6 wh6Var = fi6Var.b.b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(wh6Var.a));
        bundle2.putInt("refresh_interval", wh6Var.c);
        bundle2.putString("gws_query_id", wh6Var.b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = fi6Var.a.a.f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", th6Var.x);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(th6Var.c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(th6Var.d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(th6Var.q));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(th6Var.n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(th6Var.h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(th6Var.i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(th6Var.j));
        bundle3.putString("transaction_id", th6Var.k);
        bundle3.putString("valid_from_timestamp", th6Var.l);
        bundle3.putBoolean("is_closable_area_disabled", th6Var.Q);
        if (th6Var.m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", th6Var.m.q);
            bundle4.putString("rb_type", th6Var.m.p);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(g, bundle);
    }

    public abstract f77 c(ri6 ri6Var, Bundle bundle);
}
