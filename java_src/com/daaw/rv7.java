package com.daaw;
/* loaded from: classes.dex */
public final class rv7 {
    /* renamed from: a */
    public static String m10875a(yq7 yq7Var) {
        String str;
        StringBuilder sb = new StringBuilder(yq7Var.mo3411o());
        for (int i = 0; i < yq7Var.mo3411o(); i++) {
            int mo3414k = yq7Var.mo3414k(i);
            if (mo3414k == 34) {
                str = "\\\"";
            } else if (mo3414k == 39) {
                str = "\\'";
            } else if (mo3414k != 92) {
                switch (mo3414k) {
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
                        if (mo3414k < 32 || mo3414k > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo3414k >>> 6) & 3) + 48));
                            sb.append((char) (((mo3414k >>> 3) & 7) + 48));
                            mo3414k = (mo3414k & 7) + 48;
                        }
                        sb.append((char) mo3414k);
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
