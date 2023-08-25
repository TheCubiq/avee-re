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

    /* renamed from: p0 */
    public static final /* synthetic */ int f30971p0 = 0;

    /* renamed from: A */
    public boolean f30972A;

    /* renamed from: B */
    public h74 f30973B;
    @GuardedBy("this")

    /* renamed from: C */
    public zzl f30974C;
    @GuardedBy("this")

    /* renamed from: D */
    public yd0 f30975D;
    @GuardedBy("this")

    /* renamed from: E */
    public v84 f30976E;
    @GuardedBy("this")

    /* renamed from: F */
    public final String f30977F;
    @GuardedBy("this")

    /* renamed from: G */
    public boolean f30978G;
    @GuardedBy("this")

    /* renamed from: H */
    public boolean f30979H;
    @GuardedBy("this")

    /* renamed from: I */
    public boolean f30980I;
    @GuardedBy("this")

    /* renamed from: J */
    public boolean f30981J;
    @GuardedBy("this")

    /* renamed from: K */
    public Boolean f30982K;
    @GuardedBy("this")

    /* renamed from: L */
    public boolean f30983L;
    @GuardedBy("this")

    /* renamed from: M */
    public final String f30984M;
    @GuardedBy("this")

    /* renamed from: N */
    public z74 f30985N;
    @GuardedBy("this")

    /* renamed from: O */
    public boolean f30986O;
    @GuardedBy("this")

    /* renamed from: P */
    public boolean f30987P;
    @GuardedBy("this")

    /* renamed from: Q */
    public ec3 f30988Q;
    @GuardedBy("this")

    /* renamed from: R */
    public cc3 f30989R;
    @GuardedBy("this")

    /* renamed from: S */
    public j23 f30990S;
    @GuardedBy("this")

    /* renamed from: T */
    public int f30991T;
    @GuardedBy("this")

    /* renamed from: U */
    public int f30992U;

    /* renamed from: V */
    public s93 f30993V;

    /* renamed from: W */
    public final s93 f30994W;

    /* renamed from: a0 */
    public s93 f30995a0;

    /* renamed from: b0 */
    public final t93 f30996b0;

    /* renamed from: c0 */
    public int f30997c0;

    /* renamed from: d0 */
    public int f30998d0;

    /* renamed from: e0 */
    public int f30999e0;
    @GuardedBy("this")

    /* renamed from: f0 */
    public zzl f31000f0;
    @GuardedBy("this")

    /* renamed from: g0 */
    public boolean f31001g0;

    /* renamed from: h0 */
    public final zzci f31002h0;

    /* renamed from: i0 */
    public int f31003i0;

    /* renamed from: j0 */
    public int f31004j0;

    /* renamed from: k0 */
    public int f31005k0;

    /* renamed from: l0 */
    public int f31006l0;

    /* renamed from: m0 */
    public Map f31007m0;

    /* renamed from: n0 */
    public final WindowManager f31008n0;

    /* renamed from: o0 */
    public final x33 f31009o0;

    /* renamed from: p */
    public final u84 f31010p;

    /* renamed from: q */
    public final sl2 f31011q;

    /* renamed from: r */
    public final ja3 f31012r;

    /* renamed from: s */
    public final zzchu f31013s;

    /* renamed from: t */
    public com.google.android.gms.ads.internal.zzl f31014t;

    /* renamed from: u */
    public final zza f31015u;

    /* renamed from: v */
    public final DisplayMetrics f31016v;

    /* renamed from: w */
    public final float f31017w;

    /* renamed from: x */
    public th6 f31018x;

    /* renamed from: y */
    public wh6 f31019y;

    /* renamed from: z */
    public boolean f31020z;

    public w74(u84 u84Var, v84 v84Var, String str, boolean z, boolean z2, sl2 sl2Var, ja3 ja3Var, zzchu zzchuVar, v93 v93Var, com.google.android.gms.ads.internal.zzl zzlVar, zza zzaVar, x33 x33Var, th6 th6Var, wh6 wh6Var) {
        super(u84Var);
        wh6 wh6Var2;
        this.f31020z = false;
        this.f30972A = false;
        this.f30983L = true;
        this.f30984M = "";
        this.f31003i0 = -1;
        this.f31004j0 = -1;
        this.f31005k0 = -1;
        this.f31006l0 = -1;
        this.f31010p = u84Var;
        this.f30976E = v84Var;
        this.f30977F = str;
        this.f30980I = z;
        this.f31011q = sl2Var;
        this.f31012r = ja3Var;
        this.f31013s = zzchuVar;
        this.f31014t = zzlVar;
        this.f31015u = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f31008n0 = windowManager;
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr(windowManager);
        this.f31016v = zzr;
        this.f31017w = zzr.density;
        this.f31009o0 = x33Var;
        this.f31018x = th6Var;
        this.f31019y = wh6Var;
        this.f31002h0 = new zzci(u84Var.m8435a(), this, this, null);
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
            if (((Boolean) zzba.zzc().m23658b(g93.f10380B9)).booleanValue()) {
                settings.setMixedContentMode(1);
            } else {
                settings.setMixedContentMode(2);
            }
        }
        settings.setUserAgentString(zzt.zzp().zzc(u84Var, zzchuVar.f36993p));
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
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10402E0)).booleanValue()) {
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
        m6445N0();
        addJavascriptInterface(new d84(this, new c84(this), null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m6429V0();
        t93 t93Var = new t93(new v93(true, "make_wv", this.f30977F));
        this.f30996b0 = t93Var;
        t93Var.m9423a().m7315c(null);
        if (((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() && (wh6Var2 = this.f31019y) != null && wh6Var2.f31252b != null) {
            t93Var.m9423a().m7314d("gqi", this.f31019y.f31252b);
        }
        t93Var.m9423a();
        s93 m7312f = v93.m7312f();
        this.f30994W = m7312f;
        t93Var.m9422b("native:view_create", m7312f);
        this.f30995a0 = null;
        this.f30993V = null;
        zzce.zza().zzb(u84Var);
        zzt.zzo().m11905r();
    }

    @Override // com.daaw.y24
    /* renamed from: A */
    public final synchronized void mo4246A(int i) {
        this.f30997c0 = i;
    }

    @Override // com.daaw.i84
    /* renamed from: A0 */
    public final void mo6464A0(boolean z, int i, String str, String str2, boolean z2) {
        this.f30973B.m20975D0(z, i, str, str2, z2);
    }

    @Override // com.daaw.a74
    /* renamed from: B */
    public final synchronized void mo6463B(zzl zzlVar) {
        this.f30974C = zzlVar;
    }

    @Override // com.daaw.a74
    /* renamed from: C */
    public final void mo6462C() {
        throw null;
    }

    @Override // com.daaw.kk3
    /* renamed from: C0 */
    public final void mo6461C0(String str, JSONObject jSONObject) {
        mo6049c(str, jSONObject.toString());
    }

    @Override // com.daaw.a74
    /* renamed from: D */
    public final synchronized void mo6460D(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        zzl zzlVar = this.f30974C;
        if (zzlVar != null) {
            zzlVar.zzz(z);
        }
    }

    /* renamed from: E0 */
    public final h74 m6458E0() {
        return this.f30973B;
    }

    @Override // com.daaw.y24
    /* renamed from: F */
    public final void mo4245F(int i) {
    }

    /* renamed from: F0 */
    public final synchronized Boolean m6457F0() {
        return this.f30982K;
    }

    @Override // com.daaw.y24
    /* renamed from: H */
    public final synchronized j54 mo4244H(String str) {
        Map map = this.f31007m0;
        if (map == null) {
            return null;
        }
        return (j54) map.get(str);
    }

    @Override // com.daaw.a74
    /* renamed from: I */
    public final synchronized void mo6454I(ec3 ec3Var) {
        this.f30988Q = ec3Var;
    }

    /* renamed from: I0 */
    public final synchronized void m6453I0(String str, ValueCallback valueCallback) {
        if (mo6407o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    /* renamed from: J0 */
    public final void m6452J0(String str) {
        if (!vw0.m6701d()) {
            m6450K0("javascript:".concat(str));
            return;
        }
        if (m6457F0() == null) {
            m6428W0();
        }
        if (m6457F0().booleanValue()) {
            m6453I0(str, null);
        } else {
            m6450K0("javascript:".concat(str));
        }
    }

    @Override // com.daaw.a74
    /* renamed from: K */
    public final synchronized void mo6451K(int i) {
        zzl zzlVar = this.f30974C;
        if (zzlVar != null) {
            zzlVar.zzy(i);
        }
    }

    /* renamed from: K0 */
    public final synchronized void m6450K0(String str) {
        if (mo6407o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.daaw.a74
    /* renamed from: L */
    public final synchronized boolean mo6449L() {
        return this.f30980I;
    }

    /* renamed from: L0 */
    public final void m6448L0(Boolean bool) {
        synchronized (this) {
            this.f30982K = bool;
        }
        zzt.zzo().m11901v(bool);
    }

    @Override // com.daaw.y24
    /* renamed from: M */
    public final void mo4243M(int i) {
        this.f30998d0 = i;
    }

    /* renamed from: M0 */
    public final boolean m6447M0() {
        int i;
        int i2;
        boolean z = false;
        if (this.f30973B.mo9450a() || this.f30973B.m20958k()) {
            zzay.zzb();
            DisplayMetrics displayMetrics = this.f31016v;
            int m24835B = d04.m24835B(displayMetrics, displayMetrics.widthPixels);
            zzay.zzb();
            DisplayMetrics displayMetrics2 = this.f31016v;
            int m24835B2 = d04.m24835B(displayMetrics2, displayMetrics2.heightPixels);
            Activity m8435a = this.f31010p.m8435a();
            if (m8435a == null || m8435a.getWindow() == null) {
                i = m24835B;
                i2 = m24835B2;
            } else {
                zzt.zzp();
                int[] zzN = zzs.zzN(m8435a);
                zzay.zzb();
                int m24835B3 = d04.m24835B(this.f31016v, zzN[0]);
                zzay.zzb();
                i2 = d04.m24835B(this.f31016v, zzN[1]);
                i = m24835B3;
            }
            int i3 = this.f31004j0;
            if (i3 == m24835B && this.f31003i0 == m24835B2 && this.f31005k0 == i && this.f31006l0 == i2) {
                return false;
            }
            z = (i3 == m24835B && this.f31003i0 == m24835B2) ? true : true;
            this.f31004j0 = m24835B;
            this.f31003i0 = m24835B2;
            this.f31005k0 = i;
            this.f31006l0 = i2;
            new hq3(this, "").m20486e(m24835B, m24835B2, i, i2, this.f31016v.density, this.f31008n0.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.daaw.a74
    /* renamed from: N */
    public final void mo6446N() {
        if (this.f30995a0 == null) {
            this.f30996b0.m9423a();
            s93 m7312f = v93.m7312f();
            this.f30995a0 = m7312f;
            this.f30996b0.m9422b("native:view_load", m7312f);
        }
    }

    /* renamed from: N0 */
    public final synchronized void m6445N0() {
        th6 th6Var = this.f31018x;
        if (th6Var != null && th6Var.f27709o0) {
            k04.zze("Disabling hardware acceleration on an overlay.");
            m6441P0();
            return;
        }
        if (!this.f30980I && !this.f30976E.m7329i()) {
            k04.zze("Enabling hardware acceleration on an AdView.");
            m6437R0();
            return;
        }
        k04.zze("Enabling hardware acceleration on an overlay.");
        m6437R0();
    }

    @Override // com.daaw.a74
    /* renamed from: O */
    public final synchronized String mo6444O() {
        return this.f30977F;
    }

    /* renamed from: O0 */
    public final synchronized void m6443O0() {
        if (this.f31001g0) {
            return;
        }
        this.f31001g0 = true;
        zzt.zzo().m11906q();
    }

    @Override // com.daaw.a74
    /* renamed from: P */
    public final void mo6442P(th6 th6Var, wh6 wh6Var) {
        this.f31018x = th6Var;
        this.f31019y = wh6Var;
    }

    /* renamed from: P0 */
    public final synchronized void m6441P0() {
        if (!this.f30981J) {
            setLayerType(1, null);
        }
        this.f30981J = true;
    }

    @Override // com.daaw.a74
    /* renamed from: Q */
    public final synchronized void mo6440Q(v84 v84Var) {
        this.f30976E = v84Var;
        requestLayout();
    }

    /* renamed from: Q0 */
    public final void m6439Q0(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        mo6434T("onAdVisibilityChanged", hashMap);
    }

    @Override // com.daaw.a74
    /* renamed from: R */
    public final synchronized void mo6438R(yd0 yd0Var) {
        this.f30975D = yd0Var;
    }

    /* renamed from: R0 */
    public final synchronized void m6437R0() {
        if (this.f30981J) {
            setLayerType(0, null);
        }
        this.f30981J = false;
    }

    @Override // com.daaw.i84
    /* renamed from: S */
    public final void mo6436S(boolean z, int i, String str, boolean z2) {
        this.f30973B.m20976C0(z, i, str, z2);
    }

    /* renamed from: S0 */
    public final synchronized void m6435S0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            zzt.zzo().m11902u(th, "AdWebViewImpl.loadUrlUnsafe");
            k04.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.daaw.uj3
    /* renamed from: T */
    public final void mo6434T(String str, Map map) {
        try {
            mo6048l(str, zzay.zzb().m24817o(map));
        } catch (JSONException unused) {
            k04.zzj("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: T0 */
    public final void m6433T0() {
        n93.m15381a(this.f30996b0.m9423a(), this.f30994W, "aeh2");
    }

    @Override // com.daaw.a74
    /* renamed from: U */
    public final synchronized void mo6432U(boolean z) {
        this.f30983L = z;
    }

    /* renamed from: U0 */
    public final synchronized void m6431U0() {
        Map map = this.f31007m0;
        if (map != null) {
            for (j54 j54Var : map.values()) {
                j54Var.mo10704a();
            }
        }
        this.f31007m0 = null;
    }

    @Override // com.daaw.a74
    /* renamed from: V */
    public final boolean mo6430V() {
        return false;
    }

    /* renamed from: V0 */
    public final void m6429V0() {
        t93 t93Var = this.f30996b0;
        if (t93Var == null) {
            return;
        }
        v93 m9423a = t93Var.m9423a();
        l93 m11917f = zzt.zzo().m11917f();
        if (m11917f != null) {
            m11917f.m17081f(m9423a);
        }
    }

    @Override // com.daaw.y24
    /* renamed from: W */
    public final void mo4242W(int i) {
        this.f30999e0 = i;
    }

    /* renamed from: W0 */
    public final synchronized void m6428W0() {
        Boolean m11912k = zzt.zzo().m11912k();
        this.f30982K = m11912k;
        if (m11912k == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m6448L0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                m6448L0(Boolean.FALSE);
            }
        }
    }

    @Override // com.daaw.a74
    /* renamed from: X */
    public final void mo6427X(boolean z) {
        this.f30973B.m20960h0(z);
    }

    @Override // com.daaw.a74
    /* renamed from: Y */
    public final void mo6426Y() {
        setBackgroundColor(0);
    }

    @Override // com.daaw.a74, com.daaw.l84
    /* renamed from: a */
    public final sl2 mo6425a() {
        return this.f31011q;
    }

    @Override // com.daaw.a74
    /* renamed from: a0 */
    public final synchronized void mo6424a0(zzl zzlVar) {
        this.f31000f0 = zzlVar;
    }

    @Override // com.daaw.y24
    /* renamed from: b */
    public final synchronized String mo4241b() {
        return this.f30984M;
    }

    @Override // com.daaw.a74
    /* renamed from: b0 */
    public final synchronized void mo6423b0(String str, String str2, String str3) {
        String str4;
        if (mo6407o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) zzba.zzc().m23658b(g93.f10491N);
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
        super.loadDataWithBaseURL(str, j84.m18731a(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    /* renamed from: c */
    public final void mo6049c(String str, String str2) {
        m6452J0(str + "(" + str2 + ");");
    }

    @Override // com.daaw.a74
    /* renamed from: c0 */
    public final void mo6422c0(String str, uy0 uy0Var) {
        h74 h74Var = this.f30973B;
        if (h74Var != null) {
            h74Var.m20963e(str, uy0Var);
        }
    }

    @Override // com.daaw.a74, com.daaw.r64
    /* renamed from: d */
    public final th6 mo6421d() {
        return this.f31018x;
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final synchronized void destroy() {
        m6429V0();
        this.f31002h0.zza();
        zzl zzlVar = this.f30974C;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.f30974C.zzl();
            this.f30974C = null;
        }
        this.f30975D = null;
        this.f30973B.m20972F0();
        this.f30990S = null;
        this.f31014t = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.f30979H) {
            return;
        }
        zzt.zzy().m2817h(this);
        m6431U0();
        this.f30979H = true;
        if (!((Boolean) zzba.zzc().m23658b(g93.f10600X8)).booleanValue()) {
            zze.zza("Destroying the WebView immediately...");
            mo6391z();
            return;
        }
        zze.zza("Initiating WebView self destruct sequence in 3...");
        zze.zza("Loading blank page in WebView, 2...");
        m6435S0("about:blank");
    }

    @Override // com.daaw.y24
    /* renamed from: e */
    public final synchronized void mo4240e() {
        cc3 cc3Var = this.f30989R;
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
    /* renamed from: e0 */
    public final void mo6420e0(p03 p03Var) {
        boolean z;
        synchronized (this) {
            z = p03Var.f22185j;
            this.f30986O = z;
        }
        m6439Q0(z);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!mo6407o0()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        k04.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.daaw.a74
    /* renamed from: f0 */
    public final void mo6419f0() {
        this.f31002h0.zzb();
    }

    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.f30979H) {
                    this.f30973B.m20972F0();
                    zzt.zzy().m2817h(this);
                    m6431U0();
                    m6443O0();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.daaw.a74, com.daaw.n84
    /* renamed from: g */
    public final View mo6418g() {
        return this;
    }

    @Override // com.daaw.a74
    /* renamed from: g0 */
    public final synchronized void mo6417g0(boolean z) {
        boolean z2 = this.f30980I;
        this.f30980I = z;
        m6445N0();
        if (z != z2) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10501O)).booleanValue() || !this.f30976E.m7329i()) {
                new hq3(this, "").m20484g(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.daaw.a74
    /* renamed from: h */
    public final WebView mo6416h() {
        return this;
    }

    @Override // com.daaw.i84
    /* renamed from: h0 */
    public final void mo6415h0(zzbr zzbrVar, cq5 cq5Var, kd5 kd5Var, on6 on6Var, String str, String str2, int i) {
        this.f30973B.m20953n0(zzbrVar, cq5Var, kd5Var, on6Var, str, str2, 14);
    }

    @Override // com.daaw.a74
    /* renamed from: i */
    public final synchronized boolean mo6414i() {
        return this.f30978G;
    }

    @Override // com.daaw.i84
    /* renamed from: i0 */
    public final void mo6413i0(zzc zzcVar, boolean z) {
        this.f30973B.m20954m0(zzcVar, z);
    }

    @Override // com.daaw.a74
    /* renamed from: j */
    public final Context mo6412j() {
        return this.f31010p.m8434b();
    }

    @Override // com.daaw.a74
    /* renamed from: j0 */
    public final synchronized yd0 mo6411j0() {
        return this.f30975D;
    }

    @Override // com.daaw.y24
    /* renamed from: k */
    public final void mo4239k() {
        zzl zzN = zzN();
        if (zzN != null) {
            zzN.zzd();
        }
    }

    @Override // com.daaw.uj3, com.daaw.wj3
    /* renamed from: l */
    public final void mo6048l(String str, JSONObject jSONObject) {
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
        m6452J0(sb.toString());
    }

    @Override // com.daaw.y24
    /* renamed from: l0 */
    public final n24 mo4238l0() {
        return null;
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final synchronized void loadData(String str, String str2, String str3) {
        if (mo6407o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (mo6407o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final synchronized void loadUrl(String str) {
        if (mo6407o0()) {
            k04.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // com.daaw.y24
    /* renamed from: m0 */
    public final void mo4237m0(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        mo6434T("onCacheAccessComplete", hashMap);
    }

    @Override // com.daaw.a74
    /* renamed from: n */
    public final WebViewClient mo6410n() {
        return this.f30973B;
    }

    @Override // com.daaw.i84
    /* renamed from: n0 */
    public final void mo6409n0(boolean z, int i, boolean z2) {
        this.f30973B.m20978A0(z, i, z2);
    }

    @Override // com.daaw.a74, com.daaw.k84
    /* renamed from: o */
    public final synchronized v84 mo6408o() {
        return this.f30976E;
    }

    @Override // com.daaw.a74
    /* renamed from: o0 */
    public final synchronized boolean mo6407o0() {
        return this.f30979H;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        h74 h74Var = this.f30973B;
        if (h74Var != null) {
            h74Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo6407o0()) {
            this.f31002h0.zzc();
        }
        boolean z = this.f30986O;
        h74 h74Var = this.f30973B;
        if (h74Var != null && h74Var.m20958k()) {
            if (!this.f30987P) {
                this.f30973B.m20970M();
                this.f30973B.m20969S();
                this.f30987P = true;
            }
            m6447M0();
            z = true;
        }
        m6439Q0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h74 h74Var;
        synchronized (this) {
            if (!mo6407o0()) {
                this.f31002h0.zzd();
            }
            super.onDetachedFromWindow();
            if (this.f30987P && (h74Var = this.f30973B) != null && h74Var.m20958k() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f30973B.m20970M();
                this.f30973B.m20969S();
                this.f30987P = false;
            }
        }
        m6439Q0(false);
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
        if (mo6407o0()) {
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
        boolean m6447M0 = m6447M0();
        zzl zzN = zzN();
        if (zzN == null || !m6447M0) {
            return;
        }
        zzN.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb A[Catch: all -> 0x01e1, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        v84 v84Var;
        boolean z;
        int i4 = 0;
        if (mo6407o0()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f30980I && !this.f30976E.m7332f()) {
            if (this.f30976E.m7330h()) {
                super.onMeasure(i, i2);
                return;
            } else if (this.f30976E.m7328j()) {
                if (((Boolean) zzba.zzc().m23658b(g93.f10779o3)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                z74 zzs = zzs();
                float zze = zzs != null ? zzs.zze() : 0.0f;
                if (zze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int i5 = (int) (size2 * zze);
                int i6 = (int) (size / zze);
                if (size2 == 0) {
                    if (i6 != 0) {
                        i5 = (int) (i6 * zze);
                        i4 = size;
                        size2 = i6;
                        setMeasuredDimension(Math.min(i5, i4), Math.min(i6, size2));
                        return;
                    }
                    size2 = 0;
                }
                if (size != 0) {
                    i4 = size;
                } else if (i5 != 0) {
                    i6 = (int) (i5 / zze);
                    i4 = i5;
                }
                setMeasuredDimension(Math.min(i5, i4), Math.min(i6, size2));
                return;
            } else if (this.f30976E.m7331g()) {
                if (((Boolean) zzba.zzc().m23658b(g93.f10845u3)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                mo6392y("/contentHeight", new u74(this));
                m6452J0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f = this.f31016v.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i7 = this.f30992U;
                setMeasuredDimension(size3, i7 != -1 ? (int) (i7 * f) : View.MeasureSpec.getSize(i2));
                return;
            } else if (this.f30976E.m7329i()) {
                DisplayMetrics displayMetrics = this.f31016v;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size4 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size5 = View.MeasureSpec.getSize(i2);
                int i8 = Integer.MAX_VALUE;
                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                    i3 = Integer.MAX_VALUE;
                    if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                        i8 = size5;
                    }
                    v84Var = this.f30976E;
                    if (v84Var.f30028c <= i3 && v84Var.f30027b <= i8) {
                        z = false;
                        if (((Boolean) zzba.zzc().m23658b(g93.f10536R4)).booleanValue()) {
                            v84 v84Var2 = this.f30976E;
                            int i9 = v84Var2.f30028c;
                            float f2 = this.f31017w;
                            z &= ((float) i9) / f2 <= ((float) i3) / f2 && ((float) v84Var2.f30027b) / f2 <= ((float) i8) / f2;
                        }
                        if (z) {
                            if (getVisibility() != 8) {
                                setVisibility(0);
                            }
                            if (!this.f30972A) {
                                this.f31009o0.m5589c(10002);
                                this.f30972A = true;
                            }
                            v84 v84Var3 = this.f30976E;
                            setMeasuredDimension(v84Var3.f30028c, v84Var3.f30027b);
                            return;
                        }
                        v84 v84Var4 = this.f30976E;
                        int i10 = v84Var4.f30028c;
                        float f3 = this.f31017w;
                        int i11 = v84Var4.f30027b;
                        k04.zzj("Not enough space to show ad. Needs " + ((int) (i10 / f3)) + "x" + ((int) (i11 / f3)) + " dp, but only has " + ((int) (size4 / f3)) + "x" + ((int) (size5 / f3)) + " dp.");
                        if (getVisibility() != 8) {
                            setVisibility(4);
                        }
                        setMeasuredDimension(0, 0);
                        if (this.f31020z) {
                            return;
                        }
                        this.f31009o0.m5589c(10001);
                        this.f31020z = true;
                        return;
                    }
                    z = true;
                    if (((Boolean) zzba.zzc().m23658b(g93.f10536R4)).booleanValue()) {
                    }
                    if (z) {
                    }
                }
                i3 = size4;
                if (mode2 != Integer.MIN_VALUE) {
                }
                i8 = size5;
                v84Var = this.f30976E;
                if (v84Var.f30028c <= i3) {
                    z = false;
                    if (((Boolean) zzba.zzc().m23658b(g93.f10536R4)).booleanValue()) {
                    }
                    if (z) {
                    }
                }
                z = true;
                if (((Boolean) zzba.zzc().m23658b(g93.f10536R4)).booleanValue()) {
                }
                if (z) {
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final void onPause() {
        if (mo6407o0()) {
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
        if (mo6407o0()) {
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
        if (!this.f30973B.m20958k() || this.f30973B.m20961f()) {
            sl2 sl2Var = this.f31011q;
            if (sl2Var != null) {
                sl2Var.m10201d(motionEvent);
            }
            ja3 ja3Var = this.f31012r;
            if (ja3Var != null) {
                ja3Var.m18676b(motionEvent);
            }
        } else {
            synchronized (this) {
                ec3 ec3Var = this.f30988Q;
                if (ec3Var != null) {
                    ec3Var.mo4031a(motionEvent);
                }
            }
        }
        if (mo6407o0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.daaw.a74
    /* renamed from: p */
    public final synchronized j23 mo6406p() {
        return this.f30990S;
    }

    @Override // com.daaw.a74
    /* renamed from: p0 */
    public final void mo6405p0(int i) {
        if (i == 0) {
            n93.m15381a(this.f30996b0.m9423a(), this.f30994W, "aebb2");
        }
        m6433T0();
        this.f30996b0.m9423a();
        this.f30996b0.m9423a().m7314d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f31013s.f36993p);
        mo6434T("onhide", hashMap);
    }

    @Override // com.daaw.a74
    /* renamed from: q */
    public final synchronized boolean mo6404q() {
        return this.f30983L;
    }

    @Override // com.daaw.a74
    /* renamed from: q0 */
    public final synchronized void mo6403q0(cc3 cc3Var) {
        this.f30989R = cc3Var;
    }

    @Override // com.daaw.a74
    /* renamed from: r */
    public final synchronized boolean mo6402r() {
        return this.f30991T > 0;
    }

    @Override // com.daaw.a74
    /* renamed from: r0 */
    public final f77 mo6401r0() {
        ja3 ja3Var = this.f31012r;
        return ja3Var == null ? s67.m10634i(null) : ja3Var.m18677a();
    }

    @Override // com.daaw.a74
    /* renamed from: s0 */
    public final void mo6400s0(Context context) {
        this.f31010p.setBaseContext(context);
        this.f31002h0.zze(this.f31010p.m8435a());
    }

    @Override // android.webkit.WebView, com.daaw.a74
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof h74) {
            this.f30973B = (h74) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (mo6407o0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            k04.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.daaw.a74, com.daaw.y24
    /* renamed from: t */
    public final synchronized void mo4236t(String str, j54 j54Var) {
        if (this.f31007m0 == null) {
            this.f31007m0 = new HashMap();
        }
        this.f31007m0.put(str, j54Var);
    }

    @Override // com.daaw.a74, com.daaw.y24
    /* renamed from: u */
    public final synchronized void mo4235u(z74 z74Var) {
        if (this.f30985N != null) {
            k04.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f30985N = z74Var;
        }
    }

    @Override // com.daaw.a74
    /* renamed from: u0 */
    public final synchronized void mo6399u0(j23 j23Var) {
        this.f30990S = j23Var;
    }

    @Override // com.daaw.a74, com.daaw.a84
    /* renamed from: v */
    public final wh6 mo6398v() {
        return this.f31019y;
    }

    @Override // com.daaw.a74
    /* renamed from: v0 */
    public final void mo6397v0() {
        throw null;
    }

    @Override // com.daaw.a74
    /* renamed from: w */
    public final synchronized void mo6396w(boolean z) {
        zzl zzlVar;
        int i = this.f30991T + (true != z ? -1 : 1);
        this.f30991T = i;
        if (i > 0 || (zzlVar = this.f30974C) == null) {
            return;
        }
        zzlVar.zzC();
    }

    @Override // com.daaw.a74
    /* renamed from: w0 */
    public final synchronized void mo6395w0(boolean z) {
        zzl zzlVar = this.f30974C;
        if (zzlVar != null) {
            zzlVar.zzw(this.f30973B.mo9450a(), z);
        } else {
            this.f30978G = z;
        }
    }

    @Override // com.daaw.a74
    /* renamed from: x */
    public final void mo6394x(String str, zg3 zg3Var) {
        h74 h74Var = this.f30973B;
        if (h74Var != null) {
            h74Var.m20965c(str, zg3Var);
        }
    }

    @Override // com.daaw.a74
    /* renamed from: x0 */
    public final boolean mo6393x0(final boolean z, final int i) {
        destroy();
        this.f31009o0.m5590b(new w33() { // from class: com.daaw.t74
            @Override // com.daaw.w33
            /* renamed from: a */
            public final void mo2497a(u53 u53Var) {
                boolean z2 = z;
                int i2 = i;
                int i3 = w74.f30971p0;
                j83 m17963L = k83.m17963L();
                if (m17963L.m18732u() != z2) {
                    m17963L.m18734s(z2);
                }
                m17963L.m18733t(i2);
                u53Var.m8577B((k83) m17963L.m22315n());
            }
        });
        this.f31009o0.m5589c(10003);
        return true;
    }

    @Override // com.daaw.a74
    /* renamed from: y */
    public final void mo6392y(String str, zg3 zg3Var) {
        h74 h74Var = this.f30973B;
        if (h74Var != null) {
            h74Var.m20974E0(str, zg3Var);
        }
    }

    @Override // com.daaw.a74
    /* renamed from: z */
    public final synchronized void mo6391z() {
        zze.zza("Destroying WebView!");
        m6443O0();
        zzs.zza.post(new v74(this));
    }

    @Override // com.daaw.y24
    public final void zzB(boolean z) {
        this.f30973B.m20966b(false);
    }

    @Override // com.daaw.a74
    public final synchronized ec3 zzM() {
        return this.f30988Q;
    }

    @Override // com.daaw.a74
    public final synchronized zzl zzN() {
        return this.f30974C;
    }

    @Override // com.daaw.a74
    public final synchronized zzl zzO() {
        return this.f31000f0;
    }

    @Override // com.daaw.a74
    public final /* synthetic */ t84 zzP() {
        return this.f30973B;
    }

    @Override // com.daaw.a74
    public final void zzX() {
        m6433T0();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f31013s.f36993p);
        mo6434T("onhide", hashMap);
    }

    @Override // com.daaw.a74
    public final void zzZ() {
        if (this.f30993V == null) {
            n93.m15381a(this.f30996b0.m9423a(), this.f30994W, "aes2");
            this.f30996b0.m9423a();
            s93 m7312f = v93.m7312f();
            this.f30993V = m7312f;
            this.f30996b0.m9422b("native:view_show", m7312f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f31013s.f36993p);
        mo6434T("onshow", hashMap);
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.f31014t;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.f31014t;
        if (zzlVar != null) {
            zzlVar.zzbo();
        }
    }

    @Override // com.daaw.y24
    public final int zzf() {
        return this.f30999e0;
    }

    @Override // com.daaw.y24
    public final int zzg() {
        return this.f30998d0;
    }

    @Override // com.daaw.y24
    public final synchronized int zzh() {
        return this.f30997c0;
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
        return this.f31010p.m8435a();
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final zza zzm() {
        return this.f31015u;
    }

    @Override // com.daaw.y24
    public final s93 zzn() {
        return this.f30994W;
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final t93 zzo() {
        return this.f30996b0;
    }

    @Override // com.daaw.a74, com.daaw.m84, com.daaw.y24
    public final zzchu zzp() {
        return this.f31013s;
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        h74 h74Var = this.f30973B;
        if (h74Var != null) {
            h74Var.zzq();
        }
    }

    @Override // com.daaw.vy4
    public final void zzr() {
        h74 h74Var = this.f30973B;
        if (h74Var != null) {
            h74Var.zzr();
        }
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final synchronized z74 zzs() {
        return this.f30985N;
    }

    @Override // com.daaw.y24
    public final synchronized String zzt() {
        wh6 wh6Var = this.f31019y;
        if (wh6Var != null) {
            return wh6Var.f31252b;
        }
        return null;
    }
}
