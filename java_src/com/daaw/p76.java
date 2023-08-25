package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class p76 implements i76 {

    /* renamed from: a */
    public final g77 f22666a;

    /* renamed from: b */
    public final Context f22667b;

    public p76(g77 g77Var, Context context) {
        this.f22666a = g77Var;
        this.f22667b = context;
    }

    /* renamed from: b */
    public static ResolveInfo m13611b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(1:60)|4|(1:6)(1:59)|7|(3:9|(2:12|10)|13)|14|(3:53|54|(14:56|17|18|19|(9:21|22|23|(1:25)(2:36|(3:39|(3:42|(2:45|46)(1:44)|40)|47))|26|27|(1:35)(1:31)|32|33)|49|23|(0)(0)|26|27|(1:29)|35|32|33))|16|17|18|19|(0)|49|23|(0)(0)|26|27|(0)|35|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:26:0x009c, B:28:0x00aa), top: B:57:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ n76 m13612a() {
        ActivityInfo activityInfo;
        PackageInfo m19341f;
        String str;
        String str2;
        String str3;
        boolean equals;
        PackageInfo m19341f2;
        PackageManager packageManager = this.f22667b.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z = m13611b(packageManager, "geo:0,0?q=donuts") != null;
        boolean z2 = m13611b(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        zzt.zzp();
        zzay.zzb();
        boolean m24808x = d04.m24808x();
        boolean m14838c = C2365nt.m14838c(this.f22667b);
        boolean m14837d = C2365nt.m14837d(this.f22667b);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        Context context = this.f22667b;
        ResolveInfo m13611b = m13611b(packageManager, "market://details?id=com.google.android.gms.ads");
        if (m13611b != null && (activityInfo = m13611b.activityInfo) != null) {
            try {
                m19341f = ez1.m22979a(context).m19341f(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (m19341f != null) {
                str = m19341f.versionCode + "." + activityInfo.packageName;
                m19341f2 = ez1.m22979a(this.f22667b).m19341f("com.android.vending", 128);
                if (m19341f2 != null) {
                    str2 = m19341f2.versionCode + "." + m19341f2.packageName;
                    String str4 = Build.FINGERPRINT;
                    Context context2 = this.f22667b;
                    if (packageManager == null) {
                        str3 = str4;
                    } else {
                        str3 = str4;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(n08.m15611a(context2));
                                    break;
                                }
                            }
                        }
                    }
                    equals = false;
                    zzt.zzp();
                    return new n76(z, z2, country, m24808x, m14838c, m14837d, language, arrayList, str, str2, str3, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024, !((Boolean) zzba.zzc().m23658b(g93.f10829s9)).booleanValue() && C2365nt.m14839b(this.f22667b));
                }
                str2 = null;
                String str42 = Build.FINGERPRINT;
                Context context22 = this.f22667b;
                if (packageManager == null) {
                }
                equals = false;
                zzt.zzp();
                return new n76(z, z2, country, m24808x, m14838c, m14837d, language, arrayList, str, str2, str3, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024, !((Boolean) zzba.zzc().m23658b(g93.f10829s9)).booleanValue() && C2365nt.m14839b(this.f22667b));
            }
        }
        str = null;
        m19341f2 = ez1.m22979a(this.f22667b).m19341f("com.android.vending", 128);
        if (m19341f2 != null) {
        }
        str2 = null;
        String str422 = Build.FINGERPRINT;
        Context context222 = this.f22667b;
        if (packageManager == null) {
        }
        equals = false;
        zzt.zzp();
        return new n76(z, z2, country, m24808x, m14838c, m14837d, language, arrayList, str, str2, str3, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024, !((Boolean) zzba.zzc().m23658b(g93.f10829s9)).booleanValue() && C2365nt.m14839b(this.f22667b));
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 38;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f22666a.mo20112M(new Callable() { // from class: com.daaw.o76
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p76.this.m13612a();
            }
        });
    }
}
