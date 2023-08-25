package com.daaw;

import java.util.Arrays;
import java.util.List;
/* renamed from: com.daaw.at */
/* loaded from: classes2.dex */
public class C0670at extends C1132dt {

    /* renamed from: p */
    public final List<C3330vh<?>> f3540p;

    public C0670at(List<C3330vh<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f3540p = list;
    }
}
