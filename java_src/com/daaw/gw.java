package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* loaded from: classes.dex */
public abstract class gw extends ReplacementSpan {
    public final fw q;
    public final Paint.FontMetricsInt p = new Paint.FontMetricsInt();
    public short r = -1;
    public short s = -1;
    public float t = 1.0f;

    public gw(fw fwVar) {
        ty0.g(fwVar, "metadata cannot be null");
        this.q = fwVar;
    }

    public final fw a() {
        return this.q;
    }

    public final int b() {
        return this.r;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.p);
        Paint.FontMetricsInt fontMetricsInt2 = this.p;
        this.t = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.q.e();
        this.s = (short) (this.q.e() * this.t);
        short i3 = (short) (this.q.i() * this.t);
        this.r = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.p;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
