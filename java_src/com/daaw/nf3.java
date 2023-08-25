package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class nf3 implements zg3 {

    /* renamed from: a */
    public final of3 f20087a;

    public nf3(of3 of3Var) {
        this.f20087a = of3Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            k04.zzj("App event with no name parameter.");
        } else {
            this.f20087a.mo2586W(str, (String) map.get("info"));
        }
    }
}
