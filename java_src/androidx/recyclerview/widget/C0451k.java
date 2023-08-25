package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.C3786z;
import com.daaw.xs1;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C0451k extends C3388w {

    /* renamed from: d */
    public final RecyclerView f2255d;

    /* renamed from: e */
    public final C0452a f2256e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    public static class C0452a extends C3388w {

        /* renamed from: d */
        public final C0451k f2257d;

        /* renamed from: e */
        public Map<View, C3388w> f2258e = new WeakHashMap();

        public C0452a(C0451k c0451k) {
            this.f2257d = c0451k;
        }

        @Override // com.daaw.C3388w
        /* renamed from: a */
        public boolean mo6634a(View view, AccessibilityEvent accessibilityEvent) {
            C3388w c3388w = this.f2258e.get(view);
            return c3388w != null ? c3388w.mo6634a(view, accessibilityEvent) : super.mo6634a(view, accessibilityEvent);
        }

        @Override // com.daaw.C3388w
        /* renamed from: b */
        public C3786z mo3048b(View view) {
            C3388w c3388w = this.f2258e.get(view);
            return c3388w != null ? c3388w.mo3048b(view) : super.mo3048b(view);
        }

        @Override // com.daaw.C3388w
        /* renamed from: f */
        public void mo354f(View view, AccessibilityEvent accessibilityEvent) {
            C3388w c3388w = this.f2258e.get(view);
            if (c3388w != null) {
                c3388w.mo354f(view, accessibilityEvent);
            } else {
                super.mo354f(view, accessibilityEvent);
            }
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            if (!this.f2257d.m28170o() && this.f2257d.f2255d.getLayoutManager() != null) {
                this.f2257d.f2255d.getLayoutManager().m28648O0(view, c3654y);
                C3388w c3388w = this.f2258e.get(view);
                if (c3388w != null) {
                    c3388w.mo161g(view, c3654y);
                    return;
                }
            }
            super.mo161g(view, c3654y);
        }

        @Override // com.daaw.C3388w
        /* renamed from: h */
        public void mo191h(View view, AccessibilityEvent accessibilityEvent) {
            C3388w c3388w = this.f2258e.get(view);
            if (c3388w != null) {
                c3388w.mo191h(view, accessibilityEvent);
            } else {
                super.mo191h(view, accessibilityEvent);
            }
        }

        @Override // com.daaw.C3388w
        /* renamed from: i */
        public boolean mo6630i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C3388w c3388w = this.f2258e.get(viewGroup);
            return c3388w != null ? c3388w.mo6630i(viewGroup, view, accessibilityEvent) : super.mo6630i(viewGroup, view, accessibilityEvent);
        }

        @Override // com.daaw.C3388w
        /* renamed from: j */
        public boolean mo6629j(View view, int i, Bundle bundle) {
            if (this.f2257d.m28170o() || this.f2257d.f2255d.getLayoutManager() == null) {
                return super.mo6629j(view, i, bundle);
            }
            C3388w c3388w = this.f2258e.get(view);
            if (c3388w != null) {
                if (c3388w.mo6629j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo6629j(view, i, bundle)) {
                return true;
            }
            return this.f2257d.f2255d.getLayoutManager().m28612i1(view, i, bundle);
        }

        @Override // com.daaw.C3388w
        /* renamed from: l */
        public void mo6627l(View view, int i) {
            C3388w c3388w = this.f2258e.get(view);
            if (c3388w != null) {
                c3388w.mo6627l(view, i);
            } else {
                super.mo6627l(view, i);
            }
        }

        @Override // com.daaw.C3388w
        /* renamed from: m */
        public void mo6626m(View view, AccessibilityEvent accessibilityEvent) {
            C3388w c3388w = this.f2258e.get(view);
            if (c3388w != null) {
                c3388w.mo6626m(view, accessibilityEvent);
            } else {
                super.mo6626m(view, accessibilityEvent);
            }
        }

        /* renamed from: n */
        public C3388w m28169n(View view) {
            return this.f2258e.remove(view);
        }

        /* renamed from: o */
        public void m28168o(View view) {
            C3388w m4711n = xs1.m4711n(view);
            if (m4711n == null || m4711n == this) {
                return;
            }
            this.f2258e.put(view, m4711n);
        }
    }

    public C0451k(RecyclerView recyclerView) {
        this.f2255d = recyclerView;
        C3388w m28171n = m28171n();
        this.f2256e = (m28171n == null || !(m28171n instanceof C0452a)) ? new C0452a(this) : (C0452a) m28171n;
    }

    @Override // com.daaw.C3388w
    /* renamed from: f */
    public void mo354f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo354f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m28170o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo28471K0(accessibilityEvent);
        }
    }

    @Override // com.daaw.C3388w
    /* renamed from: g */
    public void mo161g(View view, C3654y c3654y) {
        super.mo161g(view, c3654y);
        if (m28170o() || this.f2255d.getLayoutManager() == null) {
            return;
        }
        this.f2255d.getLayoutManager().m28650N0(c3654y);
    }

    @Override // com.daaw.C3388w
    /* renamed from: j */
    public boolean mo6629j(View view, int i, Bundle bundle) {
        if (super.mo6629j(view, i, bundle)) {
            return true;
        }
        if (m28170o() || this.f2255d.getLayoutManager() == null) {
            return false;
        }
        return this.f2255d.getLayoutManager().m28618g1(i, bundle);
    }

    /* renamed from: n */
    public C3388w m28171n() {
        return this.f2256e;
    }

    /* renamed from: o */
    public boolean m28170o() {
        return this.f2255d.m28805n0();
    }
}
