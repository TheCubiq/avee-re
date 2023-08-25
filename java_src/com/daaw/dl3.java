package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public class dl3 extends IOException {
    public final boolean p;
    public final int q;

    public dl3(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.p = z;
        this.q = i;
    }

    public static dl3 a(String str, Throwable th) {
        return new dl3(str, th, true, 1);
    }

    public static dl3 b(String str, Throwable th) {
        return new dl3(str, th, true, 0);
    }

    public static dl3 c(String str) {
        return new dl3(str, null, false, 1);
    }
}
