package com.daaw;
/* loaded from: classes.dex */
public final class yx6 extends xx6 {

    /* renamed from: p */
    public final char f34250p;

    public yx6(char c) {
        this.f34250p = c;
    }

    @Override // com.daaw.by6
    /* renamed from: a */
    public final boolean mo3087a(char c) {
        return c == this.f34250p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i = this.f34250p;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
