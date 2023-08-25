package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class ah3 implements zg3 {
    public final bh3 a;

    public ah3(bh3 bh3Var, byte[] bArr) {
        this.a = bh3Var;
    }

    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            k04.zzh("Fail to parse float", e);
        }
        this.a.c(equals);
        this.a.b(equals2, f);
        a74Var.D(equals);
    }
}
