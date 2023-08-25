package com.daaw;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
/* loaded from: classes.dex */
public final class ay8 implements DisplayManager.DisplayListener, yx8 {
    public final DisplayManager a;
    public wx8 b;

    public ay8(DisplayManager displayManager) {
        this.a = displayManager;
    }

    public static yx8 b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new ay8(displayManager);
        }
        return null;
    }

    @Override // com.daaw.yx8
    public final void a(wx8 wx8Var) {
        this.b = wx8Var;
        this.a.registerDisplayListener(this, it5.d(null));
        cy8.b(wx8Var.a, c());
    }

    public final Display c() {
        return this.a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        wx8 wx8Var = this.b;
        if (wx8Var == null || i != 0) {
            return;
        }
        cy8.b(wx8Var.a, c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.daaw.yx8
    public final void zza() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }
}
