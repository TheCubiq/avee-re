package com.daaw;
/* loaded from: classes.dex */
public final class rv7 {
    public static String a(yq7 yq7Var) {
        String str;
        StringBuilder sb = new StringBuilder(yq7Var.o());
        for (int i = 0; i < yq7Var.o(); i++) {
            int k = yq7Var.k(i);
            if (k == 34) {
                str = "\\\"";
            } else if (k == 39) {
                str = "\\'";
            } else if (k != 92) {
                switch (k) {
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
                        if (k < 32 || k > 126) {
                            sb.append('\\');
                            sb.append((char) (((k >>> 6) & 3) + 48));
                            sb.append((char) (((k >>> 3) & 7) + 48));
                            k = (k & 7) + 48;
                        }
                        sb.append((char) k);
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
