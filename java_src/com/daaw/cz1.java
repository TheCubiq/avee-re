package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class cz1 extends bz1 {
    public static Method w;

    public cz1(Drawable drawable) {
        super(drawable);
        g();
    }

    public cz1(dz1 dz1Var, Resources resources) {
        super(dz1Var, resources);
        g();
    }

    @Override // com.daaw.bz1
    public boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.u;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    public final void g() {
        if (w == null) {
            try {
                w = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.u.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.u.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.u;
        if (drawable != null && (method = w) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.u.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.u.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.daaw.bz1, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // com.daaw.bz1, android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.u.setTint(i);
        }
    }

    @Override // com.daaw.bz1, android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.u.setTintList(colorStateList);
        }
    }

    @Override // com.daaw.bz1, android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.u.setTintMode(mode);
        }
    }
}
