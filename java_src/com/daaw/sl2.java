package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public final class sl2 {

    /* renamed from: d */
    public static final String[] f26353d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    public final String f26354a = "ad.doubleclick.net";

    /* renamed from: b */
    public final String[] f26355b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    public final ol2 f26356c;

    @Deprecated
    public sl2(ol2 ol2Var) {
        this.f26356c = ol2Var;
    }

    @Deprecated
    /* renamed from: a */
    public final Uri m10204a(Uri uri, Context context, View view, Activity activity) {
        try {
            return m10198g(uri, this.f26356c.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new tl2("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    /* renamed from: b */
    public final Uri m10203b(Uri uri, Context context) {
        return m10198g(uri, this.f26356c.zzg(context));
    }

    @Deprecated
    /* renamed from: c */
    public final ol2 m10202c() {
        return this.f26356c;
    }

    @Deprecated
    /* renamed from: d */
    public final void m10201d(MotionEvent motionEvent) {
        this.f26356c.zzk(motionEvent);
    }

    /* renamed from: e */
    public final boolean m10200e(Uri uri) {
        if (m10199f(uri)) {
            String[] strArr = f26353d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m10199f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f26355b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: g */
    public final Uri m10198g(Uri uri, String str) {
        String encodedPath;
        String str2;
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.f26354a)) {
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
