package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* loaded from: classes.dex */
public class wy extends InputStream {
    public static final Queue<wy> r = tq1.d(0);
    public InputStream p;
    public IOException q;

    public static wy n(InputStream inputStream) {
        wy poll;
        Queue<wy> queue = r;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new wy();
        }
        poll.u(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.p.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.p.close();
    }

    public IOException d() {
        return this.q;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.p.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.p.markSupported();
    }

    public void q() {
        this.q = null;
        this.p = null;
        Queue<wy> queue = r;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.p.read();
        } catch (IOException e) {
            this.q = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.p.read(bArr);
        } catch (IOException e) {
            this.q = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.p.read(bArr, i, i2);
        } catch (IOException e) {
            this.q = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.p.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.p.skip(j);
        } catch (IOException e) {
            this.q = e;
            return 0L;
        }
    }

    public void u(InputStream inputStream) {
        this.p = inputStream;
    }
}
