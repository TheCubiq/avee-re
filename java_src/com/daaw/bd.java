package com.daaw;

import java.util.Queue;
/* loaded from: classes.dex */
public final class bd {
    public static final bd b = new bd();
    public final Queue<byte[]> a = tq1.d(0);

    public static bd a() {
        return b;
    }

    public byte[] b() {
        byte[] poll;
        synchronized (this.a) {
            poll = this.a.poll();
        }
        return poll == null ? new byte[65536] : poll;
    }

    public boolean c(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.a) {
            if (this.a.size() < 32) {
                z = true;
                this.a.offer(bArr);
            }
        }
        return z;
    }
}
