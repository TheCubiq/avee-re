package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.a;
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements a {
    public a.InterfaceC0009a p;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        a.InterfaceC0009a interfaceC0009a = this.p;
        if (interfaceC0009a != null) {
            interfaceC0009a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.a
    public void setOnFitSystemWindowsListener(a.InterfaceC0009a interfaceC0009a) {
        this.p = interfaceC0009a;
    }
}
