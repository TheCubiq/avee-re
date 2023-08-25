package com.daaw;

import java.io.InputStream;
import java.io.PushbackInputStream;
/* loaded from: classes.dex */
public final class q33 extends PushbackInputStream {
    public final /* synthetic */ r33 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q33(r33 r33Var, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.p = r33Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        t33.e(this.p.c);
        super.close();
    }
}
