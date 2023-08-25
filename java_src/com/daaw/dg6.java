package com.daaw;

import java.util.Map;
/* loaded from: classes2.dex */
public final class dg6 implements ck8 {

    /* renamed from: a */
    public final /* synthetic */ String f7049a;

    /* renamed from: b */
    public final /* synthetic */ gh6 f7050b;

    public dg6(gh6 gh6Var, String str) {
        this.f7050b = gh6Var;
        this.f7049a = str;
    }

    @Override // com.daaw.ck8
    public final String zza(String str) {
        Map map;
        map = this.f7050b.f11274d;
        Map map2 = (Map) map.get(this.f7049a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
