package com.daaw;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.daaw.AbstractC2228n0;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.jh0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.daaw.el */
/* loaded from: classes.dex */
public class C1195el {

    /* renamed from: e */
    public static vw1<C0645al> f8545e = new vw1<>();

    /* renamed from: f */
    public static qw1<Boolean> f8546f = new qw1<>();

    /* renamed from: g */
    public static rw1<jh0.C1829a<Object>, Boolean> f8547g = new rw1<>();

    /* renamed from: h */
    public static qw1<sd0> f8548h = new qw1<>();

    /* renamed from: i */
    public static pw1 f8549i = new pw1();

    /* renamed from: j */
    public static final Object f8550j = new Object();

    /* renamed from: k */
    public static C1195el f8551k = null;

    /* renamed from: a */
    public HashMap<ch0, Integer> f8552a = new HashMap<>();

    /* renamed from: b */
    public HashMap<jh0.C1829a<Object>, C1198c> f8553b = new HashMap<>();

    /* renamed from: c */
    public boolean f8554c = false;

    /* renamed from: d */
    public AbstractC2228n0 f8555d;

    /* renamed from: com.daaw.el$b */
    /* loaded from: classes.dex */
    public class C1197b implements AbstractC2228n0.InterfaceC2229a {

        /* renamed from: a */
        public List<ch0> f8556a;

        public C1197b() {
            this.f8556a = new ArrayList();
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: a */
        public boolean mo15631a(AbstractC2228n0 abstractC2228n0, Menu menu) {
            return false;
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: b */
        public boolean mo15630b(AbstractC2228n0 abstractC2228n0, Menu menu) {
            C1195el.this.f8554c = false;
            abstractC2228n0.mo15645f().inflate(R.menu.contextual_menu, menu);
            menu.findItem(R.id.action_overflow).getSubMenu();
            return true;
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: c */
        public void mo15629c(AbstractC2228n0 abstractC2228n0) {
            C1195el.this.f8555d = null;
            if (!C1195el.this.f8554c) {
                C1195el.this.m23406g();
            }
            C1195el.f8546f.m12018a(Boolean.FALSE);
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: d */
        public boolean mo15628d(AbstractC2228n0 abstractC2228n0, MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.action_overflow) {
                int itemId = menuItem.getItemId() - 10;
                if (itemId >= 0 && itemId < C1195el.this.f8552a.size()) {
                    C0645al m6692a = C1195el.f8545e.m6692a(null);
                    if (m6692a == null) {
                        lz1.m16363c("onRequestContextData returned null");
                    } else if (C1195el.this.m23404i(m6692a, this.f8556a.get(itemId))) {
                        abstractC2228n0.mo15648c();
                        return true;
                    }
                }
                return false;
            }
            SubMenu subMenu = menuItem.getSubMenu();
            subMenu.clear();
            int size = C1195el.this.f8553b.size();
            this.f8556a.clear();
            if (size > 0) {
                for (Map.Entry entry : C1195el.this.f8552a.entrySet()) {
                    lz1.m16363c("" + ((ch0) entry.getKey()).toString() + " count: " + entry.getValue());
                    if (((Integer) entry.getValue()).intValue() == size && ((ch0) entry.getKey()).mo22639e() && ((size == 1 && ((ch0) entry.getKey()).m25381g()) || (size > 1 && ((ch0) entry.getKey()).m25382f()))) {
                        this.f8556a.add((ch0) entry.getKey());
                    }
                }
            }
            for (int i = 0; i < this.f8556a.size(); i++) {
                subMenu.add(0, i + 10, this.f8556a.get(i).m25384c(), this.f8556a.get(i).m25383d());
            }
            return true;
        }
    }

    /* renamed from: com.daaw.el$c */
    /* loaded from: classes.dex */
    public class C1198c {

        /* renamed from: a */
        public AbstractC2004l0[] f8558a;

        /* renamed from: b */
        public Object f8559b;

        public C1198c() {
        }
    }

    /* renamed from: j */
    public static C1195el m23403j() {
        C1195el c1195el;
        C1195el c1195el2 = f8551k;
        if (c1195el2 != null) {
            return c1195el2;
        }
        synchronized (f8550j) {
            if (f8551k == null) {
                f8551k = new C1195el();
            }
            c1195el = f8551k;
        }
        return c1195el;
    }

    /* renamed from: g */
    public final void m23406g() {
        f8549i.m12990a();
        this.f8552a.clear();
        this.f8553b.clear();
    }

    /* renamed from: h */
    public void m23405h(jh0.C1829a<Object> c1829a) {
        Integer num;
        f8547g.m10862a(c1829a, Boolean.FALSE);
        C1198c remove = this.f8553b.remove(c1829a);
        if (remove != null) {
            for (AbstractC2004l0 abstractC2004l0 : remove.f8558a) {
                ch0 m17273b = abstractC2004l0.m17273b();
                if (this.f8552a.get(m17273b) != null) {
                    Integer valueOf = Integer.valueOf(num.intValue() - 1);
                    if (valueOf.intValue() > 0) {
                        this.f8552a.put(m17273b, valueOf);
                    } else {
                        this.f8552a.remove(m17273b);
                    }
                }
            }
        }
        m23399n();
    }

    /* renamed from: i */
    public boolean m23404i(C0645al c0645al, ch0 ch0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<C1198c> it = this.f8553b.values().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            C1198c next = it.next();
            AbstractC2004l0[] abstractC2004l0Arr = next.f8558a;
            int length = abstractC2004l0Arr.length;
            while (true) {
                if (i < length) {
                    AbstractC2004l0 abstractC2004l0 = abstractC2004l0Arr[i];
                    if (abstractC2004l0.m17273b().equals(ch0Var)) {
                        arrayList2.add(next.f8559b);
                        arrayList.add(abstractC2004l0);
                        break;
                    }
                    i++;
                }
            }
        }
        if (arrayList.size() > 0) {
            ch0Var.mo8957b(c0645al, arrayList2, arrayList);
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m23402k() {
        AbstractC2228n0 abstractC2228n0 = this.f8555d;
        if (abstractC2228n0 != null) {
            this.f8554c = true;
            abstractC2228n0.mo15648c();
            this.f8555d = null;
        }
    }

    /* renamed from: l */
    public void m23401l(AbstractC2004l0[] abstractC2004l0Arr, Boolean bool, jh0.C1829a<Object> c1829a) {
        Object m18517d = c1829a.m18517d();
        if (!bool.booleanValue()) {
            m23405h(c1829a);
            return;
        }
        C1198c c1198c = new C1198c();
        c1198c.f8558a = abstractC2004l0Arr;
        c1198c.f8559b = m18517d;
        m23400m(c1829a, c1198c);
    }

    /* renamed from: m */
    public void m23400m(jh0.C1829a<Object> c1829a, C1198c c1198c) {
        f8547g.m10862a(c1829a, Boolean.TRUE);
        this.f8553b.put(c1829a, c1198c);
        HashMap hashMap = new HashMap();
        for (AbstractC2004l0 abstractC2004l0 : c1198c.f8558a) {
            ch0 m17273b = abstractC2004l0.m17273b();
            if (((Integer) hashMap.get(m17273b)) != null) {
                C2691q6.m12747k("There can only be unique ItemActionBase actions per item");
            } else {
                hashMap.put(m17273b, 1);
                Integer num = this.f8552a.get(m17273b);
                if (num == null) {
                    num = 0;
                }
                this.f8552a.put(m17273b, Integer.valueOf(num.intValue() + 1));
            }
        }
        m23399n();
    }

    /* renamed from: n */
    public void m23399n() {
        MainActivity m26903r0 = MainActivity.m26903r0();
        if (m26903r0 == null) {
            this.f8554c = true;
            AbstractC2228n0 abstractC2228n0 = this.f8555d;
            if (abstractC2228n0 != null) {
                abstractC2228n0.mo15648c();
                return;
            }
            return;
        }
        if (this.f8553b.size() <= 0) {
            AbstractC2228n0 abstractC2228n02 = this.f8555d;
            if (abstractC2228n02 != null) {
                abstractC2228n02.mo15648c();
            }
        } else if (this.f8555d == null) {
            this.f8555d = m26903r0.m13666Q(new C1197b());
            f8546f.m12018a(Boolean.TRUE);
        }
        AbstractC2228n0 abstractC2228n03 = this.f8555d;
        if (abstractC2228n03 != null) {
            abstractC2228n03.mo15633r(m26903r0.getString(R.string.selected, new Object[]{Integer.valueOf(this.f8553b.size())}));
        }
    }
}
