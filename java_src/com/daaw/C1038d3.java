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
import com.daaw.C2477ou;
import com.daaw.lf1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@SuppressLint({"RestrictedAPI"})
/* renamed from: com.daaw.d3 */
/* loaded from: classes.dex */
public class C1038d3 extends lf1 implements ql1 {

    /* renamed from: I */
    public static final String f6422I = C1038d3.class.getSimpleName();

    /* renamed from: D */
    public C1041c f6423D;

    /* renamed from: E */
    public AbstractC1045g f6424E;

    /* renamed from: F */
    public int f6425F;

    /* renamed from: G */
    public int f6426G;

    /* renamed from: H */
    public boolean f6427H;

    /* renamed from: com.daaw.d3$b */
    /* loaded from: classes.dex */
    public static class C1040b extends AbstractC1045g {

        /* renamed from: a */
        public final Animatable f6428a;

        public C1040b(Animatable animatable) {
            super();
            this.f6428a = animatable;
        }

        @Override // com.daaw.C1038d3.AbstractC1045g
        /* renamed from: c */
        public void mo24734c() {
            this.f6428a.start();
        }

        @Override // com.daaw.C1038d3.AbstractC1045g
        /* renamed from: d */
        public void mo24733d() {
            this.f6428a.stop();
        }
    }

    /* renamed from: com.daaw.d3$c */
    /* loaded from: classes.dex */
    public static class C1041c extends lf1.C2036a {

        /* renamed from: K */
        public sl0<Long> f6429K;

        /* renamed from: L */
        public me1<Integer> f6430L;

        public C1041c(C1041c c1041c, C1038d3 c1038d3, Resources resources) {
            super(c1041c, c1038d3, resources);
            me1<Integer> me1Var;
            if (c1041c != null) {
                this.f6429K = c1041c.f6429K;
                me1Var = c1041c.f6430L;
            } else {
                this.f6429K = new sl0<>();
                me1Var = new me1<>();
            }
            this.f6430L = me1Var;
        }

        /* renamed from: D */
        public static long m24744D(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: B */
        public int m24746B(int[] iArr, Drawable drawable, int i) {
            int m16968z = super.m16968z(iArr, drawable);
            this.f6430L.m16052k(m16968z, Integer.valueOf(i));
            return m16968z;
        }

        /* renamed from: C */
        public int m24745C(int i, int i2, Drawable drawable, boolean z) {
            int m13957a = super.m13957a(drawable);
            long m24744D = m24744D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = m13957a;
            this.f6429K.m10218a(m24744D, Long.valueOf(j2 | j));
            if (z) {
                this.f6429K.m10218a(m24744D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m13957a;
        }

        /* renamed from: E */
        public int m24743E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f6430L.m16055f(i, 0).intValue();
        }

        /* renamed from: F */
        public int m24742F(int[] iArr) {
            int m16969A = super.m16969A(iArr);
            return m16969A >= 0 ? m16969A : super.m16969A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        public int m24741G(int i, int i2) {
            return (int) this.f6429K.m10213f(m24744D(i, i2), -1L).longValue();
        }

        /* renamed from: H */
        public boolean m24740H(int i, int i2) {
            return (this.f6429K.m10213f(m24744D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        public boolean m24739I(int i, int i2) {
            return (this.f6429K.m10213f(m24744D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // com.daaw.lf1.C2036a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1038d3(this, null);
        }

        @Override // com.daaw.lf1.C2036a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1038d3(this, resources);
        }

        @Override // com.daaw.lf1.C2036a, com.daaw.C2477ou.AbstractC2481d
        /* renamed from: r */
        public void mo13940r() {
            this.f6429K = this.f6429K.clone();
            this.f6430L = this.f6430L.clone();
        }
    }

    /* renamed from: com.daaw.d3$d */
    /* loaded from: classes.dex */
    public static class C1042d extends AbstractC1045g {

        /* renamed from: a */
        public final C1156e3 f6431a;

        public C1042d(C1156e3 c1156e3) {
            super();
            this.f6431a = c1156e3;
        }

        @Override // com.daaw.C1038d3.AbstractC1045g
        /* renamed from: c */
        public void mo24734c() {
            this.f6431a.start();
        }

        @Override // com.daaw.C1038d3.AbstractC1045g
        /* renamed from: d */
        public void mo24733d() {
            this.f6431a.stop();
        }
    }

    /* renamed from: com.daaw.d3$e */
    /* loaded from: classes.dex */
    public static class C1043e extends AbstractC1045g {

        /* renamed from: a */
        public final ObjectAnimator f6432a;

        /* renamed from: b */
        public final boolean f6433b;

        public C1043e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C1044f c1044f = new C1044f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            C1828jh.m18524a(ofInt, true);
            ofInt.setDuration(c1044f.m24738a());
            ofInt.setInterpolator(c1044f);
            this.f6433b = z2;
            this.f6432a = ofInt;
        }

        @Override // com.daaw.C1038d3.AbstractC1045g
        /* renamed from: a */
        public boolean mo24736a() {
            return this.f6433b;
        }

        @Override // com.daaw.C1038d3.AbstractC1045g
        /* renamed from: b */
        public void mo24735b() {
            this.f6432a.reverse();
        }

        @Override // com.daaw.C1038d3.AbstractC1045g
        /* renamed from: c */
        public void mo24734c() {
            this.f6432a.start();
        }

        @Override // com.daaw.C1038d3.AbstractC1045g
        /* renamed from: d */
        public void mo24733d() {
            this.f6432a.cancel();
        }
    }

    /* renamed from: com.daaw.d3$f */
    /* loaded from: classes.dex */
    public static class C1044f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f6434a;

        /* renamed from: b */
        public int f6435b;

        /* renamed from: c */
        public int f6436c;

        public C1044f(AnimationDrawable animationDrawable, boolean z) {
            m24737b(animationDrawable, z);
        }

        /* renamed from: a */
        public int m24738a() {
            return this.f6436c;
        }

        /* renamed from: b */
        public int m24737b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f6435b = numberOfFrames;
            int[] iArr = this.f6434a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f6434a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f6434a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f6436c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f6436c) + 0.5f);
            int i2 = this.f6435b;
            int[] iArr = this.f6434a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f6436c : 0.0f);
        }
    }

    /* renamed from: com.daaw.d3$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1045g {
        public AbstractC1045g() {
        }

        /* renamed from: a */
        public boolean mo24736a() {
            return false;
        }

        /* renamed from: b */
        public void mo24735b() {
        }

        /* renamed from: c */
        public abstract void mo24734c();

        /* renamed from: d */
        public abstract void mo24733d();
    }

    public C1038d3() {
        this(null, null);
    }

    public C1038d3(C1041c c1041c, Resources resources) {
        super(null);
        this.f6425F = -1;
        this.f6426G = -1;
        mo13964h(new C1041c(c1041c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C1038d3 m24754m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1038d3 c1038d3 = new C1038d3();
            c1038d3.m24753n(context, resources, xmlPullParser, attributeSet, theme);
            return c1038d3;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // com.daaw.lf1, com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.daaw.lf1, com.daaw.C2477ou
    /* renamed from: h */
    public void mo13964h(C2477ou.AbstractC2481d abstractC2481d) {
        super.mo13964h(abstractC2481d);
        if (abstractC2481d instanceof C1041c) {
            this.f6423D = (C1041c) abstractC2481d;
        }
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // com.daaw.lf1, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC1045g abstractC1045g = this.f6424E;
        if (abstractC1045g != null) {
            abstractC1045g.mo24733d();
            this.f6424E = null;
            m13965g(this.f6425F);
            this.f6425F = -1;
            this.f6426G = -1;
        }
    }

    @Override // com.daaw.lf1
    /* renamed from: l */
    public C1041c mo16971j() {
        return new C1041c(this.f6423D, this, null);
    }

    @Override // com.daaw.lf1, com.daaw.C2477ou, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6427H && super.mutate() == this) {
            this.f6423D.mo13940r();
            this.f6427H = true;
        }
        return this;
    }

    /* renamed from: n */
    public void m24753n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, o21.f20947a);
        setVisible(m10117k.getBoolean(o21.f20949c, true), true);
        m24747t(m10117k);
        m13963i(resources);
        m10117k.recycle();
        m24752o(context, resources, xmlPullParser, attributeSet, theme);
        m24751p();
    }

    /* renamed from: o */
    public final void m24752o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                    m24750q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m24749r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // com.daaw.lf1, com.daaw.C2477ou, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m24742F = this.f6423D.m24742F(iArr);
        boolean z = m24742F != m13969c() && (m24748s(m24742F) || m13965g(m24742F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    /* renamed from: p */
    public final void m24751p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    public final int m24750q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, o21.f20954h);
        int resourceId = m10117k.getResourceId(o21.f20955i, 0);
        int resourceId2 = m10117k.getResourceId(o21.f20956j, -1);
        Drawable m21934j = resourceId2 > 0 ? g51.m21936h().m21934j(context, resourceId2) : null;
        m10117k.recycle();
        int[] m16970k = m16970k(attributeSet);
        if (m21934j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            m21934j = xmlPullParser.getName().equals("vector") ? gs1.m21292c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? C1947kh.m17752a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (m21934j != null) {
            return this.f6423D.m24746B(m16970k, m21934j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    public final int m24749r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, o21.f20957k);
        int resourceId = m10117k.getResourceId(o21.f20960n, -1);
        int resourceId2 = m10117k.getResourceId(o21.f20959m, -1);
        int resourceId3 = m10117k.getResourceId(o21.f20958l, -1);
        Drawable m21934j = resourceId3 > 0 ? g51.m21936h().m21934j(context, resourceId3) : null;
        boolean z = m10117k.getBoolean(o21.f20961o, false);
        m10117k.recycle();
        if (m21934j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            m21934j = xmlPullParser.getName().equals("animated-vector") ? C1156e3.m23784a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? C1947kh.m17752a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (m21934j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId == -1 || resourceId2 == -1) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        } else {
            return this.f6423D.m24745C(resourceId, resourceId2, m21934j, z);
        }
    }

    /* renamed from: s */
    public final boolean m24748s(int i) {
        int m13969c;
        int m24741G;
        AbstractC1045g c1040b;
        AbstractC1045g abstractC1045g = this.f6424E;
        if (abstractC1045g == null) {
            m13969c = m13969c();
        } else if (i == this.f6425F) {
            return true;
        } else {
            if (i == this.f6426G && abstractC1045g.mo24736a()) {
                abstractC1045g.mo24735b();
                this.f6425F = this.f6426G;
                this.f6426G = i;
                return true;
            }
            m13969c = this.f6425F;
            abstractC1045g.mo24733d();
        }
        this.f6424E = null;
        this.f6426G = -1;
        this.f6425F = -1;
        C1041c c1041c = this.f6423D;
        int m24743E = c1041c.m24743E(m13969c);
        int m24743E2 = c1041c.m24743E(i);
        if (m24743E2 == 0 || m24743E == 0 || (m24741G = c1041c.m24741G(m24743E, m24743E2)) < 0) {
            return false;
        }
        boolean m24739I = c1041c.m24739I(m24743E, m24743E2);
        m13965g(m24741G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c1040b = new C1043e((AnimationDrawable) current, c1041c.m24740H(m24743E, m24743E2), m24739I);
        } else if (!(current instanceof C1156e3)) {
            if (current instanceof Animatable) {
                c1040b = new C1040b((Animatable) current);
            }
            return false;
        } else {
            c1040b = new C1042d((C1156e3) current);
        }
        c1040b.mo24734c();
        this.f6424E = c1040b;
        this.f6426G = m13969c;
        this.f6425F = i;
        return true;
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable, com.daaw.ql1
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable, com.daaw.ql1
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC1045g abstractC1045g = this.f6424E;
        if (abstractC1045g != null && (visible || z2)) {
            if (z) {
                abstractC1045g.mo24734c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* renamed from: t */
    public final void m24747t(TypedArray typedArray) {
        C1041c c1041c = this.f6423D;
        if (Build.VERSION.SDK_INT >= 21) {
            c1041c.f21996d |= C1947kh.m17751b(typedArray);
        }
        c1041c.m13934x(typedArray.getBoolean(o21.f20950d, c1041c.f22001i));
        c1041c.m13938t(typedArray.getBoolean(o21.f20951e, c1041c.f22004l));
        c1041c.m13937u(typedArray.getInt(o21.f20952f, c1041c.f21984A));
        c1041c.m13936v(typedArray.getInt(o21.f20953g, c1041c.f21985B));
        setDither(typedArray.getBoolean(o21.f20948b, c1041c.f22016x));
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
