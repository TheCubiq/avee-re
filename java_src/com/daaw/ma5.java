package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public final class ma5 {
    public Context a;
    public PopupWindow b;

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r7, android.view.View r8) {
        /*
            r6 = this;
            boolean r0 = com.daaw.vw0.d()
            if (r0 == 0) goto L61
            boolean r0 = com.daaw.vw0.f()
            if (r0 == 0) goto Ld
            goto L61
        Ld:
            boolean r0 = r7 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r7
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L59
            android.view.View r2 = r0.getDecorView()
            if (r2 != 0) goto L24
            goto L59
        L24:
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L2e
            goto L59
        L2e:
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r7)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            r2.addView(r8, r4, r4)
            android.widget.PopupWindow r8 = new android.widget.PopupWindow
            r3 = 1
            r5 = 0
            r8.<init>(r2, r3, r3, r5)
            r8.setOutsideTouchable(r3)
            r8.setClippingEnabled(r5)
            java.lang.String r2 = "Displaying the 1x1 popup off the screen."
            com.daaw.k04.zze(r2)
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L59
            r8.showAtLocation(r0, r5, r4, r4)     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r8 = r1
        L5a:
            r6.b = r8
            if (r8 != 0) goto L5f
            r7 = r1
        L5f:
            r6.a = r7
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ma5.a(android.content.Context, android.view.View):void");
    }

    public final void b() {
        Context context = this.a;
        if (context == null || this.b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.b.isShowing()) {
            this.b.dismiss();
        }
        this.a = null;
        this.b = null;
    }
}
