package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: com.daaw.e */
/* loaded from: classes2.dex */
public final class C1152e implements InterfaceC2055ll {

    /* renamed from: a */
    public final float f8008a;

    public C1152e(float f) {
        this.f8008a = f;
    }

    @Override // com.daaw.InterfaceC2055ll
    /* renamed from: a */
    public float mo14583a(RectF rectF) {
        return this.f8008a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1152e) && this.f8008a == ((C1152e) obj).f8008a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8008a)});
    }
}
