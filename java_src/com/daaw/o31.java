package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class o31 implements InterfaceC2055ll {

    /* renamed from: a */
    public final float f21005a;

    public o31(float f) {
        this.f21005a = f;
    }

    @Override // com.daaw.InterfaceC2055ll
    /* renamed from: a */
    public float mo14583a(RectF rectF) {
        return this.f21005a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o31) && this.f21005a == ((o31) obj).f21005a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21005a)});
    }
}
