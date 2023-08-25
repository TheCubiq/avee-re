package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class gw0 {

    /* renamed from: a */
    public final String f11772a;

    /* renamed from: b */
    public final long f11773b;

    /* renamed from: c */
    public final List<C1154e1> f11774c;

    /* renamed from: d */
    public final List<C2989sy> f11775d;

    public gw0(String str, long j, List<C1154e1> list, List<C2989sy> list2) {
        this.f11772a = str;
        this.f11773b = j;
        this.f11774c = Collections.unmodifiableList(list);
        this.f11775d = Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    public int m21197a(int i) {
        int size = this.f11774c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f11774c.get(i2).f8022b == i) {
                return i2;
            }
        }
        return -1;
    }
}
