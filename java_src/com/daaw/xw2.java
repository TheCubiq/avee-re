package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class xw2 extends bx2 {

    /* renamed from: e */
    public final AtomicReference f33086e = new AtomicReference(new ww2());

    public xw2(cx2 cx2Var) {
    }

    /* renamed from: g */
    public static boolean m4421g(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: h */
    public static int m4420h(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    @Override // com.daaw.bx2
    /* renamed from: e */
    public final vw2[] mo4422e(hq2[] hq2VarArr, rw2[] rw2VarArr, int[][][] iArr) {
        mw2 mw2Var;
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int i = 2;
        vw2[] vw2VarArr = new vw2[2];
        ww2 ww2Var = (ww2) this.f33086e.get();
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
                    int i5 = ww2Var.f31605d;
                    int i6 = -1;
                    int i7 = 0;
                    mw2 mw2Var2 = null;
                    int i8 = 0;
                    int i9 = 0;
                    while (i7 < rw2Var.f25666a) {
                        mw2 m10858b = rw2Var.m10858b(i7);
                        int i10 = m10858b.f19186a;
                        ArrayList arrayList2 = new ArrayList(i4);
                        for (int i11 = 0; i11 <= 0; i11++) {
                            arrayList2.add(Integer.valueOf(i11));
                        }
                        int[] iArr4 = iArr3[i7];
                        int i12 = 0;
                        while (i12 <= 0) {
                            rw2 rw2Var2 = rw2Var;
                            if (m4421g(iArr4[i12], true)) {
                                zzatd m15741b = m10858b.m15741b(i12);
                                if (arrayList2.contains(Integer.valueOf(i12))) {
                                    int i13 = m15741b.f36798y;
                                    mw2Var = m10858b;
                                    z = true;
                                    z2 = true;
                                } else {
                                    mw2Var = m10858b;
                                    z = true;
                                    z2 = false;
                                }
                                arrayList = arrayList2;
                                int i14 = z != z2 ? 1 : 2;
                                iArr2 = iArr4;
                                boolean m4421g = m4421g(iArr4[i12], false);
                                if (m4421g) {
                                    i14 += 1000;
                                }
                                boolean z4 = i14 > i9;
                                if (i14 == i9) {
                                    int m4420h = m15741b.m1132a() != i6 ? m4420h(m15741b.m1132a(), i6) : m4420h(m15741b.f36790q, i3);
                                    z4 = !(m4421g && z2) ? m4420h >= 0 : m4420h <= 0;
                                }
                                if (z4) {
                                    i3 = m15741b.f36790q;
                                    i6 = m15741b.m1132a();
                                    i9 = i14;
                                    i8 = i12;
                                    mw2Var2 = mw2Var;
                                }
                            } else {
                                mw2Var = m10858b;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i12++;
                            rw2Var = rw2Var2;
                            m10858b = mw2Var;
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
                int i15 = rw2VarArr[i2].f25666a;
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
                String str = ww2Var.f31602a;
                int i17 = 0;
                int i18 = 0;
                int i19 = -1;
                int i20 = -1;
                while (i17 < rw2Var3.f25666a) {
                    mw2 m10858b2 = rw2Var3.m10858b(i17);
                    int[] iArr6 = iArr5[i17];
                    int i21 = i20;
                    int i22 = i19;
                    int i23 = i18;
                    int i24 = 0;
                    while (true) {
                        int i25 = m10858b2.f19186a;
                        if (i24 <= 0) {
                            if (m4421g(iArr6[i24], true)) {
                                zzatd m15741b2 = m10858b2.m15741b(i24);
                                int i26 = iArr6[i24];
                                int i27 = 1 != (m15741b2.f36785M & 1) ? 1 : 2;
                                if (m4421g(i26, false)) {
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
                yw2 yw2Var2 = i19 == -1 ? null : new yw2(rw2Var3.m10858b(i19), i20, 0, null);
                vw2VarArr[i16] = yw2Var2;
                z5 = yw2Var2 != null;
            }
            i16++;
            i = 2;
        }
        return vw2VarArr;
    }
}
