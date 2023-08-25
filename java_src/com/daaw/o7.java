package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface o7 {

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public final int p;

        public b(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.p = i;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i);

        void b(int i, long j, long j2);

        void c();
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {
        public final int p;

        public d(int i) {
            super("AudioTrack write failed: " + i);
            this.p = i;
        }
    }

    void a();

    void b();

    boolean c();

    void e();

    zw0 f(zw0 zw0Var);

    zw0 h();

    void i(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6);

    void j();

    boolean k();

    long l(boolean z);

    void m();

    void n(f7 f7Var);

    void o();

    void p(float f);

    boolean q(ByteBuffer byteBuffer, long j);

    void r(int i);

    void s();

    boolean t(int i);

    void u(c cVar);
}
