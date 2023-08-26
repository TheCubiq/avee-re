package com.bumptech.glide.request.animation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bumptech.glide.request.animation.ViewAnimation;
/* loaded from: classes.dex */
public class DrawableCrossFadeFactory<T extends Drawable> implements GlideAnimationFactory<T> {
    private static final int DEFAULT_DURATION_MS = 300;
    private final ViewAnimationFactory<T> animationFactory;
    private final int duration;
    private DrawableCrossFadeViewAnimation<T> firstResourceAnimation;
    private DrawableCrossFadeViewAnimation<T> secondResourceAnimation;

    public DrawableCrossFadeFactory() {
        this(DEFAULT_DURATION_MS);
    }

    public DrawableCrossFadeFactory(int i) {
        this(new ViewAnimationFactory(new DefaultAnimationFactory(i)), i);
    }

    public DrawableCrossFadeFactory(Context context, int i, int i2) {
        this(new ViewAnimationFactory(context, i), i2);
    }

    public DrawableCrossFadeFactory(Animation animation, int i) {
        this(new ViewAnimationFactory(animation), i);
    }

    DrawableCrossFadeFactory(ViewAnimationFactory<T> viewAnimationFactory, int i) {
        this.animationFactory = viewAnimationFactory;
        this.duration = i;
    }

    @Override // com.bumptech.glide.request.animation.GlideAnimationFactory
    public GlideAnimation<T> build(boolean z, boolean z2) {
        if (z) {
            return NoAnimation.get();
        }
        if (z2) {
            return getFirstResourceAnimation();
        }
        return getSecondResourceAnimation();
    }

    private GlideAnimation<T> getFirstResourceAnimation() {
        if (this.firstResourceAnimation == null) {
            this.firstResourceAnimation = new DrawableCrossFadeViewAnimation<>(this.animationFactory.build(false, true), this.duration);
        }
        return this.firstResourceAnimation;
    }

    private GlideAnimation<T> getSecondResourceAnimation() {
        if (this.secondResourceAnimation == null) {
            this.secondResourceAnimation = new DrawableCrossFadeViewAnimation<>(this.animationFactory.build(false, false), this.duration);
        }
        return this.secondResourceAnimation;
    }

    /* loaded from: classes.dex */
    private static class DefaultAnimationFactory implements ViewAnimation.AnimationFactory {
        private final int duration;

        DefaultAnimationFactory(int i) {
            this.duration = i;
        }

        @Override // com.bumptech.glide.request.animation.ViewAnimation.AnimationFactory
        public Animation build() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.duration);
            return alphaAnimation;
        }
    }
}
