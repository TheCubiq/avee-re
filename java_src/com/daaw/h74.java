package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbei;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class h74 extends WebViewClient implements t84 {
    public static final /* synthetic */ int R = 0;
    public boolean A;
    public boolean B;
    @GuardedBy("lock")
    public boolean C;
    @GuardedBy("lock")
    public boolean D;
    @GuardedBy("lock")
    public boolean E;
    public zzz F;
    public gq3 G;
    public zzb H;
    public bq3 I;
    public cx3 J;
    public op6 K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public final HashSet P;
    public View.OnAttachStateChangeListener Q;
    public final a74 p;
    public final x33 q;
    public final HashMap r;
    public final Object s;
    public zza t;
    public zzo u;
    public o84 v;
    public s84 w;
    public mf3 x;
    public of3 y;
    public vy4 z;

    public h74(a74 a74Var, x33 x33Var, boolean z) {
        gq3 gq3Var = new gq3(a74Var, a74Var.j(), new m83(a74Var.getContext()));
        this.r = new HashMap();
        this.s = new Object();
        this.q = x33Var;
        this.p = a74Var;
        this.C = z;
        this.G = gq3Var;
        this.I = null;
        this.P = new HashSet(Arrays.asList(((String) zzba.zzc().b(g93.b5)).split(",")));
    }

    public static final boolean H(boolean z, a74 a74Var) {
        return (!z || a74Var.o().i() || a74Var.O().equals("interstitial_mb")) ? false : true;
    }

    public static WebResourceResponse l() {
        if (((Boolean) zzba.zzc().b(g93.D0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public final void A() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.Q;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.p).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public final void A0(boolean z, int i, boolean z2) {
        boolean H = H(this.p.L(), this.p);
        boolean z3 = true;
        if (!H && z2) {
            z3 = false;
        }
        zza zzaVar = H ? null : this.t;
        zzo zzoVar = this.u;
        zzz zzzVar = this.F;
        a74 a74Var = this.p;
        B0(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, a74Var, z, i, a74Var.zzp(), z3 ? null : this.z));
    }

    public final void B0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        bq3 bq3Var = this.I;
        boolean l = bq3Var != null ? bq3Var.l() : false;
        zzt.zzi();
        zzm.zza(this.p.getContext(), adOverlayInfoParcel, !l);
        cx3 cx3Var = this.J;
        if (cx3Var != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            cx3Var.zzh(str);
        }
    }

    public final void C0(boolean z, int i, String str, boolean z2) {
        boolean L = this.p.L();
        boolean H = H(L, this.p);
        boolean z3 = true;
        if (!H && z2) {
            z3 = false;
        }
        zza zzaVar = H ? null : this.t;
        g74 g74Var = L ? null : new g74(this.p, this.u);
        mf3 mf3Var = this.x;
        of3 of3Var = this.y;
        zzz zzzVar = this.F;
        a74 a74Var = this.p;
        B0(new AdOverlayInfoParcel(zzaVar, g74Var, mf3Var, of3Var, zzzVar, a74Var, z, i, str, a74Var.zzp(), z3 ? null : this.z));
    }

    public final void D0(boolean z, int i, String str, String str2, boolean z2) {
        boolean L = this.p.L();
        boolean H = H(L, this.p);
        boolean z3 = true;
        if (!H && z2) {
            z3 = false;
        }
        zza zzaVar = H ? null : this.t;
        g74 g74Var = L ? null : new g74(this.p, this.u);
        mf3 mf3Var = this.x;
        of3 of3Var = this.y;
        zzz zzzVar = this.F;
        a74 a74Var = this.p;
        B0(new AdOverlayInfoParcel(zzaVar, g74Var, mf3Var, of3Var, zzzVar, a74Var, z, i, str, str2, a74Var.zzp(), z3 ? null : this.z));
    }

    @Override // com.daaw.t84
    public final void E(o84 o84Var) {
        this.v = o84Var;
    }

    public final void E0(String str, zg3 zg3Var) {
        synchronized (this.s) {
            List list = (List) this.r.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.r.put(str, list);
            }
            list.add(zg3Var);
        }
    }

    public final void F(final View view, final cx3 cx3Var, final int i) {
        if (!cx3Var.zzi() || i <= 0) {
            return;
        }
        cx3Var.b(view);
        if (cx3Var.zzi()) {
            zzs.zza.postDelayed(new Runnable() { // from class: com.daaw.d74
                @Override // java.lang.Runnable
                public final void run() {
                    h74.this.l0(view, cx3Var, i);
                }
            }, 100L);
        }
    }

    public final void F0() {
        cx3 cx3Var = this.J;
        if (cx3Var != null) {
            cx3Var.zze();
            this.J = null;
        }
        A();
        synchronized (this.s) {
            this.r.clear();
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.A = false;
            this.C = false;
            this.D = false;
            this.F = null;
            this.H = null;
            this.G = null;
            bq3 bq3Var = this.I;
            if (bq3Var != null) {
                bq3Var.h(true);
                this.I = null;
            }
            this.K = null;
        }
    }

    @Override // com.daaw.t84
    public final void G(int i, int i2, boolean z) {
        gq3 gq3Var = this.G;
        if (gq3Var != null) {
            gq3Var.h(i, i2);
        }
        bq3 bq3Var = this.I;
        if (bq3Var != null) {
            bq3Var.j(i, i2, false);
        }
    }

    @Override // com.daaw.t84
    public final void J(zza zzaVar, mf3 mf3Var, zzo zzoVar, of3 of3Var, zzz zzzVar, boolean z, bh3 bh3Var, zzb zzbVar, iq3 iq3Var, cx3 cx3Var, final cq5 cq5Var, final op6 op6Var, kd5 kd5Var, on6 on6Var, rh3 rh3Var, final vy4 vy4Var, qh3 qh3Var, kh3 kh3Var) {
        zg3 zg3Var;
        zzb zzbVar2 = zzbVar == null ? new zzb(this.p.getContext(), cx3Var, null) : zzbVar;
        this.I = new bq3(this.p, iq3Var);
        this.J = cx3Var;
        if (((Boolean) zzba.zzc().b(g93.L0)).booleanValue()) {
            E0("/adMetadata", new lf3(mf3Var));
        }
        if (of3Var != null) {
            E0("/appEvent", new nf3(of3Var));
        }
        E0("/backButton", yg3.j);
        E0("/refresh", yg3.k);
        E0("/canOpenApp", yg3.b);
        E0("/canOpenURLs", yg3.a);
        E0("/canOpenIntents", yg3.c);
        E0("/close", yg3.d);
        E0("/customClose", yg3.e);
        E0("/instrument", yg3.n);
        E0("/delayPageLoaded", yg3.p);
        E0("/delayPageClosed", yg3.q);
        E0("/getLocationInfo", yg3.r);
        E0("/log", yg3.g);
        E0("/mraid", new fh3(zzbVar2, this.I, iq3Var));
        gq3 gq3Var = this.G;
        if (gq3Var != null) {
            E0("/mraidLoaded", gq3Var);
        }
        zzb zzbVar3 = zzbVar2;
        E0("/open", new jh3(zzbVar2, this.I, cq5Var, kd5Var, on6Var));
        E0("/precache", new k54());
        E0("/touch", yg3.i);
        E0("/video", yg3.l);
        E0("/videoMeta", yg3.m);
        if (cq5Var == null || op6Var == null) {
            E0("/click", yg3.a(vy4Var));
            zg3Var = yg3.f;
        } else {
            E0("/click", new zg3() { // from class: com.daaw.yi6
                @Override // com.daaw.zg3
                public final void a(Object obj, Map map) {
                    vy4 vy4Var2 = vy4.this;
                    op6 op6Var2 = op6Var;
                    cq5 cq5Var2 = cq5Var;
                    a74 a74Var = (a74) obj;
                    yg3.d(map, vy4Var2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        k04.zzj("URL missing from click GMSG.");
                    } else {
                        s67.r(yg3.b(a74Var, str), new zi6(a74Var, op6Var2, cq5Var2), z04.a);
                    }
                }
            });
            zg3Var = new zg3() { // from class: com.daaw.xi6
                @Override // com.daaw.zg3
                public final void a(Object obj, Map map) {
                    op6 op6Var2 = op6.this;
                    cq5 cq5Var2 = cq5Var;
                    r64 r64Var = (r64) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        k04.zzj("URL missing from httpTrack GMSG.");
                    } else if (r64Var.d().k0) {
                        cq5Var2.u(new eq5(zzt.zzB().a(), ((a84) r64Var).v().b, str, 2));
                    } else {
                        op6Var2.c(str, null);
                    }
                }
            };
        }
        E0("/httpTrack", zg3Var);
        if (zzt.zzn().z(this.p.getContext())) {
            E0("/logScionEvent", new eh3(this.p.getContext()));
        }
        if (bh3Var != null) {
            E0("/setInterstitialProperties", new ah3(bh3Var, null));
        }
        if (rh3Var != null) {
            if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue()) {
                E0("/inspectorNetworkExtras", rh3Var);
            }
        }
        if (((Boolean) zzba.zzc().b(g93.q8)).booleanValue() && qh3Var != null) {
            E0("/shareSheet", qh3Var);
        }
        if (((Boolean) zzba.zzc().b(g93.t8)).booleanValue() && kh3Var != null) {
            E0("/inspectorOutOfContextTest", kh3Var);
        }
        if (((Boolean) zzba.zzc().b(g93.v9)).booleanValue()) {
            E0("/bindPlayStoreOverlay", yg3.u);
            E0("/presentPlayStoreOverlay", yg3.v);
            E0("/expandPlayStoreOverlay", yg3.w);
            E0("/collapsePlayStoreOverlay", yg3.x);
            E0("/closePlayStoreOverlay", yg3.y);
            if (((Boolean) zzba.zzc().b(g93.K2)).booleanValue()) {
                E0("/setPAIDPersonalizationEnabled", yg3.A);
                E0("/resetPAID", yg3.z);
            }
        }
        this.t = zzaVar;
        this.u = zzoVar;
        this.x = mf3Var;
        this.y = of3Var;
        this.F = zzzVar;
        this.H = zzbVar3;
        this.z = vy4Var;
        this.A = z;
        this.K = op6Var;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener M() {
        synchronized (this.s) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener S() {
        synchronized (this.s) {
        }
        return null;
    }

    public final WebResourceResponse T(String str, Map map) {
        zzbef b;
        try {
            if (((Boolean) gb3.a.e()).booleanValue() && this.K != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.K.c(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String c = my3.c(str, this.p.getContext(), this.O);
            if (c.equals(str)) {
                zzbei h = zzbei.h(Uri.parse(str));
                if (h == null || (b = zzt.zzc().b(h)) == null || !b.u()) {
                    if (j04.l() && ((Boolean) wa3.b.e()).booleanValue()) {
                        return m(str, map);
                    }
                    return null;
                }
                return new WebResourceResponse("", "", b.s());
            }
            return m(c, map);
        } catch (Exception | NoClassDefFoundError e) {
            zzt.zzo().u(e, "AdWebViewClient.interceptRequest");
            return l();
        }
    }

    @Override // com.daaw.t84
    public final void Z(boolean z) {
        synchronized (this.s) {
            this.D = true;
        }
    }

    @Override // com.daaw.t84
    public final boolean a() {
        boolean z;
        synchronized (this.s) {
            z = this.C;
        }
        return z;
    }

    public final void b(boolean z) {
        this.A = false;
    }

    public final void c(String str, zg3 zg3Var) {
        synchronized (this.s) {
            List list = (List) this.r.get(str);
            if (list == null) {
                return;
            }
            list.remove(zg3Var);
        }
    }

    public final void e(String str, uy0 uy0Var) {
        synchronized (this.s) {
            List<zg3> list = (List) this.r.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zg3 zg3Var : list) {
                if (uy0Var.apply(zg3Var)) {
                    arrayList.add(zg3Var);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void e0() {
        if (this.v != null && ((this.L && this.N <= 0) || this.M || this.B)) {
            if (((Boolean) zzba.zzc().b(g93.F1)).booleanValue() && this.p.zzo() != null) {
                n93.a(this.p.zzo().a(), this.p.zzn(), "awfllc");
            }
            o84 o84Var = this.v;
            boolean z = false;
            if (!this.M && !this.B) {
                z = true;
            }
            o84Var.zza(z);
            this.v = null;
        }
        this.p.N();
    }

    public final boolean f() {
        boolean z;
        synchronized (this.s) {
            z = this.E;
        }
        return z;
    }

    public final void h0(boolean z) {
        this.O = z;
    }

    public final /* synthetic */ void i0() {
        this.p.f0();
        zzl zzN = this.p.zzN();
        if (zzN != null) {
            zzN.zzx();
        }
    }

    public final boolean k() {
        boolean z;
        synchronized (this.s) {
            z = this.D;
        }
        return z;
    }

    @Override // com.daaw.t84
    public final void k0(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.r.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) zzba.zzc().b(g93.h6)).booleanValue() || zzt.zzo().f() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            z04.a.execute(new Runnable() { // from class: com.daaw.b74
                @Override // java.lang.Runnable
                public final void run() {
                    String str = substring;
                    int i = h74.R;
                    zzt.zzo().f().e(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzba.zzc().b(g93.a5)).booleanValue() && this.P.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzba.zzc().b(g93.c5)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                s67.r(zzt.zzp().zzb(uri), new f74(this, list, path, uri), z04.e);
                return;
            }
        }
        zzt.zzp();
        s(zzs.zzL(uri), list, path);
    }

    public final /* synthetic */ void l0(View view, cx3 cx3Var, int i) {
        F(view, cx3Var, i - 1);
    }

    public final WebResourceResponse m(String str, Map map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                zzt.zzp().zze(this.p.getContext(), this.p.zzp().p, false, httpURLConnection, false, 60000);
                j04 j04Var = new j04(null);
                j04Var.c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                j04Var.e(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    k04.zzj("Protocol is null");
                    return l();
                } else if (!protocol.equals("http") && !protocol.equals("https")) {
                    k04.zzj("Unsupported scheme: " + protocol);
                    return l();
                } else {
                    k04.zze("Redirecting to " + headerField);
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            zzt.zzp();
            return zzs.zzM(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void m0(zzc zzcVar, boolean z) {
        boolean L = this.p.L();
        boolean H = H(L, this.p);
        boolean z2 = true;
        if (!H && z) {
            z2 = false;
        }
        B0(new AdOverlayInfoParcel(zzcVar, H ? null : this.t, L ? null : this.u, this.F, this.p.zzp(), this.p, z2 ? null : this.z));
    }

    public final void n0(zzbr zzbrVar, cq5 cq5Var, kd5 kd5Var, on6 on6Var, String str, String str2, int i) {
        a74 a74Var = this.p;
        B0(new AdOverlayInfoParcel(a74Var, a74Var.zzp(), zzbrVar, cq5Var, kd5Var, on6Var, str, str2, 14));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zzaVar = this.t;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            k0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.s) {
            if (this.p.o0()) {
                zze.zza("Blank page loaded, 1...");
                this.p.z();
                return;
            }
            this.L = true;
            s84 s84Var = this.w;
            if (s84Var != null) {
                s84Var.zza();
                this.w = null;
            }
            e0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.B = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.p.x0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final void s(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zg3) it.next()).a(this.p, map);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return T(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case p21.J0 /* 91 */:
                return true;
            default:
                switch (keyCode) {
                    case x21.M0 /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            k0(parse);
        } else {
            if (this.A && webView == this.p.h()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zza zzaVar = this.t;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        cx3 cx3Var = this.J;
                        if (cx3Var != null) {
                            cx3Var.zzh(str);
                        }
                        this.t = null;
                    }
                    vy4 vy4Var = this.z;
                    if (vy4Var != null) {
                        vy4Var.zzq();
                        this.z = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.p.h().willNotDraw()) {
                k04.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    sl2 a = this.p.a();
                    if (a != null && a.f(parse)) {
                        Context context = this.p.getContext();
                        a74 a74Var = this.p;
                        parse = a.a(parse, context, (View) a74Var, a74Var.zzk());
                    }
                } catch (tl2 unused) {
                    k04.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzbVar = this.H;
                if (zzbVar == null || zzbVar.zzc()) {
                    m0(new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    this.H.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.daaw.t84
    public final void t0(boolean z) {
        synchronized (this.s) {
            this.E = z;
        }
    }

    @Override // com.daaw.t84
    public final void y0(s84 s84Var) {
        this.w = s84Var;
    }

    @Override // com.daaw.t84
    public final void z0(int i, int i2) {
        bq3 bq3Var = this.I;
        if (bq3Var != null) {
            bq3Var.k(i, i2);
        }
    }

    @Override // com.daaw.t84
    public final void zzE() {
        synchronized (this.s) {
            this.A = false;
            this.C = true;
            z04.e.execute(new Runnable() { // from class: com.daaw.c74
                @Override // java.lang.Runnable
                public final void run() {
                    h74.this.i0();
                }
            });
        }
    }

    @Override // com.daaw.t84
    public final zzb zzd() {
        return this.H;
    }

    @Override // com.daaw.t84
    public final void zzj() {
        x33 x33Var = this.q;
        if (x33Var != null) {
            x33Var.c(10005);
        }
        this.M = true;
        e0();
        this.p.destroy();
    }

    @Override // com.daaw.t84
    public final void zzk() {
        synchronized (this.s) {
        }
        this.N++;
        e0();
    }

    @Override // com.daaw.t84
    public final void zzl() {
        this.N--;
        e0();
    }

    @Override // com.daaw.t84
    public final void zzp() {
        cx3 cx3Var = this.J;
        if (cx3Var != null) {
            WebView h = this.p.h();
            if (xs1.U(h)) {
                F(h, cx3Var, 10);
                return;
            }
            A();
            e74 e74Var = new e74(this, cx3Var);
            this.Q = e74Var;
            ((View) this.p).addOnAttachStateChangeListener(e74Var);
        }
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        vy4 vy4Var = this.z;
        if (vy4Var != null) {
            vy4Var.zzq();
        }
    }

    @Override // com.daaw.vy4
    public final void zzr() {
        vy4 vy4Var = this.z;
        if (vy4Var != null) {
            vy4Var.zzr();
        }
    }
}
