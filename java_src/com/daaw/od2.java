package com.daaw;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class od2 implements gd2 {

    /* renamed from: a */
    public final cj5 f21289a = new cj5(new byte[5], 5);

    /* renamed from: b */
    public final SparseArray f21290b = new SparseArray();

    /* renamed from: c */
    public final SparseIntArray f21291c = new SparseIntArray();

    /* renamed from: d */
    public final int f21292d;

    /* renamed from: e */
    public final /* synthetic */ pd2 f21293e;

    public od2(pd2 pd2Var, int i) {
        this.f21293e = pd2Var;
        this.f21292d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
        if (r29.m19703s() == 21) goto L30;
     */
    @Override // com.daaw.gd2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo12624a(ik5 ik5Var) {
        List list;
        SparseArray sparseArray;
        int i;
        m09 m09Var;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        cr5 cr5Var;
        int i2;
        m09 m09Var2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        sd2 sd2Var;
        cr5 cr5Var2;
        int i3;
        if (ik5Var.m19703s() != 2) {
            return;
        }
        list = this.f21293e.f22849a;
        cr5 cr5Var3 = (cr5) list.get(0);
        if ((ik5Var.m19703s() & 128) == 0) {
            return;
        }
        ik5Var.m19715g(1);
        int m19699w = ik5Var.m19699w();
        int i4 = 3;
        ik5Var.m19715g(3);
        ik5Var.m19721a(this.f21289a, 2);
        this.f21289a.m25322j(3);
        int i5 = 13;
        this.f21293e.f22864p = this.f21289a.m25329c(13);
        ik5Var.m19721a(this.f21289a, 2);
        int i6 = 4;
        this.f21289a.m25322j(4);
        int i7 = 12;
        ik5Var.m19715g(this.f21289a.m25329c(12));
        this.f21290b.clear();
        this.f21291c.clear();
        int m19713i = ik5Var.m19713i();
        while (m19713i > 0) {
            int i8 = 5;
            ik5Var.m19721a(this.f21289a, 5);
            int m25329c = this.f21289a.m25329c(8);
            this.f21289a.m25322j(i4);
            int m25329c2 = this.f21289a.m25329c(i5);
            this.f21289a.m25322j(i6);
            int m25329c3 = this.f21289a.m25329c(i7);
            int m19711k = ik5Var.m19711k();
            int i9 = m19711k + m25329c3;
            String str = null;
            ArrayList arrayList = null;
            int i10 = -1;
            while (ik5Var.m19711k() < i9) {
                int m19703s = ik5Var.m19703s();
                int m19711k2 = ik5Var.m19711k() + ik5Var.m19703s();
                if (m19711k2 > i9) {
                    break;
                }
                if (m19703s == i8) {
                    long m19729A = ik5Var.m19729A();
                    if (m19729A == 1094921523) {
                        i10 = 129;
                    } else if (m19729A == 1161904947) {
                        i10 = 135;
                    } else {
                        if (m19729A != 1094921524) {
                            if (m19729A == 1212503619) {
                                i10 = 36;
                            }
                        }
                        i10 = 172;
                    }
                    cr5Var2 = cr5Var3;
                    i3 = m19699w;
                } else if (m19703s == 106) {
                    cr5Var2 = cr5Var3;
                    i3 = m19699w;
                    i10 = 129;
                } else if (m19703s == 122) {
                    cr5Var2 = cr5Var3;
                    i3 = m19699w;
                    i10 = 135;
                } else if (m19703s != 127) {
                    if (m19703s == 123) {
                        cr5Var2 = cr5Var3;
                        i3 = m19699w;
                        i10 = 138;
                    } else if (m19703s == 10) {
                        cr5Var2 = cr5Var3;
                        str = ik5Var.m19724F(3, cy6.f6275c).trim();
                        i3 = m19699w;
                    } else {
                        int i11 = 3;
                        if (m19703s == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (ik5Var.m19711k() < m19711k2) {
                                String trim = ik5Var.m19724F(i11, cy6.f6275c).trim();
                                int m19703s2 = ik5Var.m19703s();
                                cr5 cr5Var4 = cr5Var3;
                                byte[] bArr = new byte[4];
                                ik5Var.m19720b(bArr, 0, 4);
                                arrayList2.add(new qd2(trim, m19703s2, bArr));
                                cr5Var3 = cr5Var4;
                                m19699w = m19699w;
                                i11 = 3;
                            }
                            cr5Var2 = cr5Var3;
                            i3 = m19699w;
                            arrayList = arrayList2;
                            i10 = 89;
                        } else {
                            cr5Var2 = cr5Var3;
                            i3 = m19699w;
                            if (m19703s == 111) {
                                i10 = 257;
                            }
                        }
                        ik5Var.m19715g(m19711k2 - ik5Var.m19711k());
                        cr5Var3 = cr5Var2;
                        m19699w = i3;
                        i8 = 5;
                    }
                }
                ik5Var.m19715g(m19711k2 - ik5Var.m19711k());
                cr5Var3 = cr5Var2;
                m19699w = i3;
                i8 = 5;
            }
            cr5 cr5Var5 = cr5Var3;
            int i12 = m19699w;
            ik5Var.m19716f(i9);
            rd2 rd2Var = new rd2(i10, str, arrayList, Arrays.copyOfRange(ik5Var.m19714h(), m19711k, i9));
            if (m25329c == 6 || m25329c == 5) {
                m25329c = rd2Var.f25163a;
            }
            m19713i -= m25329c3 + 5;
            sparseBooleanArray3 = this.f21293e.f22854f;
            if (!sparseBooleanArray3.get(m25329c2)) {
                sd2Var = this.f21293e.f22852d;
                ud2 mo5311a = sd2Var.mo5311a(m25329c, rd2Var);
                this.f21291c.put(m25329c2, m25329c2);
                this.f21290b.put(m25329c2, mo5311a);
            }
            cr5Var3 = cr5Var5;
            m19699w = i12;
            i4 = 3;
            i6 = 4;
            i7 = 12;
            i5 = 13;
        }
        cr5 cr5Var6 = cr5Var3;
        int i13 = m19699w;
        int size = this.f21291c.size();
        int i14 = 0;
        while (i14 < size) {
            int keyAt = this.f21291c.keyAt(i14);
            int valueAt = this.f21291c.valueAt(i14);
            sparseBooleanArray = this.f21293e.f22854f;
            sparseBooleanArray.put(keyAt, true);
            sparseBooleanArray2 = this.f21293e.f22855g;
            sparseBooleanArray2.put(valueAt, true);
            ud2 ud2Var = (ud2) this.f21290b.valueAt(i14);
            if (ud2Var != null) {
                m09Var2 = this.f21293e.f22858j;
                i2 = i13;
                td2 td2Var = new td2(i2, keyAt, 8192);
                cr5Var = cr5Var6;
                ud2Var.mo8316b(cr5Var, m09Var2, td2Var);
                sparseArray2 = this.f21293e.f22853e;
                sparseArray2.put(valueAt, ud2Var);
            } else {
                cr5Var = cr5Var6;
                i2 = i13;
            }
            i14++;
            cr5Var6 = cr5Var;
            i13 = i2;
        }
        sparseArray = this.f21293e.f22853e;
        sparseArray.remove(this.f21292d);
        this.f21293e.f22859k = 0;
        pd2 pd2Var = this.f21293e;
        i = pd2Var.f22859k;
        if (i == 0) {
            m09Var = pd2Var.f22858j;
            m09Var.zzC();
            this.f21293e.f22860l = true;
        }
    }

    @Override // com.daaw.gd2
    /* renamed from: b */
    public final void mo12623b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
    }
}
