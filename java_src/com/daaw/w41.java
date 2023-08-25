package com.daaw;

import com.daaw.InterfaceC2154m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class w41 implements InterfaceC2154m7 {

    /* renamed from: b */
    public int f30874b = -1;

    /* renamed from: c */
    public int f30875c = -1;

    /* renamed from: d */
    public int f30876d = 0;

    /* renamed from: e */
    public ByteBuffer f30877e;

    /* renamed from: f */
    public ByteBuffer f30878f;

    /* renamed from: g */
    public boolean f30879g;

    public w41() {
        ByteBuffer byteBuffer = InterfaceC2154m7.f18485a;
        this.f30877e = byteBuffer;
        this.f30878f = byteBuffer;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: c */
    public boolean mo6543c() {
        return this.f30879g && this.f30878f == InterfaceC2154m7.f18485a;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: d */
    public boolean mo6542d() {
        int i = this.f30876d;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: e */
    public void mo6541e() {
        flush();
        this.f30874b = -1;
        this.f30875c = -1;
        this.f30876d = 0;
        this.f30877e = InterfaceC2154m7.f18485a;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: f */
    public ByteBuffer mo6540f() {
        ByteBuffer byteBuffer = this.f30878f;
        this.f30878f = InterfaceC2154m7.f18485a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2154m7
    public void flush() {
        this.f30878f = InterfaceC2154m7.f18485a;
        this.f30879g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6539g(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.f30876d;
        if (i4 == Integer.MIN_VALUE) {
            i3 /= 3;
        } else if (i4 != 3) {
            if (i4 != 1073741824) {
                throw new IllegalStateException();
            }
            i = i3 / 2;
            if (this.f30877e.capacity() >= i) {
                this.f30877e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.f30877e.clear();
            }
            i2 = this.f30876d;
            if (i2 != Integer.MIN_VALUE) {
                while (position < limit) {
                    this.f30877e.put(byteBuffer.get(position + 1));
                    this.f30877e.put(byteBuffer.get(position + 2));
                    position += 3;
                }
            } else if (i2 == 3) {
                while (position < limit) {
                    this.f30877e.put((byte) 0);
                    this.f30877e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                    position++;
                }
            } else if (i2 != 1073741824) {
                throw new IllegalStateException();
            } else {
                while (position < limit) {
                    this.f30877e.put(byteBuffer.get(position + 2));
                    this.f30877e.put(byteBuffer.get(position + 3));
                    position += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f30877e.flip();
            this.f30878f = this.f30877e;
        }
        i = i3 * 2;
        if (this.f30877e.capacity() >= i) {
        }
        i2 = this.f30876d;
        if (i2 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.f30877e.flip();
        this.f30878f = this.f30877e;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: h */
    public int mo6538h() {
        return this.f30875c;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: i */
    public int mo6537i() {
        return this.f30874b;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: j */
    public int mo6536j() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: k */
    public void mo6535k() {
        this.f30879g = true;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: l */
    public boolean mo6534l(int i, int i2, int i3) {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            if (this.f30874b == i && this.f30875c == i2 && this.f30876d == i3) {
                return false;
            }
            this.f30874b = i;
            this.f30875c = i2;
            this.f30876d = i3;
            return true;
        }
        throw new InterfaceC2154m7.C2155a(i, i2, i3);
    }
}
