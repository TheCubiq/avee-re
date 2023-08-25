package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class o31 implements ll {
    public final float a;

    public o31(float f) {
        this.a = f;
    }

    @Override // com.daaw.ll
    public float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o31) && this.a == ((o31) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
