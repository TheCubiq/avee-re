package com.daaw;
/* loaded from: classes.dex */
public final class zo5 {

    /* renamed from: a */
    public long f35306a = 0;

    /* renamed from: b */
    public int f35307b = 0;

    /* renamed from: c */
    public long f35308c = 0;

    /* renamed from: d */
    public long f35309d = 0;

    /* renamed from: e */
    public long f35310e = 0;

    /* renamed from: f */
    public final Object f35311f = new Object();

    /* renamed from: g */
    public final Object f35312g = new Object();

    /* renamed from: h */
    public final Object f35313h = new Object();

    /* renamed from: i */
    public final Object f35314i = new Object();

    /* renamed from: j */
    public final Object f35315j = new Object();

    /* renamed from: a */
    public final int m2039a() {
        int i;
        synchronized (this.f35312g) {
            i = this.f35307b;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized long m2038b() {
        long j;
        synchronized (this.f35315j) {
            j = this.f35310e;
        }
        return j;
    }

    /* renamed from: c */
    public final synchronized long m2037c() {
        long j;
        synchronized (this.f35314i) {
            j = this.f35309d;
        }
        return j;
    }

    /* renamed from: d */
    public final synchronized long m2036d() {
        long j;
        synchronized (this.f35311f) {
            j = this.f35306a;
        }
        return j;
    }

    /* renamed from: e */
    public final long m2035e() {
        long j;
        synchronized (this.f35313h) {
            j = this.f35308c;
        }
        return j;
    }

    /* renamed from: f */
    public final synchronized void m2034f(long j) {
        synchronized (this.f35315j) {
            this.f35310e = j;
        }
    }

    /* renamed from: g */
    public final synchronized void m2033g(long j) {
        synchronized (this.f35314i) {
            this.f35309d = j;
        }
    }

    /* renamed from: h */
    public final synchronized void m2032h(long j) {
        synchronized (this.f35311f) {
            this.f35306a = j;
        }
    }

    /* renamed from: i */
    public final void m2031i(int i) {
        synchronized (this.f35312g) {
            this.f35307b = i;
        }
    }

    /* renamed from: j */
    public final void m2030j(long j) {
        synchronized (this.f35313h) {
            this.f35308c = j;
        }
    }
}
