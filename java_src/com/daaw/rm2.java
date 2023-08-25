package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class rm2 extends tj2 {
    public Long a;
    public Long b;

    public rm2(String str) {
        HashMap a = tj2.a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Long) a.get(1);
        }
    }

    @Override // com.daaw.tj2
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        return hashMap;
    }
}
