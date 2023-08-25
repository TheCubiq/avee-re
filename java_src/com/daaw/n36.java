package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class n36 implements i76 {

    /* renamed from: a */
    public final Context f19451a;

    /* renamed from: b */
    public final g77 f19452b;

    public n36(Context context, g77 g77Var) {
        this.f19451a = context;
        this.f19452b = g77Var;
    }

    /* renamed from: a */
    public final /* synthetic */ j36 m15542a() {
        Bundle bundle;
        zzt.zzp();
        String string = !((Boolean) zzba.zzc().m23658b(g93.f10880x5)).booleanValue() ? "" : this.f19451a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) zzba.zzc().m23658b(g93.f10902z5)).booleanValue() ? this.f19451a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        zzt.zzp();
        Context context = this.f19451a;
        if (((Boolean) zzba.zzc().m23658b(g93.f10891y5)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new j36(string, string2, bundle, null);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 18;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f19452b.mo20112M(new Callable() { // from class: com.daaw.h36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n36.this.m15542a();
            }
        });
    }
}
