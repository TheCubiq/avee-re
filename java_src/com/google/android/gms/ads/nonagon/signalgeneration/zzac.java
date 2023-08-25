package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.daaw.b94;
import com.daaw.ey6;
import com.daaw.f77;
import com.daaw.fd5;
import com.daaw.g77;
import com.daaw.g93;
import com.daaw.ho6;
import com.daaw.hz6;
import com.daaw.io6;
import com.daaw.j67;
import com.daaw.k04;
import com.daaw.kx8;
import com.daaw.ky8;
import com.daaw.lw4;
import com.daaw.nt0;
import com.daaw.oj1;
import com.daaw.op6;
import com.daaw.pd5;
import com.daaw.pi6;
import com.daaw.pj6;
import com.daaw.q32;
import com.daaw.rs3;
import com.daaw.s67;
import com.daaw.sl2;
import com.daaw.sp4;
import com.daaw.sz8;
import com.daaw.ta3;
import com.daaw.tl2;
import com.daaw.to6;
import com.daaw.u85;
import com.daaw.v57;
import com.daaw.vo6;
import com.daaw.w42;
import com.daaw.w57;
import com.daaw.wy3;
import com.daaw.y83;
import com.daaw.yd0;
import com.daaw.yy3;
import com.daaw.z04;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzac extends yy3 {

    /* renamed from: S */
    public static final List f36473S = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: T */
    public static final List f36474T = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: U */
    public static final List f36475U = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: V */
    public static final List f36476V = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;

    /* renamed from: A */
    public final zzc f36477A;

    /* renamed from: B */
    public final pd5 f36478B;

    /* renamed from: C */
    public final op6 f36479C;

    /* renamed from: K */
    public final zzchu f36487K;

    /* renamed from: L */
    public String f36488L;

    /* renamed from: N */
    public final List f36490N;

    /* renamed from: O */
    public final List f36491O;

    /* renamed from: P */
    public final List f36492P;

    /* renamed from: Q */
    public final List f36493Q;

    /* renamed from: p */
    public final b94 f36495p;

    /* renamed from: q */
    public Context f36496q;

    /* renamed from: r */
    public final sl2 f36497r;

    /* renamed from: s */
    public final pj6 f36498s;

    /* renamed from: u */
    public final g77 f36500u;

    /* renamed from: v */
    public final ScheduledExecutorService f36501v;

    /* renamed from: w */
    public zzcao f36502w;

    /* renamed from: t */
    public fd5 f36499t = null;

    /* renamed from: x */
    public Point f36503x = new Point();

    /* renamed from: y */
    public Point f36504y = new Point();

    /* renamed from: z */
    public final Set f36505z = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: J */
    public final AtomicInteger f36486J = new AtomicInteger(0);

    /* renamed from: R */
    public final g77 f36494R = z04.f34309e;

    /* renamed from: D */
    public final boolean f36480D = ((Boolean) zzba.zzc().m23658b(g93.f10438H6)).booleanValue();

    /* renamed from: E */
    public final boolean f36481E = ((Boolean) zzba.zzc().m23658b(g93.f10428G6)).booleanValue();

    /* renamed from: F */
    public final boolean f36482F = ((Boolean) zzba.zzc().m23658b(g93.f10448I6)).booleanValue();

    /* renamed from: G */
    public final boolean f36483G = ((Boolean) zzba.zzc().m23658b(g93.f10468K6)).booleanValue();

    /* renamed from: H */
    public final String f36484H = (String) zzba.zzc().m23658b(g93.f10458J6);

    /* renamed from: I */
    public final String f36485I = (String) zzba.zzc().m23658b(g93.f10478L6);

    /* renamed from: M */
    public final String f36489M = (String) zzba.zzc().m23658b(g93.f10488M6);

    public zzac(b94 b94Var, Context context, sl2 sl2Var, pj6 pj6Var, g77 g77Var, ScheduledExecutorService scheduledExecutorService, pd5 pd5Var, op6 op6Var, zzchu zzchuVar) {
        List list;
        this.f36495p = b94Var;
        this.f36496q = context;
        this.f36497r = sl2Var;
        this.f36498s = pj6Var;
        this.f36500u = g77Var;
        this.f36501v = scheduledExecutorService;
        this.f36477A = b94Var.mo26247s();
        this.f36478B = pd5Var;
        this.f36479C = op6Var;
        this.f36487K = zzchuVar;
        if (((Boolean) zzba.zzc().m23658b(g93.f10498N6)).booleanValue()) {
            this.f36490N = m1276E3((String) zzba.zzc().m23658b(g93.f10508O6));
            this.f36491O = m1276E3((String) zzba.zzc().m23658b(g93.f10518P6));
            this.f36492P = m1276E3((String) zzba.zzc().m23658b(g93.f10528Q6));
            list = m1276E3((String) zzba.zzc().m23658b(g93.f10538R6));
        } else {
            this.f36490N = f36473S;
            this.f36491O = f36474T;
            this.f36492P = f36475U;
            list = f36476V;
        }
        this.f36493Q = list;
    }

    /* renamed from: B3 */
    public static boolean m1279B3(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: D3 */
    public static final Uri m1277D3(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    /* renamed from: E3 */
    public static final List m1276E3(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!hz6.m20315d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: M3 */
    public static /* bridge */ /* synthetic */ to6 m1268M3(f77 f77Var, zzcgj zzcgjVar) {
        if (vo6.m6970a() && ((Boolean) ta3.f27160e.m16137e()).booleanValue()) {
            try {
                to6 zzb = ((zzh) s67.m10627p(f77Var)).zzb();
                zzb.m8899d(new ArrayList(Collections.singletonList(zzcgjVar.f36990q)));
                com.google.android.gms.ads.internal.client.zzl zzlVar = zzcgjVar.f36992s;
                zzb.m8901b(zzlVar == null ? "" : zzlVar.zzp);
                return zzb;
            } catch (ExecutionException e) {
                com.google.android.gms.ads.internal.zzt.zzo().m11902u(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
                return null;
            }
        }
        return null;
    }

    /* renamed from: l3 */
    public static /* bridge */ /* synthetic */ void m1255l3(zzac zzacVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzacVar.m1246u3((Uri) it.next())) {
                zzacVar.f36486J.getAndIncrement();
                return;
            }
        }
    }

    /* renamed from: m3 */
    public static /* bridge */ /* synthetic */ void m1254m3(final zzac zzacVar, final String str, final String str2, final fd5 fd5Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10826s6)).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10892y6)).booleanValue()) {
                z04.f34305a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzac.this.m1251p3(str, str2, fd5Var);
                    }
                });
            } else {
                zzacVar.f36477A.zzd(str, str2, fd5Var);
            }
        }
    }

    /* renamed from: w3 */
    public static final /* synthetic */ Uri m1244w3(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m1277D3(uri, "nas", str) : uri;
    }

    /* renamed from: A3 */
    public final void m1280A3(final List list, final yd0 yd0Var, rs3 rs3Var, boolean z) {
        if (!((Boolean) zzba.zzc().m23658b(g93.f10578V6)).booleanValue()) {
            try {
                rs3Var.mo4546a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                k04.zzh("", e);
                return;
            }
        }
        f77 mo20112M = this.f36500u.mo20112M(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzac.this.m1258i3(list, yd0Var);
            }
        });
        if (m1278C3()) {
            mo20112M = s67.m10629n(mo20112M, new w57() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return zzac.this.m1264Q3((ArrayList) obj);
                }
            }, this.f36500u);
        } else {
            k04.zzi("Asset view map is empty.");
        }
        s67.m10625r(mo20112M, new ky8(this, rs3Var, z), this.f36495p.mo26277c());
    }

    /* renamed from: C3 */
    public final boolean m1278C3() {
        Map map;
        zzcao zzcaoVar = this.f36502w;
        return (zzcaoVar == null || (map = zzcaoVar.f36883q) == null || map.isEmpty()) ? false : true;
    }

    /* renamed from: H3 */
    public final /* synthetic */ Uri m1273H3(Uri uri, yd0 yd0Var) {
        try {
            uri = this.f36497r.m10204a(uri, this.f36496q, (View) nt0.m14831M(yd0Var), null);
        } catch (tl2 e) {
            k04.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* renamed from: L3 */
    public final /* synthetic */ zzh m1269L3(zzcgj zzcgjVar) {
        return m1243x3(this.f36496q, zzcgjVar.f36989p, zzcgjVar.f36990q, zzcgjVar.f36991r, zzcgjVar.f36992s);
    }

    /* renamed from: O3 */
    public final /* synthetic */ f77 m1266O3() {
        return m1243x3(this.f36496q, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    /* renamed from: P3 */
    public final /* synthetic */ f77 m1265P3(u85[] u85VarArr, String str, u85 u85Var) {
        u85VarArr[0] = u85Var;
        Context context = this.f36496q;
        zzcao zzcaoVar = this.f36502w;
        Map map = zzcaoVar.f36883q;
        JSONObject zzd = zzbx.zzd(context, map, map, zzcaoVar.f36882p, null);
        JSONObject zzg = zzbx.zzg(this.f36496q, this.f36502w.f36882p);
        JSONObject zzf = zzbx.zzf(this.f36502w.f36882p);
        JSONObject zze2 = zzbx.zze(this.f36496q, this.f36502w.f36882p);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc(null, this.f36496q, this.f36504y, this.f36503x));
        }
        return u85Var.m8430d(str, jSONObject);
    }

    /* renamed from: Q3 */
    public final /* synthetic */ f77 m1264Q3(final ArrayList arrayList) {
        return s67.m10630m(m1242y3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new ey6() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return zzac.this.m1259h3(arrayList, (String) obj);
            }
        }, this.f36500u);
    }

    /* renamed from: h3 */
    public final /* synthetic */ ArrayList m1259h3(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (m1245v3(uri) && !TextUtils.isEmpty(str)) {
                uri = m1277D3(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    /* renamed from: i3 */
    public final /* synthetic */ ArrayList m1258i3(List list, yd0 yd0Var) {
        String zzh = this.f36497r.m10202c() != null ? this.f36497r.m10202c().zzh(this.f36496q, (View) nt0.m14831M(yd0Var), null) : "";
        if (TextUtils.isEmpty(zzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (m1245v3(uri)) {
                uri = m1277D3(uri, "ms", zzh);
            } else {
                k04.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
            }
            arrayList.add(uri);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    /* renamed from: n3 */
    public final /* synthetic */ void m1253n3(WebView webView) {
        CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb(this.f36496q);
        boolean acceptThirdPartyCookies = zzb != null ? zzb.acceptThirdPartyCookies(webView) : false;
        if (((Boolean) zzba.zzc().m23658b(g93.f10390C8)).booleanValue()) {
            pd5 pd5Var = this.f36478B;
            fd5 fd5Var = this.f36499t;
            Pair[] pairArr = new Pair[1];
            pairArr[0] = new Pair("tpc", true != acceptThirdPartyCookies ? "0" : "1");
            zzf.zzc(pd5Var, fd5Var, "reg_wv", pairArr);
        }
        if (acceptThirdPartyCookies) {
            Context context = this.f36496q;
            y83 y83Var = g93.f10410E8;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.setRequestAgent("paw");
            InterstitialAd.load(context, (String) zzba.zzc().m23658b(y83Var), builder.build(), new w42(this));
        }
    }

    /* renamed from: o3 */
    public final /* synthetic */ void m1252o3(u85[] u85VarArr) {
        u85 u85Var = u85VarArr[0];
        if (u85Var != null) {
            this.f36498s.m13328b(s67.m10634i(u85Var));
        }
    }

    /* renamed from: p3 */
    public final /* synthetic */ void m1251p3(String str, String str2, fd5 fd5Var) {
        this.f36477A.zzd(str, str2, fd5Var);
    }

    /* renamed from: u3 */
    public final boolean m1246u3(Uri uri) {
        return m1279B3(uri, this.f36490N, this.f36491O);
    }

    /* renamed from: v3 */
    public final boolean m1245v3(Uri uri) {
        return m1279B3(uri, this.f36492P, this.f36493Q);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: x3 */
    public final zzh m1243x3(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        char c;
        pi6 pi6Var = new pi6();
        if ("REWARDED".equals(str2)) {
            pi6Var.m13374F().m2296a(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            pi6Var.m13374F().m2296a(3);
        }
        zzg mo26245t = this.f36495p.mo26245t();
        sp4 sp4Var = new sp4();
        sp4Var.m10066c(context);
        if (str == null) {
            str = "adUnitId";
        }
        pi6Var.m13370J(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        pi6Var.m13358e(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            zzqVar = c != 0 ? (c == 1 || c == 2) ? com.google.android.gms.ads.internal.client.zzq.zzd() : c != 3 ? c != 4 ? new com.google.android.gms.ads.internal.client.zzq() : com.google.android.gms.ads.internal.client.zzq.zzb() : com.google.android.gms.ads.internal.client.zzq.zzc() : new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
        }
        pi6Var.m13371I(zzqVar);
        pi6Var.m13365O(true);
        sp4Var.m10063f(pi6Var.m13356g());
        mo26245t.zza(sp4Var.m10062g());
        zzae zzaeVar = new zzae();
        zzaeVar.zza(str2);
        mo26245t.zzb(new zzag(zzaeVar, null));
        new lw4();
        zzh zzc = mo26245t.zzc();
        this.f36499t = zzc.zza();
        return zzc;
    }

    /* renamed from: y3 */
    public final f77 m1242y3(final String str) {
        final u85[] u85VarArr = new u85[1];
        f77 m10629n = s67.m10629n(this.f36498s.m13329a(), new w57() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return zzac.this.m1265P3(u85VarArr, str, (u85) obj);
            }
        }, this.f36500u);
        m10629n.mo6515f(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() {
                zzac.this.m1252o3(u85VarArr);
            }
        }, this.f36500u);
        return s67.m10637f(s67.m10630m((j67) s67.m10628o(j67.m18784D(m10629n), ((Integer) zzba.zzc().m23658b(g93.f10588W6)).intValue(), TimeUnit.MILLISECONDS, this.f36501v), new ey6() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                int i = zzac.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f36500u), Exception.class, new ey6() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                int i = zzac.zze;
                k04.zzh("", (Exception) obj);
                return null;
            }
        }, this.f36500u);
    }

    /* renamed from: z3 */
    public final void m1241z3(List list, final yd0 yd0Var, rs3 rs3Var, boolean z) {
        f77 mo20112M;
        if (!((Boolean) zzba.zzc().m23658b(g93.f10578V6)).booleanValue()) {
            k04.zzj("The updating URL feature is not enabled.");
            try {
                rs3Var.mo4546a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                k04.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (m1246u3((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            k04.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (m1246u3(uri)) {
                mo20112M = this.f36500u.mo20112M(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzac.this.m1273H3(uri, yd0Var);
                    }
                });
                if (m1278C3()) {
                    mo20112M = s67.m10629n(mo20112M, new w57() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                        @Override // com.daaw.w57
                        public final f77 zza(Object obj) {
                            f77 m10630m;
                            m10630m = s67.m10630m(r0.m1242y3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new ey6() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                                @Override // com.daaw.ey6
                                public final Object apply(Object obj2) {
                                    return zzac.m1244w3(r2, (String) obj2);
                                }
                            }, zzac.this.f36500u);
                            return m10630m;
                        }
                    }, this.f36500u);
                } else {
                    k04.zzi("Asset view map is empty.");
                }
            } else {
                k04.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                mo20112M = s67.m10634i(uri);
            }
            arrayList.add(mo20112M);
        }
        s67.m10625r(s67.m10638e(arrayList), new sz8(this, rs3Var, z), this.f36495p.mo26277c());
    }

    @Override // com.daaw.zy3
    public final void zze(yd0 yd0Var, final zzcgj zzcgjVar, wy3 wy3Var) {
        f77 m10634i;
        f77 zzc;
        Context context = (Context) nt0.m14831M(yd0Var);
        this.f36496q = context;
        io6 m20568a = ho6.m20568a(context, 22);
        m20568a.zzh();
        if (((Boolean) zzba.zzc().m23658b(g93.f10719i9)).booleanValue()) {
            g77 g77Var = z04.f34305a;
            m10634i = g77Var.mo20112M(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzac.this.m1269L3(zzcgjVar);
                }
            });
            zzc = s67.m10629n(m10634i, new w57() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, g77Var);
        } else {
            zzh m1243x3 = m1243x3(this.f36496q, zzcgjVar.f36989p, zzcgjVar.f36990q, zzcgjVar.f36991r, zzcgjVar.f36992s);
            m10634i = s67.m10634i(m1243x3);
            zzc = m1243x3.zzc();
        }
        s67.m10625r(zzc, new kx8(this, m10634i, zzcgjVar, wy3Var, m20568a, com.google.android.gms.ads.internal.zzt.zzB().mo15860a()), this.f36495p.mo26277c());
    }

    @Override // com.daaw.zy3
    public final void zzf(zzcao zzcaoVar) {
        this.f36502w = zzcaoVar;
        this.f36498s.m13327c(1);
    }

    @Override // com.daaw.zy3
    public final void zzg(List list, yd0 yd0Var, rs3 rs3Var) {
        m1241z3(list, yd0Var, rs3Var, true);
    }

    @Override // com.daaw.zy3
    public final void zzh(List list, yd0 yd0Var, rs3 rs3Var) {
        m1280A3(list, yd0Var, rs3Var, true);
    }

    @Override // com.daaw.zy3
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(yd0 yd0Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10872w8)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                k04.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10883x8)).booleanValue()) {
                if (!((Boolean) zzba.zzc().m23658b(g93.f10368A8)).booleanValue()) {
                    s67.m10625r(((Boolean) zzba.zzc().m23658b(g93.f10719i9)).booleanValue() ? s67.m10631l(new v57() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
                        @Override // com.daaw.v57
                        public final f77 zza() {
                            return zzac.this.m1266O3();
                        }
                    }, z04.f34305a) : m1243x3(this.f36496q, null, AdFormat.BANNER.name(), null, null).zzc(), new q32(this), this.f36495p.mo26277c());
                }
            }
            final WebView webView = (WebView) nt0.m14831M(yd0Var);
            if (webView == null) {
                k04.zzg("The webView cannot be null.");
            } else if (this.f36505z.contains(webView)) {
                k04.zzi("This webview has already been registered.");
            } else {
                this.f36505z.add(webView);
                webView.addJavascriptInterface(new oj1(webView, this.f36497r, this.f36478B), "gmaSdk");
                if (((Boolean) zzba.zzc().m23658b(g93.f10400D8)).booleanValue()) {
                    this.f36494R.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzac.this.m1253n3(webView);
                        }
                    });
                }
            }
        }
    }

    @Override // com.daaw.zy3
    public final void zzj(yd0 yd0Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10578V6)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) nt0.m14831M(yd0Var);
            zzcao zzcaoVar = this.f36502w;
            this.f36503x = zzbx.zza(motionEvent, zzcaoVar == null ? null : zzcaoVar.f36882p);
            if (motionEvent.getAction() == 0) {
                this.f36504y = this.f36503x;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f36503x;
            obtain.setLocation(point.x, point.y);
            this.f36497r.m10201d(obtain);
            obtain.recycle();
        }
    }

    @Override // com.daaw.zy3
    public final void zzk(List list, yd0 yd0Var, rs3 rs3Var) {
        m1241z3(list, yd0Var, rs3Var, false);
    }

    @Override // com.daaw.zy3
    public final void zzl(List list, yd0 yd0Var, rs3 rs3Var) {
        m1280A3(list, yd0Var, rs3Var, false);
    }
}
