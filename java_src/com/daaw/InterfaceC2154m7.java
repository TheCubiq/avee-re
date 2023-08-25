package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: com.daaw.m7 */
/* loaded from: classes.dex */
public interface InterfaceC2154m7 {

    /* renamed from: a */
    public static final ByteBuffer f18485a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.daaw.m7$a */
    /* loaded from: classes.dex */
    public static final class C2155a extends Exception {
        public C2155a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    /* renamed from: c */
    boolean mo6543c();

    /* renamed from: d */
    boolean mo6542d();

    /* renamed from: e */
    void mo6541e();

    /* renamed from: f */
    ByteBuffer mo6540f();

    void flush();

    /* renamed from: g */
    void mo6539g(ByteBuffer byteBuffer);

    /* renamed from: h */
    int mo6538h();

    /* renamed from: i */
    int mo6537i();

    /* renamed from: j */
    int mo6536j();

    /* renamed from: k */
    void mo6535k();

    /* renamed from: l */
    boolean mo6534l(int i, int i2, int i3);
}
