package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class vj2 extends tj2 {

    /* renamed from: a */
    public String f30263a;

    /* renamed from: b */
    public long f30264b;

    /* renamed from: c */
    public String f30265c;

    /* renamed from: d */
    public String f30266d;

    /* renamed from: e */
    public String f30267e;

    public vj2() {
        this.f30263a = "E";
        this.f30264b = -1L;
        this.f30265c = "E";
        this.f30266d = "E";
        this.f30267e = "E";
    }

    public vj2(String str) {
        this.f30263a = "E";
        this.f30264b = -1L;
        this.f30265c = "E";
        this.f30266d = "E";
        this.f30267e = "E";
        HashMap m9077a = tj2.m9077a(str);
        if (m9077a != null) {
            this.f30263a = m9077a.get(0) == null ? "E" : (String) m9077a.get(0);
            this.f30264b = m9077a.get(1) != null ? ((Long) m9077a.get(1)).longValue() : -1L;
            this.f30265c = m9077a.get(2) == null ? "E" : (String) m9077a.get(2);
            this.f30266d = m9077a.get(3) == null ? "E" : (String) m9077a.get(3);
            this.f30267e = m9077a.get(4) != null ? (String) m9077a.get(4) : "E";
        }
    }

    @Override // com.daaw.tj2
    /* renamed from: b */
    public final HashMap mo2114b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f30263a);
        hashMap.put(4, this.f30267e);
        hashMap.put(3, this.f30266d);
        hashMap.put(2, this.f30265c);
        hashMap.put(1, Long.valueOf(this.f30264b));
        return hashMap;
    }
}
