package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.C2575pq;
import com.daaw.avee.comp.Common.PrControls.PrGreenCheckBox;
import com.daaw.oy0;
import com.daaw.ug0;
import com.daaw.vw1;
import com.daaw.ww1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public final class PrGreenCheckBox extends AppCompatCheckBox {

    /* renamed from: u */
    public static final C0705a f3804u = new C0705a(null);

    /* renamed from: v */
    public static final vw1<Boolean> f3805v = new vw1<>();

    /* renamed from: t */
    public final List<Object> f3806t;

    /* renamed from: com.daaw.avee.comp.Common.PrControls.PrGreenCheckBox$a */
    /* loaded from: classes.dex */
    public static final class C0705a {
        public C0705a() {
        }

        public /* synthetic */ C0705a(C2575pq c2575pq) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrGreenCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ug0.m8268f(context, "context");
        this.f3806t = new LinkedList();
        m26865c();
    }

    /* renamed from: d */
    public static final Boolean m26864d(PrGreenCheckBox prGreenCheckBox, Integer num) {
        ug0.m8268f(prGreenCheckBox, "this$0");
        int id = prGreenCheckBox.getId();
        if (num != null && num.intValue() == id) {
            prGreenCheckBox.setEnabled(true);
            prGreenCheckBox.setChecked(true);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* renamed from: c */
    public final void m26865c() {
        boolean booleanValue;
        vw1<Boolean> vw1Var = oy0.f22101e;
        Boolean bool = Boolean.FALSE;
        Boolean m6692a = vw1Var.m6692a(bool);
        ug0.m8269e(m6692a, "adsDisabled.invoke(false)");
        if (m6692a.booleanValue()) {
            booleanValue = true;
        } else {
            oy0.f22100d.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.ny0
                @Override // com.daaw.ww1.InterfaceC3477a
                /* renamed from: b */
                public final Object mo5751b(Object obj) {
                    Boolean m26864d;
                    m26864d = PrGreenCheckBox.m26864d(PrGreenCheckBox.this, (Integer) obj);
                    return m26864d;
                }
            }, this.f3806t);
            Boolean m5753a = oy0.f22099c.m5753a(Integer.valueOf(getId()), bool);
            ug0.m8269e(m5753a, "isFieldUnlocked(id, false)");
            booleanValue = m5753a.booleanValue();
        }
        setEnabled(booleanValue);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ug0.m8268f(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (isChecked()) {
                setChecked(false);
            } else {
                if (!isEnabled()) {
                    Boolean m5753a = oy0.f22098b.m5753a(Integer.valueOf(getId()), Boolean.FALSE);
                    ug0.m8269e(m5753a, "unlockField(id, false)");
                    if (m5753a.booleanValue()) {
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
