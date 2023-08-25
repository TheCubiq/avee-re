package com.daaw;
/* loaded from: classes2.dex */
public class uv0 {

    /* renamed from: e */
    public static final double[] f29556e = new double[128];

    /* renamed from: a */
    public final char[] f29557a;

    /* renamed from: b */
    public final int f29558b;

    /* renamed from: c */
    public char f29559c;

    /* renamed from: d */
    public int f29560d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = f29556e;
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
            this.f29557a = charArray;
            this.f29560d = i;
            this.f29558b = charArray.length;
            this.f29559c = charArray[i];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static float m7689b(int i, int i2) {
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
            double[] dArr = f29556e;
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

    /* renamed from: a */
    public void m7690a() {
        this.f29559c = m7685f();
    }

    /* renamed from: c */
    public int m7688c() {
        m7682i();
        int i = this.f29559c - '0';
        this.f29559c = m7685f();
        m7683h();
        return i;
    }

    /* renamed from: d */
    public float m7687d() {
        m7682i();
        float m7686e = m7686e();
        m7683h();
        return m7686e;
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
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float m7686e() {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        char c;
        char m7685f;
        char m7685f2;
        char c2 = this.f29559c;
        boolean z3 = true;
        int i4 = 0;
        if (c2 == '+') {
            z = true;
        } else if (c2 != '-') {
            z = true;
            switch (this.f29559c) {
                case '.':
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    z2 = false;
                    if (this.f29559c == '.') {
                        char m7685f3 = m7685f();
                        this.f29559c = m7685f3;
                        switch (m7685f3) {
                            case '0':
                                if (i == 0) {
                                    while (true) {
                                        char m7685f4 = m7685f();
                                        this.f29559c = m7685f4;
                                        i2--;
                                        switch (m7685f4) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                            default:
                                                if (!z2) {
                                                    return 0.0f;
                                                }
                                                break;
                                        }
                                    }
                                }
                                break;
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                while (true) {
                                    if (i < 9) {
                                        i++;
                                        i3 = (i3 * 10) + (this.f29559c - '0');
                                        i2--;
                                    }
                                    char m7685f5 = m7685f();
                                    this.f29559c = m7685f5;
                                    switch (m7685f5) {
                                    }
                                }
                                break;
                            default:
                                if (!z2) {
                                    m7684g(m7685f3);
                                    return 0.0f;
                                }
                                break;
                        }
                    }
                    c = this.f29559c;
                    if (c != 'E' || c == 'e') {
                        m7685f = m7685f();
                        this.f29559c = m7685f;
                        if (m7685f != '+') {
                            if (m7685f != '-') {
                                switch (m7685f) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        m7684g(m7685f);
                                        return 0.0f;
                                }
                                switch (this.f29559c) {
                                    case '0':
                                        while (true) {
                                            char m7685f6 = m7685f();
                                            this.f29559c = m7685f6;
                                            switch (m7685f6) {
                                            }
                                        }
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        int i5 = 0;
                                        while (true) {
                                            if (i4 < 3) {
                                                i4++;
                                                i5 = (i5 * 10) + (this.f29559c - '0');
                                            }
                                            char m7685f7 = m7685f();
                                            this.f29559c = m7685f7;
                                            switch (m7685f7) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    i4 = i5;
                                                    break;
                                            }
                                        }
                                }
                            } else {
                                z3 = false;
                            }
                        }
                        m7685f2 = m7685f();
                        this.f29559c = m7685f2;
                        switch (m7685f2) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            default:
                                m7684g(m7685f2);
                                return 0.0f;
                        }
                        switch (this.f29559c) {
                        }
                    }
                    if (!z3) {
                        i4 = -i4;
                    }
                    int i6 = i4 + i2;
                    if (!z) {
                        i3 = -i3;
                    }
                    return m7689b(i3, i6);
                case '/':
                default:
                    return Float.NaN;
                case '0':
                    while (true) {
                        char m7685f8 = m7685f();
                        this.f29559c = m7685f8;
                        if (m7685f8 != '.' && m7685f8 != 'E' && m7685f8 != 'e') {
                            switch (m7685f8) {
                                case '0':
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    return 0.0f;
                            }
                        }
                    }
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    z2 = true;
                    if (this.f29559c == '.') {
                    }
                    c = this.f29559c;
                    if (c != 'E') {
                    }
                    m7685f = m7685f();
                    this.f29559c = m7685f;
                    if (m7685f != '+') {
                    }
                    m7685f2 = m7685f();
                    this.f29559c = m7685f2;
                    switch (m7685f2) {
                    }
                    switch (this.f29559c) {
                    }
                    if (!z3) {
                    }
                    int i62 = i4 + i2;
                    if (!z) {
                    }
                    return m7689b(i3, i62);
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    while (true) {
                        if (i < 9) {
                            i++;
                            i3 = (i3 * 10) + (this.f29559c - '0');
                        } else {
                            i2++;
                        }
                        char m7685f9 = m7685f();
                        this.f29559c = m7685f9;
                        switch (m7685f9) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            default:
                                z2 = true;
                                if (this.f29559c == '.') {
                                }
                                c = this.f29559c;
                                if (c != 'E') {
                                }
                                m7685f = m7685f();
                                this.f29559c = m7685f;
                                if (m7685f != '+') {
                                }
                                m7685f2 = m7685f();
                                this.f29559c = m7685f2;
                                switch (m7685f2) {
                                }
                                switch (this.f29559c) {
                                }
                                if (!z3) {
                                }
                                int i622 = i4 + i2;
                                if (!z) {
                                }
                                return m7689b(i3, i622);
                        }
                    }
            }
        } else {
            z = false;
        }
        this.f29559c = m7685f();
        switch (this.f29559c) {
        }
    }

    /* renamed from: f */
    public final char m7685f() {
        int i = this.f29560d;
        int i2 = this.f29558b;
        if (i < i2) {
            this.f29560d = i + 1;
        }
        int i3 = this.f29560d;
        if (i3 == i2) {
            return (char) 0;
        }
        return this.f29557a[i3];
    }

    /* renamed from: g */
    public final void m7684g(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    /* renamed from: h */
    public void m7683h() {
        while (true) {
            int i = this.f29560d;
            if (i >= this.f29558b) {
                return;
            }
            char c = this.f29557a[i];
            if (c != '\t' && c != '\n' && c != ' ' && c != ',') {
                return;
            }
            m7690a();
        }
    }

    /* renamed from: i */
    public void m7682i() {
        while (true) {
            int i = this.f29560d;
            if (i >= this.f29558b || !Character.isWhitespace(this.f29557a[i])) {
                return;
            }
            m7690a();
        }
    }
}
