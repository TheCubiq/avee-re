package com.daaw;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class at extends dt {
    public final List<vh<?>> p;

    public at(List<vh<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.p = list;
    }
}
