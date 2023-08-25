package com.daaw;
/* loaded from: classes.dex */
public final class cu6 extends Exception {
    public final int p;

    public cu6(int i, String str) {
        super(str);
        this.p = i;
    }

    public cu6(int i, Throwable th) {
        super(th);
        this.p = i;
    }

    public final int a() {
        return this.p;
    }
}
