package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class wp0 {

    /* loaded from: classes.dex */
    public static class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.daaw.wp0.c
        public void a(int i) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // com.daaw.wp0.c
        public int b() {
            return wp0.d(this.a.getShort());
        }

        @Override // com.daaw.wp0.c
        public int c() {
            return this.a.getInt();
        }

        @Override // com.daaw.wp0.c
        public long d() {
            return wp0.c(this.a.getInt());
        }

        @Override // com.daaw.wp0.c
        public long getPosition() {
            return this.a.position();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final long a;
        public final long b;

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long a() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i);

        int b();

        int c();

        long d();

        long getPosition();
    }

    public static b a(c cVar) {
        long j;
        cVar.a(4);
        int b2 = cVar.b();
        if (b2 <= 100) {
            cVar.a(6);
            int i = 0;
            while (true) {
                if (i >= b2) {
                    j = -1;
                    break;
                }
                int c2 = cVar.c();
                cVar.a(4);
                j = cVar.d();
                cVar.a(4);
                if (1835365473 == c2) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.a((int) (j - cVar.getPosition()));
                cVar.a(12);
                long d = cVar.d();
                for (int i2 = 0; i2 < d; i2++) {
                    int c3 = cVar.c();
                    long d2 = cVar.d();
                    long d3 = cVar.d();
                    if (1164798569 == c3 || 1701669481 == c3) {
                        return new b(d2 + j, d3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static vp0 b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return vp0.h(duplicate);
    }

    public static long c(int i) {
        return i & 4294967295L;
    }

    public static int d(short s) {
        return s & 65535;
    }
}
