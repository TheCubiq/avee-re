package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.al;
import com.daaw.oy0;
import com.daaw.vw1;
import com.daaw.xw1;
/* loaded from: classes.dex */
public class PrCheckBox extends AppCompatCheckBox {
    public static final vw1<Boolean> t = new vw1<>();
    public static final xw1<al, PrCheckBox, Boolean> u = new xw1<>();

    public PrCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setEnabled(t.a(Boolean.FALSE).booleanValue());
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
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && u.a(new al(this), this, Boolean.FALSE).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
