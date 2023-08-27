package com.bumptech.glide.request.target;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
/* loaded from: classes.dex */
public final class PreloadTarget<Z> extends SimpleTarget<Z> {
    public static <Z> PreloadTarget<Z> obtain(int i, int i2) {
        return new PreloadTarget<>(i, i2);
    }

    private PreloadTarget(int i, int i2) {
        super(i, i2);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(Z z, GlideAnimation<? super Z> glideAnimation) {
        Glide.clear(this);
    }
}
