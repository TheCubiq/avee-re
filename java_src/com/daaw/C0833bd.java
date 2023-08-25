package com.daaw;

import java.util.Queue;
/* renamed from: com.daaw.bd */
/* loaded from: classes.dex */
public final class C0833bd {

    /* renamed from: b */
    public static final C0833bd f4709b = new C0833bd();

    /* renamed from: a */
    public final Queue<byte[]> f4710a = tq1.m8867d(0);

    /* renamed from: a */
    public static C0833bd m26226a() {
        return f4709b;
    }

    /* renamed from: b */
    public byte[] m26225b() {
        byte[] poll;
        synchronized (this.f4710a) {
            poll = this.f4710a.poll();
        }
        return poll == null ? new byte[65536] : poll;
    }

    /* renamed from: c */
    public boolean m26224c(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.f4710a) {
            if (this.f4710a.size() < 32) {
                z = true;
                this.f4710a.offer(bArr);
            }
        }
        return z;
    }
}
