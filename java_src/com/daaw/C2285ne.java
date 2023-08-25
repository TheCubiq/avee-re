package com.daaw;

import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.ne */
/* loaded from: classes.dex */
public final class C2285ne implements th1 {

    /* renamed from: p */
    public final List<C2099ln> f20070p;

    public C2285ne(List<C2099ln> list) {
        this.f20070p = list;
    }

    @Override // com.daaw.th1
    /* renamed from: a */
    public int mo3753a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.daaw.th1
    /* renamed from: b */
    public long mo3752b(int i) {
        C2914s6.m10690a(i == 0);
        return 0L;
    }

    @Override // com.daaw.th1
    /* renamed from: c */
    public List<C2099ln> mo3751c(long j) {
        return j >= 0 ? this.f20070p : Collections.emptyList();
    }

    @Override // com.daaw.th1
    /* renamed from: d */
    public int mo3750d() {
        return 1;
    }
}
