package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class ah3 implements zg3 {

    /* renamed from: a */
    public final bh3 f3198a;

    public ah3(bh3 bh3Var, byte[] bArr) {
        this.f3198a = bh3Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
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
        this.f3198a.m26170c(equals);
        this.f3198a.m26171b(equals2, f);
        a74Var.mo6460D(equals);
    }
}
