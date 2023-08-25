package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class gt7 extends lt7 {
    public /* synthetic */ gt7(ft7 ft7Var) {
        super(null);
    }

    @Override // com.daaw.lt7
    /* renamed from: a */
    public final List mo16561a(Object obj, long j) {
        us7 us7Var = (us7) gw7.m21170p(obj, j);
        if (us7Var.zzc()) {
            return us7Var;
        }
        int size = us7Var.size();
        us7 mo7741b = us7Var.mo7741b(size == 0 ? 10 : size + size);
        gw7.m21190D(obj, j, mo7741b);
        return mo7741b;
    }

    @Override // com.daaw.lt7
    /* renamed from: b */
    public final void mo16560b(Object obj, long j) {
        ((us7) gw7.m21170p(obj, j)).zzb();
    }

    @Override // com.daaw.lt7
    /* renamed from: c */
    public final void mo16559c(Object obj, Object obj2, long j) {
        us7 us7Var = (us7) gw7.m21170p(obj, j);
        us7 us7Var2 = (us7) gw7.m21170p(obj2, j);
        int size = us7Var.size();
        int size2 = us7Var2.size();
        if (size > 0 && size2 > 0) {
            if (!us7Var.zzc()) {
                us7Var = us7Var.mo7741b(size2 + size);
            }
            us7Var.addAll(us7Var2);
        }
        if (size > 0) {
            us7Var2 = us7Var;
        }
        gw7.m21190D(obj, j, us7Var2);
    }
}
