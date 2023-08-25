package com.daaw;

import com.daaw.C1275ff;
/* renamed from: com.daaw.ta */
/* loaded from: classes.dex */
public final class C3029ta implements C1275ff.InterfaceC1277b {

    /* renamed from: a */
    public final int[] f27147a;

    /* renamed from: b */
    public final b81[] f27148b;

    public C3029ta(int[] iArr, b81[] b81VarArr) {
        this.f27147a = iArr;
        this.f27148b = b81VarArr;
    }

    @Override // com.daaw.C1275ff.InterfaceC1277b
    /* renamed from: a */
    public sm1 mo9419a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f27147a;
            if (i3 >= iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                return new C1220ev();
            } else if (i2 == iArr[i3]) {
                return this.f27148b[i3];
            } else {
                i3++;
            }
        }
    }

    /* renamed from: b */
    public int[] m9418b() {
        int[] iArr = new int[this.f27148b.length];
        int i = 0;
        while (true) {
            b81[] b81VarArr = this.f27148b;
            if (i >= b81VarArr.length) {
                return iArr;
            }
            if (b81VarArr[i] != null) {
                iArr[i] = b81VarArr[i].m26338t();
            }
            i++;
        }
    }

    /* renamed from: c */
    public void m9417c(long j) {
        b81[] b81VarArr;
        for (b81 b81Var : this.f27148b) {
            if (b81Var != null) {
                b81Var.m26357G(j);
            }
        }
    }
}
