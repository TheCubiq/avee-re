package com.daaw;
/* loaded from: classes2.dex */
public final class kg8 {
    /* renamed from: a */
    public static String m17753a(y68 y68Var) {
        String str;
        StringBuilder sb = new StringBuilder(y68Var.mo2805f());
        for (int i = 0; i < y68Var.mo2805f(); i++) {
            int mo2807d = y68Var.mo2807d(i);
            if (mo2807d == 34) {
                str = "\\\"";
            } else if (mo2807d == 39) {
                str = "\\'";
            } else if (mo2807d != 92) {
                switch (mo2807d) {
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
                        if (mo2807d < 32 || mo2807d > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo2807d >>> 6) & 3) + 48));
                            sb.append((char) (((mo2807d >>> 3) & 7) + 48));
                            mo2807d = (mo2807d & 7) + 48;
                        }
                        sb.append((char) mo2807d);
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
