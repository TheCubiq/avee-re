package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class g1 implements ll {
    public final ll a;
    public final float b;

    public g1(float f, ll llVar) {
        while (llVar instanceof g1) {
            llVar = ((g1) llVar).a;
            f += ((g1) llVar).b;
        }
        this.a = llVar;
        this.b = f;
    }

    @Override // com.daaw.ll
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            return this.a.equals(g1Var.a) && this.b == g1Var.b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
