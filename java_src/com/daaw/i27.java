package com.daaw;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class i27 extends lz6 {
    public final /* synthetic */ Iterator r;
    public final /* synthetic */ ty6 s;

    public i27(Iterator it, ty6 ty6Var) {
        this.r = it;
        this.s = ty6Var;
    }

    @Override // com.daaw.lz6
    @CheckForNull
    public final Object a() {
        while (this.r.hasNext()) {
            Object next = this.r.next();
            if (this.s.zza(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
