package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.daaw.w;
import com.daaw.xs1;
import com.daaw.y;
import com.daaw.z;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class k extends w {
    public final RecyclerView d;
    public final a e;

    /* loaded from: classes.dex */
    public static class a extends w {
        public final k d;
        public Map<View, w> e = new WeakHashMap();

        public a(k kVar) {
            this.d = kVar;
        }

        @Override // com.daaw.w
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            w wVar = this.e.get(view);
            return wVar != null ? wVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // com.daaw.w
        public z b(View view) {
            w wVar = this.e.get(view);
            return wVar != null ? wVar.b(view) : super.b(view);
        }

        @Override // com.daaw.w
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            w wVar = this.e.get(view);
            if (wVar != null) {
                wVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().O0(view, yVar);
                w wVar = this.e.get(view);
                if (wVar != null) {
                    wVar.g(view, yVar);
                    return;
                }
            }
            super.g(view, yVar);
        }

        @Override // com.daaw.w
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            w wVar = this.e.get(view);
            if (wVar != null) {
                wVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // com.daaw.w
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            w wVar = this.e.get(viewGroup);
            return wVar != null ? wVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // com.daaw.w
        public boolean j(View view, int i, Bundle bundle) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            w wVar = this.e.get(view);
            if (wVar != null) {
                if (wVar.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().i1(view, i, bundle);
        }

        @Override // com.daaw.w
        public void l(View view, int i) {
            w wVar = this.e.get(view);
            if (wVar != null) {
                wVar.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // com.daaw.w
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            w wVar = this.e.get(view);
            if (wVar != null) {
                wVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public w n(View view) {
            return this.e.remove(view);
        }

        public void o(View view) {
            w n = xs1.n(view);
            if (n == null || n == this) {
                return;
            }
            this.e.put(view, n);
        }
    }

    public k(RecyclerView recyclerView) {
        this.d = recyclerView;
        w n = n();
        this.e = (n == null || !(n instanceof a)) ? new a(this) : (a) n;
    }

    @Override // com.daaw.w
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // com.daaw.w
    public void g(View view, y yVar) {
        super.g(view, yVar);
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().N0(yVar);
    }

    @Override // com.daaw.w
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().g1(i, bundle);
    }

    public w n() {
        return this.e;
    }

    public boolean o() {
        return this.d.n0();
    }
}
