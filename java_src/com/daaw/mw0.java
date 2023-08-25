package com.daaw;

import com.daaw.eo1;
/* loaded from: classes.dex */
public final class mw0 implements eo1 {
    public final wv a;
    public final qv0 b = new qv0(new byte[10]);
    public int c = 0;
    public int d;
    public ol1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public mw0(wv wvVar) {
        this.a = wvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005b -> B:30:0x005d). Please submit an issue!!! */
    @Override // com.daaw.eo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.daaw.rv0 r7, boolean r8) {
        /*
            r6 = this;
            r0 = -1
            r1 = 1
            r2 = 3
            if (r8 == 0) goto L26
            int r8 = r6.c
            if (r8 == r2) goto La
            goto L23
        La:
            int r8 = r6.j
            if (r8 == r0) goto L5d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "Unexpected start indicator: expected "
            r8.append(r3)
            int r3 = r6.j
            r8.append(r3)
            java.lang.String r3 = " more bytes"
            r8.append(r3)
            goto L5d
        L23:
            r6.g(r1)
        L26:
            int r8 = r7.a()
            if (r8 <= 0) goto Lae
            int r8 = r6.c
            if (r8 == 0) goto La5
            r3 = 0
            r4 = 2
            if (r8 == r1) goto L8e
            if (r8 == r4) goto L63
            if (r8 == r2) goto L39
            goto L26
        L39:
            int r8 = r7.a()
            int r4 = r6.j
            if (r4 != r0) goto L42
            goto L44
        L42:
            int r3 = r8 - r4
        L44:
            if (r3 <= 0) goto L4f
            int r8 = r8 - r3
            int r3 = r7.c()
            int r3 = r3 + r8
            r7.I(r3)
        L4f:
            com.daaw.wv r3 = r6.a
            r3.a(r7)
            int r3 = r6.j
            if (r3 == r0) goto L26
            int r3 = r3 - r8
            r6.j = r3
            if (r3 != 0) goto L26
        L5d:
            com.daaw.wv r8 = r6.a
            r8.c()
            goto L23
        L63:
            r8 = 10
            int r3 = r6.i
            int r8 = java.lang.Math.min(r8, r3)
            com.daaw.qv0 r3 = r6.b
            byte[] r3 = r3.a
            boolean r8 = r6.d(r7, r3, r8)
            if (r8 == 0) goto L26
            r8 = 0
            int r3 = r6.i
            boolean r8 = r6.d(r7, r8, r3)
            if (r8 == 0) goto L26
            r6.f()
            com.daaw.wv r8 = r6.a
            long r3 = r6.l
            boolean r5 = r6.k
            r8.e(r3, r5)
            r6.g(r2)
            goto L26
        L8e:
            com.daaw.qv0 r8 = r6.b
            byte[] r8 = r8.a
            r5 = 9
            boolean r8 = r6.d(r7, r8, r5)
            if (r8 == 0) goto L26
            boolean r8 = r6.e()
            if (r8 == 0) goto La1
            r3 = 2
        La1:
            r6.g(r3)
            goto L26
        La5:
            int r8 = r7.a()
            r7.K(r8)
            goto L26
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.mw0.a(com.daaw.rv0, boolean):void");
    }

    @Override // com.daaw.eo1
    public final void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }

    @Override // com.daaw.eo1
    public void c(ol1 ol1Var, d00 d00Var, eo1.d dVar) {
        this.e = ol1Var;
        this.a.d(d00Var, dVar);
    }

    public final boolean d(rv0 rv0Var, byte[] bArr, int i) {
        int min = Math.min(rv0Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            rv0Var.K(min);
        } else {
            rv0Var.g(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        this.b.m(0);
        int h = this.b.h(24);
        if (h != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected start code prefix: ");
            sb.append(h);
            this.j = -1;
            return false;
        }
        this.b.o(8);
        int h2 = this.b.h(16);
        this.b.o(5);
        this.k = this.b.g();
        this.b.o(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.o(6);
        int h3 = this.b.h(8);
        this.i = h3;
        if (h2 == 0) {
            this.j = -1;
        } else {
            this.j = ((h2 + 6) - 9) - h3;
        }
        return true;
    }

    public final void f() {
        this.b.m(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.o(4);
            this.b.o(1);
            this.b.o(1);
            long h = (this.b.h(3) << 30) | (this.b.h(15) << 15) | this.b.h(15);
            this.b.o(1);
            if (!this.h && this.g) {
                this.b.o(4);
                this.b.o(1);
                this.b.o(1);
                this.b.o(1);
                this.e.b((this.b.h(3) << 30) | (this.b.h(15) << 15) | this.b.h(15));
                this.h = true;
            }
            this.l = this.e.b(h);
        }
    }

    public final void g(int i) {
        this.c = i;
        this.d = 0;
    }
}
