package com.daaw;

import java.nio.ByteBuffer;
/* renamed from: com.daaw.o7 */
/* loaded from: classes.dex */
public interface InterfaceC2411o7 {

    /* renamed from: com.daaw.o7$a */
    /* loaded from: classes.dex */
    public static final class C2412a extends Exception {
        public C2412a(String str) {
            super(str);
        }

        public C2412a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.daaw.o7$b */
    /* loaded from: classes.dex */
    public static final class C2413b extends Exception {

        /* renamed from: p */
        public final int f21098p;

        public C2413b(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.f21098p = i;
        }
    }

    /* renamed from: com.daaw.o7$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2414c {
        /* renamed from: a */
        void mo14496a(int i);

        /* renamed from: b */
        void mo14495b(int i, long j, long j2);

        /* renamed from: c */
        void mo14494c();
    }

    /* renamed from: com.daaw.o7$d */
    /* loaded from: classes.dex */
    public static final class C2415d extends Exception {

        /* renamed from: p */
        public final int f21099p;

        public C2415d(int i) {
            super("AudioTrack write failed: " + i);
            this.f21099p = i;
        }
    }

    /* renamed from: a */
    void mo14515a();

    /* renamed from: b */
    void mo14514b();

    /* renamed from: c */
    boolean mo14513c();

    /* renamed from: e */
    void mo14512e();

    /* renamed from: f */
    zw0 mo14511f(zw0 zw0Var);

    /* renamed from: h */
    zw0 mo14510h();

    /* renamed from: i */
    void mo14509i(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6);

    /* renamed from: j */
    void mo14508j();

    /* renamed from: k */
    boolean mo14507k();

    /* renamed from: l */
    long mo14506l(boolean z);

    /* renamed from: m */
    void mo14505m();

    /* renamed from: n */
    void mo14504n(C1255f7 c1255f7);

    /* renamed from: o */
    void mo14503o();

    /* renamed from: p */
    void mo14502p(float f);

    /* renamed from: q */
    boolean mo14501q(ByteBuffer byteBuffer, long j);

    /* renamed from: r */
    void mo14500r(int i);

    /* renamed from: s */
    void mo14499s();

    /* renamed from: t */
    boolean mo14498t(int i);

    /* renamed from: u */
    void mo14497u(InterfaceC2414c interfaceC2414c);
}
