package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class pr2 implements qq2 {

    /* renamed from: b */
    public int f23195b;

    /* renamed from: c */
    public int f23196c;

    /* renamed from: d */
    public int[] f23197d;

    /* renamed from: e */
    public boolean f23198e;

    /* renamed from: f */
    public int[] f23199f;

    /* renamed from: g */
    public ByteBuffer f23200g;

    /* renamed from: h */
    public ByteBuffer f23201h;

    /* renamed from: i */
    public boolean f23202i;

    public pr2() {
        ByteBuffer byteBuffer = qq2.f24260a;
        this.f23200g = byteBuffer;
        this.f23201h = byteBuffer;
        this.f23195b = -1;
        this.f23196c = -1;
    }

    @Override // com.daaw.qq2
    /* renamed from: a */
    public final void mo6842a(ByteBuffer byteBuffer) {
        int[] iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.f23195b;
        int length = ((limit - position) / (i + i)) * this.f23199f.length;
        int i2 = length + length;
        if (this.f23200g.capacity() < i2) {
            this.f23200g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f23200g.clear();
        }
        while (position < limit) {
            for (int i3 : this.f23199f) {
                this.f23200g.putShort(byteBuffer.getShort(i3 + i3 + position));
            }
            int i4 = this.f23195b;
            position += i4 + i4;
        }
        byteBuffer.position(limit);
        this.f23200g.flip();
        this.f23201h = this.f23200g;
    }

    @Override // com.daaw.qq2
    /* renamed from: b */
    public final boolean mo6841b(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f23197d, this.f23199f);
        int[] iArr = this.f23197d;
        this.f23199f = iArr;
        if (iArr == null) {
            this.f23198e = false;
            return z;
        } else if (i3 != 2) {
            throw new pq2(i, i2, i3);
        } else {
            if (!z && this.f23196c == i && this.f23195b == i2) {
                return false;
            }
            this.f23196c = i;
            this.f23195b = i2;
            this.f23198e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f23199f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 >= i2) {
                    throw new pq2(i, i2, 2);
                }
                this.f23198e = (i5 != i4) | this.f23198e;
                i4++;
            }
        }
    }

    /* renamed from: c */
    public final void m13197c(int[] iArr) {
        this.f23197d = iArr;
    }

    @Override // com.daaw.qq2
    public final int zza() {
        int[] iArr = this.f23199f;
        return iArr == null ? this.f23195b : iArr.length;
    }

    @Override // com.daaw.qq2
    public final int zzb() {
        return 2;
    }

    @Override // com.daaw.qq2
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f23201h;
        this.f23201h = qq2.f24260a;
        return byteBuffer;
    }

    @Override // com.daaw.qq2
    public final void zzd() {
        this.f23201h = qq2.f24260a;
        this.f23202i = false;
    }

    @Override // com.daaw.qq2
    public final void zze() {
        this.f23202i = true;
    }

    @Override // com.daaw.qq2
    public final void zzg() {
        zzd();
        this.f23200g = qq2.f24260a;
        this.f23195b = -1;
        this.f23196c = -1;
        this.f23199f = null;
        this.f23198e = false;
    }

    @Override // com.daaw.qq2
    public final boolean zzi() {
        return this.f23198e;
    }

    @Override // com.daaw.qq2
    public final boolean zzj() {
        return this.f23202i && this.f23201h == qq2.f24260a;
    }
}
