package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.daaw.al;
import com.daaw.oy0;
import com.daaw.vw1;
import com.daaw.xw1;
/* loaded from: classes.dex */
public class PrImageButton extends ImageButton {
    public static final vw1<Boolean> p = new vw1<>();
    public static final xw1<al, PrImageButton, Boolean> q = new xw1<>();

    public PrImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setEnabled(p.a(Boolean.FALSE).booleanValue());
        Drawable a = oy0.a();
        if (a != null) {
            int intrinsicWidth = a.getIntrinsicWidth();
            int width = canvas.getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            a.setBounds(width - intrinsicWidth, paddingTop, width, intrinsicWidth + paddingTop);
            a.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && q.a(new al(this), this, Boolean.FALSE).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
