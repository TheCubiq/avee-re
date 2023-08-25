package com.daaw;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class y93 extends it2 {
    public y93() {
        this.f13989a.add(db3.ASSIGN);
        this.f13989a.add(db3.CONST);
        this.f13989a.add(db3.CREATE_ARRAY);
        this.f13989a.add(db3.CREATE_OBJECT);
        this.f13989a.add(db3.EXPRESSION_LIST);
        this.f13989a.add(db3.GET);
        this.f13989a.add(db3.GET_INDEX);
        this.f13989a.add(db3.GET_PROPERTY);
        this.f13989a.add(db3.NULL);
        this.f13989a.add(db3.SET_PROPERTY);
        this.f13989a.add(db3.TYPEOF);
        this.f13989a.add(db3.UNDEFINED);
        this.f13989a.add(db3.VAR);
    }

    @Override // com.daaw.it2
    /* renamed from: a */
    public final gl2 mo3983a(String str, w07 w07Var, List list) {
        String str2;
        db3 db3Var = db3.ADD;
        int ordinal = ou7.m13919e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            ou7.m13916h(db3.ASSIGN.name(), 2, list);
            gl2 m6608b = w07Var.m6608b((gl2) list.get(0));
            if (m6608b instanceof wp2) {
                if (w07Var.m6602h(m6608b.zzi())) {
                    gl2 m6608b2 = w07Var.m6608b((gl2) list.get(1));
                    w07Var.m6603g(m6608b.zzi(), m6608b2);
                    return m6608b2;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", m6608b.zzi()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", m6608b.getClass().getCanonicalName()));
        } else if (ordinal == 14) {
            ou7.m13915i(db3.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    gl2 m6608b3 = w07Var.m6608b((gl2) list.get(i2));
                    if (!(m6608b3 instanceof wp2)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", m6608b3.getClass().getCanonicalName()));
                    }
                    w07Var.m6604f(m6608b3.zzi(), w07Var.m6608b((gl2) list.get(i2 + 1)));
                }
                return gl2.f11420g;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            ou7.m13915i(db3.EXPRESSION_LIST.name(), 1, list);
            gl2 gl2Var = gl2.f11420g;
            while (i < list.size()) {
                gl2Var = w07Var.m6608b((gl2) list.get(i));
                if (gl2Var instanceof oa2) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return gl2Var;
        } else if (ordinal == 33) {
            ou7.m13916h(db3.GET.name(), 1, list);
            gl2 m6608b4 = w07Var.m6608b((gl2) list.get(0));
            if (m6608b4 instanceof wp2) {
                return w07Var.m6606d(m6608b4.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", m6608b4.getClass().getCanonicalName()));
        } else if (ordinal == 49) {
            ou7.m13916h(db3.NULL.name(), 0, list);
            return gl2.f11421h;
        } else if (ordinal == 58) {
            ou7.m13916h(db3.SET_PROPERTY.name(), 3, list);
            gl2 m6608b5 = w07Var.m6608b((gl2) list.get(0));
            gl2 m6608b6 = w07Var.m6608b((gl2) list.get(1));
            gl2 m6608b7 = w07Var.m6608b((gl2) list.get(2));
            if (m6608b5 == gl2.f11420g || m6608b5 == gl2.f11421h) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", m6608b6.zzi(), m6608b5.zzi()));
            }
            if ((m6608b5 instanceof z72) && (m6608b6 instanceof tb2)) {
                ((z72) m6608b5).m2696s(m6608b6.zzh().intValue(), m6608b7);
            } else if (m6608b5 instanceof og2) {
                ((og2) m6608b5).mo2705h(m6608b6.zzi(), m6608b7);
            }
            return m6608b7;
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new z72();
            }
            z72 z72Var = new z72();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gl2 m6608b8 = w07Var.m6608b((gl2) it.next());
                if (m6608b8 instanceof oa2) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                z72Var.m2696s(i, m6608b8);
                i++;
            }
            return z72Var;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                return new th2();
            }
            if (list.size() % 2 == 0) {
                th2 th2Var = new th2();
                while (i < list.size() - 1) {
                    gl2 m6608b9 = w07Var.m6608b((gl2) list.get(i));
                    gl2 m6608b10 = w07Var.m6608b((gl2) list.get(i + 1));
                    if ((m6608b9 instanceof oa2) || (m6608b10 instanceof oa2)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    th2Var.mo2705h(m6608b9.zzi(), m6608b10);
                    i += 2;
                }
                return th2Var;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 35 || ordinal == 36) {
            ou7.m13916h(db3.GET_PROPERTY.name(), 2, list);
            gl2 m6608b11 = w07Var.m6608b((gl2) list.get(0));
            gl2 m6608b12 = w07Var.m6608b((gl2) list.get(1));
            if ((m6608b11 instanceof z72) && ou7.m13913k(m6608b12)) {
                return ((z72) m6608b11).m2703k(m6608b12.zzh().intValue());
            }
            if (m6608b11 instanceof og2) {
                return ((og2) m6608b11).mo2706f(m6608b12.zzi());
            }
            if (m6608b11 instanceof wp2) {
                if ("length".equals(m6608b12.zzi())) {
                    return new tb2(Double.valueOf(m6608b11.zzi().length()));
                }
                if (ou7.m13913k(m6608b12) && m6608b12.zzh().doubleValue() < m6608b11.zzi().length()) {
                    return new wp2(String.valueOf(m6608b11.zzi().charAt(m6608b12.zzh().intValue())));
                }
            }
            return gl2.f11420g;
        } else {
            switch (ordinal) {
                case 62:
                    ou7.m13916h(db3.TYPEOF.name(), 1, list);
                    gl2 m6608b13 = w07Var.m6608b((gl2) list.get(0));
                    if (m6608b13 instanceof br2) {
                        str2 = AdError.UNDEFINED_DOMAIN;
                    } else if (m6608b13 instanceof g92) {
                        str2 = "boolean";
                    } else if (m6608b13 instanceof tb2) {
                        str2 = "number";
                    } else if (m6608b13 instanceof wp2) {
                        str2 = "string";
                    } else if (m6608b13 instanceof ck2) {
                        str2 = "function";
                    } else if ((m6608b13 instanceof km2) || (m6608b13 instanceof oa2)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", m6608b13));
                    } else {
                        str2 = "object";
                    }
                    return new wp2(str2);
                case 63:
                    ou7.m13916h(db3.UNDEFINED.name(), 0, list);
                    return gl2.f11420g;
                case 64:
                    ou7.m13915i(db3.VAR.name(), 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        gl2 m6608b14 = w07Var.m6608b((gl2) it2.next());
                        if (!(m6608b14 instanceof wp2)) {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", m6608b14.getClass().getCanonicalName()));
                        }
                        w07Var.m6605e(m6608b14.zzi(), gl2.f11420g);
                    }
                    return gl2.f11420g;
                default:
                    return super.m19432b(str);
            }
        }
    }
}
