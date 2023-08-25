package com.daaw;
/* renamed from: com.daaw.tr */
/* loaded from: classes2.dex */
public final class C3113tr extends t81 {

    /* renamed from: w */
    public static final C3113tr f27991w = new C3113tr();

    public C3113tr() {
        super(ek1.f8529b, ek1.f8530c, ek1.f8531d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.daaw.AbstractC2557pl
    public String toString() {
        return "Dispatchers.Default";
    }
}
