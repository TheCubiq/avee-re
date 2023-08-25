package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.overlay.zzr;
/* loaded from: classes.dex */
public final class jm8 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ zzr f15216a;

    public jm8(zzr zzrVar) {
        this.f15216a = zzrVar;
    }

    /* renamed from: a */
    public final void m18405a(boolean z) {
        ImageButton imageButton;
        this.f15216a.setEnabled(z);
        imageButton = this.f15216a.f36229p;
        imageButton.setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        m18405a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m18405a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        m18405a(false);
    }
}
