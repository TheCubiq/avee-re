package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
/* loaded from: classes.dex */
public final class ex3 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final zzg c;
    public final ky3 d;
    public String e = "-1";
    public int f = -1;

    public ex3(Context context, zzg zzgVar, ky3 ky3Var) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = zzgVar;
        this.a = context;
        this.d = ky3Var;
    }

    public final void a() {
        SharedPreferences sharedPreferences;
        String str;
        this.b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.b, "gad_has_consent_for_cookies");
        if (((Boolean) zzba.zzc().b(g93.v0)).booleanValue()) {
            onSharedPreferenceChanged(this.b, "IABTCF_gdprApplies");
            sharedPreferences = this.b;
            str = "IABTCF_TCString";
        } else {
            sharedPreferences = this.b;
            str = "IABTCF_PurposeConsents";
        }
        onSharedPreferenceChanged(sharedPreferences, str);
    }

    public final void b(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) zzba.zzc().b(g93.t0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) zzba.zzc().b(g93.r0)).booleanValue()) {
            this.c.zzH(z);
            if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue() && z && (context = this.a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) zzba.zzc().b(g93.m0)).booleanValue()) {
            this.d.y();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        if (((Boolean) zzba.zzc().b(g93.v0)).booleanValue()) {
            if (dx3.a(str, "gad_has_consent_for_cookies")) {
                if (((Boolean) zzba.zzc().b(g93.t0)).booleanValue()) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i != this.c.zzb()) {
                        this.c.zzH(true);
                    }
                    this.c.zzE(i);
                    return;
                }
                return;
            } else if (dx3.a(str, "IABTCF_gdprApplies") || dx3.a(str, "IABTCF_TCString") || dx3.a(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.c.zzn(str))) {
                    this.c.zzH(true);
                }
                this.c.zzF(str, string);
                return;
            } else {
                return;
            }
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            if (string2.equals("-1") || this.e.equals(string2)) {
                return;
            }
            this.e = string2;
            b(string2, i2);
        } else if (c != 1) {
        } else {
            if (!((Boolean) zzba.zzc().b(g93.t0)).booleanValue() || i2 == -1 || this.f == i2) {
                return;
            }
            this.f = i2;
            b(string2, i2);
        }
    }
}
