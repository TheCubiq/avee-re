package com.daaw;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class y93 extends it2 {
    public y93() {
        this.a.add(db3.ASSIGN);
        this.a.add(db3.CONST);
        this.a.add(db3.CREATE_ARRAY);
        this.a.add(db3.CREATE_OBJECT);
        this.a.add(db3.EXPRESSION_LIST);
        this.a.add(db3.GET);
        this.a.add(db3.GET_INDEX);
        this.a.add(db3.GET_PROPERTY);
        this.a.add(db3.NULL);
        this.a.add(db3.SET_PROPERTY);
        this.a.add(db3.TYPEOF);
        this.a.add(db3.UNDEFINED);
        this.a.add(db3.VAR);
    }

    @Override // com.daaw.it2
    public final gl2 a(String str, w07 w07Var, List list) {
        String str2;
        db3 db3Var = db3.ADD;
        int ordinal = ou7.e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            ou7.h(db3.ASSIGN.name(), 2, list);
            gl2 b = w07Var.b((gl2) list.get(0));
            if (b instanceof wp2) {
                if (w07Var.h(b.zzi())) {
                    gl2 b2 = w07Var.b((gl2) list.get(1));
                    w07Var.g(b.zzi(), b2);
                    return b2;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b.zzi()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b.getClass().getCanonicalName()));
        } else if (ordinal == 14) {
            ou7.i(db3.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    gl2 b3 = w07Var.b((gl2) list.get(i2));
                    if (!(b3 instanceof wp2)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b3.getClass().getCanonicalName()));
                    }
                    w07Var.f(b3.zzi(), w07Var.b((gl2) list.get(i2 + 1)));
                }
                return gl2.g;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            ou7.i(db3.EXPRESSION_LIST.name(), 1, list);
            gl2 gl2Var = gl2.g;
            while (i < list.size()) {
                gl2Var = w07Var.b((gl2) list.get(i));
                if (gl2Var instanceof oa2) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return gl2Var;
        } else if (ordinal == 33) {
            ou7.h(db3.GET.name(), 1, list);
            gl2 b4 = w07Var.b((gl2) list.get(0));
            if (b4 instanceof wp2) {
                return w07Var.d(b4.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b4.getClass().getCanonicalName()));
        } else if (ordinal == 49) {
            ou7.h(db3.NULL.name(), 0, list);
            return gl2.h;
        } else if (ordinal == 58) {
            ou7.h(db3.SET_PROPERTY.name(), 3, list);
            gl2 b5 = w07Var.b((gl2) list.get(0));
            gl2 b6 = w07Var.b((gl2) list.get(1));
            gl2 b7 = w07Var.b((gl2) list.get(2));
            if (b5 == gl2.g || b5 == gl2.h) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", b6.zzi(), b5.zzi()));
            }
            if ((b5 instanceof z72) && (b6 instanceof tb2)) {
                ((z72) b5).s(b6.zzh().intValue(), b7);
            } else if (b5 instanceof og2) {
                ((og2) b5).h(b6.zzi(), b7);
            }
            return b7;
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new z72();
            }
            z72 z72Var = new z72();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gl2 b8 = w07Var.b((gl2) it.next());
                if (b8 instanceof oa2) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                z72Var.s(i, b8);
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
                    gl2 b9 = w07Var.b((gl2) list.get(i));
                    gl2 b10 = w07Var.b((gl2) list.get(i + 1));
                    if ((b9 instanceof oa2) || (b10 instanceof oa2)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    th2Var.h(b9.zzi(), b10);
                    i += 2;
                }
                return th2Var;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 35 || ordinal == 36) {
            ou7.h(db3.GET_PROPERTY.name(), 2, list);
            gl2 b11 = w07Var.b((gl2) list.get(0));
            gl2 b12 = w07Var.b((gl2) list.get(1));
            if ((b11 instanceof z72) && ou7.k(b12)) {
                return ((z72) b11).k(b12.zzh().intValue());
            }
            if (b11 instanceof og2) {
                return ((og2) b11).f(b12.zzi());
            }
            if (b11 instanceof wp2) {
                if ("length".equals(b12.zzi())) {
                    return new tb2(Double.valueOf(b11.zzi().length()));
                }
                if (ou7.k(b12) && b12.zzh().doubleValue() < b11.zzi().length()) {
                    return new wp2(String.valueOf(b11.zzi().charAt(b12.zzh().intValue())));
                }
            }
            return gl2.g;
        } else {
            switch (ordinal) {
                case 62:
                    ou7.h(db3.TYPEOF.name(), 1, list);
                    gl2 b13 = w07Var.b((gl2) list.get(0));
                    if (b13 instanceof br2) {
                        str2 = AdError.UNDEFINED_DOMAIN;
                    } else if (b13 instanceof g92) {
                        str2 = "boolean";
                    } else if (b13 instanceof tb2) {
                        str2 = "number";
                    } else if (b13 instanceof wp2) {
                        str2 = "string";
                    } else if (b13 instanceof ck2) {
                        str2 = "function";
                    } else if ((b13 instanceof km2) || (b13 instanceof oa2)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b13));
                    } else {
                        str2 = "object";
                    }
                    return new wp2(str2);
                case 63:
                    ou7.h(db3.UNDEFINED.name(), 0, list);
                    return gl2.g;
                case 64:
                    ou7.i(db3.VAR.name(), 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        gl2 b14 = w07Var.b((gl2) it2.next());
                        if (!(b14 instanceof wp2)) {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b14.getClass().getCanonicalName()));
                        }
                        w07Var.e(b14.zzi(), gl2.g);
                    }
                    return gl2.g;
                default:
                    return super.b(str);
            }
        }
    }
}
