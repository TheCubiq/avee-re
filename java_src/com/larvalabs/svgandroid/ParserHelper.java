package com.larvalabs.svgandroid;
/* loaded from: classes2.dex */
public class ParserHelper {
    private static final double[] pow10 = new double[128];
    private char current;
    private final int n;
    public int pos;
    private final char[] s;

    public ParserHelper(String str, int i) {
        try {
            char[] charArray = str.toCharArray();
            this.s = charArray;
            this.pos = i;
            this.n = charArray.length;
            this.current = charArray[i];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private char read() {
        int i = this.pos;
        if (i < this.n) {
            this.pos = i + 1;
        }
        int i2 = this.pos;
        if (i2 == this.n) {
            return (char) 0;
        }
        return this.s[i2];
    }

    public void skipWhitespace() {
        while (true) {
            int i = this.pos;
            if (i >= this.n || !Character.isWhitespace(this.s[i])) {
                return;
            }
            advance();
        }
    }

    public void skipNumberSeparator() {
        while (true) {
            int i = this.pos;
            if (i >= this.n) {
                return;
            }
            char c = this.s[i];
            if (c != '\t' && c != '\n' && c != ' ' && c != ',') {
                return;
            }
            advance();
        }
    }

    public void advance() {
        this.current = read();
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
    */
    public float parseFloat() {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        char c;
        char read;
        char read2;
        char c2 = this.current;
        boolean z3 = true;
        int i4 = 0;
        if (c2 == '+') {
            z = true;
        } else if (c2 != '-') {
            z = true;
            switch (this.current) {
                case '.':
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    z2 = false;
                    if (this.current == '.') {
                        char read3 = read();
                        this.current = read3;
                        switch (read3) {
                            case '0':
                                if (i == 0) {
                                    while (true) {
                                        char read4 = read();
                                        this.current = read4;
                                        i2--;
                                        switch (read4) {
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
                                        i3 = (i3 * 10) + (this.current - '0');
                                        i2--;
                                    }
                                    char read5 = read();
                                    this.current = read5;
                                    switch (read5) {
                                    }
                                }
                                break;
                            default:
                                if (!z2) {
                                    reportUnexpectedCharacterError(read3);
                                    return 0.0f;
                                }
                                break;
                        }
                    }
                    c = this.current;
                    if (c != 'E' || c == 'e') {
                        read = read();
                        this.current = read;
                        if (read != '+') {
                            if (read != '-') {
                                switch (read) {
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
                                        reportUnexpectedCharacterError(read);
                                        return 0.0f;
                                }
                                switch (this.current) {
                                    case '0':
                                        while (true) {
                                            char read6 = read();
                                            this.current = read6;
                                            switch (read6) {
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
                                                i5 = (i5 * 10) + (this.current - '0');
                                            }
                                            char read7 = read();
                                            this.current = read7;
                                            switch (read7) {
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
                        read2 = read();
                        this.current = read2;
                        switch (read2) {
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
                                reportUnexpectedCharacterError(read2);
                                return 0.0f;
                        }
                        switch (this.current) {
                        }
                    }
                    if (!z3) {
                        i4 = -i4;
                    }
                    int i6 = i4 + i2;
                    if (!z) {
                        i3 = -i3;
                    }
                    return buildFloat(i3, i6);
                case '/':
                default:
                    return Float.NaN;
                case '0':
                    while (true) {
                        char read8 = read();
                        this.current = read8;
                        if (read8 != '.' && read8 != 'E' && read8 != 'e') {
                            switch (read8) {
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
                    if (this.current == '.') {
                    }
                    c = this.current;
                    if (c != 'E') {
                    }
                    read = read();
                    this.current = read;
                    if (read != '+') {
                    }
                    read2 = read();
                    this.current = read2;
                    switch (read2) {
                    }
                    switch (this.current) {
                    }
                    if (!z3) {
                    }
                    int i62 = i4 + i2;
                    if (!z) {
                    }
                    return buildFloat(i3, i62);
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
                            i3 = (i3 * 10) + (this.current - '0');
                        } else {
                            i2++;
                        }
                        char read9 = read();
                        this.current = read9;
                        switch (read9) {
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
                                if (this.current == '.') {
                                }
                                c = this.current;
                                if (c != 'E') {
                                }
                                read = read();
                                this.current = read;
                                if (read != '+') {
                                }
                                read2 = read();
                                this.current = read2;
                                switch (read2) {
                                }
                                switch (this.current) {
                                }
                                if (!z3) {
                                }
                                int i622 = i4 + i2;
                                if (!z) {
                                }
                                return buildFloat(i3, i622);
                        }
                    }
            }
        } else {
            z = false;
        }
        this.current = read();
        switch (this.current) {
        }
    }

    private void reportUnexpectedCharacterError(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    public static float buildFloat(int i, int i2) {
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
            double[] dArr = pow10;
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

    static {
        int i = 0;
        while (true) {
            double[] dArr = pow10;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(10.0d, i);
            i++;
        }
    }

    public float nextFloat() {
        skipWhitespace();
        float parseFloat = parseFloat();
        skipNumberSeparator();
        return parseFloat;
    }

    public int nextFlag() {
        skipWhitespace();
        int i = this.current - '0';
        this.current = read();
        skipNumberSeparator();
        return i;
    }
}
