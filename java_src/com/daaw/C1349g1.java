package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: com.daaw.g1 */
/* loaded from: classes2.dex */
public final class C1349g1 implements InterfaceC2055ll {

    /* renamed from: a */
    public final InterfaceC2055ll f10138a;

    /* renamed from: b */
    public final float f10139b;

    public C1349g1(float f, InterfaceC2055ll interfaceC2055ll) {
        while (interfaceC2055ll instanceof C1349g1) {
            interfaceC2055ll = ((C1349g1) interfaceC2055ll).f10138a;
            f += ((C1349g1) interfaceC2055ll).f10139b;
        }
        this.f10138a = interfaceC2055ll;
        this.f10139b = f;
    }

    @Override // com.daaw.InterfaceC2055ll
    /* renamed from: a */
    public float mo14583a(RectF rectF) {
        return Math.max(0.0f, this.f10138a.mo14583a(rectF) + this.f10139b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1349g1) {
            C1349g1 c1349g1 = (C1349g1) obj;
            return this.f10138a.equals(c1349g1.f10138a) && this.f10139b == c1349g1.f10139b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10138a, Float.valueOf(this.f10139b)});
    }
}
