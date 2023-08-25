package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class bm4 implements cm4 {
    public final Map a;

    public bm4(Map map) {
        this.a = map;
    }

    @Override // com.daaw.cm4
    public final qq5 a(int i, String str) {
        return (qq5) this.a.get(str);
    }
}
