package com.daaw;
/* loaded from: classes.dex */
public class sv1 {

    /* renamed from: a */
    public final int f26665a;

    /* renamed from: b */
    public final boolean f26666b;

    public sv1(int i) {
        this.f26665a = i;
        this.f26666b = true;
    }

    public sv1(int i, boolean z) {
        this.f26665a = i;
        this.f26666b = z;
    }

    /* renamed from: a */
    public static boolean m9824a(AbstractC3118tv abstractC3118tv, String str, String str2) {
        return abstractC3118tv.mo2456h().equals(str) && m9823b(abstractC3118tv.m8791i(), str2);
    }

    /* renamed from: b */
    public static boolean m9823b(String str, String str2) {
        if (str.length() == 0 && str2.equals("10")) {
            return true;
        }
        if (str.equals("10") && str2.length() == 0) {
            return true;
        }
        return str.equals(str2);
    }
}
