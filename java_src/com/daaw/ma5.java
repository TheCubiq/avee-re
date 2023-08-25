package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public final class ma5 {

    /* renamed from: a */
    public Context f18724a;

    /* renamed from: b */
    public PopupWindow f18725b;

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m16134a(Context context, View view) {
        PopupWindow popupWindow;
        if (!vw0.m6701d() || vw0.m6699f()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) context).isDestroyed()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            k04.zze("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
            }
            this.f18725b = popupWindow;
            if (popupWindow == null) {
                context = null;
            }
            this.f18724a = context;
        }
        popupWindow = null;
        this.f18725b = popupWindow;
        if (popupWindow == null) {
        }
        this.f18724a = context;
    }

    /* renamed from: b */
    public final void m16133b() {
        Context context = this.f18724a;
        if (context == null || this.f18725b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f18725b.isShowing()) {
            this.f18725b.dismiss();
        }
        this.f18724a = null;
        this.f18725b = null;
    }
}
