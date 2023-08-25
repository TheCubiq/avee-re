package com.daaw;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ik8 {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final xj8 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public vj8 f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public ik8(xj8 xj8Var) {
        this.a = xj8Var;
        int i = it5.a;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
    }

    public final int a(long j) {
        return this.e - ((int) (j - (m() * this.d)));
    }

    public final long b(boolean z) {
        long l;
        lj8 lj8Var;
        lj8 lj8Var2;
        dj8 dj8Var;
        Method method;
        AudioTrack audioTrack;
        vj8 vj8Var;
        long s;
        long t;
        String str;
        long s2;
        long t2;
        ik8 ik8Var = this;
        AudioTrack audioTrack2 = ik8Var.c;
        Objects.requireNonNull(audioTrack2);
        if (audioTrack2.getPlayState() == 3) {
            long l2 = ik8Var.l(m());
            if (l2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - ik8Var.m >= 30000) {
                    long[] jArr = ik8Var.b;
                    int i = ik8Var.v;
                    jArr[i] = l2 - nanoTime;
                    ik8Var.v = (i + 1) % 10;
                    int i2 = ik8Var.w;
                    if (i2 < 10) {
                        ik8Var.w = i2 + 1;
                    }
                    ik8Var.m = nanoTime;
                    ik8Var.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = ik8Var.w;
                        if (i3 >= i4) {
                            break;
                        }
                        ik8Var.l += ik8Var.b[i3] / i4;
                        i3++;
                    }
                }
                if (!ik8Var.h) {
                    vj8 vj8Var2 = ik8Var.f;
                    Objects.requireNonNull(vj8Var2);
                    if (vj8Var2.g(nanoTime)) {
                        long b = vj8Var2.b();
                        long a = vj8Var2.a();
                        if (Math.abs(b - nanoTime) > 5000000) {
                            il8 il8Var = (il8) ik8Var.a;
                            s2 = il8Var.a.s();
                            t2 = il8Var.a.t();
                            StringBuilder sb = new StringBuilder();
                            vj8Var = vj8Var2;
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(a);
                            sb.append(", ");
                            sb.append(b);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(l2);
                            sb.append(", ");
                            sb.append(s2);
                            sb.append(", ");
                            sb.append(t2);
                            str = sb.toString();
                        } else {
                            vj8Var = vj8Var2;
                            if (Math.abs(ik8Var.l(a) - l2) > 5000000) {
                                il8 il8Var2 = (il8) ik8Var.a;
                                s = il8Var2.a.s();
                                t = il8Var2.a.t();
                                str = "Spurious audio timestamp (frame position mismatch): " + a + ", " + b + ", " + nanoTime + ", " + l2 + ", " + s + ", " + t;
                            } else {
                                vj8Var.c();
                                ik8Var = this;
                            }
                        }
                        s95.e("DefaultAudioSink", str);
                        vj8Var.d();
                        ik8Var = this;
                    }
                    if (ik8Var.q && (method = ik8Var.n) != null && nanoTime - ik8Var.r >= 500000) {
                        try {
                            Objects.requireNonNull(ik8Var.c);
                            int i5 = it5.a;
                            long intValue = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - ik8Var.i;
                            ik8Var.o = intValue;
                            long max = Math.max(intValue, 0L);
                            ik8Var.o = max;
                            if (max > 5000000) {
                                s95.e("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                ik8Var.o = 0L;
                            }
                        } catch (Exception unused) {
                            ik8Var.n = null;
                        }
                        ik8Var.r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        vj8 vj8Var3 = ik8Var.f;
        Objects.requireNonNull(vj8Var3);
        boolean f = vj8Var3.f();
        if (f) {
            l = ik8Var.l(vj8Var3.a()) + it5.c0(nanoTime2 - vj8Var3.b(), ik8Var.j);
        } else {
            l = ik8Var.w == 0 ? ik8Var.l(m()) : ik8Var.l + nanoTime2;
            if (!z) {
                l = Math.max(0L, l - ik8Var.o);
            }
        }
        if (ik8Var.D != f) {
            ik8Var.F = ik8Var.C;
            ik8Var.E = ik8Var.B;
        }
        long j = nanoTime2 - ik8Var.F;
        if (j < 1000000) {
            long j2 = (j * 1000) / 1000000;
            l = ((l * j2) + ((1000 - j2) * (ik8Var.E + it5.c0(j, ik8Var.j)))) / 1000;
        }
        if (!ik8Var.k) {
            long j3 = ik8Var.B;
            if (l > j3) {
                ik8Var.k = true;
                long currentTimeMillis = System.currentTimeMillis() - it5.j0(it5.e0(it5.j0(l - j3), ik8Var.j));
                sl8 sl8Var = ((il8) ik8Var.a).a;
                lj8Var = sl8Var.n;
                if (lj8Var != null) {
                    lj8Var2 = sl8Var.n;
                    dj8Var = ((cm8) lj8Var2).a.R0;
                    dj8Var.r(currentTimeMillis);
                }
            }
        }
        ik8Var.C = nanoTime2;
        ik8Var.B = l;
        ik8Var.D = f;
        return l;
    }

    public final void c(long j) {
        this.z = m();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j;
    }

    public final void d() {
        n();
        this.c = null;
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.c = r4
            r3.d = r7
            r3.e = r8
            com.daaw.vj8 r0 = new com.daaw.vj8
            r0.<init>(r4)
            r3.f = r0
            int r4 = r4.getSampleRate()
            r3.g = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L25
            int r5 = com.daaw.it5.a
            r2 = 23
            if (r5 >= r2) goto L25
            r5 = 5
            if (r6 == r5) goto L26
            if (r6 != r4) goto L25
            r6 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r3.h = r0
            boolean r4 = com.daaw.it5.v(r6)
            r3.q = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.l(r7)
            goto L3d
        L3c:
            r7 = r5
        L3d:
            r3.i = r7
            r7 = 0
            r3.s = r7
            r3.t = r7
            r3.u = r7
            r3.p = r1
            r3.x = r5
            r3.y = r5
            r3.r = r7
            r3.o = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ik8.e(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void f() {
        vj8 vj8Var = this.f;
        Objects.requireNonNull(vj8Var);
        vj8Var.e();
    }

    public final boolean g(long j) {
        if (j <= m()) {
            if (this.h) {
                AudioTrack audioTrack = this.c;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && m() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean h() {
        AudioTrack audioTrack = this.c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j) {
        return this.y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public final boolean j(long j) {
        lj8 lj8Var;
        long j2;
        lj8 lj8Var2;
        dj8 dj8Var;
        AudioTrack audioTrack = this.c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            } else if (playState == 1) {
                if (m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.p;
        boolean g = g(j);
        this.p = g;
        if (z && !g && playState != 1) {
            xj8 xj8Var = this.a;
            int i = this.e;
            long j0 = it5.j0(this.i);
            il8 il8Var = (il8) xj8Var;
            lj8Var = il8Var.a.n;
            if (lj8Var != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                sl8 sl8Var = il8Var.a;
                j2 = sl8Var.S;
                lj8Var2 = sl8Var.n;
                dj8Var = ((cm8) lj8Var2).a.R0;
                dj8Var.t(i, j0, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean k() {
        n();
        if (this.x == -9223372036854775807L) {
            vj8 vj8Var = this.f;
            Objects.requireNonNull(vj8Var);
            vj8Var.e();
            return true;
        }
        return false;
    }

    public final long l(long j) {
        return (j * 1000000) / this.g;
    }

    public final long m() {
        AudioTrack audioTrack = this.c;
        Objects.requireNonNull(audioTrack);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * this.g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.u = this.s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.u;
        }
        if (it5.a <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public final void n() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
    }
}
