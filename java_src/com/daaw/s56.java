package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public class s56 extends IOException {

    /* renamed from: p */
    public final int f25888p;

    public s56(int i) {
        this.f25888p = i;
    }

    public s56(String str, int i) {
        super(str);
        this.f25888p = i;
    }

    public s56(String str, Throwable th, int i) {
        super(str, th);
        this.f25888p = i;
    }

    public s56(Throwable th, int i) {
        super(th);
        this.f25888p = i;
    }
}
