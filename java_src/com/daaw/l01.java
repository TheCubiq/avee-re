package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.daaw.avee.R;
import com.daaw.ce0;
import com.daaw.er0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class l01 implements zo0, ce0.a {
    public static vw1<Boolean> t = new vw1<>();
    public static uw1<lo1<tx0, vd0>, Integer, Boolean, Boolean, Object> u = new uw1<>();
    public static rw1<er0<tx0, vd0>, be0> v = new rw1<>();
    public static qw1<Integer> w = new qw1<>();
    public static final Object x = new Object();
    public static volatile l01 y = null;
    public be0 p = null;
    public er0<tx0, vd0> q = new er0<>();
    public ce0 r = new o01();
    public int s = -1;

    public l01() {
        T(0, false);
        K();
    }

    public static l01 c() {
        l01 l01Var;
        l01 l01Var2 = y;
        if (l01Var2 != null) {
            return l01Var2;
        }
        synchronized (x) {
            l01Var = y;
            if (l01Var == null) {
                l01Var = new l01();
                y = l01Var;
            }
        }
        return l01Var;
    }

    public static int f(int i, List<Integer> list, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            for (Integer num : list) {
                if (num.intValue() + i2 == i) {
                    return num.intValue() + i3;
                }
                if (num.intValue() + i3 == i) {
                    return num.intValue() + i2;
                }
            }
            return i;
        }
        if (i3 >= 0) {
            i4 = i;
            for (Integer num2 : list) {
                if (num2.intValue() + i3 < i) {
                    i4--;
                }
                if (num2.intValue() + i3 == i) {
                    if (i2 >= 0) {
                        return num2.intValue() + i2;
                    }
                    return -1;
                }
            }
        } else {
            i4 = i;
        }
        if (i2 >= 0) {
            for (Integer num3 : list) {
                if (num3.intValue() + i2 <= i) {
                    i4++;
                }
            }
        }
        return i4;
    }

    public static int g(int i, int i2, int i3) {
        if (i < i2) {
            return i;
        }
        int i4 = i + i3;
        if (i4 <= i2) {
            return -1;
        }
        return i4;
    }

    public static int h(int i, int i2, int i3, int i4, boolean z) {
        if (z) {
            return i == i3 ? i2 : i == i2 ? i3 : i;
        } else if (i < i2) {
            return i;
        } else {
            int i5 = i + (i4 * ((i3 - i2) + 1));
            if (i5 <= i2) {
                return -1;
            }
            return i5;
        }
    }

    public static int i(int i, List<Integer> list, int i2) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (size + i2 == i) {
                i--;
            }
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static int j(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        return i(i, arrayList, i2);
    }

    public void A(List<Integer> list, int i, int i2, boolean z, be0 be0Var) {
        this.p = be0Var;
        this.r.c(list, i, i2, z, this.q.size());
    }

    public void B(int i, boolean z, boolean z2, Object obj) {
        u.a((i < 0 || i >= this.q.size()) ? null : this.q.get(i), Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), obj);
    }

    public void C(tx0 tx0Var, boolean z, boolean z2, Object obj) {
        u.a(new lo1<>(tx0Var, new q01(-1)), -1, Boolean.valueOf(z), Boolean.valueOf(z2), obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r13 == 3) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(java.util.Collection<com.daaw.tx0> r11, int r12, int r13, com.daaw.be0 r14, java.lang.Object r15, int r16, boolean r17) {
        /*
            r10 = this;
            r7 = r10
            r0 = r13
            r1 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
            r2 = -1
            r9 = 1
            if (r0 != r2) goto Lb
            goto L25
        Lb:
            if (r0 != 0) goto Lf
            r2 = 0
            goto L25
        Lf:
            if (r0 != r9) goto L15
        L11:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L25
        L15:
            r3 = 2
            if (r0 != r3) goto L21
            com.daaw.ce0 r0 = r7.r
            int r0 = r0.i(r9)
            int r0 = r0 + r9
            r2 = r0
            goto L25
        L21:
            r3 = 3
            if (r0 != r3) goto L25
            goto L11
        L25:
            if (r2 >= 0) goto L29
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            r0 = r10
            r1 = r11
            r4 = r14
            r5 = r16
            r6 = r17
            int r0 = r0.b(r1, r2, r3, r4, r5, r6)
            if (r12 < 0) goto L47
            com.daaw.ce0 r1 = r7.r
            int r0 = r0 + r12
            r1.l(r0)
            com.daaw.ce0 r0 = r7.r
            int r0 = r0.i(r9)
            r1 = r15
            r10.B(r0, r8, r9, r15)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.l01.D(java.util.Collection, int, int, com.daaw.be0, java.lang.Object, int, boolean):void");
    }

    public void E(List<tx0> list, int i, int i2, be0 be0Var) {
        D(list, i, i2, be0Var, null, 0, true);
    }

    public void F(Object obj) {
        B(this.r.i(true), false, true, obj);
    }

    public void G(Object obj) {
        this.r.j();
        B(this.r.i(true), false, true, obj);
    }

    public void H() {
        I(null);
    }

    public void I(Object obj) {
        this.r.g();
        B(this.r.i(true), false, true, obj);
    }

    public void J(List<tx0> list, int i, Object obj) {
        if (i < 0 || i >= list.size()) {
            return;
        }
        C(list.get(i), false, true, obj);
    }

    public void K() {
        lz1.a("reloadQueue");
        Context e = dx0.e();
        if (e == null) {
            return;
        }
        SharedPreferences p = j5.e().p(e);
        String P = j5.P(p, "queue", "");
        String P2 = j5.P(p, "queueSizes", "");
        int length = P != null ? P.length() : 0;
        int length2 = P2 != null ? P2.length() : 0;
        this.q.clear();
        if (length > 1 && length2 > 0) {
            String[] split = P2.split(",");
            int length3 = split.length;
            int i = 0;
            int i2 = 0;
            while (i < length3) {
                int w2 = br1.w(split[i]) + i2;
                this.q.f(new tx0(P.substring(i2, w2)), new q01());
                i++;
                i2 = w2;
            }
        }
        if (this.q.size() == 0 && t.a(Boolean.FALSE).booleanValue()) {
            List<tx0> b = dr1.b(e, 30);
            lz1.a("getMostRecentTrackListByCount: " + b.size());
            for (tx0 tx0Var : b) {
                this.q.f(tx0Var, new q01());
            }
        }
        this.r.l(j5.M(p, "curpos", 0));
        int M = j5.M(p, "shufflemode", 0);
        if (M != 1) {
            M = 0;
        }
        U(M, false, true);
        y(0, this.q.size(), 0, false, null);
    }

    public void L(int i) {
        ArrayList arrayList = new ArrayList(4);
        er0.c<tx0, vd0> r = this.q.r();
        while (r.hasNext()) {
            int nextIndex = r.nextIndex();
            if (i == r.next().b.c()) {
                arrayList.add(Integer.valueOf(nextIndex));
                r.remove();
            }
        }
        A(arrayList, -1, 0, false, null);
    }

    public void M(List<vd0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (vd0 vd0Var : list) {
            er0.c<tx0, vd0> r = this.q.r();
            while (r.hasNext()) {
                int nextIndex = r.nextIndex();
                if (vd0Var.equals(r.next().b)) {
                    arrayList.add(Integer.valueOf(nextIndex));
                    r.remove();
                }
            }
        }
        A(arrayList, -1, 0, false, null);
    }

    public final void N(Context context) {
        SharedPreferences.Editor edit = j5.e().p(context).edit();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            String g = this.q.o(i).g();
            if (g != null) {
                sb.append(g);
                sb2.append(g.length());
                sb2.append(',');
            }
        }
        edit.putString("queue", sb.toString());
        edit.putString("queueSizes", sb2.toString());
        edit.putInt("curpos", this.r.a());
        edit.putInt("shufflemode", this.s);
        edit.apply();
    }

    public void O(vd0 vd0Var) {
        P(vd0Var, null);
    }

    public void P(vd0 vd0Var, Object obj) {
        if (vd0Var == null) {
            return;
        }
        S(e(vd0Var, vd0Var.a()), obj);
    }

    public void Q(vd0 vd0Var, int i) {
        if (vd0Var == null || vd0Var.c() == i) {
            return;
        }
        vd0Var.b(i);
        w();
    }

    public void R(int i) {
        S(i, null);
    }

    public void S(int i, Object obj) {
        this.r.b(i);
        B(i, false, true, obj);
    }

    public void T(int i, boolean z) {
        U(i, z, false);
    }

    public void U(int i, boolean z, boolean z2) {
        String quantityString;
        Context b;
        if (z2 || this.s != i) {
            this.s = i;
            ce0 ce0Var = this.r;
            int i2 = ce0Var == null ? 0 : ce0Var.i(true);
            int i3 = this.s;
            if (i3 == 0) {
                o01 o01Var = new o01();
                this.r = o01Var;
                o01Var.n(i2, this);
                if (z && (b = dx0.b()) != null) {
                    quantityString = b.getString(R.string.playback_shuffle_off);
                    v(quantityString);
                }
                w();
                w.a(Integer.valueOf(this.s));
            }
            if (i3 == 1) {
                ArrayList arrayList = new ArrayList(this.q.size());
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2 < 0 ? 0 : i2;
                if (i4 > this.q.size()) {
                    i4 = this.q.size() - 1;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(Integer.valueOf(i5));
                }
                arrayList.add(Integer.valueOf(i4));
                for (int i6 = i4 + 1; i6 < this.q.size(); i6++) {
                    arrayList2.add(Integer.valueOf(i6));
                }
                Collections.shuffle(arrayList2);
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    arrayList.add((Integer) arrayList2.get(i7));
                }
                if (arrayList.size() > 0) {
                    p01 p01Var = new p01();
                    this.r = p01Var;
                    p01Var.m(i2, arrayList, this);
                    if (z && n() != null) {
                        int size = arrayList2.size();
                        quantityString = n().getQuantityString(R.plurals.x_items_shuffled, size, Integer.valueOf(size));
                        v(quantityString);
                    }
                }
            }
            w();
            w.a(Integer.valueOf(this.s));
        }
    }

    @Override // com.daaw.ce0.a
    public void a(ce0 ce0Var, boolean z, boolean z2) {
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((q01) this.q.p(i)).d(-1);
        }
        int d = ce0Var.d(this.q.size());
        for (int i2 = 0; i2 < d; i2++) {
            int f = ce0Var.f(i2, this.q.size());
            if (f < this.q.size()) {
                ((q01) this.q.p(f)).d(i2);
            }
        }
        w();
        if (z2) {
            B(this.r.i(true), false, false, null);
        }
    }

    public final int b(Collection<tx0> collection, int i, boolean z, be0 be0Var, int i2, boolean z2) {
        int i3;
        int i4;
        boolean z3;
        be0 be0Var2;
        boolean z4;
        l01 l01Var;
        int i5;
        if (z) {
            this.q.clear();
            i = 0;
        }
        if (i > this.q.size()) {
            i = this.q.size();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (int i6 = 0; i6 < collection.size(); i6++) {
            arrayList.add(i6, new q01(i2));
        }
        this.q.h(i, collection, arrayList);
        int size = collection.size();
        if (z) {
            i3 = i + size;
            i4 = 0;
            z3 = false;
            z4 = true;
            l01Var = this;
            i5 = i;
            be0Var2 = be0Var;
        } else {
            i3 = (size + i) - 1;
            i4 = 1;
            z3 = false;
            be0Var2 = null;
            z4 = false;
            l01Var = this;
            i5 = i;
        }
        l01Var.z(i5, i3, i4, z3, be0Var2, z4, z2);
        return i;
    }

    public void d(Collection<tx0> collection, int i, int i2) {
        D(collection, -1, i, null, null, i2, true);
    }

    public final int e(vd0 vd0Var, int i) {
        vd0 vd0Var2;
        if (vd0Var == null) {
            return -1;
        }
        if (i < 0 || i >= this.q.size() || (vd0Var2 = this.q.get(i).b) == null || !vd0Var2.equals(vd0Var)) {
            er0.c<tx0, vd0> r = this.q.r();
            while (r.hasNext()) {
                int nextIndex = r.nextIndex();
                vd0 vd0Var3 = r.next().b;
                if (vd0Var3 != null && vd0Var3.equals(vd0Var)) {
                    return nextIndex;
                }
            }
            return -1;
        }
        return i;
    }

    public lo1<tx0, vd0> k() {
        ce0 ce0Var = this.r;
        int i = ce0Var == null ? 0 : ce0Var.i(true);
        if (i < 0 || i >= this.q.size()) {
            return null;
        }
        return this.q.get(i);
    }

    public er0<tx0, vd0> l() {
        return this.q.v();
    }

    public int m() {
        return this.r.i(true);
    }

    public final Resources n() {
        Context b = dx0.b();
        if (b == null) {
            return null;
        }
        return b.getResources();
    }

    public int o() {
        return this.s;
    }

    public be0 p() {
        return this.p;
    }

    public boolean q() {
        int h = this.r.h(false);
        return h == -1 || h >= this.q.size();
    }

    public void r(int i, int i2, List<Integer> list, int i3) {
        lo1<tx0, vd0>[] lo1VarArr = new lo1[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue = list.get(i4).intValue() + i;
            lo1VarArr[i4] = new lo1<>(this.q.o(intValue), this.q.p(intValue));
            lo1VarArr[i4].b.b(i3);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            this.q.remove(list.get(size).intValue() + i);
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            this.q.add(Math.max(0, Math.min(this.q.size(), list.get(size2).intValue() + i2)), lo1VarArr[size2]);
        }
        A(list, i2, i, false, null);
    }

    public void s(Object obj) {
        B(this.r.i(true), this.r.e(this.q.size()), true, obj);
    }

    public void t() {
        u(null);
    }

    public void u(Object obj) {
        if (q()) {
            G(obj);
        } else {
            s(obj);
        }
    }

    public final void v(String str) {
        vy.a.a(str);
    }

    public final void w() {
        v.a(l(), this.p);
    }

    public void x(Context context) {
        N(context);
    }

    public void y(int i, int i2, int i3, boolean z, be0 be0Var) {
        z(i, i2, i3, z, be0Var, false, true);
    }

    public void z(int i, int i2, int i3, boolean z, be0 be0Var, boolean z2, boolean z3) {
        String quantityString;
        this.p = be0Var;
        if (i > i2) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= this.q.size()) {
            i2 = this.q.size() - 1;
        }
        if (z2) {
            T(0, true);
        }
        this.r.k(i, i2, i3, z, this.q.size());
        if (z || !z3) {
            return;
        }
        int i4 = (i2 - i) + 1;
        if (n() != null) {
            if (i3 == 1) {
                quantityString = n().getQuantityString(R.plurals.x_items_added_to_queue, i4, Integer.valueOf(i4));
            } else if (i3 == -1) {
                quantityString = n().getQuantityString(R.plurals.x_items_removed_from_queue, i4, Integer.valueOf(i4));
            } else if (i3 != 0 || !z2) {
                return;
            } else {
                quantityString = n().getQuantityString(R.plurals.x_items_opened_in_queue, i4, Integer.valueOf(i4));
            }
            vy.a.a(quantityString);
        }
    }
}
