package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class j extends n {
    public i d;
    public i e;

    /* loaded from: classes.dex */
    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.y
        public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            j jVar = j.this;
            int[] c = jVar.c(jVar.a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.d(i, i2, w, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        public int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.k()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.l()) {
            iArr[1] = l(oVar, view, p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    public g e(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View g(RecyclerView.o oVar) {
        i n;
        if (oVar.l()) {
            n = p(oVar);
        } else if (!oVar.k()) {
            return null;
        } else {
            n = n(oVar);
        }
        return m(oVar, n);
    }

    @Override // androidx.recyclerview.widget.n
    public int h(RecyclerView.o oVar, int i, int i2) {
        i o;
        int Y = oVar.Y();
        if (Y == 0 || (o = o(oVar)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int J = oVar.J();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < J; i5++) {
            View I = oVar.I(i5);
            if (I != null) {
                int l = l(oVar, I, o);
                if (l <= 0 && l > i3) {
                    view2 = I;
                    i3 = l;
                }
                if (l >= 0 && l < i4) {
                    view = I;
                    i4 = l;
                }
            }
        }
        boolean q = q(oVar, i, i2);
        if (!q || view == null) {
            if (q || view2 == null) {
                if (q) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int h0 = oVar.h0(view) + (r(oVar) == q ? -1 : 1);
                if (h0 < 0 || h0 >= Y) {
                    return -1;
                }
                return h0;
            }
            return oVar.h0(view2);
        }
        return oVar.h0(view);
    }

    public final int l(RecyclerView.o oVar, View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    public final View m(RecyclerView.o oVar, i iVar) {
        int J = oVar.J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m = iVar.m() + (iVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < J; i2++) {
            View I = oVar.I(i2);
            int abs = Math.abs((iVar.g(I) + (iVar.e(I) / 2)) - m);
            if (abs < i) {
                view = I;
                i = abs;
            }
        }
        return view;
    }

    public final i n(RecyclerView.o oVar) {
        i iVar = this.e;
        if (iVar == null || iVar.a != oVar) {
            this.e = i.a(oVar);
        }
        return this.e;
    }

    public final i o(RecyclerView.o oVar) {
        if (oVar.l()) {
            return p(oVar);
        }
        if (oVar.k()) {
            return n(oVar);
        }
        return null;
    }

    public final i p(RecyclerView.o oVar) {
        i iVar = this.d;
        if (iVar == null || iVar.a != oVar) {
            this.d = i.c(oVar);
        }
        return this.d;
    }

    public final boolean q(RecyclerView.o oVar, int i, int i2) {
        return oVar.k() ? i > 0 : i2 > 0;
    }

    public final boolean r(RecyclerView.o oVar) {
        PointF a2;
        int Y = oVar.Y();
        if (!(oVar instanceof RecyclerView.y.b) || (a2 = ((RecyclerView.y.b) oVar).a(Y - 1)) == null) {
            return false;
        }
        return a2.x < 0.0f || a2.y < 0.0f;
    }
}
