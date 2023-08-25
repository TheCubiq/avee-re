package com.daaw;
/* loaded from: classes.dex */
public final class id1 implements mi1 {
    public final String p;
    public final Object[] q;

    public id1(String str) {
        this(str, null);
    }

    public id1(String str, Object[] objArr) {
        this.p = str;
        this.q = objArr;
    }

    public static void a(li1 li1Var, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            li1Var.F(i);
        } else if (obj instanceof byte[]) {
            li1Var.x(i, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = ((Float) obj).floatValue();
            } else if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        li1Var.i(i, (String) obj);
                        return;
                    } else if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    } else {
                        j = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j = byteValue;
                }
                li1Var.r(i, j);
                return;
            } else {
                doubleValue = ((Double) obj).doubleValue();
            }
            li1Var.m(i, doubleValue);
        }
    }

    public static void b(li1 li1Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            a(li1Var, i, obj);
        }
    }

    @Override // com.daaw.mi1
    public void d(li1 li1Var) {
        b(li1Var, this.q);
    }

    @Override // com.daaw.mi1
    public String n() {
        return this.p;
    }
}
