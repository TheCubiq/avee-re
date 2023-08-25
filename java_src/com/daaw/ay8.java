package com.daaw;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
/* loaded from: classes.dex */
public final class ay8 implements DisplayManager.DisplayListener, yx8 {

    /* renamed from: a */
    public final DisplayManager f4111a;

    /* renamed from: b */
    public wx8 f4112b;

    public ay8(DisplayManager displayManager) {
        this.f4111a = displayManager;
    }

    /* renamed from: b */
    public static yx8 m26599b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new ay8(displayManager);
        }
        return null;
    }

    @Override // com.daaw.yx8
    /* renamed from: a */
    public final void mo1796a(wx8 wx8Var) {
        this.f4112b = wx8Var;
        this.f4111a.registerDisplayListener(this, it5.m19399d(null));
        cy8.m24880b(wx8Var.f31647a, m26598c());
    }

    /* renamed from: c */
    public final Display m26598c() {
        return this.f4111a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        wx8 wx8Var = this.f4112b;
        if (wx8Var == null || i != 0) {
            return;
        }
        cy8.m24880b(wx8Var.f31647a, m26598c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.daaw.yx8
    public final void zza() {
        this.f4111a.unregisterDisplayListener(this);
        this.f4112b = null;
    }
}
