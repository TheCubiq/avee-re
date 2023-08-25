package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class ul2 extends tj2 {

    /* renamed from: a */
    public Long f29172a;

    /* renamed from: b */
    public Long f29173b;

    /* renamed from: c */
    public Long f29174c;

    public ul2(String str) {
        HashMap m9077a = tj2.m9077a(str);
        if (m9077a != null) {
            this.f29172a = (Long) m9077a.get(0);
            this.f29173b = (Long) m9077a.get(1);
            this.f29174c = (Long) m9077a.get(2);
        }
    }

    @Override // com.daaw.tj2
    /* renamed from: b */
    public final HashMap mo2114b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f29172a);
        hashMap.put(1, this.f29173b);
        hashMap.put(2, this.f29174c);
        return hashMap;
    }
}
