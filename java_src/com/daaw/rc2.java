package com.daaw;
/* loaded from: classes.dex */
public final class rc2 implements ud2 {
    public final ac2 a;
    public final cj5 b = new cj5(new byte[10], 10);
    public int c = 0;
    public int d;
    public cr5 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public rc2(ac2 ac2Var) {
        this.a = ac2Var;
    }

    @Override // com.daaw.ud2
    public final void a(ik5 ik5Var, int i) {
        long j;
        uo4.b(this.e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.c;
            if (i4 != 0 && i4 != 1) {
                if (i4 != 2) {
                    int i5 = this.j;
                    if (i5 != -1) {
                        s95.e("PesReader", "Unexpected start indicator: expected " + i5 + " more bytes");
                    }
                    this.a.zzc();
                } else {
                    s95.e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            c(1);
        }
        int i6 = i;
        while (ik5Var.i() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != i3) {
                        int i8 = ik5Var.i();
                        int i9 = this.j;
                        int i10 = i9 != i2 ? i8 - i9 : 0;
                        if (i10 > 0) {
                            i8 -= i10;
                            ik5Var.e(ik5Var.k() + i8);
                        }
                        this.a.a(ik5Var);
                        int i11 = this.j;
                        if (i11 != i2) {
                            int i12 = i11 - i8;
                            this.j = i12;
                            if (i12 == 0) {
                                this.a.zzc();
                                c(1);
                            }
                        }
                    } else {
                        if (d(ik5Var, this.b.a, Math.min(10, this.i)) && d(ik5Var, null, this.i)) {
                            this.b.h(0);
                            if (this.f) {
                                this.b.j(4);
                                int c = this.b.c(3);
                                this.b.j(1);
                                int c2 = this.b.c(15);
                                this.b.j(1);
                                long c3 = (c2 << 15) | (c << 30) | this.b.c(15);
                                this.b.j(1);
                                if (!this.h && this.g) {
                                    this.b.j(4);
                                    int c4 = this.b.c(3);
                                    this.b.j(1);
                                    int c5 = this.b.c(15);
                                    this.b.j(1);
                                    int c6 = this.b.c(15);
                                    this.b.j(1);
                                    this.e.b((c4 << 30) | (c5 << 15) | c6);
                                    this.h = true;
                                }
                                j = this.e.b(c3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i6 |= true != this.k ? 0 : 4;
                            this.a.c(j, i6);
                            c(3);
                            i2 = -1;
                        }
                    }
                } else if (d(ik5Var, this.b.a, 9)) {
                    int i13 = 0;
                    this.b.h(0);
                    int c7 = this.b.c(24);
                    if (c7 != 1) {
                        s95.e("PesReader", "Unexpected start code prefix: " + c7);
                        i2 = -1;
                        this.j = -1;
                    } else {
                        this.b.j(8);
                        int c8 = this.b.c(16);
                        this.b.j(5);
                        this.k = this.b.l();
                        this.b.j(2);
                        this.f = this.b.l();
                        this.g = this.b.l();
                        this.b.j(6);
                        int c9 = this.b.c(8);
                        this.i = c9;
                        if (c8 == 0) {
                            this.j = -1;
                        } else {
                            int i14 = (c8 - 3) - c9;
                            this.j = i14;
                            if (i14 < 0) {
                                s95.e("PesReader", "Found negative packet payload size: " + i14);
                                i2 = -1;
                                this.j = -1;
                                i13 = 2;
                            }
                        }
                        i2 = -1;
                        i13 = 2;
                    }
                    c(i13);
                } else {
                    i2 = -1;
                }
            } else {
                ik5Var.g(ik5Var.i());
            }
            i3 = 2;
        }
    }

    @Override // com.daaw.ud2
    public final void b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
        this.e = cr5Var;
        this.a.b(m09Var, td2Var);
    }

    public final void c(int i) {
        this.c = i;
        this.d = 0;
    }

    public final boolean d(ik5 ik5Var, byte[] bArr, int i) {
        int min = Math.min(ik5Var.i(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ik5Var.g(min);
        } else {
            ik5Var.b(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // com.daaw.ud2
    public final void zzc() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.zze();
    }
}
