package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class e1 {
    public final int a;
    public final int b;
    public final List<j41> c;
    public final List<jt> d;
    public final List<jt> e;

    public e1(int i, int i2, List<j41> list, List<jt> list2, List<jt> list3) {
        this.a = i;
        this.b = i2;
        this.c = Collections.unmodifiableList(list);
        this.d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.e = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
    }
}
