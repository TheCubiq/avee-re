package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
/* loaded from: classes.dex */
public final class bp1 extends gw {
    public static Paint u;

    public bp1(fw fwVar) {
        super(fwVar);
    }

    public static Paint c() {
        if (u == null) {
            TextPaint textPaint = new TextPaint();
            u = textPaint;
            textPaint.setColor(androidx.emoji2.text.b.b().c());
            u.setStyle(Paint.Style.FILL);
        }
        return u;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (androidx.emoji2.text.b.b().i()) {
            canvas.drawRect(f, i3, f + b(), i5, c());
        }
        a().a(canvas, f, i4, paint);
    }
}
