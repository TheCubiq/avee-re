package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class bn2 extends tj2 {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;

    public bn2(String str) {
        HashMap a = tj2.a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Long) a.get(1);
            this.c = (Long) a.get(2);
            this.d = (Long) a.get(3);
            this.e = (Long) a.get(4);
        }
    }

    @Override // com.daaw.tj2
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        hashMap.put(3, this.d);
        hashMap.put(4, this.e);
        return hashMap;
    }
}
