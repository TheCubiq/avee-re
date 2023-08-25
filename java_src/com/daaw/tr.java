package com.daaw;
/* loaded from: classes2.dex */
public final class tr extends t81 {
    public static final tr w = new tr();

    public tr() {
        super(ek1.b, ek1.c, ek1.d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.daaw.pl
    public String toString() {
        return "Dispatchers.Default";
    }
}
