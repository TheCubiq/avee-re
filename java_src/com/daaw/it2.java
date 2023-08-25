package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class it2 {

    /* renamed from: a */
    public final List f13989a = new ArrayList();

    /* renamed from: a */
    public abstract gl2 mo3983a(String str, w07 w07Var, List list);

    /* renamed from: b */
    public final gl2 m19432b(String str) {
        if (this.f13989a.contains(ou7.m13919e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
