package com.daaw;
/* loaded from: classes.dex */
public class gi5 extends Exception {
    public final int p;

    public gi5(int i) {
        this.p = i;
    }

    public gi5(int i, String str) {
        super(str);
        this.p = i;
    }

    public gi5(int i, String str, Throwable th) {
        super(str, th);
        this.p = 1;
    }

    public final int a() {
        return this.p;
    }
}
