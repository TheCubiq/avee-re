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
/* renamed from: com.daaw.e3 */
/* loaded from: classes.dex */
public class C1156e3 extends fs1 implements Animatable {

    /* renamed from: q */
    public C1158b f8060q;

    /* renamed from: r */
    public Context f8061r;

    /* renamed from: s */
    public ArgbEvaluator f8062s;

    /* renamed from: t */
    public Animator.AnimatorListener f8063t;

    /* renamed from: u */
    public ArrayList<Object> f8064u;

    /* renamed from: v */
    public final Drawable.Callback f8065v;

    /* renamed from: com.daaw.e3$a */
    /* loaded from: classes.dex */
    public class C1157a implements Drawable.Callback {
        public C1157a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C1156e3.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1156e3.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1156e3.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: com.daaw.e3$b */
    /* loaded from: classes.dex */
    public static class C1158b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f8067a;

        /* renamed from: b */
        public gs1 f8068b;

        /* renamed from: c */
        public AnimatorSet f8069c;

        /* renamed from: d */
        public ArrayList<Animator> f8070d;

        /* renamed from: e */
        public C1370g6<Animator, String> f8071e;

        public C1158b(Context context, C1158b c1158b, Drawable.Callback callback, Resources resources) {
            if (c1158b != null) {
                this.f8067a = c1158b.f8067a;
                gs1 gs1Var = c1158b.f8068b;
                if (gs1Var != null) {
                    Drawable.ConstantState constantState = gs1Var.getConstantState();
                    this.f8068b = (gs1) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    gs1 gs1Var2 = (gs1) this.f8068b.mutate();
                    this.f8068b = gs1Var2;
                    gs1Var2.setCallback(callback);
                    this.f8068b.setBounds(c1158b.f8068b.getBounds());
                    this.f8068b.m21287h(false);
                }
                ArrayList<Animator> arrayList = c1158b.f8070d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f8070d = new ArrayList<>(size);
                    this.f8071e = new C1370g6<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c1158b.f8070d.get(i);
                        Animator clone = animator.clone();
                        String str = c1158b.f8071e.get(animator);
                        clone.setTarget(this.f8068b.m21291d(str));
                        this.f8070d.add(clone);
                        this.f8071e.put(clone, str);
                    }
                    m23781a();
                }
            }
        }

        /* renamed from: a */
        public void m23781a() {
            if (this.f8069c == null) {
                this.f8069c = new AnimatorSet();
            }
            this.f8069c.playTogether(this.f8070d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8067a;
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

    /* renamed from: com.daaw.e3$c */
    /* loaded from: classes.dex */
    public static class C1159c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f8072a;

        public C1159c(Drawable.ConstantState constantState) {
            this.f8072a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f8072a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8072a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1156e3 c1156e3 = new C1156e3();
            Drawable newDrawable = this.f8072a.newDrawable();
            c1156e3.f9848p = newDrawable;
            newDrawable.setCallback(c1156e3.f8065v);
            return c1156e3;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1156e3 c1156e3 = new C1156e3();
            Drawable newDrawable = this.f8072a.newDrawable(resources);
            c1156e3.f9848p = newDrawable;
            newDrawable.setCallback(c1156e3.f8065v);
            return c1156e3;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1156e3 c1156e3 = new C1156e3();
            Drawable newDrawable = this.f8072a.newDrawable(resources, theme);
            c1156e3.f9848p = newDrawable;
            newDrawable.setCallback(c1156e3.f8065v);
            return c1156e3;
        }
    }

    public C1156e3() {
        this(null, null, null);
    }

    public C1156e3(Context context) {
        this(context, null, null);
    }

    public C1156e3(Context context, C1158b c1158b, Resources resources) {
        this.f8062s = null;
        this.f8063t = null;
        this.f8064u = null;
        C1157a c1157a = new C1157a();
        this.f8065v = c1157a;
        this.f8061r = context;
        if (c1158b != null) {
            this.f8060q = c1158b;
        } else {
            this.f8060q = new C1158b(context, c1158b, c1157a, resources);
        }
    }

    /* renamed from: a */
    public static C1156e3 m23784a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1156e3 c1156e3 = new C1156e3(context);
        c1156e3.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1156e3;
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14826a(drawable, theme);
        }
    }

    /* renamed from: b */
    public final void m23783b(String str, Animator animator) {
        animator.setTarget(this.f8060q.f8068b.m21291d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m23782c(animator);
        }
        C1158b c1158b = this.f8060q;
        if (c1158b.f8070d == null) {
            c1158b.f8070d = new ArrayList<>();
            this.f8060q.f8071e = new C1370g6<>();
        }
        this.f8060q.f8070d.add(animator);
        this.f8060q.f8071e.put(animator, str);
    }

    /* renamed from: c */
    public final void m23782c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m23782c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f8062s == null) {
                    this.f8062s = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f8062s);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            return C2366nu.m14825b(drawable);
        }
        return false;
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f8060q.f8068b.draw(canvas);
        if (this.f8060q.f8069c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f9848p;
        return drawable != null ? C2366nu.m14823d(drawable) : this.f8060q.f8068b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f8060q.f8067a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f9848p;
        return drawable != null ? C2366nu.m14822e(drawable) : this.f8060q.f8068b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f9848p == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1159c(this.f9848p.getConstantState());
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f8060q.f8068b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f8060q.f8068b.getIntrinsicWidth();
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
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.getOpacity() : this.f8060q.f8068b.getOpacity();
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
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14820g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = so1.m10117k(resources, theme, attributeSet, C0567a3.f2728e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        gs1 m21293b = gs1.m21293b(resources, resourceId, theme);
                        m21293b.m21287h(false);
                        m21293b.setCallback(this.f8065v);
                        gs1 gs1Var = this.f8060q.f8068b;
                        if (gs1Var != null) {
                            gs1Var.setCallback(null);
                        }
                        this.f8060q.f8068b = m21293b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0567a3.f2729f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f8061r;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m23783b(string, C1497h3.m21070i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f8060q.m23781a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f9848p;
        return drawable != null ? C2366nu.m14819h(drawable) : this.f8060q.f8068b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f9848p;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f8060q.f8069c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.isStateful() : this.f8060q.f8068b.isStateful();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f8060q.f8068b.setBounds(rect);
        }
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.setLevel(i) : this.f8060q.f8068b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.setState(iArr) : this.f8060q.f8068b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f8060q.f8068b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14817j(drawable, z);
        } else {
            this.f8060q.f8068b.setAutoMirrored(z);
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
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8060q.f8068b.setColorFilter(colorFilter);
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
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14813n(drawable, i);
        } else {
            this.f8060q.f8068b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14812o(drawable, colorStateList);
        } else {
            this.f8060q.f8068b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14811p(drawable, mode);
        } else {
            this.f8060q.f8068b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f8060q.f8068b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f8060q.f8069c.isStarted()) {
        } else {
            this.f8060q.f8069c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f8060q.f8069c.end();
        }
    }
}
