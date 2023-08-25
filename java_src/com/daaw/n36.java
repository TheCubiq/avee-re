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
    public final Context a;
    public final g77 b;

    public n36(Context context, g77 g77Var) {
        this.a = context;
        this.b = g77Var;
    }

    public final /* synthetic */ j36 a() {
        Bundle bundle;
        zzt.zzp();
        String string = !((Boolean) zzba.zzc().b(g93.x5)).booleanValue() ? "" : this.a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) zzba.zzc().b(g93.z5)).booleanValue() ? this.a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        zzt.zzp();
        Context context = this.a;
        if (((Boolean) zzba.zzc().b(g93.y5)).booleanValue()) {
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
        return this.b.M(new Callable() { // from class: com.daaw.h36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n36.this.a();
            }
        });
    }
}
