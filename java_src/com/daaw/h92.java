package com.daaw;

import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class h92 extends ix8 {
    public static final ix8 v = new h92(null, new Object[0], 0);
    @CheckForNull
    public final transient Object s;
    public final transient Object[] t;
    public final transient int u;

    public h92(@CheckForNull Object obj, Object[] objArr, int i) {
        this.s = obj;
        this.t = objArr;
        this.u = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    public static h92 f(int i, Object[] objArr, bw8 bw8Var) {
        short[] sArr;
        Object[] objArr2;
        byte[] bArr;
        int i2 = i;
        Object[] objArr3 = objArr;
        if (i2 == 0) {
            return (h92) v;
        }
        Object obj = null;
        if (i2 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            rm8.a(obj2, obj3);
            return new h92(null, objArr3, 1);
        }
        jf8.b(i2, objArr3.length >> 1, "index");
        char c = 2;
        int max = Math.max(i2, 2);
        int i3 = 1073741824;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            i3 = highestOneBit + highestOneBit;
            while (true) {
                double d = i3;
                Double.isNaN(d);
                if (d * 0.7d >= max) {
                    break;
                }
                i3 += i3;
            }
        } else if (max >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i2 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            rm8.a(obj4, obj5);
        } else {
            int i4 = i3 - 1;
            char c2 = 65535;
            if (i3 <= 128) {
                byte[] bArr2 = new byte[i3];
                Arrays.fill(bArr2, (byte) -1);
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj6 = objArr3[i7];
                    obj6.getClass();
                    Object obj7 = objArr3[i7 ^ 1];
                    obj7.getClass();
                    rm8.a(obj6, obj7);
                    int a = po8.a(obj6.hashCode());
                    while (true) {
                        int i9 = a & i4;
                        int i10 = bArr2[i9] & 255;
                        if (i10 == 255) {
                            bArr2[i9] = (byte) i8;
                            if (i5 < i6) {
                                objArr3[i8] = obj6;
                                objArr3[i8 ^ 1] = obj7;
                            }
                            i5++;
                        } else if (obj6.equals(objArr3[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj8 = objArr3[i11];
                            obj8.getClass();
                            xu8 xu8Var = new xu8(obj6, obj7, obj8);
                            objArr3[i11] = obj7;
                            obj = xu8Var;
                            break;
                        } else {
                            a = i9 + 1;
                        }
                    }
                }
                if (i5 == i2) {
                    bArr = bArr2;
                    c = 2;
                    obj = bArr;
                } else {
                    sArr = new Object[]{bArr2, Integer.valueOf(i5), obj};
                }
            } else if (i3 <= 32768) {
                sArr = new short[i3];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i2; i13++) {
                    int i14 = i13 + i13;
                    int i15 = i12 + i12;
                    Object obj9 = objArr3[i14];
                    obj9.getClass();
                    Object obj10 = objArr3[i14 ^ 1];
                    obj10.getClass();
                    rm8.a(obj9, obj10);
                    int a2 = po8.a(obj9.hashCode());
                    while (true) {
                        int i16 = a2 & i4;
                        char c3 = (char) sArr[i16];
                        if (c3 == 65535) {
                            sArr[i16] = (short) i15;
                            if (i12 < i13) {
                                objArr3[i15] = obj9;
                                objArr3[i15 ^ 1] = obj10;
                            }
                            i12++;
                        } else if (obj9.equals(objArr3[c3])) {
                            int i17 = c3 ^ 1;
                            Object obj11 = objArr3[i17];
                            obj11.getClass();
                            xu8 xu8Var2 = new xu8(obj9, obj10, obj11);
                            objArr3[i17] = obj10;
                            obj = xu8Var2;
                            break;
                        } else {
                            a2 = i16 + 1;
                        }
                    }
                }
                if (i12 != i2) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i12), obj};
                    obj = objArr2;
                }
            } else {
                sArr = new int[i3];
                Arrays.fill((int[]) sArr, -1);
                int i18 = 0;
                int i19 = 0;
                while (i18 < i2) {
                    int i20 = i18 + i18;
                    int i21 = i19 + i19;
                    Object obj12 = objArr3[i20];
                    obj12.getClass();
                    Object obj13 = objArr3[i20 ^ 1];
                    obj13.getClass();
                    rm8.a(obj12, obj13);
                    int a3 = po8.a(obj12.hashCode());
                    while (true) {
                        int i22 = a3 & i4;
                        ?? r15 = sArr[i22];
                        if (r15 == c2) {
                            sArr[i22] = i21;
                            if (i19 < i18) {
                                objArr3[i21] = obj12;
                                objArr3[i21 ^ 1] = obj13;
                            }
                            i19++;
                        } else if (obj12.equals(objArr3[r15])) {
                            int i23 = r15 ^ 1;
                            Object obj14 = objArr3[i23];
                            obj14.getClass();
                            xu8 xu8Var3 = new xu8(obj12, obj13, obj14);
                            objArr3[i23] = obj13;
                            obj = xu8Var3;
                            break;
                        } else {
                            a3 = i22 + 1;
                            c2 = 65535;
                        }
                    }
                    i18++;
                    c2 = 65535;
                }
                if (i19 != i2) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i19), obj};
                    obj = objArr2;
                }
            }
            bArr = sArr;
            c = 2;
            obj = bArr;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            bw8Var.c = (xu8) objArr4[c];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i2 = intValue;
        }
        return new h92(obj15, objArr3, i2);
    }

    @Override // com.daaw.ix8
    public final aq8 a() {
        return new a82(this.t, 1, this.u);
    }

    @Override // com.daaw.ix8
    public final py8 c() {
        return new h62(this, this.t, 0, this.u);
    }

    @Override // com.daaw.ix8
    public final py8 d() {
        return new d72(this, new a82(this.t, 0, this.u));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.daaw.ix8, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.s
            java.lang.Object[] r1 = r9.t
            int r2 = r9.u
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.daaw.po8.a(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.daaw.po8.a(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.daaw.po8.a(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.h92.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.u;
    }
}
