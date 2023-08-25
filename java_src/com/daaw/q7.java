package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class q7 {
    public final a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    @TargetApi(19)
    /* loaded from: classes.dex */
    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public q7(AudioTrack audioTrack) {
        if (sq1.a >= 19) {
            this.a = new a(audioTrack);
            h();
            return;
        }
        this.a = null;
        i(3);
    }

    public void a() {
        if (this.b == 4) {
            h();
        }
    }

    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        int i = this.b;
        return i == 1 || i == 2;
    }

    public boolean e() {
        return this.b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(long r8) {
        /*
            r7 = this;
            com.daaw.q7$a r0 = r7.a
            r1 = 0
            if (r0 == 0) goto L71
            long r2 = r7.e
            long r2 = r8 - r2
            long r4 = r7.d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            goto L71
        L10:
            r7.e = r8
            boolean r0 = r0.c()
            int r2 = r7.b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L49
            r8 = 2
            if (r2 == r4) goto L33
            if (r2 == r8) goto L30
            if (r2 == r3) goto L2d
            r8 = 4
            if (r2 != r8) goto L27
            goto L70
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L2d:
            if (r0 == 0) goto L70
            goto L45
        L30:
            if (r0 != 0) goto L70
            goto L45
        L33:
            if (r0 == 0) goto L45
            com.daaw.q7$a r9 = r7.a
            long r1 = r9.a()
            long r3 = r7.f
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L70
            r7.i(r8)
            goto L70
        L45:
            r7.h()
            goto L70
        L49:
            if (r0 == 0) goto L63
            com.daaw.q7$a r8 = r7.a
            long r8 = r8.b()
            long r2 = r7.c
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L71
            com.daaw.q7$a r8 = r7.a
            long r8 = r8.a()
            r7.f = r8
            r7.i(r4)
            goto L70
        L63:
            long r1 = r7.c
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L70
            r7.i(r3)
        L70:
            r1 = r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.q7.f(long):boolean");
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.a != null) {
            i(0);
        }
    }

    public final void i(int i) {
        this.b = i;
        long j = 5000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                j = 10000000;
            } else if (i != 4) {
                throw new IllegalStateException();
            } else {
                j = 500000;
            }
        }
        this.d = j;
    }
}
