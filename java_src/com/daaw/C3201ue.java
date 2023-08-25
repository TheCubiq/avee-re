package com.daaw;

import com.daaw.InterfaceC2154m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* renamed from: com.daaw.ue */
/* loaded from: classes.dex */
public final class C3201ue implements InterfaceC2154m7 {

    /* renamed from: b */
    public int f28993b;

    /* renamed from: c */
    public int f28994c;

    /* renamed from: d */
    public int[] f28995d;

    /* renamed from: e */
    public boolean f28996e;

    /* renamed from: f */
    public int[] f28997f;

    /* renamed from: g */
    public ByteBuffer f28998g;

    /* renamed from: h */
    public ByteBuffer f28999h;

    /* renamed from: i */
    public boolean f29000i;

    public C3201ue() {
        ByteBuffer byteBuffer = InterfaceC2154m7.f18485a;
        this.f28998g = byteBuffer;
        this.f28999h = byteBuffer;
        this.f28993b = -1;
        this.f28994c = -1;
    }

    /* renamed from: a */
    public void m8305a(int[] iArr) {
        this.f28995d = iArr;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: c */
    public boolean mo6543c() {
        return this.f29000i && this.f28999h == InterfaceC2154m7.f18485a;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: d */
    public boolean mo6542d() {
        return this.f28996e;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: e */
    public void mo6541e() {
        flush();
        this.f28998g = InterfaceC2154m7.f18485a;
        this.f28993b = -1;
        this.f28994c = -1;
        this.f28997f = null;
        this.f28995d = null;
        this.f28996e = false;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: f */
    public ByteBuffer mo6540f() {
        ByteBuffer byteBuffer = this.f28999h;
        this.f28999h = InterfaceC2154m7.f18485a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2154m7
    public void flush() {
        this.f28999h = InterfaceC2154m7.f18485a;
        this.f29000i = false;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: g */
    public void mo6539g(ByteBuffer byteBuffer) {
        C2914s6.m10685f(this.f28997f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f28993b * 2)) * this.f28997f.length * 2;
        if (this.f28998g.capacity() < length) {
            this.f28998g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f28998g.clear();
        }
        while (position < limit) {
            for (int i : this.f28997f) {
                this.f28998g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f28993b * 2;
        }
        byteBuffer.position(limit);
        this.f28998g.flip();
        this.f28999h = this.f28998g;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: h */
    public int mo6538h() {
        int[] iArr = this.f28997f;
        return iArr == null ? this.f28993b : iArr.length;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: i */
    public int mo6537i() {
        return this.f28994c;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: j */
    public int mo6536j() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: k */
    public void mo6535k() {
        this.f29000i = true;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: l */
    public boolean mo6534l(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f28995d, this.f28997f);
        int[] iArr = this.f28995d;
        this.f28997f = iArr;
        if (iArr == null) {
            this.f28996e = false;
            return z;
        } else if (i3 != 2) {
            throw new InterfaceC2154m7.C2155a(i, i2, i3);
        } else {
            if (!z && this.f28994c == i && this.f28993b == i2) {
                return false;
            }
            this.f28994c = i;
            this.f28993b = i2;
            this.f28996e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f28997f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 >= i2) {
                    throw new InterfaceC2154m7.C2155a(i, i2, i3);
                }
                this.f28996e = (i5 != i4) | this.f28996e;
                i4++;
            }
        }
    }
}
