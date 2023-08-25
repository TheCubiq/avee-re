package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.in1;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class b40 extends a40 {

    /* loaded from: classes.dex */
    public class a extends in1.e {
        public final /* synthetic */ Rect a;

        public a(Rect rect) {
            this.a = rect;
        }
    }

    /* loaded from: classes.dex */
    public class b implements in1.f {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // com.daaw.in1.f
        public void a(in1 in1Var) {
            in1Var.T(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // com.daaw.in1.f
        public void b(in1 in1Var) {
        }

        @Override // com.daaw.in1.f
        public void c(in1 in1Var) {
        }

        @Override // com.daaw.in1.f
        public void d(in1 in1Var) {
        }

        @Override // com.daaw.in1.f
        public void e(in1 in1Var) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends jn1 {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // com.daaw.in1.f
        public void a(in1 in1Var) {
            in1Var.T(this);
        }

        @Override // com.daaw.jn1, com.daaw.in1.f
        public void d(in1 in1Var) {
            Object obj = this.a;
            if (obj != null) {
                b40.this.q(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                b40.this.q(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                b40.this.q(obj3, this.f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends in1.e {
        public final /* synthetic */ Rect a;

        public d(Rect rect) {
            this.a = rect;
        }
    }

    public static boolean C(in1 in1Var) {
        return (a40.l(in1Var.D()) && a40.l(in1Var.E()) && a40.l(in1Var.F())) ? false : true;
    }

    @Override // com.daaw.a40
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        mn1 mn1Var = (mn1) obj;
        if (mn1Var != null) {
            mn1Var.G().clear();
            mn1Var.G().addAll(arrayList2);
            q(mn1Var, arrayList, arrayList2);
        }
    }

    @Override // com.daaw.a40
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        mn1 mn1Var = new mn1();
        mn1Var.i0((in1) obj);
        return mn1Var;
    }

    @Override // com.daaw.a40
    public void a(Object obj, View view) {
        if (obj != null) {
            ((in1) obj).b(view);
        }
    }

    @Override // com.daaw.a40
    public void b(Object obj, ArrayList<View> arrayList) {
        in1 in1Var = (in1) obj;
        if (in1Var == null) {
            return;
        }
        int i = 0;
        if (in1Var instanceof mn1) {
            mn1 mn1Var = (mn1) in1Var;
            int l0 = mn1Var.l0();
            while (i < l0) {
                b(mn1Var.k0(i), arrayList);
                i++;
            }
        } else if (C(in1Var) || !a40.l(in1Var.G())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                in1Var.b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // com.daaw.a40
    public void c(ViewGroup viewGroup, Object obj) {
        kn1.a(viewGroup, (in1) obj);
    }

    @Override // com.daaw.a40
    public boolean e(Object obj) {
        return obj instanceof in1;
    }

    @Override // com.daaw.a40
    public Object g(Object obj) {
        if (obj != null) {
            return ((in1) obj).clone();
        }
        return null;
    }

    @Override // com.daaw.a40
    public Object m(Object obj, Object obj2, Object obj3) {
        in1 in1Var = (in1) obj;
        in1 in1Var2 = (in1) obj2;
        in1 in1Var3 = (in1) obj3;
        if (in1Var != null && in1Var2 != null) {
            in1Var = new mn1().i0(in1Var).i0(in1Var2).q0(1);
        } else if (in1Var == null) {
            in1Var = in1Var2 != null ? in1Var2 : null;
        }
        if (in1Var3 != null) {
            mn1 mn1Var = new mn1();
            if (in1Var != null) {
                mn1Var.i0(in1Var);
            }
            mn1Var.i0(in1Var3);
            return mn1Var;
        }
        return in1Var;
    }

    @Override // com.daaw.a40
    public Object n(Object obj, Object obj2, Object obj3) {
        mn1 mn1Var = new mn1();
        if (obj != null) {
            mn1Var.i0((in1) obj);
        }
        if (obj2 != null) {
            mn1Var.i0((in1) obj2);
        }
        if (obj3 != null) {
            mn1Var.i0((in1) obj3);
        }
        return mn1Var;
    }

    @Override // com.daaw.a40
    public void p(Object obj, View view) {
        if (obj != null) {
            ((in1) obj).U(view);
        }
    }

    @Override // com.daaw.a40
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        in1 in1Var = (in1) obj;
        int i = 0;
        if (in1Var instanceof mn1) {
            mn1 mn1Var = (mn1) in1Var;
            int l0 = mn1Var.l0();
            while (i < l0) {
                q(mn1Var.k0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!C(in1Var)) {
            List<View> G = in1Var.G();
            if (G.size() == arrayList.size() && G.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    in1Var.b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    in1Var.U(arrayList.get(size2));
                }
            }
        }
    }

    @Override // com.daaw.a40
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((in1) obj).a(new b(view, arrayList));
    }

    @Override // com.daaw.a40
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((in1) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // com.daaw.a40
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((in1) obj).Z(new d(rect));
        }
    }

    @Override // com.daaw.a40
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((in1) obj).Z(new a(rect));
        }
    }

    @Override // com.daaw.a40
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        mn1 mn1Var = (mn1) obj;
        List<View> G = mn1Var.G();
        G.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a40.d(G, arrayList.get(i));
        }
        G.add(view);
        arrayList.add(view);
        b(mn1Var, arrayList);
    }
}
