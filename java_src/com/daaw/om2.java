package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class om2 extends tj2 {
    public Long a;
    public Boolean b;
    public Boolean c;

    public om2(String str) {
        HashMap a = tj2.a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Boolean) a.get(1);
            this.c = (Boolean) a.get(2);
        }
    }

    @Override // com.daaw.tj2
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        return hashMap;
    }
}
