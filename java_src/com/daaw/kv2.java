package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class kv2 extends it2 {
    public kv2() {
        this.a.add(db3.EQUALS);
        this.a.add(db3.GREATER_THAN);
        this.a.add(db3.GREATER_THAN_EQUALS);
        this.a.add(db3.IDENTITY_EQUALS);
        this.a.add(db3.IDENTITY_NOT_EQUALS);
        this.a.add(db3.LESS_THAN);
        this.a.add(db3.LESS_THAN_EQUALS);
        this.a.add(db3.NOT_EQUALS);
    }

    public static boolean c(gl2 gl2Var, gl2 gl2Var2) {
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
                return c(gl2Var, new tb2(gl2Var2.zzh()));
            }
            boolean z2 = gl2Var instanceof wp2;
            if ((!z2 || !(gl2Var2 instanceof tb2)) && !(gl2Var instanceof g92)) {
                if (gl2Var2 instanceof g92) {
                    return c(gl2Var, new tb2(gl2Var2.zzh()));
                }
                if ((z2 || z) && (gl2Var2 instanceof og2)) {
                    return c(gl2Var, new wp2(gl2Var2.zzi()));
                }
                if ((gl2Var instanceof og2) && ((gl2Var2 instanceof wp2) || (gl2Var2 instanceof tb2))) {
                    return c(new wp2(gl2Var.zzi()), gl2Var2);
                }
                return false;
            }
            return c(new tb2(gl2Var.zzh()), gl2Var2);
        }
    }

    public static boolean d(gl2 gl2Var, gl2 gl2Var2) {
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

    public static boolean e(gl2 gl2Var, gl2 gl2Var2) {
        if (gl2Var instanceof og2) {
            gl2Var = new wp2(gl2Var.zzi());
        }
        if (gl2Var2 instanceof og2) {
            gl2Var2 = new wp2(gl2Var2.zzi());
        }
        return (((gl2Var instanceof wp2) && (gl2Var2 instanceof wp2)) || !(Double.isNaN(gl2Var.zzh().doubleValue()) || Double.isNaN(gl2Var2.zzh().doubleValue()))) && !d(gl2Var2, gl2Var);
    }

    @Override // com.daaw.it2
    public final gl2 a(String str, w07 w07Var, List list) {
        boolean c;
        boolean c2;
        ou7.h(ou7.e(str).name(), 2, list);
        gl2 b = w07Var.b((gl2) list.get(0));
        gl2 b2 = w07Var.b((gl2) list.get(1));
        int ordinal = ou7.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c2 = c(b, b2);
            } else if (ordinal == 42) {
                c = d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        c = d(b2, b);
                        break;
                    case 38:
                        c = e(b2, b);
                        break;
                    case 39:
                        c = ou7.l(b, b2);
                        break;
                    case 40:
                        c2 = ou7.l(b, b2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                c = e(b, b2);
            }
            c = !c2;
        } else {
            c = c(b, b2);
        }
        return c ? gl2.l : gl2.m;
    }
}
