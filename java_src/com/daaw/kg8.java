package com.daaw;
/* loaded from: classes2.dex */
public final class kg8 {
    public static String a(y68 y68Var) {
        String str;
        StringBuilder sb = new StringBuilder(y68Var.f());
        for (int i = 0; i < y68Var.f(); i++) {
            int d = y68Var.d(i);
            if (d == 34) {
                str = "\\\"";
            } else if (d == 39) {
                str = "\\'";
            } else if (d != 92) {
                switch (d) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (d < 32 || d > 126) {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            d = (d & 7) + 48;
                        }
                        sb.append((char) d);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
