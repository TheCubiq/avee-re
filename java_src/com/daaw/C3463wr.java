package com.daaw;

import com.daaw.tb1;
import org.json.JSONObject;
/* renamed from: com.daaw.wr */
/* loaded from: classes2.dex */
public class C3463wr implements yb1 {
    /* renamed from: b */
    public static tb1 m5842b(InterfaceC2196mn interfaceC2196mn) {
        return new tb1(3600000 + interfaceC2196mn.mo6059a(), new tb1.C3043b(8, 4), new tb1.C3042a(true, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.daaw.yb1
    /* renamed from: a */
    public tb1 mo3943a(InterfaceC2196mn interfaceC2196mn, JSONObject jSONObject) {
        return m5842b(interfaceC2196mn);
    }
}
