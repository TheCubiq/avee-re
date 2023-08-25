package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.overlay.zzr;
/* loaded from: classes.dex */
public final class jm8 extends AnimatorListenerAdapter {
    public final /* synthetic */ zzr a;

    public jm8(zzr zzrVar) {
        this.a = zzrVar;
    }

    public final void a(boolean z) {
        ImageButton imageButton;
        this.a.setEnabled(z);
        imageButton = this.a.p;
        imageButton.setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        a(false);
    }
}
