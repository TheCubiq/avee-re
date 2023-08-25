package com.daaw;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public final class l06 implements h76 {

    /* renamed from: a */
    public final ri6 f16937a;

    /* renamed from: b */
    public final long f16938b;

    public l06(ri6 ri6Var, long j) {
        ry0.m10829k(ri6Var, "the targeting must not be null");
        this.f16937a = ri6Var;
        this.f16938b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // com.daaw.h76
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Location location;
        String str;
        Bundle bundle = (Bundle) obj;
        zzl zzlVar = this.f16937a.f25344d;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.f16937a.f25346f);
        int i = this.f16937a.f25355o.f4840a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            str = i2 == 2 ? "is_rewarded_interstitial" : "is_new_rewarded";
            bundle.putLong("start_signals_timestamp", this.f16938b);
            cj6.m25313f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb == -1);
            cj6.m25317b(bundle, "extras", zzlVar.zzc);
            int i3 = zzlVar.zzd;
            cj6.m25314e(bundle, "cust_gender", i3, i3 == -1);
            cj6.m25315d(bundle, "kw", zzlVar.zze);
            int i4 = zzlVar.zzg;
            cj6.m25314e(bundle, "tag_for_child_directed_treatment", i4, i4 == -1);
            if (zzlVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            cj6.m25314e(bundle, "d_imp_hdr", 1, zzlVar.zza < 2 && zzlVar.zzh);
            String str2 = zzlVar.zzi;
            cj6.m25313f(bundle, "ppid", str2, zzlVar.zza < 2 && !TextUtils.isEmpty(str2));
            location = zzlVar.zzk;
            if (location != null) {
                float accuracy = location.getAccuracy();
                long time = location.getTime();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy * 1000.0f);
                bundle2.putLong("lat", (long) (latitude * 1.0E7d));
                bundle2.putLong("long", (long) (longitude * 1.0E7d));
                bundle2.putLong("time", time * 1000);
                bundle.putBundle("uule", bundle2);
            }
            cj6.m25316c(bundle, "url", zzlVar.zzl);
            cj6.m25315d(bundle, "neighboring_content_urls", zzlVar.zzv);
            cj6.m25317b(bundle, "custom_targeting", zzlVar.zzn);
            cj6.m25315d(bundle, "category_exclusions", zzlVar.zzo);
            cj6.m25316c(bundle, "request_agent", zzlVar.zzp);
            cj6.m25316c(bundle, "request_pkg", zzlVar.zzq);
            cj6.m25312g(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza < 7);
            if (zzlVar.zza < 8) {
                int i5 = zzlVar.zzt;
                cj6.m25314e(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
                cj6.m25316c(bundle, "max_ad_content_rating", zzlVar.zzu);
                return;
            }
            return;
        }
        bundle.putBoolean(str, true);
        bundle.putLong("start_signals_timestamp", this.f16938b);
        cj6.m25313f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb == -1);
        cj6.m25317b(bundle, "extras", zzlVar.zzc);
        int i32 = zzlVar.zzd;
        cj6.m25314e(bundle, "cust_gender", i32, i32 == -1);
        cj6.m25315d(bundle, "kw", zzlVar.zze);
        int i42 = zzlVar.zzg;
        cj6.m25314e(bundle, "tag_for_child_directed_treatment", i42, i42 == -1);
        if (zzlVar.zzf) {
        }
        cj6.m25314e(bundle, "d_imp_hdr", 1, zzlVar.zza < 2 && zzlVar.zzh);
        String str22 = zzlVar.zzi;
        cj6.m25313f(bundle, "ppid", str22, zzlVar.zza < 2 && !TextUtils.isEmpty(str22));
        location = zzlVar.zzk;
        if (location != null) {
        }
        cj6.m25316c(bundle, "url", zzlVar.zzl);
        cj6.m25315d(bundle, "neighboring_content_urls", zzlVar.zzv);
        cj6.m25317b(bundle, "custom_targeting", zzlVar.zzn);
        cj6.m25315d(bundle, "category_exclusions", zzlVar.zzo);
        cj6.m25316c(bundle, "request_agent", zzlVar.zzp);
        cj6.m25316c(bundle, "request_pkg", zzlVar.zzq);
        cj6.m25312g(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza < 7);
        if (zzlVar.zza < 8) {
        }
    }
}
