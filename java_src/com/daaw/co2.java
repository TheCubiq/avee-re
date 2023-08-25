package com.daaw;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class co2 extends no2 {
    public co2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "q25n2/TPNEnWjiB7Eq/br1pf7I1+Pbd8JO4E5S/WFXDtJZ2FMIzDcDIeNK1YwkMp", "JTvnHx65Egq/4novhqSS3bMw+oihCNz02Yz4pG4S+kE=", hi2Var, i, 73);
    }

    @Override // com.daaw.no2
    public final void a() {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
            hi2 hi2Var = this.e;
            if (true == booleanValue) {
                i = 2;
            }
            hi2Var.X(i);
        } catch (InvocationTargetException unused) {
            this.e.X(3);
        }
    }
}
