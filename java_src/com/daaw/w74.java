package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.daaw.g93;
import com.daaw.gv6;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class w74 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, a74 {
    public static final /* synthetic */ int p0 = 0;
    public boolean A;
    public h74 B;
    @GuardedBy("this")
    public zzl C;
    @GuardedBy("this")
    public yd0 D;
    @GuardedBy("this")
    public v84 E;
    @GuardedBy("this")
    public final String F;
    @GuardedBy("this")
    public boolean G;
    @GuardedBy("this")
    public boolean H;
    @GuardedBy("this")
    public boolean I;
    @GuardedBy("this")
    public boolean J;
    @GuardedBy("this")
    public Boolean K;
    @GuardedBy("this")
    public boolean L;
    @GuardedBy("this")
    public final String M;
    @GuardedBy("this")
    public z74 N;
    @GuardedBy("this")
    public boolean O;
    @GuardedBy("this")
    public boolean P;
    @GuardedBy("this")
    public ec3 Q;
    @GuardedBy("this")
    public cc3 R;
    @GuardedBy("this")
    public j23 S;
    @GuardedBy("this")
    public int T;
    @GuardedBy("this")
    public int U;
    public s93 V;
    public final s93 W;
    public s93 a0;
    public final t93 b0;
    public int c0;
    public int d0;
    public int e0;
    @GuardedBy("this")
    public zzl f0;
    @GuardedBy("this")
    public boolean g0;
    public final zzci h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public Map m0;
    public final WindowManager n0;
    public final x33 o0;
    public final u84 p;
    public final sl2 q;
    public final ja3 r;
    public final zzchu s;
    public com.google.android.gms.ads.internal.zzl t;
    public final zza u;
    public final DisplayMetrics v;
    public final float w;
    public th6 x;
    public wh6 y;
    public boolean z;

    public w74(u84 u84Var, v84 v84Var, String str, boolean z, boolean z2, sl2 sl2Var, ja3 ja3Var, zzchu zzchuVar, v93 v93Var, com.google.android.gms.ads.internal.zzl zzlVar, zza zzaVar, x33 x33Var, th6 th6Var, wh6 wh6Var) {
        super(u84Var);
        wh6 wh6Var2;
        this.z = false;
        this.A = false;
        this.L = true;
        this.M = "";
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.p = u84Var;
        this.E = v84Var;
        this.F = str;
        this.I = z;
        this.q = sl2Var;
        this.r = ja3Var;
        this.s = zzchuVar;
        this.t = zzlVar;
        this.u = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.n0 = windowManager;
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr(windowManager);
        this.v = zzr;
        this.w = zzr.density;
        this.o0 = x33Var;
        this.x = th6Var;
        this.y = wh6Var;
        this.h0 = new zzci(u84Var.a(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            k04.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            if (((Boolean) zzba.zzc().b(g93.B9)).booleanValue()) {
                settings.setMixedContentMode(1);
            } else {
                settings.setMixedContentMode(2);
            }
        }
        settings.setUserAgentString(zzt.zzp().zzc(u84Var, zzchuVar.p));
        zzt.zzp();
        final Context context = getContext();
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                gv6 gv6Var = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.E0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        N0();
        addJavascriptInterface(new d84(this, new c84(this), null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        V0();
        t93 t93Var = new t93(new v93(true, "make_wv", this.F));
        this.b0 = t93Var;
        t93Var.a().c(null);
        if (((Boolean) zzba.zzc().b(g93.F1)).booleanValue() && (wh6Var2 = this.y) != null && wh6Var2.b != null) {
            t93Var.a().d("gqi", this.y.b);
        }
        t93Var.a();
        s93 f = v93.f();
        this.W = f;
        t93Var.b("native:view_create", f);
        this.a0 = null;
        this.V = null;
        zzce.zza().zzb(u84Var);
        zzt.zzo().r();
    }

    @Override // com.daaw.y24
    public final synchronized void A(int i) {
        this.c0 = i;
    }

    @Override // com.daaw.i84
    public final void A0(boolean z, int i, String str, String str2, boolean z2) {
        this.B.D0(z, i, str, str2, z2);
    }

    @Override // com.daaw.a74
    public final synchronized void B(zzl zzlVar) {
        this.C = zzlVar;
    }

    @Override // com.daaw.a74
    public final void C() {
        throw null;
    }

    @Override // com.daaw.kk3
    public final void C0(String str, JSONObject jSONObject) {
        c(str, jSONObject.toString());
    }

    @Override // com.daaw.a74
    public final synchronized void D(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        zzl zzlVar = this.C;
        if (zzlVar != null) {
            zzlVar.zzz(z);
        }
    }

    public final h74 E0() {
        return this.B;
    }

    @Override // com.daaw.y24
    public final void F(int i) {
    }

    public final synchronized Boolean F0() {
        return this.K;
    }

    @Override // com.daaw.y24
    public final synchronized j54 H(String str) {
        Map map = this.m0;
        if (map == null) {
            return null;
        }
        return (j54) map.get(str);
    }

    @Override // com.daaw.a74
    public final synchronized void I(ec3 ec3Var) {
        this.Q = ec3Var;
    }

    public final synchronized void I0(String str, ValueCallback valueCallback) {
        if (o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void J0(String str) {
        if (!vw0.d()) {
            K0("javascript:".concat(str));
            return;
        }
        if (F0() == null) {
            W0();
        }
        if (F0().booleanValue()) {
            I0(str, null);
        } else {
            K0("javascript:".concat(str));
        }
    }

    @Override // com.daaw.a74
    public final synchronized void K(int i) {
        zzl zzlVar = this.C;
        if (zzlVar != null) {
            zzlVar.zzy(i);
        }
    }

    public final synchronized void K0(String str) {
        if (o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.daaw.a74
    public final synchronized boolean L() {
        return this.I;
    }

    public final void L0(Boolean bool) {
        synchronized (this) {
            this.K = bool;
        }
        zzt.zzo().v(bool);
    }

    @Override // com.daaw.y24
    public final void M(int i) {
        this.d0 = i;
    }

    public final boolean M0() {
        int i;
        int i2;
        boolean z = false;
        if (this.B.a() || this.B.k()) {
            zzay.zzb();
            DisplayMetrics displayMetrics = this.v;
            int B = d04.B(displayMetrics, displayMetrics.widthPixels);
            zzay.zzb();
            DisplayMetrics displayMetrics2 = this.v;
            int B2 = d04.B(displayMetrics2, displayMetrics2.heightPixels);
            Activity a = this.p.a();
            if (a == null || a.getWindow() == null) {
                i = B;
                i2 = B2;
            } else {
                zzt.zzp();
                int[] zzN = zzs.zzN(a);
                zzay.zzb();
                int B3 = d04.B(this.v, zzN[0]);
                zzay.zzb();
                i2 = d04.B(this.v, zzN[1]);
                i = B3;
            }
            int i3 = this.j0;
            if (i3 == B && this.i0 == B2 && this.k0 == i && this.l0 == i2) {
                return false;
            }
            z = (i3 == B && this.i0 == B2) ? true : true;
            this.j0 = B;
            this.i0 = B2;
            this.k0 = i;
            this.l0 = i2;
            new hq3(this, "").e(B, B2, i, i2, this.v.density, this.n0.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.daaw.a74
    public final void N() {
        if (this.a0 == null) {
            this.b0.a();
            s93 f = v93.f();
            this.a0 = f;
            this.b0.b("native:view_load", f);
        }
    }

    public final synchronized void N0() {
        th6 th6Var = this.x;
        if (th6Var != null && th6Var.o0) {
            k04.zze("Disabling hardware acceleration on an overlay.");
            P0();
            return;
        }
        if (!this.I && !this.E.i()) {
            k04.zze("Enabling hardware acceleration on an AdView.");
            R0();
            return;
        }
        k04.zze("Enabling hardware acceleration on an overlay.");
        R0();
    }

    @Override // com.daaw.a74
    public final synchronized String O() {
        return this.F;
    }

    public final synchronized void O0() {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        zzt.zzo().q();
    }

    @Override // com.daaw.a74
    public final void P(th6 th6Var, wh6 wh6Var) {
        this.x = th6Var;
        this.y = wh6Var;
    }

    public final synchronized void P0() {
        if (!this.J) {
            setLayerType(1, null);
        }
        this.J = true;
    }

    @Override // com.daaw.a74
    public final synchronized void Q(v84 v84Var) {
        this.E = v84Var;
        requestLayout();
    }

    public final void Q0(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        T("onAdVisibilityChanged", hashMap);
    }

    @Override // com.daaw.a74
    public final synchronized void R(yd0 yd0Var) {
        this.D = yd0Var;
    }

    public final synchronized void R0() {
        if (this.J) {
            setLayerType(0, null);
        }
        this.J = false;
    }

    @Override // com.daaw.i84
    public final void S(boolean z, int i, String str, boolean z2) {
        this.B.C0(z, i, str, z2);
    }

    public final synchronized void S0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            zzt.zzo().u(th, "AdWebViewImpl.loadUrlUnsafe");
            k04.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.daaw.uj3
    public final void T(String str, Map map) {
        try {
            l(str, zzay.zzb().o(map));
        } catch (JSONException unused) {
            k04.zzj("Could not convert parameters to JSON.");
        }
    }

    public final void T0() {
        n93.a(this.b0.a(), this.W, "aeh2");
    }

    @Override // com.daaw.a74
    public final synchronized void U(boolean z) {
        this.L = z;
    }

    public final synchronized void U0() {
        Map map = this.m0;
        if (map != null) {
            for (j54 j54Var : map.values()) {
                j54Var.a();
            }
        }
        this.m0 = null;
    }

    @Override // com.daaw.a74
    public final boolean V() {
        return false;
    }

    public final void V0() {
        t93 t93Var = this.b0;
        if (t93Var == null) {
            return;
        }
        v93 a = t93Var.a();
        l93 f = zzt.zzo().f();
        if (f != null) {
            f.f(a);
        }
    }

    @Override // com.daaw.y24
    public final void W(int i) {
        this.e0 = i;
    }

    public final synchronized void W0() {
        Boolean k = zzt.zzo().k();
        this.K = k;
        if (k == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                L0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                L0(Boolean.FALSE);
            }
        }
    }

    @Override // com.daaw.a74
    public final void X(boolean z) {
        this.B.h0(z);
    }

    @Override // com.daaw.a74
    public final void Y() {
        setBackgroundColor(0);
    }

    @Override // com.daaw.a74, com.daaw.l84
    public final sl2 a() {
        return this.q;
    }

    @Override // com.daaw.a74
    public final synchronized void a0(zzl zzlVar) {
        this.f0 = zzlVar;
    }

    @Override // com.daaw.y24
    public final synchronized String b() {
        return this.M;
    }

    @Override // com.daaw.a74
    public final synchronized void b0(String str, String str2, String str3) {
        String str4;
        if (o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) zzba.zzc().b(g93.N);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            k04.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, j84.a(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final void c(String str, String str2) {
        J0(str + "(" + str2 + ");");
    }

    @Override // com.daaw.a74
    public final void c0(String str, uy0 uy0Var) {
        h74 h74Var = this.B;
        if (h74Var != null) {
            h74Var.e(str, uy0Var);
        }
    }

    @Override // com.daaw.a74, com.daaw.r64
    public final th6 d() {
        return this.x;
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final synchronized void destroy() {
        V0();
        this.h0.zza();
        zzl zzlVar = this.C;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.C.zzl();
            this.C = null;
        }
        this.D = null;
        this.B.F0();
        this.S = null;
        this.t = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.H) {
            return;
        }
        zzt.zzy().h(this);
        U0();
        this.H = true;
        if (!((Boolean) zzba.zzc().b(g93.X8)).booleanValue()) {
            zze.zza("Destroying the WebView immediately...");
            z();
            return;
        }
        zze.zza("Initiating WebView self destruct sequence in 3...");
        zze.zza("Loading blank page in WebView, 2...");
        S0("about:blank");
    }

    @Override // com.daaw.y24
    public final synchronized void e() {
        cc3 cc3Var = this.R;
        if (cc3Var != null) {
            final s75 s75Var = (s75) cc3Var;
            zzs.zza.post(new Runnable() { // from class: com.daaw.q75
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        s75.this.zzd();
                    } catch (RemoteException e) {
                        k04.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.daaw.q03
    public final void e0(p03 p03Var) {
        boolean z;
        synchronized (this) {
            z = p03Var.j;
            this.O = z;
        }
        Q0(z);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!o0()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        k04.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.daaw.a74
    public final void f0() {
        this.h0.zzb();
    }

    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.H) {
                    this.B.F0();
                    zzt.zzy().h(this);
                    U0();
                    O0();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.daaw.a74, com.daaw.n84
    public final View g() {
        return this;
    }

    @Override // com.daaw.a74
    public final synchronized void g0(boolean z) {
        boolean z2 = this.I;
        this.I = z;
        N0();
        if (z != z2) {
            if (!((Boolean) zzba.zzc().b(g93.O)).booleanValue() || !this.E.i()) {
                new hq3(this, "").g(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.daaw.a74
    public final WebView h() {
        return this;
    }

    @Override // com.daaw.i84
    public final void h0(zzbr zzbrVar, cq5 cq5Var, kd5 kd5Var, on6 on6Var, String str, String str2, int i) {
        this.B.n0(zzbrVar, cq5Var, kd5Var, on6Var, str, str2, 14);
    }

    @Override // com.daaw.a74
    public final synchronized boolean i() {
        return this.G;
    }

    @Override // com.daaw.i84
    public final void i0(zzc zzcVar, boolean z) {
        this.B.m0(zzcVar, z);
    }

    @Override // com.daaw.a74
    public final Context j() {
        return this.p.b();
    }

    @Override // com.daaw.a74
    public final synchronized yd0 j0() {
        return this.D;
    }

    @Override // com.daaw.y24
    public final void k() {
        zzl zzN = zzN();
        if (zzN != null) {
            zzN.zzd();
        }
    }

    @Override // com.daaw.uj3, com.daaw.wj3
    public final void l(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        k04.zze("Dispatching AFMA event: ".concat(sb.toString()));
        J0(sb.toString());
    }

    @Override // com.daaw.y24
    public final n24 l0() {
        return null;
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final synchronized void loadData(String str, String str2, String str3) {
        if (o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final synchronized void loadUrl(String str) {
        if (o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // com.daaw.y24
    public final void m0(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        T("onCacheAccessComplete", hashMap);
    }

    @Override // com.daaw.a74
    public final WebViewClient n() {
        return this.B;
    }

    @Override // com.daaw.i84
    public final void n0(boolean z, int i, boolean z2) {
        this.B.A0(z, i, z2);
    }

    @Override // com.daaw.a74, com.daaw.k84
    public final synchronized v84 o() {
        return this.E;
    }

    @Override // com.daaw.a74
    public final synchronized boolean o0() {
        return this.H;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        h74 h74Var = this.B;
        if (h74Var != null) {
            h74Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!o0()) {
            this.h0.zzc();
        }
        boolean z = this.O;
        h74 h74Var = this.B;
        if (h74Var != null && h74Var.k()) {
            if (!this.P) {
                this.B.M();
                this.B.S();
                this.P = true;
            }
            M0();
            z = true;
        }
        Q0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h74 h74Var;
        synchronized (this) {
            if (!o0()) {
                this.h0.zzd();
            }
            super.onDetachedFromWindow();
            if (this.P && (h74Var = this.B) != null && h74Var.k() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.B.M();
                this.B.S();
                this.P = false;
            }
        }
        Q0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzt.zzp();
            zzs.zzQ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            k04.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (o0()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean M0 = M0();
        zzl zzN = zzN();
        if (zzN == null || !M0) {
            return;
        }
        zzN.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb A[Catch: all -> 0x01e1, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.w74.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final void onPause() {
        if (o0()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            k04.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final void onResume() {
        if (o0()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            k04.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B.k() || this.B.f()) {
            sl2 sl2Var = this.q;
            if (sl2Var != null) {
                sl2Var.d(motionEvent);
            }
            ja3 ja3Var = this.r;
            if (ja3Var != null) {
                ja3Var.b(motionEvent);
            }
        } else {
            synchronized (this) {
                ec3 ec3Var = this.Q;
                if (ec3Var != null) {
                    ec3Var.a(motionEvent);
                }
            }
        }
        if (o0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.daaw.a74
    public final synchronized j23 p() {
        return this.S;
    }

    @Override // com.daaw.a74
    public final void p0(int i) {
        if (i == 0) {
            n93.a(this.b0.a(), this.W, "aebb2");
        }
        T0();
        this.b0.a();
        this.b0.a().d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.s.p);
        T("onhide", hashMap);
    }

    @Override // com.daaw.a74
    public final synchronized boolean q() {
        return this.L;
    }

    @Override // com.daaw.a74
    public final synchronized void q0(cc3 cc3Var) {
        this.R = cc3Var;
    }

    @Override // com.daaw.a74
    public final synchronized boolean r() {
        return this.T > 0;
    }

    @Override // com.daaw.a74
    public final f77 r0() {
        ja3 ja3Var = this.r;
        return ja3Var == null ? s67.i(null) : ja3Var.a();
    }

    @Override // com.daaw.a74
    public final void s0(Context context) {
        this.p.setBaseContext(context);
        this.h0.zze(this.p.a());
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof h74) {
            this.B = (h74) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (o0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            k04.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final synchronized void t(String str, j54 j54Var) {
        if (this.m0 == null) {
            this.m0 = new HashMap();
        }
        this.m0.put(str, j54Var);
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final synchronized void u(z74 z74Var) {
        if (this.N != null) {
            k04.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.N = z74Var;
        }
    }

    @Override // com.daaw.a74
    public final synchronized void u0(j23 j23Var) {
        this.S = j23Var;
    }

    @Override // com.daaw.a74, com.daaw.a84
    public final wh6 v() {
        return this.y;
    }

    @Override // com.daaw.a74
    public final void v0() {
        throw null;
    }

    @Override // com.daaw.a74
    public final synchronized void w(boolean z) {
        zzl zzlVar;
        int i = this.T + (true != z ? -1 : 1);
        this.T = i;
        if (i > 0 || (zzlVar = this.C) == null) {
            return;
        }
        zzlVar.zzC();
    }

    @Override // com.daaw.a74
    public final synchronized void w0(boolean z) {
        zzl zzlVar = this.C;
        if (zzlVar != null) {
            zzlVar.zzw(this.B.a(), z);
        } else {
            this.G = z;
        }
    }

    @Override // com.daaw.a74
    public final void x(String str, zg3 zg3Var) {
        h74 h74Var = this.B;
        if (h74Var != null) {
            h74Var.c(str, zg3Var);
        }
    }

    @Override // com.daaw.a74
    public final boolean x0(final boolean z, final int i) {
        destroy();
        this.o0.b(new w33() { // from class: com.daaw.t74
            @Override // com.daaw.w33
            public final void a(u53 u53Var) {
                boolean z2 = z;
                int i2 = i;
                int i3 = w74.p0;
                j83 L = k83.L();
                if (L.u() != z2) {
                    L.s(z2);
                }
                L.t(i2);
                u53Var.B((k83) L.n());
            }
        });
        this.o0.c(10003);
        return true;
    }

    @Override // com.daaw.a74
    public final void y(String str, zg3 zg3Var) {
        h74 h74Var = this.B;
        if (h74Var != null) {
            h74Var.E0(str, zg3Var);
        }
    }

    @Override // com.daaw.a74
    public final synchronized void z() {
        zze.zza("Destroying WebView!");
        O0();
        zzs.zza.post(new v74(this));
    }

    @Override // com.daaw.y24
    public final void zzB(boolean z) {
        this.B.b(false);
    }

    @Override // com.daaw.a74
    public final synchronized ec3 zzM() {
        return this.Q;
    }

    @Override // com.daaw.a74
    public final synchronized zzl zzN() {
        return this.C;
    }

    @Override // com.daaw.a74
    public final synchronized zzl zzO() {
        return this.f0;
    }

    @Override // com.daaw.a74
    public final /* synthetic */ t84 zzP() {
        return this.B;
    }

    @Override // com.daaw.a74
    public final void zzX() {
        T0();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.s.p);
        T("onhide", hashMap);
    }

    @Override // com.daaw.a74
    public final void zzZ() {
        if (this.V == null) {
            n93.a(this.b0.a(), this.W, "aes2");
            this.b0.a();
            s93 f = v93.f();
            this.V = f;
            this.b0.b("native:view_show", f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.s.p);
        T("onshow", hashMap);
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.t;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.t;
        if (zzlVar != null) {
            zzlVar.zzbo();
        }
    }

    @Override // com.daaw.y24
    public final int zzf() {
        return this.e0;
    }

    @Override // com.daaw.y24
    public final int zzg() {
        return this.d0;
    }

    @Override // com.daaw.y24
    public final synchronized int zzh() {
        return this.c0;
    }

    @Override // com.daaw.y24
    public final int zzi() {
        return getMeasuredHeight();
    }

    @Override // com.daaw.y24
    public final int zzj() {
        return getMeasuredWidth();
    }

    @Override // com.daaw.a74, com.daaw.e84, com.daaw.y24
    public final Activity zzk() {
        return this.p.a();
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final zza zzm() {
        return this.u;
    }

    @Override // com.daaw.y24
    public final s93 zzn() {
        return this.W;
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final t93 zzo() {
        return this.b0;
    }

    @Override // com.daaw.a74, com.daaw.m84, com.daaw.y24
    public final zzchu zzp() {
        return this.s;
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        h74 h74Var = this.B;
        if (h74Var != null) {
            h74Var.zzq();
        }
    }

    @Override // com.daaw.vy4
    public final void zzr() {
        h74 h74Var = this.B;
        if (h74Var != null) {
            h74Var.zzr();
        }
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final synchronized z74 zzs() {
        return this.N;
    }

    @Override // com.daaw.y24
    public final synchronized String zzt() {
        wh6 wh6Var = this.y;
        if (wh6Var != null) {
            return wh6Var.b;
        }
        return null;
    }
}
