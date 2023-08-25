package com.daaw;

import java.io.IOException;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class cz6 implements Iterable {

    /* renamed from: p */
    public final /* synthetic */ CharSequence f6313p;

    /* renamed from: q */
    public final /* synthetic */ fz6 f6314q;

    public cz6(fz6 fz6Var, CharSequence charSequence) {
        this.f6314q = fz6Var;
        this.f6313p = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator m22118g;
        m22118g = this.f6314q.m22118g(this.f6313p);
        return m22118g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence m22133a = fy6.m22133a(it.next(), ", ");
                while (true) {
                    sb.append(m22133a);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ", ");
                    m22133a = fy6.m22133a(it.next(), ", ");
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
