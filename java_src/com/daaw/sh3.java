package com.daaw;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes.dex */
public abstract class sh3 extends WebViewClient {
    /* renamed from: a */
    public abstract WebViewClient mo1442a();

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return false;
        }
        return mo1442a.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return;
        }
        mo1442a.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return null;
        }
        return mo1442a.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return null;
        }
        return mo1442a.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return false;
        }
        return mo1442a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return false;
        }
        return mo1442a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient mo1442a = mo1442a();
        if (mo1442a == null) {
            return false;
        }
        return mo1442a.shouldOverrideUrlLoading(webView, str);
    }
}
