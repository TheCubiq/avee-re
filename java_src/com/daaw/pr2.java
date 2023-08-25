package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class pr2 implements qq2 {
    public int b;
    public int c;
    public int[] d;
    public boolean e;
    public int[] f;
    public ByteBuffer g;
    public ByteBuffer h;
    public boolean i;

    public pr2() {
        ByteBuffer byteBuffer = qq2.a;
        this.g = byteBuffer;
        this.h = byteBuffer;
        this.b = -1;
        this.c = -1;
    }

    @Override // com.daaw.qq2
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.b;
        int length = ((limit - position) / (i + i)) * this.f.length;
        int i2 = length + length;
        if (this.g.capacity() < i2) {
            this.g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i3 : this.f) {
                this.g.putShort(byteBuffer.getShort(i3 + i3 + position));
            }
            int i4 = this.b;
            position += i4 + i4;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    @Override // com.daaw.qq2
    public final boolean b(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.d, this.f);
        int[] iArr = this.d;
        this.f = iArr;
        if (iArr == null) {
            this.e = false;
            return z;
        } else if (i3 != 2) {
            throw new pq2(i, i2, i3);
        } else {
            if (!z && this.c == i && this.b == i2) {
                return false;
            }
            this.c = i;
            this.b = i2;
            this.e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 >= i2) {
                    throw new pq2(i, i2, 2);
                }
                this.e = (i5 != i4) | this.e;
                i4++;
            }
        }
    }

    public final void c(int[] iArr) {
        this.d = iArr;
    }

    @Override // com.daaw.qq2
    public final int zza() {
        int[] iArr = this.f;
        return iArr == null ? this.b : iArr.length;
    }

    @Override // com.daaw.qq2
    public final int zzb() {
        return 2;
    }

    @Override // com.daaw.qq2
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.h;
        this.h = qq2.a;
        return byteBuffer;
    }

    @Override // com.daaw.qq2
    public final void zzd() {
        this.h = qq2.a;
        this.i = false;
    }

    @Override // com.daaw.qq2
    public final void zze() {
        this.i = true;
    }

    @Override // com.daaw.qq2
    public final void zzg() {
        zzd();
        this.g = qq2.a;
        this.b = -1;
        this.c = -1;
        this.f = null;
        this.e = false;
    }

    @Override // com.daaw.qq2
    public final boolean zzi() {
        return this.e;
    }

    @Override // com.daaw.qq2
    public final boolean zzj() {
        return this.i && this.h == qq2.a;
    }
}
