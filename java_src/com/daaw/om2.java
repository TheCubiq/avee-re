package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class om2 extends tj2 {

    /* renamed from: a */
    public Long f21654a;

    /* renamed from: b */
    public Boolean f21655b;

    /* renamed from: c */
    public Boolean f21656c;

    public om2(String str) {
        HashMap m9077a = tj2.m9077a(str);
        if (m9077a != null) {
            this.f21654a = (Long) m9077a.get(0);
            this.f21655b = (Boolean) m9077a.get(1);
            this.f21656c = (Boolean) m9077a.get(2);
        }
    }

    @Override // com.daaw.tj2
    /* renamed from: b */
    public final HashMap mo2114b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f21654a);
        hashMap.put(1, this.f21655b);
        hashMap.put(2, this.f21656c);
        return hashMap;
    }
}
