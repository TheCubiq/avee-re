package com.daaw;

import com.daaw.InterfaceC2154m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class co1 implements InterfaceC2154m7 {

    /* renamed from: b */
    public boolean f5997b;

    /* renamed from: c */
    public int f5998c;

    /* renamed from: d */
    public int f5999d;

    /* renamed from: e */
    public int f6000e;

    /* renamed from: f */
    public int f6001f;

    /* renamed from: g */
    public int f6002g;

    /* renamed from: h */
    public ByteBuffer f6003h;

    /* renamed from: i */
    public ByteBuffer f6004i;

    /* renamed from: j */
    public byte[] f6005j;

    /* renamed from: k */
    public int f6006k;

    /* renamed from: l */
    public boolean f6007l;

    public co1() {
        ByteBuffer byteBuffer = InterfaceC2154m7.f18485a;
        this.f6003h = byteBuffer;
        this.f6004i = byteBuffer;
        this.f6000e = -1;
        this.f6001f = -1;
        this.f6005j = new byte[0];
    }

    /* renamed from: a */
    public void m25172a(int i, int i2) {
        this.f5998c = i;
        this.f5999d = i2;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: c */
    public boolean mo6543c() {
        return this.f6007l && this.f6004i == InterfaceC2154m7.f18485a;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: d */
    public boolean mo6542d() {
        return this.f5997b;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: e */
    public void mo6541e() {
        flush();
        this.f6003h = InterfaceC2154m7.f18485a;
        this.f6000e = -1;
        this.f6001f = -1;
        this.f6005j = new byte[0];
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: f */
    public ByteBuffer mo6540f() {
        ByteBuffer byteBuffer = this.f6004i;
        this.f6004i = InterfaceC2154m7.f18485a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2154m7
    public void flush() {
        this.f6004i = InterfaceC2154m7.f18485a;
        this.f6007l = false;
        this.f6002g = 0;
        this.f6006k = 0;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: g */
    public void mo6539g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int min = Math.min(i, this.f6002g);
        this.f6002g -= min;
        byteBuffer.position(position + min);
        if (this.f6002g > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.f6006k + i2) - this.f6005j.length;
        if (this.f6003h.capacity() < length) {
            this.f6003h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f6003h.clear();
        }
        int m10004l = sq1.m10004l(length, 0, this.f6006k);
        this.f6003h.put(this.f6005j, 0, m10004l);
        int m10004l2 = sq1.m10004l(length - m10004l, 0, i2);
        byteBuffer.limit(byteBuffer.position() + m10004l2);
        this.f6003h.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - m10004l2;
        int i4 = this.f6006k - m10004l;
        this.f6006k = i4;
        byte[] bArr = this.f6005j;
        System.arraycopy(bArr, m10004l, bArr, 0, i4);
        byteBuffer.get(this.f6005j, this.f6006k, i3);
        this.f6006k += i3;
        this.f6003h.flip();
        this.f6004i = this.f6003h;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: h */
    public int mo6538h() {
        return this.f6000e;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: i */
    public int mo6537i() {
        return this.f6001f;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: j */
    public int mo6536j() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: k */
    public void mo6535k() {
        this.f6007l = true;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: l */
    public boolean mo6534l(int i, int i2, int i3) {
        if (i3 == 2) {
            this.f6000e = i2;
            this.f6001f = i;
            int i4 = this.f5999d;
            this.f6005j = new byte[i4 * i2 * 2];
            this.f6006k = 0;
            int i5 = this.f5998c;
            this.f6002g = i2 * i5 * 2;
            boolean z = this.f5997b;
            boolean z2 = (i5 == 0 && i4 == 0) ? false : true;
            this.f5997b = z2;
            return z != z2;
        }
        throw new InterfaceC2154m7.C2155a(i, i2, i3);
    }
}
