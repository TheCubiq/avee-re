package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* renamed from: com.daaw.gw */
/* loaded from: classes.dex */
public abstract class AbstractC1477gw extends ReplacementSpan {

    /* renamed from: q */
    public final C1334fw f11768q;

    /* renamed from: p */
    public final Paint.FontMetricsInt f11767p = new Paint.FontMetricsInt();

    /* renamed from: r */
    public short f11769r = -1;

    /* renamed from: s */
    public short f11770s = -1;

    /* renamed from: t */
    public float f11771t = 1.0f;

    public AbstractC1477gw(C1334fw c1334fw) {
        ty0.m8698g(c1334fw, "metadata cannot be null");
        this.f11768q = c1334fw;
    }

    /* renamed from: a */
    public final C1334fw m21199a() {
        return this.f11768q;
    }

    /* renamed from: b */
    public final int m21198b() {
        return this.f11769r;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f11767p);
        Paint.FontMetricsInt fontMetricsInt2 = this.f11767p;
        this.f11771t = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f11768q.m22229e();
        this.f11770s = (short) (this.f11768q.m22229e() * this.f11771t);
        short m22225i = (short) (this.f11768q.m22225i() * this.f11771t);
        this.f11769r = m22225i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f11767p;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return m22225i;
    }
}
