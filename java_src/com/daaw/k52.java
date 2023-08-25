package com.daaw;
/* loaded from: classes.dex */
public final class k52 implements v42 {

    /* renamed from: a */
    public final y17 f15687a;

    /* renamed from: b */
    public final int f15688b;

    public k52(int i, y17 y17Var) {
        this.f15688b = i;
        this.f15687a = y17Var;
    }

    /* renamed from: b */
    public static k52 m18045b(int i, ik5 ik5Var) {
        String concat;
        int m19705q;
        StringBuilder sb;
        String str;
        String str2;
        v17 v17Var = new v17();
        int m19710l = ik5Var.m19710l();
        int i2 = -2;
        while (ik5Var.m19713i() > 8) {
            int m19707o = ik5Var.m19707o();
            int m19711k = ik5Var.m19711k() + ik5Var.m19707o();
            ik5Var.m19717e(m19711k);
            v42 v42Var = null;
            if (m19707o != 1414744396) {
                switch (m19707o) {
                    case 1718776947:
                        if (i2 == 2) {
                            ik5Var.m19715g(4);
                            int m19707o2 = ik5Var.m19707o();
                            int m19707o3 = ik5Var.m19707o();
                            ik5Var.m19715g(4);
                            m19705q = ik5Var.m19707o();
                            switch (m19705q) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                b72 b72Var = new b72();
                                b72Var.m26367x(m19707o2);
                                b72Var.m26388f(m19707o3);
                                b72Var.m26372s(str2);
                                v42Var = new l52(b72Var.m26366y());
                                break;
                            } else {
                                sb = new StringBuilder();
                                str = "Ignoring track with unsupported compression ";
                                sb.append(str);
                                sb.append(m19705q);
                                concat = sb.toString();
                            }
                        } else if (i2 == 1) {
                            m19705q = ik5Var.m19705q();
                            String str3 = m19705q != 1 ? m19705q != 85 ? m19705q != 255 ? m19705q != 8192 ? m19705q != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str3 != null) {
                                int m19705q2 = ik5Var.m19705q();
                                int m19707o4 = ik5Var.m19707o();
                                ik5Var.m19715g(6);
                                int m19408X = it5.m19408X(ik5Var.m19699w());
                                int m19705q3 = ik5Var.m19705q();
                                byte[] bArr = new byte[m19705q3];
                                ik5Var.m19720b(bArr, 0, m19705q3);
                                b72 b72Var2 = new b72();
                                b72Var2.m26372s(str3);
                                b72Var2.m26389e0(m19705q2);
                                b72Var2.m26371t(m19707o4);
                                if ("audio/raw".equals(str3) && m19408X != 0) {
                                    b72Var2.m26377n(m19408X);
                                }
                                if ("audio/mp4a-latm".equals(str3) && m19705q3 > 0) {
                                    b72Var2.m26382i(y17.m4259v(bArr));
                                }
                                v42Var = new l52(b72Var2.m26366y());
                                break;
                            } else {
                                sb = new StringBuilder();
                                str = "Ignoring track with unsupported format tag ";
                                sb.append(str);
                                sb.append(m19705q);
                                concat = sb.toString();
                            }
                        } else {
                            concat = "Ignoring strf box for unsupported track type: ".concat(it5.m19381o(i2));
                        }
                        s95.m10493e("StreamFormatChunk", concat);
                        break;
                    case 1751742049:
                        v42Var = h52.m21021a(ik5Var);
                        break;
                    case 1752331379:
                        v42Var = i52.m20121a(ik5Var);
                        break;
                    case 1852994675:
                        v42Var = m52.m16203a(ik5Var);
                        break;
                }
            } else {
                v42Var = m18045b(ik5Var.m19707o(), ik5Var);
            }
            if (v42Var != null) {
                if (v42Var.zza() == 1752331379) {
                    int i3 = ((i52) v42Var).f13258a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        s95.m10493e("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                v17Var.m7548f(v42Var);
            }
            ik5Var.m19716f(m19711k);
            ik5Var.m19717e(m19710l);
        }
        return new k52(i, v17Var.m7546h());
    }

    /* renamed from: a */
    public final v42 m18046a(Class cls) {
        y17 y17Var = this.f15687a;
        int size = y17Var.size();
        int i = 0;
        while (i < size) {
            v42 v42Var = (v42) y17Var.get(i);
            i++;
            if (v42Var.getClass() == cls) {
                return v42Var;
            }
        }
        return null;
    }

    @Override // com.daaw.v42
    public final int zza() {
        return this.f15688b;
    }
}
