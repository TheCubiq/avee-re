package com.daaw;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class yg3 {
    public static final zg3 a = new zg3() { // from class: com.daaw.ag3
        @Override // com.daaw.zg3
        public final void a(Object obj, Map map) {
            e84 e84Var = (e84) obj;
            zg3 zg3Var = yg3.a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                k04.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = e84Var.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z2 = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z2 = false;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                hashMap.put(str2, valueOf);
                zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((uj3) e84Var).T("openableURLs", hashMap);
        }
    };
    public static final zg3 b = new zg3() { // from class: com.daaw.bg3
        @Override // com.daaw.zg3
        public final void a(Object obj, Map map) {
            e84 e84Var = (e84) obj;
            zg3 zg3Var = yg3.a;
            if (!((Boolean) zzba.zzc().b(g93.u7)).booleanValue()) {
                k04.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                k04.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(e84Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((uj3) e84Var).T("openableApp", hashMap);
        }
    };
    public static final zg3 c = new zg3() { // from class: com.daaw.tf3
        @Override // com.daaw.zg3
        public final void a(Object obj, Map map) {
            yg3.c((e84) obj, map);
        }
    };
    public static final zg3 d = new ng3();
    public static final zg3 e = new og3();
    public static final zg3 f = new zg3() { // from class: com.daaw.zf3
        @Override // com.daaw.zg3
        public final void a(Object obj, Map map) {
            e84 e84Var = (e84) obj;
            zg3 zg3Var = yg3.a;
            String str = (String) map.get("u");
            if (str == null) {
                k04.zzj("URL missing from httpTrack GMSG.");
            } else {
                new zzby(e84Var.getContext(), ((m84) e84Var).zzp().p, str).zzb();
            }
        }
    };
    public static final zg3 g = new pg3();
    public static final zg3 h = new qg3();
    public static final zg3 i = new zg3() { // from class: com.daaw.yf3
        @Override // com.daaw.zg3
        public final void a(Object obj, Map map) {
            l84 l84Var = (l84) obj;
            zg3 zg3Var = yg3.a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                sl2 a2 = l84Var.a();
                if (a2 != null) {
                    a2.c().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                k04.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zg3 j = new rg3();
    public static final zg3 k = new sg3();
    public static final zg3 l = new u44();
    public static final zg3 m = new v44();
    public static final zg3 n = new pf3();
    public static final nh3 o = new nh3();
    public static final zg3 p = new wg3();
    public static final zg3 q = new xg3();
    public static final zg3 r = new cg3();
    public static final zg3 s = new dg3();
    public static final zg3 t = new eg3();
    public static final zg3 u = new fg3();
    public static final zg3 v = new gg3();
    public static final zg3 w = new hg3();
    public static final zg3 x = new ig3();
    public static final zg3 y = new jg3();
    public static final zg3 z = new kg3();
    public static final zg3 A = new lg3();

    public static zg3 a(final vy4 vy4Var) {
        return new zg3() { // from class: com.daaw.xf3
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                a74 a74Var = (a74) obj;
                yg3.d(map, vy4.this);
                String str = (String) map.get("u");
                if (str == null) {
                    k04.zzj("URL missing from click GMSG.");
                } else {
                    s67.r(yg3.b(a74Var, str), new mg3(a74Var), z04.a);
                }
            }
        };
    }

    public static f77 b(a74 a74Var, String str) {
        Uri parse = Uri.parse(str);
        try {
            sl2 a2 = a74Var.a();
            if (a2 != null && a2.f(parse)) {
                parse = a2.a(parse, a74Var.getContext(), a74Var.g(), a74Var.zzk());
            }
        } catch (tl2 unused) {
            k04.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String b2 = my3.b(parse, a74Var.getContext());
        long longValue = ((Long) za3.e.e()).longValue();
        if (longValue <= 0 || longValue > 224400003) {
            return s67.i(b2);
        }
        j67 D = j67.D(a74Var.r0());
        uf3 uf3Var = new ey6() { // from class: com.daaw.uf3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zg3 zg3Var = yg3.a;
                if (((Boolean) za3.k.e()).booleanValue()) {
                    zzt.zzo().u(th, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
                return "failure_click_attok";
            }
        };
        g77 g77Var = z04.f;
        return s67.f(s67.m(s67.f(D, Throwable.class, uf3Var, g77Var), new ey6() { // from class: com.daaw.vf3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                String str2 = b2;
                String str3 = (String) obj;
                zg3 zg3Var = yg3.a;
                if (str3 != null) {
                    if (((Boolean) za3.f.e()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str2).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    String str4 = (String) za3.a.e();
                    String str5 = (String) za3.b.e();
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = str2.replace(str4, str3);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str2);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                        }
                    }
                }
                return str2;
            }
        }, g77Var), Throwable.class, new ey6() { // from class: com.daaw.wf3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                String str2 = b2;
                Throwable th = (Throwable) obj;
                zg3 zg3Var = yg3.a;
                if (((Boolean) za3.k.e()).booleanValue()) {
                    zzt.zzo().u(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, g77Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:51|52|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().u(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r7 = r0;
        r0 = "Error constructing openable urls response.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        com.daaw.k04.zzh(r0, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void c(com.daaw.e84 r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yg3.c(com.daaw.e84, java.util.Map):void");
    }

    public static void d(Map map, vy4 vy4Var) {
        if (((Boolean) zzba.zzc().b(g93.V8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && vy4Var != null) {
            vy4Var.zzq();
        }
    }
}
