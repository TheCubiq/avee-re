package com.larvalabs.svgandroid;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.util.Log;
/* loaded from: classes2.dex */
public class SVGDrawable extends PictureDrawable {
    private final String TAG;
    private SVGState mSvgState;

    public SVGDrawable(SVG svg) {
        super(svg.getPicture());
        this.TAG = "SVGDrawable";
        this.mSvgState = new SVGState(svg);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.PictureDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getPicture() != null) {
            Rect bounds = getBounds();
            canvas.save();
            canvas.drawPicture(getPicture(), bounds);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations() | this.mSvgState.mChangingConfigurations;
        Log.e("SVGDrawable", "CC = " + changingConfigurations);
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        this.mSvgState.mChangingConfigurations = super.getChangingConfigurations();
        return this.mSvgState;
    }

    /* loaded from: classes2.dex */
    static final class SVGState extends Drawable.ConstantState {
        int mChangingConfigurations;
        private SVG mSvg;

        private SVGState(SVG svg) {
            this.mSvg = svg;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new SVGDrawable(this.mSvg);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChangingConfigurations;
        }
    }
}
