package com.daaw;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class c67 extends o57 {
    @CheckForNull
    public List E;

    public c67(t17 t17Var, boolean z) {
        super(t17Var, true, true);
        List emptyList = t17Var.isEmpty() ? Collections.emptyList() : p27.a(t17Var.size());
        for (int i = 0; i < t17Var.size(); i++) {
            emptyList.add(null);
        }
        this.E = emptyList;
    }

    @Override // com.daaw.o57
    public final void Q(int i, Object obj) {
        List list = this.E;
        if (list != null) {
            list.set(i, new b67(obj));
        }
    }

    @Override // com.daaw.o57
    public final void R() {
        List list = this.E;
        if (list != null) {
            h(W(list));
        }
    }

    @Override // com.daaw.o57
    public final void V(int i) {
        super.V(i);
        this.E = null;
    }

    public abstract Object W(List list);
}
