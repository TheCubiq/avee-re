package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.C0645al;
import com.daaw.oy0;
import com.daaw.vw1;
import com.daaw.xw1;
/* loaded from: classes.dex */
public class PrCheckBox extends AppCompatCheckBox {

    /* renamed from: t */
    public static final vw1<Boolean> f3797t = new vw1<>();

    /* renamed from: u */
    public static final xw1<C0645al, PrCheckBox, Boolean> f3798u = new xw1<>();

    public PrCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setEnabled(f3797t.m6692a(Boolean.FALSE).booleanValue());
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
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && f3798u.m4425a(new C0645al(this), this, Boolean.FALSE).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
