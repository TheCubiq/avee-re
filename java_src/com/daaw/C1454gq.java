package com.daaw;

import java.nio.ByteBuffer;
/* renamed from: com.daaw.gq */
/* loaded from: classes.dex */
public class C1454gq extends AbstractC2846rc {

    /* renamed from: q */
    public final C1845jn f11564q = new C1845jn();

    /* renamed from: r */
    public ByteBuffer f11565r;

    /* renamed from: s */
    public long f11566s;

    /* renamed from: t */
    public final int f11567t;

    public C1454gq(int i) {
        this.f11567t = i;
    }

    /* renamed from: r */
    public static C1454gq m21347r() {
        return new C1454gq(0);
    }

    @Override // com.daaw.AbstractC2846rc
    /* renamed from: f */
    public void mo3749f() {
        super.mo3749f();
        ByteBuffer byteBuffer = this.f11565r;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: m */
    public final ByteBuffer m21352m(int i) {
        int i2 = this.f11567t;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f11565r;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    /* renamed from: n */
    public void m21351n(int i) {
        ByteBuffer byteBuffer = this.f11565r;
        if (byteBuffer == null) {
            this.f11565r = m21352m(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f11565r.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer m21352m = m21352m(i2);
        if (position > 0) {
            this.f11565r.position(0);
            this.f11565r.limit(position);
            m21352m.put(this.f11565r);
        }
        this.f11565r = m21352m;
    }

    /* renamed from: o */
    public final void m21350o() {
        this.f11565r.flip();
    }

    /* renamed from: p */
    public final boolean m21349p() {
        return m11439h(1073741824);
    }

    /* renamed from: q */
    public final boolean m21348q() {
        return this.f11565r == null && this.f11567t == 0;
    }
}
