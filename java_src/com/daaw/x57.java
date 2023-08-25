package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class x57 extends c67 {
    public x57(t17 t17Var, boolean z) {
        super(t17Var, true);
        m14544S();
    }

    @Override // com.daaw.c67
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo5515W(List list) {
        ArrayList m13723a = p27.m13723a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b67 b67Var = (b67) it.next();
            m13723a.add(b67Var != null ? b67Var.f4376a : null);
        }
        return Collections.unmodifiableList(m13723a);
    }
}
