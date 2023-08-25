package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import com.daaw.C0645al;
import com.daaw.oy0;
import com.daaw.u21;
import com.daaw.ww1;
import com.daaw.xw1;
import java.util.List;
/* loaded from: classes.dex */
public class PrButton extends Button {

    /* renamed from: r */
    public static final ww1<Integer[], Boolean> f3793r = new ww1<>();

    /* renamed from: s */
    public static final xw1<C0645al, PrButton, Boolean> f3794s = new xw1<>();

    /* renamed from: p */
    public boolean f3795p;

    /* renamed from: q */
    public final List<Object> f3796q;

    public PrButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3795p = false;
        this.f3796q = null;
        m26869a(attributeSet);
    }

    /* renamed from: a */
    public final void m26869a(AttributeSet attributeSet) {
        boolean z = false;
        this.f3795p = getContext().getTheme().obtainStyledAttributes(attributeSet, u21.f28442j1, 0, 0).getBoolean(0, false);
        Integer[] numArr = {1, 7, 5, 3};
        if (f3793r.m5753a(numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) {
            z = true;
        }
        setEnabled(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable m13871a = oy0.m13871a();
        if (m13871a != null) {
            int intrinsicWidth = m13871a.getIntrinsicWidth();
            int width = canvas.getWidth() - getCompoundPaddingRight();
            int compoundPaddingTop = getCompoundPaddingTop();
            m13871a.setBounds(width - intrinsicWidth, compoundPaddingTop, width, intrinsicWidth + compoundPaddingTop);
            m13871a.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && f3794s.m4425a(new C0645al(this), this, Boolean.FALSE).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
