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
    public boolean b;
    public f77 d;
    @GuardedBy("lock")
    public SharedPreferences f;
    @GuardedBy("lock")
    public SharedPreferences.Editor g;
    @GuardedBy("lock")
    public String i;
    @GuardedBy("lock")
    public String j;
    public final Object a = new Object();
    public final List c = new ArrayList();
    @GuardedBy("lock")
    public s13 e = null;
    @GuardedBy("lock")
    public boolean h = true;
    @GuardedBy("lock")
    public boolean k = true;
    @GuardedBy("lock")
    public String l = "-1";
    @GuardedBy("lock")
    public String m = "-1";
    @GuardedBy("lock")
    public String n = "-1";
    @GuardedBy("lock")
    public int o = -1;
    @GuardedBy("lock")
    public kz3 p = new kz3("", 0);
    @GuardedBy("lock")
    public long q = 0;
    @GuardedBy("lock")
    public long r = 0;
    @GuardedBy("lock")
    public int s = -1;
    @GuardedBy("lock")
    public int t = 0;
    @GuardedBy("lock")
    public Set u = Collections.emptySet();
    @GuardedBy("lock")
    public JSONObject v = new JSONObject();
    @GuardedBy("lock")
    public boolean w = true;
    @GuardedBy("lock")
    public boolean x = true;
    @GuardedBy("lock")
    public String y = null;
    @GuardedBy("lock")
    public String z = "";
    @GuardedBy("lock")
    public boolean A = false;
    @GuardedBy("lock")
    public String B = "";
    @GuardedBy("lock")
    public int C = -1;
    @GuardedBy("lock")
    public int D = -1;
    @GuardedBy("lock")
    public long E = 0;

    public final /* synthetic */ void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.a) {
            this.f = sharedPreferences;
            this.g = edit;
            if (vw0.g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.h = this.f.getBoolean("use_https", this.h);
            this.w = this.f.getBoolean("content_url_opted_out", this.w);
            this.i = this.f.getString("content_url_hashes", this.i);
            this.k = this.f.getBoolean("gad_idless", this.k);
            this.x = this.f.getBoolean("content_vertical_opted_out", this.x);
            this.j = this.f.getString("content_vertical_hashes", this.j);
            this.t = this.f.getInt("version_code", this.t);
            this.p = new kz3(this.f.getString("app_settings_json", this.p.c()), this.f.getLong("app_settings_last_update_ms", this.p.a()));
            this.q = this.f.getLong("app_last_background_time_ms", this.q);
            this.s = this.f.getInt("request_in_session_count", this.s);
            this.r = this.f.getLong("first_ad_req_time_ms", this.r);
            this.u = this.f.getStringSet("never_pool_slots", this.u);
            this.y = this.f.getString("display_cutout", this.y);
            this.C = this.f.getInt("app_measurement_npa", this.C);
            this.D = this.f.getInt("sd_app_measure_npa", this.D);
            this.E = this.f.getLong("sd_app_measure_npa_ts", this.E);
            this.z = this.f.getString("inspector_info", this.z);
            this.A = this.f.getBoolean("linked_device", this.A);
            this.B = this.f.getString("linked_ad_unit", this.B);
            this.l = this.f.getString("IABTCF_gdprApplies", this.l);
            this.n = this.f.getString("IABTCF_PurposeConsents", this.n);
            this.m = this.f.getString("IABTCF_TCString", this.m);
            this.o = this.f.getInt("gad_has_consent_for_cookies", this.o);
            try {
                this.v = new JSONObject(this.f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                k04.zzk("Could not convert native advanced settings to json object", e);
            }
            c();
        }
    }

    public final void b() {
        f77 f77Var = this.d;
        if (f77Var == null || f77Var.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
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

    public final void c() {
        z04.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.m8)).booleanValue()) {
            b();
            synchronized (this.a) {
                if (this.B.equals(str)) {
                    return;
                }
                this.B = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.g.apply();
                }
                c();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.m8)).booleanValue()) {
            b();
            synchronized (this.a) {
                if (this.A == z) {
                    return;
                }
                this.A = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.g.apply();
                }
                c();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        b();
        synchronized (this.a) {
            if (TextUtils.equals(this.y, str)) {
                return;
            }
            this.y = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j) {
        b();
        synchronized (this.a) {
            if (this.r == j) {
                return;
            }
            this.r = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i) {
        b();
        synchronized (this.a) {
            this.o = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2) {
        char c;
        b();
        synchronized (this.a) {
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
                this.l = str2;
            } else if (c == 1) {
                this.m = str2;
            } else if (c != 2) {
                return;
            } else {
                this.n = str2;
            }
            if (this.g != null) {
                if (str2.equals("-1")) {
                    this.g.remove(str);
                } else {
                    this.g.putString(str, str2);
                }
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.X7)).booleanValue()) {
            b();
            synchronized (this.a) {
                if (this.z.equals(str)) {
                    return;
                }
                this.z = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.g.apply();
                }
                c();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z) {
        b();
        synchronized (this.a) {
            if (z == this.k) {
                return;
            }
            this.k = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str, String str2, boolean z) {
        b();
        synchronized (this.a) {
            JSONArray optJSONArray = this.v.optJSONArray(str);
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
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzB().a());
                optJSONArray.put(length, jSONObject);
                this.v.put(str, optJSONArray);
            } catch (JSONException e) {
                k04.zzk("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.v.toString());
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int i) {
        b();
        synchronized (this.a) {
            if (this.s == i) {
                return;
            }
            this.s = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i) {
        b();
        synchronized (this.a) {
            if (this.D == i) {
                return;
            }
            this.D = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long j) {
        b();
        synchronized (this.a) {
            if (this.E == j) {
                return;
            }
            this.E = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z;
        b();
        synchronized (this.a) {
            z = this.w;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z;
        b();
        synchronized (this.a) {
            z = this.x;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z;
        b();
        synchronized (this.a) {
            z = this.A;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.r0)).booleanValue()) {
            b();
            synchronized (this.a) {
                z = this.k;
            }
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i;
        b();
        synchronized (this.a) {
            i = this.t;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i;
        b();
        synchronized (this.a) {
            i = this.o;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i;
        b();
        synchronized (this.a) {
            i = this.s;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j;
        b();
        synchronized (this.a) {
            j = this.q;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j;
        b();
        synchronized (this.a) {
            j = this.r;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j;
        b();
        synchronized (this.a) {
            j = this.E;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final s13 zzg() {
        if (this.b) {
            if (!(zzM() && zzN()) && ((Boolean) sa3.b.e()).booleanValue()) {
                synchronized (this.a) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.e == null) {
                        this.e = new s13();
                    }
                    this.e.e();
                    k04.zzi("start fetching content...");
                    return this.e;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final kz3 zzh() {
        kz3 kz3Var;
        b();
        synchronized (this.a) {
            kz3Var = this.p;
        }
        return kz3Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final kz3 zzi() {
        kz3 kz3Var;
        synchronized (this.a) {
            kz3Var = this.p;
        }
        return kz3Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        b();
        synchronized (this.a) {
            str = this.i;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        b();
        synchronized (this.a) {
            str = this.j;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        b();
        synchronized (this.a) {
            str = this.B;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        b();
        synchronized (this.a) {
            str = this.y;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String str) {
        char c;
        b();
        synchronized (this.a) {
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
                return this.l;
            } else if (c == 1) {
                return this.m;
            } else if (c != 2) {
                return null;
            } else {
                return this.n;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        b();
        synchronized (this.a) {
            str = this.z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        b();
        synchronized (this.a) {
            jSONObject = this.v;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(final Context context) {
        synchronized (this.a) {
            if (this.f != null) {
                return;
            }
            this.d = z04.a.P(new Runnable(context, "admob") { // from class: com.google.android.gms.ads.internal.util.zzh
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    zzj.this.a(this.zzb, this.zzc);
                }
            });
            this.b = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        b();
        synchronized (this.a) {
            this.v = new JSONObject();
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j) {
        b();
        synchronized (this.a) {
            if (this.q == j) {
                return;
            }
            this.q = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        b();
        synchronized (this.a) {
            long a = com.google.android.gms.ads.internal.zzt.zzB().a();
            if (str != null && !str.equals(this.p.c())) {
                this.p = new kz3(str, a);
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.g.putLong("app_settings_last_update_ms", a);
                    this.g.apply();
                }
                c();
                for (Runnable runnable : this.c) {
                    runnable.run();
                }
                return;
            }
            this.p.g(a);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i) {
        b();
        synchronized (this.a) {
            if (this.t == i) {
                return;
            }
            this.t = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        b();
        synchronized (this.a) {
            if (str.equals(this.i)) {
                return;
            }
            this.i = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        b();
        synchronized (this.a) {
            if (this.w == z) {
                return;
            }
            this.w = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        b();
        synchronized (this.a) {
            if (str.equals(this.j)) {
                return;
            }
            this.j = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.g.apply();
            }
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z) {
        b();
        synchronized (this.a) {
            if (this.x == z) {
                return;
            }
            this.x = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.g.apply();
            }
            c();
        }
    }
}
