package com.daaw;

import java.util.Map;
/* loaded from: classes2.dex */
public final class dg6 implements ck8 {
    public final /* synthetic */ String a;
    public final /* synthetic */ gh6 b;

    public dg6(gh6 gh6Var, String str) {
        this.b = gh6Var;
        this.a = str;
    }

    @Override // com.daaw.ck8
    public final String zza(String str) {
        Map map;
        map = this.b.d;
        Map map2 = (Map) map.get(this.a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
