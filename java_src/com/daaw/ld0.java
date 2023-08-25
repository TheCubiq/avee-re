package com.daaw;

import java.io.UnsupportedEncodingException;
/* loaded from: classes2.dex */
public class ld0 extends md0 {
    public ld0(boolean z, byte[] bArr) {
        super(z, bArr);
    }

    @Override // com.daaw.md0, com.daaw.AbstractC1892k
    /* renamed from: b */
    public void mo16087b(byte[] bArr) {
        String str;
        int i = 1;
        try {
            str = C3419wc.m6203a(bArr, 1, 3);
        } catch (UnsupportedEncodingException unused) {
            str = "unknown";
        }
        this.f18799b = "image/" + str.toLowerCase();
        this.f18800c = bArr[4];
        int m6197g = C3419wc.m6197g(bArr, 5, bArr[0]);
        if (m6197g >= 0) {
            C3596xw c3596xw = new C3596xw(bArr[0], C3419wc.m6199e(bArr, 5, m6197g - 5));
            this.f18801d = c3596xw;
            i = m6197g + c3596xw.m4477e().length;
        } else {
            this.f18801d = new C3596xw(bArr[0], "");
        }
        this.f18802e = C3419wc.m6199e(bArr, i, bArr.length - i);
    }
}
