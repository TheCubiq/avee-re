package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public class lo0 implements wd0 {
    public final Uri a;
    public final int b;

    public lo0(Uri uri) {
        this.a = uri;
        this.b = c(uri);
    }

    public static int c(Uri uri) {
        String str;
        String path = uri.getPath();
        if (path != null) {
            try {
                str = path.substring(path.lastIndexOf(".") + 1);
            } catch (Exception unused) {
                str = "";
            }
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("mpd")) {
                return 0;
            }
            if (lowerCase.startsWith("ism") || lowerCase.startsWith("isml")) {
                return 1;
            }
            if (!lowerCase.equals("flv") && lowerCase.equals("m3u8")) {
                return 2;
            }
        }
        return 3;
    }

    @Override // com.daaw.wd0
    public Uri a() {
        return this.a;
    }

    @Override // com.daaw.wd0
    public int b() {
        return this.b;
    }
}
