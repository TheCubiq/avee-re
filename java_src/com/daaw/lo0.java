package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public class lo0 implements wd0 {

    /* renamed from: a */
    public final Uri f17574a;

    /* renamed from: b */
    public final int f17575b;

    public lo0(Uri uri) {
        this.f17574a = uri;
        this.f17575b = m16704c(uri);
    }

    /* renamed from: c */
    public static int m16704c(Uri uri) {
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
    /* renamed from: a */
    public Uri mo6166a() {
        return this.f17574a;
    }

    @Override // com.daaw.wd0
    /* renamed from: b */
    public int mo6165b() {
        return this.f17575b;
    }
}
