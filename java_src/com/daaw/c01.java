package com.daaw;

import android.util.SparseArray;
import com.daaw.da1;
/* loaded from: classes.dex */
public final class c01 implements zz {
    public static final e00 h = new a();
    public final ol1 a;
    public final SparseArray<b> b;
    public final rv0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public d00 g;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new c01()};
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final wv a;
        public final ol1 b;
        public final qv0 c = new qv0(new byte[64]);
        public boolean d;
        public boolean e;
        public boolean f;
        public int g;
        public long h;

        public b(wv wvVar, ol1 ol1Var) {
            this.a = wvVar;
            this.b = ol1Var;
        }

        public void a(rv0 rv0Var) {
            rv0Var.g(this.c.a, 0, 3);
            this.c.m(0);
            b();
            rv0Var.g(this.c.a, 0, this.g);
            this.c.m(0);
            c();
            this.a.e(this.h, true);
            this.a.a(rv0Var);
            this.a.c();
        }

        public final void b() {
            this.c.o(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.o(6);
            this.g = this.c.h(8);
        }

        public final void c() {
            this.h = 0L;
            if (this.d) {
                this.c.o(4);
                this.c.o(1);
                this.c.o(1);
                long h = (this.c.h(3) << 30) | (this.c.h(15) << 15) | this.c.h(15);
                this.c.o(1);
                if (!this.f && this.e) {
                    this.c.o(4);
                    this.c.o(1);
                    this.c.o(1);
                    this.c.o(1);
                    this.b.b((this.c.h(3) << 30) | (this.c.h(15) << 15) | this.c.h(15));
                    this.f = true;
                }
                this.h = this.b.b(h);
            }
        }

        public void d() {
            this.f = false;
            this.a.b();
        }
    }

    public c01() {
        this(new ol1(0L));
    }

    public c01(ol1 ol1Var) {
        this.a = ol1Var;
        this.c = new rv0(4096);
        this.b = new SparseArray<>();
    }

    @Override // com.daaw.zz
    public void a() {
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        byte[] bArr = new byte[14];
        a00Var.k(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            a00Var.g(bArr[13] & 7);
            a00Var.k(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    @Override // com.daaw.zz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(com.daaw.a00 r10, com.daaw.iy0 r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.c01.d(com.daaw.a00, com.daaw.iy0):int");
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        this.a.g();
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).d();
        }
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.g = d00Var;
        d00Var.d(new da1.b(-9223372036854775807L));
    }
}
