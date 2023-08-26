package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbea {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzaq(zzbah zzbahVar) {
        String str;
        zzbeb zzbebVar = new zzbeb(zzbahVar);
        StringBuilder sb = new StringBuilder(zzbebVar.size());
        for (int i = 0; i < zzbebVar.size(); i++) {
            int zzbn = zzbebVar.zzbn(i);
            if (zzbn == 34) {
                str = "\\\"";
            } else if (zzbn == 39) {
                str = "\\'";
            } else if (zzbn != 92) {
                switch (zzbn) {
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
                        if (zzbn < 32 || zzbn > 126) {
                            sb.append('\\');
                            sb.append((char) (((zzbn >>> 6) & 3) + 48));
                            sb.append((char) (((zzbn >>> 3) & 7) + 48));
                            zzbn = (zzbn & 7) + 48;
                        }
                        sb.append((char) zzbn);
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
