package com.daaw;

import android.graphics.RectF;
import java.util.Random;
/* renamed from: com.daaw.u5 */
/* loaded from: classes.dex */
public class C3162u5 implements pc0 {

    /* renamed from: a */
    public Random f28556a = new Random();

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
    }

    @Override // com.daaw.pc0
    /* renamed from: l */
    public void mo5526l(RectF rectF, ds1 ds1Var, ds1 ds1Var2, boolean z) {
        float nextFloat = this.f28556a.nextFloat();
        float nextFloat2 = this.f28556a.nextFloat();
        ds1Var.f7696a = rectF.left + (rectF.width() * nextFloat);
        ds1Var.f7697b = rectF.centerY();
        ds1Var.f7698c = 0.0f;
        ds1Var2.f7696a = (nextFloat * 2.0f) - 1.0f;
        ds1Var2.f7697b = (nextFloat2 * 2.0f) - 1.0f;
        ds1Var2.f7698c = 0.0f;
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
    }
}
