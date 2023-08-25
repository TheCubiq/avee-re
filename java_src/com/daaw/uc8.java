package com.daaw;

import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class uc8 extends th2 {
    public final z42 q;

    public uc8(z42 z42Var) {
        this.q = z42Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.daaw.th2, com.daaw.gl2
    public final gl2 d(String str, w07 w07Var, List list) {
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
            ou7.h("getEventName", 0, list);
            return new wp2(this.q.b().d());
        } else if (c == 1) {
            ou7.h("getParamValue", 1, list);
            return b38.b(this.q.b().c(w07Var.b((gl2) list.get(0)).zzi()));
        } else if (c == 2) {
            ou7.h("getParams", 0, list);
            Map e = this.q.b().e();
            th2 th2Var = new th2();
            for (String str2 : e.keySet()) {
                th2Var.h(str2, b38.b(e.get(str2)));
            }
            return th2Var;
        } else if (c == 3) {
            ou7.h("getTimestamp", 0, list);
            return new tb2(Double.valueOf(this.q.b().a()));
        } else if (c != 4) {
            if (c != 5) {
                return super.d(str, w07Var, list);
            }
            ou7.h("setParamValue", 2, list);
            String zzi = w07Var.b((gl2) list.get(0)).zzi();
            gl2 b = w07Var.b((gl2) list.get(1));
            this.q.b().g(zzi, ou7.f(b));
            return b;
        } else {
            ou7.h("setEventName", 1, list);
            gl2 b2 = w07Var.b((gl2) list.get(0));
            if (gl2.g.equals(b2) || gl2.h.equals(b2)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            this.q.b().f(b2.zzi());
            return new wp2(b2.zzi());
        }
    }
}
