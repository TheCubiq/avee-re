package com.daaw;
/* loaded from: classes2.dex */
public class kh0 extends sw0 {
    @Override // com.daaw.sw0
    /* renamed from: a */
    public void mo9797a(Throwable th, Throwable th2) {
        ug0.m8268f(th, "cause");
        ug0.m8268f(th2, "exception");
        th.addSuppressed(th2);
    }
}
