package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class zl2 extends tj2 {

    /* renamed from: a */
    public long f35200a;

    /* renamed from: b */
    public long f35201b;

    public zl2(String str) {
        this.f35200a = -1L;
        this.f35201b = -1L;
        HashMap m9077a = tj2.m9077a(str);
        if (m9077a != null) {
            this.f35200a = ((Long) m9077a.get(0)).longValue();
            this.f35201b = ((Long) m9077a.get(1)).longValue();
        }
    }

    @Override // com.daaw.tj2
    /* renamed from: b */
    public final HashMap mo2114b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.f35200a));
        hashMap.put(1, Long.valueOf(this.f35201b));
        return hashMap;
    }
}
