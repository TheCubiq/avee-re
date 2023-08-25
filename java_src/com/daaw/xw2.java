package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class xw2 extends bx2 {
    public final AtomicReference e = new AtomicReference(new ww2());

    public xw2(cx2 cx2Var) {
    }

    public static boolean g(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    public static int h(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    @Override // com.daaw.bx2
    public final vw2[] e(hq2[] hq2VarArr, rw2[] rw2VarArr, int[][][] iArr) {
        mw2 mw2Var;
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int i = 2;
        vw2[] vw2VarArr = new vw2[2];
        ww2 ww2Var = (ww2) this.e.get();
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            int i3 = -1;
            int i4 = 1;
            if (i2 >= i) {
                break;
            }
            if (hq2VarArr[i2].zzc() == i) {
                if (!z3) {
                    hq2 hq2Var = hq2VarArr[i2];
                    rw2 rw2Var = rw2VarArr[i2];
                    int[][] iArr3 = iArr[i2];
                    int i5 = ww2Var.d;
                    int i6 = -1;
                    int i7 = 0;
                    mw2 mw2Var2 = null;
                    int i8 = 0;
                    int i9 = 0;
                    while (i7 < rw2Var.a) {
                        mw2 b = rw2Var.b(i7);
                        int i10 = b.a;
                        ArrayList arrayList2 = new ArrayList(i4);
                        for (int i11 = 0; i11 <= 0; i11++) {
                            arrayList2.add(Integer.valueOf(i11));
                        }
                        int[] iArr4 = iArr3[i7];
                        int i12 = 0;
                        while (i12 <= 0) {
                            rw2 rw2Var2 = rw2Var;
                            if (g(iArr4[i12], true)) {
                                zzatd b2 = b.b(i12);
                                if (arrayList2.contains(Integer.valueOf(i12))) {
                                    int i13 = b2.y;
                                    mw2Var = b;
                                    z = true;
                                    z2 = true;
                                } else {
                                    mw2Var = b;
                                    z = true;
                                    z2 = false;
                                }
                                arrayList = arrayList2;
                                int i14 = z != z2 ? 1 : 2;
                                iArr2 = iArr4;
                                boolean g = g(iArr4[i12], false);
                                if (g) {
                                    i14 += 1000;
                                }
                                boolean z4 = i14 > i9;
                                if (i14 == i9) {
                                    int h = b2.a() != i6 ? h(b2.a(), i6) : h(b2.q, i3);
                                    z4 = !(g && z2) ? h >= 0 : h <= 0;
                                }
                                if (z4) {
                                    i3 = b2.q;
                                    i6 = b2.a();
                                    i9 = i14;
                                    i8 = i12;
                                    mw2Var2 = mw2Var;
                                }
                            } else {
                                mw2Var = b;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i12++;
                            rw2Var = rw2Var2;
                            b = mw2Var;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i7++;
                        i4 = 1;
                    }
                    yw2 yw2Var = mw2Var2 == null ? null : new yw2(mw2Var2, i8, 0, null);
                    vw2VarArr[i2] = yw2Var;
                    z3 = yw2Var != null;
                }
                int i15 = rw2VarArr[i2].a;
            }
            i2++;
            i = 2;
        }
        int i16 = 0;
        boolean z5 = false;
        while (i16 < i) {
            if (hq2VarArr[i16].zzc() == 1 && !z5) {
                rw2 rw2Var3 = rw2VarArr[i16];
                int[][] iArr5 = iArr[i16];
                String str = ww2Var.a;
                int i17 = 0;
                int i18 = 0;
                int i19 = -1;
                int i20 = -1;
                while (i17 < rw2Var3.a) {
                    mw2 b3 = rw2Var3.b(i17);
                    int[] iArr6 = iArr5[i17];
                    int i21 = i20;
                    int i22 = i19;
                    int i23 = i18;
                    int i24 = 0;
                    while (true) {
                        int i25 = b3.a;
                        if (i24 <= 0) {
                            if (g(iArr6[i24], true)) {
                                zzatd b4 = b3.b(i24);
                                int i26 = iArr6[i24];
                                int i27 = 1 != (b4.M & 1) ? 1 : 2;
                                if (g(i26, false)) {
                                    i27 += 1000;
                                }
                                if (i27 > i23) {
                                    i22 = i17;
                                    i21 = i24;
                                    i23 = i27;
                                }
                            }
                            i24++;
                        }
                    }
                    i17++;
                    i18 = i23;
                    i19 = i22;
                    i20 = i21;
                }
                yw2 yw2Var2 = i19 == -1 ? null : new yw2(rw2Var3.b(i19), i20, 0, null);
                vw2VarArr[i16] = yw2Var2;
                z5 = yw2Var2 != null;
            }
            i16++;
            i = 2;
        }
        return vw2VarArr;
    }
}
