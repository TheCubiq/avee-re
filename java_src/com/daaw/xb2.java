package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class xb2 implements sd2 {

    /* renamed from: a */
    public final List f32324a = y17.m4260u();

    public xb2(int i) {
    }

    @Override // com.daaw.sd2
    /* renamed from: a */
    public final ud2 mo5311a(int i, rd2 rd2Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new rc2(new oc2(rd2Var.f25164b));
            }
            if (i == 21) {
                return new rc2(new mc2());
            }
            if (i == 27) {
                return new rc2(new jc2(m5310b(rd2Var), false, false));
            }
            if (i == 36) {
                return new rc2(new lc2(m5310b(rd2Var)));
            }
            if (i == 89) {
                return new rc2(new zb2(rd2Var.f25165c));
            }
            if (i == 138) {
                return new rc2(new yb2(rd2Var.f25164b));
            }
            if (i == 172) {
                return new rc2(new ob2(rd2Var.f25164b));
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
                                return new rc2(new rb2(false, rd2Var.f25164b));
                            case 16:
                                return new rc2(new fc2(m5309c(rd2Var)));
                            case 17:
                                return new rc2(new nc2(rd2Var.f25164b));
                            default:
                                return null;
                        }
                    }
                }
                return new rc2(new lb2(rd2Var.f25164b));
            }
        }
        return new rc2(new cc2(m5309c(rd2Var)));
    }

    /* renamed from: b */
    public final id2 m5310b(rd2 rd2Var) {
        return new id2(m5308d(rd2Var));
    }

    /* renamed from: c */
    public final wd2 m5309c(rd2 rd2Var) {
        return new wd2(m5308d(rd2Var));
    }

    /* renamed from: d */
    public final List m5308d(rd2 rd2Var) {
        String str;
        int i;
        List list;
        ik5 ik5Var = new ik5(rd2Var.f25166d);
        List list2 = this.f32324a;
        while (ik5Var.m19713i() > 0) {
            int m19703s = ik5Var.m19703s();
            int m19711k = ik5Var.m19711k() + ik5Var.m19703s();
            if (m19703s == 134) {
                list2 = new ArrayList();
                int m19703s2 = ik5Var.m19703s() & 31;
                for (int i2 = 0; i2 < m19703s2; i2++) {
                    String m19724F = ik5Var.m19724F(3, cy6.f6275c);
                    int m19703s3 = ik5Var.m19703s();
                    boolean z = (m19703s3 & 128) != 0;
                    if (z) {
                        i = m19703s3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte m19703s4 = (byte) ik5Var.m19703s();
                    ik5Var.m19715g(1);
                    if (z) {
                        int i3 = ar4.f3499c;
                        list = Collections.singletonList((m19703s4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    b72 b72Var = new b72();
                    b72Var.m26372s(str);
                    b72Var.m26380k(m19724F);
                    b72Var.m26393c0(i);
                    b72Var.m26382i(list);
                    list2.add(b72Var.m26366y());
                }
            }
            ik5Var.m19716f(m19711k);
        }
        return list2;
    }
}
