package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class l63 extends it2 {
    public l63() {
        this.a.add(db3.FOR_IN);
        this.a.add(db3.FOR_IN_CONST);
        this.a.add(db3.FOR_IN_LET);
        this.a.add(db3.FOR_LET);
        this.a.add(db3.FOR_OF);
        this.a.add(db3.FOR_OF_CONST);
        this.a.add(db3.FOR_OF_LET);
        this.a.add(db3.WHILE);
    }

    public static gl2 c(b43 b43Var, Iterator it, gl2 gl2Var) {
        if (it != null) {
            while (it.hasNext()) {
                gl2 c = b43Var.a((gl2) it.next()).c((z72) gl2Var);
                if (c instanceof oa2) {
                    oa2 oa2Var = (oa2) c;
                    if ("break".equals(oa2Var.b())) {
                        return gl2.g;
                    }
                    if ("return".equals(oa2Var.b())) {
                        return oa2Var;
                    }
                }
            }
        }
        return gl2.g;
    }

    public static gl2 d(b43 b43Var, gl2 gl2Var, gl2 gl2Var2) {
        return c(b43Var, gl2Var.zzl(), gl2Var2);
    }

    public static gl2 e(b43 b43Var, gl2 gl2Var, gl2 gl2Var2) {
        if (gl2Var instanceof Iterable) {
            return c(b43Var, ((Iterable) gl2Var).iterator(), gl2Var2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.daaw.it2
    public final gl2 a(String str, w07 w07Var, List list) {
        db3 db3Var = db3.ADD;
        int ordinal = ou7.e(str).ordinal();
        if (ordinal == 65) {
            ou7.h(db3.WHILE.name(), 4, list);
            gl2 gl2Var = (gl2) list.get(0);
            gl2 gl2Var2 = (gl2) list.get(1);
            gl2 b = w07Var.b((gl2) list.get(3));
            if (w07Var.b((gl2) list.get(2)).zzg().booleanValue()) {
                gl2 c = w07Var.c((z72) b);
                if (c instanceof oa2) {
                    oa2 oa2Var = (oa2) c;
                    if (!"break".equals(oa2Var.b())) {
                        if ("return".equals(oa2Var.b())) {
                            return oa2Var;
                        }
                    }
                    return gl2.g;
                }
            }
            while (w07Var.b(gl2Var).zzg().booleanValue()) {
                gl2 c2 = w07Var.c((z72) b);
                if (c2 instanceof oa2) {
                    oa2 oa2Var2 = (oa2) c2;
                    if ("break".equals(oa2Var2.b())) {
                        break;
                    } else if ("return".equals(oa2Var2.b())) {
                        return oa2Var2;
                    }
                }
                w07Var.b(gl2Var2);
            }
            return gl2.g;
        }
        switch (ordinal) {
            case 26:
                ou7.h(db3.FOR_IN.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi = ((gl2) list.get(0)).zzi();
                    return d(new g53(w07Var, zzi), w07Var.b((gl2) list.get(1)), w07Var.b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 27:
                ou7.h(db3.FOR_IN_CONST.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi2 = ((gl2) list.get(0)).zzi();
                    return d(new w13(w07Var, zzi2), w07Var.b((gl2) list.get(1)), w07Var.b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 28:
                ou7.h(db3.FOR_IN_LET.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi3 = ((gl2) list.get(0)).zzi();
                    return d(new a33(w07Var, zzi3), w07Var.b((gl2) list.get(1)), w07Var.b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 29:
                ou7.h(db3.FOR_LET.name(), 4, list);
                gl2 b2 = w07Var.b((gl2) list.get(0));
                if (b2 instanceof z72) {
                    z72 z72Var = (z72) b2;
                    gl2 gl2Var3 = (gl2) list.get(1);
                    gl2 gl2Var4 = (gl2) list.get(2);
                    gl2 b3 = w07Var.b((gl2) list.get(3));
                    w07 a = w07Var.a();
                    for (int i = 0; i < z72Var.j(); i++) {
                        String zzi4 = z72Var.k(i).zzi();
                        a.g(zzi4, w07Var.d(zzi4));
                    }
                    while (w07Var.b(gl2Var3).zzg().booleanValue()) {
                        gl2 c3 = w07Var.c((z72) b3);
                        if (c3 instanceof oa2) {
                            oa2 oa2Var3 = (oa2) c3;
                            if ("break".equals(oa2Var3.b())) {
                                return gl2.g;
                            }
                            if ("return".equals(oa2Var3.b())) {
                                return oa2Var3;
                            }
                        }
                        w07 a2 = w07Var.a();
                        for (int i2 = 0; i2 < z72Var.j(); i2++) {
                            String zzi5 = z72Var.k(i2).zzi();
                            a2.g(zzi5, a.d(zzi5));
                        }
                        a2.b(gl2Var4);
                        a = a2;
                    }
                    return gl2.g;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 30:
                ou7.h(db3.FOR_OF.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi6 = ((gl2) list.get(0)).zzi();
                    return e(new g53(w07Var, zzi6), w07Var.b((gl2) list.get(1)), w07Var.b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 31:
                ou7.h(db3.FOR_OF_CONST.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi7 = ((gl2) list.get(0)).zzi();
                    return e(new w13(w07Var, zzi7), w07Var.b((gl2) list.get(1)), w07Var.b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 32:
                ou7.h(db3.FOR_OF_LET.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi8 = ((gl2) list.get(0)).zzi();
                    return e(new a33(w07Var, zzi8), w07Var.b((gl2) list.get(1)), w07Var.b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            default:
                return super.b(str);
        }
    }
}
