package com.daaw;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class e09 implements q09 {

    /* renamed from: b */
    public static final int[] f8018b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: c */
    public static final d09 f8019c = new d09(new c09() { // from class: com.daaw.a09
        @Override // com.daaw.c09
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(j09.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });

    /* renamed from: d */
    public static final d09 f8020d = new d09(new c09() { // from class: com.daaw.b09
        @Override // com.daaw.c09
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(j09.class).getConstructor(new Class[0]);
        }
    });

    /* renamed from: b */
    public static final void m23799b(int i, List list) {
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
                j09 m24801a = f8019c.m24801a(0);
                if (m24801a == null) {
                    kb2Var = new s52(0);
                    break;
                } else {
                    list.add(m24801a);
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
                j09 m24801a2 = f8020d.m24801a(new Object[0]);
                if (m24801a2 != null) {
                    list.add(m24801a2);
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
        m23799b(r9, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a3 A[Catch: all -> 0x033e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:113:0x01a3, B:114:0x01a6, B:212:0x031c, B:213:0x031f, B:215:0x0324, B:218:0x032a, B:219:0x032d, B:220:0x0330, B:117:0x01af, B:119:0x01b7, B:122:0x01c1, B:125:0x01cc, B:127:0x01d4, B:130:0x01de, B:133:0x01e9, B:136:0x01f4, B:139:0x01ff, B:141:0x0207, B:143:0x020f, B:146:0x0219, B:148:0x0227, B:151:0x0231, B:154:0x023c, B:156:0x0244, B:158:0x0252, B:160:0x0260, B:163:0x0270, B:165:0x027e, B:168:0x0288, B:170:0x0290, B:172:0x0298, B:174:0x02a0, B:177:0x02a9, B:179:0x02b1, B:182:0x02c0, B:184:0x02c8, B:187:0x02d1, B:189:0x02d9, B:192:0x02e2, B:194:0x02ea, B:197:0x02f3, B:12:0x003f, B:13:0x0047, B:94:0x0174, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070, B:27:0x007c, B:30:0x0087, B:33:0x0092, B:36:0x009d, B:39:0x00a9, B:42:0x00b5, B:45:0x00c1, B:48:0x00cd, B:51:0x00d8, B:54:0x00e3, B:57:0x00ee, B:60:0x00fa, B:63:0x0106, B:66:0x0112, B:69:0x011d, B:72:0x0128, B:75:0x0133, B:78:0x013e, B:81:0x0148, B:84:0x0153, B:87:0x015e, B:90:0x0169), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af A[Catch: all -> 0x033e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:113:0x01a3, B:114:0x01a6, B:212:0x031c, B:213:0x031f, B:215:0x0324, B:218:0x032a, B:219:0x032d, B:220:0x0330, B:117:0x01af, B:119:0x01b7, B:122:0x01c1, B:125:0x01cc, B:127:0x01d4, B:130:0x01de, B:133:0x01e9, B:136:0x01f4, B:139:0x01ff, B:141:0x0207, B:143:0x020f, B:146:0x0219, B:148:0x0227, B:151:0x0231, B:154:0x023c, B:156:0x0244, B:158:0x0252, B:160:0x0260, B:163:0x0270, B:165:0x027e, B:168:0x0288, B:170:0x0290, B:172:0x0298, B:174:0x02a0, B:177:0x02a9, B:179:0x02b1, B:182:0x02c0, B:184:0x02c8, B:187:0x02d1, B:189:0x02d9, B:192:0x02e2, B:194:0x02ea, B:197:0x02f3, B:12:0x003f, B:13:0x0047, B:94:0x0174, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070, B:27:0x007c, B:30:0x0087, B:33:0x0092, B:36:0x009d, B:39:0x00a9, B:42:0x00b5, B:45:0x00c1, B:48:0x00cd, B:51:0x00d8, B:54:0x00e3, B:57:0x00ee, B:60:0x00fa, B:63:0x0106, B:66:0x0112, B:69:0x011d, B:72:0x0128, B:75:0x0133, B:78:0x013e, B:81:0x0148, B:84:0x0153, B:87:0x015e, B:90:0x0169), top: B:228:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0324 A[Catch: all -> 0x033e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:113:0x01a3, B:114:0x01a6, B:212:0x031c, B:213:0x031f, B:215:0x0324, B:218:0x032a, B:219:0x032d, B:220:0x0330, B:117:0x01af, B:119:0x01b7, B:122:0x01c1, B:125:0x01cc, B:127:0x01d4, B:130:0x01de, B:133:0x01e9, B:136:0x01f4, B:139:0x01ff, B:141:0x0207, B:143:0x020f, B:146:0x0219, B:148:0x0227, B:151:0x0231, B:154:0x023c, B:156:0x0244, B:158:0x0252, B:160:0x0260, B:163:0x0270, B:165:0x027e, B:168:0x0288, B:170:0x0290, B:172:0x0298, B:174:0x02a0, B:177:0x02a9, B:179:0x02b1, B:182:0x02c0, B:184:0x02c8, B:187:0x02d1, B:189:0x02d9, B:192:0x02e2, B:194:0x02ea, B:197:0x02f3, B:12:0x003f, B:13:0x0047, B:94:0x0174, B:15:0x004c, B:18:0x0058, B:21:0x0064, B:24:0x0070, B:27:0x007c, B:30:0x0087, B:33:0x0092, B:36:0x009d, B:39:0x00a9, B:42:0x00b5, B:45:0x00c1, B:48:0x00cd, B:51:0x00d8, B:54:0x00e3, B:57:0x00ee, B:60:0x00fa, B:63:0x0106, B:66:0x0112, B:69:0x011d, B:72:0x0128, B:75:0x0133, B:78:0x013e, B:81:0x0148, B:84:0x0153, B:87:0x015e, B:90:0x0169), top: B:228:0x0001 }] */
    @Override // com.daaw.q09
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized j09[] mo2588a(Uri uri, Map map) {
        ArrayList arrayList;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        arrayList = new ArrayList(16);
        List list = (List) map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        int i3 = 14;
        if (str != null) {
            String m27385e = ak3.m27385e(str);
            switch (m27385e.hashCode()) {
                case -2123537834:
                    if (m27385e.equals("audio/eac3-joc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662384011:
                    if (m27385e.equals("video/mp2p")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662384007:
                    if (m27385e.equals("video/mp2t")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662095187:
                    if (m27385e.equals("video/webm")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1606874997:
                    if (m27385e.equals("audio/amr-wb")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1487394660:
                    if (m27385e.equals("image/jpeg")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248337486:
                    if (m27385e.equals("application/mp4")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1079884372:
                    if (m27385e.equals("video/x-msvideo")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (m27385e.equals("text/vtt")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -387023398:
                    if (m27385e.equals("audio/x-matroska")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -43467528:
                    if (m27385e.equals("application/webm")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 13915911:
                    if (m27385e.equals("video/x-flv")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 187078296:
                    if (m27385e.equals("audio/ac3")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 187078297:
                    if (m27385e.equals("audio/ac4")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 187078669:
                    if (m27385e.equals("audio/amr")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 187090232:
                    if (m27385e.equals("audio/mp4")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 187091926:
                    if (m27385e.equals("audio/ogg")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 187099443:
                    if (m27385e.equals("audio/wav")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331848029:
                    if (m27385e.equals("video/mp4")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1503095341:
                    if (m27385e.equals("audio/3gpp")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1504578661:
                    if (m27385e.equals("audio/eac3")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1504619009:
                    if (m27385e.equals("audio/flac")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1504824762:
                    if (m27385e.equals("audio/midi")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1504831518:
                    if (m27385e.equals("audio/mpeg")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1505118770:
                    if (m27385e.equals("audio/webm")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 2039520277:
                    if (m27385e.equals("video/x-matroska")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                    i = 0;
                    break;
                case 3:
                    i = 1;
                    break;
                case 4:
                case 5:
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 4;
                    break;
                case '\b':
                    i = 5;
                    break;
                case '\t':
                    i = 15;
                    break;
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                    i = 6;
                    break;
                case 15:
                    i = 7;
                    break;
                case 16:
                case 17:
                case 18:
                    i = 8;
                    break;
                case 19:
                    i = 9;
                    break;
                case 20:
                    i = 10;
                    break;
                case 21:
                    i = 11;
                    break;
                case 22:
                    i = 12;
                    break;
                case 23:
                    i = 13;
                    break;
                case 24:
                    i = 14;
                    break;
                case 25:
                    i = 16;
                    break;
            }
            if (i != -1) {
                m23799b(i, arrayList);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                    if (lastPathSegment.endsWith(".ac4")) {
                        i3 = 1;
                    } else {
                        if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                            if (lastPathSegment.endsWith(".amr")) {
                                i3 = 3;
                            } else if (lastPathSegment.endsWith(".flac")) {
                                i3 = 4;
                            } else if (lastPathSegment.endsWith(".flv")) {
                                i3 = 5;
                            } else {
                                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                        if (lastPathSegment.endsWith(".mp3")) {
                                            i3 = 7;
                                        } else {
                                            if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                    if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                        if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                            if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                    if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                                        if (lastPathSegment.endsWith(".avi")) {
                                                                            i3 = 16;
                                                                        }
                                                                    }
                                                                }
                                                                i3 = 13;
                                                            }
                                                            i3 = 12;
                                                        }
                                                        i3 = 11;
                                                    }
                                                    i3 = 10;
                                                }
                                                i3 = 9;
                                            }
                                            i3 = 8;
                                        }
                                    }
                                    i3 = 6;
                                }
                                i3 = 15;
                            }
                        }
                        i3 = 2;
                    }
                    int[] iArr = f8018b;
                    for (i2 = 0; i2 < 16; i2++) {
                        int i4 = iArr[i2];
                        if (i4 != i && i4 != i3) {
                            m23799b(i4, arrayList);
                        }
                    }
                }
                i3 = 0;
                int[] iArr2 = f8018b;
                while (i2 < 16) {
                }
            }
            i3 = -1;
            int[] iArr22 = f8018b;
            while (i2 < 16) {
            }
        }
        i = -1;
        if (i != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i3 = -1;
        int[] iArr222 = f8018b;
        while (i2 < 16) {
        }
        return (j09[]) arrayList.toArray(new j09[arrayList.size()]);
    }

    @Override // com.daaw.q09
    public final synchronized j09[] zza() {
        return mo2588a(Uri.EMPTY, new HashMap());
    }
}
