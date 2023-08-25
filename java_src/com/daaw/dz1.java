package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* loaded from: classes.dex */
public final class dz1 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f7996a;

    /* renamed from: b */
    public Drawable.ConstantState f7997b;

    /* renamed from: c */
    public ColorStateList f7998c;

    /* renamed from: d */
    public PorterDuff.Mode f7999d;

    public dz1(dz1 dz1Var) {
        this.f7998c = null;
        this.f7999d = bz1.f5287v;
        if (dz1Var != null) {
            this.f7996a = dz1Var.f7996a;
            this.f7997b = dz1Var.f7997b;
            this.f7998c = dz1Var.f7998c;
            this.f7999d = dz1Var.f7999d;
        }
    }

    /* renamed from: a */
    public boolean m23807a() {
        return this.f7997b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f7996a;
        Drawable.ConstantState constantState = this.f7997b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new cz1(this, resources) : new bz1(this, resources);
    }
}
