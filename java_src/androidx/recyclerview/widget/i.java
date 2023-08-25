package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class i {
    public final RecyclerView.o a;
    public int b;
    public final Rect c;

    /* loaded from: classes.dex */
    public static class a extends i {
        public a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.a.o0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.a.o0() - this.a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.a.o0() - this.a.e0()) - this.a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.a.n0(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.a.n0(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i) {
            this.a.C0(i);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends i {
        public b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.a.W();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.a.W() - this.a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.a.g0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.a.W() - this.a.g0()) - this.a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.a.n0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.a.n0(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i) {
            this.a.D0(i);
        }
    }

    public i(RecyclerView.o oVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = oVar;
    }

    public /* synthetic */ i(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static i a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static i b(RecyclerView.o oVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return c(oVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(oVar);
    }

    public static i c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.b = n();
    }
}
