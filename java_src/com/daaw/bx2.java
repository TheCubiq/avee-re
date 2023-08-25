package com.daaw;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class bx2 extends fx2 {
    public final SparseArray b = new SparseArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public zw2 d;

    @Override // com.daaw.fx2
    public final gx2 a(hq2[] hq2VarArr, rw2 rw2Var) {
        int[] iArr;
        int[] iArr2 = new int[3];
        mw2[][] mw2VarArr = new mw2[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = rw2Var.a;
            mw2VarArr[i] = new mw2[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            hq2VarArr[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < rw2Var.a) {
            mw2 b = rw2Var.b(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                hq2 hq2Var = hq2VarArr[i6];
                int i9 = 0;
                while (true) {
                    int i10 = b.a;
                    if (i9 <= 0) {
                        int a = hq2Var.a(b.b(i9)) & 3;
                        if (a > i7) {
                            if (a == 3) {
                                break;
                            }
                            i8 = i6;
                            i7 = a;
                        }
                        i9++;
                    }
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i11 = b.a;
                iArr = new int[1];
            } else {
                hq2 hq2Var2 = hq2VarArr[i6];
                int i12 = b.a;
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = hq2Var2.a(b.b(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i6];
            mw2VarArr[i6][i14] = b;
            iArr3[i6][i14] = iArr;
            iArr2[i6] = i14 + 1;
            i5++;
            i3 = 2;
        }
        rw2[] rw2VarArr = new rw2[2];
        int[] iArr6 = new int[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            int i17 = iArr2[i15];
            rw2VarArr[i15] = new rw2((mw2[]) Arrays.copyOf(mw2VarArr[i15], i17));
            iArr3[i15] = (int[][]) Arrays.copyOf(iArr3[i15], i17);
            iArr6[i15] = hq2VarArr[i15].zzc();
            i15++;
        }
        rw2 rw2Var2 = new rw2((mw2[]) Arrays.copyOf(mw2VarArr[2], iArr2[2]));
        vw2[] e = e(hq2VarArr, rw2VarArr, iArr3);
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            if (this.c.get(i18)) {
                e[i18] = null;
            } else {
                rw2 rw2Var3 = rw2VarArr[i18];
                Map map = (Map) this.b.get(i18);
                if ((map == null ? null : (ax2) map.get(rw2Var3)) != null) {
                    throw null;
                }
            }
            i18++;
        }
        zw2 zw2Var = new zw2(iArr6, rw2VarArr, iArr4, iArr3, rw2Var2);
        iq2[] iq2VarArr = new iq2[2];
        for (int i20 = 0; i20 < 2; i20++) {
            iq2VarArr[i20] = e[i20] != null ? iq2.b : null;
        }
        return new gx2(rw2Var, new dx2(e, null), zw2Var, iq2VarArr);
    }

    @Override // com.daaw.fx2
    public final void b(Object obj) {
        this.d = (zw2) obj;
    }

    public abstract vw2[] e(hq2[] hq2VarArr, rw2[] rw2VarArr, int[][][] iArr);

    public final void f(int i, boolean z) {
        if (this.c.get(i) == z) {
            return;
        }
        this.c.put(i, z);
        d();
    }
}
