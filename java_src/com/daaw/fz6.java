package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class fz6 {

    /* renamed from: a */
    public final by6 f10113a;

    /* renamed from: b */
    public final ez6 f10114b;

    public fz6(ez6 ez6Var) {
        ay6 ay6Var = ay6.f4109q;
        this.f10114b = ez6Var;
        this.f10113a = ay6Var;
    }

    /* renamed from: b */
    public static fz6 m22123b(int i) {
        return new fz6(new bz6(4000));
    }

    /* renamed from: c */
    public static fz6 m22122c(by6 by6Var) {
        return new fz6(new zy6(by6Var));
    }

    /* renamed from: d */
    public final Iterable m22121d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new cz6(this, charSequence);
    }

    /* renamed from: f */
    public final List m22119f(CharSequence charSequence) {
        Iterator m22118g = m22118g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m22118g.hasNext()) {
            arrayList.add((String) m22118g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    public final Iterator m22118g(CharSequence charSequence) {
        return this.f10114b.mo1769a(this, charSequence);
    }
}
