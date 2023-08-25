package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
public abstract class AbstractC0455n extends RecyclerView.AbstractC0398r {

    /* renamed from: a */
    public RecyclerView f2260a;

    /* renamed from: b */
    public Scroller f2261b;

    /* renamed from: c */
    public final RecyclerView.AbstractC0400t f2262c = new C0456a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* loaded from: classes.dex */
    public class C0456a extends RecyclerView.AbstractC0400t {

        /* renamed from: a */
        public boolean f2263a = false;

        public C0456a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0400t
        /* renamed from: a */
        public void mo552a(RecyclerView recyclerView, int i) {
            super.mo552a(recyclerView, i);
            if (i == 0 && this.f2263a) {
                this.f2263a = false;
                AbstractC0455n.this.m28129k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0400t
        /* renamed from: b */
        public void mo551b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f2263a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0398r
    /* renamed from: a */
    public boolean mo28139a(int i, int i2) {
        RecyclerView.AbstractC0391o layoutManager = this.f2260a.getLayoutManager();
        if (layoutManager == null || this.f2260a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2260a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m28130j(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void m28138b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2260a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m28134f();
        }
        this.f2260a = recyclerView;
        if (recyclerView != null) {
            m28131i();
            this.f2261b = new Scroller(this.f2260a.getContext(), new DecelerateInterpolator());
            m28129k();
        }
    }

    /* renamed from: c */
    public abstract int[] mo28137c(RecyclerView.AbstractC0391o abstractC0391o, View view);

    /* renamed from: d */
    public RecyclerView.AbstractC0406y m28136d(RecyclerView.AbstractC0391o abstractC0391o) {
        return mo28135e(abstractC0391o);
    }

    @Deprecated
    /* renamed from: e */
    public abstract C0443g mo28135e(RecyclerView.AbstractC0391o abstractC0391o);

    /* renamed from: f */
    public final void m28134f() {
        this.f2260a.m28842a1(this.f2262c);
        this.f2260a.setOnFlingListener(null);
    }

    /* renamed from: g */
    public abstract View mo28133g(RecyclerView.AbstractC0391o abstractC0391o);

    /* renamed from: h */
    public abstract int mo28132h(RecyclerView.AbstractC0391o abstractC0391o, int i, int i2);

    /* renamed from: i */
    public final void m28131i() {
        if (this.f2260a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f2260a.m28815k(this.f2262c);
        this.f2260a.setOnFlingListener(this);
    }

    /* renamed from: j */
    public final boolean m28130j(RecyclerView.AbstractC0391o abstractC0391o, int i, int i2) {
        RecyclerView.AbstractC0406y m28136d;
        int mo28132h;
        if (!(abstractC0391o instanceof RecyclerView.AbstractC0406y.InterfaceC0408b) || (m28136d = m28136d(abstractC0391o)) == null || (mo28132h = mo28132h(abstractC0391o, i, i2)) == -1) {
            return false;
        }
        m28136d.m28504p(mo28132h);
        abstractC0391o.m28657J1(m28136d);
        return true;
    }

    /* renamed from: k */
    public void m28129k() {
        RecyclerView.AbstractC0391o layoutManager;
        View mo28133g;
        RecyclerView recyclerView = this.f2260a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo28133g = mo28133g(layoutManager)) == null) {
            return;
        }
        int[] mo28137c = mo28137c(layoutManager, mo28133g);
        if (mo28137c[0] == 0 && mo28137c[1] == 0) {
            return;
        }
        this.f2260a.m28804n1(mo28137c[0], mo28137c[1]);
    }
}
