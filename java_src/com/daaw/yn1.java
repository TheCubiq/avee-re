package com.daaw;

import android.content.Context;
import java.io.Closeable;
/* loaded from: classes.dex */
public abstract class yn1 implements Closeable {

    /* renamed from: com.daaw.yn1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3732a {
        /* renamed from: a */
        yn1 mo3483a();

        /* renamed from: b */
        InterfaceC3732a mo3482b(Context context);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo3485d().close();
    }

    /* renamed from: d */
    public abstract InterfaceC2134ly mo3485d();

    /* renamed from: n */
    public abstract xn1 mo3484n();
}
