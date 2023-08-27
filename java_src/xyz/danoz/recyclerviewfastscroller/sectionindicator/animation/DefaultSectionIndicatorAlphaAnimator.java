package xyz.danoz.recyclerviewfastscroller.sectionindicator.animation;

import android.animation.ObjectAnimator;
import android.view.View;
/* loaded from: classes2.dex */
public class DefaultSectionIndicatorAlphaAnimator {
    private static final int ANIMATION_DURATION = 500;
    private final View mSectionIndicatorView;
    private float mTargetAlpha = 0.0f;

    public DefaultSectionIndicatorAlphaAnimator(View view) {
        this.mSectionIndicatorView = view;
        view.setAlpha(0.0f);
    }

    public void animateTo(float f) {
        float f2 = this.mTargetAlpha;
        if (f == f2) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mSectionIndicatorView, "alpha", f2, f);
        ofFloat.setDuration(500L);
        ofFloat.start();
        this.mTargetAlpha = f;
    }
}
