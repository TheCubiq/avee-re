package com.daaw;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class p24 {
    public static final AtomicInteger p = new AtomicInteger(0);
    public static final AtomicInteger q = new AtomicInteger(0);

    public static int X() {
        return p.get();
    }

    public static int Z() {
        return q.get();
    }

    public abstract long E();

    public abstract long F();

    public abstract void G(Uri[] uriArr, String str);

    public abstract void H(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    public abstract void I();

    public abstract void J(long j);

    public abstract void K(int i);

    public abstract void L(int i);

    public abstract void M(o24 o24Var);

    public abstract void N(int i);

    public abstract void O(int i);

    public abstract void P(boolean z);

    public abstract void Q(boolean z);

    public abstract void R(int i);

    public abstract void S(Surface surface, boolean z);

    public abstract void T(float f, boolean z);

    public abstract void U();

    public abstract boolean V();

    public abstract int W();

    public abstract int Y();

    public abstract long a0();

    public abstract long b0();

    public abstract long c0();

    public abstract long d0();

    public abstract long e0();
}
