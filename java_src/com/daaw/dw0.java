package com.daaw;

import com.daaw.avee.comp.playback.a;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class dw0 {
    public static int p = 5236;
    public String h;
    public long i;
    public ByteBuffer a = ByteBuffer.allocate(20000);
    public final Object b = new Object();
    public int c = -1;
    public long d = -1;
    public int l = 0;
    public sc n = new sc();
    public byte[][] o = (byte[][]) Array.newInstance(byte.class, 1, 0);
    public int j = 44100;
    public int k = 2;
    public int e = 0;
    public a31 f = null;
    public int g = 0;
    public long m = 0;

    public dw0(String str, long j) {
        this.h = str;
        this.i = j;
    }

    public final void a(int i, int i2, int i3) {
        this.j = i;
        this.k = i2;
        this.e = hr1.b(this.i, i2, i3, i);
        int i4 = 0;
        this.g = 0;
        a31 a31Var = this.f;
        if (a31Var != null) {
            a31Var.a();
        }
        do {
            a31 b = a31.b(this.h + i4, this.e + 5120);
            this.f = b;
            i4++;
            if (b != null) {
                break;
            }
        } while (i4 < 3);
        this.m = 0L;
    }

    public void b() {
        a31 a31Var = this.f;
        if (a31Var != null) {
            a31Var.a();
        }
        this.f = null;
    }

    public com.daaw.avee.comp.playback.a c(long j, a.h hVar, com.daaw.avee.comp.playback.a aVar, int i) {
        boolean z;
        ByteBuffer c;
        int i2;
        float[] fArr;
        aVar.k = false;
        aVar.m = j;
        aVar.o = 0L;
        aVar.p = Long.MAX_VALUE;
        aVar.q = Long.MIN_VALUE;
        if (this.f == null) {
            return aVar;
        }
        int i3 = this.j;
        aVar.d(i3, hVar.a, hVar.d, hr1.c(hVar.c, i3));
        long j2 = j + (hVar.b * 1000);
        int b = hr1.b(j2, this.k, i, this.j);
        int d = hr1.d(aVar.b(), this.k, i);
        int d2 = hr1.d(aVar.c(), this.k, i);
        long j3 = b - this.l;
        if (Math.abs(j3) < i) {
            b = this.l;
        } else if (j3 != 0) {
            lz1.c("! readPosDelta: " + j3);
        }
        this.l = d2 + b;
        int i4 = this.e;
        int i5 = b + d;
        int i6 = i4 - i5;
        int max = Math.max(0, i5 - i4);
        int max2 = Math.max(0, d - max);
        int i7 = b + max2;
        if (i7 > this.g - 10) {
            z = i6 <= p;
            StringBuilder sb = new StringBuilder();
            sb.append("need read to");
            sb.append(z ? "/ignore: " : ": ");
            sb.append(i7);
            sb.append("; raf filled to: ");
            sb.append(this.g);
            sb.append("; maxBytes: ");
            sb.append(this.e);
            sb.append("; bytesTillEnd: ");
            sb.append(i6);
            lz1.c(sb.toString());
            if (!z) {
                return aVar;
            }
        } else {
            z = false;
        }
        synchronized (this.b) {
            try {
                try {
                    a31 a31Var = this.f;
                    if (a31Var == null) {
                        return aVar;
                    }
                    if (z) {
                        this.a.position(0);
                        c = this.a;
                    } else {
                        c = a31Var.c(b);
                    }
                    ByteBuffer byteBuffer = c;
                    if (max2 > byteBuffer.remaining()) {
                        lz1.c("readSizeInBytes [" + max2 + "] > buf.remainingInBytes [" + byteBuffer.remaining() + "]");
                        i2 = byteBuffer.remaining();
                    } else {
                        i2 = max2;
                    }
                    this.n.b(byteBuffer, 0L, this.j, this.k, i2, i, this.o);
                    short[] sArr = new short[2];
                    int d3 = this.n.d(aVar.c, aVar.b, 0, 0, sArr, new float[1], new long[1]);
                    aVar.k = max + d3 >= aVar.b();
                    aVar.l = d3;
                    aVar.n = j2 + hr1.e(d3, aVar.f);
                    aVar.d = sArr[0];
                    aVar.e = sArr[1];
                    aVar.g = (float) Math.sqrt((1.0f / aVar.b()) * fArr[0]);
                    aVar.a = true;
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void d() {
        synchronized (this.b) {
            this.g = 0;
            this.m = 0L;
        }
    }

    public void e(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4) {
        long max = Math.max(0L, j);
        if (this.c == i && this.d == max) {
            return;
        }
        this.d = max;
        this.c = i;
        if (this.f == null || this.j != i2 || this.k != i3) {
            lz1.c("createRaf");
            synchronized (this.b) {
                a(i2, i3, i4);
            }
        }
        if (this.f == null) {
            return;
        }
        int limit = byteBuffer.limit() - byteBuffer.position();
        int b = hr1.b(max, this.k, i4, this.j) - limit;
        if (b < 0) {
            lz1.c("startByte: " + b + "; TimeUs: " + max);
        }
        if (b < 0) {
            b = 0;
        }
        int position = byteBuffer.position();
        int limit2 = byteBuffer.limit();
        int b2 = hr1.b(500000L, this.k, i4, this.j);
        synchronized (this.b) {
            if (this.f != null) {
                long j2 = b - this.g;
                if (Math.abs(j2) < b2) {
                    b = this.g;
                } else if (j2 != 0) {
                    lz1.c("newDataFillDelta: " + j2);
                }
                this.g = limit + b;
                this.f.d(b, byteBuffer);
            }
        }
        byteBuffer.limit(limit2);
        byteBuffer.position(position);
    }
}
