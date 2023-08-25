package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.af3;
import com.daaw.ak2;
import com.daaw.an3;
import com.daaw.ar3;
import com.daaw.bf3;
import com.daaw.ci3;
import com.daaw.d62;
import com.daaw.d82;
import com.daaw.ds2;
import com.daaw.er3;
import com.daaw.fd3;
import com.daaw.gt3;
import com.daaw.hr3;
import com.daaw.iw3;
import com.daaw.k04;
import com.daaw.la2;
import com.daaw.lf2;
import com.daaw.rh2;
import com.daaw.uo2;
import com.daaw.v32;
import com.daaw.wv3;
import com.daaw.xc2;
import com.daaw.yq2;
import com.daaw.zc3;
import com.daaw.zy3;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzaw {
    public final zzk a;
    public final zzi b;
    public final zzeq c;
    public final af3 d;
    public final iw3 e;
    public final er3 f;
    public final bf3 g;
    public gt3 h;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, af3 af3Var, iw3 iw3Var, er3 er3Var, bf3 bf3Var) {
        this.a = zzkVar;
        this.b = zziVar;
        this.c = zzeqVar;
        this.d = af3Var;
        this.e = iw3Var;
        this.f = er3Var;
        this.g = bf3Var;
    }

    public static /* bridge */ /* synthetic */ void i(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().t(context, zzay.zzc().p, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, an3 an3Var) {
        return (zzbq) new ak2(this, context, str, an3Var).d(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, an3 an3Var) {
        return (zzbu) new lf2(this, context, zzqVar, str, an3Var).d(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, an3 an3Var) {
        return (zzbu) new rh2(this, context, zzqVar, str, an3Var).d(context, false);
    }

    public final zzdj zzf(Context context, an3 an3Var) {
        return (zzdj) new d62(this, context, an3Var).d(context, false);
    }

    public final zc3 zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zc3) new uo2(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final fd3 zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (fd3) new yq2(this, view, hashMap, hashMap2).d(view.getContext(), false);
    }

    public final ci3 zzl(Context context, an3 an3Var, OnH5AdsEventListener onH5AdsEventListener) {
        return (ci3) new xc2(this, context, an3Var, onH5AdsEventListener).d(context, false);
    }

    public final ar3 zzm(Context context, an3 an3Var) {
        return (ar3) new la2(this, context, an3Var).d(context, false);
    }

    public final hr3 zzo(Activity activity) {
        v32 v32Var = new v32(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            k04.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (hr3) v32Var.d(activity, z);
    }

    public final wv3 zzq(Context context, String str, an3 an3Var) {
        return (wv3) new ds2(this, context, str, an3Var).d(context, false);
    }

    public final zy3 zzr(Context context, an3 an3Var) {
        return (zy3) new d82(this, context, an3Var).d(context, false);
    }
}
