package com.daaw;

import android.graphics.RectF;
import java.util.Random;
/* loaded from: classes.dex */
public class u5 implements pc0 {
    public Random a = new Random();

    @Override // com.daaw.zc0
    public void a(un unVar) {
    }

    @Override // com.daaw.pc0
    public void l(RectF rectF, ds1 ds1Var, ds1 ds1Var2, boolean z) {
        float nextFloat = this.a.nextFloat();
        float nextFloat2 = this.a.nextFloat();
        ds1Var.a = rectF.left + (rectF.width() * nextFloat);
        ds1Var.b = rectF.centerY();
        ds1Var.c = 0.0f;
        ds1Var2.a = (nextFloat * 2.0f) - 1.0f;
        ds1Var2.b = (nextFloat2 * 2.0f) - 1.0f;
        ds1Var2.c = 0.0f;
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
    }
}
