package com.google.android.gms.internal.ads;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public class zzasv extends zzass {
    private boolean zzdfh;
    private boolean zzdfi;

    public zzasv(zzash zzashVar) {
        super(zzashVar);
        com.google.android.gms.ads.internal.zzbv.zzeo().zzqe();
    }

    private final synchronized void zzqf() {
        if (!this.zzdfi) {
            this.zzdfi = true;
            com.google.android.gms.ads.internal.zzbv.zzeo().zzqf();
        }
    }

    @Override // android.webkit.WebView
    public synchronized void destroy() {
        if (this.zzdfh) {
            return;
        }
        this.zzdfh = true;
        zzam(false);
        zzakb.v("Initiating WebView self destruct sequence in 3...");
        zzakb.v("Loading blank page in WebView, 2...");
        try {
            super.loadUrl("about:blank");
        } catch (UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // android.webkit.WebView
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    zzam(true);
                }
                zzqf();
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized boolean isDestroyed() {
        return this.zzdfh;
    }

    @Override // android.webkit.WebView
    public synchronized void loadData(String str, String str2, String str3) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzass, android.webkit.WebView
    public synchronized void loadUrl(String str) {
        if (isDestroyed()) {
            zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public void onPause() {
        if (isDestroyed()) {
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public void onResume() {
        if (isDestroyed()) {
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzaqw
    public void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        super.stopLoading();
    }

    protected void zzam(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzass, com.google.android.gms.internal.ads.zzata
    public final synchronized void zzc(zzasu zzasuVar) {
        if (!isDestroyed()) {
            super.zzc(zzasuVar);
            return;
        }
        zzakb.v("Blank page loaded, 1...");
        zzuk();
    }

    public final synchronized void zzuk() {
        zzakb.v("Destroying WebView!");
        zzqf();
        zzaoe.zzcvy.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzasw
            private final zzasv zzdfj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdfj = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdfj.zzvw();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzvw() {
        super.destroy();
    }
}
