package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class gw0 {
    public final String a;
    public final long b;
    public final List<e1> c;
    public final List<sy> d;

    public gw0(String str, long j, List<e1> list, List<sy> list2) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
    }

    public int a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.c.get(i2).b == i) {
                return i2;
            }
        }
        return -1;
    }
}
