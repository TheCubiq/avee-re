package com.daaw;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import com.daaw.lf1;
import com.daaw.ou;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class d3 extends lf1 implements ql1 {
    public static final String I = d3.class.getSimpleName();
    public c D;
    public g E;
    public int F;
    public int G;
    public boolean H;

    /* loaded from: classes.dex */
    public static class b extends g {
        public final Animatable a;

        public b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // com.daaw.d3.g
        public void c() {
            this.a.start();
        }

        @Override // com.daaw.d3.g
        public void d() {
            this.a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends lf1.a {
        public sl0<Long> K;
        public me1<Integer> L;

        public c(c cVar, d3 d3Var, Resources resources) {
            super(cVar, d3Var, resources);
            me1<Integer> me1Var;
            if (cVar != null) {
                this.K = cVar.K;
                me1Var = cVar.L;
            } else {
                this.K = new sl0<>();
                me1Var = new me1<>();
            }
            this.L = me1Var;
        }

        public static long D(int i, int i2) {
            return i2 | (i << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i) {
            int z = super.z(iArr, drawable);
            this.L.k(z, Integer.valueOf(i));
            return z;
        }

        public int C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long D = D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = a;
            this.K.a(D, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        public int E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.f(i, 0).intValue();
        }

        public int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        public int G(int i, int i2) {
            return (int) this.K.f(D(i, i2), -1L).longValue();
        }

        public boolean H(int i, int i2) {
            return (this.K.f(D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        public boolean I(int i, int i2) {
            return (this.K.f(D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // com.daaw.lf1.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d3(this, null);
        }

        @Override // com.daaw.lf1.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d3(this, resources);
        }

        @Override // com.daaw.lf1.a, com.daaw.ou.d
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {
        public final e3 a;

        public d(e3 e3Var) {
            super();
            this.a = e3Var;
        }

        @Override // com.daaw.d3.g
        public void c() {
            this.a.start();
        }

        @Override // com.daaw.d3.g
        public void d() {
            this.a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends g {
        public final ObjectAnimator a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            jh.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // com.daaw.d3.g
        public boolean a() {
            return this.b;
        }

        @Override // com.daaw.d3.g
        public void b() {
            this.a.reverse();
        }

        @Override // com.daaw.d3.g
        public void c() {
            this.a.start();
        }

        @Override // com.daaw.d3.g
        public void d() {
            this.a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        public int a() {
            return this.c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public d3() {
        this(null, null);
    }

    public d3(c cVar, Resources resources) {
        super(null);
        this.F = -1;
        this.G = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static d3 m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            d3 d3Var = new d3();
            d3Var.n(context, resources, xmlPullParser, attributeSet, theme);
            return d3Var;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // com.daaw.lf1, com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.daaw.lf1, com.daaw.ou
    public void h(ou.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.D = (c) dVar;
        }
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // com.daaw.lf1, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.E;
        if (gVar != null) {
            gVar.d();
            this.E = null;
            g(this.F);
            this.F = -1;
            this.G = -1;
        }
    }

    @Override // com.daaw.lf1
    /* renamed from: l */
    public c j() {
        return new c(this.D, this, null);
    }

    @Override // com.daaw.lf1, com.daaw.ou, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.H && super.mutate() == this) {
            this.D.r();
            this.H = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k = so1.k(resources, theme, attributeSet, o21.a);
        setVisible(k.getBoolean(o21.c, true), true);
        t(k);
        i(resources);
        k.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public final void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // com.daaw.lf1, com.daaw.ou, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.D.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public final void p() {
        onStateChange(getState());
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = so1.k(resources, theme, attributeSet, o21.h);
        int resourceId = k.getResourceId(o21.i, 0);
        int resourceId2 = k.getResourceId(o21.j, -1);
        Drawable j = resourceId2 > 0 ? g51.h().j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j = xmlPullParser.getName().equals("vector") ? gs1.c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? kh.a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (j != null) {
            return this.D.B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = so1.k(resources, theme, attributeSet, o21.k);
        int resourceId = k.getResourceId(o21.n, -1);
        int resourceId2 = k.getResourceId(o21.m, -1);
        int resourceId3 = k.getResourceId(o21.l, -1);
        Drawable j = resourceId3 > 0 ? g51.h().j(context, resourceId3) : null;
        boolean z = k.getBoolean(o21.o, false);
        k.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j = xmlPullParser.getName().equals("animated-vector") ? e3.a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? kh.a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId == -1 || resourceId2 == -1) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        } else {
            return this.D.C(resourceId, resourceId2, j, z);
        }
    }

    public final boolean s(int i) {
        int c2;
        int G;
        g bVar;
        g gVar = this.E;
        if (gVar == null) {
            c2 = c();
        } else if (i == this.F) {
            return true;
        } else {
            if (i == this.G && gVar.a()) {
                gVar.b();
                this.F = this.G;
                this.G = i;
                return true;
            }
            c2 = this.F;
            gVar.d();
        }
        this.E = null;
        this.G = -1;
        this.F = -1;
        c cVar = this.D;
        int E = cVar.E(c2);
        int E2 = cVar.E(i);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I2 = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I2);
        } else if (!(current instanceof e3)) {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        } else {
            bVar = new d((e3) current);
        }
        bVar.c();
        this.E = bVar;
        this.G = c2;
        this.F = i;
        return true;
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable, com.daaw.ql1
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable, com.daaw.ql1
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.E;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public final void t(TypedArray typedArray) {
        c cVar = this.D;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.d |= kh.b(typedArray);
        }
        cVar.x(typedArray.getBoolean(o21.d, cVar.i));
        cVar.t(typedArray.getBoolean(o21.e, cVar.l));
        cVar.u(typedArray.getInt(o21.f, cVar.A));
        cVar.v(typedArray.getInt(o21.g, cVar.B));
        setDither(typedArray.getBoolean(o21.b, cVar.x));
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
