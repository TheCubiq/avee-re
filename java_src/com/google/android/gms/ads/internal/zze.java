package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.daaw.c14;
import com.daaw.ez1;
import com.daaw.f77;
import com.daaw.g77;
import com.daaw.g93;
import com.daaw.ho6;
import com.daaw.io6;
import com.daaw.k04;
import com.daaw.kz3;
import com.daaw.nl3;
import com.daaw.rl3;
import com.daaw.s67;
import com.daaw.ul3;
import com.daaw.vo6;
import com.daaw.w57;
import com.daaw.xl3;
import com.daaw.z04;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zze {
    public Context a;
    public long b = 0;

    public final void a(Context context, zzchu zzchuVar, boolean z, kz3 kz3Var, String str, String str2, Runnable runnable, final vo6 vo6Var) {
        PackageInfo f;
        if (zzt.zzB().b() - this.b < 5000) {
            k04.zzj("Not retrying to fetch app settings");
            return;
        }
        this.b = zzt.zzB().b();
        if (kz3Var != null) {
            if (zzt.zzB().a() - kz3Var.a() <= ((Long) zzba.zzc().b(g93.B3)).longValue() && kz3Var.i()) {
                return;
            }
        }
        if (context == null) {
            k04.zzj("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            k04.zzj("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.a = applicationContext;
            final io6 a = ho6.a(context, 4);
            a.zzh();
            xl3 a2 = zzt.zzf().a(this.a, zzchuVar, vo6Var);
            rl3 rl3Var = ul3.b;
            nl3 a3 = a2.a("google.afma.config.fetchAppSettings", rl3Var, rl3Var);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", g93.a()));
                try {
                    ApplicationInfo applicationInfo = this.a.getApplicationInfo();
                    if (applicationInfo != null && (f = ez1.a(context).f(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                f77 a4 = a3.a(jSONObject);
                w57 w57Var = new w57() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        vo6 vo6Var2 = vo6.this;
                        io6 io6Var = a;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (optBoolean) {
                            zzt.zzo().h().zzu(jSONObject2.getString("appSettingsJson"));
                        }
                        io6Var.zzf(optBoolean);
                        vo6Var2.b(io6Var.zzl());
                        return s67.i(null);
                    }
                };
                g77 g77Var = z04.f;
                f77 n = s67.n(a4, w57Var, g77Var);
                if (runnable != null) {
                    a4.f(runnable, g77Var);
                }
                c14.a(n, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                k04.zzh("Error requesting application settings", e);
                a.e(e);
                a.zzf(false);
                vo6Var.b(a.zzl());
            }
        }
    }

    public final void zza(Context context, zzchu zzchuVar, String str, Runnable runnable, vo6 vo6Var) {
        a(context, zzchuVar, true, null, str, null, runnable, vo6Var);
    }

    public final void zzc(Context context, zzchu zzchuVar, String str, kz3 kz3Var, vo6 vo6Var) {
        a(context, zzchuVar, false, kz3Var, kz3Var != null ? kz3Var.b() : null, str, null, vo6Var);
    }
}
