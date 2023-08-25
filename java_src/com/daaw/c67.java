package com.daaw;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class c67 extends o57 {
    @CheckForNull

    /* renamed from: E */
    public List f5556E;

    public c67(t17 t17Var, boolean z) {
        super(t17Var, true, true);
        List emptyList = t17Var.isEmpty() ? Collections.emptyList() : p27.m13723a(t17Var.size());
        for (int i = 0; i < t17Var.size(); i++) {
            emptyList.add(null);
        }
        this.f5556E = emptyList;
    }

    @Override // com.daaw.o57
    /* renamed from: Q */
    public final void mo14546Q(int i, Object obj) {
        List list = this.f5556E;
        if (list != null) {
            list.set(i, new b67(obj));
        }
    }

    @Override // com.daaw.o57
    /* renamed from: R */
    public final void mo14545R() {
        List list = this.f5556E;
        if (list != null) {
            mo14486h(mo5515W(list));
        }
    }

    @Override // com.daaw.o57
    /* renamed from: V */
    public final void mo14541V(int i) {
        super.mo14541V(i);
        this.f5556E = null;
    }

    /* renamed from: W */
    public abstract Object mo5515W(List list);
}
