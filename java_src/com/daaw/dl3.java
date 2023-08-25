package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public class dl3 extends IOException {

    /* renamed from: p */
    public final boolean f7426p;

    /* renamed from: q */
    public final int f7427q;

    public dl3(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f7426p = z;
        this.f7427q = i;
    }

    /* renamed from: a */
    public static dl3 m24267a(String str, Throwable th) {
        return new dl3(str, th, true, 1);
    }

    /* renamed from: b */
    public static dl3 m24266b(String str, Throwable th) {
        return new dl3(str, th, true, 0);
    }

    /* renamed from: c */
    public static dl3 m24265c(String str) {
        return new dl3(str, null, false, 1);
    }
}
