package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public abstract class AbstractC0446i {

    /* renamed from: a */
    public final RecyclerView.AbstractC0391o f2249a;

    /* renamed from: b */
    public int f2250b;

    /* renamed from: c */
    public final Rect f2251c;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    public static class C0447a extends AbstractC0446i {
        public C0447a(RecyclerView.AbstractC0391o abstractC0391o) {
            super(abstractC0391o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: d */
        public int mo28194d(View view) {
            return this.f2249a.m28642T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0396p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: e */
        public int mo28193e(View view) {
            RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
            return this.f2249a.m28643S(view) + ((ViewGroup.MarginLayoutParams) c0396p).leftMargin + ((ViewGroup.MarginLayoutParams) c0396p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: f */
        public int mo28192f(View view) {
            RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
            return this.f2249a.m28644R(view) + ((ViewGroup.MarginLayoutParams) c0396p).topMargin + ((ViewGroup.MarginLayoutParams) c0396p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: g */
        public int mo28191g(View view) {
            return this.f2249a.m28646Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0396p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: h */
        public int mo28190h() {
            return this.f2249a.m28600o0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: i */
        public int mo28189i() {
            return this.f2249a.m28600o0() - this.f2249a.m28621f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: j */
        public int mo28188j() {
            return this.f2249a.m28621f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: k */
        public int mo28187k() {
            return this.f2249a.m28597p0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: l */
        public int mo28186l() {
            return this.f2249a.m28637X();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: m */
        public int mo28185m() {
            return this.f2249a.m28623e0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: n */
        public int mo28184n() {
            return (this.f2249a.m28600o0() - this.f2249a.m28623e0()) - this.f2249a.m28621f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: p */
        public int mo28183p(View view) {
            this.f2249a.m28602n0(view, true, this.f2251c);
            return this.f2251c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: q */
        public int mo28182q(View view) {
            this.f2249a.m28602n0(view, true, this.f2251c);
            return this.f2251c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: r */
        public void mo28181r(int i) {
            this.f2249a.mo28487C0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* loaded from: classes.dex */
    public static class C0448b extends AbstractC0446i {
        public C0448b(RecyclerView.AbstractC0391o abstractC0391o) {
            super(abstractC0391o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: d */
        public int mo28194d(View view) {
            return this.f2249a.m28649O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0396p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: e */
        public int mo28193e(View view) {
            RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
            return this.f2249a.m28644R(view) + ((ViewGroup.MarginLayoutParams) c0396p).topMargin + ((ViewGroup.MarginLayoutParams) c0396p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: f */
        public int mo28192f(View view) {
            RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
            return this.f2249a.m28643S(view) + ((ViewGroup.MarginLayoutParams) c0396p).leftMargin + ((ViewGroup.MarginLayoutParams) c0396p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: g */
        public int mo28191g(View view) {
            return this.f2249a.m28641U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0396p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: h */
        public int mo28190h() {
            return this.f2249a.m28638W();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: i */
        public int mo28189i() {
            return this.f2249a.m28638W() - this.f2249a.m28625d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: j */
        public int mo28188j() {
            return this.f2249a.m28625d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: k */
        public int mo28187k() {
            return this.f2249a.m28637X();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: l */
        public int mo28186l() {
            return this.f2249a.m28597p0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: m */
        public int mo28185m() {
            return this.f2249a.m28619g0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: n */
        public int mo28184n() {
            return (this.f2249a.m28638W() - this.f2249a.m28619g0()) - this.f2249a.m28625d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: p */
        public int mo28183p(View view) {
            this.f2249a.m28602n0(view, true, this.f2251c);
            return this.f2251c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: q */
        public int mo28182q(View view) {
            this.f2249a.m28602n0(view, true, this.f2251c);
            return this.f2251c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0446i
        /* renamed from: r */
        public void mo28181r(int i) {
            this.f2249a.mo28483D0(i);
        }
    }

    public AbstractC0446i(RecyclerView.AbstractC0391o abstractC0391o) {
        this.f2250b = Integer.MIN_VALUE;
        this.f2251c = new Rect();
        this.f2249a = abstractC0391o;
    }

    public /* synthetic */ AbstractC0446i(RecyclerView.AbstractC0391o abstractC0391o, C0447a c0447a) {
        this(abstractC0391o);
    }

    /* renamed from: a */
    public static AbstractC0446i m28199a(RecyclerView.AbstractC0391o abstractC0391o) {
        return new C0447a(abstractC0391o);
    }

    /* renamed from: b */
    public static AbstractC0446i m28198b(RecyclerView.AbstractC0391o abstractC0391o, int i) {
        if (i != 0) {
            if (i == 1) {
                return m28197c(abstractC0391o);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return m28199a(abstractC0391o);
    }

    /* renamed from: c */
    public static AbstractC0446i m28197c(RecyclerView.AbstractC0391o abstractC0391o) {
        return new C0448b(abstractC0391o);
    }

    /* renamed from: d */
    public abstract int mo28194d(View view);

    /* renamed from: e */
    public abstract int mo28193e(View view);

    /* renamed from: f */
    public abstract int mo28192f(View view);

    /* renamed from: g */
    public abstract int mo28191g(View view);

    /* renamed from: h */
    public abstract int mo28190h();

    /* renamed from: i */
    public abstract int mo28189i();

    /* renamed from: j */
    public abstract int mo28188j();

    /* renamed from: k */
    public abstract int mo28187k();

    /* renamed from: l */
    public abstract int mo28186l();

    /* renamed from: m */
    public abstract int mo28185m();

    /* renamed from: n */
    public abstract int mo28184n();

    /* renamed from: o */
    public int m28196o() {
        if (Integer.MIN_VALUE == this.f2250b) {
            return 0;
        }
        return mo28184n() - this.f2250b;
    }

    /* renamed from: p */
    public abstract int mo28183p(View view);

    /* renamed from: q */
    public abstract int mo28182q(View view);

    /* renamed from: r */
    public abstract void mo28181r(int i);

    /* renamed from: s */
    public void m28195s() {
        this.f2250b = mo28184n();
    }
}
