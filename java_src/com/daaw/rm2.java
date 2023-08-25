package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class rm2 extends tj2 {

    /* renamed from: a */
    public Long f25411a;

    /* renamed from: b */
    public Long f25412b;

    public rm2(String str) {
        HashMap m9077a = tj2.m9077a(str);
        if (m9077a != null) {
            this.f25411a = (Long) m9077a.get(0);
            this.f25412b = (Long) m9077a.get(1);
        }
    }

    @Override // com.daaw.tj2
    /* renamed from: b */
    public final HashMap mo2114b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f25411a);
        hashMap.put(1, this.f25412b);
        return hashMap;
    }
}
