package com.daaw;
/* loaded from: classes.dex */
public final class k52 implements v42 {
    public final y17 a;
    public final int b;

    public k52(int i, y17 y17Var) {
        this.b = i;
        this.a = y17Var;
    }

    public static k52 b(int i, ik5 ik5Var) {
        String concat;
        int q;
        StringBuilder sb;
        String str;
        String str2;
        v17 v17Var = new v17();
        int l = ik5Var.l();
        int i2 = -2;
        while (ik5Var.i() > 8) {
            int o = ik5Var.o();
            int k = ik5Var.k() + ik5Var.o();
            ik5Var.e(k);
            v42 v42Var = null;
            if (o != 1414744396) {
                switch (o) {
                    case 1718776947:
                        if (i2 == 2) {
                            ik5Var.g(4);
                            int o2 = ik5Var.o();
                            int o3 = ik5Var.o();
                            ik5Var.g(4);
                            q = ik5Var.o();
                            switch (q) {
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
                                b72Var.x(o2);
                                b72Var.f(o3);
                                b72Var.s(str2);
                                v42Var = new l52(b72Var.y());
                                break;
                            } else {
                                sb = new StringBuilder();
                                str = "Ignoring track with unsupported compression ";
                                sb.append(str);
                                sb.append(q);
                                concat = sb.toString();
                            }
                        } else if (i2 == 1) {
                            q = ik5Var.q();
                            String str3 = q != 1 ? q != 85 ? q != 255 ? q != 8192 ? q != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str3 != null) {
                                int q2 = ik5Var.q();
                                int o4 = ik5Var.o();
                                ik5Var.g(6);
                                int X = it5.X(ik5Var.w());
                                int q3 = ik5Var.q();
                                byte[] bArr = new byte[q3];
                                ik5Var.b(bArr, 0, q3);
                                b72 b72Var2 = new b72();
                                b72Var2.s(str3);
                                b72Var2.e0(q2);
                                b72Var2.t(o4);
                                if ("audio/raw".equals(str3) && X != 0) {
                                    b72Var2.n(X);
                                }
                                if ("audio/mp4a-latm".equals(str3) && q3 > 0) {
                                    b72Var2.i(y17.v(bArr));
                                }
                                v42Var = new l52(b72Var2.y());
                                break;
                            } else {
                                sb = new StringBuilder();
                                str = "Ignoring track with unsupported format tag ";
                                sb.append(str);
                                sb.append(q);
                                concat = sb.toString();
                            }
                        } else {
                            concat = "Ignoring strf box for unsupported track type: ".concat(it5.o(i2));
                        }
                        s95.e("StreamFormatChunk", concat);
                        break;
                    case 1751742049:
                        v42Var = h52.a(ik5Var);
                        break;
                    case 1752331379:
                        v42Var = i52.a(ik5Var);
                        break;
                    case 1852994675:
                        v42Var = m52.a(ik5Var);
                        break;
                }
            } else {
                v42Var = b(ik5Var.o(), ik5Var);
            }
            if (v42Var != null) {
                if (v42Var.zza() == 1752331379) {
                    int i3 = ((i52) v42Var).a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        s95.e("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                v17Var.f(v42Var);
            }
            ik5Var.f(k);
            ik5Var.e(l);
        }
        return new k52(i, v17Var.h());
    }

    public final v42 a(Class cls) {
        y17 y17Var = this.a;
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
        return this.b;
    }
}
