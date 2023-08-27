package com.google.android.exoplayer2.ui;

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
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.text.CaptionStyleCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;
/* loaded from: classes.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private int backgroundColor;
    private Rect bitmapRect;
    private float bottomPaddingFraction;
    private final float cornerRadius;
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private CharSequence cueText;
    private Layout.Alignment cueTextAlignment;
    private int edgeColor;
    private int edgeType;
    private int foregroundColor;
    private final RectF lineBounds = new RectF();
    private final float outlineWidth;
    private final Paint paint;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private float textSizePx;
    private int textTop;
    private int windowColor;

    public SubtitlePainter(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.spacingAdd = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.cornerRadius = round;
        this.outlineWidth = round;
        this.shadowRadius = round;
        this.shadowOffset = round;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        this.textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setStyle(Paint.Style.FILL);
    }

    public void draw(Cue cue, boolean z, boolean z2, CaptionStyleCompat captionStyleCompat, float f, float f2, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z3 = cue.bitmap == null;
        int i5 = ViewCompat.MEASURED_STATE_MASK;
        if (z3) {
            if (TextUtils.isEmpty(cue.text)) {
                return;
            }
            i5 = (cue.windowColorSet && z) ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.applyEmbeddedStyles == z && this.applyEmbeddedFontSizes == z2 && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i5 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.textSizePx == f && this.bottomPaddingFraction == f2 && this.parentLeft == i && this.parentTop == i2 && this.parentRight == i3 && this.parentBottom == i4) {
            drawLayout(canvas, z3);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.applyEmbeddedStyles = z;
        this.applyEmbeddedFontSizes = z2;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i5;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.textSizePx = f;
        this.bottomPaddingFraction = f2;
        this.parentLeft = i;
        this.parentTop = i2;
        this.parentRight = i3;
        this.parentBottom = i4;
        if (z3) {
            setupTextLayout();
        } else {
            setupBitmapLayout();
        }
        drawLayout(canvas, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v6 */
    private void setupTextLayout() {
        ?? spannableStringBuilder;
        int i;
        int i2;
        int i3;
        int round;
        int i4;
        int i5 = this.parentRight - this.parentLeft;
        int i6 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.textSizePx);
        int i7 = (int) ((this.textSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i8 = i7 * 2;
        int i9 = i5 - i8;
        float f = this.cueSize;
        if (f != Float.MIN_VALUE) {
            i9 = (int) (i9 * f);
        }
        if (i9 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.applyEmbeddedFontSizes && this.applyEmbeddedStyles) {
            spannableStringBuilder = this.cueText;
        } else if (!this.applyEmbeddedStyles) {
            spannableStringBuilder = this.cueText.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(this.cueText);
            int length = spannableStringBuilder.length();
            AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, length, AbsoluteSizeSpan.class);
            RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(0, length, RelativeSizeSpan.class);
            for (AbsoluteSizeSpan absoluteSizeSpan : absoluteSizeSpanArr) {
                spannableStringBuilder.removeSpan(absoluteSizeSpan);
            }
            for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr) {
                spannableStringBuilder.removeSpan(relativeSizeSpan);
            }
        }
        CharSequence charSequence = spannableStringBuilder;
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(charSequence, this.textPaint, i9, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int i10 = 0;
        for (int i11 = 0; i11 < lineCount; i11++) {
            i10 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i11)), i10);
        }
        if (this.cueSize == Float.MIN_VALUE || i10 >= i9) {
            i9 = i10;
        }
        int i12 = i9 + i8;
        float f2 = this.cuePosition;
        if (f2 != Float.MIN_VALUE) {
            int round2 = Math.round(i5 * f2) + this.parentLeft;
            int i13 = this.cuePositionAnchor;
            if (i13 == 2) {
                round2 -= i12;
            } else if (i13 == 1) {
                round2 = ((round2 * 2) - i12) / 2;
            }
            i = Math.max(round2, this.parentLeft);
            i2 = Math.min(i12 + i, this.parentRight);
        } else {
            i = (i5 - i12) / 2;
            i2 = i + i12;
        }
        int i14 = i2 - i;
        if (i14 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.cueLine;
        if (f3 != Float.MIN_VALUE) {
            if (this.cueLineType == 0) {
                round = Math.round(i6 * f3);
                i4 = this.parentTop;
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f4 = this.cueLine;
                if (f4 >= 0.0f) {
                    round = Math.round(f4 * lineBottom);
                    i4 = this.parentTop;
                } else {
                    round = Math.round((f4 + 1.0f) * lineBottom);
                    i4 = this.parentBottom;
                }
            }
            i3 = round + i4;
            int i15 = this.cueLineAnchor;
            if (i15 == 2) {
                i3 -= height;
            } else if (i15 == 1) {
                i3 = ((i3 * 2) - height) / 2;
            }
            int i16 = i3 + height;
            int i17 = this.parentBottom;
            if (i16 > i17) {
                i3 = i17 - height;
            } else {
                int i18 = this.parentTop;
                if (i3 < i18) {
                    i3 = i18;
                }
            }
        } else {
            i3 = (this.parentBottom - height) - ((int) (i6 * this.bottomPaddingFraction));
        }
        this.textLayout = new StaticLayout(charSequence, this.textPaint, i14, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = i;
        this.textTop = i3;
        this.textPaddingX = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupBitmapLayout() {
        float f;
        int i;
        float f2;
        int i2 = this.parentRight;
        int i3 = this.parentLeft;
        int i4 = this.parentBottom;
        int i5 = this.parentTop;
        float f3 = i2 - i3;
        float f4 = i3 + (this.cuePosition * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.cueLine * f5);
        int round = Math.round(f3 * this.cueSize);
        float f7 = this.cueBitmapHeight;
        int round2 = f7 != Float.MIN_VALUE ? Math.round(f5 * f7) : Math.round(round * (this.cueBitmap.getHeight() / this.cueBitmap.getWidth()));
        int i6 = this.cueLineAnchor;
        if (i6 != 2) {
            if (i6 == 1) {
                f = round / 2;
            }
            int round3 = Math.round(f4);
            i = this.cuePositionAnchor;
            if (i == 2) {
                if (i == 1) {
                    f2 = round2 / 2;
                }
                int round4 = Math.round(f6);
                this.bitmapRect = new Rect(round3, round4, round + round3, round2 + round4);
            }
            f2 = round2;
            f6 -= f2;
            int round42 = Math.round(f6);
            this.bitmapRect = new Rect(round3, round42, round + round3, round2 + round42);
        }
        f = round;
        f4 -= f;
        int round32 = Math.round(f4);
        i = this.cuePositionAnchor;
        if (i == 2) {
        }
        f6 -= f2;
        int round422 = Math.round(f6);
        this.bitmapRect = new Rect(round32, round422, round + round32, round2 + round422);
    }

    private void drawLayout(Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
        } else {
            drawBitmapLayout(canvas);
        }
    }

    private void drawTextLayout(Canvas canvas) {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.paint.setColor(this.windowColor);
            canvas.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.paint);
        }
        if (Color.alpha(this.backgroundColor) > 0) {
            this.paint.setColor(this.backgroundColor);
            float lineTop = staticLayout.getLineTop(0);
            int lineCount = staticLayout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                float lineLeft = staticLayout.getLineLeft(i);
                float lineRight = staticLayout.getLineRight(i);
                this.lineBounds.left = lineLeft - this.textPaddingX;
                this.lineBounds.right = this.textPaddingX + lineRight;
                this.lineBounds.top = lineTop;
                this.lineBounds.bottom = staticLayout.getLineBottom(i);
                lineTop = this.lineBounds.bottom;
                if (lineRight - lineLeft > 0.0f) {
                    RectF rectF = this.lineBounds;
                    float f = this.cornerRadius;
                    canvas.drawRoundRect(rectF, f, f, this.paint);
                }
            }
        }
        int i2 = this.edgeType;
        if (i2 == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i2 == 2) {
            TextPaint textPaint = this.textPaint;
            float f2 = this.shadowRadius;
            float f3 = this.shadowOffset;
            textPaint.setShadowLayer(f2, f3, f3, this.edgeColor);
        } else if (i2 == 3 || i2 == 4) {
            boolean z = this.edgeType == 3;
            int i3 = z ? -1 : this.edgeColor;
            int i4 = z ? this.edgeColor : -1;
            float f4 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f5 = -f4;
            this.textPaint.setShadowLayer(this.shadowRadius, f5, f5, i3);
            staticLayout.draw(canvas);
            this.textPaint.setShadowLayer(this.shadowRadius, f4, f4, i4);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, (Paint) null);
    }

    private static boolean areCharSequencesEqual(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
