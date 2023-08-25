package com.daaw;

import java.io.UnsupportedEncodingException;
/* loaded from: classes2.dex */
public class ld0 extends md0 {
    public ld0(boolean z, byte[] bArr) {
        super(z, bArr);
    }

    @Override // com.daaw.md0, com.daaw.k
    public void b(byte[] bArr) {
        String str;
        int i = 1;
        try {
            str = wc.a(bArr, 1, 3);
        } catch (UnsupportedEncodingException unused) {
            str = "unknown";
        }
        this.b = "image/" + str.toLowerCase();
        this.c = bArr[4];
        int g = wc.g(bArr, 5, bArr[0]);
        if (g >= 0) {
            xw xwVar = new xw(bArr[0], wc.e(bArr, 5, g - 5));
            this.d = xwVar;
            i = g + xwVar.e().length;
        } else {
            this.d = new xw(bArr[0], "");
        }
        this.e = wc.e(bArr, i, bArr.length - i);
    }
}
