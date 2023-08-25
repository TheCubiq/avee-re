package com.daaw;
/* loaded from: classes.dex */
public final class id1 implements mi1 {

    /* renamed from: p */
    public final String f13513p;

    /* renamed from: q */
    public final Object[] f13514q;

    public id1(String str) {
        this(str, null);
    }

    public id1(String str, Object[] objArr) {
        this.f13513p = str;
        this.f13514q = objArr;
    }

    /* renamed from: a */
    public static void m19917a(li1 li1Var, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            li1Var.mo16232F(i);
        } else if (obj instanceof byte[]) {
            li1Var.mo16228x(i, (byte[]) obj);
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
                        li1Var.mo16231i(i, (String) obj);
                        return;
                    } else if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    } else {
                        j = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j = byteValue;
                }
                li1Var.mo16229r(i, j);
                return;
            } else {
                doubleValue = ((Double) obj).doubleValue();
            }
            li1Var.mo16230m(i, doubleValue);
        }
    }

    /* renamed from: b */
    public static void m19916b(li1 li1Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            m19917a(li1Var, i, obj);
        }
    }

    @Override // com.daaw.mi1
    /* renamed from: d */
    public void mo16024d(li1 li1Var) {
        m19916b(li1Var, this.f13514q);
    }

    @Override // com.daaw.mi1
    /* renamed from: n */
    public String mo16023n() {
        return this.f13513p;
    }
}
