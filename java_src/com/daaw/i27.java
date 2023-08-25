package com.daaw;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class i27 extends lz6 {

    /* renamed from: r */
    public final /* synthetic */ Iterator f13208r;

    /* renamed from: s */
    public final /* synthetic */ ty6 f13209s;

    public i27(Iterator it, ty6 ty6Var) {
        this.f13208r = it;
        this.f13209s = ty6Var;
    }

    @Override // com.daaw.lz6
    @CheckForNull
    /* renamed from: a */
    public final Object mo16353a() {
        while (this.f13208r.hasNext()) {
            Object next = this.f13208r.next();
            if (this.f13209s.zza(next)) {
                return next;
            }
        }
        m16352b();
        return null;
    }
}
