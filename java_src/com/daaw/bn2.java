package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class bn2 extends tj2 {

    /* renamed from: a */
    public Long f4975a;

    /* renamed from: b */
    public Long f4976b;

    /* renamed from: c */
    public Long f4977c;

    /* renamed from: d */
    public Long f4978d;

    /* renamed from: e */
    public Long f4979e;

    public bn2(String str) {
        HashMap m9077a = tj2.m9077a(str);
        if (m9077a != null) {
            this.f4975a = (Long) m9077a.get(0);
            this.f4976b = (Long) m9077a.get(1);
            this.f4977c = (Long) m9077a.get(2);
            this.f4978d = (Long) m9077a.get(3);
            this.f4979e = (Long) m9077a.get(4);
        }
    }

    @Override // com.daaw.tj2
    /* renamed from: b */
    public final HashMap mo2114b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f4975a);
        hashMap.put(1, this.f4976b);
        hashMap.put(2, this.f4977c);
        hashMap.put(3, this.f4978d);
        hashMap.put(4, this.f4979e);
        return hashMap;
    }
}
