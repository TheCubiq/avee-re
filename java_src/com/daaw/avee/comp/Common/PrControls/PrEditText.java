package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.daaw.al;
import com.daaw.avee.R;
import com.daaw.br1;
import com.daaw.lc;
import com.daaw.oy0;
import com.daaw.u21;
import com.daaw.vw1;
import com.daaw.xw1;
import java.util.List;
/* loaded from: classes.dex */
public class PrEditText extends AppCompatEditText {
    public static final vw1<Boolean> x = new vw1<>();
    public static final xw1<al, PrEditText, Boolean> y = new xw1<>();
    public final List<Object> u;
    public Integer v;
    public boolean w;

    public PrEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = null;
        this.w = true;
        c();
        this.w = context.getTheme().obtainStyledAttributes(attributeSet, u21.k1, 0, 0).getBoolean(0, false);
    }

    public final void c() {
        boolean booleanValue = x.a(Boolean.FALSE).booleanValue();
        setEnabled(booleanValue);
        setClickable(booleanValue);
    }

    public final boolean d(String str) {
        return this.v == null || x.a(Boolean.FALSE).booleanValue() || br1.w(str) <= this.v.intValue();
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

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (d(charSequence.toString())) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        String num = this.v.toString();
        setText(num);
        setSelection(num.length());
        lc.c(getContext(), getContext().getString(R.string.input_limit_is, this.v)).e();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && y.a(new al(this), this, Boolean.FALSE).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setLimit(Integer num) {
        c();
        if (isEnabled()) {
            return;
        }
        this.v = num;
        try {
            String obj = getText().toString();
            if (obj.isEmpty() || Integer.parseInt(obj) > num.intValue()) {
                setText(num + "");
            }
        } catch (Exception unused) {
        }
    }
}
