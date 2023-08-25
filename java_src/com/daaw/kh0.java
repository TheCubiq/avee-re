package com.daaw;
/* loaded from: classes2.dex */
public class kh0 extends sw0 {
    @Override // com.daaw.sw0
    public void a(Throwable th, Throwable th2) {
        ug0.f(th, "cause");
        ug0.f(th2, "exception");
        th.addSuppressed(th2);
    }
}
