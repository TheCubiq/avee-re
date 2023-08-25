package com.daaw;
/* loaded from: classes.dex */
public class bn {
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
}
