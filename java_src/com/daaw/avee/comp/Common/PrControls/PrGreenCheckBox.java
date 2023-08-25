package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.avee.comp.Common.PrControls.PrGreenCheckBox;
import com.daaw.oy0;
import com.daaw.pq;
import com.daaw.ug0;
import com.daaw.vw1;
import com.daaw.ww1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public final class PrGreenCheckBox extends AppCompatCheckBox {
    public static final a u = new a(null);
    public static final vw1<Boolean> v = new vw1<>();
    public final List<Object> t;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrGreenCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ug0.f(context, "context");
        this.t = new LinkedList();
        c();
    }

    public static final Boolean d(PrGreenCheckBox prGreenCheckBox, Integer num) {
        ug0.f(prGreenCheckBox, "this$0");
        int id = prGreenCheckBox.getId();
        if (num != null && num.intValue() == id) {
            prGreenCheckBox.setEnabled(true);
            prGreenCheckBox.setChecked(true);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final void c() {
        boolean booleanValue;
        vw1<Boolean> vw1Var = oy0.e;
        Boolean bool = Boolean.FALSE;
        Boolean a2 = vw1Var.a(bool);
        ug0.e(a2, "adsDisabled.invoke(false)");
        if (a2.booleanValue()) {
            booleanValue = true;
        } else {
            oy0.d.b(new ww1.a() { // from class: com.daaw.ny0
                @Override // com.daaw.ww1.a
                public final Object b(Object obj) {
                    Boolean d;
                    d = PrGreenCheckBox.d(PrGreenCheckBox.this, (Integer) obj);
                    return d;
                }
            }, this.t);
            Boolean a3 = oy0.c.a(Integer.valueOf(getId()), bool);
            ug0.e(a3, "isFieldUnlocked(id, false)");
            booleanValue = a3.booleanValue();
        }
        setEnabled(booleanValue);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ug0.f(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (isChecked()) {
                setChecked(false);
            } else {
                if (!isEnabled()) {
                    Boolean a2 = oy0.b.a(Integer.valueOf(getId()), Boolean.FALSE);
                    ug0.e(a2, "unlockField(id, false)");
                    if (a2.booleanValue()) {
                        setEnabled(true);
                    }
                }
                setChecked(true);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
