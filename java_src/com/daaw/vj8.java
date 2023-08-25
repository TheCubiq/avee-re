package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class vj8 {
    public final tj8 a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public vj8(AudioTrack audioTrack) {
        int i = it5.a;
        this.a = new tj8(audioTrack);
        h(0);
    }

    @TargetApi(19)
    public final long a() {
        return this.a.a();
    }

    @TargetApi(19)
    public final long b() {
        return this.a.b();
    }

    public final void c() {
        if (this.b == 4) {
            h(0);
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.b == 2;
    }

    @TargetApi(19)
    public final boolean g(long j) {
        tj8 tj8Var = this.a;
        if (j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean c = tj8Var.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (c) {
                        return true;
                    }
                    h(0);
                    return false;
                } else if (i == 3) {
                    if (c) {
                        h(0);
                        return true;
                    }
                    return false;
                }
            } else if (!c) {
                h(0);
            } else if (this.a.a() > this.f) {
                h(2);
                return true;
            }
        } else if (c) {
            if (this.a.b() < this.c) {
                return false;
            }
            this.f = this.a.a();
            h(1);
            return true;
        } else if (j - this.c > 500000) {
            h(3);
            return false;
        }
        return c;
    }

    public final void h(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else if (i == 1) {
            this.d = 10000L;
            return;
        } else {
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
