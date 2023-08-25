package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.InterfaceC0162a;
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0162a {

    /* renamed from: p */
    public InterfaceC0162a.InterfaceC0163a f623p;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0162a.InterfaceC0163a interfaceC0163a = this.f623p;
        if (interfaceC0163a != null) {
            interfaceC0163a.mo27651a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0162a
    public void setOnFitSystemWindowsListener(InterfaceC0162a.InterfaceC0163a interfaceC0163a) {
        this.f623p = interfaceC0163a;
    }
}
