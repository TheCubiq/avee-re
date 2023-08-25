package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class nf3 implements zg3 {
    public final of3 a;

    public nf3(of3 of3Var) {
        this.a = of3Var;
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            k04.zzj("App event with no name parameter.");
        } else {
            this.a.W(str, (String) map.get("info"));
        }
    }
}
