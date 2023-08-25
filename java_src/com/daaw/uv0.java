package com.daaw;
/* loaded from: classes2.dex */
public class uv0 {
    public static final double[] e = new double[128];
    public final char[] a;
    public final int b;
    public char c;
    public int d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = e;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(10.0d, i);
            i++;
        }
    }

    public uv0(String str, int i) {
        try {
            char[] charArray = str.toCharArray();
            this.a = charArray;
            this.d = i;
            this.b = charArray.length;
            this.c = charArray[i];
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static float b(int i, int i2) {
        double d;
        if (i2 < -125 || i == 0) {
            return 0.0f;
        }
        if (i2 >= 128) {
            return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        } else if (i2 == 0) {
            return i;
        } else {
            if (i >= 67108864) {
                i++;
            }
            double d2 = i;
            double[] dArr = e;
            if (i2 > 0) {
                double d3 = dArr[i2];
                Double.isNaN(d2);
                d = d2 * d3;
            } else {
                double d4 = dArr[-i2];
                Double.isNaN(d2);
                d = d2 / d4;
            }
            return (float) d;
        }
    }

    public void a() {
        this.c = f();
    }

    public int c() {
        i();
        int i = this.c - '0';
        this.c = f();
        h();
        return i;
    }

    public float d() {
        i();
        float e2 = e();
        h();
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[LOOP:0: B:13:0x0028->B:17:0x0034, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1 A[LOOP:3: B:63:0x00c1->B:64:0x00c7, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float e() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.uv0.e():float");
    }

    public final char f() {
        int i = this.d;
        int i2 = this.b;
        if (i < i2) {
            this.d = i + 1;
        }
        int i3 = this.d;
        if (i3 == i2) {
            return (char) 0;
        }
        return this.a[i3];
    }

    public final void g(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    public void h() {
        while (true) {
            int i = this.d;
            if (i >= this.b) {
                return;
            }
            char c = this.a[i];
            if (c != '\t' && c != '\n' && c != ' ' && c != ',') {
                return;
            }
            a();
        }
    }

    public void i() {
        while (true) {
            int i = this.d;
            if (i >= this.b || !Character.isWhitespace(this.a[i])) {
                return;
            }
            a();
        }
    }
}
