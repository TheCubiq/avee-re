package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class vj8 {

    /* renamed from: a */
    public final tj8 f30272a;

    /* renamed from: b */
    public int f30273b;

    /* renamed from: c */
    public long f30274c;

    /* renamed from: d */
    public long f30275d;

    /* renamed from: e */
    public long f30276e;

    /* renamed from: f */
    public long f30277f;

    public vj8(AudioTrack audioTrack) {
        int i = it5.f13991a;
        this.f30272a = new tj8(audioTrack);
        m7101h(0);
    }

    @TargetApi(19)
    /* renamed from: a */
    public final long m7108a() {
        return this.f30272a.m9070a();
    }

    @TargetApi(19)
    /* renamed from: b */
    public final long m7107b() {
        return this.f30272a.m9069b();
    }

    /* renamed from: c */
    public final void m7106c() {
        if (this.f30273b == 4) {
            m7101h(0);
        }
    }

    /* renamed from: d */
    public final void m7105d() {
        m7101h(4);
    }

    /* renamed from: e */
    public final void m7104e() {
        m7101h(0);
    }

    /* renamed from: f */
    public final boolean m7103f() {
        return this.f30273b == 2;
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean m7102g(long j) {
        tj8 tj8Var = this.f30272a;
        if (j - this.f30276e < this.f30275d) {
            return false;
        }
        this.f30276e = j;
        boolean m9068c = tj8Var.m9068c();
        int i = this.f30273b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (m9068c) {
                        return true;
                    }
                    m7101h(0);
                    return false;
                } else if (i == 3) {
                    if (m9068c) {
                        m7101h(0);
                        return true;
                    }
                    return false;
                }
            } else if (!m9068c) {
                m7101h(0);
            } else if (this.f30272a.m9070a() > this.f30277f) {
                m7101h(2);
                return true;
            }
        } else if (m9068c) {
            if (this.f30272a.m9069b() < this.f30274c) {
                return false;
            }
            this.f30277f = this.f30272a.m9070a();
            m7101h(1);
            return true;
        } else if (j - this.f30274c > 500000) {
            m7101h(3);
            return false;
        }
        return m9068c;
    }

    /* renamed from: h */
    public final void m7101h(int i) {
        this.f30273b = i;
        long j = 10000;
        if (i == 0) {
            this.f30276e = 0L;
            this.f30277f = -1L;
            this.f30274c = System.nanoTime() / 1000;
        } else if (i == 1) {
            this.f30275d = 10000L;
            return;
        } else {
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f30275d = j;
    }
}
