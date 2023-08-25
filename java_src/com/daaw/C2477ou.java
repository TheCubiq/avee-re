package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
/* renamed from: com.daaw.ou */
/* loaded from: classes.dex */
public class C2477ou extends Drawable implements Drawable.Callback {

    /* renamed from: A */
    public C2480c f21970A;

    /* renamed from: p */
    public AbstractC2481d f21971p;

    /* renamed from: q */
    public Rect f21972q;

    /* renamed from: r */
    public Drawable f21973r;

    /* renamed from: s */
    public Drawable f21974s;

    /* renamed from: u */
    public boolean f21976u;

    /* renamed from: w */
    public boolean f21978w;

    /* renamed from: x */
    public Runnable f21979x;

    /* renamed from: y */
    public long f21980y;

    /* renamed from: z */
    public long f21981z;

    /* renamed from: t */
    public int f21975t = 255;

    /* renamed from: v */
    public int f21977v = -1;

    /* renamed from: com.daaw.ou$a */
    /* loaded from: classes.dex */
    public class RunnableC2478a implements Runnable {
        public RunnableC2478a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2477ou.this.m13971a(true);
            C2477ou.this.invalidateSelf();
        }
    }

    /* renamed from: com.daaw.ou$b */
    /* loaded from: classes.dex */
    public static class C2479b {
        /* renamed from: a */
        public static boolean m13962a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m13961b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m13960c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: com.daaw.ou$c */
    /* loaded from: classes.dex */
    public static class C2480c implements Drawable.Callback {

        /* renamed from: p */
        public Drawable.Callback f21983p;

        /* renamed from: a */
        public Drawable.Callback m13959a() {
            Drawable.Callback callback = this.f21983p;
            this.f21983p = null;
            return callback;
        }

        /* renamed from: b */
        public C2480c m13958b(Drawable.Callback callback) {
            this.f21983p = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f21983p;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f21983p;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: com.daaw.ou$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2481d extends Drawable.ConstantState {

        /* renamed from: A */
        public int f21984A;

        /* renamed from: B */
        public int f21985B;

        /* renamed from: C */
        public boolean f21986C;

        /* renamed from: D */
        public ColorFilter f21987D;

        /* renamed from: E */
        public boolean f21988E;

        /* renamed from: F */
        public ColorStateList f21989F;

        /* renamed from: G */
        public PorterDuff.Mode f21990G;

        /* renamed from: H */
        public boolean f21991H;

        /* renamed from: I */
        public boolean f21992I;

        /* renamed from: a */
        public final C2477ou f21993a;

        /* renamed from: b */
        public Resources f21994b;

        /* renamed from: c */
        public int f21995c;

        /* renamed from: d */
        public int f21996d;

        /* renamed from: e */
        public int f21997e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f21998f;

        /* renamed from: g */
        public Drawable[] f21999g;

        /* renamed from: h */
        public int f22000h;

        /* renamed from: i */
        public boolean f22001i;

        /* renamed from: j */
        public boolean f22002j;

        /* renamed from: k */
        public Rect f22003k;

        /* renamed from: l */
        public boolean f22004l;

        /* renamed from: m */
        public boolean f22005m;

        /* renamed from: n */
        public int f22006n;

        /* renamed from: o */
        public int f22007o;

        /* renamed from: p */
        public int f22008p;

        /* renamed from: q */
        public int f22009q;

        /* renamed from: r */
        public boolean f22010r;

        /* renamed from: s */
        public int f22011s;

        /* renamed from: t */
        public boolean f22012t;

        /* renamed from: u */
        public boolean f22013u;

        /* renamed from: v */
        public boolean f22014v;

        /* renamed from: w */
        public boolean f22015w;

        /* renamed from: x */
        public boolean f22016x;

        /* renamed from: y */
        public boolean f22017y;

        /* renamed from: z */
        public int f22018z;

        public AbstractC2481d(AbstractC2481d abstractC2481d, C2477ou c2477ou, Resources resources) {
            this.f22001i = false;
            this.f22004l = false;
            this.f22016x = true;
            this.f21984A = 0;
            this.f21985B = 0;
            this.f21993a = c2477ou;
            this.f21994b = resources != null ? resources : abstractC2481d != null ? abstractC2481d.f21994b : null;
            int m13966f = C2477ou.m13966f(resources, abstractC2481d != null ? abstractC2481d.f21995c : 0);
            this.f21995c = m13966f;
            if (abstractC2481d == null) {
                this.f21999g = new Drawable[10];
                this.f22000h = 0;
                return;
            }
            this.f21996d = abstractC2481d.f21996d;
            this.f21997e = abstractC2481d.f21997e;
            this.f22014v = true;
            this.f22015w = true;
            this.f22001i = abstractC2481d.f22001i;
            this.f22004l = abstractC2481d.f22004l;
            this.f22016x = abstractC2481d.f22016x;
            this.f22017y = abstractC2481d.f22017y;
            this.f22018z = abstractC2481d.f22018z;
            this.f21984A = abstractC2481d.f21984A;
            this.f21985B = abstractC2481d.f21985B;
            this.f21986C = abstractC2481d.f21986C;
            this.f21987D = abstractC2481d.f21987D;
            this.f21988E = abstractC2481d.f21988E;
            this.f21989F = abstractC2481d.f21989F;
            this.f21990G = abstractC2481d.f21990G;
            this.f21991H = abstractC2481d.f21991H;
            this.f21992I = abstractC2481d.f21992I;
            if (abstractC2481d.f21995c == m13966f) {
                if (abstractC2481d.f22002j) {
                    this.f22003k = abstractC2481d.f22003k != null ? new Rect(abstractC2481d.f22003k) : null;
                    this.f22002j = true;
                }
                if (abstractC2481d.f22005m) {
                    this.f22006n = abstractC2481d.f22006n;
                    this.f22007o = abstractC2481d.f22007o;
                    this.f22008p = abstractC2481d.f22008p;
                    this.f22009q = abstractC2481d.f22009q;
                    this.f22005m = true;
                }
            }
            if (abstractC2481d.f22010r) {
                this.f22011s = abstractC2481d.f22011s;
                this.f22010r = true;
            }
            if (abstractC2481d.f22012t) {
                this.f22013u = abstractC2481d.f22013u;
                this.f22012t = true;
            }
            Drawable[] drawableArr = abstractC2481d.f21999g;
            this.f21999g = new Drawable[drawableArr.length];
            this.f22000h = abstractC2481d.f22000h;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC2481d.f21998f;
            this.f21998f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f22000h);
            int i = this.f22000h;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                    if (constantState != null) {
                        this.f21998f.put(i2, constantState);
                    } else {
                        this.f21999g[i2] = drawableArr[i2];
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m13957a(Drawable drawable) {
            int i = this.f22000h;
            if (i >= this.f21999g.length) {
                mo13943o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f21993a);
            this.f21999g[i] = drawable;
            this.f22000h++;
            this.f21997e = drawable.getChangingConfigurations() | this.f21997e;
            m13942p();
            this.f22003k = null;
            this.f22002j = false;
            this.f22005m = false;
            this.f22014v = false;
            return i;
        }

        /* renamed from: b */
        public final void m13956b(Resources.Theme theme) {
            if (theme != null) {
                m13953e();
                int i = this.f22000h;
                Drawable[] drawableArr = this.f21999g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && C2366nu.m14825b(drawableArr[i2])) {
                        C2366nu.m14826a(drawableArr[i2], theme);
                        this.f21997e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m13933y(C2479b.m13960c(theme));
            }
        }

        /* renamed from: c */
        public boolean m13955c() {
            if (this.f22014v) {
                return this.f22015w;
            }
            m13953e();
            this.f22014v = true;
            int i = this.f22000h;
            Drawable[] drawableArr = this.f21999g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f22015w = false;
                    return false;
                }
            }
            this.f22015w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f22000h;
            Drawable[] drawableArr = this.f21999g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f21998f.get(i2);
                    if (constantState != null && C2479b.m13962a(constantState)) {
                        return true;
                    }
                } else if (C2366nu.m14825b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m13954d() {
            this.f22005m = true;
            m13953e();
            int i = this.f22000h;
            Drawable[] drawableArr = this.f21999g;
            this.f22007o = -1;
            this.f22006n = -1;
            this.f22009q = 0;
            this.f22008p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f22006n) {
                    this.f22006n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f22007o) {
                    this.f22007o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f22008p) {
                    this.f22008p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f22009q) {
                    this.f22009q = minimumHeight;
                }
            }
        }

        /* renamed from: e */
        public final void m13953e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f21998f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f21999g[this.f21998f.keyAt(i)] = m13939s(this.f21998f.valueAt(i).newDrawable(this.f21994b));
                }
                this.f21998f = null;
            }
        }

        /* renamed from: f */
        public final int m13952f() {
            return this.f21999g.length;
        }

        /* renamed from: g */
        public final Drawable m13951g(int i) {
            int indexOfKey;
            Drawable drawable = this.f21999g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f21998f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m13939s = m13939s(this.f21998f.valueAt(indexOfKey).newDrawable(this.f21994b));
            this.f21999g[i] = m13939s;
            this.f21998f.removeAt(indexOfKey);
            if (this.f21998f.size() == 0) {
                this.f21998f = null;
            }
            return m13939s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f21996d | this.f21997e;
        }

        /* renamed from: h */
        public final int m13950h() {
            return this.f22000h;
        }

        /* renamed from: i */
        public final int m13949i() {
            if (!this.f22005m) {
                m13954d();
            }
            return this.f22007o;
        }

        /* renamed from: j */
        public final int m13948j() {
            if (!this.f22005m) {
                m13954d();
            }
            return this.f22009q;
        }

        /* renamed from: k */
        public final int m13947k() {
            if (!this.f22005m) {
                m13954d();
            }
            return this.f22008p;
        }

        /* renamed from: l */
        public final Rect m13946l() {
            Rect rect = null;
            if (this.f22001i) {
                return null;
            }
            Rect rect2 = this.f22003k;
            if (rect2 != null || this.f22002j) {
                return rect2;
            }
            m13953e();
            Rect rect3 = new Rect();
            int i = this.f22000h;
            Drawable[] drawableArr = this.f21999g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f22002j = true;
            this.f22003k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m13945m() {
            if (!this.f22005m) {
                m13954d();
            }
            return this.f22006n;
        }

        /* renamed from: n */
        public final int m13944n() {
            if (this.f22010r) {
                return this.f22011s;
            }
            m13953e();
            int i = this.f22000h;
            Drawable[] drawableArr = this.f21999g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f22011s = opacity;
            this.f22010r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo13943o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f21999g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f21999g = drawableArr;
        }

        /* renamed from: p */
        public void m13942p() {
            this.f22010r = false;
            this.f22012t = false;
        }

        /* renamed from: q */
        public final boolean m13941q() {
            return this.f22004l;
        }

        /* renamed from: r */
        public abstract void mo13940r();

        /* renamed from: s */
        public final Drawable m13939s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C2366nu.m14814m(drawable, this.f22018z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f21993a);
            return mutate;
        }

        /* renamed from: t */
        public final void m13938t(boolean z) {
            this.f22004l = z;
        }

        /* renamed from: u */
        public final void m13937u(int i) {
            this.f21984A = i;
        }

        /* renamed from: v */
        public final void m13936v(int i) {
            this.f21985B = i;
        }

        /* renamed from: w */
        public final boolean m13935w(int i, int i2) {
            int i3 = this.f22000h;
            Drawable[] drawableArr = this.f21999g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m14814m = Build.VERSION.SDK_INT >= 23 ? C2366nu.m14814m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m14814m;
                    }
                }
            }
            this.f22018z = i;
            return z;
        }

        /* renamed from: x */
        public final void m13934x(boolean z) {
            this.f22001i = z;
        }

        /* renamed from: y */
        public final void m13933y(Resources resources) {
            if (resources != null) {
                this.f21994b = resources;
                int m13966f = C2477ou.m13966f(resources, this.f21995c);
                int i = this.f21995c;
                this.f21995c = m13966f;
                if (i != m13966f) {
                    this.f22005m = false;
                    this.f22002j = false;
                }
            }
        }
    }

    /* renamed from: f */
    public static int m13966f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m13971a(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.f21976u = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f21973r;
        if (drawable2 != null) {
            long j = this.f21980y;
            if (j != 0) {
                if (j <= uptimeMillis) {
                    drawable2.setAlpha(this.f21975t);
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.f21971p.f21984A)) * this.f21975t) / 255);
                    z2 = true;
                    drawable = this.f21974s;
                    if (drawable != null) {
                        long j2 = this.f21981z;
                        if (j2 != 0) {
                            if (j2 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / this.f21971p.f21985B) * this.f21975t) / 255);
                                if (z && z3) {
                                    scheduleSelf(this.f21979x, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.f21974s = null;
                        }
                        z3 = z2;
                        if (z) {
                            return;
                        }
                        return;
                    }
                    this.f21981z = 0L;
                    z3 = z2;
                    if (z) {
                    }
                }
            }
            z2 = false;
            drawable = this.f21974s;
            if (drawable != null) {
            }
            this.f21981z = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f21980y = 0L;
        z2 = false;
        drawable = this.f21974s;
        if (drawable != null) {
        }
        this.f21981z = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f21971p.m13956b(theme);
    }

    /* renamed from: b */
    public AbstractC2481d mo13970b() {
        throw null;
    }

    /* renamed from: c */
    public int m13969c() {
        return this.f21977v;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f21971p.canApplyTheme();
    }

    /* renamed from: d */
    public final void m13968d(Drawable drawable) {
        if (this.f21970A == null) {
            this.f21970A = new C2480c();
        }
        drawable.setCallback(this.f21970A.m13958b(drawable.getCallback()));
        try {
            if (this.f21971p.f21984A <= 0 && this.f21976u) {
                drawable.setAlpha(this.f21975t);
            }
            AbstractC2481d abstractC2481d = this.f21971p;
            if (abstractC2481d.f21988E) {
                drawable.setColorFilter(abstractC2481d.f21987D);
            } else {
                if (abstractC2481d.f21991H) {
                    C2366nu.m14812o(drawable, abstractC2481d.f21989F);
                }
                AbstractC2481d abstractC2481d2 = this.f21971p;
                if (abstractC2481d2.f21992I) {
                    C2366nu.m14811p(drawable, abstractC2481d2.f21990G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f21971p.f22016x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                C2366nu.m14814m(drawable, C2366nu.m14821f(this));
            }
            C2366nu.m14817j(drawable, this.f21971p.f21986C);
            Rect rect = this.f21972q;
            if (i >= 21 && rect != null) {
                C2366nu.m14815l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f21970A.m13959a());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f21974s;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean m13967e() {
        return isAutoMirrored() && C2366nu.m14821f(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m13965g(int i) {
        Runnable runnable;
        if (i == this.f21977v) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f21971p.f21985B > 0) {
            Drawable drawable = this.f21974s;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f21973r;
            if (drawable2 != null) {
                this.f21974s = drawable2;
                this.f21981z = this.f21971p.f21985B + uptimeMillis;
            } else {
                this.f21974s = null;
                this.f21981z = 0L;
            }
        } else {
            Drawable drawable3 = this.f21973r;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            AbstractC2481d abstractC2481d = this.f21971p;
            if (i < abstractC2481d.f22000h) {
                Drawable m13951g = abstractC2481d.m13951g(i);
                this.f21973r = m13951g;
                this.f21977v = i;
                if (m13951g != null) {
                    int i2 = this.f21971p.f21984A;
                    if (i2 > 0) {
                        this.f21980y = uptimeMillis + i2;
                    }
                    m13968d(m13951g);
                }
                if (this.f21980y == 0 || this.f21981z != 0) {
                    runnable = this.f21979x;
                    if (runnable != null) {
                        this.f21979x = new RunnableC2478a();
                    } else {
                        unscheduleSelf(runnable);
                    }
                    m13971a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f21973r = null;
        this.f21977v = -1;
        if (this.f21980y == 0) {
        }
        runnable = this.f21979x;
        if (runnable != null) {
        }
        m13971a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21975t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f21971p.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f21971p.m13955c()) {
            this.f21971p.f21996d = getChangingConfigurations();
            return this.f21971p;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f21973r;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f21972q;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f21971p.m13941q()) {
            return this.f21971p.m13949i();
        }
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f21971p.m13941q()) {
            return this.f21971p.m13945m();
        }
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f21971p.m13941q()) {
            return this.f21971p.m13948j();
        }
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f21971p.m13941q()) {
            return this.f21971p.m13947k();
        }
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f21973r;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f21971p.m13944n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            C2479b.m13961b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m13946l = this.f21971p.m13946l();
        if (m13946l != null) {
            rect.set(m13946l);
            padding = (m13946l.right | ((m13946l.left | m13946l.top) | m13946l.bottom)) != 0;
        } else {
            Drawable drawable = this.f21973r;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m13967e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* renamed from: h */
    public void mo13964h(AbstractC2481d abstractC2481d) {
        this.f21971p = abstractC2481d;
        int i = this.f21977v;
        if (i >= 0) {
            Drawable m13951g = abstractC2481d.m13951g(i);
            this.f21973r = m13951g;
            if (m13951g != null) {
                m13968d(m13951g);
            }
        }
        this.f21974s = null;
    }

    /* renamed from: i */
    public final void m13963i(Resources resources) {
        this.f21971p.m13933y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC2481d abstractC2481d = this.f21971p;
        if (abstractC2481d != null) {
            abstractC2481d.m13942p();
        }
        if (drawable != this.f21973r || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f21971p.f21986C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f21974s;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f21974s = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f21973r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f21976u) {
                this.f21973r.setAlpha(this.f21975t);
            }
        }
        if (this.f21981z != 0) {
            this.f21981z = 0L;
            z = true;
        }
        if (this.f21980y != 0) {
            this.f21980y = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f21978w && super.mutate() == this) {
            AbstractC2481d mo13970b = mo13970b();
            mo13970b.mo13940r();
            mo13964h(mo13970b);
            this.f21978w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21974s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f21973r;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f21971p.m13935w(i, m13969c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f21974s;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f21973r;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f21974s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f21973r;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f21973r || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f21976u && this.f21975t == i) {
            return;
        }
        this.f21976u = true;
        this.f21975t = i;
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            if (this.f21980y == 0) {
                drawable.setAlpha(i);
            } else {
                m13971a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC2481d abstractC2481d = this.f21971p;
        if (abstractC2481d.f21986C != z) {
            abstractC2481d.f21986C = z;
            Drawable drawable = this.f21973r;
            if (drawable != null) {
                C2366nu.m14817j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC2481d abstractC2481d = this.f21971p;
        abstractC2481d.f21988E = true;
        if (abstractC2481d.f21987D != colorFilter) {
            abstractC2481d.f21987D = colorFilter;
            Drawable drawable = this.f21973r;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC2481d abstractC2481d = this.f21971p;
        if (abstractC2481d.f22016x != z) {
            abstractC2481d.f22016x = z;
            Drawable drawable = this.f21973r;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            C2366nu.m14816k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f21972q;
        if (rect == null) {
            this.f21972q = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f21973r;
        if (drawable != null) {
            C2366nu.m14815l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        AbstractC2481d abstractC2481d = this.f21971p;
        abstractC2481d.f21991H = true;
        if (abstractC2481d.f21989F != colorStateList) {
            abstractC2481d.f21989F = colorStateList;
            C2366nu.m14812o(this.f21973r, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC2481d abstractC2481d = this.f21971p;
        abstractC2481d.f21992I = true;
        if (abstractC2481d.f21990G != mode) {
            abstractC2481d.f21990G = mode;
            C2366nu.m14811p(this.f21973r, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f21974s;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f21973r;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f21973r || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
