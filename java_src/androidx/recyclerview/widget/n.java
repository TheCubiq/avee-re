package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class n extends RecyclerView.r {
    public RecyclerView a;
    public Scroller b;
    public final RecyclerView.t c = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.t {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                n.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && j(layoutManager, i, i2);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            i();
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public RecyclerView.y d(RecyclerView.o oVar) {
        return e(oVar);
    }

    @Deprecated
    public abstract g e(RecyclerView.o oVar);

    public final void f() {
        this.a.a1(this.c);
        this.a.setOnFlingListener(null);
    }

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i, int i2);

    public final void i() {
        if (this.a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.a.k(this.c);
        this.a.setOnFlingListener(this);
    }

    public final boolean j(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.y d;
        int h;
        if (!(oVar instanceof RecyclerView.y.b) || (d = d(oVar)) == null || (h = h(oVar, i, i2)) == -1) {
            return false;
        }
        d.p(h);
        oVar.J1(d);
        return true;
    }

    public void k() {
        RecyclerView.o layoutManager;
        View g;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (g = g(layoutManager)) == null) {
            return;
        }
        int[] c = c(layoutManager, g);
        if (c[0] == 0 && c[1] == 0) {
            return;
        }
        this.a.n1(c[0], c[1]);
    }
}
