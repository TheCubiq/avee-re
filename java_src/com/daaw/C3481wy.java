package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* renamed from: com.daaw.wy */
/* loaded from: classes.dex */
public class C3481wy extends InputStream {

    /* renamed from: r */
    public static final Queue<C3481wy> f31648r = tq1.m8867d(0);

    /* renamed from: p */
    public InputStream f31649p;

    /* renamed from: q */
    public IOException f31650q;

    /* renamed from: n */
    public static C3481wy m5719n(InputStream inputStream) {
        C3481wy poll;
        Queue<C3481wy> queue = f31648r;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C3481wy();
        }
        poll.m5717u(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f31649p.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31649p.close();
    }

    /* renamed from: d */
    public IOException m5720d() {
        return this.f31650q;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f31649p.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f31649p.markSupported();
    }

    /* renamed from: q */
    public void m5718q() {
        this.f31650q = null;
        this.f31649p = null;
        Queue<C3481wy> queue = f31648r;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f31649p.read();
        } catch (IOException e) {
            this.f31650q = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f31649p.read(bArr);
        } catch (IOException e) {
            this.f31650q = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f31649p.read(bArr, i, i2);
        } catch (IOException e) {
            this.f31650q = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f31649p.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f31649p.skip(j);
        } catch (IOException e) {
            this.f31650q = e;
            return 0L;
        }
    }

    /* renamed from: u */
    public void m5717u(InputStream inputStream) {
        this.f31649p = inputStream;
    }
}
