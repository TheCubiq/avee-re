package com.daaw;
/* loaded from: classes.dex */
public final class pf7 {
    public static final dq7 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new of7("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return dq7.b(bArr);
    }
}
