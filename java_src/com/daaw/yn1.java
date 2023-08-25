package com.daaw;

import android.content.Context;
import java.io.Closeable;
/* loaded from: classes.dex */
public abstract class yn1 implements Closeable {

    /* loaded from: classes.dex */
    public interface a {
        yn1 a();

        a b(Context context);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d().close();
    }

    public abstract ly d();

    public abstract xn1 n();
}
