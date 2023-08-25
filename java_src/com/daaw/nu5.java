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
    /* renamed from: d */
    public static Bundle m14780d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.daaw.qq5
    /* renamed from: a */
    public final boolean mo1905a(fi6 fi6Var, th6 th6Var) {
        return !TextUtils.isEmpty(th6Var.f27718w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.daaw.qq5
    /* renamed from: b */
    public final f77 mo1904b(fi6 fi6Var, th6 th6Var) {
        String optString = th6Var.f27718w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        ri6 ri6Var = fi6Var.f9623a.f5824a;
        pi6 pi6Var = new pi6();
        pi6Var.m13373G(ri6Var);
        pi6Var.m13370J(optString);
        Bundle m14780d = m14780d(ri6Var.f25344d.zzm);
        Bundle m14780d2 = m14780d(m14780d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        m14780d2.putInt("gw", 1);
        String optString2 = th6Var.f27718w.optString(AdMobAdapter.HOUSE_ADS_PARAMETER, null);
        if (optString2 != null) {
            m14780d2.putString(AdMobAdapter.HOUSE_ADS_PARAMETER, optString2);
        }
        String optString3 = th6Var.f27718w.optString(AdMobAdapter.AD_JSON_PARAMETER, null);
        if (optString3 != null) {
            m14780d2.putString(AdMobAdapter.AD_PARAMETER, optString3);
        }
        m14780d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = th6Var.f27658E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = th6Var.f27658E.optString(next, null);
            if (next != null) {
                m14780d2.putString(next, optString4);
            }
        }
        m14780d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", m14780d2);
        zzl zzlVar = ri6Var.f25344d;
        pi6Var.m13358e(new zzl(zzlVar.zza, zzlVar.zzb, m14780d2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, m14780d, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        ri6 m13356g = pi6Var.m13356g();
        Bundle bundle = new Bundle();
        wh6 wh6Var = fi6Var.f9624b.f8508b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(wh6Var.f31251a));
        bundle2.putInt("refresh_interval", wh6Var.f31253c);
        bundle2.putString("gws_query_id", wh6Var.f31252b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = fi6Var.f9623a.f5824a.f25346f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", th6Var.f27719x);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(th6Var.f27684c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(th6Var.f27686d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(th6Var.f27712q));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(th6Var.f27706n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(th6Var.f27694h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(th6Var.f27696i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(th6Var.f27698j));
        bundle3.putString("transaction_id", th6Var.f27700k);
        bundle3.putString("valid_from_timestamp", th6Var.f27702l);
        bundle3.putBoolean("is_closable_area_disabled", th6Var.f27670Q);
        if (th6Var.f27704m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", th6Var.f27704m.f36978q);
            bundle4.putString("rb_type", th6Var.f27704m.f36977p);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo9850c(m13356g, bundle);
    }

    /* renamed from: c */
    public abstract f77 mo9850c(ri6 ri6Var, Bundle bundle);
}
