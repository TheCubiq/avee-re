package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class kv2 extends it2 {
    public kv2() {
        this.f13989a.add(db3.EQUALS);
        this.f13989a.add(db3.GREATER_THAN);
        this.f13989a.add(db3.GREATER_THAN_EQUALS);
        this.f13989a.add(db3.IDENTITY_EQUALS);
        this.f13989a.add(db3.IDENTITY_NOT_EQUALS);
        this.f13989a.add(db3.LESS_THAN);
        this.f13989a.add(db3.LESS_THAN_EQUALS);
        this.f13989a.add(db3.NOT_EQUALS);
    }

    /* renamed from: c */
    public static boolean m17409c(gl2 gl2Var, gl2 gl2Var2) {
        if (gl2Var.getClass().equals(gl2Var2.getClass())) {
            if ((gl2Var instanceof br2) || (gl2Var instanceof xi2)) {
                return true;
            }
            return gl2Var instanceof tb2 ? (Double.isNaN(gl2Var.zzh().doubleValue()) || Double.isNaN(gl2Var2.zzh().doubleValue()) || gl2Var.zzh().doubleValue() != gl2Var2.zzh().doubleValue()) ? false : true : gl2Var instanceof wp2 ? gl2Var.zzi().equals(gl2Var2.zzi()) : gl2Var instanceof g92 ? gl2Var.zzg().equals(gl2Var2.zzg()) : gl2Var == gl2Var2;
        } else if (((gl2Var instanceof br2) || (gl2Var instanceof xi2)) && ((gl2Var2 instanceof br2) || (gl2Var2 instanceof xi2))) {
            return true;
        } else {
            boolean z = gl2Var instanceof tb2;
            if (z && (gl2Var2 instanceof wp2)) {
                return m17409c(gl2Var, new tb2(gl2Var2.zzh()));
            }
            boolean z2 = gl2Var instanceof wp2;
            if ((!z2 || !(gl2Var2 instanceof tb2)) && !(gl2Var instanceof g92)) {
                if (gl2Var2 instanceof g92) {
                    return m17409c(gl2Var, new tb2(gl2Var2.zzh()));
                }
                if ((z2 || z) && (gl2Var2 instanceof og2)) {
                    return m17409c(gl2Var, new wp2(gl2Var2.zzi()));
                }
                if ((gl2Var instanceof og2) && ((gl2Var2 instanceof wp2) || (gl2Var2 instanceof tb2))) {
                    return m17409c(new wp2(gl2Var.zzi()), gl2Var2);
                }
                return false;
            }
            return m17409c(new tb2(gl2Var.zzh()), gl2Var2);
        }
    }

    /* renamed from: d */
    public static boolean m17408d(gl2 gl2Var, gl2 gl2Var2) {
        if (gl2Var instanceof og2) {
            gl2Var = new wp2(gl2Var.zzi());
        }
        if (gl2Var2 instanceof og2) {
            gl2Var2 = new wp2(gl2Var2.zzi());
        }
        if ((gl2Var instanceof wp2) && (gl2Var2 instanceof wp2)) {
            return gl2Var.zzi().compareTo(gl2Var2.zzi()) < 0;
        }
        double doubleValue = gl2Var.zzh().doubleValue();
        double doubleValue2 = gl2Var2.zzh().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    /* renamed from: e */
    public static boolean m17407e(gl2 gl2Var, gl2 gl2Var2) {
        if (gl2Var instanceof og2) {
            gl2Var = new wp2(gl2Var.zzi());
        }
        if (gl2Var2 instanceof og2) {
            gl2Var2 = new wp2(gl2Var2.zzi());
        }
        return (((gl2Var instanceof wp2) && (gl2Var2 instanceof wp2)) || !(Double.isNaN(gl2Var.zzh().doubleValue()) || Double.isNaN(gl2Var2.zzh().doubleValue()))) && !m17408d(gl2Var2, gl2Var);
    }

    @Override // com.daaw.it2
    /* renamed from: a */
    public final gl2 mo3983a(String str, w07 w07Var, List list) {
        boolean m17409c;
        boolean m17409c2;
        ou7.m13916h(ou7.m13919e(str).name(), 2, list);
        gl2 m6608b = w07Var.m6608b((gl2) list.get(0));
        gl2 m6608b2 = w07Var.m6608b((gl2) list.get(1));
        int ordinal = ou7.m13919e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                m17409c2 = m17409c(m6608b, m6608b2);
            } else if (ordinal == 42) {
                m17409c = m17408d(m6608b, m6608b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        m17409c = m17408d(m6608b2, m6608b);
                        break;
                    case 38:
                        m17409c = m17407e(m6608b2, m6608b);
                        break;
                    case 39:
                        m17409c = ou7.m13912l(m6608b, m6608b2);
                        break;
                    case 40:
                        m17409c2 = ou7.m13912l(m6608b, m6608b2);
                        break;
                    default:
                        return super.m19432b(str);
                }
            } else {
                m17409c = m17407e(m6608b, m6608b2);
            }
            m17409c = !m17409c2;
        } else {
            m17409c = m17409c(m6608b, m6608b2);
        }
        return m17409c ? gl2.f11425l : gl2.f11426m;
    }
}
