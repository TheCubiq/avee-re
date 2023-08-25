package com.daaw;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.jh0;
import com.daaw.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class el {
    public static vw1<al> e = new vw1<>();
    public static qw1<Boolean> f = new qw1<>();
    public static rw1<jh0.a<Object>, Boolean> g = new rw1<>();
    public static qw1<sd0> h = new qw1<>();
    public static pw1 i = new pw1();
    public static final Object j = new Object();
    public static el k = null;
    public HashMap<ch0, Integer> a = new HashMap<>();
    public HashMap<jh0.a<Object>, c> b = new HashMap<>();
    public boolean c = false;
    public n0 d;

    /* loaded from: classes.dex */
    public class b implements n0.a {
        public List<ch0> a;

        public b() {
            this.a = new ArrayList();
        }

        @Override // com.daaw.n0.a
        public boolean a(n0 n0Var, Menu menu) {
            return false;
        }

        @Override // com.daaw.n0.a
        public boolean b(n0 n0Var, Menu menu) {
            el.this.c = false;
            n0Var.f().inflate(R.menu.contextual_menu, menu);
            menu.findItem(R.id.action_overflow).getSubMenu();
            return true;
        }

        @Override // com.daaw.n0.a
        public void c(n0 n0Var) {
            el.this.d = null;
            if (!el.this.c) {
                el.this.g();
            }
            el.f.a(Boolean.FALSE);
        }

        @Override // com.daaw.n0.a
        public boolean d(n0 n0Var, MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.action_overflow) {
                int itemId = menuItem.getItemId() - 10;
                if (itemId >= 0 && itemId < el.this.a.size()) {
                    al a = el.e.a(null);
                    if (a == null) {
                        lz1.c("onRequestContextData returned null");
                    } else if (el.this.i(a, this.a.get(itemId))) {
                        n0Var.c();
                        return true;
                    }
                }
                return false;
            }
            SubMenu subMenu = menuItem.getSubMenu();
            subMenu.clear();
            int size = el.this.b.size();
            this.a.clear();
            if (size > 0) {
                for (Map.Entry entry : el.this.a.entrySet()) {
                    lz1.c("" + ((ch0) entry.getKey()).toString() + " count: " + entry.getValue());
                    if (((Integer) entry.getValue()).intValue() == size && ((ch0) entry.getKey()).e() && ((size == 1 && ((ch0) entry.getKey()).g()) || (size > 1 && ((ch0) entry.getKey()).f()))) {
                        this.a.add((ch0) entry.getKey());
                    }
                }
            }
            for (int i = 0; i < this.a.size(); i++) {
                subMenu.add(0, i + 10, this.a.get(i).c(), this.a.get(i).d());
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c {
        public l0[] a;
        public Object b;

        public c() {
        }
    }

    public static el j() {
        el elVar;
        el elVar2 = k;
        if (elVar2 != null) {
            return elVar2;
        }
        synchronized (j) {
            if (k == null) {
                k = new el();
            }
            elVar = k;
        }
        return elVar;
    }

    public final void g() {
        i.a();
        this.a.clear();
        this.b.clear();
    }

    public void h(jh0.a<Object> aVar) {
        Integer num;
        g.a(aVar, Boolean.FALSE);
        c remove = this.b.remove(aVar);
        if (remove != null) {
            for (l0 l0Var : remove.a) {
                ch0 b2 = l0Var.b();
                if (this.a.get(b2) != null) {
                    Integer valueOf = Integer.valueOf(num.intValue() - 1);
                    if (valueOf.intValue() > 0) {
                        this.a.put(b2, valueOf);
                    } else {
                        this.a.remove(b2);
                    }
                }
            }
        }
        n();
    }

    public boolean i(al alVar, ch0 ch0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<c> it = this.b.values().iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            c next = it.next();
            l0[] l0VarArr = next.a;
            int length = l0VarArr.length;
            while (true) {
                if (i2 < length) {
                    l0 l0Var = l0VarArr[i2];
                    if (l0Var.b().equals(ch0Var)) {
                        arrayList2.add(next.b);
                        arrayList.add(l0Var);
                        break;
                    }
                    i2++;
                }
            }
        }
        if (arrayList.size() > 0) {
            ch0Var.b(alVar, arrayList2, arrayList);
            return true;
        }
        return false;
    }

    public void k() {
        n0 n0Var = this.d;
        if (n0Var != null) {
            this.c = true;
            n0Var.c();
            this.d = null;
        }
    }

    public void l(l0[] l0VarArr, Boolean bool, jh0.a<Object> aVar) {
        Object d = aVar.d();
        if (!bool.booleanValue()) {
            h(aVar);
            return;
        }
        c cVar = new c();
        cVar.a = l0VarArr;
        cVar.b = d;
        m(aVar, cVar);
    }

    public void m(jh0.a<Object> aVar, c cVar) {
        g.a(aVar, Boolean.TRUE);
        this.b.put(aVar, cVar);
        HashMap hashMap = new HashMap();
        for (l0 l0Var : cVar.a) {
            ch0 b2 = l0Var.b();
            if (((Integer) hashMap.get(b2)) != null) {
                q6.k("There can only be unique ItemActionBase actions per item");
            } else {
                hashMap.put(b2, 1);
                Integer num = this.a.get(b2);
                if (num == null) {
                    num = 0;
                }
                this.a.put(b2, Integer.valueOf(num.intValue() + 1));
            }
        }
        n();
    }

    public void n() {
        MainActivity r0 = MainActivity.r0();
        if (r0 == null) {
            this.c = true;
            n0 n0Var = this.d;
            if (n0Var != null) {
                n0Var.c();
                return;
            }
            return;
        }
        if (this.b.size() <= 0) {
            n0 n0Var2 = this.d;
            if (n0Var2 != null) {
                n0Var2.c();
            }
        } else if (this.d == null) {
            this.d = r0.Q(new b());
            f.a(Boolean.TRUE);
        }
        n0 n0Var3 = this.d;
        if (n0Var3 != null) {
            n0Var3.r(r0.getString(R.string.selected, new Object[]{Integer.valueOf(this.b.size())}));
        }
    }
}
