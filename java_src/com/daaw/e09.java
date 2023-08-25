package com.daaw;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class e09 implements q09 {
    public static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final d09 c = new d09(new c09() { // from class: com.daaw.a09
        @Override // com.daaw.c09
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(j09.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    public static final d09 d = new d09(new c09() { // from class: com.daaw.b09
        @Override // com.daaw.c09
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(j09.class).getConstructor(new Class[0]);
        }
    });

    public static final void b(int i, List list) {
        Object kb2Var;
        switch (i) {
            case 0:
                kb2Var = new kb2();
                break;
            case 1:
                kb2Var = new nb2();
                break;
            case 2:
                kb2Var = new qb2(0);
                break;
            case 3:
                kb2Var = new u42(0);
                break;
            case 4:
                j09 a = c.a(0);
                if (a == null) {
                    kb2Var = new s52(0);
                    break;
                } else {
                    list.add(a);
                    return;
                }
            case 5:
                kb2Var = new v52();
                break;
            case 6:
                kb2Var = new n82(0);
                break;
            case 7:
                kb2Var = new v82(0);
                break;
            case 8:
                list.add(new x92(0, null));
                kb2Var = new ca2(0);
                break;
            case 9:
                kb2Var = new ya2();
                break;
            case 10:
                kb2Var = new fd2();
                break;
            case 11:
                kb2Var = new pd2(1, 0, 112800);
                break;
            case 12:
                kb2Var = new be2();
                break;
            case 13:
            default:
                return;
            case 14:
                kb2Var = new a62();
                break;
            case 15:
                j09 a2 = d.a(new Object[0]);
                if (a2 != null) {
                    list.add(a2);
                    return;
                }
                return;
            case 16:
                kb2Var = new g52();
                break;
        }
        list.add(kb2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x031a, code lost:
        if (r9 == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x031c, code lost:
        b(r9, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a3 A[Catch: all -> 0x033e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:113:0x01a3, B:114:0x01a6, B:212:0x031c, B:213:0x031f, B:215:0x0324, B:218:0x032a, B:219:0x032d, B:220:0x0330, B:117:0x01af, B:119:0x01b7, B:122:0x01c1, B:125:0x01cc, B:127:0x01d4, B:130:0x01de, B:133:0x01e9, B:136:0x01f4, B:139:0x01ff, B:141:0x0207, B:143:0x020f, B:146:0x0219, B:148:0x0227, B:151:0x0231, B:154:0x023c, B:156:0x0244, B:158:0x0252, B:160:0x0260, B:163:0x0270, B:165:0x027e, B:168:0x0288, B:170:0x0290, B:172:0x0298, B:174:0x02a0, B:177:0x02a9, B:179:0x02b1, B:182:0x02c0, B:184:0x02c8, B:187:0x02d1, B:189:0x02d9, B:192:0x02e2, B:194:0x02ea, B:197:0x02f3, B:12:0x003f, B:13:0x0047, B:94:0x0174, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070, B:27:0x007c, B:30:0x0087, B:33:0x0092, B:36:0x009d, B:39:0x00a9, B:42:0x00b5, B:45:0x00c1, B:48:0x00cd, B:51:0x00d8, B:54:0x00e3, B:57:0x00ee, B:60:0x00fa, B:63:0x0106, B:66:0x0112, B:69:0x011d, B:72:0x0128, B:75:0x0133, B:78:0x013e, B:81:0x0148, B:84:0x0153, B:87:0x015e, B:90:0x0169), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af A[Catch: all -> 0x033e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:113:0x01a3, B:114:0x01a6, B:212:0x031c, B:213:0x031f, B:215:0x0324, B:218:0x032a, B:219:0x032d, B:220:0x0330, B:117:0x01af, B:119:0x01b7, B:122:0x01c1, B:125:0x01cc, B:127:0x01d4, B:130:0x01de, B:133:0x01e9, B:136:0x01f4, B:139:0x01ff, B:141:0x0207, B:143:0x020f, B:146:0x0219, B:148:0x0227, B:151:0x0231, B:154:0x023c, B:156:0x0244, B:158:0x0252, B:160:0x0260, B:163:0x0270, B:165:0x027e, B:168:0x0288, B:170:0x0290, B:172:0x0298, B:174:0x02a0, B:177:0x02a9, B:179:0x02b1, B:182:0x02c0, B:184:0x02c8, B:187:0x02d1, B:189:0x02d9, B:192:0x02e2, B:194:0x02ea, B:197:0x02f3, B:12:0x003f, B:13:0x0047, B:94:0x0174, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070, B:27:0x007c, B:30:0x0087, B:33:0x0092, B:36:0x009d, B:39:0x00a9, B:42:0x00b5, B:45:0x00c1, B:48:0x00cd, B:51:0x00d8, B:54:0x00e3, B:57:0x00ee, B:60:0x00fa, B:63:0x0106, B:66:0x0112, B:69:0x011d, B:72:0x0128, B:75:0x0133, B:78:0x013e, B:81:0x0148, B:84:0x0153, B:87:0x015e, B:90:0x0169), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0324 A[Catch: all -> 0x033e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:113:0x01a3, B:114:0x01a6, B:212:0x031c, B:213:0x031f, B:215:0x0324, B:218:0x032a, B:219:0x032d, B:220:0x0330, B:117:0x01af, B:119:0x01b7, B:122:0x01c1, B:125:0x01cc, B:127:0x01d4, B:130:0x01de, B:133:0x01e9, B:136:0x01f4, B:139:0x01ff, B:141:0x0207, B:143:0x020f, B:146:0x0219, B:148:0x0227, B:151:0x0231, B:154:0x023c, B:156:0x0244, B:158:0x0252, B:160:0x0260, B:163:0x0270, B:165:0x027e, B:168:0x0288, B:170:0x0290, B:172:0x0298, B:174:0x02a0, B:177:0x02a9, B:179:0x02b1, B:182:0x02c0, B:184:0x02c8, B:187:0x02d1, B:189:0x02d9, B:192:0x02e2, B:194:0x02ea, B:197:0x02f3, B:12:0x003f, B:13:0x0047, B:94:0x0174, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070, B:27:0x007c, B:30:0x0087, B:33:0x0092, B:36:0x009d, B:39:0x00a9, B:42:0x00b5, B:45:0x00c1, B:48:0x00cd, B:51:0x00d8, B:54:0x00e3, B:57:0x00ee, B:60:0x00fa, B:63:0x0106, B:66:0x0112, B:69:0x011d, B:72:0x0128, B:75:0x0133, B:78:0x013e, B:81:0x0148, B:84:0x0153, B:87:0x015e, B:90:0x0169), top: B:228:0x0001 }] */
    @Override // com.daaw.q09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.daaw.j09[] a(android.net.Uri r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.e09.a(android.net.Uri, java.util.Map):com.daaw.j09[]");
    }

    @Override // com.daaw.q09
    public final synchronized j09[] zza() {
        return a(Uri.EMPTY, new HashMap());
    }
}
