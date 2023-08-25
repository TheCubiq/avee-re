package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public final class sl2 {
    public static final String[] d = {"/aclk", "/pcs/click", "/dbm/clk"};
    public final String a = "ad.doubleclick.net";
    public final String[] b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public final ol2 c;

    @Deprecated
    public sl2(ol2 ol2Var) {
        this.c = ol2Var;
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return g(uri, this.c.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new tl2("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri b(Uri uri, Context context) {
        return g(uri, this.c.zzg(context));
    }

    @Deprecated
    public final ol2 c() {
        return this.c;
    }

    @Deprecated
    public final void d(MotionEvent motionEvent) {
        this.c.zzk(motionEvent);
    }

    public final boolean e(Uri uri) {
        if (f(uri)) {
            String[] strArr = d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final Uri g(Uri uri, String str) {
        String encodedPath;
        String str2;
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.a)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new tl2("Parameter already exists: dc_ms");
                    }
                    String uri2 = uri.toString();
                    int indexOf = uri2.indexOf(";adurl");
                    if (indexOf != -1) {
                        int i = indexOf + 1;
                        str2 = uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i);
                    } else {
                        int indexOf2 = uri2.indexOf(uri.getEncodedPath());
                        str2 = uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length());
                    }
                    return Uri.parse(str2);
                }
            } catch (UnsupportedOperationException unused) {
                throw new tl2("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i2 = indexOf3 + 1;
                return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new tl2("Query parameter already exists: ms");
    }
}
