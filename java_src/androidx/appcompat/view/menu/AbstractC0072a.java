package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.view.menu.InterfaceC0093j;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC0072a implements InterfaceC0091i {

    /* renamed from: p */
    public Context f299p;

    /* renamed from: q */
    public Context f300q;

    /* renamed from: r */
    public C0082e f301r;

    /* renamed from: s */
    public LayoutInflater f302s;

    /* renamed from: t */
    public LayoutInflater f303t;

    /* renamed from: u */
    public InterfaceC0091i.InterfaceC0092a f304u;

    /* renamed from: v */
    public int f305v;

    /* renamed from: w */
    public int f306w;

    /* renamed from: x */
    public InterfaceC0093j f307x;

    /* renamed from: y */
    public int f308y;

    public AbstractC0072a(Context context, int i, int i2) {
        this.f299p = context;
        this.f302s = LayoutInflater.from(context);
        this.f305v = i;
        this.f306w = i2;
    }

    /* renamed from: a */
    public void m30289a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f307x).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: b */
    public void mo25025b(C0082e c0082e, boolean z) {
        InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f304u;
        if (interfaceC0092a != null) {
            interfaceC0092a.mo24218b(c0082e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: c */
    public void mo25024c(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f307x;
        if (viewGroup == null) {
            return;
        }
        C0082e c0082e = this.f301r;
        int i = 0;
        if (c0082e != null) {
            c0082e.m30223t();
            ArrayList<C0086g> m30262G = this.f301r.m30262G();
            int size = m30262G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0086g c0086g = m30262G.get(i3);
                if (mo30124s(i2, c0086g)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C0086g itemData = childAt instanceof InterfaceC0093j.InterfaceC0094a ? ((InterfaceC0093j.InterfaceC0094a) childAt).getItemData() : null;
                    View mo30126p = mo30126p(c0086g, childAt, viewGroup);
                    if (c0086g != itemData) {
                        mo30126p.setPressed(false);
                        mo30126p.jumpDrawablesToCurrentState();
                    }
                    if (mo30126p != childAt) {
                        m30289a(mo30126p, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo30127n(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: e */
    public boolean mo17564e(C0082e c0082e, C0086g c0086g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: f */
    public boolean mo17563f(C0082e c0082e, C0086g c0086g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: g */
    public void mo30174g(InterfaceC0091i.InterfaceC0092a interfaceC0092a) {
        this.f304u = interfaceC0092a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    public int getId() {
        return this.f308y;
    }

    /* renamed from: h */
    public abstract void mo30128h(C0086g c0086g, InterfaceC0093j.InterfaceC0094a interfaceC0094a);

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: i */
    public void mo17562i(Context context, C0082e c0082e) {
        this.f300q = context;
        this.f303t = LayoutInflater.from(context);
        this.f301r = c0082e;
    }

    /* renamed from: k */
    public InterfaceC0093j.InterfaceC0094a m30288k(ViewGroup viewGroup) {
        return (InterfaceC0093j.InterfaceC0094a) this.f302s.inflate(this.f306w, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: l */
    public boolean mo25019l(SubMenuC0098l subMenuC0098l) {
        InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f304u;
        SubMenuC0098l subMenuC0098l2 = subMenuC0098l;
        if (interfaceC0092a != null) {
            if (subMenuC0098l == null) {
                subMenuC0098l2 = this.f301r;
            }
            return interfaceC0092a.mo24217c(subMenuC0098l2);
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo30127n(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: o */
    public InterfaceC0091i.InterfaceC0092a m30287o() {
        return this.f304u;
    }

    /* renamed from: p */
    public View mo30126p(C0086g c0086g, View view, ViewGroup viewGroup) {
        InterfaceC0093j.InterfaceC0094a m30288k = view instanceof InterfaceC0093j.InterfaceC0094a ? (InterfaceC0093j.InterfaceC0094a) view : m30288k(viewGroup);
        mo30128h(c0086g, m30288k);
        return (View) m30288k;
    }

    /* renamed from: q */
    public InterfaceC0093j mo30125q(ViewGroup viewGroup) {
        if (this.f307x == null) {
            InterfaceC0093j interfaceC0093j = (InterfaceC0093j) this.f302s.inflate(this.f305v, viewGroup, false);
            this.f307x = interfaceC0093j;
            interfaceC0093j.mo347b(this.f301r);
            mo25024c(true);
        }
        return this.f307x;
    }

    /* renamed from: r */
    public void m30286r(int i) {
        this.f308y = i;
    }

    /* renamed from: s */
    public abstract boolean mo30124s(int i, C0086g c0086g);
}
