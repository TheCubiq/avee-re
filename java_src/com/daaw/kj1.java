package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class kj1 {

    /* renamed from: a */
    public int f16408a;

    /* renamed from: b */
    public ByteBuffer f16409b;

    /* renamed from: c */
    public int f16410c;

    /* renamed from: d */
    public int f16411d;

    /* renamed from: e */
    public qq1 f16412e = qq1.m12284a();

    /* renamed from: a */
    public int m17705a(int i) {
        return i + this.f16409b.getInt(i);
    }

    /* renamed from: b */
    public int m17704b(int i) {
        if (i < this.f16411d) {
            return this.f16409b.getShort(this.f16410c + i);
        }
        return 0;
    }

    /* renamed from: c */
    public void m17703c(int i, ByteBuffer byteBuffer) {
        short s;
        this.f16409b = byteBuffer;
        if (byteBuffer != null) {
            this.f16408a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f16410c = i2;
            s = this.f16409b.getShort(i2);
        } else {
            s = 0;
            this.f16408a = 0;
            this.f16410c = 0;
        }
        this.f16411d = s;
    }

    /* renamed from: d */
    public int m17702d(int i) {
        int i2 = i + this.f16408a;
        return i2 + this.f16409b.getInt(i2) + 4;
    }

    /* renamed from: e */
    public int m17701e(int i) {
        int i2 = i + this.f16408a;
        return this.f16409b.getInt(i2 + this.f16409b.getInt(i2));
    }
}
