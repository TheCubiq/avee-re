package com.daaw;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class bx2 extends fx2 {

    /* renamed from: b */
    public final SparseArray f5254b = new SparseArray();

    /* renamed from: c */
    public final SparseBooleanArray f5255c = new SparseBooleanArray();

    /* renamed from: d */
    public zw2 f5256d;

    @Override // com.daaw.fx2
    /* renamed from: a */
    public final gx2 mo22150a(hq2[] hq2VarArr, rw2 rw2Var) {
        int[] iArr;
        int[] iArr2 = new int[3];
        mw2[][] mw2VarArr = new mw2[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = rw2Var.f25666a;
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
        while (i5 < rw2Var.f25666a) {
            mw2 m10858b = rw2Var.m10858b(i5);
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
                    int i10 = m10858b.f19186a;
                    if (i9 <= 0) {
                        int mo12211a = hq2Var.mo12211a(m10858b.m15741b(i9)) & 3;
                        if (mo12211a > i7) {
                            if (mo12211a == 3) {
                                break;
                            }
                            i8 = i6;
                            i7 = mo12211a;
                        }
                        i9++;
                    }
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i11 = m10858b.f19186a;
                iArr = new int[1];
            } else {
                hq2 hq2Var2 = hq2VarArr[i6];
                int i12 = m10858b.f19186a;
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = hq2Var2.mo12211a(m10858b.m15741b(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i6];
            mw2VarArr[i6][i14] = m10858b;
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
        vw2[] mo4422e = mo4422e(hq2VarArr, rw2VarArr, iArr3);
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            if (this.f5255c.get(i18)) {
                mo4422e[i18] = null;
            } else {
                rw2 rw2Var3 = rw2VarArr[i18];
                Map map = (Map) this.f5254b.get(i18);
                if ((map == null ? null : (ax2) map.get(rw2Var3)) != null) {
                    throw null;
                }
            }
            i18++;
        }
        zw2 zw2Var = new zw2(iArr6, rw2VarArr, iArr4, iArr3, rw2Var2);
        iq2[] iq2VarArr = new iq2[2];
        for (int i20 = 0; i20 < 2; i20++) {
            iq2VarArr[i20] = mo4422e[i20] != null ? iq2.f13923b : null;
        }
        return new gx2(rw2Var, new dx2(mo4422e, null), zw2Var, iq2VarArr);
    }

    @Override // com.daaw.fx2
    /* renamed from: b */
    public final void mo22149b(Object obj) {
        this.f5256d = (zw2) obj;
    }

    /* renamed from: e */
    public abstract vw2[] mo4422e(hq2[] hq2VarArr, rw2[] rw2VarArr, int[][][] iArr);

    /* renamed from: f */
    public final void m25764f(int i, boolean z) {
        if (this.f5255c.get(i) == z) {
            return;
        }
        this.f5255c.put(i, z);
        m22147d();
    }
}
