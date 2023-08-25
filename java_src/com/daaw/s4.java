package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
public class s4 extends SeekBar {
    public final t4 p;

    public s4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.seekBarStyle);
    }

    public s4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yk1.a(this, getContext());
        t4 t4Var = new t4(this);
        this.p = t4Var;
        t4Var.c(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.p.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.p.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.p.g(canvas);
    }
}
