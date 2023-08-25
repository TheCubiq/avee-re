package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class ow2 extends it2 {
    public ow2() {
        this.a.add(db3.APPLY);
        this.a.add(db3.BLOCK);
        this.a.add(db3.BREAK);
        this.a.add(db3.CASE);
        this.a.add(db3.DEFAULT);
        this.a.add(db3.CONTINUE);
        this.a.add(db3.DEFINE_FUNCTION);
        this.a.add(db3.FN);
        this.a.add(db3.IF);
        this.a.add(db3.QUOTE);
        this.a.add(db3.RETURN);
        this.a.add(db3.SWITCH);
        this.a.add(db3.TERNARY);
    }

    public static gl2 c(w07 w07Var, List list) {
        ou7.i(db3.FN.name(), 2, list);
        gl2 b = w07Var.b((gl2) list.get(0));
        gl2 b2 = w07Var.b((gl2) list.get(1));
        if (b2 instanceof z72) {
            List o = ((z72) b2).o();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new ck2(b.zzi(), o, arrayList, w07Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
        if (r8.equals("continue") == false) goto L67;
     */
    @Override // com.daaw.it2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.gl2 a(java.lang.String r8, com.daaw.w07 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ow2.a(java.lang.String, com.daaw.w07, java.util.List):com.daaw.gl2");
    }
}
