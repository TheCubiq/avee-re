package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class x57 extends c67 {
    public x57(t17 t17Var, boolean z) {
        super(t17Var, true);
        S();
    }

    @Override // com.daaw.c67
    public final /* bridge */ /* synthetic */ Object W(List list) {
        ArrayList a = p27.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b67 b67Var = (b67) it.next();
            a.add(b67Var != null ? b67Var.a : null);
        }
        return Collections.unmodifiableList(a);
    }
}
