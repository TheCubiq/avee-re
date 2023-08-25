package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ro1 implements th1 {

    /* renamed from: q */
    public static final ro1 f25449q = new ro1();

    /* renamed from: p */
    public final List<C2099ln> f25450p;

    public ro1() {
        this.f25450p = Collections.emptyList();
    }

    public ro1(C2099ln c2099ln) {
        this.f25450p = Collections.singletonList(c2099ln);
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
        return j >= 0 ? this.f25450p : Collections.emptyList();
    }

    @Override // com.daaw.th1
    /* renamed from: d */
    public int mo3750d() {
        return 1;
    }
}
