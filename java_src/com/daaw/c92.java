package com.daaw;
/* loaded from: classes.dex */
public class c92 {

    /* renamed from: a */
    public final int f5641a;

    public c92(int i) {
        this.f5641a = i;
    }

    /* renamed from: a */
    public static int m25488a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static String m25487b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m25487b(this.f5641a);
    }
}
