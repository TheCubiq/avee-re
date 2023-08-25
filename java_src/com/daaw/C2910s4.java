package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* renamed from: com.daaw.s4 */
/* loaded from: classes.dex */
public class C2910s4 extends SeekBar {

    /* renamed from: p */
    public final C3011t4 f25849p;

    public C2910s4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.seekBarStyle);
    }

    public C2910s4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yk1.m3617a(this, getContext());
        C3011t4 c3011t4 = new C3011t4(this);
        this.f25849p = c3011t4;
        c3011t4.mo9546c(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f25849p.m9543h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f25849p.m9542i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25849p.m9544g(canvas);
    }
}
