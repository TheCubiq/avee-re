package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class e3 extends fs1 implements Animatable {
    public b q;
    public Context r;
    public ArgbEvaluator s;
    public Animator.AnimatorListener t;
    public ArrayList<Object> u;
    public final Drawable.Callback v;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            e3.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            e3.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            e3.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {
        public int a;
        public gs1 b;
        public AnimatorSet c;
        public ArrayList<Animator> d;
        public g6<Animator, String> e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                gs1 gs1Var = bVar.b;
                if (gs1Var != null) {
                    Drawable.ConstantState constantState = gs1Var.getConstantState();
                    this.b = (gs1) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    gs1 gs1Var2 = (gs1) this.b.mutate();
                    this.b = gs1Var2;
                    gs1Var2.setCallback(callback);
                    this.b.setBounds(bVar.b.getBounds());
                    this.b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new g6<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.e.get(animator);
                        clone.setTarget(this.b.d(str));
                        this.d.add(clone);
                        this.e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            e3 e3Var = new e3();
            Drawable newDrawable = this.a.newDrawable();
            e3Var.p = newDrawable;
            newDrawable.setCallback(e3Var.v);
            return e3Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            e3 e3Var = new e3();
            Drawable newDrawable = this.a.newDrawable(resources);
            e3Var.p = newDrawable;
            newDrawable.setCallback(e3Var.v);
            return e3Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            e3 e3Var = new e3();
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            e3Var.p = newDrawable;
            newDrawable.setCallback(e3Var.v);
            return e3Var;
        }
    }

    public e3() {
        this(null, null, null);
    }

    public e3(Context context) {
        this(context, null, null);
    }

    public e3(Context context, b bVar, Resources resources) {
        this.s = null;
        this.t = null;
        this.u = null;
        a aVar = new a();
        this.v = aVar;
        this.r = context;
        if (bVar != null) {
            this.q = bVar;
        } else {
            this.q = new b(context, bVar, aVar, resources);
        }
    }

    public static e3 a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        e3 e3Var = new e3(context);
        e3Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return e3Var;
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.p;
        if (drawable != null) {
            nu.a(drawable, theme);
        }
    }

    public final void b(String str, Animator animator) {
        animator.setTarget(this.q.b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        b bVar = this.q;
        if (bVar.d == null) {
            bVar.d = new ArrayList<>();
            this.q.e = new g6<>();
        }
        this.q.d.add(animator);
        this.q.e.put(animator, str);
    }

    public final void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.s == null) {
                    this.s = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.s);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.p;
        if (drawable != null) {
            return nu.b(drawable);
        }
        return false;
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.q.b.draw(canvas);
        if (this.q.c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.p;
        return drawable != null ? nu.d(drawable) : this.q.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.p;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.q.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.p;
        return drawable != null ? nu.e(drawable) : this.q.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.p == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.p.getConstantState());
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.p;
        return drawable != null ? drawable.getIntrinsicHeight() : this.q.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.p;
        return drawable != null ? drawable.getIntrinsicWidth() : this.q.b.getIntrinsicWidth();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.p;
        return drawable != null ? drawable.getOpacity() : this.q.b.getOpacity();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.p;
        if (drawable != null) {
            nu.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = so1.k(resources, theme, attributeSet, a3.e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        gs1 b2 = gs1.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.v);
                        gs1 gs1Var = this.q.b;
                        if (gs1Var != null) {
                            gs1Var.setCallback(null);
                        }
                        this.q.b = b2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a3.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.r;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, h3.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.q.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.p;
        return drawable != null ? nu.h(drawable) : this.q.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.p;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.q.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.p;
        return drawable != null ? drawable.isStateful() : this.q.b.isStateful();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.q.b.setBounds(rect);
        }
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.p;
        return drawable != null ? drawable.setLevel(i) : this.q.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.p;
        return drawable != null ? drawable.setState(iArr) : this.q.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.q.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.p;
        if (drawable != null) {
            nu.j(drawable, z);
        } else {
            this.q.b.setAutoMirrored(z);
        }
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.q.b.setColorFilter(colorFilter);
        }
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        Drawable drawable = this.p;
        if (drawable != null) {
            nu.n(drawable, i);
        } else {
            this.q.b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.p;
        if (drawable != null) {
            nu.o(drawable, colorStateList);
        } else {
            this.q.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.p;
        if (drawable != null) {
            nu.p(drawable, mode);
        } else {
            this.q.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.p;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.q.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.p;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.q.c.isStarted()) {
        } else {
            this.q.c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.p;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.q.c.end();
        }
    }
}
