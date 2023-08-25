package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
/* loaded from: classes.dex */
public final class ex3 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final Context f8917a;

    /* renamed from: b */
    public final SharedPreferences f8918b;

    /* renamed from: c */
    public final zzg f8919c;

    /* renamed from: d */
    public final ky3 f8920d;

    /* renamed from: e */
    public String f8921e = "-1";

    /* renamed from: f */
    public int f8922f = -1;

    public ex3(Context context, zzg zzgVar, ky3 ky3Var) {
        this.f8918b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f8919c = zzgVar;
        this.f8917a = context;
        this.f8920d = ky3Var;
    }

    /* renamed from: a */
    public final void m23053a() {
        SharedPreferences sharedPreferences;
        String str;
        this.f8918b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f8918b, "gad_has_consent_for_cookies");
        if (((Boolean) zzba.zzc().m23658b(g93.f10853v0)).booleanValue()) {
            onSharedPreferenceChanged(this.f8918b, "IABTCF_gdprApplies");
            sharedPreferences = this.f8918b;
            str = "IABTCF_TCString";
        } else {
            sharedPreferences = this.f8918b;
            str = "IABTCF_PurposeConsents";
        }
        onSharedPreferenceChanged(sharedPreferences, str);
    }

    /* renamed from: b */
    public final void m23052b(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) zzba.zzc().m23658b(g93.f10831t0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10809r0)).booleanValue()) {
            this.f8919c.zzH(z);
            if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue() && z && (context = this.f8917a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10754m0)).booleanValue()) {
            this.f8920d.m17318y();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        if (((Boolean) zzba.zzc().m23658b(g93.f10853v0)).booleanValue()) {
            if (dx3.m23828a(str, "gad_has_consent_for_cookies")) {
                if (((Boolean) zzba.zzc().m23658b(g93.f10831t0)).booleanValue()) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i != this.f8919c.zzb()) {
                        this.f8919c.zzH(true);
                    }
                    this.f8919c.zzE(i);
                    return;
                }
                return;
            } else if (dx3.m23828a(str, "IABTCF_gdprApplies") || dx3.m23828a(str, "IABTCF_TCString") || dx3.m23828a(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.f8919c.zzn(str))) {
                    this.f8919c.zzH(true);
                }
                this.f8919c.zzF(str, string);
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
            if (string2.equals("-1") || this.f8921e.equals(string2)) {
                return;
            }
            this.f8921e = string2;
            m23052b(string2, i2);
        } else if (c != 1) {
        } else {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10831t0)).booleanValue() || i2 == -1 || this.f8922f == i2) {
                return;
            }
            this.f8922f = i2;
            m23052b(string2, i2);
        }
    }
}
