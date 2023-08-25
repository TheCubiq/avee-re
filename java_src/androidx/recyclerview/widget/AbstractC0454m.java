package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public abstract class AbstractC0454m extends RecyclerView.AbstractC0385l {

    /* renamed from: g */
    public boolean f2259g = true;

    /* renamed from: A */
    public final void m28164A(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28156I(abstractC0376c0);
        m28695h(abstractC0376c0);
    }

    /* renamed from: B */
    public final void m28163B(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28155J(abstractC0376c0);
    }

    /* renamed from: C */
    public final void m28162C(RecyclerView.AbstractC0376c0 abstractC0376c0, boolean z) {
        m28154K(abstractC0376c0, z);
        m28695h(abstractC0376c0);
    }

    /* renamed from: D */
    public final void m28161D(RecyclerView.AbstractC0376c0 abstractC0376c0, boolean z) {
        m28153L(abstractC0376c0, z);
    }

    /* renamed from: E */
    public final void m28160E(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28152M(abstractC0376c0);
        m28695h(abstractC0376c0);
    }

    /* renamed from: F */
    public final void m28159F(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28151N(abstractC0376c0);
    }

    /* renamed from: G */
    public final void m28158G(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28150O(abstractC0376c0);
        m28695h(abstractC0376c0);
    }

    /* renamed from: H */
    public final void m28157H(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28149P(abstractC0376c0);
    }

    /* renamed from: I */
    public void m28156I(RecyclerView.AbstractC0376c0 abstractC0376c0) {
    }

    /* renamed from: J */
    public void m28155J(RecyclerView.AbstractC0376c0 abstractC0376c0) {
    }

    /* renamed from: K */
    public void m28154K(RecyclerView.AbstractC0376c0 abstractC0376c0, boolean z) {
    }

    /* renamed from: L */
    public void m28153L(RecyclerView.AbstractC0376c0 abstractC0376c0, boolean z) {
    }

    /* renamed from: M */
    public void m28152M(RecyclerView.AbstractC0376c0 abstractC0376c0) {
    }

    /* renamed from: N */
    public void m28151N(RecyclerView.AbstractC0376c0 abstractC0376c0) {
    }

    /* renamed from: O */
    public void m28150O(RecyclerView.AbstractC0376c0 abstractC0376c0) {
    }

    /* renamed from: P */
    public void m28149P(RecyclerView.AbstractC0376c0 abstractC0376c0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: a */
    public boolean mo28148a(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c, RecyclerView.AbstractC0385l.C0388c c0388c2) {
        int i;
        int i2;
        return (c0388c == null || ((i = c0388c.f1976a) == (i2 = c0388c2.f1976a) && c0388c.f1977b == c0388c2.f1977b)) ? mo28143w(abstractC0376c0) : mo28141y(abstractC0376c0, i, c0388c.f1977b, i2, c0388c2.f1977b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: b */
    public boolean mo28147b(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0376c0 abstractC0376c02, RecyclerView.AbstractC0385l.C0388c c0388c, RecyclerView.AbstractC0385l.C0388c c0388c2) {
        int i;
        int i2;
        int i3 = c0388c.f1976a;
        int i4 = c0388c.f1977b;
        if (abstractC0376c02.m28746L()) {
            int i5 = c0388c.f1976a;
            i2 = c0388c.f1977b;
            i = i5;
        } else {
            i = c0388c2.f1976a;
            i2 = c0388c2.f1977b;
        }
        return mo28142x(abstractC0376c0, abstractC0376c02, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: c */
    public boolean mo28146c(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c, RecyclerView.AbstractC0385l.C0388c c0388c2) {
        int i = c0388c.f1976a;
        int i2 = c0388c.f1977b;
        View view = abstractC0376c0.f1947a;
        int left = c0388c2 == null ? view.getLeft() : c0388c2.f1976a;
        int top = c0388c2 == null ? view.getTop() : c0388c2.f1977b;
        if (abstractC0376c0.m28722x() || (i == left && i2 == top)) {
            return mo28140z(abstractC0376c0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo28141y(abstractC0376c0, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: d */
    public boolean mo28145d(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c, RecyclerView.AbstractC0385l.C0388c c0388c2) {
        int i = c0388c.f1976a;
        int i2 = c0388c2.f1976a;
        if (i == i2 && c0388c.f1977b == c0388c2.f1977b) {
            m28160E(abstractC0376c0);
            return false;
        }
        return mo28141y(abstractC0376c0, i, c0388c.f1977b, i2, c0388c2.f1977b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: f */
    public boolean mo28144f(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        return !this.f2259g || abstractC0376c0.m28724v();
    }

    /* renamed from: w */
    public abstract boolean mo28143w(RecyclerView.AbstractC0376c0 abstractC0376c0);

    /* renamed from: x */
    public abstract boolean mo28142x(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0376c0 abstractC0376c02, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo28141y(RecyclerView.AbstractC0376c0 abstractC0376c0, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo28140z(RecyclerView.AbstractC0376c0 abstractC0376c0);
}
