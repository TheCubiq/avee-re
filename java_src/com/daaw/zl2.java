package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class zl2 extends tj2 {
    public long a;
    public long b;

    public zl2(String str) {
        this.a = -1L;
        this.b = -1L;
        HashMap a = tj2.a(str);
        if (a != null) {
            this.a = ((Long) a.get(0)).longValue();
            this.b = ((Long) a.get(1)).longValue();
        }
    }

    @Override // com.daaw.tj2
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.a));
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }
}
