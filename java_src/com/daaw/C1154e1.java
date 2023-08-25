package com.daaw;

import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.e1 */
/* loaded from: classes.dex */
public class C1154e1 {

    /* renamed from: a */
    public final int f8021a;

    /* renamed from: b */
    public final int f8022b;

    /* renamed from: c */
    public final List<j41> f8023c;

    /* renamed from: d */
    public final List<C1860jt> f8024d;

    /* renamed from: e */
    public final List<C1860jt> f8025e;

    public C1154e1(int i, int i2, List<j41> list, List<C1860jt> list2, List<C1860jt> list3) {
        this.f8021a = i;
        this.f8022b = i2;
        this.f8023c = Collections.unmodifiableList(list);
        this.f8024d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f8025e = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
    }
}
