package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class tr2 implements qq2 {

    /* renamed from: b */
    public int f27994b = -1;

    /* renamed from: c */
    public int f27995c = -1;

    /* renamed from: d */
    public int f27996d = 0;

    /* renamed from: e */
    public ByteBuffer f27997e;

    /* renamed from: f */
    public ByteBuffer f27998f;

    /* renamed from: g */
    public boolean f27999g;

    public tr2() {
        ByteBuffer byteBuffer = qq2.f24260a;
        this.f27997e = byteBuffer;
        this.f27998f = byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.daaw.qq2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6842a(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.f27996d;
        if (i4 == Integer.MIN_VALUE) {
            i3 /= 3;
        } else if (i4 != 3) {
            if (i4 != 1073741824) {
                throw new IllegalStateException();
            }
            i = i3 / 2;
            if (this.f27997e.capacity() >= i) {
                this.f27997e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.f27997e.clear();
            }
            i2 = this.f27996d;
            if (i2 != Integer.MIN_VALUE) {
                while (position < limit) {
                    this.f27997e.put(byteBuffer.get(position + 1));
                    this.f27997e.put(byteBuffer.get(position + 2));
                    position += 3;
                }
            } else if (i2 == 3) {
                while (position < limit) {
                    this.f27997e.put((byte) 0);
                    this.f27997e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                    position++;
                }
            } else if (i2 != 1073741824) {
                throw new IllegalStateException();
            } else {
                while (position < limit) {
                    this.f27997e.put(byteBuffer.get(position + 2));
                    this.f27997e.put(byteBuffer.get(position + 3));
                    position += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f27997e.flip();
            this.f27998f = this.f27997e;
        }
        i = i3 + i3;
        if (this.f27997e.capacity() >= i) {
        }
        i2 = this.f27996d;
        if (i2 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.f27997e.flip();
        this.f27998f = this.f27997e;
    }

    @Override // com.daaw.qq2
    /* renamed from: b */
    public final boolean mo6841b(int i, int i2, int i3) {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            if (this.f27994b == i && this.f27995c == i2 && this.f27996d == i3) {
                return false;
            }
            this.f27994b = i;
            this.f27995c = i2;
            this.f27996d = i3;
            if (i3 == 2) {
                this.f27997e = qq2.f24260a;
                return true;
            }
            return true;
        }
        throw new pq2(i, i2, i3);
    }

    @Override // com.daaw.qq2
    public final int zza() {
        return this.f27995c;
    }

    @Override // com.daaw.qq2
    public final int zzb() {
        return 2;
    }

    @Override // com.daaw.qq2
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f27998f;
        this.f27998f = qq2.f24260a;
        return byteBuffer;
    }

    @Override // com.daaw.qq2
    public final void zzd() {
        this.f27998f = qq2.f24260a;
        this.f27999g = false;
    }

    @Override // com.daaw.qq2
    public final void zze() {
        this.f27999g = true;
    }

    @Override // com.daaw.qq2
    public final void zzg() {
        zzd();
        this.f27997e = qq2.f24260a;
        this.f27994b = -1;
        this.f27995c = -1;
        this.f27996d = 0;
    }

    @Override // com.daaw.qq2
    public final boolean zzi() {
        int i = this.f27996d;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.daaw.qq2
    public final boolean zzj() {
        return this.f27999g && this.f27998f == qq2.f24260a;
    }
}
