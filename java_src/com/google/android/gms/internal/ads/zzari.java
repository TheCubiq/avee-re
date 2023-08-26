package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
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
import com.daaw.avee.comp.VisualizerExporter.EncodingUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzhu;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
final class zzari extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzaqw {
    private zzamt zzaee;
    private final WindowManager zzaeu;
    private final DisplayMetrics zzagj;
    private final zzci zzbjc;
    private int zzbwy;
    private int zzbwz;
    private int zzbxb;
    private int zzbxc;
    private final zzhs zzcch;
    private String zzchp;
    private Boolean zzcpp;
    private zznv zzdad;
    private final zzash zzdda;
    private final com.google.android.gms.ads.internal.zzbo zzddb;
    private final float zzddc;
    private boolean zzddd;
    private boolean zzdde;
    private zzaqx zzddf;
    private com.google.android.gms.ads.internal.overlay.zzd zzddg;
    private zzasi zzddh;
    private boolean zzddi;
    private boolean zzddj;
    private boolean zzddk;
    private boolean zzddl;
    private int zzddm;
    private boolean zzddn;
    private boolean zzddo;
    private zzarl zzddp;
    private boolean zzddq;
    private boolean zzddr;
    private zzox zzdds;
    private int zzddt;
    private int zzddu;
    private zznv zzddv;
    private zznv zzddw;
    private zznw zzddx;
    private WeakReference<View.OnClickListener> zzddy;
    private com.google.android.gms.ads.internal.overlay.zzd zzddz;
    private boolean zzdea;
    private Map<String, zzaqh> zzdeb;
    private String zzus;
    private final com.google.android.gms.ads.internal.zzw zzwc;
    private final zzang zzyf;

    private zzari(zzash zzashVar, zzasi zzasiVar, String str, boolean z, boolean z2, zzci zzciVar, zzang zzangVar, zznx zznxVar, com.google.android.gms.ads.internal.zzbo zzboVar, com.google.android.gms.ads.internal.zzw zzwVar, zzhs zzhsVar) {
        super(zzashVar);
        this.zzddd = false;
        this.zzdde = false;
        this.zzddn = true;
        this.zzddo = false;
        this.zzchp = "";
        this.zzbwz = -1;
        this.zzbwy = -1;
        this.zzbxb = -1;
        this.zzbxc = -1;
        this.zzdda = zzashVar;
        this.zzddh = zzasiVar;
        this.zzus = str;
        this.zzddk = z;
        this.zzddm = -1;
        this.zzbjc = zzciVar;
        this.zzyf = zzangVar;
        this.zzddb = zzboVar;
        this.zzwc = zzwVar;
        this.zzaeu = (WindowManager) getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzbv.zzek();
        DisplayMetrics zza = zzakk.zza(this.zzaeu);
        this.zzagj = zza;
        this.zzddc = zza.density;
        this.zzcch = zzhsVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzakb.zzb("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        com.google.android.gms.ads.internal.zzbv.zzek().zza(zzashVar, zzangVar.zzcw, settings);
        com.google.android.gms.ads.internal.zzbv.zzem().zza(getContext(), settings);
        setDownloadListener(this);
        zzvk();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzaro.zzk(this), "googleAdsJsInterface");
        }
        if (PlatformVersion.isAtLeastHoneycomb()) {
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        this.zzaee = new zzamt(this.zzdda.zzto(), this, this, null);
        zzvo();
        zznw zznwVar = new zznw(new zznx(true, "make_wv", this.zzus));
        this.zzddx = zznwVar;
        zznwVar.zzji().zzc(zznxVar);
        zznv zzb = zznq.zzb(this.zzddx.zzji());
        this.zzdad = zzb;
        this.zzddx.zza("native:view_create", zzb);
        this.zzddw = null;
        this.zzddv = null;
        com.google.android.gms.ads.internal.zzbv.zzem().zzaw(zzashVar);
        com.google.android.gms.ads.internal.zzbv.zzeo().zzqe();
    }

    private final void zza(Boolean bool) {
        synchronized (this) {
            this.zzcpp = bool;
        }
        com.google.android.gms.ads.internal.zzbv.zzeo().zza(bool);
    }

    private final synchronized void zza(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    private final void zzal(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zza("onAdVisibilityChanged", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzari zzb(Context context, zzasi zzasiVar, String str, boolean z, boolean z2, zzci zzciVar, zzang zzangVar, zznx zznxVar, com.google.android.gms.ads.internal.zzbo zzboVar, com.google.android.gms.ads.internal.zzw zzwVar, zzhs zzhsVar) {
        return new zzari(new zzash(context), zzasiVar, str, z, z2, zzciVar, zzangVar, zznxVar, zzboVar, zzwVar, zzhsVar);
    }

    private final synchronized void zzds(String str) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    private final synchronized void zzdt(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            zzakb.zzc("Could not call loadUrl. ", e);
        }
    }

    private final void zzdu(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            String valueOf = String.valueOf(str);
            zzds(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        if (zzpz() == null) {
            zzvi();
        }
        if (zzpz().booleanValue()) {
            zza(str, (ValueCallback<String>) null);
            return;
        }
        String valueOf2 = String.valueOf(str);
        zzds(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    private final synchronized Boolean zzpz() {
        return this.zzcpp;
    }

    private final synchronized void zzqf() {
        if (!this.zzdea) {
            this.zzdea = true;
            com.google.android.gms.ads.internal.zzbv.zzeo().zzqf();
        }
    }

    private final boolean zzvh() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzddf.zzfz() || this.zzddf.zzuu()) {
            zzkb.zzif();
            DisplayMetrics displayMetrics = this.zzagj;
            int zzb = zzamu.zzb(displayMetrics, displayMetrics.widthPixels);
            zzkb.zzif();
            DisplayMetrics displayMetrics2 = this.zzagj;
            int zzb2 = zzamu.zzb(displayMetrics2, displayMetrics2.heightPixels);
            Activity zzto = this.zzdda.zzto();
            if (zzto == null || zzto.getWindow() == null) {
                i = zzb;
                i2 = zzb2;
            } else {
                com.google.android.gms.ads.internal.zzbv.zzek();
                int[] zzf = zzakk.zzf(zzto);
                zzkb.zzif();
                int zzb3 = zzamu.zzb(this.zzagj, zzf[0]);
                zzkb.zzif();
                i2 = zzamu.zzb(this.zzagj, zzf[1]);
                i = zzb3;
            }
            if (this.zzbwy == zzb && this.zzbwz == zzb2 && this.zzbxb == i && this.zzbxc == i2) {
                return false;
            }
            z = (this.zzbwy == zzb && this.zzbwz == zzb2) ? true : true;
            this.zzbwy = zzb;
            this.zzbwz = zzb2;
            this.zzbxb = i;
            this.zzbxc = i2;
            new zzaal(this).zza(zzb, zzb2, i, i2, this.zzagj.density, this.zzaeu.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    private final synchronized void zzvi() {
        Boolean zzpz = com.google.android.gms.ads.internal.zzbv.zzeo().zzpz();
        this.zzcpp = zzpz;
        if (zzpz == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zza((Boolean) true);
            } catch (IllegalStateException unused) {
                zza((Boolean) false);
            }
        }
    }

    private final void zzvj() {
        zznq.zza(this.zzddx.zzji(), this.zzdad, "aeh2");
    }

    private final synchronized void zzvk() {
        if (!this.zzddk && !this.zzddh.zzvs()) {
            if (Build.VERSION.SDK_INT < 18) {
                zzakb.zzck("Disabling hardware acceleration on an AdView.");
                zzvl();
                return;
            }
            zzakb.zzck("Enabling hardware acceleration on an AdView.");
            zzvm();
            return;
        }
        zzakb.zzck("Enabling hardware acceleration on an overlay.");
        zzvm();
    }

    private final synchronized void zzvl() {
        if (!this.zzddl) {
            com.google.android.gms.ads.internal.zzbv.zzem().zzz(this);
        }
        this.zzddl = true;
    }

    private final synchronized void zzvm() {
        if (this.zzddl) {
            com.google.android.gms.ads.internal.zzbv.zzem().zzy(this);
        }
        this.zzddl = false;
    }

    private final synchronized void zzvn() {
        this.zzdeb = null;
    }

    private final void zzvo() {
        zznx zzji;
        zznw zznwVar = this.zzddx;
        if (zznwVar == null || (zzji = zznwVar.zzji()) == null || com.google.android.gms.ads.internal.zzbv.zzeo().zzpy() == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzbv.zzeo().zzpy().zza(zzji);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public final synchronized void destroy() {
        zzvo();
        this.zzaee.zzsd();
        if (this.zzddg != null) {
            this.zzddg.close();
            this.zzddg.onDestroy();
            this.zzddg = null;
        }
        this.zzddf.reset();
        if (this.zzddj) {
            return;
        }
        com.google.android.gms.ads.internal.zzbv.zzff();
        zzaqg.zzb(this);
        zzvn();
        this.zzddj = true;
        zzakb.v("Initiating WebView self destruct sequence in 3...");
        zzakb.v("Loading blank page in WebView, 2...");
        zzdt("about:blank");
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzakb.zzdm("#004 The webview is destroyed. Ignoring action.");
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzddj) {
                    this.zzddf.reset();
                    com.google.android.gms.ads.internal.zzbv.zzff();
                    zzaqg.zzb(this);
                    zzvn();
                    zzqf();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final View.OnClickListener getOnClickListener() {
        return this.zzddy.get();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized int getRequestedOrientation() {
        return this.zzddm;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzasb
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized boolean isDestroyed() {
        return this.zzddj;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public final synchronized void loadData(String str, String str2, String str3) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public final synchronized void loadUrl(String str) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AdWebViewImpl.loadUrl");
            zzakb.zzc("Could not call loadUrl. ", e);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzaee.onAttachedToWindow();
        }
        boolean z = this.zzddq;
        if (this.zzddf != null && this.zzddf.zzuu()) {
            if (!this.zzddr) {
                ViewTreeObserver.OnGlobalLayoutListener zzuv = this.zzddf.zzuv();
                if (zzuv != null) {
                    com.google.android.gms.ads.internal.zzbv.zzfg();
                    zzaor.zza(this, zzuv);
                }
                ViewTreeObserver.OnScrollChangedListener zzuw = this.zzddf.zzuw();
                if (zzuw != null) {
                    com.google.android.gms.ads.internal.zzbv.zzfg();
                    zzaor.zza(this, zzuw);
                }
                this.zzddr = true;
            }
            zzvh();
            z = true;
        }
        zzal(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzaee.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzddr && this.zzddf != null && this.zzddf.zzuu() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener zzuv = this.zzddf.zzuv();
                if (zzuv != null) {
                    com.google.android.gms.ads.internal.zzbv.zzem().zza(getViewTreeObserver(), zzuv);
                }
                ViewTreeObserver.OnScrollChangedListener zzuw = this.zzddf.zzuw();
                if (zzuw != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(zzuw);
                }
                this.zzddr = false;
            }
        }
        zzal(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzbv.zzek();
            zzakk.zza(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzakb.zzck(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        zzaqx zzaqxVar = this.zzddf;
        if (zzaqxVar == null || zzaqxVar.zzve() == null) {
            return;
        }
        this.zzddf.zzve().zzda();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) zzkb.zzik().zzd(zznk.zzaxx)).booleanValue()) {
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
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzvh = zzvh();
        com.google.android.gms.ads.internal.overlay.zzd zzub = zzub();
        if (zzub == null || !zzvh) {
            return;
        }
        zzub.zznn();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011d A[Catch: all -> 0x01da, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:19:0x0030, B:23:0x003a, B:26:0x003f, B:29:0x0052, B:33:0x0060, B:32:0x005c, B:36:0x006d, B:38:0x0075, B:40:0x0087, B:43:0x008e, B:45:0x00aa, B:47:0x00b5, B:46:0x00b1, B:50:0x00ba, B:53:0x00bf, B:55:0x00c7, B:58:0x00d4, B:67:0x00fa, B:69:0x0101, B:74:0x010b, B:76:0x011d, B:78:0x012d, B:86:0x0147, B:88:0x019c, B:89:0x01a0, B:91:0x01a7, B:94:0x01b2, B:96:0x01b8, B:97:0x01bb, B:99:0x01bf, B:100:0x01c8, B:103:0x01d5), top: B:109:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147 A[Catch: all -> 0x01da, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:19:0x0030, B:23:0x003a, B:26:0x003f, B:29:0x0052, B:33:0x0060, B:32:0x005c, B:36:0x006d, B:38:0x0075, B:40:0x0087, B:43:0x008e, B:45:0x00aa, B:47:0x00b5, B:46:0x00b1, B:50:0x00ba, B:53:0x00bf, B:55:0x00c7, B:58:0x00d4, B:67:0x00fa, B:69:0x0101, B:74:0x010b, B:76:0x011d, B:78:0x012d, B:86:0x0147, B:88:0x019c, B:89:0x01a0, B:91:0x01a7, B:94:0x01b2, B:96:0x01b8, B:97:0x01bb, B:99:0x01bf, B:100:0x01c8, B:103:0x01d5), top: B:109:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b2 A[Catch: all -> 0x01da, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:19:0x0030, B:23:0x003a, B:26:0x003f, B:29:0x0052, B:33:0x0060, B:32:0x005c, B:36:0x006d, B:38:0x0075, B:40:0x0087, B:43:0x008e, B:45:0x00aa, B:47:0x00b5, B:46:0x00b1, B:50:0x00ba, B:53:0x00bf, B:55:0x00c7, B:58:0x00d4, B:67:0x00fa, B:69:0x0101, B:74:0x010b, B:76:0x011d, B:78:0x012d, B:86:0x0147, B:88:0x019c, B:89:0x01a0, B:91:0x01a7, B:94:0x01b2, B:96:0x01b8, B:97:0x01bb, B:99:0x01bf, B:100:0x01c8, B:103:0x01d5), top: B:109:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        if (isDestroyed()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzddk && !this.zzddh.zzvt()) {
            if (this.zzddh.zzvu()) {
                zzarl zztm = zztm();
                float aspectRatio = zztm != null ? zztm.getAspectRatio() : 0.0f;
                if (aspectRatio == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int i4 = (int) (size2 * aspectRatio);
                int i5 = (int) (size / aspectRatio);
                if (size2 == 0 && i5 != 0) {
                    i4 = (int) (i5 * aspectRatio);
                    size2 = i5;
                } else if (size == 0 && i4 != 0) {
                    i5 = (int) (i4 / aspectRatio);
                    size = i4;
                }
                setMeasuredDimension(Math.min(i4, size), Math.min(i5, size2));
                return;
            } else if (this.zzddh.isFluid()) {
                if (!((Boolean) zzkb.zzik().zzd(zznk.zzbch)).booleanValue() && PlatformVersion.isAtLeastJellyBeanMR1()) {
                    zza("/contentHeight", new zzarj(this));
                    zzdu("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    setMeasuredDimension(View.MeasureSpec.getSize(i), this.zzddu != -1 ? (int) (this.zzddu * this.zzagj.density) : View.MeasureSpec.getSize(i2));
                    return;
                }
                super.onMeasure(i, i2);
                return;
            } else if (this.zzddh.zzvs()) {
                setMeasuredDimension(this.zzagj.widthPixels, this.zzagj.heightPixels);
                return;
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size3 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size4 = View.MeasureSpec.getSize(i2);
                int i6 = Integer.MAX_VALUE;
                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                    i3 = Integer.MAX_VALUE;
                    if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                        i6 = size4;
                    }
                    if (this.zzddh.widthPixels <= i3 && this.zzddh.heightPixels <= i6) {
                        z = false;
                        if (((Boolean) zzkb.zzik().zzd(zznk.zzbfe)).booleanValue()) {
                            boolean z2 = ((float) this.zzddh.widthPixels) / this.zzddc <= ((float) i3) / this.zzddc && ((float) this.zzddh.heightPixels) / this.zzddc <= ((float) i6) / this.zzddc;
                            if (z) {
                                z = z2;
                            }
                        }
                        if (z) {
                            if (getVisibility() != 8) {
                                setVisibility(0);
                            }
                            if (!this.zzdde) {
                                this.zzcch.zza(zzhu.zza.zzb.BANNER_SIZE_VALID);
                                this.zzdde = true;
                            }
                            setMeasuredDimension(this.zzddh.widthPixels, this.zzddh.heightPixels);
                        } else {
                            StringBuilder sb = new StringBuilder(103);
                            sb.append("Not enough space to show ad. Needs ");
                            sb.append((int) (this.zzddh.widthPixels / this.zzddc));
                            sb.append("x");
                            sb.append((int) (this.zzddh.heightPixels / this.zzddc));
                            sb.append(" dp, but only has ");
                            sb.append((int) (size3 / this.zzddc));
                            sb.append("x");
                            sb.append((int) (size4 / this.zzddc));
                            sb.append(" dp.");
                            zzakb.zzdk(sb.toString());
                            if (getVisibility() != 8) {
                                setVisibility(4);
                            }
                            setMeasuredDimension(0, 0);
                            if (!this.zzddd) {
                                this.zzcch.zza(zzhu.zza.zzb.BANNER_SIZE_INVALID);
                                this.zzddd = true;
                                return;
                            }
                        }
                        return;
                    }
                    z = true;
                    if (((Boolean) zzkb.zzik().zzd(zznk.zzbfe)).booleanValue()) {
                    }
                    if (z) {
                    }
                    return;
                }
                i3 = size3;
                if (mode2 != Integer.MIN_VALUE) {
                }
                i6 = size4;
                if (this.zzddh.widthPixels <= i3) {
                    z = false;
                    if (((Boolean) zzkb.zzik().zzd(zznk.zzbfe)).booleanValue()) {
                    }
                    if (z) {
                    }
                    return;
                }
                z = true;
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbfe)).booleanValue()) {
                }
                if (z) {
                }
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public final void onPause() {
        if (isDestroyed()) {
            return;
        }
        try {
            if (PlatformVersion.isAtLeastHoneycomb()) {
                super.onPause();
            }
        } catch (Exception e) {
            zzakb.zzb("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public final void onResume() {
        if (isDestroyed()) {
            return;
        }
        try {
            if (PlatformVersion.isAtLeastHoneycomb()) {
                super.onResume();
            }
        } catch (Exception e) {
            zzakb.zzb("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzddf.zzuu()) {
            synchronized (this) {
                if (this.zzdds != null) {
                    this.zzdds.zzc(motionEvent);
                }
            }
        } else {
            zzci zzciVar = this.zzbjc;
            if (zzciVar != null) {
                zzciVar.zza(motionEvent);
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzaqw
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzddy = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void setRequestedOrientation(int i) {
        this.zzddm = i;
        if (this.zzddg != null) {
            this.zzddg.setRequestedOrientation(i);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzaqx) {
            this.zzddf = (zzaqx) webViewClient;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public final void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzakb.zzb("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzddf.zza(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzddg = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw
    public final synchronized void zza(zzarl zzarlVar) {
        if (this.zzddp != null) {
            zzakb.e("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzddp = zzarlVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zza(zzasi zzasiVar) {
        this.zzddh = zzasiVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zza(zzfs zzfsVar) {
        synchronized (this) {
            this.zzddq = zzfsVar.zztg;
        }
        zzal(zzfsVar.zztg);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zza(String str, com.google.android.gms.ads.internal.gmsg.zzv<? super zzaqw> zzvVar) {
        zzaqx zzaqxVar = this.zzddf;
        if (zzaqxVar != null) {
            zzaqxVar.zza(str, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zza(String str, Predicate<com.google.android.gms.ads.internal.gmsg.zzv<? super zzaqw>> predicate) {
        zzaqx zzaqxVar = this.zzddf;
        if (zzaqxVar != null) {
            zzaqxVar.zza(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zza(String str, Map<String, ?> map) {
        try {
            zza(str, com.google.android.gms.ads.internal.zzbv.zzek().zzn(map));
        } catch (JSONException unused) {
            zzakb.zzdk("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzakb.zzck(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzdu(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(boolean z, int i) {
        this.zzddf.zza(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(boolean z, int i, String str) {
        this.zzddf.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzddf.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final void zzah(boolean z) {
        this.zzddf.zzah(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzai(int i) {
        if (i == 0) {
            zznq.zza(this.zzddx.zzji(), this.zzdad, "aebb2");
        }
        zzvj();
        if (this.zzddx.zzji() != null) {
            this.zzddx.zzji().zze("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzyf.zzcw);
        zza("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzai(boolean z) {
        boolean z2 = z != this.zzddk;
        this.zzddk = z;
        zzvk();
        if (z2) {
            new zzaal(this).zzby(z ? "expanded" : EncodingUtils.DEFAULT_CODEC_NAME);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzaj(boolean z) {
        this.zzddn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzak(boolean z) {
        int i = this.zzddt + (z ? 1 : -1);
        this.zzddt = i;
        if (i <= 0 && this.zzddg != null) {
            this.zzddg.zznq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzb(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzddz = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzb(zzox zzoxVar) {
        this.zzdds = zzoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzb(String str, com.google.android.gms.ads.internal.gmsg.zzv<? super zzaqw> zzvVar) {
        zzaqx zzaqxVar = this.zzddf;
        if (zzaqxVar != null) {
            zzaqxVar.zzb(str, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        zzdu(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzbe(String str) {
        zzdu(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw
    public final com.google.android.gms.ads.internal.zzw zzbi() {
        return this.zzwc;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzbm(Context context) {
        this.zzdda.setBaseContext(context);
        this.zzaee.zzi(this.zzdda.zzto());
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzc(String str, String str2, String str3) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        if (((Boolean) zzkb.zzik().zzd(zznk.zzaya)).booleanValue()) {
            str2 = zzarx.zzb(str2, zzarx.zzvp());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.ads.internal.zzbo
    public final synchronized void zzcl() {
        this.zzddo = true;
        if (this.zzddb != null) {
            this.zzddb.zzcl();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzbo
    public final synchronized void zzcm() {
        this.zzddo = false;
        if (this.zzddb != null) {
            this.zzddb.zzcm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzdr(String str) {
        if (str == null) {
            str = "";
        }
        try {
            this.zzchp = str;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzno() {
        if (this.zzddv == null) {
            zznq.zza(this.zzddx.zzji(), this.zzdad, "aes2");
            zznv zzb = zznq.zzb(this.zzddx.zzji());
            this.zzddv = zzb;
            this.zzddx.zza("native:view_show", zzb);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzyf.zzcw);
        zza("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final void zznp() {
        com.google.android.gms.ads.internal.overlay.zzd zzub = zzub();
        if (zzub != null) {
            zzub.zznp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final synchronized String zzol() {
        return this.zzchp;
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final zzapn zztl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw
    public final synchronized zzarl zztm() {
        return this.zzddp;
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final zznv zztn() {
        return this.zzdad;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw, com.google.android.gms.internal.ads.zzarr
    public final Activity zzto() {
        return this.zzdda.zzto();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw
    public final zznw zztp() {
        return this.zzddx;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw, com.google.android.gms.internal.ads.zzasa
    public final zzang zztq() {
        return this.zzyf;
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final int zztr() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final int zzts() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzty() {
        zzvj();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzyf.zzcw);
        zza("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zztz() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzbv.zzfj().zzdp()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzbv.zzfj().zzdo()));
        hashMap.put("device_volume", String.valueOf(zzalb.zzay(getContext())));
        zza("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzu(boolean z) {
        if (this.zzddg != null) {
            this.zzddg.zza(this.zzddf.zzfz(), z);
        } else {
            this.zzddi = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final Context zzua() {
        return this.zzdda.zzua();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized com.google.android.gms.ads.internal.overlay.zzd zzub() {
        return this.zzddg;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized com.google.android.gms.ads.internal.overlay.zzd zzuc() {
        return this.zzddz;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzary
    public final synchronized zzasi zzud() {
        return this.zzddh;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized String zzue() {
        return this.zzus;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final /* synthetic */ zzasc zzuf() {
        return this.zzddf;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final WebViewClient zzug() {
        return this.zzddf;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized boolean zzuh() {
        return this.zzddi;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzarz
    public final zzci zzui() {
        return this.zzbjc;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzars
    public final synchronized boolean zzuj() {
        return this.zzddk;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized void zzuk() {
        zzakb.v("Destroying WebView!");
        zzqf();
        zzakk.zzcrm.post(new zzark(this));
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized boolean zzul() {
        return this.zzddn;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized boolean zzum() {
        return this.zzddo;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized boolean zzun() {
        return this.zzddt > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzuo() {
        this.zzaee.zzsc();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzup() {
        if (this.zzddw == null) {
            zznv zzb = zznq.zzb(this.zzddx.zzji());
            this.zzddw = zzb;
            this.zzddx.zza("native:view_load", zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final synchronized zzox zzuq() {
        return this.zzdds;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzur() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzus() {
        zzakb.v("Cannot add text view to inner AdWebView");
    }
}
