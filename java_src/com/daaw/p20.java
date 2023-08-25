package com.daaw;

import com.daaw.InterfaceC2154m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class p20 implements InterfaceC2154m7 {

    /* renamed from: h */
    public static final int f22206h = Float.floatToIntBits(Float.NaN);

    /* renamed from: b */
    public int f22207b = -1;

    /* renamed from: c */
    public int f22208c = -1;

    /* renamed from: d */
    public int f22209d = 0;

    /* renamed from: e */
    public ByteBuffer f22210e;

    /* renamed from: f */
    public ByteBuffer f22211f;

    /* renamed from: g */
    public boolean f22212g;

    public p20() {
        ByteBuffer byteBuffer = InterfaceC2154m7.f18485a;
        this.f22210e = byteBuffer;
        this.f22211f = byteBuffer;
    }

    /* renamed from: a */
    public static void m13758a(int i, ByteBuffer byteBuffer) {
        double d = i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f22206h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: c */
    public boolean mo6543c() {
        return this.f22212g && this.f22211f == InterfaceC2154m7.f18485a;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: d */
    public boolean mo6542d() {
        return sq1.m10037H(this.f22209d);
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: e */
    public void mo6541e() {
        flush();
        this.f22207b = -1;
        this.f22208c = -1;
        this.f22209d = 0;
        this.f22210e = InterfaceC2154m7.f18485a;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: f */
    public ByteBuffer mo6540f() {
        ByteBuffer byteBuffer = this.f22211f;
        this.f22211f = InterfaceC2154m7.f18485a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2154m7
    public void flush() {
        this.f22211f = InterfaceC2154m7.f18485a;
        this.f22212g = false;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: g */
    public void mo6539g(ByteBuffer byteBuffer) {
        boolean z = this.f22209d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        if (this.f22210e.capacity() < i) {
            this.f22210e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f22210e.clear();
        }
        if (z) {
            while (position < limit) {
                m13758a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.f22210e);
                position += 4;
            }
        } else {
            while (position < limit) {
                m13758a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.f22210e);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f22210e.flip();
        this.f22211f = this.f22210e;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: h */
    public int mo6538h() {
        return this.f22208c;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: i */
    public int mo6537i() {
        return this.f22207b;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: j */
    public int mo6536j() {
        return 4;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: k */
    public void mo6535k() {
        this.f22212g = true;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: l */
    public boolean mo6534l(int i, int i2, int i3) {
        if (sq1.m10037H(i3)) {
            if (this.f22207b == i && this.f22208c == i2 && this.f22209d == i3) {
                return false;
            }
            this.f22207b = i;
            this.f22208c = i2;
            this.f22209d = i3;
            return true;
        }
        throw new InterfaceC2154m7.C2155a(i, i2, i3);
    }
}
