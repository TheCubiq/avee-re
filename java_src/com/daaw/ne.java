package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ne implements th1 {
    public final List<ln> p;

    public ne(List<ln> list) {
        this.p = list;
    }

    @Override // com.daaw.th1
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.daaw.th1
    public long b(int i) {
        s6.a(i == 0);
        return 0L;
    }

    @Override // com.daaw.th1
    public List<ln> c(long j) {
        return j >= 0 ? this.p : Collections.emptyList();
    }

    @Override // com.daaw.th1
    public int d() {
        return 1;
    }
}
