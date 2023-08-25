package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class xb2 implements sd2 {
    public final List a = y17.u();

    public xb2(int i) {
    }

    @Override // com.daaw.sd2
    public final ud2 a(int i, rd2 rd2Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new rc2(new oc2(rd2Var.b));
            }
            if (i == 21) {
                return new rc2(new mc2());
            }
            if (i == 27) {
                return new rc2(new jc2(b(rd2Var), false, false));
            }
            if (i == 36) {
                return new rc2(new lc2(b(rd2Var)));
            }
            if (i == 89) {
                return new rc2(new zb2(rd2Var.c));
            }
            if (i == 138) {
                return new rc2(new yb2(rd2Var.b));
            }
            if (i == 172) {
                return new rc2(new ob2(rd2Var.b));
            }
            if (i == 257) {
                return new hd2(new qc2("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new hd2(new qc2("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new rc2(new rb2(false, rd2Var.b));
                            case 16:
                                return new rc2(new fc2(c(rd2Var)));
                            case 17:
                                return new rc2(new nc2(rd2Var.b));
                            default:
                                return null;
                        }
                    }
                }
                return new rc2(new lb2(rd2Var.b));
            }
        }
        return new rc2(new cc2(c(rd2Var)));
    }

    public final id2 b(rd2 rd2Var) {
        return new id2(d(rd2Var));
    }

    public final wd2 c(rd2 rd2Var) {
        return new wd2(d(rd2Var));
    }

    public final List d(rd2 rd2Var) {
        String str;
        int i;
        List list;
        ik5 ik5Var = new ik5(rd2Var.d);
        List list2 = this.a;
        while (ik5Var.i() > 0) {
            int s = ik5Var.s();
            int k = ik5Var.k() + ik5Var.s();
            if (s == 134) {
                list2 = new ArrayList();
                int s2 = ik5Var.s() & 31;
                for (int i2 = 0; i2 < s2; i2++) {
                    String F = ik5Var.F(3, cy6.c);
                    int s3 = ik5Var.s();
                    boolean z = (s3 & 128) != 0;
                    if (z) {
                        i = s3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte s4 = (byte) ik5Var.s();
                    ik5Var.g(1);
                    if (z) {
                        int i3 = ar4.c;
                        list = Collections.singletonList((s4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    b72 b72Var = new b72();
                    b72Var.s(str);
                    b72Var.k(F);
                    b72Var.c0(i);
                    b72Var.i(list);
                    list2.add(b72Var.y());
                }
            }
            ik5Var.f(k);
        }
        return list2;
    }
}
