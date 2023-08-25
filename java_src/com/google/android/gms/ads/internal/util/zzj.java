package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.daaw.f77;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.kz3;
import com.daaw.s13;
import com.daaw.sa3;
import com.daaw.vw0;
import com.daaw.z04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzj implements zzg {

    /* renamed from: b */
    public boolean f36312b;

    /* renamed from: d */
    public f77 f36314d;
    @GuardedBy("lock")

    /* renamed from: f */
    public SharedPreferences f36316f;
    @GuardedBy("lock")

    /* renamed from: g */
    public SharedPreferences.Editor f36317g;
    @GuardedBy("lock")

    /* renamed from: i */
    public String f36319i;
    @GuardedBy("lock")

    /* renamed from: j */
    public String f36320j;

    /* renamed from: a */
    public final Object f36311a = new Object();

    /* renamed from: c */
    public final List f36313c = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: e */
    public s13 f36315e = null;
    @GuardedBy("lock")

    /* renamed from: h */
    public boolean f36318h = true;
    @GuardedBy("lock")

    /* renamed from: k */
    public boolean f36321k = true;
    @GuardedBy("lock")

    /* renamed from: l */
    public String f36322l = "-1";
    @GuardedBy("lock")

    /* renamed from: m */
    public String f36323m = "-1";
    @GuardedBy("lock")

    /* renamed from: n */
    public String f36324n = "-1";
    @GuardedBy("lock")

    /* renamed from: o */
    public int f36325o = -1;
    @GuardedBy("lock")

    /* renamed from: p */
    public kz3 f36326p = new kz3("", 0);
    @GuardedBy("lock")

    /* renamed from: q */
    public long f36327q = 0;
    @GuardedBy("lock")

    /* renamed from: r */
    public long f36328r = 0;
    @GuardedBy("lock")

    /* renamed from: s */
    public int f36329s = -1;
    @GuardedBy("lock")

    /* renamed from: t */
    public int f36330t = 0;
    @GuardedBy("lock")

    /* renamed from: u */
    public Set f36331u = Collections.emptySet();
    @GuardedBy("lock")

    /* renamed from: v */
    public JSONObject f36332v = new JSONObject();
    @GuardedBy("lock")

    /* renamed from: w */
    public boolean f36333w = true;
    @GuardedBy("lock")

    /* renamed from: x */
    public boolean f36334x = true;
    @GuardedBy("lock")

    /* renamed from: y */
    public String f36335y = null;
    @GuardedBy("lock")

    /* renamed from: z */
    public String f36336z = "";
    @GuardedBy("lock")

    /* renamed from: A */
    public boolean f36306A = false;
    @GuardedBy("lock")

    /* renamed from: B */
    public String f36307B = "";
    @GuardedBy("lock")

    /* renamed from: C */
    public int f36308C = -1;
    @GuardedBy("lock")

    /* renamed from: D */
    public int f36309D = -1;
    @GuardedBy("lock")

    /* renamed from: E */
    public long f36310E = 0;

    /* renamed from: a */
    public final /* synthetic */ void m1334a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f36311a) {
            this.f36316f = sharedPreferences;
            this.f36317g = edit;
            if (vw0.m6698g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f36318h = this.f36316f.getBoolean("use_https", this.f36318h);
            this.f36333w = this.f36316f.getBoolean("content_url_opted_out", this.f36333w);
            this.f36319i = this.f36316f.getString("content_url_hashes", this.f36319i);
            this.f36321k = this.f36316f.getBoolean("gad_idless", this.f36321k);
            this.f36334x = this.f36316f.getBoolean("content_vertical_opted_out", this.f36334x);
            this.f36320j = this.f36316f.getString("content_vertical_hashes", this.f36320j);
            this.f36330t = this.f36316f.getInt("version_code", this.f36330t);
            this.f36326p = new kz3(this.f36316f.getString("app_settings_json", this.f36326p.m17294c()), this.f36316f.getLong("app_settings_last_update_ms", this.f36326p.m17296a()));
            this.f36327q = this.f36316f.getLong("app_last_background_time_ms", this.f36327q);
            this.f36329s = this.f36316f.getInt("request_in_session_count", this.f36329s);
            this.f36328r = this.f36316f.getLong("first_ad_req_time_ms", this.f36328r);
            this.f36331u = this.f36316f.getStringSet("never_pool_slots", this.f36331u);
            this.f36335y = this.f36316f.getString("display_cutout", this.f36335y);
            this.f36308C = this.f36316f.getInt("app_measurement_npa", this.f36308C);
            this.f36309D = this.f36316f.getInt("sd_app_measure_npa", this.f36309D);
            this.f36310E = this.f36316f.getLong("sd_app_measure_npa_ts", this.f36310E);
            this.f36336z = this.f36316f.getString("inspector_info", this.f36336z);
            this.f36306A = this.f36316f.getBoolean("linked_device", this.f36306A);
            this.f36307B = this.f36316f.getString("linked_ad_unit", this.f36307B);
            this.f36322l = this.f36316f.getString("IABTCF_gdprApplies", this.f36322l);
            this.f36324n = this.f36316f.getString("IABTCF_PurposeConsents", this.f36324n);
            this.f36323m = this.f36316f.getString("IABTCF_TCString", this.f36323m);
            this.f36325o = this.f36316f.getInt("gad_has_consent_for_cookies", this.f36325o);
            try {
                this.f36332v = new JSONObject(this.f36316f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                k04.zzk("Could not convert native advanced settings to json object", e);
            }
            m1332c();
        }
    }

    /* renamed from: b */
    public final void m1333b() {
        f77 f77Var = this.f36314d;
        if (f77Var == null || f77Var.isDone()) {
            return;
        }
        try {
            this.f36314d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            k04.zzk("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            k04.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            k04.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            k04.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    /* renamed from: c */
    public final void m1332c() {
        z04.f34305a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10762m8)).booleanValue()) {
            m1333b();
            synchronized (this.f36311a) {
                if (this.f36307B.equals(str)) {
                    return;
                }
                this.f36307B = str;
                SharedPreferences.Editor editor = this.f36317g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f36317g.apply();
                }
                m1332c();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10762m8)).booleanValue()) {
            m1333b();
            synchronized (this.f36311a) {
                if (this.f36306A == z) {
                    return;
                }
                this.f36306A = z;
                SharedPreferences.Editor editor = this.f36317g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.f36317g.apply();
                }
                m1332c();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        m1333b();
        synchronized (this.f36311a) {
            if (TextUtils.equals(this.f36335y, str)) {
                return;
            }
            this.f36335y = str;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j) {
        m1333b();
        synchronized (this.f36311a) {
            if (this.f36328r == j) {
                return;
            }
            this.f36328r = j;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i) {
        m1333b();
        synchronized (this.f36311a) {
            this.f36325o = i;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2) {
        char c;
        m1333b();
        synchronized (this.f36311a) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                this.f36322l = str2;
            } else if (c == 1) {
                this.f36323m = str2;
            } else if (c != 2) {
                return;
            } else {
                this.f36324n = str2;
            }
            if (this.f36317g != null) {
                if (str2.equals("-1")) {
                    this.f36317g.remove(str);
                } else {
                    this.f36317g.putString(str, str2);
                }
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10599X7)).booleanValue()) {
            m1333b();
            synchronized (this.f36311a) {
                if (this.f36336z.equals(str)) {
                    return;
                }
                this.f36336z = str;
                SharedPreferences.Editor editor = this.f36317g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.f36317g.apply();
                }
                m1332c();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z) {
        m1333b();
        synchronized (this.f36311a) {
            if (z == this.f36321k) {
                return;
            }
            this.f36321k = z;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str, String str2, boolean z) {
        m1333b();
        synchronized (this.f36311a) {
            JSONArray optJSONArray = this.f36332v.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzB().mo15860a());
                optJSONArray.put(length, jSONObject);
                this.f36332v.put(str, optJSONArray);
            } catch (JSONException e) {
                k04.zzk("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f36332v.toString());
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int i) {
        m1333b();
        synchronized (this.f36311a) {
            if (this.f36329s == i) {
                return;
            }
            this.f36329s = i;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i) {
        m1333b();
        synchronized (this.f36311a) {
            if (this.f36309D == i) {
                return;
            }
            this.f36309D = i;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long j) {
        m1333b();
        synchronized (this.f36311a) {
            if (this.f36310E == j) {
                return;
            }
            this.f36310E = j;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z;
        m1333b();
        synchronized (this.f36311a) {
            z = this.f36333w;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z;
        m1333b();
        synchronized (this.f36311a) {
            z = this.f36334x;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z;
        m1333b();
        synchronized (this.f36311a) {
            z = this.f36306A;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10809r0)).booleanValue()) {
            m1333b();
            synchronized (this.f36311a) {
                z = this.f36321k;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i;
        m1333b();
        synchronized (this.f36311a) {
            i = this.f36330t;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i;
        m1333b();
        synchronized (this.f36311a) {
            i = this.f36325o;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i;
        m1333b();
        synchronized (this.f36311a) {
            i = this.f36329s;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j;
        m1333b();
        synchronized (this.f36311a) {
            j = this.f36327q;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j;
        m1333b();
        synchronized (this.f36311a) {
            j = this.f36328r;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j;
        m1333b();
        synchronized (this.f36311a) {
            j = this.f36310E;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final s13 zzg() {
        if (this.f36312b) {
            if (!(zzM() && zzN()) && ((Boolean) sa3.f26045b.m16137e()).booleanValue()) {
                synchronized (this.f36311a) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.f36315e == null) {
                        this.f36315e = new s13();
                    }
                    this.f36315e.m10759e();
                    k04.zzi("start fetching content...");
                    return this.f36315e;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final kz3 zzh() {
        kz3 kz3Var;
        m1333b();
        synchronized (this.f36311a) {
            kz3Var = this.f36326p;
        }
        return kz3Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final kz3 zzi() {
        kz3 kz3Var;
        synchronized (this.f36311a) {
            kz3Var = this.f36326p;
        }
        return kz3Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        m1333b();
        synchronized (this.f36311a) {
            str = this.f36319i;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        m1333b();
        synchronized (this.f36311a) {
            str = this.f36320j;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        m1333b();
        synchronized (this.f36311a) {
            str = this.f36307B;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        m1333b();
        synchronized (this.f36311a) {
            str = this.f36335y;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String str) {
        char c;
        m1333b();
        synchronized (this.f36311a) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                return this.f36322l;
            } else if (c == 1) {
                return this.f36323m;
            } else if (c != 2) {
                return null;
            } else {
                return this.f36324n;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        m1333b();
        synchronized (this.f36311a) {
            str = this.f36336z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        m1333b();
        synchronized (this.f36311a) {
            jSONObject = this.f36332v;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.f36313c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(final Context context) {
        synchronized (this.f36311a) {
            if (this.f36316f != null) {
                return;
            }
            this.f36314d = z04.f34305a.mo20111P(new Runnable(context, "admob") { // from class: com.google.android.gms.ads.internal.util.zzh
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    zzj.this.m1334a(this.zzb, this.zzc);
                }
            });
            this.f36312b = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        m1333b();
        synchronized (this.f36311a) {
            this.f36332v = new JSONObject();
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j) {
        m1333b();
        synchronized (this.f36311a) {
            if (this.f36327q == j) {
                return;
            }
            this.f36327q = j;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        m1333b();
        synchronized (this.f36311a) {
            long mo15860a = com.google.android.gms.ads.internal.zzt.zzB().mo15860a();
            if (str != null && !str.equals(this.f36326p.m17294c())) {
                this.f36326p = new kz3(str, mo15860a);
                SharedPreferences.Editor editor = this.f36317g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f36317g.putLong("app_settings_last_update_ms", mo15860a);
                    this.f36317g.apply();
                }
                m1332c();
                for (Runnable runnable : this.f36313c) {
                    runnable.run();
                }
                return;
            }
            this.f36326p.m17290g(mo15860a);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i) {
        m1333b();
        synchronized (this.f36311a) {
            if (this.f36330t == i) {
                return;
            }
            this.f36330t = i;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        m1333b();
        synchronized (this.f36311a) {
            if (str.equals(this.f36319i)) {
                return;
            }
            this.f36319i = str;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        m1333b();
        synchronized (this.f36311a) {
            if (this.f36333w == z) {
                return;
            }
            this.f36333w = z;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        m1333b();
        synchronized (this.f36311a) {
            if (str.equals(this.f36320j)) {
                return;
            }
            this.f36320j = str;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f36317g.apply();
            }
            m1332c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z) {
        m1333b();
        synchronized (this.f36311a) {
            if (this.f36334x == z) {
                return;
            }
            this.f36334x = z;
            SharedPreferences.Editor editor = this.f36317g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.f36317g.apply();
            }
            m1332c();
        }
    }
}
