package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class jh3 implements zg3 {
    public final zzb a;
    public final kd5 b;
    public final on6 c;
    public final bq3 e;
    public final cq5 f;
    public zzx g = null;
    public final p04 d = new p04(null);

    public jh3(zzb zzbVar, bq3 bq3Var, cq5 cq5Var, kd5 kd5Var, on6 on6Var) {
        this.a = zzbVar;
        this.e = bq3Var;
        this.f = cq5Var;
        this.b = kd5Var;
        this.c = on6Var;
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return "c".equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    public static Uri c(Context context, sl2 sl2Var, Uri uri, View view, Activity activity) {
        if (sl2Var == null) {
            return uri;
        }
        try {
            return sl2Var.e(uri) ? sl2Var.a(uri, context, view, activity) : uri;
        } catch (tl2 unused) {
            return uri;
        } catch (Exception e) {
            zzt.zzo().u(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            k04.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    @Override // com.daaw.zg3
    /* renamed from: e */
    public final void a(zza zzaVar, Map map) {
        String str;
        boolean z;
        HashMap hashMap;
        Object obj;
        a74 a74Var = (a74) zzaVar;
        String c = my3.c((String) map.get("u"), a74Var.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            k04.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzbVar = this.a;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.a.zzb(c);
            return;
        }
        th6 d = a74Var.d();
        wh6 v = a74Var.v();
        boolean z2 = false;
        if (d == null || v == null) {
            str = "";
            z = false;
        } else {
            z = d.k0;
            str = v.b;
        }
        boolean z3 = (((Boolean) zzba.zzc().b(g93.U8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (a74Var.L()) {
                k04.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            i(false);
            ((i84) zzaVar).n0(f(map), b(map), z3);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            i(false);
            if (c != null) {
                ((i84) zzaVar).S(f(map), b(map), c, z3);
            } else {
                ((i84) zzaVar).A0(f(map), b(map), (String) map.get("html"), (String) map.get("baseurl"), z3);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = a74Var.getContext();
            if (((Boolean) zzba.zzc().b(g93.Z3)).booleanValue()) {
                if (((Boolean) zzba.zzc().b(g93.f4)).booleanValue()) {
                    zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) zzba.zzc().b(g93.d4)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) zzba.zzc().b(g93.e4);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : fz6.c(by6.b(';')).d(str3)) {
                            if (str4.equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean g = ia3.g(a74Var.getContext());
            if (z2) {
                if (g) {
                    i(true);
                    if (TextUtils.isEmpty(c)) {
                        k04.zzj("Cannot open browser with null or empty url");
                        k(7);
                        return;
                    }
                    Uri d2 = d(c(a74Var.getContext(), a74Var.a(), Uri.parse(c), a74Var.g(), a74Var.zzk()));
                    if (z && this.f != null && j(zzaVar, a74Var.getContext(), d2.toString(), str)) {
                        return;
                    }
                    this.g = new gh3(this);
                    ((i84) zzaVar).i0(new zzc(null, d2.toString(), null, null, null, null, null, null, nt0.g3(this.g).asBinder(), true), z3);
                    return;
                }
                k(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            h(zzaVar, map, z, str, z3);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            h(zzaVar, map, z, str, z3);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) zzba.zzc().b(g93.u7)).booleanValue()) {
                i(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    k04.zzj("Package name missing from open app action.");
                } else if (!z || this.f == null || !j(zzaVar, a74Var.getContext(), str5, str)) {
                    PackageManager packageManager = a74Var.getContext().getPackageManager();
                    if (packageManager == null) {
                        k04.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((i84) zzaVar).i0(new zzc(launchIntentForPackage, this.g), z3);
                    }
                }
            }
        } else {
            i(true);
            String str6 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    intent = Intent.parseUri(str6, 0);
                } catch (URISyntaxException e) {
                    k04.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri d3 = d(c(a74Var.getContext(), a74Var.a(), data, a74Var.g(), a74Var.zzk()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) zzba.zzc().b(g93.v7)).booleanValue()) {
                            intent2.setDataAndType(d3, intent2.getType());
                        }
                    }
                    intent2.setData(d3);
                }
            }
            boolean z4 = ((Boolean) zzba.zzc().b(g93.G7)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z4) {
                hashMap = hashMap2;
                obj = "p";
                this.g = new hh3(this, z3, zzaVar, hashMap2, map);
                z3 = false;
            } else {
                hashMap = hashMap2;
                obj = "p";
            }
            if (intent2 != null) {
                if (!z || this.f == null || !j(zzaVar, a74Var.getContext(), intent2.getData().toString(), str)) {
                    ((i84) zzaVar).i0(new zzc(intent2, this.g), z3);
                    return;
                } else if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((uj3) zzaVar).T("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(c)) {
                c = d(c(a74Var.getContext(), a74Var.a(), Uri.parse(c), a74Var.g(), a74Var.zzk())).toString();
            }
            if (!z || this.f == null || !j(zzaVar, a74Var.getContext(), c, str)) {
                ((i84) zzaVar).i0(new zzc((String) map.get("i"), c, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.g), z3);
            } else if (z4) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((uj3) zzaVar).T("openIntentAsync", hashMap4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
        if (com.daaw.ih3.c(r11, r5, r6, r7) == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
        r11 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.jh3.h(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    public final void i(boolean z) {
        bq3 bq3Var = this.e;
        if (bq3Var != null) {
            bq3Var.h(z);
        }
    }

    public final boolean j(zza zzaVar, Context context, String str, String str2) {
        String str3;
        kd5 kd5Var = this.b;
        if (kd5Var != null) {
            kq5.h3(context, kd5Var, this.c, this.f, str2, "offline_open");
        }
        if (zzt.zzo().x(context)) {
            this.f.K(this.d, str2);
            return false;
        }
        zzt.zzp();
        zzbr zzw = zzs.zzw(context);
        zzt.zzp();
        boolean a = gt0.b(context).a();
        boolean zzh = zzt.zzq().zzh(context, "offline_notification_channel");
        a74 a74Var = (a74) zzaVar;
        boolean z = a74Var.o().i() && a74Var.zzk() == null;
        if (a && !zzh && zzw != null && !z) {
            if (((Boolean) zzba.zzc().b(g93.C7)).booleanValue()) {
                if (a74Var.o().i()) {
                    kq5.j3(a74Var.zzk(), null, zzw, this.f, this.b, this.c, str2, str);
                } else {
                    ((i84) zzaVar).h0(zzw, this.f, this.b, this.c, str2, str, 14);
                }
                kd5 kd5Var2 = this.b;
                if (kd5Var2 != null) {
                    kq5.h3(context, kd5Var2, this.c, this.f, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        this.f.q(str2);
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            if (!a) {
                str3 = "notifications_disabled";
            } else if (zzh) {
                str3 = "notification_channel_disabled";
            } else if (zzw == null) {
                str3 = "work_manager_unavailable";
            } else {
                if (((Boolean) zzba.zzc().b(g93.C7)).booleanValue()) {
                    if (z) {
                        str3 = "fullscreen_no_activity";
                    }
                    kq5.i3(context, this.b, this.c, this.f, str2, "dialog_not_shown", hashMap);
                } else {
                    str3 = "notification_flow_disabled";
                }
            }
            hashMap.put("dialog_not_shown_reason", str3);
            kq5.i3(context, this.b, this.c, this.f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    public final void k(int i) {
        if (this.b == null) {
            return;
        }
        if (((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
            on6 on6Var = this.c;
            nn6 b = nn6.b("cct_action");
            b.a("cct_open_status", ha3.a(i));
            on6Var.a(b);
            return;
        }
        jd5 a = this.b.a();
        a.b("action", "cct_action");
        a.b("cct_open_status", ha3.a(i));
        a.g();
    }
}
