package com.daaw;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class wv8 extends zv8 {

    /* renamed from: c */
    public vv8 f31592c;

    @Override // com.daaw.zv8
    /* renamed from: d */
    public final fw8 mo1832d(l98[] l98VarArr, au8 au8Var, pr8 pr8Var, l64 l64Var) {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        r84[][] r84VarArr = new r84[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = au8Var.f3668a;
            r84VarArr[i] = new r84[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = l98VarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < au8Var.f3668a) {
            r84 m26965b = au8Var.m26965b(i5);
            int i6 = m26965b.f24962c;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                l98 l98Var = l98VarArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, l98Var.mo17079c(m26965b.m11590b(i11)) & 7);
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
                    iArr5[i12] = l98Var2.mo17079c(m26965b.m11590b(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            r84VarArr[i8][i13] = m26965b;
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
            au8VarArr[i14] = new au8((r84[]) it5.m19426F(r84VarArr[i14], i15));
            iArr3[i14] = (int[][]) it5.m19426F(iArr3[i14], i15);
            strArr[i14] = l98VarArr[i14].mo9751a();
            iArr6[i14] = l98VarArr[i14].zzb();
            i14++;
            i3 = 2;
        }
        vv8 vv8Var = new vv8(strArr, iArr6, au8VarArr, iArr4, iArr3, new au8((r84[]) it5.m19426F(r84VarArr[2], iArr2[2])));
        Pair mo5757i = mo5757i(vv8Var, iArr3, iArr4, pr8Var, l64Var);
        xv8[] xv8VarArr = (xv8[]) mo5757i.second;
        List[] listArr = new List[xv8VarArr.length];
        for (int i16 = 0; i16 < xv8VarArr.length; i16++) {
            xv8 xv8Var = xv8VarArr[i16];
            listArr[i16] = xv8Var != null ? y17.m4259v(xv8Var) : y17.m4260u();
        }
        v17 v17Var = new v17();
        for (int i17 = 0; i17 < 2; i17++) {
            au8 m6707d = vv8Var.m6707d(i17);
            List list = listArr[i17];
            for (int i18 = 0; i18 < m6707d.f3668a; i18++) {
                r84 m26965b2 = m6707d.m26965b(i18);
                boolean z4 = vv8Var.m6710a(i17, i18, false) != 0;
                int i19 = m26965b2.f24960a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i20 = 0; i20 <= 0; i20++) {
                    iArr7[i20] = vv8Var.m6709b(i17, i18, i20) & 7;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            z = false;
                            break;
                        }
                        xv8 xv8Var2 = (xv8) list.get(i21);
                        if (xv8Var2.zze().equals(m26965b2) && xv8Var2.zzb(i20) != -1) {
                            z = true;
                            break;
                        }
                        i21++;
                    }
                    zArr[i20] = z;
                }
                v17Var.m7548f(new kh4(m26965b2, z4, iArr7, zArr));
            }
        }
        au8 m6706e = vv8Var.m6706e();
        for (int i22 = 0; i22 < m6706e.f3668a; i22++) {
            r84 m26965b3 = m6706e.m26965b(i22);
            int i23 = m26965b3.f24960a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            v17Var.m7548f(new kh4(m26965b3, false, iArr8, new boolean[1]));
        }
        return new fw8((x98[]) mo5757i.first, (tv8[]) mo5757i.second, new ni4(v17Var.m7546h()), vv8Var);
    }

    @Override // com.daaw.zv8
    /* renamed from: e */
    public final void mo1831e(Object obj) {
        this.f31592c = (vv8) obj;
    }

    /* renamed from: i */
    public abstract Pair mo5757i(vv8 vv8Var, int[][][] iArr, int[] iArr2, pr8 pr8Var, l64 l64Var);
}
