package com.daaw;

import java.io.IOException;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class cz6 implements Iterable {
    public final /* synthetic */ CharSequence p;
    public final /* synthetic */ fz6 q;

    public cz6(fz6 fz6Var, CharSequence charSequence) {
        this.q = fz6Var;
        this.p = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator g;
        g = this.q.g(this.p);
        return g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence a = fy6.a(it.next(), ", ");
                while (true) {
                    sb.append(a);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ", ");
                    a = fy6.a(it.next(), ", ");
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
