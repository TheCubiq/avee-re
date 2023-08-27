package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzasj extends zzus<zzaqw> implements zzasc, zzasx, zzasz, zzata, zzatb {
    private final Object mLock;
    private boolean zzaek;
    private zzjd zzapt;
    private com.google.android.gms.ads.internal.gmsg.zzb zzbll;
    private com.google.android.gms.ads.internal.gmsg.zzd zzblm;
    private com.google.android.gms.ads.internal.gmsg.zzz zzbmu;
    private com.google.android.gms.ads.internal.zzx zzbmw;
    private zzaab zzbmx;
    private zzaam zzbmy;
    private com.google.android.gms.ads.internal.overlay.zzt zzbnb;
    private com.google.android.gms.ads.internal.overlay.zzn zzbnc;
    private zzaqw zzbnd;
    private zzasd zzdbr;
    private zzase zzdbs;
    private zzasf zzdbt;
    private boolean zzdbu;
    private boolean zzdbv;
    private ViewTreeObserver.OnGlobalLayoutListener zzdbw;
    private ViewTreeObserver.OnScrollChangedListener zzdbx;
    private boolean zzdby;
    private final zzaak zzdbz;
    private zzasg zzdca;
    private boolean zzdcb;
    private boolean zzdcc;
    private int zzdcd;
    private View.OnAttachStateChangeListener zzdce;
    private zzait zzxd;

    public zzasj(zzaqw zzaqwVar, boolean z) {
        this(zzaqwVar, z, new zzaak(zzaqwVar, zzaqwVar.zzua(), new zzmw(zzaqwVar.getContext())), null);
    }

    private zzasj(zzaqw zzaqwVar, boolean z, zzaak zzaakVar, zzaab zzaabVar) {
        this.mLock = new Object();
        this.zzdbu = false;
        this.zzbnd = zzaqwVar;
        this.zzaek = z;
        this.zzdbz = zzaakVar;
        this.zzbmx = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view, zzait zzaitVar, int i) {
        if (!zzaitVar.zzph() || i <= 0) {
            return;
        }
        zzaitVar.zzr(view);
        if (zzaitVar.zzph()) {
            zzakk.zzcrm.postDelayed(new zzasl(this, view, zzaitVar, i), 100L);
        }
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzaab zzaabVar = this.zzbmx;
        boolean zznf = zzaabVar != null ? zzaabVar.zznf() : false;
        com.google.android.gms.ads.internal.zzbv.zzei();
        com.google.android.gms.ads.internal.overlay.zzl.zza(this.zzbnd.getContext(), adOverlayInfoParcel, !zznf);
        if (this.zzxd != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzbyl != null) {
                str = adOverlayInfoParcel.zzbyl.url;
            }
            this.zzxd.zzcf(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
        com.google.android.gms.ads.internal.zzbv.zzek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
        return com.google.android.gms.internal.ads.zzakk.zzb(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WebResourceResponse zze(zzasu zzasuVar) throws IOException {
        URL url = new URL(zzasuVar.url);
        int i = 0;
        while (true) {
            i++;
            if (i > 20) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
            URLConnection openConnection = url.openConnection();
            openConnection.setConnectTimeout(10000);
            openConnection.setReadTimeout(10000);
            for (Map.Entry<String, String> entry : zzasuVar.zzab.entrySet()) {
                openConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            com.google.android.gms.ads.internal.zzbv.zzek().zza(this.zzbnd.getContext(), this.zzbnd.zztq().zzcw, false, httpURLConnection);
            zzamy zzamyVar = new zzamy();
            zzamyVar.zza(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            zzamyVar.zza(httpURLConnection, responseCode);
            if (responseCode < 300 || responseCode >= 400) {
                break;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                zzakb.zzdk("Protocol is null");
                return null;
            } else if (!protocol.equals("http") && !protocol.equals("https")) {
                String valueOf = String.valueOf(protocol);
                zzakb.zzdk(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
                return null;
            } else {
                String valueOf2 = String.valueOf(headerField);
                zzakb.zzck(valueOf2.length() != 0 ? "Redirecting to ".concat(valueOf2) : new String("Redirecting to "));
                httpURLConnection.disconnect();
                url = url2;
            }
        }
    }

    private final void zzuy() {
        if (this.zzdce == null) {
            return;
        }
        this.zzbnd.getView().removeOnAttachStateChangeListener(this.zzdce);
    }

    private final void zzvd() {
        if (this.zzdbr != null && ((this.zzdcb && this.zzdcd <= 0) || this.zzdcc)) {
            this.zzdbr.zze(!this.zzdcc);
            this.zzdbr = null;
        }
        this.zzbnd.zzup();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzaqw getReference() {
        return this.zzbnd;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void reset() {
        zzait zzaitVar = this.zzxd;
        if (zzaitVar != null) {
            zzaitVar.zzpj();
            this.zzxd = null;
        }
        zzuy();
        super.reset();
        synchronized (this.mLock) {
            this.zzapt = null;
            this.zzbnc = null;
            this.zzdbr = null;
            this.zzdbs = null;
            this.zzbll = null;
            this.zzblm = null;
            this.zzdbu = false;
            this.zzaek = false;
            this.zzdbv = false;
            this.zzdby = false;
            this.zzbnb = null;
            this.zzdbt = null;
            if (this.zzbmx != null) {
                this.zzbmx.zzm(true);
                this.zzbmx = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(int i, int i2, boolean z) {
        this.zzdbz.zzc(i, i2);
        zzaab zzaabVar = this.zzbmx;
        if (zzaabVar != null) {
            zzaabVar.zza(i, i2, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.mLock) {
            this.zzdbv = true;
            this.zzbnd.zzuo();
            this.zzdbw = onGlobalLayoutListener;
            this.zzdbx = onScrollChangedListener;
        }
    }

    public final void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        boolean zzuj = this.zzbnd.zzuj();
        zza(new AdOverlayInfoParcel(zzcVar, (!zzuj || this.zzbnd.zzud().zzvs()) ? this.zzapt : null, zzuj ? null : this.zzbnc, this.zzbnb, this.zzbnd.zztq()));
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzasd zzasdVar) {
        this.zzdbr = zzasdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzase zzaseVar) {
        this.zzdbs = zzaseVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzasf zzasfVar) {
        this.zzdbt = zzasfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzasg zzasgVar) {
        this.zzdca = zzasgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzjd zzjdVar, com.google.android.gms.ads.internal.gmsg.zzb zzbVar, com.google.android.gms.ads.internal.overlay.zzn zznVar, com.google.android.gms.ads.internal.gmsg.zzd zzdVar, com.google.android.gms.ads.internal.overlay.zzt zztVar, boolean z, com.google.android.gms.ads.internal.gmsg.zzz zzzVar, com.google.android.gms.ads.internal.zzx zzxVar, zzaam zzaamVar, zzait zzaitVar) {
        com.google.android.gms.ads.internal.zzx zzxVar2 = zzxVar == null ? new com.google.android.gms.ads.internal.zzx(this.zzbnd.getContext(), zzaitVar, null) : zzxVar;
        this.zzbmx = new zzaab(this.zzbnd, zzaamVar);
        this.zzxd = zzaitVar;
        if (((Boolean) zzkb.zzik().zzd(zznk.zzayf)).booleanValue()) {
            zza("/adMetadata", new com.google.android.gms.ads.internal.gmsg.zza(zzbVar));
        }
        zza("/appEvent", new com.google.android.gms.ads.internal.gmsg.zzc(zzdVar));
        zza("/backButton", com.google.android.gms.ads.internal.gmsg.zzf.zzblx);
        zza("/refresh", com.google.android.gms.ads.internal.gmsg.zzf.zzbly);
        zza("/canOpenURLs", com.google.android.gms.ads.internal.gmsg.zzf.zzblo);
        zza("/canOpenIntents", com.google.android.gms.ads.internal.gmsg.zzf.zzblp);
        zza("/click", com.google.android.gms.ads.internal.gmsg.zzf.zzblq);
        zza("/close", com.google.android.gms.ads.internal.gmsg.zzf.zzblr);
        zza("/customClose", com.google.android.gms.ads.internal.gmsg.zzf.zzbls);
        zza("/instrument", com.google.android.gms.ads.internal.gmsg.zzf.zzbmb);
        zza("/delayPageLoaded", com.google.android.gms.ads.internal.gmsg.zzf.zzbmd);
        zza("/delayPageClosed", com.google.android.gms.ads.internal.gmsg.zzf.zzbme);
        zza("/getLocationInfo", com.google.android.gms.ads.internal.gmsg.zzf.zzbmf);
        zza("/httpTrack", com.google.android.gms.ads.internal.gmsg.zzf.zzblt);
        zza("/log", com.google.android.gms.ads.internal.gmsg.zzf.zzblu);
        zza("/mraid", new com.google.android.gms.ads.internal.gmsg.zzac(zzxVar2, this.zzbmx, zzaamVar));
        zza("/mraidLoaded", this.zzdbz);
        com.google.android.gms.ads.internal.zzx zzxVar3 = zzxVar2;
        zza("/open", new com.google.android.gms.ads.internal.gmsg.zzad(this.zzbnd.getContext(), this.zzbnd.zztq(), this.zzbnd.zzui(), zztVar, zzjdVar, zzbVar, zzdVar, zznVar, zzxVar2, this.zzbmx));
        zza("/precache", new zzaql());
        zza("/touch", com.google.android.gms.ads.internal.gmsg.zzf.zzblw);
        zza("/video", com.google.android.gms.ads.internal.gmsg.zzf.zzblz);
        zza("/videoMeta", com.google.android.gms.ads.internal.gmsg.zzf.zzbma);
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzs(this.zzbnd.getContext())) {
            zza("/logScionEvent", new com.google.android.gms.ads.internal.gmsg.zzab(this.zzbnd.getContext()));
        }
        if (zzzVar != null) {
            zza("/setInterstitialProperties", new com.google.android.gms.ads.internal.gmsg.zzy(zzzVar));
        }
        this.zzapt = zzjdVar;
        this.zzbnc = zznVar;
        this.zzbll = zzbVar;
        this.zzblm = zzdVar;
        this.zzbnb = zztVar;
        this.zzbmw = zzxVar3;
        this.zzbmy = zzaamVar;
        this.zzbmu = zzzVar;
        this.zzdbu = z;
    }

    public final void zza(boolean z, int i) {
        zzjd zzjdVar = (!this.zzbnd.zzuj() || this.zzbnd.zzud().zzvs()) ? this.zzapt : null;
        com.google.android.gms.ads.internal.overlay.zzn zznVar = this.zzbnc;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzbnb;
        zzaqw zzaqwVar = this.zzbnd;
        zza(new AdOverlayInfoParcel(zzjdVar, zznVar, zztVar, zzaqwVar, z, i, zzaqwVar.zztq()));
    }

    public final void zza(boolean z, int i, String str) {
        boolean zzuj = this.zzbnd.zzuj();
        zzjd zzjdVar = (!zzuj || this.zzbnd.zzud().zzvs()) ? this.zzapt : null;
        zzasn zzasnVar = zzuj ? null : new zzasn(this.zzbnd, this.zzbnc);
        com.google.android.gms.ads.internal.gmsg.zzb zzbVar = this.zzbll;
        com.google.android.gms.ads.internal.gmsg.zzd zzdVar = this.zzblm;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzbnb;
        zzaqw zzaqwVar = this.zzbnd;
        zza(new AdOverlayInfoParcel(zzjdVar, zzasnVar, zzbVar, zzdVar, zztVar, zzaqwVar, z, i, str, zzaqwVar.zztq()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzuj = this.zzbnd.zzuj();
        zzjd zzjdVar = (!zzuj || this.zzbnd.zzud().zzvs()) ? this.zzapt : null;
        zzasn zzasnVar = zzuj ? null : new zzasn(this.zzbnd, this.zzbnc);
        com.google.android.gms.ads.internal.gmsg.zzb zzbVar = this.zzbll;
        com.google.android.gms.ads.internal.gmsg.zzd zzdVar = this.zzblm;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzbnb;
        zzaqw zzaqwVar = this.zzbnd;
        zza(new AdOverlayInfoParcel(zzjdVar, zzasnVar, zzbVar, zzdVar, zztVar, zzaqwVar, z, i, str, str2, zzaqwVar.zztq()));
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final boolean zza(zzasu zzasuVar) {
        String valueOf = String.valueOf(zzasuVar.url);
        zzakb.v(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = zzasuVar.uri;
        if (zzf(uri)) {
            return true;
        }
        if (this.zzdbu) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.zzapt != null) {
                    if (((Boolean) zzkb.zzik().zzd(zznk.zzaxf)).booleanValue()) {
                        this.zzapt.onAdClicked();
                        zzait zzaitVar = this.zzxd;
                        if (zzaitVar != null) {
                            zzaitVar.zzcf(zzasuVar.url);
                        }
                        this.zzapt = null;
                    }
                }
                return false;
            }
        }
        if (this.zzbnd.getWebView().willNotDraw()) {
            String valueOf2 = String.valueOf(zzasuVar.url);
            zzakb.zzdk(valueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf2) : new String("AdWebView unable to handle URL: "));
        } else {
            try {
                zzci zzui = this.zzbnd.zzui();
                if (zzui != null && zzui.zzb(uri)) {
                    uri = zzui.zza(uri, this.zzbnd.getContext(), this.zzbnd.getView(), this.zzbnd.zzto());
                }
            } catch (zzcj unused) {
                String valueOf3 = String.valueOf(zzasuVar.url);
                zzakb.zzdk(valueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf3) : new String("Unable to append parameter to URL: "));
            }
            com.google.android.gms.ads.internal.zzx zzxVar = this.zzbmw;
            if (zzxVar == null || zzxVar.zzcy()) {
                zza(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.zzbmw.zzs(zzasuVar.url);
            }
        }
        return true;
    }

    public final void zzah(boolean z) {
        this.zzdbu = z;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzb(int i, int i2) {
        zzaab zzaabVar = this.zzbmx;
        if (zzaabVar != null) {
            zzaabVar.zzb(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasz
    public final void zzb(zzasu zzasuVar) {
        zzf(zzasuVar.uri);
    }

    @Override // com.google.android.gms.internal.ads.zzata
    public final void zzc(zzasu zzasuVar) {
        this.zzdcb = true;
        zzase zzaseVar = this.zzdbs;
        if (zzaseVar != null) {
            zzaseVar.zzly();
            this.zzdbs = null;
        }
        zzvd();
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final WebResourceResponse zzd(zzasu zzasuVar) {
        WebResourceResponse zzf;
        zzhi zza;
        zzait zzaitVar = this.zzxd;
        if (zzaitVar != null) {
            zzaitVar.zza(zzasuVar.url, zzasuVar.zzab, 1);
        }
        if ("mraid.js".equalsIgnoreCase(new File(zzasuVar.url).getName())) {
            zznk();
            String str = (String) zzkb.zzik().zzd(this.zzbnd.zzud().zzvs() ? zznk.zzawe : this.zzbnd.zzuj() ? zznk.zzawd : zznk.zzawc);
            com.google.android.gms.ads.internal.zzbv.zzek();
            zzf = zzakk.zzf(this.zzbnd.getContext(), this.zzbnd.zztq().zzcw, str);
        } else {
            zzf = null;
        }
        if (zzf != null) {
            return zzf;
        }
        try {
            if (zzajb.zzb(zzasuVar.url, this.zzbnd.getContext()).equals(zzasuVar.url)) {
                zzhl zzaa = zzhl.zzaa(zzasuVar.url);
                if (zzaa == null || (zza = com.google.android.gms.ads.internal.zzbv.zzeq().zza(zzaa)) == null || !zza.zzhi()) {
                    if (zzamy.isEnabled()) {
                        if (((Boolean) zzkb.zzik().zzd(zznk.zzazn)).booleanValue()) {
                            return zze(zzasuVar);
                        }
                    }
                    return null;
                }
                return new WebResourceResponse("", "", zza.zzhj());
            }
            return zze(zzasuVar);
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final boolean zzfz() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzaek;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zznk() {
        synchronized (this.mLock) {
            this.zzdbu = false;
            this.zzaek = true;
            zzaoe.zzcvy.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzask
                private final zzasj zzder;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzder = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzder.zzvg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final com.google.android.gms.ads.internal.zzx zzut() {
        return this.zzbmw;
    }

    public final boolean zzuu() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdbv;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzuv() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.mLock) {
            onGlobalLayoutListener = this.zzdbw;
        }
        return onGlobalLayoutListener;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzuw() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.mLock) {
            onScrollChangedListener = this.zzdbx;
        }
        return onScrollChangedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final boolean zzux() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdby;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzuz() {
        zzait zzaitVar = this.zzxd;
        if (zzaitVar != null) {
            WebView webView = this.zzbnd.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza(webView, zzaitVar, 10);
                return;
            }
            zzuy();
            this.zzdce = new zzasm(this, zzaitVar);
            this.zzbnd.getView().addOnAttachStateChangeListener(this.zzdce);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzva() {
        synchronized (this.mLock) {
            this.zzdby = true;
        }
        this.zzdcd++;
        zzvd();
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzvb() {
        this.zzdcd--;
        zzvd();
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzvc() {
        this.zzdcc = true;
        zzvd();
    }

    public final zzasg zzve() {
        return this.zzdca;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final zzait zzvf() {
        return this.zzxd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzvg() {
        this.zzbnd.zzuo();
        com.google.android.gms.ads.internal.overlay.zzd zzub = this.zzbnd.zzub();
        if (zzub != null) {
            zzub.zznk();
        }
        zzasf zzasfVar = this.zzdbt;
        if (zzasfVar != null) {
            zzasfVar.zzdb();
            this.zzdbt = null;
        }
    }
}
