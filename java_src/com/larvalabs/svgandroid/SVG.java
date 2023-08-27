package com.larvalabs.svgandroid;

import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
/* loaded from: classes2.dex */
public class SVG {
    private final RectF bounds;
    private final Picture picture;
    private RectF limits = null;
    private PictureDrawable drawable = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVG(Picture picture, RectF rectF) {
        this.picture = picture;
        this.bounds = rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLimits(RectF rectF) {
        this.limits = rectF;
    }

    public PictureDrawable getDrawable() {
        if (this.drawable == null) {
            this.drawable = new PictureDrawable(this.picture);
        }
        return this.drawable;
    }

    public Picture getPicture() {
        return this.picture;
    }

    public RectF getBounds() {
        return this.bounds;
    }

    public RectF getLimits() {
        return this.limits;
    }
}
