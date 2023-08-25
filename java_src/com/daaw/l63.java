package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class l63 extends it2 {
    public l63() {
        this.f13989a.add(db3.FOR_IN);
        this.f13989a.add(db3.FOR_IN_CONST);
        this.f13989a.add(db3.FOR_IN_LET);
        this.f13989a.add(db3.FOR_LET);
        this.f13989a.add(db3.FOR_OF);
        this.f13989a.add(db3.FOR_OF_CONST);
        this.f13989a.add(db3.FOR_OF_LET);
        this.f13989a.add(db3.WHILE);
    }

    /* renamed from: c */
    public static gl2 m17127c(b43 b43Var, Iterator it, gl2 gl2Var) {
        if (it != null) {
            while (it.hasNext()) {
                gl2 m6607c = b43Var.mo6591a((gl2) it.next()).m6607c((z72) gl2Var);
                if (m6607c instanceof oa2) {
                    oa2 oa2Var = (oa2) m6607c;
                    if ("break".equals(oa2Var.m14432b())) {
                        return gl2.f11420g;
                    }
                    if ("return".equals(oa2Var.m14432b())) {
                        return oa2Var;
                    }
                }
            }
        }
        return gl2.f11420g;
    }

    /* renamed from: d */
    public static gl2 m17126d(b43 b43Var, gl2 gl2Var, gl2 gl2Var2) {
        return m17127c(b43Var, gl2Var.zzl(), gl2Var2);
    }

    /* renamed from: e */
    public static gl2 m17125e(b43 b43Var, gl2 gl2Var, gl2 gl2Var2) {
        if (gl2Var instanceof Iterable) {
            return m17127c(b43Var, ((Iterable) gl2Var).iterator(), gl2Var2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.daaw.it2
    /* renamed from: a */
    public final gl2 mo3983a(String str, w07 w07Var, List list) {
        db3 db3Var = db3.ADD;
        int ordinal = ou7.m13919e(str).ordinal();
        if (ordinal == 65) {
            ou7.m13916h(db3.WHILE.name(), 4, list);
            gl2 gl2Var = (gl2) list.get(0);
            gl2 gl2Var2 = (gl2) list.get(1);
            gl2 m6608b = w07Var.m6608b((gl2) list.get(3));
            if (w07Var.m6608b((gl2) list.get(2)).zzg().booleanValue()) {
                gl2 m6607c = w07Var.m6607c((z72) m6608b);
                if (m6607c instanceof oa2) {
                    oa2 oa2Var = (oa2) m6607c;
                    if (!"break".equals(oa2Var.m14432b())) {
                        if ("return".equals(oa2Var.m14432b())) {
                            return oa2Var;
                        }
                    }
                    return gl2.f11420g;
                }
            }
            while (w07Var.m6608b(gl2Var).zzg().booleanValue()) {
                gl2 m6607c2 = w07Var.m6607c((z72) m6608b);
                if (m6607c2 instanceof oa2) {
                    oa2 oa2Var2 = (oa2) m6607c2;
                    if ("break".equals(oa2Var2.m14432b())) {
                        break;
                    } else if ("return".equals(oa2Var2.m14432b())) {
                        return oa2Var2;
                    }
                }
                w07Var.m6608b(gl2Var2);
            }
            return gl2.f11420g;
        }
        switch (ordinal) {
            case 26:
                ou7.m13916h(db3.FOR_IN.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi = ((gl2) list.get(0)).zzi();
                    return m17126d(new g53(w07Var, zzi), w07Var.m6608b((gl2) list.get(1)), w07Var.m6608b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 27:
                ou7.m13916h(db3.FOR_IN_CONST.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi2 = ((gl2) list.get(0)).zzi();
                    return m17126d(new w13(w07Var, zzi2), w07Var.m6608b((gl2) list.get(1)), w07Var.m6608b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 28:
                ou7.m13916h(db3.FOR_IN_LET.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi3 = ((gl2) list.get(0)).zzi();
                    return m17126d(new a33(w07Var, zzi3), w07Var.m6608b((gl2) list.get(1)), w07Var.m6608b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 29:
                ou7.m13916h(db3.FOR_LET.name(), 4, list);
                gl2 m6608b2 = w07Var.m6608b((gl2) list.get(0));
                if (m6608b2 instanceof z72) {
                    z72 z72Var = (z72) m6608b2;
                    gl2 gl2Var3 = (gl2) list.get(1);
                    gl2 gl2Var4 = (gl2) list.get(2);
                    gl2 m6608b3 = w07Var.m6608b((gl2) list.get(3));
                    w07 m6609a = w07Var.m6609a();
                    for (int i = 0; i < z72Var.m2704j(); i++) {
                        String zzi4 = z72Var.m2703k(i).zzi();
                        m6609a.m6603g(zzi4, w07Var.m6606d(zzi4));
                    }
                    while (w07Var.m6608b(gl2Var3).zzg().booleanValue()) {
                        gl2 m6607c3 = w07Var.m6607c((z72) m6608b3);
                        if (m6607c3 instanceof oa2) {
                            oa2 oa2Var3 = (oa2) m6607c3;
                            if ("break".equals(oa2Var3.m14432b())) {
                                return gl2.f11420g;
                            }
                            if ("return".equals(oa2Var3.m14432b())) {
                                return oa2Var3;
                            }
                        }
                        w07 m6609a2 = w07Var.m6609a();
                        for (int i2 = 0; i2 < z72Var.m2704j(); i2++) {
                            String zzi5 = z72Var.m2703k(i2).zzi();
                            m6609a2.m6603g(zzi5, m6609a.m6606d(zzi5));
                        }
                        m6609a2.m6608b(gl2Var4);
                        m6609a = m6609a2;
                    }
                    return gl2.f11420g;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 30:
                ou7.m13916h(db3.FOR_OF.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi6 = ((gl2) list.get(0)).zzi();
                    return m17125e(new g53(w07Var, zzi6), w07Var.m6608b((gl2) list.get(1)), w07Var.m6608b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 31:
                ou7.m13916h(db3.FOR_OF_CONST.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi7 = ((gl2) list.get(0)).zzi();
                    return m17125e(new w13(w07Var, zzi7), w07Var.m6608b((gl2) list.get(1)), w07Var.m6608b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 32:
                ou7.m13916h(db3.FOR_OF_LET.name(), 3, list);
                if (list.get(0) instanceof wp2) {
                    String zzi8 = ((gl2) list.get(0)).zzi();
                    return m17125e(new a33(w07Var, zzi8), w07Var.m6608b((gl2) list.get(1)), w07Var.m6608b((gl2) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            default:
                return super.m19432b(str);
        }
    }
}
