package com.daaw;

import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class h92 extends ix8 {

    /* renamed from: v */
    public static final ix8 f12205v = new h92(null, new Object[0], 0);
    @CheckForNull

    /* renamed from: s */
    public final transient Object f12206s;

    /* renamed from: t */
    public final transient Object[] f12207t;

    /* renamed from: u */
    public final transient int f12208u;

    public h92(@CheckForNull Object obj, Object[] objArr, int i) {
        this.f12206s = obj;
        this.f12207t = objArr;
        this.f12208u = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* renamed from: f */
    public static h92 m20927f(int i, Object[] objArr, bw8 bw8Var) {
        short[] sArr;
        Object[] objArr2;
        byte[] bArr;
        int i2 = i;
        Object[] objArr3 = objArr;
        if (i2 == 0) {
            return (h92) f12205v;
        }
        Object obj = null;
        if (i2 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            rm8.m11174a(obj2, obj3);
            return new h92(null, objArr3, 1);
        }
        jf8.m18535b(i2, objArr3.length >> 1, "index");
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
            rm8.m11174a(obj4, obj5);
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
                    rm8.m11174a(obj6, obj7);
                    int m13250a = po8.m13250a(obj6.hashCode());
                    while (true) {
                        int i9 = m13250a & i4;
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
                            m13250a = i9 + 1;
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
                    rm8.m11174a(obj9, obj10);
                    int m13250a2 = po8.m13250a(obj9.hashCode());
                    while (true) {
                        int i16 = m13250a2 & i4;
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
                            m13250a2 = i16 + 1;
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
                    rm8.m11174a(obj12, obj13);
                    int m13250a3 = po8.m13250a(obj12.hashCode());
                    while (true) {
                        int i22 = m13250a3 & i4;
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
                            m13250a3 = i22 + 1;
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
            bw8Var.f5239c = (xu8) objArr4[c];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i2 = intValue;
        }
        return new h92(obj15, objArr3, i2);
    }

    @Override // com.daaw.ix8
    /* renamed from: a */
    public final aq8 mo19267a() {
        return new a82(this.f12207t, 1, this.f12208u);
    }

    @Override // com.daaw.ix8
    /* renamed from: c */
    public final py8 mo19265c() {
        return new h62(this, this.f12207t, 0, this.f12208u);
    }

    @Override // com.daaw.ix8
    /* renamed from: d */
    public final py8 mo19264d() {
        return new d72(this, new a82(this.f12207t, 0, this.f12208u));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.daaw.ix8, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.f12206s;
        Object[] objArr = this.f12207t;
        int i = this.f12208u;
        if (obj != null) {
            if (i == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int m13250a = po8.m13250a(obj.hashCode());
                    while (true) {
                        int i2 = m13250a & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        } else if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                            break;
                        } else {
                            m13250a = i2 + 1;
                        }
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int m13250a2 = po8.m13250a(obj.hashCode());
                    while (true) {
                        int i4 = m13250a2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        } else if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                            break;
                        } else {
                            m13250a2 = i4 + 1;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int m13250a3 = po8.m13250a(obj.hashCode());
                    while (true) {
                        int i5 = m13250a3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        } else if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                            break;
                        } else {
                            m13250a3 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12208u;
    }
}
