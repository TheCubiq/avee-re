package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public class s56 extends IOException {
    public final int p;

    public s56(int i) {
        this.p = i;
    }

    public s56(String str, int i) {
        super(str);
        this.p = i;
    }

    public s56(String str, Throwable th, int i) {
        super(str, th);
        this.p = i;
    }

    public s56(Throwable th, int i) {
        super(th);
        this.p = i;
    }
}
