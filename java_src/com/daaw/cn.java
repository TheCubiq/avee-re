package com.daaw;
/* loaded from: classes.dex */
public class cn {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(b(str.charAt(i)));
        }
        return sb.toString();
    }

    public static char b(char c) {
        if (c != '\'') {
            if (c != ';') {
                if (c != '=') {
                    if (c != '[') {
                        if (c != ']') {
                            if (c != '}') {
                                switch (c) {
                                    case ',':
                                        return 'z';
                                    case '-':
                                        return 'j';
                                    case '.':
                                        return '}';
                                    default:
                                        switch (c) {
                                            case '0':
                                                return '9';
                                            case '1':
                                                return '{';
                                            case '2':
                                                return 'r';
                                            case '3':
                                                return 'p';
                                            case '4':
                                                return 'w';
                                            case '5':
                                                return 'n';
                                            case '6':
                                                return 'a';
                                            case '7':
                                                return 'h';
                                            case '8':
                                                return 'd';
                                            case '9':
                                                return '=';
                                            default:
                                                switch (c) {
                                                    case p21.P0 /* 97 */:
                                                        return 'f';
                                                    case p21.Q0 /* 98 */:
                                                        return '8';
                                                    case p21.R0 /* 99 */:
                                                        return 'q';
                                                    case p21.S0 /* 100 */:
                                                        return '6';
                                                    case p21.T0 /* 101 */:
                                                        return '5';
                                                    case p21.U0 /* 102 */:
                                                        return ',';
                                                    case p21.V0 /* 103 */:
                                                        return '2';
                                                    case p21.W0 /* 104 */:
                                                        return 'g';
                                                    case 'i':
                                                        return 'y';
                                                    case p21.X0 /* 106 */:
                                                        return 'e';
                                                    case p21.Y0 /* 107 */:
                                                        return 'x';
                                                    case p21.Z0 /* 108 */:
                                                        return 'o';
                                                    case 'm':
                                                        return '3';
                                                    case 'n':
                                                        return 'c';
                                                    case 'o':
                                                        return 'm';
                                                    case 'p':
                                                        return ']';
                                                    case 'q':
                                                        return '[';
                                                    case 'r':
                                                        return 'b';
                                                    case 's':
                                                        return 'k';
                                                    case x21.C0 /* 116 */:
                                                        return ';';
                                                    case x21.D0 /* 117 */:
                                                        return '1';
                                                    case x21.E0 /* 118 */:
                                                        return '0';
                                                    case x21.F0 /* 119 */:
                                                        return 'u';
                                                    case x21.G0 /* 120 */:
                                                        return 's';
                                                    case x21.H0 /* 121 */:
                                                        return '7';
                                                    case x21.I0 /* 122 */:
                                                        return 'v';
                                                    case x21.J0 /* 123 */:
                                                        return 't';
                                                    default:
                                                        return c;
                                                }
                                        }
                                }
                            }
                            return '4';
                        }
                        return '.';
                    }
                    return '-';
                }
                return 'i';
            }
            return 'l';
        }
        return '\'';
    }

    public static char c(char c) {
        if (c != '\'') {
            if (c != ';') {
                if (c != '=') {
                    if (c != '[') {
                        if (c != ']') {
                            if (c != '}') {
                                switch (c) {
                                    case ',':
                                        return 'f';
                                    case '-':
                                        return '[';
                                    case '.':
                                        return ']';
                                    default:
                                        switch (c) {
                                            case '0':
                                                return 'v';
                                            case '1':
                                                return 'u';
                                            case '2':
                                                return 'g';
                                            case '3':
                                                return 'm';
                                            case '4':
                                                return '}';
                                            case '5':
                                                return 'e';
                                            case '6':
                                                return 'd';
                                            case '7':
                                                return 'y';
                                            case '8':
                                                return 'b';
                                            case '9':
                                                return '0';
                                            default:
                                                switch (c) {
                                                    case p21.P0 /* 97 */:
                                                        return '6';
                                                    case p21.Q0 /* 98 */:
                                                        return 'r';
                                                    case p21.R0 /* 99 */:
                                                        return 'n';
                                                    case p21.S0 /* 100 */:
                                                        return '8';
                                                    case p21.T0 /* 101 */:
                                                        return 'j';
                                                    case p21.U0 /* 102 */:
                                                        return 'a';
                                                    case p21.V0 /* 103 */:
                                                        return 'h';
                                                    case p21.W0 /* 104 */:
                                                        return '7';
                                                    case 'i':
                                                        return '=';
                                                    case p21.X0 /* 106 */:
                                                        return '-';
                                                    case p21.Y0 /* 107 */:
                                                        return 's';
                                                    case p21.Z0 /* 108 */:
                                                        return ';';
                                                    case 'm':
                                                        return 'o';
                                                    case 'n':
                                                        return '5';
                                                    case 'o':
                                                        return 'l';
                                                    case 'p':
                                                        return '3';
                                                    case 'q':
                                                        return 'c';
                                                    case 'r':
                                                        return '2';
                                                    case 's':
                                                        return 'x';
                                                    case x21.C0 /* 116 */:
                                                        return '{';
                                                    case x21.D0 /* 117 */:
                                                        return 'w';
                                                    case x21.E0 /* 118 */:
                                                        return 'z';
                                                    case x21.F0 /* 119 */:
                                                        return '4';
                                                    case x21.G0 /* 120 */:
                                                        return 'k';
                                                    case x21.H0 /* 121 */:
                                                        return 'i';
                                                    case x21.I0 /* 122 */:
                                                        return ',';
                                                    case x21.J0 /* 123 */:
                                                        return '1';
                                                    default:
                                                        return c;
                                                }
                                        }
                                }
                            }
                            return '.';
                        }
                        return 'p';
                    }
                    return 'q';
                }
                return '9';
            }
            return 't';
        }
        return '\'';
    }

    public static boolean d(String str) {
        if (str != null && str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (b(charAt) != charAt) {
                    return charAt == c('{');
                }
            }
        }
        return false;
    }
}
