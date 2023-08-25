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

    /* renamed from: R */
    public static final /* synthetic */ int f12132R = 0;

    /* renamed from: A */
    public boolean f12133A;

    /* renamed from: B */
    public boolean f12134B;
    @GuardedBy("lock")

    /* renamed from: C */
    public boolean f12135C;
    @GuardedBy("lock")

    /* renamed from: D */
    public boolean f12136D;
    @GuardedBy("lock")

    /* renamed from: E */
    public boolean f12137E;

    /* renamed from: F */
    public zzz f12138F;

    /* renamed from: G */
    public gq3 f12139G;

    /* renamed from: H */
    public zzb f12140H;

    /* renamed from: I */
    public bq3 f12141I;

    /* renamed from: J */
    public cx3 f12142J;

    /* renamed from: K */
    public op6 f12143K;

    /* renamed from: L */
    public boolean f12144L;

    /* renamed from: M */
    public boolean f12145M;

    /* renamed from: N */
    public int f12146N;

    /* renamed from: O */
    public boolean f12147O;

    /* renamed from: P */
    public final HashSet f12148P;

    /* renamed from: Q */
    public View.OnAttachStateChangeListener f12149Q;

    /* renamed from: p */
    public final a74 f12150p;

    /* renamed from: q */
    public final x33 f12151q;

    /* renamed from: r */
    public final HashMap f12152r;

    /* renamed from: s */
    public final Object f12153s;

    /* renamed from: t */
    public zza f12154t;

    /* renamed from: u */
    public zzo f12155u;

    /* renamed from: v */
    public o84 f12156v;

    /* renamed from: w */
    public s84 f12157w;

    /* renamed from: x */
    public mf3 f12158x;

    /* renamed from: y */
    public of3 f12159y;

    /* renamed from: z */
    public vy4 f12160z;

    public h74(a74 a74Var, x33 x33Var, boolean z) {
        gq3 gq3Var = new gq3(a74Var, a74Var.mo6412j(), new m83(a74Var.getContext()));
        this.f12152r = new HashMap();
        this.f12153s = new Object();
        this.f12151q = x33Var;
        this.f12150p = a74Var;
        this.f12135C = z;
        this.f12139G = gq3Var;
        this.f12141I = null;
        this.f12148P = new HashSet(Arrays.asList(((String) zzba.zzc().m23658b(g93.f10638b5)).split(",")));
    }

    /* renamed from: H */
    public static final boolean m20971H(boolean z, a74 a74Var) {
        return (!z || a74Var.mo6408o().m7329i() || a74Var.mo6444O().equals("interstitial_mb")) ? false : true;
    }

    /* renamed from: l */
    public static WebResourceResponse m20957l() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10392D0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: A */
    public final void m20979A() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12149Q;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f12150p).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* renamed from: A0 */
    public final void m20978A0(boolean z, int i, boolean z2) {
        boolean m20971H = m20971H(this.f12150p.mo6449L(), this.f12150p);
        boolean z3 = true;
        if (!m20971H && z2) {
            z3 = false;
        }
        zza zzaVar = m20971H ? null : this.f12154t;
        zzo zzoVar = this.f12155u;
        zzz zzzVar = this.f12138F;
        a74 a74Var = this.f12150p;
        m20977B0(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, a74Var, z, i, a74Var.zzp(), z3 ? null : this.f12160z));
    }

    /* renamed from: B0 */
    public final void m20977B0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        bq3 bq3Var = this.f12141I;
        boolean m25919l = bq3Var != null ? bq3Var.m25919l() : false;
        zzt.zzi();
        zzm.zza(this.f12150p.getContext(), adOverlayInfoParcel, !m25919l);
        cx3 cx3Var = this.f12142J;
        if (cx3Var != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            cx3Var.zzh(str);
        }
    }

    /* renamed from: C0 */
    public final void m20976C0(boolean z, int i, String str, boolean z2) {
        boolean mo6449L = this.f12150p.mo6449L();
        boolean m20971H = m20971H(mo6449L, this.f12150p);
        boolean z3 = true;
        if (!m20971H && z2) {
            z3 = false;
        }
        zza zzaVar = m20971H ? null : this.f12154t;
        g74 g74Var = mo6449L ? null : new g74(this.f12150p, this.f12155u);
        mf3 mf3Var = this.f12158x;
        of3 of3Var = this.f12159y;
        zzz zzzVar = this.f12138F;
        a74 a74Var = this.f12150p;
        m20977B0(new AdOverlayInfoParcel(zzaVar, g74Var, mf3Var, of3Var, zzzVar, a74Var, z, i, str, a74Var.zzp(), z3 ? null : this.f12160z));
    }

    /* renamed from: D0 */
    public final void m20975D0(boolean z, int i, String str, String str2, boolean z2) {
        boolean mo6449L = this.f12150p.mo6449L();
        boolean m20971H = m20971H(mo6449L, this.f12150p);
        boolean z3 = true;
        if (!m20971H && z2) {
            z3 = false;
        }
        zza zzaVar = m20971H ? null : this.f12154t;
        g74 g74Var = mo6449L ? null : new g74(this.f12150p, this.f12155u);
        mf3 mf3Var = this.f12158x;
        of3 of3Var = this.f12159y;
        zzz zzzVar = this.f12138F;
        a74 a74Var = this.f12150p;
        m20977B0(new AdOverlayInfoParcel(zzaVar, g74Var, mf3Var, of3Var, zzzVar, a74Var, z, i, str, str2, a74Var.zzp(), z3 ? null : this.f12160z));
    }

    @Override // com.daaw.t84
    /* renamed from: E */
    public final void mo9454E(o84 o84Var) {
        this.f12156v = o84Var;
    }

    /* renamed from: E0 */
    public final void m20974E0(String str, zg3 zg3Var) {
        synchronized (this.f12153s) {
            List list = (List) this.f12152r.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f12152r.put(str, list);
            }
            list.add(zg3Var);
        }
    }

    /* renamed from: F */
    public final void m20973F(final View view, final cx3 cx3Var, final int i) {
        if (!cx3Var.zzi() || i <= 0) {
            return;
        }
        cx3Var.mo3151b(view);
        if (cx3Var.zzi()) {
            zzs.zza.postDelayed(new Runnable() { // from class: com.daaw.d74
                @Override // java.lang.Runnable
                public final void run() {
                    h74.this.m20956l0(view, cx3Var, i);
                }
            }, 100L);
        }
    }

    /* renamed from: F0 */
    public final void m20972F0() {
        cx3 cx3Var = this.f12142J;
        if (cx3Var != null) {
            cx3Var.zze();
            this.f12142J = null;
        }
        m20979A();
        synchronized (this.f12153s) {
            this.f12152r.clear();
            this.f12154t = null;
            this.f12155u = null;
            this.f12156v = null;
            this.f12157w = null;
            this.f12158x = null;
            this.f12159y = null;
            this.f12133A = false;
            this.f12135C = false;
            this.f12136D = false;
            this.f12138F = null;
            this.f12140H = null;
            this.f12139G = null;
            bq3 bq3Var = this.f12141I;
            if (bq3Var != null) {
                bq3Var.m25923h(true);
                this.f12141I = null;
            }
            this.f12143K = null;
        }
    }

    @Override // com.daaw.t84
    /* renamed from: G */
    public final void mo9453G(int i, int i2, boolean z) {
        gq3 gq3Var = this.f12139G;
        if (gq3Var != null) {
            gq3Var.m21344h(i, i2);
        }
        bq3 bq3Var = this.f12141I;
        if (bq3Var != null) {
            bq3Var.m25921j(i, i2, false);
        }
    }

    @Override // com.daaw.t84
    /* renamed from: J */
    public final void mo9452J(zza zzaVar, mf3 mf3Var, zzo zzoVar, of3 of3Var, zzz zzzVar, boolean z, bh3 bh3Var, zzb zzbVar, iq3 iq3Var, cx3 cx3Var, final cq5 cq5Var, final op6 op6Var, kd5 kd5Var, on6 on6Var, rh3 rh3Var, final vy4 vy4Var, qh3 qh3Var, kh3 kh3Var) {
        zg3 zg3Var;
        zzb zzbVar2 = zzbVar == null ? new zzb(this.f12150p.getContext(), cx3Var, null) : zzbVar;
        this.f12141I = new bq3(this.f12150p, iq3Var);
        this.f12142J = cx3Var;
        if (((Boolean) zzba.zzc().m23658b(g93.f10472L0)).booleanValue()) {
            m20974E0("/adMetadata", new lf3(mf3Var));
        }
        if (of3Var != null) {
            m20974E0("/appEvent", new nf3(of3Var));
        }
        m20974E0("/backButton", yg3.f33653j);
        m20974E0("/refresh", yg3.f33654k);
        m20974E0("/canOpenApp", yg3.f33645b);
        m20974E0("/canOpenURLs", yg3.f33644a);
        m20974E0("/canOpenIntents", yg3.f33646c);
        m20974E0("/close", yg3.f33647d);
        m20974E0("/customClose", yg3.f33648e);
        m20974E0("/instrument", yg3.f33657n);
        m20974E0("/delayPageLoaded", yg3.f33659p);
        m20974E0("/delayPageClosed", yg3.f33660q);
        m20974E0("/getLocationInfo", yg3.f33661r);
        m20974E0("/log", yg3.f33650g);
        m20974E0("/mraid", new fh3(zzbVar2, this.f12141I, iq3Var));
        gq3 gq3Var = this.f12139G;
        if (gq3Var != null) {
            m20974E0("/mraidLoaded", gq3Var);
        }
        zzb zzbVar3 = zzbVar2;
        m20974E0("/open", new jh3(zzbVar2, this.f12141I, cq5Var, kd5Var, on6Var));
        m20974E0("/precache", new k54());
        m20974E0("/touch", yg3.f33652i);
        m20974E0("/video", yg3.f33655l);
        m20974E0("/videoMeta", yg3.f33656m);
        if (cq5Var == null || op6Var == null) {
            m20974E0("/click", yg3.m3759a(vy4Var));
            zg3Var = yg3.f33649f;
        } else {
            m20974E0("/click", new zg3() { // from class: com.daaw.yi6
                @Override // com.daaw.zg3
                /* renamed from: a */
                public final void mo2341a(Object obj, Map map) {
                    vy4 vy4Var2 = vy4.this;
                    op6 op6Var2 = op6Var;
                    cq5 cq5Var2 = cq5Var;
                    a74 a74Var = (a74) obj;
                    yg3.m3756d(map, vy4Var2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        k04.zzj("URL missing from click GMSG.");
                    } else {
                        s67.m10625r(yg3.m3758b(a74Var, str), new zi6(a74Var, op6Var2, cq5Var2), z04.f34305a);
                    }
                }
            });
            zg3Var = new zg3() { // from class: com.daaw.xi6
                @Override // com.daaw.zg3
                /* renamed from: a */
                public final void mo2341a(Object obj, Map map) {
                    op6 op6Var2 = op6.this;
                    cq5 cq5Var2 = cq5Var;
                    r64 r64Var = (r64) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        k04.zzj("URL missing from httpTrack GMSG.");
                    } else if (r64Var.mo6421d().f27701k0) {
                        cq5Var2.m25118u(new eq5(zzt.zzB().mo15860a(), ((a84) r64Var).mo6398v().f31252b, str, 2));
                    } else {
                        op6Var2.m14098c(str, null);
                    }
                }
            };
        }
        m20974E0("/httpTrack", zg3Var);
        if (zzt.zzn().m17317z(this.f12150p.getContext())) {
            m20974E0("/logScionEvent", new eh3(this.f12150p.getContext()));
        }
        if (bh3Var != null) {
            m20974E0("/setInterstitialProperties", new ah3(bh3Var, null));
        }
        if (rh3Var != null) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue()) {
                m20974E0("/inspectorNetworkExtras", rh3Var);
            }
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10806q8)).booleanValue() && qh3Var != null) {
            m20974E0("/shareSheet", qh3Var);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10839t8)).booleanValue() && kh3Var != null) {
            m20974E0("/inspectorOutOfContextTest", kh3Var);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10862v9)).booleanValue()) {
            m20974E0("/bindPlayStoreOverlay", yg3.f33664u);
            m20974E0("/presentPlayStoreOverlay", yg3.f33665v);
            m20974E0("/expandPlayStoreOverlay", yg3.f33666w);
            m20974E0("/collapsePlayStoreOverlay", yg3.f33667x);
            m20974E0("/closePlayStoreOverlay", yg3.f33668y);
            if (((Boolean) zzba.zzc().m23658b(g93.f10464K2)).booleanValue()) {
                m20974E0("/setPAIDPersonalizationEnabled", yg3.f33643A);
                m20974E0("/resetPAID", yg3.f33669z);
            }
        }
        this.f12154t = zzaVar;
        this.f12155u = zzoVar;
        this.f12158x = mf3Var;
        this.f12159y = of3Var;
        this.f12138F = zzzVar;
        this.f12140H = zzbVar3;
        this.f12160z = vy4Var;
        this.f12133A = z;
        this.f12143K = op6Var;
    }

    /* renamed from: M */
    public final ViewTreeObserver.OnGlobalLayoutListener m20970M() {
        synchronized (this.f12153s) {
        }
        return null;
    }

    /* renamed from: S */
    public final ViewTreeObserver.OnScrollChangedListener m20969S() {
        synchronized (this.f12153s) {
        }
        return null;
    }

    /* renamed from: T */
    public final WebResourceResponse m20968T(String str, Map map) {
        zzbef m21054b;
        try {
            if (((Boolean) gb3.f11010a.m16137e()).booleanValue() && this.f12143K != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.f12143K.m14098c(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String m15658c = my3.m15658c(str, this.f12150p.getContext(), this.f12147O);
            if (m15658c.equals(str)) {
                zzbei m1106h = zzbei.m1106h(Uri.parse(str));
                if (m1106h == null || (m21054b = zzt.zzc().m21054b(m1106h)) == null || !m21054b.m1109u()) {
                    if (j04.m19188l() && ((Boolean) wa3.f31101b.m16137e()).booleanValue()) {
                        return m20955m(str, map);
                    }
                    return null;
                }
                return new WebResourceResponse("", "", m21054b.m1111s());
            }
            return m20955m(m15658c, map);
        } catch (Exception | NoClassDefFoundError e) {
            zzt.zzo().m11902u(e, "AdWebViewClient.interceptRequest");
            return m20957l();
        }
    }

    @Override // com.daaw.t84
    /* renamed from: Z */
    public final void mo9451Z(boolean z) {
        synchronized (this.f12153s) {
            this.f12136D = true;
        }
    }

    @Override // com.daaw.t84
    /* renamed from: a */
    public final boolean mo9450a() {
        boolean z;
        synchronized (this.f12153s) {
            z = this.f12135C;
        }
        return z;
    }

    /* renamed from: b */
    public final void m20966b(boolean z) {
        this.f12133A = false;
    }

    /* renamed from: c */
    public final void m20965c(String str, zg3 zg3Var) {
        synchronized (this.f12153s) {
            List list = (List) this.f12152r.get(str);
            if (list == null) {
                return;
            }
            list.remove(zg3Var);
        }
    }

    /* renamed from: e */
    public final void m20963e(String str, uy0 uy0Var) {
        synchronized (this.f12153s) {
            List<zg3> list = (List) this.f12152r.get(str);
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

    /* renamed from: e0 */
    public final void m20962e0() {
        if (this.f12156v != null && ((this.f12144L && this.f12146N <= 0) || this.f12145M || this.f12134B)) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() && this.f12150p.zzo() != null) {
                n93.m15381a(this.f12150p.zzo().m9423a(), this.f12150p.zzn(), "awfllc");
            }
            o84 o84Var = this.f12156v;
            boolean z = false;
            if (!this.f12145M && !this.f12134B) {
                z = true;
            }
            o84Var.zza(z);
            this.f12156v = null;
        }
        this.f12150p.mo6446N();
    }

    /* renamed from: f */
    public final boolean m20961f() {
        boolean z;
        synchronized (this.f12153s) {
            z = this.f12137E;
        }
        return z;
    }

    /* renamed from: h0 */
    public final void m20960h0(boolean z) {
        this.f12147O = z;
    }

    /* renamed from: i0 */
    public final /* synthetic */ void m20959i0() {
        this.f12150p.mo6419f0();
        zzl zzN = this.f12150p.zzN();
        if (zzN != null) {
            zzN.zzx();
        }
    }

    /* renamed from: k */
    public final boolean m20958k() {
        boolean z;
        synchronized (this.f12153s) {
            z = this.f12136D;
        }
        return z;
    }

    @Override // com.daaw.t84
    /* renamed from: k0 */
    public final void mo9449k0(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.f12152r.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) zzba.zzc().m23658b(g93.f10705h6)).booleanValue() || zzt.zzo().m11917f() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            z04.f34305a.execute(new Runnable() { // from class: com.daaw.b74
                @Override // java.lang.Runnable
                public final void run() {
                    String str = substring;
                    int i = h74.f12132R;
                    zzt.zzo().m11917f().m17082e(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzba.zzc().m23658b(g93.f10627a5)).booleanValue() && this.f12148P.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzba.zzc().m23658b(g93.f10649c5)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                s67.m10625r(zzt.zzp().zzb(uri), new f74(this, list, path, uri), z04.f34309e);
                return;
            }
        }
        zzt.zzp();
        m20952s(zzs.zzL(uri), list, path);
    }

    /* renamed from: l0 */
    public final /* synthetic */ void m20956l0(View view, cx3 cx3Var, int i) {
        m20973F(view, cx3Var, i - 1);
    }

    /* renamed from: m */
    public final WebResourceResponse m20955m(String str, Map map) {
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
                zzt.zzp().zze(this.f12150p.getContext(), this.f12150p.zzp().f36993p, false, httpURLConnection, false, 60000);
                j04 j04Var = new j04(null);
                j04Var.m19197c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                j04Var.m19195e(httpURLConnection, responseCode);
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
                    return m20957l();
                } else if (!protocol.equals("http") && !protocol.equals("https")) {
                    k04.zzj("Unsupported scheme: " + protocol);
                    return m20957l();
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

    /* renamed from: m0 */
    public final void m20954m0(zzc zzcVar, boolean z) {
        boolean mo6449L = this.f12150p.mo6449L();
        boolean m20971H = m20971H(mo6449L, this.f12150p);
        boolean z2 = true;
        if (!m20971H && z) {
            z2 = false;
        }
        m20977B0(new AdOverlayInfoParcel(zzcVar, m20971H ? null : this.f12154t, mo6449L ? null : this.f12155u, this.f12138F, this.f12150p.zzp(), this.f12150p, z2 ? null : this.f12160z));
    }

    /* renamed from: n0 */
    public final void m20953n0(zzbr zzbrVar, cq5 cq5Var, kd5 kd5Var, on6 on6Var, String str, String str2, int i) {
        a74 a74Var = this.f12150p;
        m20977B0(new AdOverlayInfoParcel(a74Var, a74Var.zzp(), zzbrVar, cq5Var, kd5Var, on6Var, str, str2, 14));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zzaVar = this.f12154t;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo9449k0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f12153s) {
            if (this.f12150p.mo6407o0()) {
                zze.zza("Blank page loaded, 1...");
                this.f12150p.mo6391z();
                return;
            }
            this.f12144L = true;
            s84 s84Var = this.f12157w;
            if (s84Var != null) {
                s84Var.zza();
                this.f12157w = null;
            }
            m20962e0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f12134B = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f12150p.mo6393x0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: s */
    public final void m20952s(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zg3) it.next()).mo2341a(this.f12150p, map);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m20968T(str, Collections.emptyMap());
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
            case p21.f22268J0 /* 91 */:
                return true;
            default:
                switch (keyCode) {
                    case x21.f31819M0 /* 126 */:
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
            mo9449k0(parse);
        } else {
            if (this.f12133A && webView == this.f12150p.mo6416h()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zza zzaVar = this.f12154t;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        cx3 cx3Var = this.f12142J;
                        if (cx3Var != null) {
                            cx3Var.zzh(str);
                        }
                        this.f12154t = null;
                    }
                    vy4 vy4Var = this.f12160z;
                    if (vy4Var != null) {
                        vy4Var.zzq();
                        this.f12160z = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f12150p.mo6416h().willNotDraw()) {
                k04.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    sl2 mo6425a = this.f12150p.mo6425a();
                    if (mo6425a != null && mo6425a.m10199f(parse)) {
                        Context context = this.f12150p.getContext();
                        a74 a74Var = this.f12150p;
                        parse = mo6425a.m10204a(parse, context, (View) a74Var, a74Var.zzk());
                    }
                } catch (tl2 unused) {
                    k04.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzbVar = this.f12140H;
                if (zzbVar == null || zzbVar.zzc()) {
                    m20954m0(new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    this.f12140H.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.daaw.t84
    /* renamed from: t0 */
    public final void mo9448t0(boolean z) {
        synchronized (this.f12153s) {
            this.f12137E = z;
        }
    }

    @Override // com.daaw.t84
    /* renamed from: y0 */
    public final void mo9447y0(s84 s84Var) {
        this.f12157w = s84Var;
    }

    @Override // com.daaw.t84
    /* renamed from: z0 */
    public final void mo9446z0(int i, int i2) {
        bq3 bq3Var = this.f12141I;
        if (bq3Var != null) {
            bq3Var.m25920k(i, i2);
        }
    }

    @Override // com.daaw.t84
    public final void zzE() {
        synchronized (this.f12153s) {
            this.f12133A = false;
            this.f12135C = true;
            z04.f34309e.execute(new Runnable() { // from class: com.daaw.c74
                @Override // java.lang.Runnable
                public final void run() {
                    h74.this.m20959i0();
                }
            });
        }
    }

    @Override // com.daaw.t84
    public final zzb zzd() {
        return this.f12140H;
    }

    @Override // com.daaw.t84
    public final void zzj() {
        x33 x33Var = this.f12151q;
        if (x33Var != null) {
            x33Var.m5589c(10005);
        }
        this.f12145M = true;
        m20962e0();
        this.f12150p.destroy();
    }

    @Override // com.daaw.t84
    public final void zzk() {
        synchronized (this.f12153s) {
        }
        this.f12146N++;
        m20962e0();
    }

    @Override // com.daaw.t84
    public final void zzl() {
        this.f12146N--;
        m20962e0();
    }

    @Override // com.daaw.t84
    public final void zzp() {
        cx3 cx3Var = this.f12142J;
        if (cx3Var != null) {
            WebView mo6416h = this.f12150p.mo6416h();
            if (xs1.m4743U(mo6416h)) {
                m20973F(mo6416h, cx3Var, 10);
                return;
            }
            m20979A();
            e74 e74Var = new e74(this, cx3Var);
            this.f12149Q = e74Var;
            ((View) this.f12150p).addOnAttachStateChangeListener(e74Var);
        }
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        vy4 vy4Var = this.f12160z;
        if (vy4Var != null) {
            vy4Var.zzq();
        }
    }

    @Override // com.daaw.vy4
    public final void zzr() {
        vy4 vy4Var = this.f12160z;
        if (vy4Var != null) {
            vy4Var.zzr();
        }
    }
}
