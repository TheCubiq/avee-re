package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
@zzadh
/* loaded from: classes2.dex */
public final class zzaqo extends WebChromeClient {
    private final zzaqw zzbnd;

    public zzaqo(zzaqw zzaqwVar) {
        this.zzbnd = zzaqwVar;
    }

    private static Context zza(WebView webView) {
        if (webView instanceof zzaqw) {
            zzaqw zzaqwVar = (zzaqw) webView;
            Activity zzto = zzaqwVar.zzto();
            return zzto != null ? zzto : zzaqwVar.getContext();
        }
        return webView.getContext();
    }

    private final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog create;
        com.google.android.gms.ads.internal.zzx zzut;
        try {
        } catch (WindowManager.BadTokenException e) {
            zzakb.zzc("Fail to display Dialog.", e);
        }
        if (this.zzbnd != null && this.zzbnd.zzuf() != null && this.zzbnd.zzuf().zzut() != null && (zzut = this.zzbnd.zzuf().zzut()) != null && !zzut.zzcy()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzut.zzs(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            create = builder.setView(linearLayout).setPositiveButton(17039370, new zzaqu(jsPromptResult, editText)).setNegativeButton(17039360, new zzaqt(jsPromptResult)).setOnCancelListener(new zzaqs(jsPromptResult)).create();
        } else {
            create = builder.setMessage(str3).setPositiveButton(17039370, new zzaqr(jsResult)).setNegativeButton(17039360, new zzaqq(jsResult)).setOnCancelListener(new zzaqp(jsResult)).create();
        }
        create.show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzaqw) {
            com.google.android.gms.ads.internal.overlay.zzd zzub = ((zzaqw) webView).zzub();
            if (zzub != null) {
                zzub.close();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        zzakb.zzdk(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzaqv.zzdbn[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzakb.e(sb2);
        } else if (i == 2) {
            zzakb.zzdk(sb2);
        } else if (i == 3 || i == 4 || i != 5) {
            zzakb.zzdj(sb2);
        } else {
            zzakb.zzck(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zzbnd.zzug() != null) {
            webView2.setWebViewClient(this.zzbnd.zzug());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min((long) PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), (long) PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            } else if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzbv.zzek();
            if (!zzakk.zzl(this.zzbnd.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                com.google.android.gms.ads.internal.zzbv.zzek();
                if (!zzakk.zzl(this.zzbnd.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzd zzub = this.zzbnd.zzub();
        if (zzub == null) {
            zzakb.zzdk("Could not get ad overlay when hiding custom view.");
        } else {
            zzub.zznh();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (PlatformVersion.isAtLeastLollipop()) {
            if (!((Boolean) zzkb.zzik().zzd(zznk.zzayb)).booleanValue()) {
                zzaqw zzaqwVar = this.zzbnd;
                if (zzaqwVar == null || zzaqwVar.zzuf() == null || this.zzbnd.zzuf().zzvf() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] zzb = this.zzbnd.zzuf().zzvf().zzb(permissionRequest.getResources());
                if (zzb.length > 0) {
                    permissionRequest.grant(zzb);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzd zzub = this.zzbnd.zzub();
        if (zzub == null) {
            zzakb.zzdk("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzub.zza(view, customViewCallback);
        zzub.setRequestedOrientation(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
