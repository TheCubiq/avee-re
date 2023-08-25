package com.daaw;

import com.daaw.ff;
/* loaded from: classes.dex */
public final class ta implements ff.b {
    public final int[] a;
    public final b81[] b;

    public ta(int[] iArr, b81[] b81VarArr) {
        this.a = iArr;
        this.b = b81VarArr;
    }

    @Override // com.daaw.ff.b
    public sm1 a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                return new ev();
            } else if (i2 == iArr[i3]) {
                return this.b[i3];
            } else {
                i3++;
            }
        }
    }

    public int[] b() {
        int[] iArr = new int[this.b.length];
        int i = 0;
        while (true) {
            b81[] b81VarArr = this.b;
            if (i >= b81VarArr.length) {
                return iArr;
            }
            if (b81VarArr[i] != null) {
                iArr[i] = b81VarArr[i].t();
            }
            i++;
        }
    }

    public void c(long j) {
        b81[] b81VarArr;
        for (b81 b81Var : this.b) {
            if (b81Var != null) {
                b81Var.G(j);
            }
        }
    }
}
