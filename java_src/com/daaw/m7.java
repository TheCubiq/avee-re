package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public interface m7 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    boolean c();

    boolean d();

    void e();

    ByteBuffer f();

    void flush();

    void g(ByteBuffer byteBuffer);

    int h();

    int i();

    int j();

    void k();

    boolean l(int i, int i2, int i3);
}
