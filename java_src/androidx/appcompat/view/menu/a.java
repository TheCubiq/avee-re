package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class a implements i {
    public Context p;
    public Context q;
    public e r;
    public LayoutInflater s;
    public LayoutInflater t;
    public i.a u;
    public int v;
    public int w;
    public j x;
    public int y;

    public a(Context context, int i, int i2) {
        this.p = context;
        this.s = LayoutInflater.from(context);
        this.v = i;
        this.w = i2;
    }

    public void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.x).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        i.a aVar = this.u;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.x;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.r;
        int i = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList<g> G = this.r.G();
            int size = G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = G.get(i3);
                if (s(i2, gVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View p = p(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        p.setPressed(false);
                        p.jumpDrawablesToCurrentState();
                    }
                    if (p != childAt) {
                        a(p, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!n(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(i.a aVar) {
        this.u = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.y;
    }

    public abstract void h(g gVar, j.a aVar);

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        this.q = context;
        this.t = LayoutInflater.from(context);
        this.r = eVar;
    }

    public j.a k(ViewGroup viewGroup) {
        return (j.a) this.s.inflate(this.w, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        i.a aVar = this.u;
        l lVar2 = lVar;
        if (aVar != null) {
            if (lVar == null) {
                lVar2 = this.r;
            }
            return aVar.c(lVar2);
        }
        return false;
    }

    public boolean n(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public i.a o() {
        return this.u;
    }

    public View p(g gVar, View view, ViewGroup viewGroup) {
        j.a k = view instanceof j.a ? (j.a) view : k(viewGroup);
        h(gVar, k);
        return (View) k;
    }

    public j q(ViewGroup viewGroup) {
        if (this.x == null) {
            j jVar = (j) this.s.inflate(this.v, viewGroup, false);
            this.x = jVar;
            jVar.b(this.r);
            c(true);
        }
        return this.x;
    }

    public void r(int i) {
        this.y = i;
    }

    public abstract boolean s(int i, g gVar);
}
