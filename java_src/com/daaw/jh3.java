package com.daaw;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class jh3 implements zg3 {

    /* renamed from: a */
    public final zzb f15104a;

    /* renamed from: b */
    public final kd5 f15105b;

    /* renamed from: c */
    public final on6 f15106c;

    /* renamed from: e */
    public final bq3 f15108e;

    /* renamed from: f */
    public final cq5 f15109f;

    /* renamed from: g */
    public zzx f15110g = null;

    /* renamed from: d */
    public final p04 f15107d = new p04(null);

    public jh3(zzb zzbVar, bq3 bq3Var, cq5 cq5Var, kd5 kd5Var, on6 on6Var) {
        this.f15104a = zzbVar;
        this.f15108e = bq3Var;
        this.f15109f = cq5Var;
        this.f15105b = kd5Var;
        this.f15106c = on6Var;
    }

    /* renamed from: b */
    public static int m18516b(Map map) {
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

    /* renamed from: c */
    public static Uri m18515c(Context context, sl2 sl2Var, Uri uri, View view, Activity activity) {
        if (sl2Var == null) {
            return uri;
        }
        try {
            return sl2Var.m10200e(uri) ? sl2Var.m10204a(uri, context, view, activity) : uri;
        } catch (tl2 unused) {
            return uri;
        } catch (Exception e) {
            zzt.zzo().m11902u(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* renamed from: d */
    public static Uri m18514d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            k04.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    /* renamed from: f */
    public static boolean m18512f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    @Override // com.daaw.zg3
    /* renamed from: e */
    public final void mo2341a(zza zzaVar, Map map) {
        String str;
        boolean z;
        HashMap hashMap;
        Object obj;
        a74 a74Var = (a74) zzaVar;
        String m15658c = my3.m15658c((String) map.get("u"), a74Var.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            k04.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzbVar = this.f15104a;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.f15104a.zzb(m15658c);
            return;
        }
        th6 mo6421d = a74Var.mo6421d();
        wh6 mo6398v = a74Var.mo6398v();
        boolean z2 = false;
        if (mo6421d == null || mo6398v == null) {
            str = "";
            z = false;
        } else {
            z = mo6421d.f27701k0;
            str = mo6398v.f31252b;
        }
        boolean z3 = (((Boolean) zzba.zzc().m23658b(g93.f10570U8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (a74Var.mo6449L()) {
                k04.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            m18509i(false);
            ((i84) zzaVar).mo6409n0(m18512f(map), m18516b(map), z3);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            m18509i(false);
            if (m15658c != null) {
                ((i84) zzaVar).mo6436S(m18512f(map), m18516b(map), m15658c, z3);
            } else {
                ((i84) zzaVar).mo6464A0(m18512f(map), m18516b(map), (String) map.get("html"), (String) map.get("baseurl"), z3);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = a74Var.getContext();
            if (((Boolean) zzba.zzc().m23658b(g93.f10615Z3)).booleanValue()) {
                if (((Boolean) zzba.zzc().m23658b(g93.f10681f4)).booleanValue()) {
                    zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) zzba.zzc().m23658b(g93.f10659d4)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) zzba.zzc().m23658b(g93.f10670e4);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : fz6.m22122c(by6.m25734b(';')).m22121d(str3)) {
                            if (str4.equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean m20002g = ia3.m20002g(a74Var.getContext());
            if (z2) {
                if (m20002g) {
                    m18509i(true);
                    if (TextUtils.isEmpty(m15658c)) {
                        k04.zzj("Cannot open browser with null or empty url");
                        m18507k(7);
                        return;
                    }
                    Uri m18514d = m18514d(m18515c(a74Var.getContext(), a74Var.mo6425a(), Uri.parse(m15658c), a74Var.mo6418g(), a74Var.zzk()));
                    if (z && this.f15109f != null && m18508j(zzaVar, a74Var.getContext(), m18514d.toString(), str)) {
                        return;
                    }
                    this.f15110g = new gh3(this);
                    ((i84) zzaVar).mo6413i0(new zzc(null, m18514d.toString(), null, null, null, null, null, null, nt0.m14830g3(this.f15110g).asBinder(), true), z3);
                    return;
                }
                m18507k(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            m18510h(zzaVar, map, z, str, z3);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m18510h(zzaVar, map, z, str, z3);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10849u7)).booleanValue()) {
                m18509i(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    k04.zzj("Package name missing from open app action.");
                } else if (!z || this.f15109f == null || !m18508j(zzaVar, a74Var.getContext(), str5, str)) {
                    PackageManager packageManager = a74Var.getContext().getPackageManager();
                    if (packageManager == null) {
                        k04.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((i84) zzaVar).mo6413i0(new zzc(launchIntentForPackage, this.f15110g), z3);
                    }
                }
            }
        } else {
            m18509i(true);
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
                    Uri m18514d2 = m18514d(m18515c(a74Var.getContext(), a74Var.mo6425a(), data, a74Var.mo6418g(), a74Var.zzk()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) zzba.zzc().m23658b(g93.f10860v7)).booleanValue()) {
                            intent2.setDataAndType(m18514d2, intent2.getType());
                        }
                    }
                    intent2.setData(m18514d2);
                }
            }
            boolean z4 = ((Boolean) zzba.zzc().m23658b(g93.f10429G7)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z4) {
                hashMap = hashMap2;
                obj = "p";
                this.f15110g = new hh3(this, z3, zzaVar, hashMap2, map);
                z3 = false;
            } else {
                hashMap = hashMap2;
                obj = "p";
            }
            if (intent2 != null) {
                if (!z || this.f15109f == null || !m18508j(zzaVar, a74Var.getContext(), intent2.getData().toString(), str)) {
                    ((i84) zzaVar).mo6413i0(new zzc(intent2, this.f15110g), z3);
                    return;
                } else if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((uj3) zzaVar).mo6434T("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(m15658c)) {
                m15658c = m18514d(m18515c(a74Var.getContext(), a74Var.mo6425a(), Uri.parse(m15658c), a74Var.mo6418g(), a74Var.zzk())).toString();
            }
            if (!z || this.f15109f == null || !m18508j(zzaVar, a74Var.getContext(), m15658c, str)) {
                ((i84) zzaVar).mo6413i0(new zzc((String) map.get("i"), m15658c, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.f15110g), z3);
            } else if (z4) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((uj3) zzaVar).mo6434T("openIntentAsync", hashMap4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
        if (com.daaw.ih3.m19819c(r11, r5, r6, r7) == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
        r11 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m18510h(zza zzaVar, Map map, boolean z, String str, boolean z2) {
        Uri.Builder scheme;
        ResolveInfo m19818d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo m19819c;
        boolean z3 = true;
        m18509i(true);
        a74 a74Var = (a74) zzaVar;
        Context context = a74Var.getContext();
        sl2 mo6425a = a74Var.mo6425a();
        View mo6418g = a74Var.mo6418g();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent = null;
        Uri uri = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri m18514d = m18514d(m18515c(context, mo6425a, Uri.parse(str2), mo6418g, null));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) zzba.zzc().m23658b(g93.f10595X3)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(m18514d.getScheme())) {
                scheme = m18514d.buildUpon().scheme("https");
            } else {
                if ("https".equalsIgnoreCase(m18514d.getScheme())) {
                    scheme = m18514d.buildUpon().scheme("http");
                }
                ArrayList arrayList = new ArrayList();
                Intent m19821a = ih3.m19821a(m18514d, context, mo6425a, mo6418g);
                Intent m19821a2 = ih3.m19821a(uri, context, mo6425a, mo6418g);
                if (z3) {
                    zzt.zzp();
                    zzs.zzm(context, m19821a);
                    zzt.zzp();
                    zzs.zzm(context, m19821a2);
                }
                m19818d = ih3.m19818d(m19821a, arrayList, context, mo6425a, mo6418g);
                if (m19818d == null) {
                    intent = ih3.m19820b(m19821a, m19818d, context, mo6425a, mo6418g);
                } else {
                    if (m19821a2 != null && (m19819c = ih3.m19819c(m19821a2, context, mo6425a, mo6418g)) != null) {
                        intent = ih3.m19820b(m19821a, m19819c, context, mo6425a, mo6418g);
                    }
                    if (!arrayList.isEmpty()) {
                        if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            int size = arrayList.size();
                            int i = 0;
                            loop0: while (i < size) {
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i2 = i + 1;
                                    if (it.hasNext()) {
                                        if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                            intent = ih3.m19820b(m19821a, resolveInfo, context, mo6425a, mo6418g);
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                        if (parseBoolean) {
                            intent = ih3.m19820b(m19821a, (ResolveInfo) arrayList.get(0), context, mo6425a, mo6418g);
                        }
                    }
                    intent = m19821a;
                }
            }
            uri = scheme.build();
            ArrayList arrayList2 = new ArrayList();
            Intent m19821a3 = ih3.m19821a(m18514d, context, mo6425a, mo6418g);
            Intent m19821a22 = ih3.m19821a(uri, context, mo6425a, mo6418g);
            if (z3) {
            }
            m19818d = ih3.m19818d(m19821a3, arrayList2, context, mo6425a, mo6418g);
            if (m19818d == null) {
            }
        }
        if (!z || this.f15109f == null || intent == null || !m18508j(zzaVar, a74Var.getContext(), intent.getData().toString(), str)) {
            try {
                ((i84) zzaVar).mo6413i0(new zzc(intent, this.f15110g), z2);
            } catch (ActivityNotFoundException e) {
                k04.zzj(e.getMessage());
            }
        }
    }

    /* renamed from: i */
    public final void m18509i(boolean z) {
        bq3 bq3Var = this.f15108e;
        if (bq3Var != null) {
            bq3Var.m25923h(z);
        }
    }

    /* renamed from: j */
    public final boolean m18508j(zza zzaVar, Context context, String str, String str2) {
        String str3;
        kd5 kd5Var = this.f15105b;
        if (kd5Var != null) {
            kq5.m17485h3(context, kd5Var, this.f15106c, this.f15109f, str2, "offline_open");
        }
        if (zzt.zzo().m11899x(context)) {
            this.f15109f.m25124K(this.f15107d, str2);
            return false;
        }
        zzt.zzp();
        zzbr zzw = zzs.zzw(context);
        zzt.zzp();
        boolean m21241a = gt0.m21240b(context).m21241a();
        boolean zzh = zzt.zzq().zzh(context, "offline_notification_channel");
        a74 a74Var = (a74) zzaVar;
        boolean z = a74Var.mo6408o().m7329i() && a74Var.zzk() == null;
        if (m21241a && !zzh && zzw != null && !z) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10389C7)).booleanValue()) {
                if (a74Var.mo6408o().m7329i()) {
                    kq5.m17483j3(a74Var.zzk(), null, zzw, this.f15109f, this.f15105b, this.f15106c, str2, str);
                } else {
                    ((i84) zzaVar).mo6415h0(zzw, this.f15109f, this.f15105b, this.f15106c, str2, str, 14);
                }
                kd5 kd5Var2 = this.f15105b;
                if (kd5Var2 != null) {
                    kq5.m17485h3(context, kd5Var2, this.f15106c, this.f15109f, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        this.f15109f.m25119q(str2);
        if (this.f15105b != null) {
            HashMap hashMap = new HashMap();
            if (!m21241a) {
                str3 = "notifications_disabled";
            } else if (zzh) {
                str3 = "notification_channel_disabled";
            } else if (zzw == null) {
                str3 = "work_manager_unavailable";
            } else {
                if (((Boolean) zzba.zzc().m23658b(g93.f10389C7)).booleanValue()) {
                    if (z) {
                        str3 = "fullscreen_no_activity";
                    }
                    kq5.m17484i3(context, this.f15105b, this.f15106c, this.f15109f, str2, "dialog_not_shown", hashMap);
                } else {
                    str3 = "notification_flow_disabled";
                }
            }
            hashMap.put("dialog_not_shown_reason", str3);
            kq5.m17484i3(context, this.f15105b, this.f15106c, this.f15109f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* renamed from: k */
    public final void m18507k(int i) {
        if (this.f15105b == null) {
            return;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
            on6 on6Var = this.f15106c;
            nn6 m14953b = nn6.m14953b("cct_action");
            m14953b.m14954a("cct_open_status", ha3.m20887a(i));
            on6Var.mo7889a(m14953b);
            return;
        }
        jd5 m17776a = this.f15105b.m17776a();
        m17776a.m18590b("action", "cct_action");
        m17776a.m18590b("cct_open_status", ha3.m20887a(i));
        m17776a.m18585g();
    }
}
