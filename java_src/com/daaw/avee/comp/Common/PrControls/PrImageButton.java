package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.daaw.C0645al;
import com.daaw.oy0;
import com.daaw.vw1;
import com.daaw.xw1;
/* loaded from: classes.dex */
public class PrImageButton extends ImageButton {

    /* renamed from: p */
    public static final vw1<Boolean> f3807p = new vw1<>();

    /* renamed from: q */
    public static final xw1<C0645al, PrImageButton, Boolean> f3808q = new xw1<>();

    public PrImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setEnabled(f3807p.m6692a(Boolean.FALSE).booleanValue());
        Drawable m13871a = oy0.m13871a();
        if (m13871a != null) {
            int intrinsicWidth = m13871a.getIntrinsicWidth();
            int width = canvas.getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            m13871a.setBounds(width - intrinsicWidth, paddingTop, width, intrinsicWidth + paddingTop);
            m13871a.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && f3808q.m4425a(new C0645al(this), this, Boolean.FALSE).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
