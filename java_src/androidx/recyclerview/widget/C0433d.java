package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.xs1;
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C0433d extends RecyclerView.AbstractC0390n implements RecyclerView.InterfaceC0399s {

    /* renamed from: D */
    public static final int[] f2180D = {16842919};

    /* renamed from: E */
    public static final int[] f2181E = new int[0];

    /* renamed from: A */
    public int f2182A;

    /* renamed from: B */
    public final Runnable f2183B;

    /* renamed from: C */
    public final RecyclerView.AbstractC0400t f2184C;

    /* renamed from: a */
    public final int f2185a;

    /* renamed from: b */
    public final int f2186b;

    /* renamed from: c */
    public final StateListDrawable f2187c;

    /* renamed from: d */
    public final Drawable f2188d;

    /* renamed from: e */
    public final int f2189e;

    /* renamed from: f */
    public final int f2190f;

    /* renamed from: g */
    public final StateListDrawable f2191g;

    /* renamed from: h */
    public final Drawable f2192h;

    /* renamed from: i */
    public final int f2193i;

    /* renamed from: j */
    public final int f2194j;

    /* renamed from: k */
    public int f2195k;

    /* renamed from: l */
    public int f2196l;

    /* renamed from: m */
    public float f2197m;

    /* renamed from: n */
    public int f2198n;

    /* renamed from: o */
    public int f2199o;

    /* renamed from: p */
    public float f2200p;

    /* renamed from: s */
    public RecyclerView f2203s;

    /* renamed from: z */
    public final ValueAnimator f2210z;

    /* renamed from: q */
    public int f2201q = 0;

    /* renamed from: r */
    public int f2202r = 0;

    /* renamed from: t */
    public boolean f2204t = false;

    /* renamed from: u */
    public boolean f2205u = false;

    /* renamed from: v */
    public int f2206v = 0;

    /* renamed from: w */
    public int f2207w = 0;

    /* renamed from: x */
    public final int[] f2208x = new int[2];

    /* renamed from: y */
    public final int[] f2209y = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    public class RunnableC0434a implements Runnable {
        public RunnableC0434a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0433d.this.m28248q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    public class C0435b extends RecyclerView.AbstractC0400t {
        public C0435b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0400t
        /* renamed from: b */
        public void mo551b(RecyclerView recyclerView, int i, int i2) {
            C0433d.this.m28257B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    public class C0436c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2213a = false;

        public C0436c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2213a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2213a) {
                this.f2213a = false;
            } else if (((Float) C0433d.this.f2210z.getAnimatedValue()).floatValue() == 0.0f) {
                C0433d c0433d = C0433d.this;
                c0433d.f2182A = 0;
                c0433d.m28240y(0);
            } else {
                C0433d c0433d2 = C0433d.this;
                c0433d2.f2182A = 2;
                c0433d2.m28243v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    public class C0437d implements ValueAnimator.AnimatorUpdateListener {
        public C0437d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0433d.this.f2187c.setAlpha(floatValue);
            C0433d.this.f2188d.setAlpha(floatValue);
            C0433d.this.m28243v();
        }
    }

    public C0433d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2210z = ofFloat;
        this.f2182A = 0;
        this.f2183B = new RunnableC0434a();
        this.f2184C = new C0435b();
        this.f2187c = stateListDrawable;
        this.f2188d = drawable;
        this.f2191g = stateListDrawable2;
        this.f2192h = drawable2;
        this.f2189e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2190f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2193i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2194j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2185a = i2;
        this.f2186b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0436c());
        ofFloat.addUpdateListener(new C0437d());
        m28255j(recyclerView);
    }

    /* renamed from: A */
    public void m28258A() {
        int i = this.f2182A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.f2210z.cancel();
        }
        this.f2182A = 1;
        ValueAnimator valueAnimator = this.f2210z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f2210z.setDuration(500L);
        this.f2210z.setStartDelay(0L);
        this.f2210z.start();
    }

    /* renamed from: B */
    public void m28257B(int i, int i2) {
        int computeVerticalScrollRange = this.f2203s.computeVerticalScrollRange();
        int i3 = this.f2202r;
        this.f2204t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f2185a;
        int computeHorizontalScrollRange = this.f2203s.computeHorizontalScrollRange();
        int i4 = this.f2201q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f2185a;
        this.f2205u = z;
        boolean z2 = this.f2204t;
        if (!z2 && !z) {
            if (this.f2206v != 0) {
                m28240y(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f2196l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f2195k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f2205u) {
            float f2 = i4;
            this.f2199o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f2198n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f2206v;
        if (i5 == 0 || i5 == 1) {
            m28240y(1);
        }
    }

    /* renamed from: C */
    public final void m28256C(float f) {
        int[] m28249p = m28249p();
        float max = Math.max(m28249p[0], Math.min(m28249p[1], f));
        if (Math.abs(this.f2196l - max) < 2.0f) {
            return;
        }
        int m28241x = m28241x(this.f2197m, max, m28249p, this.f2203s.computeVerticalScrollRange(), this.f2203s.computeVerticalScrollOffset(), this.f2202r);
        if (m28241x != 0) {
            this.f2203s.scrollBy(0, m28241x);
        }
        this.f2197m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0399s
    /* renamed from: a */
    public void mo16524a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2206v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m28244u = m28244u(motionEvent.getX(), motionEvent.getY());
            boolean m28245t = m28245t(motionEvent.getX(), motionEvent.getY());
            if (m28244u || m28245t) {
                if (m28245t) {
                    this.f2207w = 1;
                    this.f2200p = (int) motionEvent.getX();
                } else if (m28244u) {
                    this.f2207w = 2;
                    this.f2197m = (int) motionEvent.getY();
                }
                m28240y(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f2206v == 2) {
            this.f2197m = 0.0f;
            this.f2200p = 0.0f;
            m28240y(1);
            this.f2207w = 0;
        } else if (motionEvent.getAction() == 2 && this.f2206v == 2) {
            m28258A();
            if (this.f2207w == 1) {
                m28247r(motionEvent.getX());
            }
            if (this.f2207w == 2) {
                m28256C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0399s
    /* renamed from: b */
    public boolean mo16523b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2206v;
        if (i == 1) {
            boolean m28244u = m28244u(motionEvent.getX(), motionEvent.getY());
            boolean m28245t = m28245t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m28244u && !m28245t) {
                return false;
            }
            if (m28245t) {
                this.f2207w = 1;
                this.f2200p = (int) motionEvent.getX();
            } else if (m28244u) {
                this.f2207w = 2;
                this.f2197m = (int) motionEvent.getY();
            }
            m28240y(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0399s
    /* renamed from: c */
    public void mo16522c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0390n
    /* renamed from: i */
    public void mo16520i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0409z c0409z) {
        if (this.f2201q != this.f2203s.getWidth() || this.f2202r != this.f2203s.getHeight()) {
            this.f2201q = this.f2203s.getWidth();
            this.f2202r = this.f2203s.getHeight();
            m28240y(0);
        } else if (this.f2182A != 0) {
            if (this.f2204t) {
                m28251n(canvas);
            }
            if (this.f2205u) {
                m28252m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void m28255j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2203s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m28253l();
        }
        this.f2203s = recyclerView;
        if (recyclerView != null) {
            m28239z();
        }
    }

    /* renamed from: k */
    public final void m28254k() {
        this.f2203s.removeCallbacks(this.f2183B);
    }

    /* renamed from: l */
    public final void m28253l() {
        this.f2203s.m28847Y0(this);
        this.f2203s.m28845Z0(this);
        this.f2203s.m28842a1(this.f2184C);
        m28254k();
    }

    /* renamed from: m */
    public final void m28252m(Canvas canvas) {
        int i = this.f2202r;
        int i2 = this.f2193i;
        int i3 = i - i2;
        int i4 = this.f2199o;
        int i5 = this.f2198n;
        int i6 = i4 - (i5 / 2);
        this.f2191g.setBounds(0, 0, i5, i2);
        this.f2192h.setBounds(0, 0, this.f2201q, this.f2194j);
        canvas.translate(0.0f, i3);
        this.f2192h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f2191g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: n */
    public final void m28251n(Canvas canvas) {
        int i = this.f2201q;
        int i2 = this.f2189e;
        int i3 = i - i2;
        int i4 = this.f2196l;
        int i5 = this.f2195k;
        int i6 = i4 - (i5 / 2);
        this.f2187c.setBounds(0, 0, i2, i5);
        this.f2188d.setBounds(0, 0, this.f2190f, this.f2202r);
        if (m28246s()) {
            this.f2188d.draw(canvas);
            canvas.translate(this.f2189e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f2187c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f2189e;
        } else {
            canvas.translate(i3, 0.0f);
            this.f2188d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f2187c.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    /* renamed from: o */
    public final int[] m28250o() {
        int[] iArr = this.f2209y;
        int i = this.f2186b;
        iArr[0] = i;
        iArr[1] = this.f2201q - i;
        return iArr;
    }

    /* renamed from: p */
    public final int[] m28249p() {
        int[] iArr = this.f2208x;
        int i = this.f2186b;
        iArr[0] = i;
        iArr[1] = this.f2202r - i;
        return iArr;
    }

    /* renamed from: q */
    public void m28248q(int i) {
        int i2 = this.f2182A;
        if (i2 == 1) {
            this.f2210z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f2182A = 3;
        ValueAnimator valueAnimator = this.f2210z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f2210z.setDuration(i);
        this.f2210z.start();
    }

    /* renamed from: r */
    public final void m28247r(float f) {
        int[] m28250o = m28250o();
        float max = Math.max(m28250o[0], Math.min(m28250o[1], f));
        if (Math.abs(this.f2199o - max) < 2.0f) {
            return;
        }
        int m28241x = m28241x(this.f2200p, max, m28250o, this.f2203s.computeHorizontalScrollRange(), this.f2203s.computeHorizontalScrollOffset(), this.f2201q);
        if (m28241x != 0) {
            this.f2203s.scrollBy(m28241x, 0);
        }
        this.f2200p = max;
    }

    /* renamed from: s */
    public final boolean m28246s() {
        return xs1.m4768E(this.f2203s) == 1;
    }

    /* renamed from: t */
    public boolean m28245t(float f, float f2) {
        if (f2 >= this.f2202r - this.f2193i) {
            int i = this.f2199o;
            int i2 = this.f2198n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public boolean m28244u(float f, float f2) {
        if (!m28246s() ? f >= this.f2201q - this.f2189e : f <= this.f2189e / 2) {
            int i = this.f2196l;
            int i2 = this.f2195k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public void m28243v() {
        this.f2203s.invalidate();
    }

    /* renamed from: w */
    public final void m28242w(int i) {
        m28254k();
        this.f2203s.postDelayed(this.f2183B, i);
    }

    /* renamed from: x */
    public final int m28241x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: y */
    public void m28240y(int i) {
        int i2;
        if (i == 2 && this.f2206v != 2) {
            this.f2187c.setState(f2180D);
            m28254k();
        }
        if (i == 0) {
            m28243v();
        } else {
            m28258A();
        }
        if (this.f2206v != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1500;
            this.f2206v = i;
        }
        this.f2187c.setState(f2181E);
        i2 = 1200;
        m28242w(i2);
        this.f2206v = i;
    }

    /* renamed from: z */
    public final void m28239z() {
        this.f2203s.m28824h(this);
        this.f2203s.m28818j(this);
        this.f2203s.m28815k(this.f2184C);
    }
}
