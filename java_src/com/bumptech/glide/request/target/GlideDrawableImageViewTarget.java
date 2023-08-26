package com.bumptech.glide.request.target;

import android.widget.ImageView;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
/* loaded from: classes.dex */
public class GlideDrawableImageViewTarget extends ImageViewTarget<GlideDrawable> {
    private static final float SQUARE_RATIO_MARGIN = 0.05f;
    private int maxLoopCount;
    private GlideDrawable resource;

    @Override // com.bumptech.glide.request.target.ImageViewTarget, com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
        onResourceReady((GlideDrawable) obj, (GlideAnimation<? super GlideDrawable>) glideAnimation);
    }

    public GlideDrawableImageViewTarget(ImageView imageView) {
        this(imageView, -1);
    }

    public GlideDrawableImageViewTarget(ImageView imageView, int i) {
        super(imageView);
        this.maxLoopCount = i;
    }

    public void onResourceReady(GlideDrawable glideDrawable, GlideAnimation<? super GlideDrawable> glideAnimation) {
        if (!glideDrawable.isAnimated()) {
            float width = ((ImageView) this.view).getWidth() / ((ImageView) this.view).getHeight();
            float intrinsicWidth = glideDrawable.getIntrinsicWidth() / glideDrawable.getIntrinsicHeight();
            if (Math.abs(width - 1.0f) <= SQUARE_RATIO_MARGIN && Math.abs(intrinsicWidth - 1.0f) <= SQUARE_RATIO_MARGIN) {
                glideDrawable = new SquaringDrawable(glideDrawable, ((ImageView) this.view).getWidth());
            }
        }
        super.onResourceReady((GlideDrawableImageViewTarget) glideDrawable, (GlideAnimation<? super GlideDrawableImageViewTarget>) glideAnimation);
        this.resource = glideDrawable;
        glideDrawable.setLoopCount(this.maxLoopCount);
        glideDrawable.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public void setResource(GlideDrawable glideDrawable) {
        ((ImageView) this.view).setImageDrawable(glideDrawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        GlideDrawable glideDrawable = this.resource;
        if (glideDrawable != null) {
            glideDrawable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        GlideDrawable glideDrawable = this.resource;
        if (glideDrawable != null) {
            glideDrawable.stop();
        }
    }
}
