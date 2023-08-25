package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.emoji2.text.C0232b;
/* loaded from: classes.dex */
public final class bp1 extends AbstractC1477gw {

    /* renamed from: u */
    public static Paint f5026u;

    public bp1(C1334fw c1334fw) {
        super(c1334fw);
    }

    /* renamed from: c */
    public static Paint m25953c() {
        if (f5026u == null) {
            TextPaint textPaint = new TextPaint();
            f5026u = textPaint;
            textPaint.setColor(C0232b.m29575b().m29574c());
            f5026u.setStyle(Paint.Style.FILL);
        }
        return f5026u;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C0232b.m29575b().m29568i()) {
            canvas.drawRect(f, i3, f + m21198b(), i5, m25953c());
        }
        m21199a().m22233a(canvas, f, i4, paint);
    }
}
