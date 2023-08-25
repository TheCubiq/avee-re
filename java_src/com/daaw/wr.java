package com.daaw;

import com.daaw.tb1;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class wr implements yb1 {
    public static tb1 b(mn mnVar) {
        return new tb1(3600000 + mnVar.a(), new tb1.b(8, 4), new tb1.a(true, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.daaw.yb1
    public tb1 a(mn mnVar, JSONObject jSONObject) {
        return b(mnVar);
    }
}
