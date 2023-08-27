package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
@zzadh
/* loaded from: classes2.dex */
public class zzakq {
    private zzakq() {
    }

    public static boolean zzi(zzaqw zzaqwVar) {
        if (zzaqwVar == null) {
            return false;
        }
        zzaqwVar.onPause();
        return true;
    }

    public static boolean zzj(zzaqw zzaqwVar) {
        if (zzaqwVar == null) {
            return false;
        }
        zzaqwVar.onResume();
        return true;
    }

    public static boolean zzrp() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public String getDefaultUserAgent(Context context) {
        return "";
    }

    public boolean isAttachedToWindow(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public void setBackground(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public Drawable zza(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzaqx zza(zzaqw zzaqwVar, boolean z) {
        return new zzaqx(zzaqwVar, z);
    }

    public String zza(SslError sslError) {
        return "";
    }

    public void zza(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean zza(DownloadManager.Request request) {
        return false;
    }

    public boolean zza(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean zza(Window window) {
        return false;
    }

    public void zzaw(Context context) {
    }

    public CookieManager zzax(Context context) {
        if (zzrp()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzakb.zzb("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public Set<String> zzh(Uri uri) {
        String encodedQuery;
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.emptySet();
    }

    public int zzrl() {
        return 0;
    }

    public int zzrm() {
        return 1;
    }

    public int zzrn() {
        return 5;
    }

    public ViewGroup.LayoutParams zzro() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public int zzrq() {
        return 0;
    }

    public boolean zzy(View view) {
        return false;
    }

    public boolean zzz(View view) {
        return false;
    }
}
