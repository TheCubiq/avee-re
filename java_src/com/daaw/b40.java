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

    /* renamed from: com.daaw.b40$a */
    /* loaded from: classes.dex */
    public class C0808a extends in1.AbstractC1728e {

        /* renamed from: a */
        public final /* synthetic */ Rect f4268a;

        public C0808a(Rect rect) {
            this.f4268a = rect;
        }
    }

    /* renamed from: com.daaw.b40$b */
    /* loaded from: classes.dex */
    public class C0809b implements in1.InterfaceC1729f {

        /* renamed from: a */
        public final /* synthetic */ View f4270a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4271b;

        public C0809b(View view, ArrayList arrayList) {
            this.f4270a = view;
            this.f4271b = arrayList;
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: a */
        public void mo9244a(in1 in1Var) {
            in1Var.mo15921T(this);
            this.f4270a.setVisibility(8);
            int size = this.f4271b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4271b.get(i)).setVisibility(0);
            }
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: b */
        public void mo9243b(in1 in1Var) {
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: c */
        public void mo9242c(in1 in1Var) {
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: d */
        public void mo15892d(in1 in1Var) {
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: e */
        public void mo9241e(in1 in1Var) {
        }
    }

    /* renamed from: com.daaw.b40$c */
    /* loaded from: classes.dex */
    public class C0810c extends jn1 {

        /* renamed from: a */
        public final /* synthetic */ Object f4273a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4274b;

        /* renamed from: c */
        public final /* synthetic */ Object f4275c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f4276d;

        /* renamed from: e */
        public final /* synthetic */ Object f4277e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f4278f;

        public C0810c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4273a = obj;
            this.f4274b = arrayList;
            this.f4275c = obj2;
            this.f4276d = arrayList2;
            this.f4277e = obj3;
            this.f4278f = arrayList3;
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: a */
        public void mo9244a(in1 in1Var) {
            in1Var.mo15921T(this);
        }

        @Override // com.daaw.jn1, com.daaw.in1.InterfaceC1729f
        /* renamed from: d */
        public void mo15892d(in1 in1Var) {
            Object obj = this.f4273a;
            if (obj != null) {
                b40.this.mo2897q(obj, this.f4274b, null);
            }
            Object obj2 = this.f4275c;
            if (obj2 != null) {
                b40.this.mo2897q(obj2, this.f4276d, null);
            }
            Object obj3 = this.f4277e;
            if (obj3 != null) {
                b40.this.mo2897q(obj3, this.f4278f, null);
            }
        }
    }

    /* renamed from: com.daaw.b40$d */
    /* loaded from: classes.dex */
    public class C0811d extends in1.AbstractC1728e {

        /* renamed from: a */
        public final /* synthetic */ Rect f4280a;

        public C0811d(Rect rect) {
            this.f4280a = rect;
        }
    }

    /* renamed from: C */
    public static boolean m26494C(in1 in1Var) {
        return (a40.m27616l(in1Var.m19622D()) && a40.m27616l(in1Var.m19621E()) && a40.m27616l(in1Var.m19620F())) ? false : true;
    }

    @Override // com.daaw.a40
    /* renamed from: A */
    public void mo2908A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        mn1 mn1Var = (mn1) obj;
        if (mn1Var != null) {
            mn1Var.m19619G().clear();
            mn1Var.m19619G().addAll(arrayList2);
            mo2897q(mn1Var, arrayList, arrayList2);
        }
    }

    @Override // com.daaw.a40
    /* renamed from: B */
    public Object mo2907B(Object obj) {
        if (obj == null) {
            return null;
        }
        mn1 mn1Var = new mn1();
        mn1Var.m15906i0((in1) obj);
        return mn1Var;
    }

    @Override // com.daaw.a40
    /* renamed from: a */
    public void mo2905a(Object obj, View view) {
        if (obj != null) {
            ((in1) obj).mo15913b(view);
        }
    }

    @Override // com.daaw.a40
    /* renamed from: b */
    public void mo2904b(Object obj, ArrayList<View> arrayList) {
        in1 in1Var = (in1) obj;
        if (in1Var == null) {
            return;
        }
        int i = 0;
        if (in1Var instanceof mn1) {
            mn1 mn1Var = (mn1) in1Var;
            int m15902l0 = mn1Var.m15902l0();
            while (i < m15902l0) {
                mo2904b(mn1Var.m15903k0(i), arrayList);
                i++;
            }
        } else if (m26494C(in1Var) || !a40.m27616l(in1Var.m19619G())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                in1Var.mo15913b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // com.daaw.a40
    /* renamed from: c */
    public void mo2903c(ViewGroup viewGroup, Object obj) {
        kn1.m17646a(viewGroup, (in1) obj);
    }

    @Override // com.daaw.a40
    /* renamed from: e */
    public boolean mo2902e(Object obj) {
        return obj instanceof in1;
    }

    @Override // com.daaw.a40
    /* renamed from: g */
    public Object mo2901g(Object obj) {
        if (obj != null) {
            return ((in1) obj).clone();
        }
        return null;
    }

    @Override // com.daaw.a40
    /* renamed from: m */
    public Object mo2900m(Object obj, Object obj2, Object obj3) {
        in1 in1Var = (in1) obj;
        in1 in1Var2 = (in1) obj2;
        in1 in1Var3 = (in1) obj3;
        if (in1Var != null && in1Var2 != null) {
            in1Var = new mn1().m15906i0(in1Var).m15906i0(in1Var2).m15896q0(1);
        } else if (in1Var == null) {
            in1Var = in1Var2 != null ? in1Var2 : null;
        }
        if (in1Var3 != null) {
            mn1 mn1Var = new mn1();
            if (in1Var != null) {
                mn1Var.m15906i0(in1Var);
            }
            mn1Var.m15906i0(in1Var3);
            return mn1Var;
        }
        return in1Var;
    }

    @Override // com.daaw.a40
    /* renamed from: n */
    public Object mo2899n(Object obj, Object obj2, Object obj3) {
        mn1 mn1Var = new mn1();
        if (obj != null) {
            mn1Var.m15906i0((in1) obj);
        }
        if (obj2 != null) {
            mn1Var.m15906i0((in1) obj2);
        }
        if (obj3 != null) {
            mn1Var.m15906i0((in1) obj3);
        }
        return mn1Var;
    }

    @Override // com.daaw.a40
    /* renamed from: p */
    public void mo2898p(Object obj, View view) {
        if (obj != null) {
            ((in1) obj).mo15920U(view);
        }
    }

    @Override // com.daaw.a40
    /* renamed from: q */
    public void mo2897q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        in1 in1Var = (in1) obj;
        int i = 0;
        if (in1Var instanceof mn1) {
            mn1 mn1Var = (mn1) in1Var;
            int m15902l0 = mn1Var.m15902l0();
            while (i < m15902l0) {
                mo2897q(mn1Var.m15903k0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m26494C(in1Var)) {
            List<View> m19619G = in1Var.m19619G();
            if (m19619G.size() == arrayList.size() && m19619G.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    in1Var.mo15913b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    in1Var.mo15920U(arrayList.get(size2));
                }
            }
        }
    }

    @Override // com.daaw.a40
    /* renamed from: r */
    public void mo2896r(Object obj, View view, ArrayList<View> arrayList) {
        ((in1) obj).mo15915a(new C0809b(view, arrayList));
    }

    @Override // com.daaw.a40
    /* renamed from: t */
    public void mo2895t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((in1) obj).mo15915a(new C0810c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // com.daaw.a40
    /* renamed from: u */
    public void mo2894u(Object obj, Rect rect) {
        if (obj != null) {
            ((in1) obj).mo15916Z(new C0811d(rect));
        }
    }

    @Override // com.daaw.a40
    /* renamed from: v */
    public void mo2893v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m27617k(view, rect);
            ((in1) obj).mo15916Z(new C0808a(rect));
        }
    }

    @Override // com.daaw.a40
    /* renamed from: z */
    public void mo2891z(Object obj, View view, ArrayList<View> arrayList) {
        mn1 mn1Var = (mn1) obj;
        List<View> m19619G = mn1Var.m19619G();
        m19619G.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a40.m27622d(m19619G, arrayList.get(i));
        }
        m19619G.add(view);
        arrayList.add(view);
        mo2904b(mn1Var, arrayList);
    }
}
