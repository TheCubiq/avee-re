package com.daaw;

import java.io.UnsupportedEncodingException;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class b23 {
    public static int a(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return hr0.a(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
        if (true != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
        if (true != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fd, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fe, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] b(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.b23.b(java.lang.String, boolean):java.lang.String[]");
    }
}
