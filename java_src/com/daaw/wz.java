package com.daaw;

import com.daaw.avee.comp.playback.a;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class wz {
    public boolean a;
    public long b = 0;
    public Lock c = new ReentrantLock();
    public LinkedList<sc> d = new LinkedList<>();
    public volatile int e = 0;
    public boolean f = true;
    public int g = -1;
    public long h = -1;
    public long i = 0;
    public byte[][] j = (byte[][]) Array.newInstance(byte.class, 1, 0);

    public final sc a(int i, long j, long[] jArr, sc scVar) {
        Iterator<sc> it = this.d.iterator();
        long j2 = Long.MAX_VALUE;
        sc scVar2 = null;
        while (it.hasNext()) {
            sc next = it.next();
            if (scVar != next && !next.e()) {
                long j3 = j - next.d;
                if (j3 >= -1 && j <= next.a && j2 > j3) {
                    scVar2 = next;
                    j2 = j3;
                }
            }
        }
        if (j2 < 0) {
            j2 = 0;
        }
        jArr[0] = j2;
        return scVar2;
    }

    public com.daaw.avee.comp.playback.a b(long j, a.h hVar, com.daaw.avee.comp.playback.a aVar, boolean z) {
        float[] fArr;
        short[] sArr;
        boolean z2;
        long[] jArr;
        long j2 = j + (hVar.b * 1000);
        char c = 0;
        if (!this.a) {
            aVar.a = false;
            return aVar;
        }
        aVar.k = false;
        aVar.m = j2;
        aVar.o = this.b;
        aVar.p = Long.MAX_VALUE;
        aVar.q = Long.MIN_VALUE;
        long[] jArr2 = new long[1];
        long[] jArr3 = new long[1];
        short[] sArr2 = new short[2];
        float[] fArr2 = {0.0f};
        try {
            z2 = this.c.tryLock(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z2 = false;
        } catch (Exception e) {
            e = e;
            fArr = fArr2;
            sArr = sArr2;
            lz1.c("Exception: " + e.getMessage());
            aVar.d = sArr[0];
            aVar.e = sArr[1];
            aVar.g = (float) Math.sqrt((1.0f / aVar.b()) * fArr[0]);
            aVar.a = true;
            return aVar;
        }
        if (z2) {
            try {
                if (z) {
                    try {
                        f();
                        fArr = fArr2;
                        sArr = sArr2;
                    } catch (Throwable th) {
                        th = th;
                        this.c.unlock();
                        throw th;
                    }
                } else {
                    fArr = fArr2;
                    sArr = sArr2;
                    try {
                        sc a = a(0, j2, jArr2, null);
                        if (a != null) {
                            int i = a.b;
                            jArr = jArr3;
                            aVar.d(i, hVar.a, hVar.d, hr1.c(hVar.c, i));
                        } else {
                            jArr = jArr3;
                        }
                        sArr[0] = aVar.d;
                        sArr[1] = aVar.e;
                        sc scVar = a;
                        int i2 = 0;
                        int i3 = 0;
                        while (scVar != null) {
                            int c2 = hr1.c(jArr2[c], scVar.b);
                            if (i2 > 0 && c2 != 0) {
                                lz1.c("t[" + i2 + "]; startFrameOffsetBuffer != 0; totalSamplesGot: " + i3 + " startFrameOffsetBuffer: " + c2 + " startOffsetTime: " + jArr2[c]);
                            }
                            int d = scVar.d(aVar.c, aVar.b, i3, c2, sArr, fArr, jArr);
                            int i4 = i3 + d;
                            if (i4 >= aVar.b()) {
                                this.i = scVar.d + hr1.e(c2 + d, scVar.b);
                                aVar.k = true;
                            } else {
                                q6.i(jArr[c] != -1);
                                int i5 = i2 + 1;
                                if (i5 < 9) {
                                    scVar = a(i5, jArr[c], jArr2, scVar);
                                    i3 = i4;
                                    i2 = i5;
                                    c = 0;
                                }
                            }
                            i3 = i4;
                            break;
                        }
                        if (i3 >= aVar.b()) {
                            aVar.k = true;
                        } else if (aVar.b() > 2) {
                            lz1.c("totalSamplesGot: " + i3 + " need: " + aVar.b());
                        }
                        aVar.l = i3;
                        aVar.n = j2 + hr1.e(i3, aVar.f);
                    } catch (Throwable th2) {
                        th = th2;
                        this.c.unlock();
                        throw th;
                    }
                }
                this.c.unlock();
            } catch (Exception e2) {
                e = e2;
                lz1.c("Exception: " + e.getMessage());
                aVar.d = sArr[0];
                aVar.e = sArr[1];
                aVar.g = (float) Math.sqrt((1.0f / aVar.b()) * fArr[0]);
                aVar.a = true;
                return aVar;
            }
        } else {
            fArr = fArr2;
            sArr = sArr2;
        }
        aVar.d = sArr[0];
        aVar.e = sArr[1];
        aVar.g = (float) Math.sqrt((1.0f / aVar.b()) * fArr[0]);
        aVar.a = true;
        return aVar;
    }

    public void c() {
        this.e = 1;
    }

    public void d(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4) {
        boolean z;
        long max = Math.max(0L, j);
        if (i > 0 && this.g == i && this.h == max) {
            return;
        }
        this.h = max;
        this.g = i;
        this.b = max;
        try {
            z = this.c.tryLock(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (!z) {
            lz1.c("thread lock timeout 1");
            return;
        }
        try {
            try {
                if (this.e > 0) {
                    f();
                    this.e = 0;
                }
                sc scVar = null;
                if (this.d.size() > 0 && this.d.size() >= 300) {
                    scVar = this.d.removeFirst();
                }
                if (scVar == null) {
                    scVar = new sc();
                }
                scVar.c(byteBuffer, max, i2, i3, i4, this.j);
                this.d.addLast(scVar);
                this.a = true;
            } catch (Exception e) {
                lz1.c("Exception: " + e.getMessage());
                e.printStackTrace();
            }
        } finally {
            this.c.unlock();
        }
    }

    public void e() {
    }

    public final void f() {
        Iterator<sc> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }
}
