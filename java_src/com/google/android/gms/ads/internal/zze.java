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

    /* renamed from: a */
    public Context f36349a;

    /* renamed from: b */
    public long f36350b = 0;

    /* renamed from: a */
    public final void m1319a(Context context, zzchu zzchuVar, boolean z, kz3 kz3Var, String str, String str2, Runnable runnable, final vo6 vo6Var) {
        PackageInfo m19341f;
        if (zzt.zzB().mo15859b() - this.f36350b < 5000) {
            k04.zzj("Not retrying to fetch app settings");
            return;
        }
        this.f36350b = zzt.zzB().mo15859b();
        if (kz3Var != null) {
            if (zzt.zzB().mo15860a() - kz3Var.m17296a() <= ((Long) zzba.zzc().m23658b(g93.f10374B3)).longValue() && kz3Var.m17288i()) {
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
            this.f36349a = applicationContext;
            final io6 m20568a = ho6.m20568a(context, 4);
            m20568a.zzh();
            xl3 m14178a = zzt.zzf().m14178a(this.f36349a, zzchuVar, vo6Var);
            rl3 rl3Var = ul3.f29176b;
            nl3 m5010a = m14178a.m5010a("google.afma.config.fetchAppSettings", rl3Var, rl3Var);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", g93.m21881a()));
                try {
                    ApplicationInfo applicationInfo = this.f36349a.getApplicationInfo();
                    if (applicationInfo != null && (m19341f = ez1.m22979a(context).m19341f(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", m19341f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                f77 mo15045a = m5010a.mo15045a(jSONObject);
                w57 w57Var = new w57() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        vo6 vo6Var2 = vo6.this;
                        io6 io6Var = m20568a;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (optBoolean) {
                            zzt.zzo().m11915h().zzu(jSONObject2.getString("appSettingsJson"));
                        }
                        io6Var.zzf(optBoolean);
                        vo6Var2.m6969b(io6Var.zzl());
                        return s67.m10634i(null);
                    }
                };
                g77 g77Var = z04.f34310f;
                f77 m10629n = s67.m10629n(mo15045a, w57Var, g77Var);
                if (runnable != null) {
                    mo15045a.mo6515f(runnable, g77Var);
                }
                c14.m25685a(m10629n, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                k04.zzh("Error requesting application settings", e);
                m20568a.mo17590e(e);
                m20568a.zzf(false);
                vo6Var.m6969b(m20568a.zzl());
            }
        }
    }

    public final void zza(Context context, zzchu zzchuVar, String str, Runnable runnable, vo6 vo6Var) {
        m1319a(context, zzchuVar, true, null, str, null, runnable, vo6Var);
    }

    public final void zzc(Context context, zzchu zzchuVar, String str, kz3 kz3Var, vo6 vo6Var) {
        m1319a(context, zzchuVar, false, kz3Var, kz3Var != null ? kz3Var.m17295b() : null, str, null, vo6Var);
    }
}
