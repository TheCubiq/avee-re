package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import com.daaw.al;
import com.daaw.oy0;
import com.daaw.u21;
import com.daaw.ww1;
import com.daaw.xw1;
import java.util.List;
/* loaded from: classes.dex */
public class PrButton extends Button {
    public static final ww1<Integer[], Boolean> r = new ww1<>();
    public static final xw1<al, PrButton, Boolean> s = new xw1<>();
    public boolean p;
    public final List<Object> q;

    public PrButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = false;
        this.q = null;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        boolean z = false;
        this.p = getContext().getTheme().obtainStyledAttributes(attributeSet, u21.j1, 0, 0).getBoolean(0, false);
        Integer[] numArr = {1, 7, 5, 3};
        if (r.a(numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) {
            z = true;
        }
        setEnabled(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable a = oy0.a();
        if (a != null) {
            int intrinsicWidth = a.getIntrinsicWidth();
            int width = canvas.getWidth() - getCompoundPaddingRight();
            int compoundPaddingTop = getCompoundPaddingTop();
            a.setBounds(width - intrinsicWidth, compoundPaddingTop, width, intrinsicWidth + compoundPaddingTop);
            a.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && s.a(new al(this), this, Boolean.FALSE).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
