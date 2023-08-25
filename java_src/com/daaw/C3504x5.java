package com.daaw;

import android.graphics.RectF;
import java.util.Random;
/* renamed from: com.daaw.x5 */
/* loaded from: classes.dex */
public class C3504x5 implements pc0 {

    /* renamed from: a */
    public Random f32102a = new Random();

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
    }

    @Override // com.daaw.pc0
    /* renamed from: l */
    public void mo5526l(RectF rectF, ds1 ds1Var, ds1 ds1Var2, boolean z) {
        float nextFloat = this.f32102a.nextFloat();
        ds1Var.f7696a = rectF.centerX();
        ds1Var.f7697b = rectF.top + (rectF.height() * nextFloat);
        ds1Var.f7698c = 0.0f;
        ds1Var2.f7696a = 1.0f;
        ds1Var2.f7697b = 0.0f;
        ds1Var2.f7698c = 0.0f;
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
    }
}
