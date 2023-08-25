package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
/* loaded from: classes.dex */
public final class zh1 {

    /* renamed from: A */
    public float f35065A;

    /* renamed from: B */
    public float f35066B;

    /* renamed from: C */
    public int f35067C;

    /* renamed from: D */
    public int f35068D;

    /* renamed from: E */
    public int f35069E;

    /* renamed from: F */
    public int f35070F;

    /* renamed from: G */
    public StaticLayout f35071G;

    /* renamed from: H */
    public int f35072H;

    /* renamed from: I */
    public int f35073I;

    /* renamed from: J */
    public int f35074J;

    /* renamed from: K */
    public Rect f35075K;

    /* renamed from: a */
    public final RectF f35076a = new RectF();

    /* renamed from: b */
    public final float f35077b;

    /* renamed from: c */
    public final float f35078c;

    /* renamed from: d */
    public final float f35079d;

    /* renamed from: e */
    public final float f35080e;

    /* renamed from: f */
    public final float f35081f;

    /* renamed from: g */
    public final float f35082g;

    /* renamed from: h */
    public final TextPaint f35083h;

    /* renamed from: i */
    public final Paint f35084i;

    /* renamed from: j */
    public CharSequence f35085j;

    /* renamed from: k */
    public Layout.Alignment f35086k;

    /* renamed from: l */
    public Bitmap f35087l;

    /* renamed from: m */
    public float f35088m;

    /* renamed from: n */
    public int f35089n;

    /* renamed from: o */
    public int f35090o;

    /* renamed from: p */
    public float f35091p;

    /* renamed from: q */
    public int f35092q;

    /* renamed from: r */
    public float f35093r;

    /* renamed from: s */
    public float f35094s;

    /* renamed from: t */
    public boolean f35095t;

    /* renamed from: u */
    public boolean f35096u;

    /* renamed from: v */
    public int f35097v;

    /* renamed from: w */
    public int f35098w;

    /* renamed from: x */
    public int f35099x;

    /* renamed from: y */
    public int f35100y;

    /* renamed from: z */
    public int f35101z;

    public zh1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f35082g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f35081f = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f35077b = round;
        this.f35078c = round;
        this.f35079d = round;
        this.f35080e = round;
        TextPaint textPaint = new TextPaint();
        this.f35083h = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f35084i = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public static boolean m2305a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* renamed from: b */
    public void m2304b(C2099ln c2099ln, boolean z, boolean z2, C3828zd c3828zd, float f, float f2, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z3 = c2099ln.f17549r == null;
        int i5 = -16777216;
        if (z3) {
            if (TextUtils.isEmpty(c2099ln.f17547p)) {
                return;
            }
            i5 = (c2099ln.f17557z && z) ? c2099ln.f17544A : c3828zd.f34958c;
        }
        if (m2305a(this.f35085j, c2099ln.f17547p) && sq1.m10016b(this.f35086k, c2099ln.f17548q) && this.f35087l == c2099ln.f17549r && this.f35088m == c2099ln.f17550s && this.f35089n == c2099ln.f17551t && sq1.m10016b(Integer.valueOf(this.f35090o), Integer.valueOf(c2099ln.f17552u)) && this.f35091p == c2099ln.f17553v && sq1.m10016b(Integer.valueOf(this.f35092q), Integer.valueOf(c2099ln.f17554w)) && this.f35093r == c2099ln.f17555x && this.f35094s == c2099ln.f17556y && this.f35095t == z && this.f35096u == z2 && this.f35097v == c3828zd.f34956a && this.f35098w == c3828zd.f34957b && this.f35099x == i5 && this.f35101z == c3828zd.f34959d && this.f35100y == c3828zd.f34960e && sq1.m10016b(this.f35083h.getTypeface(), c3828zd.f34961f) && this.f35065A == f && this.f35066B == f2 && this.f35067C == i && this.f35068D == i2 && this.f35069E == i3 && this.f35070F == i4) {
            m2302d(canvas, z3);
            return;
        }
        this.f35085j = c2099ln.f17547p;
        this.f35086k = c2099ln.f17548q;
        this.f35087l = c2099ln.f17549r;
        this.f35088m = c2099ln.f17550s;
        this.f35089n = c2099ln.f17551t;
        this.f35090o = c2099ln.f17552u;
        this.f35091p = c2099ln.f17553v;
        this.f35092q = c2099ln.f17554w;
        this.f35093r = c2099ln.f17555x;
        this.f35094s = c2099ln.f17556y;
        this.f35095t = z;
        this.f35096u = z2;
        this.f35097v = c3828zd.f34956a;
        this.f35098w = c3828zd.f34957b;
        this.f35099x = i5;
        this.f35101z = c3828zd.f34959d;
        this.f35100y = c3828zd.f34960e;
        this.f35083h.setTypeface(c3828zd.f34961f);
        this.f35065A = f;
        this.f35066B = f2;
        this.f35067C = i;
        this.f35068D = i2;
        this.f35069E = i3;
        this.f35070F = i4;
        if (z3) {
            m2299g();
        } else {
            m2300f();
        }
        m2302d(canvas, z3);
    }

    /* renamed from: c */
    public final void m2303c(Canvas canvas) {
        canvas.drawBitmap(this.f35087l, (Rect) null, this.f35075K, (Paint) null);
    }

    /* renamed from: d */
    public final void m2302d(Canvas canvas, boolean z) {
        if (z) {
            m2301e(canvas);
        } else {
            m2303c(canvas);
        }
    }

    /* renamed from: e */
    public final void m2301e(Canvas canvas) {
        StaticLayout staticLayout = this.f35071G;
        if (staticLayout == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f35072H, this.f35073I);
        if (Color.alpha(this.f35099x) > 0) {
            this.f35084i.setColor(this.f35099x);
            canvas.drawRect(-this.f35074J, 0.0f, staticLayout.getWidth() + this.f35074J, staticLayout.getHeight(), this.f35084i);
        }
        if (Color.alpha(this.f35098w) > 0) {
            this.f35084i.setColor(this.f35098w);
            float lineTop = staticLayout.getLineTop(0);
            int lineCount = staticLayout.getLineCount();
            int i = 0;
            while (i < lineCount) {
                float lineLeft = staticLayout.getLineLeft(i);
                float lineRight = staticLayout.getLineRight(i);
                RectF rectF = this.f35076a;
                int i2 = this.f35074J;
                rectF.left = lineLeft - i2;
                rectF.right = i2 + lineRight;
                rectF.top = lineTop;
                rectF.bottom = staticLayout.getLineBottom(i);
                RectF rectF2 = this.f35076a;
                float f = rectF2.bottom;
                if (lineRight - lineLeft > 0.0f) {
                    float f2 = this.f35077b;
                    canvas.drawRoundRect(rectF2, f2, f2, this.f35084i);
                }
                i++;
                lineTop = f;
            }
        }
        int i3 = this.f35101z;
        if (i3 == 1) {
            this.f35083h.setStrokeJoin(Paint.Join.ROUND);
            this.f35083h.setStrokeWidth(this.f35078c);
            this.f35083h.setColor(this.f35100y);
            this.f35083h.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i3 == 2) {
            TextPaint textPaint = this.f35083h;
            float f3 = this.f35079d;
            float f4 = this.f35080e;
            textPaint.setShadowLayer(f3, f4, f4, this.f35100y);
        } else if (i3 == 3 || i3 == 4) {
            boolean z = i3 == 3;
            int i4 = z ? -1 : this.f35100y;
            int i5 = z ? this.f35100y : -1;
            float f5 = this.f35079d / 2.0f;
            this.f35083h.setColor(this.f35097v);
            this.f35083h.setStyle(Paint.Style.FILL);
            float f6 = -f5;
            this.f35083h.setShadowLayer(this.f35079d, f6, f6, i4);
            staticLayout.draw(canvas);
            this.f35083h.setShadowLayer(this.f35079d, f5, f5, i5);
        }
        this.f35083h.setColor(this.f35097v);
        this.f35083h.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f35083h.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2300f() {
        float f;
        int i;
        float f2;
        int i2 = this.f35069E;
        int i3 = this.f35067C;
        int i4 = this.f35070F;
        int i5 = this.f35068D;
        float f3 = i2 - i3;
        float f4 = i3 + (this.f35091p * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.f35088m * f5);
        int round = Math.round(f3 * this.f35093r);
        float f7 = this.f35094s;
        if (f7 == Float.MIN_VALUE) {
            f5 = round;
            f7 = this.f35087l.getHeight() / this.f35087l.getWidth();
        }
        int round2 = Math.round(f5 * f7);
        int i6 = this.f35090o;
        if (i6 != 2) {
            if (i6 == 1) {
                f = round / 2;
            }
            int round3 = Math.round(f4);
            i = this.f35092q;
            if (i == 2) {
                if (i == 1) {
                    f2 = round2 / 2;
                }
                int round4 = Math.round(f6);
                this.f35075K = new Rect(round3, round4, round + round3, round2 + round4);
            }
            f2 = round2;
            f6 -= f2;
            int round42 = Math.round(f6);
            this.f35075K = new Rect(round3, round42, round + round3, round2 + round42);
        }
        f = round;
        f4 -= f;
        int round32 = Math.round(f4);
        i = this.f35092q;
        if (i == 2) {
        }
        f6 -= f2;
        int round422 = Math.round(f6);
        this.f35075K = new Rect(round32, round422, round + round32, round2 + round422);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2299g() {
        ?? spannableStringBuilder;
        int i;
        int i2;
        int i3;
        int round;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f35069E - this.f35067C;
        int i9 = this.f35070F - this.f35068D;
        this.f35083h.setTextSize(this.f35065A);
        int i10 = (int) ((this.f35065A * 0.125f) + 0.5f);
        int i11 = i10 * 2;
        int i12 = i8 - i11;
        float f = this.f35093r;
        if (f != Float.MIN_VALUE) {
            i12 = (int) (i12 * f);
        }
        if (i12 <= 0) {
            return;
        }
        if (this.f35096u && this.f35095t) {
            spannableStringBuilder = this.f35085j;
        } else if (this.f35095t) {
            spannableStringBuilder = new SpannableStringBuilder(this.f35085j);
            int length = spannableStringBuilder.length();
            AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, length, AbsoluteSizeSpan.class);
            RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(0, length, RelativeSizeSpan.class);
            for (AbsoluteSizeSpan absoluteSizeSpan : absoluteSizeSpanArr) {
                spannableStringBuilder.removeSpan(absoluteSizeSpan);
            }
            for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr) {
                spannableStringBuilder.removeSpan(relativeSizeSpan);
            }
        } else {
            spannableStringBuilder = this.f35085j.toString();
        }
        CharSequence charSequence = spannableStringBuilder;
        Layout.Alignment alignment = this.f35086k;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f35083h, i12, alignment2, this.f35081f, this.f35082g, true);
        this.f35071G = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.f35071G.getLineCount();
        int i13 = 0;
        for (int i14 = 0; i14 < lineCount; i14++) {
            i13 = Math.max((int) Math.ceil(this.f35071G.getLineWidth(i14)), i13);
        }
        if (this.f35093r == Float.MIN_VALUE || i13 >= i12) {
            i12 = i13;
        }
        int i15 = i12 + i11;
        float f2 = this.f35091p;
        if (f2 != Float.MIN_VALUE) {
            int round2 = Math.round(i8 * f2);
            int i16 = this.f35067C;
            int i17 = round2 + i16;
            int i18 = this.f35092q;
            if (i18 == 2) {
                i17 -= i15;
            } else if (i18 == 1) {
                i17 = ((i17 * 2) - i15) / 2;
            }
            i = Math.max(i17, i16);
            i2 = Math.min(i15 + i, this.f35069E);
        } else {
            i = (i8 - i15) / 2;
            i2 = i + i15;
        }
        int i19 = i2 - i;
        if (i19 <= 0) {
            return;
        }
        float f3 = this.f35088m;
        if (f3 != Float.MIN_VALUE) {
            if (this.f35089n == 0) {
                round = Math.round(i9 * f3);
            } else {
                int lineBottom = this.f35071G.getLineBottom(0) - this.f35071G.getLineTop(0);
                float f4 = this.f35088m;
                if (f4 >= 0.0f) {
                    round = Math.round(f4 * lineBottom);
                } else {
                    round = Math.round((f4 + 1.0f) * lineBottom);
                    i4 = this.f35070F;
                    i3 = round + i4;
                    i5 = this.f35090o;
                    if (i5 != 2) {
                        i3 -= height;
                    } else if (i5 == 1) {
                        i3 = ((i3 * 2) - height) / 2;
                    }
                    i6 = i3 + height;
                    i7 = this.f35070F;
                    if (i6 <= i7) {
                        i3 = i7 - height;
                    } else {
                        int i20 = this.f35068D;
                        if (i3 < i20) {
                            i3 = i20;
                        }
                    }
                }
            }
            i4 = this.f35068D;
            i3 = round + i4;
            i5 = this.f35090o;
            if (i5 != 2) {
            }
            i6 = i3 + height;
            i7 = this.f35070F;
            if (i6 <= i7) {
            }
        } else {
            i3 = (this.f35070F - height) - ((int) (i9 * this.f35066B));
        }
        this.f35071G = new StaticLayout(charSequence, this.f35083h, i19, alignment2, this.f35081f, this.f35082g, true);
        this.f35072H = i;
        this.f35073I = i3;
        this.f35074J = i10;
    }
}
