package com.daaw;

import com.daaw.ft;
import com.daaw.kx1;
import com.daaw.qj;
/* loaded from: classes.dex */
public class ms1 extends kx1 {
    public ft k;
    public pt l;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kx1.b.values().length];
            a = iArr;
            try {
                iArr[kx1.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kx1.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kx1.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ms1(qj qjVar) {
        super(qjVar);
        ft ftVar = new ft(this);
        this.k = ftVar;
        this.l = null;
        this.h.e = ft.a.TOP;
        this.i.e = ft.a.BOTTOM;
        ftVar.e = ft.a.BASELINE;
        this.f = 1;
    }

    @Override // com.daaw.kx1, com.daaw.zs
    public void a(zs zsVar) {
        int i;
        float r;
        int i2 = a.a[this.j.ordinal()];
        if (i2 == 1) {
            p(zsVar);
        } else if (i2 == 2) {
            o(zsVar);
        } else if (i2 == 3) {
            qj qjVar = this.b;
            n(zsVar, qjVar.C, qjVar.E, 1);
            return;
        }
        pt ptVar = this.e;
        if (ptVar.c && !ptVar.j && this.d == qj.b.MATCH_CONSTRAINT) {
            qj qjVar2 = this.b;
            int i3 = qjVar2.m;
            if (i3 == 2) {
                qj E = qjVar2.E();
                if (E != null) {
                    pt ptVar2 = E.f.e;
                    if (ptVar2.j) {
                        i = (int) ((ptVar2.g * this.b.t) + 0.5f);
                        this.e.d(i);
                    }
                }
            } else if (i3 == 3 && qjVar2.e.e.j) {
                int s = qjVar2.s();
                if (s != -1) {
                    if (s == 0) {
                        qj qjVar3 = this.b;
                        r = qjVar3.e.e.g * qjVar3.r();
                        i = (int) (r + 0.5f);
                        this.e.d(i);
                    } else if (s != 1) {
                        i = 0;
                        this.e.d(i);
                    }
                }
                qj qjVar4 = this.b;
                r = qjVar4.e.e.g / qjVar4.r();
                i = (int) (r + 0.5f);
                this.e.d(i);
            }
        }
        ft ftVar = this.h;
        if (ftVar.c) {
            ft ftVar2 = this.i;
            if (ftVar2.c) {
                if (ftVar.j && ftVar2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == qj.b.MATCH_CONSTRAINT) {
                    qj qjVar5 = this.b;
                    if (qjVar5.l == 0 && !qjVar5.V()) {
                        int i4 = this.h.l.get(0).g;
                        ft ftVar3 = this.h;
                        int i5 = i4 + ftVar3.f;
                        int i6 = this.i.l.get(0).g + this.i.f;
                        ftVar3.d(i5);
                        this.i.d(i6);
                        this.e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == qj.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    int i7 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                    pt ptVar3 = this.e;
                    int i8 = ptVar3.m;
                    if (i7 < i8) {
                        ptVar3.d(i7);
                    } else {
                        ptVar3.d(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    ft ftVar4 = this.h.l.get(0);
                    ft ftVar5 = this.i.l.get(0);
                    int i9 = ftVar4.g + this.h.f;
                    int i10 = ftVar5.g + this.i.f;
                    float I = this.b.I();
                    if (ftVar4 == ftVar5) {
                        i9 = ftVar4.g;
                        i10 = ftVar5.g;
                        I = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * I)));
                    this.i.d(this.h.g + this.e.g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e3, code lost:
        if (r9.b.Q() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e5, code lost:
        r0 = r9.k;
        r1 = r9.h;
        r2 = r9.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x033e, code lost:
        if (r0.d == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0370, code lost:
        if (r9.b.Q() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03e7, code lost:
        if (r0.d == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03e9, code lost:
        r0.e.k.add(r9.e);
        r9.e.l.add(r9.b.e.e);
        r9.e.a = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    @Override // com.daaw.kx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ms1.d():void");
    }

    @Override // com.daaw.kx1
    public void e() {
        ft ftVar = this.h;
        if (ftVar.j) {
            this.b.D0(ftVar.g);
        }
    }

    @Override // com.daaw.kx1
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.daaw.kx1
    public boolean m() {
        return this.d != qj.b.MATCH_CONSTRAINT || this.b.m == 0;
    }

    public void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.p();
    }
}
