package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class wp0 {

    /* renamed from: com.daaw.wp0$a */
    /* loaded from: classes.dex */
    public static class C3459a implements InterfaceC3461c {

        /* renamed from: a */
        public final ByteBuffer f31431a;

        public C3459a(ByteBuffer byteBuffer) {
            this.f31431a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.daaw.wp0.InterfaceC3461c
        /* renamed from: a */
        public void mo5874a(int i) {
            ByteBuffer byteBuffer = this.f31431a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // com.daaw.wp0.InterfaceC3461c
        /* renamed from: b */
        public int mo5873b() {
            return wp0.m5876d(this.f31431a.getShort());
        }

        @Override // com.daaw.wp0.InterfaceC3461c
        /* renamed from: c */
        public int mo5872c() {
            return this.f31431a.getInt();
        }

        @Override // com.daaw.wp0.InterfaceC3461c
        /* renamed from: d */
        public long mo5871d() {
            return wp0.m5877c(this.f31431a.getInt());
        }

        @Override // com.daaw.wp0.InterfaceC3461c
        public long getPosition() {
            return this.f31431a.position();
        }
    }

    /* renamed from: com.daaw.wp0$b */
    /* loaded from: classes.dex */
    public static class C3460b {

        /* renamed from: a */
        public final long f31432a;

        /* renamed from: b */
        public final long f31433b;

        public C3460b(long j, long j2) {
            this.f31432a = j;
            this.f31433b = j2;
        }

        /* renamed from: a */
        public long m5875a() {
            return this.f31432a;
        }
    }

    /* renamed from: com.daaw.wp0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3461c {
        /* renamed from: a */
        void mo5874a(int i);

        /* renamed from: b */
        int mo5873b();

        /* renamed from: c */
        int mo5872c();

        /* renamed from: d */
        long mo5871d();

        long getPosition();
    }

    /* renamed from: a */
    public static C3460b m5879a(InterfaceC3461c interfaceC3461c) {
        long j;
        interfaceC3461c.mo5874a(4);
        int mo5873b = interfaceC3461c.mo5873b();
        if (mo5873b <= 100) {
            interfaceC3461c.mo5874a(6);
            int i = 0;
            while (true) {
                if (i >= mo5873b) {
                    j = -1;
                    break;
                }
                int mo5872c = interfaceC3461c.mo5872c();
                interfaceC3461c.mo5874a(4);
                j = interfaceC3461c.mo5871d();
                interfaceC3461c.mo5874a(4);
                if (1835365473 == mo5872c) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                interfaceC3461c.mo5874a((int) (j - interfaceC3461c.getPosition()));
                interfaceC3461c.mo5874a(12);
                long mo5871d = interfaceC3461c.mo5871d();
                for (int i2 = 0; i2 < mo5871d; i2++) {
                    int mo5872c2 = interfaceC3461c.mo5872c();
                    long mo5871d2 = interfaceC3461c.mo5871d();
                    long mo5871d3 = interfaceC3461c.mo5871d();
                    if (1164798569 == mo5872c2 || 1701669481 == mo5872c2) {
                        return new C3460b(mo5871d2 + j, mo5871d3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static vp0 m5878b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m5879a(new C3459a(duplicate)).m5875a());
        return vp0.m6956h(duplicate);
    }

    /* renamed from: c */
    public static long m5877c(int i) {
        return i & 4294967295L;
    }

    /* renamed from: d */
    public static int m5876d(short s) {
        return s & 65535;
    }
}
