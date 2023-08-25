package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* renamed from: com.daaw.h4 */
/* loaded from: classes.dex */
public class C1499h4 extends ImageButton implements vl1, zl1 {

    /* renamed from: p */
    public final C2816r3 f12013p;

    /* renamed from: q */
    public final C1655i4 f12014q;

    /* renamed from: r */
    public boolean f12015r;

    public C1499h4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.imageButtonStyle);
    }

    public C1499h4(Context context, AttributeSet attributeSet, int i) {
        super(rl1.m11199b(context), attributeSet, i);
        this.f12015r = false;
        yk1.m3617a(this, getContext());
        C2816r3 c2816r3 = new C2816r3(this);
        this.f12013p = c2816r3;
        c2816r3.m11818e(attributeSet, i);
        C1655i4 c1655i4 = new C1655i4(this);
        this.f12014q = c1655i4;
        c1655i4.m20151g(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2816r3 c2816r3 = this.f12013p;
        if (c2816r3 != null) {
            c2816r3.m11821b();
        }
        C1655i4 c1655i4 = this.f12014q;
        if (c1655i4 != null) {
            c1655i4.m20155c();
        }
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        C2816r3 c2816r3 = this.f12013p;
        if (c2816r3 != null) {
            return c2816r3.m11820c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2816r3 c2816r3 = this.f12013p;
        if (c2816r3 != null) {
            return c2816r3.m11819d();
        }
        return null;
    }

    @Override // com.daaw.zl1
    public ColorStateList getSupportImageTintList() {
        C1655i4 c1655i4 = this.f12014q;
        if (c1655i4 != null) {
            return c1655i4.m20154d();
        }
        return null;
    }

    @Override // com.daaw.zl1
    public PorterDuff.Mode getSupportImageTintMode() {
        C1655i4 c1655i4 = this.f12014q;
        if (c1655i4 != null) {
            return c1655i4.m20153e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f12014q.m20152f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2816r3 c2816r3 = this.f12013p;
        if (c2816r3 != null) {
            c2816r3.m11817f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2816r3 c2816r3 = this.f12013p;
        if (c2816r3 != null) {
            c2816r3.m11816g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1655i4 c1655i4 = this.f12014q;
        if (c1655i4 != null) {
            c1655i4.m20155c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1655i4 c1655i4 = this.f12014q;
        if (c1655i4 != null && drawable != null && !this.f12015r) {
            c1655i4.m20150h(drawable);
        }
        super.setImageDrawable(drawable);
        C1655i4 c1655i42 = this.f12014q;
        if (c1655i42 != null) {
            c1655i42.m20155c();
            if (this.f12015r) {
                return;
            }
            this.f12014q.m20156b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f12015r = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f12014q.m20149i(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1655i4 c1655i4 = this.f12014q;
        if (c1655i4 != null) {
            c1655i4.m20155c();
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2816r3 c2816r3 = this.f12013p;
        if (c2816r3 != null) {
            c2816r3.m11814i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2816r3 c2816r3 = this.f12013p;
        if (c2816r3 != null) {
            c2816r3.m11813j(mode);
        }
    }

    @Override // com.daaw.zl1
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1655i4 c1655i4 = this.f12014q;
        if (c1655i4 != null) {
            c1655i4.m20148j(colorStateList);
        }
    }

    @Override // com.daaw.zl1
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1655i4 c1655i4 = this.f12014q;
        if (c1655i4 != null) {
            c1655i4.m20147k(mode);
        }
    }
}
