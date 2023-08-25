package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public class C0449j extends AbstractC0455n {

    /* renamed from: d */
    public AbstractC0446i f2252d;

    /* renamed from: e */
    public AbstractC0446i f2253e;

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    public class C0450a extends C0443g {
        public C0450a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0443g, androidx.recyclerview.widget.RecyclerView.AbstractC0406y
        /* renamed from: o */
        public void mo28173o(View view, RecyclerView.C0409z c0409z, RecyclerView.AbstractC0406y.C0407a c0407a) {
            C0449j c0449j = C0449j.this;
            int[] mo28137c = c0449j.mo28137c(c0449j.f2260a.getLayoutManager(), view);
            int i = mo28137c[0];
            int i2 = mo28137c[1];
            int m28210w = m28210w(Math.max(Math.abs(i), Math.abs(i2)));
            if (m28210w > 0) {
                c0407a.m28498d(i, i2, m28210w, this.f2241j);
            }
        }

        @Override // androidx.recyclerview.widget.C0443g
        /* renamed from: v */
        public float mo2468v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0443g
        /* renamed from: x */
        public int mo28172x(int i) {
            return Math.min(100, super.mo28172x(i));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0455n
    /* renamed from: c */
    public int[] mo28137c(RecyclerView.AbstractC0391o abstractC0391o, View view) {
        int[] iArr = new int[2];
        if (abstractC0391o.mo28423k()) {
            iArr[0] = m28180l(abstractC0391o, view, m28178n(abstractC0391o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0391o.mo28420l()) {
            iArr[1] = m28180l(abstractC0391o, view, m28176p(abstractC0391o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0455n
    /* renamed from: e */
    public C0443g mo28135e(RecyclerView.AbstractC0391o abstractC0391o) {
        if (abstractC0391o instanceof RecyclerView.AbstractC0406y.InterfaceC0408b) {
            return new C0450a(this.f2260a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0455n
    /* renamed from: g */
    public View mo28133g(RecyclerView.AbstractC0391o abstractC0391o) {
        AbstractC0446i m28178n;
        if (abstractC0391o.mo28420l()) {
            m28178n = m28176p(abstractC0391o);
        } else if (!abstractC0391o.mo28423k()) {
            return null;
        } else {
            m28178n = m28178n(abstractC0391o);
        }
        return m28179m(abstractC0391o, m28178n);
    }

    @Override // androidx.recyclerview.widget.AbstractC0455n
    /* renamed from: h */
    public int mo28132h(RecyclerView.AbstractC0391o abstractC0391o, int i, int i2) {
        AbstractC0446i m28177o;
        int m28636Y = abstractC0391o.m28636Y();
        if (m28636Y == 0 || (m28177o = m28177o(abstractC0391o)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int m28658J = abstractC0391o.m28658J();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < m28658J; i5++) {
            View m28659I = abstractC0391o.m28659I(i5);
            if (m28659I != null) {
                int m28180l = m28180l(abstractC0391o, m28659I, m28177o);
                if (m28180l <= 0 && m28180l > i3) {
                    view2 = m28659I;
                    i3 = m28180l;
                }
                if (m28180l >= 0 && m28180l < i4) {
                    view = m28659I;
                    i4 = m28180l;
                }
            }
        }
        boolean m28175q = m28175q(abstractC0391o, i, i2);
        if (!m28175q || view == null) {
            if (m28175q || view2 == null) {
                if (m28175q) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int m28616h0 = abstractC0391o.m28616h0(view) + (m28174r(abstractC0391o) == m28175q ? -1 : 1);
                if (m28616h0 < 0 || m28616h0 >= m28636Y) {
                    return -1;
                }
                return m28616h0;
            }
            return abstractC0391o.m28616h0(view2);
        }
        return abstractC0391o.m28616h0(view);
    }

    /* renamed from: l */
    public final int m28180l(RecyclerView.AbstractC0391o abstractC0391o, View view, AbstractC0446i abstractC0446i) {
        return (abstractC0446i.mo28191g(view) + (abstractC0446i.mo28193e(view) / 2)) - (abstractC0446i.mo28185m() + (abstractC0446i.mo28184n() / 2));
    }

    /* renamed from: m */
    public final View m28179m(RecyclerView.AbstractC0391o abstractC0391o, AbstractC0446i abstractC0446i) {
        int m28658J = abstractC0391o.m28658J();
        View view = null;
        if (m28658J == 0) {
            return null;
        }
        int mo28185m = abstractC0446i.mo28185m() + (abstractC0446i.mo28184n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < m28658J; i2++) {
            View m28659I = abstractC0391o.m28659I(i2);
            int abs = Math.abs((abstractC0446i.mo28191g(m28659I) + (abstractC0446i.mo28193e(m28659I) / 2)) - mo28185m);
            if (abs < i) {
                view = m28659I;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: n */
    public final AbstractC0446i m28178n(RecyclerView.AbstractC0391o abstractC0391o) {
        AbstractC0446i abstractC0446i = this.f2253e;
        if (abstractC0446i == null || abstractC0446i.f2249a != abstractC0391o) {
            this.f2253e = AbstractC0446i.m28199a(abstractC0391o);
        }
        return this.f2253e;
    }

    /* renamed from: o */
    public final AbstractC0446i m28177o(RecyclerView.AbstractC0391o abstractC0391o) {
        if (abstractC0391o.mo28420l()) {
            return m28176p(abstractC0391o);
        }
        if (abstractC0391o.mo28423k()) {
            return m28178n(abstractC0391o);
        }
        return null;
    }

    /* renamed from: p */
    public final AbstractC0446i m28176p(RecyclerView.AbstractC0391o abstractC0391o) {
        AbstractC0446i abstractC0446i = this.f2252d;
        if (abstractC0446i == null || abstractC0446i.f2249a != abstractC0391o) {
            this.f2252d = AbstractC0446i.m28197c(abstractC0391o);
        }
        return this.f2252d;
    }

    /* renamed from: q */
    public final boolean m28175q(RecyclerView.AbstractC0391o abstractC0391o, int i, int i2) {
        return abstractC0391o.mo28423k() ? i > 0 : i2 > 0;
    }

    /* renamed from: r */
    public final boolean m28174r(RecyclerView.AbstractC0391o abstractC0391o) {
        PointF mo28438a;
        int m28636Y = abstractC0391o.m28636Y();
        if (!(abstractC0391o instanceof RecyclerView.AbstractC0406y.InterfaceC0408b) || (mo28438a = ((RecyclerView.AbstractC0406y.InterfaceC0408b) abstractC0391o).mo28438a(m28636Y - 1)) == null) {
            return false;
        }
        return mo28438a.x < 0.0f || mo28438a.y < 0.0f;
    }
}
