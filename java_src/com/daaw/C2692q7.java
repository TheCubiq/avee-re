package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* renamed from: com.daaw.q7 */
/* loaded from: classes.dex */
public final class C2692q7 {

    /* renamed from: a */
    public final C2693a f23718a;

    /* renamed from: b */
    public int f23719b;

    /* renamed from: c */
    public long f23720c;

    /* renamed from: d */
    public long f23721d;

    /* renamed from: e */
    public long f23722e;

    /* renamed from: f */
    public long f23723f;

    @TargetApi(19)
    /* renamed from: com.daaw.q7$a */
    /* loaded from: classes.dex */
    public static final class C2693a {

        /* renamed from: a */
        public final AudioTrack f23724a;

        /* renamed from: b */
        public final AudioTimestamp f23725b = new AudioTimestamp();

        /* renamed from: c */
        public long f23726c;

        /* renamed from: d */
        public long f23727d;

        /* renamed from: e */
        public long f23728e;

        public C2693a(AudioTrack audioTrack) {
            this.f23724a = audioTrack;
        }

        /* renamed from: a */
        public long m12729a() {
            return this.f23728e;
        }

        /* renamed from: b */
        public long m12728b() {
            return this.f23725b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean m12727c() {
            boolean timestamp = this.f23724a.getTimestamp(this.f23725b);
            if (timestamp) {
                long j = this.f23725b.framePosition;
                if (this.f23727d > j) {
                    this.f23726c++;
                }
                this.f23727d = j;
                this.f23728e = j + (this.f23726c << 32);
            }
            return timestamp;
        }
    }

    public C2692q7(AudioTrack audioTrack) {
        if (sq1.f26525a >= 19) {
            this.f23718a = new C2693a(audioTrack);
            m12731h();
            return;
        }
        this.f23718a = null;
        m12730i(3);
    }

    /* renamed from: a */
    public void m12738a() {
        if (this.f23719b == 4) {
            m12731h();
        }
    }

    /* renamed from: b */
    public long m12737b() {
        C2693a c2693a = this.f23718a;
        if (c2693a != null) {
            return c2693a.m12729a();
        }
        return -1L;
    }

    /* renamed from: c */
    public long m12736c() {
        C2693a c2693a = this.f23718a;
        if (c2693a != null) {
            return c2693a.m12728b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean m12735d() {
        int i = this.f23719b;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    public boolean m12734e() {
        return this.f23719b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r0 == false) goto L19;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m12733f(long j) {
        C2693a c2693a = this.f23718a;
        if (c2693a == null || j - this.f23722e < this.f23721d) {
            return false;
        }
        this.f23722e = j;
        boolean m12727c = c2693a.m12727c();
        int i = this.f23719b;
        if (i != 0) {
            if (i == 1) {
                if (m12727c) {
                    if (this.f23718a.m12729a() > this.f23723f) {
                        m12730i(2);
                    }
                }
                m12731h();
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                }
            }
        } else if (m12727c) {
            if (this.f23718a.m12728b() < this.f23720c) {
                return false;
            }
            this.f23723f = this.f23718a.m12729a();
            m12730i(1);
        } else if (j - this.f23720c > 500000) {
            m12730i(3);
        }
        return m12727c;
    }

    /* renamed from: g */
    public void m12732g() {
        m12730i(4);
    }

    /* renamed from: h */
    public void m12731h() {
        if (this.f23718a != null) {
            m12730i(0);
        }
    }

    /* renamed from: i */
    public final void m12730i(int i) {
        this.f23719b = i;
        long j = 5000;
        if (i == 0) {
            this.f23722e = 0L;
            this.f23723f = -1L;
            this.f23720c = System.nanoTime() / 1000;
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                j = 10000000;
            } else if (i != 4) {
                throw new IllegalStateException();
            } else {
                j = 500000;
            }
        }
        this.f23721d = j;
    }
}
