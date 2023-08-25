package com.daaw;
/* renamed from: com.daaw.cn */
/* loaded from: classes.dex */
public class C0970cn {
    /* renamed from: a */
    public static String m25231a(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(m25230b(str.charAt(i)));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static char m25230b(char c) {
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
                                                    case p21.f22304P0 /* 97 */:
                                                        return 'f';
                                                    case p21.f22310Q0 /* 98 */:
                                                        return '8';
                                                    case p21.f22316R0 /* 99 */:
                                                        return 'q';
                                                    case p21.f22322S0 /* 100 */:
                                                        return '6';
                                                    case p21.f22328T0 /* 101 */:
                                                        return '5';
                                                    case p21.f22334U0 /* 102 */:
                                                        return ',';
                                                    case p21.f22340V0 /* 103 */:
                                                        return '2';
                                                    case p21.f22346W0 /* 104 */:
                                                        return 'g';
                                                    case 'i':
                                                        return 'y';
                                                    case p21.f22352X0 /* 106 */:
                                                        return 'e';
                                                    case p21.f22358Y0 /* 107 */:
                                                        return 'x';
                                                    case p21.f22364Z0 /* 108 */:
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
                                                    case x21.f31769C0 /* 116 */:
                                                        return ';';
                                                    case x21.f31774D0 /* 117 */:
                                                        return '1';
                                                    case x21.f31779E0 /* 118 */:
                                                        return '0';
                                                    case x21.f31784F0 /* 119 */:
                                                        return 'u';
                                                    case x21.f31789G0 /* 120 */:
                                                        return 's';
                                                    case x21.f31794H0 /* 121 */:
                                                        return '7';
                                                    case x21.f31799I0 /* 122 */:
                                                        return 'v';
                                                    case x21.f31804J0 /* 123 */:
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

    /* renamed from: c */
    public static char m25229c(char c) {
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
                                                    case p21.f22304P0 /* 97 */:
                                                        return '6';
                                                    case p21.f22310Q0 /* 98 */:
                                                        return 'r';
                                                    case p21.f22316R0 /* 99 */:
                                                        return 'n';
                                                    case p21.f22322S0 /* 100 */:
                                                        return '8';
                                                    case p21.f22328T0 /* 101 */:
                                                        return 'j';
                                                    case p21.f22334U0 /* 102 */:
                                                        return 'a';
                                                    case p21.f22340V0 /* 103 */:
                                                        return 'h';
                                                    case p21.f22346W0 /* 104 */:
                                                        return '7';
                                                    case 'i':
                                                        return '=';
                                                    case p21.f22352X0 /* 106 */:
                                                        return '-';
                                                    case p21.f22358Y0 /* 107 */:
                                                        return 's';
                                                    case p21.f22364Z0 /* 108 */:
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
                                                    case x21.f31769C0 /* 116 */:
                                                        return '{';
                                                    case x21.f31774D0 /* 117 */:
                                                        return 'w';
                                                    case x21.f31779E0 /* 118 */:
                                                        return 'z';
                                                    case x21.f31784F0 /* 119 */:
                                                        return '4';
                                                    case x21.f31789G0 /* 120 */:
                                                        return 'k';
                                                    case x21.f31794H0 /* 121 */:
                                                        return 'i';
                                                    case x21.f31799I0 /* 122 */:
                                                        return ',';
                                                    case x21.f31804J0 /* 123 */:
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

    /* renamed from: d */
    public static boolean m25228d(String str) {
        if (str != null && str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (m25230b(charAt) != charAt) {
                    return charAt == m25229c('{');
                }
            }
        }
        return false;
    }
}
