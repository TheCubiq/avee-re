package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class gt7 extends lt7 {
    public /* synthetic */ gt7(ft7 ft7Var) {
        super(null);
    }

    @Override // com.daaw.lt7
    public final List a(Object obj, long j) {
        us7 us7Var = (us7) gw7.p(obj, j);
        if (us7Var.zzc()) {
            return us7Var;
        }
        int size = us7Var.size();
        us7 b = us7Var.b(size == 0 ? 10 : size + size);
        gw7.D(obj, j, b);
        return b;
    }

    @Override // com.daaw.lt7
    public final void b(Object obj, long j) {
        ((us7) gw7.p(obj, j)).zzb();
    }

    @Override // com.daaw.lt7
    public final void c(Object obj, Object obj2, long j) {
        us7 us7Var = (us7) gw7.p(obj, j);
        us7 us7Var2 = (us7) gw7.p(obj2, j);
        int size = us7Var.size();
        int size2 = us7Var2.size();
        if (size > 0 && size2 > 0) {
            if (!us7Var.zzc()) {
                us7Var = us7Var.b(size2 + size);
            }
            us7Var.addAll(us7Var2);
        }
        if (size > 0) {
            us7Var2 = us7Var;
        }
        gw7.D(obj, j, us7Var2);
    }
}
