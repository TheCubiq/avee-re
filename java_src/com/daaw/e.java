package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class e implements ll {
    public final float a;

    public e(float f) {
        this.a = f;
    }

    @Override // com.daaw.ll
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a == ((e) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
