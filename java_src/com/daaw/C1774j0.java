package com.daaw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
/* renamed from: com.daaw.j0 */
/* loaded from: classes.dex */
public class C1774j0 extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f14141a;

    /* renamed from: com.daaw.j0$a */
    /* loaded from: classes.dex */
    public static class C1775a {
        /* renamed from: a */
        public static void m19215a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C1774j0(ActionBarContainer actionBarContainer) {
        this.f14141a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f14141a;
        if (actionBarContainer.f472w) {
            Drawable drawable = actionBarContainer.f471v;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f469t;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f14141a;
        Drawable drawable3 = actionBarContainer2.f470u;
        if (drawable3 == null || !actionBarContainer2.f473x) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f14141a;
        if (!actionBarContainer.f472w) {
            drawable = actionBarContainer.f469t;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f471v == null) {
            return;
        } else {
            drawable = actionBarContainer.f469t;
        }
        C1775a.m19215a(drawable, outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
