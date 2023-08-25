package com.daaw;

import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class t57 extends q57 {
    public /* synthetic */ t57(s57 s57Var) {
        super(null);
    }

    @Override // com.daaw.q57
    public final int a(u57 u57Var) {
        int i;
        int i2;
        synchronized (u57Var) {
            i = u57Var.x;
            i2 = i - 1;
            u57Var.x = i2;
        }
        return i2;
    }

    @Override // com.daaw.q57
    public final void b(u57 u57Var, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (u57Var) {
            set3 = u57Var.w;
            if (set3 == null) {
                u57Var.w = set2;
            }
        }
    }
}
