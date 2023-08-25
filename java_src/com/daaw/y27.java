package com.daaw;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class y27 extends c37 {

    /* renamed from: a */
    public final /* synthetic */ Comparator f33235a;

    public y27(Comparator comparator) {
        this.f33235a = comparator;
    }

    @Override // com.daaw.c37
    /* renamed from: a */
    public final Map mo4233a() {
        return new TreeMap(this.f33235a);
    }
}
