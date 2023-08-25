package com.daaw;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class g82 implements i82 {

    /* renamed from: a */
    public final byte[] f10343a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque f10344b = new ArrayDeque();

    /* renamed from: c */
    public final p82 f10345c = new p82();

    /* renamed from: d */
    public h82 f10346d;

    /* renamed from: e */
    public int f10347e;

    /* renamed from: f */
    public int f10348f;

    /* renamed from: g */
    public long f10349g;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 == 1) goto L29;
     */
    @Override // com.daaw.i82
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo20031a(k09 k09Var) {
        String str;
        long m21887c;
        rz8 rz8Var;
        int m13591b;
        int m13590c;
        long j;
        int i;
        uo4.m7876b(this.f10346d);
        while (true) {
            f82 f82Var = (f82) this.f10344b.peek();
            if (f82Var != null) {
                long zzf = k09Var.zzf();
                j = f82Var.f9232b;
                if (zzf >= j) {
                    h82 h82Var = this.f10346d;
                    i = ((f82) this.f10344b.pop()).f9231a;
                    ((l82) h82Var).f17133a.m15432h(i);
                    return true;
                }
            }
            int i2 = this.f10347e;
            if (i2 == 0) {
                long m13589d = this.f10345c.m13589d(k09Var, true, false, 4);
                if (m13589d == -2) {
                    k09Var.zzj();
                    while (true) {
                        rz8Var = (rz8) k09Var;
                        rz8Var.mo5661h(this.f10343a, 0, 4, false);
                        m13591b = p82.m13591b(this.f10343a[0]);
                        if (m13591b != -1 && m13591b <= 4) {
                            m13590c = (int) p82.m13590c(this.f10343a, m13591b, false);
                            n82 n82Var = ((l82) this.f10346d).f17133a;
                            if (n82.m15425o(m13590c)) {
                                break;
                            }
                        }
                        rz8Var.m10811l(1, false);
                    }
                    rz8Var.m10811l(m13591b, false);
                    m13589d = m13590c;
                }
                if (m13589d == -1) {
                    return false;
                }
                this.f10348f = (int) m13589d;
                this.f10347e = 1;
            }
            this.f10349g = this.f10345c.m13589d(k09Var, false, true, 8);
            this.f10347e = 2;
            h82 h82Var2 = this.f10346d;
            int i3 = this.f10348f;
            l82 l82Var = (l82) h82Var2;
            n82 n82Var2 = l82Var.f17133a;
            int m15426n = n82.m15426n(i3);
            if (m15426n != 0) {
                if (m15426n == 1) {
                    long zzf2 = k09Var.zzf();
                    this.f10344b.push(new f82(i3, this.f10349g + zzf2, null));
                    ((l82) this.f10346d).f17133a.m15429k(this.f10348f, zzf2, this.f10349g);
                    this.f10347e = 0;
                    return true;
                } else if (m15426n == 2) {
                    long j2 = this.f10349g;
                    if (j2 <= 8) {
                        l82Var.f17133a.m15430j(i3, m21887c(k09Var, (int) j2));
                        this.f10347e = 0;
                        return true;
                    }
                    throw dl3.m24267a("Invalid integer size: " + j2, null);
                } else if (m15426n != 3) {
                    if (m15426n == 4) {
                        n82Var2.m15433g(i3, (int) this.f10349g, k09Var);
                        this.f10347e = 0;
                        return true;
                    }
                    long j3 = this.f10349g;
                    if (j3 != 4 && j3 != 8) {
                        throw dl3.m24267a("Invalid float size: " + j3, null);
                    }
                    int i4 = (int) j3;
                    l82Var.f17133a.m15431i(i3, i4 == 4 ? Float.intBitsToFloat((int) m21887c) : Double.longBitsToDouble(m21887c(k09Var, i4)));
                    this.f10347e = 0;
                    return true;
                } else {
                    long j4 = this.f10349g;
                    if (j4 > 2147483647L) {
                        throw dl3.m24267a("String element size: " + j4, null);
                    }
                    int i5 = (int) j4;
                    if (i5 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i5];
                        ((rz8) k09Var).mo5663e(bArr, 0, i5, false);
                        while (i5 > 0) {
                            int i6 = i5 - 1;
                            if (bArr[i6] != 0) {
                                break;
                            }
                            i5 = i6;
                        }
                        str = new String(bArr, 0, i5);
                    }
                    l82Var.f17133a.m15428l(i3, str);
                    this.f10347e = 0;
                    return true;
                }
            }
            ((rz8) k09Var).m10811l((int) this.f10349g, false);
            this.f10347e = 0;
        }
    }

    @Override // com.daaw.i82
    /* renamed from: b */
    public final void mo20030b(h82 h82Var) {
        this.f10346d = h82Var;
    }

    /* renamed from: c */
    public final long m21887c(k09 k09Var, int i) {
        ((rz8) k09Var).mo5663e(this.f10343a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f10343a[i2] & 255);
        }
        return j;
    }

    @Override // com.daaw.i82
    public final void zzb() {
        this.f10347e = 0;
        this.f10344b.clear();
        this.f10345c.m13588e();
    }
}
