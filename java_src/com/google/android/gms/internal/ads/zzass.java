package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public class zzass extends WebView implements zzasx, zzasz, zzata, zzatb {
    private final List<zzasx> zzdew;
    private final List<zzatb> zzdex;
    private final List<zzasz> zzdey;
    private final List<zzata> zzdez;
    private final zzash zzdfa;
    protected final WebViewClient zzdfb;

    public zzass(zzash zzashVar) {
        super(zzashVar);
        this.zzdew = new CopyOnWriteArrayList();
        this.zzdex = new CopyOnWriteArrayList();
        this.zzdey = new CopyOnWriteArrayList();
        this.zzdez = new CopyOnWriteArrayList();
        this.zzdfa = zzashVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        com.google.android.gms.ads.internal.zzbv.zzem().zza(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzakb.zzb("Unable to enable Javascript.", e);
        }
        setLayerType(1, null);
        zzast zzastVar = new zzast(this, this, this, this);
        this.zzdfb = zzastVar;
        super.setWebViewClient(zzastVar);
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            zzakb.v("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "CoreWebView.loadUrl");
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public final void zza(zzasx zzasxVar) {
        this.zzdew.add(zzasxVar);
    }

    public final void zza(zzasz zzaszVar) {
        this.zzdey.add(zzaszVar);
    }

    public final void zza(zzata zzataVar) {
        this.zzdez.add(zzataVar);
    }

    public final void zza(zzatb zzatbVar) {
        this.zzdex.add(zzatbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final boolean zza(zzasu zzasuVar) {
        for (zzasx zzasxVar : this.zzdew) {
            if (zzasxVar.zza(zzasuVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzasz
    public final void zzb(zzasu zzasuVar) {
        for (zzasz zzaszVar : this.zzdey) {
            zzaszVar.zzb(zzasuVar);
        }
    }

    public void zzbe(String str) {
        zzasy.zza(this, str);
    }

    @Override // com.google.android.gms.internal.ads.zzata
    public void zzc(zzasu zzasuVar) {
        for (zzata zzataVar : this.zzdez) {
            zzataVar.zzc(zzasuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final WebResourceResponse zzd(zzasu zzasuVar) {
        for (zzatb zzatbVar : this.zzdex) {
            WebResourceResponse zzd = zzatbVar.zzd(zzasuVar);
            if (zzd != null) {
                return zzd;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzash zzvv() {
        return this.zzdfa;
    }
}
