package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class ow2 extends it2 {
    public ow2() {
        this.f13989a.add(db3.APPLY);
        this.f13989a.add(db3.BLOCK);
        this.f13989a.add(db3.BREAK);
        this.f13989a.add(db3.CASE);
        this.f13989a.add(db3.DEFAULT);
        this.f13989a.add(db3.CONTINUE);
        this.f13989a.add(db3.DEFINE_FUNCTION);
        this.f13989a.add(db3.FN);
        this.f13989a.add(db3.IF);
        this.f13989a.add(db3.QUOTE);
        this.f13989a.add(db3.RETURN);
        this.f13989a.add(db3.SWITCH);
        this.f13989a.add(db3.TERNARY);
    }

    /* renamed from: c */
    public static gl2 m13903c(w07 w07Var, List list) {
        ou7.m13915i(db3.FN.name(), 2, list);
        gl2 m6608b = w07Var.m6608b((gl2) list.get(0));
        gl2 m6608b2 = w07Var.m6608b((gl2) list.get(1));
        if (m6608b2 instanceof z72) {
            List m2700o = ((z72) m6608b2).m2700o();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new ck2(m6608b.zzi(), m2700o, arrayList, w07Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", m6608b2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
        if (r8.equals("continue") == false) goto L67;
     */
    @Override // com.daaw.it2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gl2 mo3983a(String str, w07 w07Var, List list) {
        gl2 m6608b;
        db3 db3Var = db3.ADD;
        int ordinal = ou7.m13919e(str).ordinal();
        if (ordinal == 2) {
            ou7.m13916h(db3.APPLY.name(), 3, list);
            gl2 m6608b2 = w07Var.m6608b((gl2) list.get(0));
            String zzi = w07Var.m6608b((gl2) list.get(1)).zzi();
            gl2 m6608b3 = w07Var.m6608b((gl2) list.get(2));
            if (m6608b3 instanceof z72) {
                if (zzi.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return m6608b2.mo2708d(zzi, w07Var, ((z72) m6608b3).m2700o());
            }
            throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", m6608b3.getClass().getCanonicalName()));
        } else if (ordinal == 15) {
            ou7.m13916h(db3.BREAK.name(), 0, list);
            return gl2.f11422i;
        } else if (ordinal != 25) {
            if (ordinal == 41) {
                ou7.m13915i(db3.IF.name(), 2, list);
                gl2 m6608b4 = w07Var.m6608b((gl2) list.get(0));
                gl2 m6608b5 = w07Var.m6608b((gl2) list.get(1));
                gl2 m6608b6 = list.size() > 2 ? w07Var.m6608b((gl2) list.get(2)) : null;
                gl2 gl2Var = gl2.f11420g;
                gl2 m6607c = m6608b4.zzg().booleanValue() ? w07Var.m6607c((z72) m6608b5) : m6608b6 != null ? w07Var.m6607c((z72) m6608b6) : gl2Var;
                return m6607c instanceof oa2 ? m6607c : gl2Var;
            } else if (ordinal != 54) {
                if (ordinal == 57) {
                    if (list.isEmpty()) {
                        return gl2.f11424k;
                    }
                    ou7.m13916h(db3.RETURN.name(), 1, list);
                    return new oa2("return", w07Var.m6608b((gl2) list.get(0)));
                }
                if (ordinal != 19) {
                    if (ordinal == 20) {
                        ou7.m13915i(db3.DEFINE_FUNCTION.name(), 2, list);
                        gl2 m13903c = m13903c(w07Var, list);
                        ad2 ad2Var = (ad2) m13903c;
                        w07Var.m6603g(ad2Var.m27518b() == null ? "" : ad2Var.m27518b(), m13903c);
                        return m13903c;
                    } else if (ordinal == 60) {
                        ou7.m13916h(db3.SWITCH.name(), 3, list);
                        gl2 m6608b7 = w07Var.m6608b((gl2) list.get(0));
                        gl2 m6608b8 = w07Var.m6608b((gl2) list.get(1));
                        gl2 m6608b9 = w07Var.m6608b((gl2) list.get(2));
                        if (m6608b8 instanceof z72) {
                            if (m6608b9 instanceof z72) {
                                z72 z72Var = (z72) m6608b8;
                                z72 z72Var2 = (z72) m6608b9;
                                int i = 0;
                                boolean z = false;
                                while (true) {
                                    if (i >= z72Var.m2704j()) {
                                        if (z72Var.m2704j() + 1 == z72Var2.m2704j()) {
                                            m6608b = w07Var.m6608b(z72Var2.m2703k(z72Var.m2704j()));
                                            if (m6608b instanceof oa2) {
                                                String m14432b = ((oa2) m6608b).m14432b();
                                                if (!m14432b.equals("return")) {
                                                }
                                            }
                                        }
                                        return gl2.f11420g;
                                    }
                                    if (z || m6608b7.equals(w07Var.m6608b(z72Var.m2703k(i)))) {
                                        m6608b = w07Var.m6608b(z72Var2.m2703k(i));
                                        if (!(m6608b instanceof oa2)) {
                                            z = true;
                                        } else if (((oa2) m6608b).m14432b().equals("break")) {
                                            return gl2.f11420g;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    i++;
                                }
                                return m6608b;
                            }
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                    } else if (ordinal == 61) {
                        ou7.m13916h(db3.TERNARY.name(), 3, list);
                        return w07Var.m6608b((gl2) (w07Var.m6608b((gl2) list.get(0)).zzg().booleanValue() ? list.get(1) : list.get(2)));
                    } else {
                        switch (ordinal) {
                            case 11:
                                return w07Var.m6609a().m6607c(new z72(list));
                            case 12:
                                ou7.m13916h(db3.BREAK.name(), 0, list);
                                return gl2.f11423j;
                            case 13:
                                break;
                            default:
                                return super.m19432b(str);
                        }
                    }
                }
                if (!list.isEmpty()) {
                    gl2 m6608b10 = w07Var.m6608b((gl2) list.get(0));
                    if (m6608b10 instanceof z72) {
                        return w07Var.m6607c((z72) m6608b10);
                    }
                }
                return gl2.f11420g;
            } else {
                return new z72(list);
            }
        } else {
            return m13903c(w07Var, list);
        }
    }
}
