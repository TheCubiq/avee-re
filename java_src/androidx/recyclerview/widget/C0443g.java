package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C0443g extends RecyclerView.AbstractC0406y {

    /* renamed from: k */
    public PointF f2242k;

    /* renamed from: l */
    public final DisplayMetrics f2243l;

    /* renamed from: n */
    public float f2245n;

    /* renamed from: i */
    public final LinearInterpolator f2240i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f2241j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f2244m = false;

    /* renamed from: o */
    public int f2246o = 0;

    /* renamed from: p */
    public int f2247p = 0;

    public C0443g(Context context) {
        this.f2243l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    public final float m28219A() {
        if (!this.f2244m) {
            this.f2245n = mo2468v(this.f2243l);
            this.f2244m = true;
        }
        return this.f2245n;
    }

    /* renamed from: B */
    public int m28218B() {
        PointF pointF = this.f2242k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    public void m28217C(RecyclerView.AbstractC0406y.C0407a c0407a) {
        PointF m28515a = m28515a(m28510f());
        if (m28515a == null || (m28515a.x == 0.0f && m28515a.y == 0.0f)) {
            c0407a.m28500b(m28510f());
            m28502r();
            return;
        }
        m28507i(m28515a);
        this.f2242k = m28515a;
        this.f2246o = (int) (m28515a.x * 10000.0f);
        this.f2247p = (int) (m28515a.y * 10000.0f);
        c0407a.m28498d((int) (this.f2246o * 1.2f), (int) (this.f2247p * 1.2f), (int) (mo28172x(10000) * 1.2f), this.f2240i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0406y
    /* renamed from: l */
    public void mo28216l(int i, int i2, RecyclerView.C0409z c0409z, RecyclerView.AbstractC0406y.C0407a c0407a) {
        if (m28513c() == 0) {
            m28502r();
            return;
        }
        this.f2246o = m28209y(this.f2246o, i);
        int m28209y = m28209y(this.f2247p, i2);
        this.f2247p = m28209y;
        if (this.f2246o == 0 && m28209y == 0) {
            m28217C(c0407a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0406y
    /* renamed from: m */
    public void mo28215m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0406y
    /* renamed from: n */
    public void mo28214n() {
        this.f2247p = 0;
        this.f2246o = 0;
        this.f2242k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0406y
    /* renamed from: o */
    public void mo28173o(View view, RecyclerView.C0409z c0409z, RecyclerView.AbstractC0406y.C0407a c0407a) {
        int m28212t = m28212t(view, m28208z());
        int m28211u = m28211u(view, m28218B());
        int m28210w = m28210w((int) Math.sqrt((m28212t * m28212t) + (m28211u * m28211u)));
        if (m28210w > 0) {
            c0407a.m28498d(-m28212t, -m28211u, m28210w, this.f2241j);
        }
    }

    /* renamed from: s */
    public int m28213s(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    /* renamed from: t */
    public int m28212t(View view, int i) {
        RecyclerView.AbstractC0391o m28511e = m28511e();
        if (m28511e == null || !m28511e.mo28423k()) {
            return 0;
        }
        RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
        return m28213s(m28511e.m28646Q(view) - ((ViewGroup.MarginLayoutParams) c0396p).leftMargin, m28511e.m28642T(view) + ((ViewGroup.MarginLayoutParams) c0396p).rightMargin, m28511e.m28623e0(), m28511e.m28600o0() - m28511e.m28621f0(), i);
    }

    /* renamed from: u */
    public int m28211u(View view, int i) {
        RecyclerView.AbstractC0391o m28511e = m28511e();
        if (m28511e == null || !m28511e.mo28420l()) {
            return 0;
        }
        RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
        return m28213s(m28511e.m28641U(view) - ((ViewGroup.MarginLayoutParams) c0396p).topMargin, m28511e.m28649O(view) + ((ViewGroup.MarginLayoutParams) c0396p).bottomMargin, m28511e.m28619g0(), m28511e.m28638W() - m28511e.m28625d0(), i);
    }

    /* renamed from: v */
    public float mo2468v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: w */
    public int m28210w(int i) {
        double mo28172x = mo28172x(i);
        Double.isNaN(mo28172x);
        return (int) Math.ceil(mo28172x / 0.3356d);
    }

    /* renamed from: x */
    public int mo28172x(int i) {
        return (int) Math.ceil(Math.abs(i) * m28219A());
    }

    /* renamed from: y */
    public final int m28209y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: z */
    public int m28208z() {
        PointF pointF = this.f2242k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
