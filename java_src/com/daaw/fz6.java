package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class fz6 {
    public final by6 a;
    public final ez6 b;

    public fz6(ez6 ez6Var) {
        ay6 ay6Var = ay6.q;
        this.b = ez6Var;
        this.a = ay6Var;
    }

    public static fz6 b(int i) {
        return new fz6(new bz6(4000));
    }

    public static fz6 c(by6 by6Var) {
        return new fz6(new zy6(by6Var));
    }

    public final Iterable d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new cz6(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        Iterator g = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.b.a(this, charSequence);
    }
}
