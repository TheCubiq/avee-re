package com.daaw;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class wv8 extends zv8 {
    public vv8 c;

    @Override // com.daaw.zv8
    public final fw8 d(l98[] l98VarArr, au8 au8Var, pr8 pr8Var, l64 l64Var) {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        r84[][] r84VarArr = new r84[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = au8Var.a;
            r84VarArr[i] = new r84[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = l98VarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < au8Var.a) {
            r84 b = au8Var.b(i5);
            int i6 = b.c;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                l98 l98Var = l98VarArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, l98Var.c(b.b(i11)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[1];
            } else {
                l98 l98Var2 = l98VarArr[i8];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = l98Var2.c(b.b(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            r84VarArr[i8][i13] = b;
            iArr3[i8][i13] = iArr;
            iArr2[i8] = i13 + 1;
            i5++;
            i3 = 2;
        }
        au8[] au8VarArr = new au8[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            au8VarArr[i14] = new au8((r84[]) it5.F(r84VarArr[i14], i15));
            iArr3[i14] = (int[][]) it5.F(iArr3[i14], i15);
            strArr[i14] = l98VarArr[i14].a();
            iArr6[i14] = l98VarArr[i14].zzb();
            i14++;
            i3 = 2;
        }
        vv8 vv8Var = new vv8(strArr, iArr6, au8VarArr, iArr4, iArr3, new au8((r84[]) it5.F(r84VarArr[2], iArr2[2])));
        Pair i16 = i(vv8Var, iArr3, iArr4, pr8Var, l64Var);
        xv8[] xv8VarArr = (xv8[]) i16.second;
        List[] listArr = new List[xv8VarArr.length];
        for (int i17 = 0; i17 < xv8VarArr.length; i17++) {
            xv8 xv8Var = xv8VarArr[i17];
            listArr[i17] = xv8Var != null ? y17.v(xv8Var) : y17.u();
        }
        v17 v17Var = new v17();
        for (int i18 = 0; i18 < 2; i18++) {
            au8 d = vv8Var.d(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < d.a; i19++) {
                r84 b2 = d.b(i19);
                boolean z4 = vv8Var.a(i18, i19, false) != 0;
                int i20 = b2.a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr7[i21] = vv8Var.b(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        xv8 xv8Var2 = (xv8) list.get(i22);
                        if (xv8Var2.zze().equals(b2) && xv8Var2.zzb(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                v17Var.f(new kh4(b2, z4, iArr7, zArr));
            }
        }
        au8 e = vv8Var.e();
        for (int i23 = 0; i23 < e.a; i23++) {
            r84 b3 = e.b(i23);
            int i24 = b3.a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            v17Var.f(new kh4(b3, false, iArr8, new boolean[1]));
        }
        return new fw8((x98[]) i16.first, (tv8[]) i16.second, new ni4(v17Var.h()), vv8Var);
    }

    @Override // com.daaw.zv8
    public final void e(Object obj) {
        this.c = (vv8) obj;
    }

    public abstract Pair i(vv8 vv8Var, int[][][] iArr, int[] iArr2, pr8 pr8Var, l64 l64Var);
}
