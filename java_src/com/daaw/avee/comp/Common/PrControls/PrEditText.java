package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.daaw.C0645al;
import com.daaw.C2026lc;
import com.daaw.avee.R;
import com.daaw.br1;
import com.daaw.oy0;
import com.daaw.u21;
import com.daaw.vw1;
import com.daaw.xw1;
import java.util.List;
/* loaded from: classes.dex */
public class PrEditText extends AppCompatEditText {

    /* renamed from: x */
    public static final vw1<Boolean> f3799x = new vw1<>();

    /* renamed from: y */
    public static final xw1<C0645al, PrEditText, Boolean> f3800y = new xw1<>();

    /* renamed from: u */
    public final List<Object> f3801u;

    /* renamed from: v */
    public Integer f3802v;

    /* renamed from: w */
    public boolean f3803w;

    public PrEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3801u = null;
        this.f3803w = true;
        m26868c();
        this.f3803w = context.getTheme().obtainStyledAttributes(attributeSet, u21.f28445k1, 0, 0).getBoolean(0, false);
    }

    /* renamed from: c */
    public final void m26868c() {
        boolean booleanValue = f3799x.m6692a(Boolean.FALSE).booleanValue();
        setEnabled(booleanValue);
        setClickable(booleanValue);
    }

    /* renamed from: d */
    public final boolean m26867d(String str) {
        return this.f3802v == null || f3799x.m6692a(Boolean.FALSE).booleanValue() || br1.m25886w(str) <= this.f3802v.intValue();
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

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (m26867d(charSequence.toString())) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        String num = this.f3802v.toString();
        setText(num);
        setSelection(num.length());
        C2026lc.m17056c(getContext(), getContext().getString(R.string.input_limit_is, this.f3802v)).m17054e();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && f3800y.m4425a(new C0645al(this), this, Boolean.FALSE).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setLimit(Integer num) {
        m26868c();
        if (isEnabled()) {
            return;
        }
        this.f3802v = num;
        try {
            String obj = getText().toString();
            if (obj.isEmpty() || Integer.parseInt(obj) > num.intValue()) {
                setText(num + "");
            }
        } catch (Exception unused) {
        }
    }
}
