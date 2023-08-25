package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class j4 extends ImageView implements vl1, zl1 {
    public final r3 p;
    public final i4 q;
    public boolean r;

    public j4(Context context) {
        this(context, null);
    }

    public j4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j4(Context context, AttributeSet attributeSet, int i) {
        super(rl1.b(context), attributeSet, i);
        this.r = false;
        yk1.a(this, getContext());
        r3 r3Var = new r3(this);
        this.p = r3Var;
        r3Var.e(attributeSet, i);
        i4 i4Var = new i4(this);
        this.q = i4Var;
        i4Var.g(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.b();
        }
        i4 i4Var = this.q;
        if (i4Var != null) {
            i4Var.c();
        }
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        r3 r3Var = this.p;
        if (r3Var != null) {
            return r3Var.c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r3 r3Var = this.p;
        if (r3Var != null) {
            return r3Var.d();
        }
        return null;
    }

    @Override // com.daaw.zl1
    public ColorStateList getSupportImageTintList() {
        i4 i4Var = this.q;
        if (i4Var != null) {
            return i4Var.d();
        }
        return null;
    }

    @Override // com.daaw.zl1
    public PorterDuff.Mode getSupportImageTintMode() {
        i4 i4Var = this.q;
        if (i4Var != null) {
            return i4Var.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.q.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        i4 i4Var = this.q;
        if (i4Var != null) {
            i4Var.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        i4 i4Var = this.q;
        if (i4Var != null && drawable != null && !this.r) {
            i4Var.h(drawable);
        }
        super.setImageDrawable(drawable);
        i4 i4Var2 = this.q;
        if (i4Var2 != null) {
            i4Var2.c();
            if (this.r) {
                return;
            }
            this.q.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.r = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        i4 i4Var = this.q;
        if (i4Var != null) {
            i4Var.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        i4 i4Var = this.q;
        if (i4Var != null) {
            i4Var.c();
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.j(mode);
        }
    }

    @Override // com.daaw.zl1
    public void setSupportImageTintList(ColorStateList colorStateList) {
        i4 i4Var = this.q;
        if (i4Var != null) {
            i4Var.j(colorStateList);
        }
    }

    @Override // com.daaw.zl1
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        i4 i4Var = this.q;
        if (i4Var != null) {
            i4Var.k(mode);
        }
    }
}
