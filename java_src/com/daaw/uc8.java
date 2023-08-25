package com.daaw;

import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class uc8 extends th2 {

    /* renamed from: q */
    public final z42 f28892q;

    public uc8(z42 z42Var) {
        this.f28892q = z42Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.daaw.th2, com.daaw.gl2
    /* renamed from: d */
    public final gl2 mo2708d(String str, w07 w07Var, List list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            ou7.m13916h("getEventName", 0, list);
            return new wp2(this.f28892q.m2825b().m10738d());
        } else if (c == 1) {
            ou7.m13916h("getParamValue", 1, list);
            return b38.m26495b(this.f28892q.m2825b().m10739c(w07Var.m6608b((gl2) list.get(0)).zzi()));
        } else if (c == 2) {
            ou7.m13916h("getParams", 0, list);
            Map m10737e = this.f28892q.m2825b().m10737e();
            th2 th2Var = new th2();
            for (String str2 : m10737e.keySet()) {
                th2Var.mo2705h(str2, b38.m26495b(m10737e.get(str2)));
            }
            return th2Var;
        } else if (c == 3) {
            ou7.m13916h("getTimestamp", 0, list);
            return new tb2(Double.valueOf(this.f28892q.m2825b().m10741a()));
        } else if (c != 4) {
            if (c != 5) {
                return super.mo2708d(str, w07Var, list);
            }
            ou7.m13916h("setParamValue", 2, list);
            String zzi = w07Var.m6608b((gl2) list.get(0)).zzi();
            gl2 m6608b = w07Var.m6608b((gl2) list.get(1));
            this.f28892q.m2825b().m10735g(zzi, ou7.m13918f(m6608b));
            return m6608b;
        } else {
            ou7.m13916h("setEventName", 1, list);
            gl2 m6608b2 = w07Var.m6608b((gl2) list.get(0));
            if (gl2.f11420g.equals(m6608b2) || gl2.f11421h.equals(m6608b2)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            this.f28892q.m2825b().m10736f(m6608b2.zzi());
            return new wp2(m6608b2.zzi());
        }
    }
}
