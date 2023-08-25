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
public class l01 implements zo0, ce0.InterfaceC0949a {

    /* renamed from: t */
    public static vw1<Boolean> f16923t = new vw1<>();

    /* renamed from: u */
    public static uw1<lo1<tx0, vd0>, Integer, Boolean, Boolean, Object> f16924u = new uw1<>();

    /* renamed from: v */
    public static rw1<er0<tx0, vd0>, be0> f16925v = new rw1<>();

    /* renamed from: w */
    public static qw1<Integer> f16926w = new qw1<>();

    /* renamed from: x */
    public static final Object f16927x = new Object();

    /* renamed from: y */
    public static volatile l01 f16928y = null;

    /* renamed from: p */
    public be0 f16929p = null;

    /* renamed from: q */
    public er0<tx0, vd0> f16930q = new er0<>();

    /* renamed from: r */
    public ce0 f16931r = new o01();

    /* renamed from: s */
    public int f16932s = -1;

    public l01() {
        m17253T(0, false);
        m17262K();
    }

    /* renamed from: c */
    public static l01 m17249c() {
        l01 l01Var;
        l01 l01Var2 = f16928y;
        if (l01Var2 != null) {
            return l01Var2;
        }
        synchronized (f16927x) {
            l01Var = f16928y;
            if (l01Var == null) {
                l01Var = new l01();
                f16928y = l01Var;
            }
        }
        return l01Var;
    }

    /* renamed from: f */
    public static int m17246f(int i, List<Integer> list, int i2, int i3, boolean z) {
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

    /* renamed from: g */
    public static int m17245g(int i, int i2, int i3) {
        if (i < i2) {
            return i;
        }
        int i4 = i + i3;
        if (i4 <= i2) {
            return -1;
        }
        return i4;
    }

    /* renamed from: h */
    public static int m17244h(int i, int i2, int i3, int i4, boolean z) {
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

    /* renamed from: i */
    public static int m17243i(int i, List<Integer> list, int i2) {
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

    /* renamed from: j */
    public static int m17242j(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        return m17243i(i, arrayList, i2);
    }

    /* renamed from: A */
    public void m17272A(List<Integer> list, int i, int i2, boolean z, be0 be0Var) {
        this.f16929p = be0Var;
        this.f16931r.mo13785c(list, i, i2, z, this.f16930q.size());
    }

    /* renamed from: B */
    public void m17271B(int i, boolean z, boolean z2, Object obj) {
        f16924u.m7667a((i < 0 || i >= this.f16930q.size()) ? null : this.f16930q.get(i), Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), obj);
    }

    /* renamed from: C */
    public void m17270C(tx0 tx0Var, boolean z, boolean z2, Object obj) {
        f16924u.m7667a(new lo1<>(tx0Var, new q01(-1)), -1, Boolean.valueOf(z), Boolean.valueOf(z2), obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r13 == 3) goto L6;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m17269D(Collection<tx0> collection, int i, int i2, be0 be0Var, Object obj, int i3, boolean z) {
        int i4 = -1;
        if (i2 != -1) {
            if (i2 == 0) {
                i4 = 0;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i4 = this.f16931r.mo13779i(true) + 1;
                    }
                }
                i4 = Integer.MAX_VALUE;
            }
        }
        int m17250b = m17250b(collection, i4, i4 < 0, be0Var, i3, z);
        if (i >= 0) {
            this.f16931r.mo13776l(m17250b + i);
            m17271B(this.f16931r.mo13779i(true), false, true, obj);
        }
    }

    /* renamed from: E */
    public void m17268E(List<tx0> list, int i, int i2, be0 be0Var) {
        m17269D(list, i, i2, be0Var, null, 0, true);
    }

    /* renamed from: F */
    public void m17267F(Object obj) {
        m17271B(this.f16931r.mo13779i(true), false, true, obj);
    }

    /* renamed from: G */
    public void m17266G(Object obj) {
        this.f16931r.mo13778j();
        m17271B(this.f16931r.mo13779i(true), false, true, obj);
    }

    /* renamed from: H */
    public void m17265H() {
        m17264I(null);
    }

    /* renamed from: I */
    public void m17264I(Object obj) {
        this.f16931r.mo13781g();
        m17271B(this.f16931r.mo13779i(true), false, true, obj);
    }

    /* renamed from: J */
    public void m17263J(List<tx0> list, int i, Object obj) {
        if (i < 0 || i >= list.size()) {
            return;
        }
        m17270C(list.get(i), false, true, obj);
    }

    /* renamed from: K */
    public void m17262K() {
        lz1.m16365a("reloadQueue");
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        SharedPreferences m18910p = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18910p(m23837e);
        String m18947P = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18947P(m18910p, "queue", "");
        String m18947P2 = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18947P(m18910p, "queueSizes", "");
        int length = m18947P != null ? m18947P.length() : 0;
        int length2 = m18947P2 != null ? m18947P2.length() : 0;
        this.f16930q.clear();
        if (length > 1 && length2 > 0) {
            String[] split = m18947P2.split(",");
            int length3 = split.length;
            int i = 0;
            int i2 = 0;
            while (i < length3) {
                int m25886w = br1.m25886w(split[i]) + i2;
                this.f16930q.m23274f(new tx0(m18947P.substring(i2, m25886w)), new q01());
                i++;
                i2 = m25886w;
            }
        }
        if (this.f16930q.size() == 0 && f16923t.m6692a(Boolean.FALSE).booleanValue()) {
            List<tx0> m24064b = dr1.m24064b(m23837e, 30);
            lz1.m16365a("getMostRecentTrackListByCount: " + m24064b.size());
            for (tx0 tx0Var : m24064b) {
                this.f16930q.m23274f(tx0Var, new q01());
            }
        }
        this.f16931r.mo13776l(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18950M(m18910p, "curpos", 0));
        int m18950M = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18950M(m18910p, "shufflemode", 0);
        if (m18950M != 1) {
            m18950M = 0;
        }
        m17252U(m18950M, false, true);
        m17227y(0, this.f16930q.size(), 0, false, null);
    }

    /* renamed from: L */
    public void m17261L(int i) {
        ArrayList arrayList = new ArrayList(4);
        er0.C1215c<tx0, vd0> m23265r = this.f16930q.m23265r();
        while (m23265r.hasNext()) {
            int nextIndex = m23265r.nextIndex();
            if (i == m23265r.next().f17577b.mo7245c()) {
                arrayList.add(Integer.valueOf(nextIndex));
                m23265r.remove();
            }
        }
        m17272A(arrayList, -1, 0, false, null);
    }

    /* renamed from: M */
    public void m17260M(List<vd0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (vd0 vd0Var : list) {
            er0.C1215c<tx0, vd0> m23265r = this.f16930q.m23265r();
            while (m23265r.hasNext()) {
                int nextIndex = m23265r.nextIndex();
                if (vd0Var.equals(m23265r.next().f17577b)) {
                    arrayList.add(Integer.valueOf(nextIndex));
                    m23265r.remove();
                }
            }
        }
        m17272A(arrayList, -1, 0, false, null);
    }

    /* renamed from: N */
    public final void m17259N(Context context) {
        SharedPreferences.Editor edit = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18910p(context).edit();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int size = this.f16930q.size();
        for (int i = 0; i < size; i++) {
            String m8745g = this.f16930q.m23268o(i).m8745g();
            if (m8745g != null) {
                sb.append(m8745g);
                sb2.append(m8745g.length());
                sb2.append(',');
            }
        }
        edit.putString("queue", sb.toString());
        edit.putString("queueSizes", sb2.toString());
        edit.putInt("curpos", this.f16931r.mo13787a());
        edit.putInt("shufflemode", this.f16932s);
        edit.apply();
    }

    /* renamed from: O */
    public void m17258O(vd0 vd0Var) {
        m17257P(vd0Var, null);
    }

    /* renamed from: P */
    public void m17257P(vd0 vd0Var, Object obj) {
        if (vd0Var == null) {
            return;
        }
        m17254S(m17247e(vd0Var, vd0Var.mo7247a()), obj);
    }

    /* renamed from: Q */
    public void m17256Q(vd0 vd0Var, int i) {
        if (vd0Var == null || vd0Var.mo7245c() == i) {
            return;
        }
        vd0Var.mo7246b(i);
        m17229w();
    }

    /* renamed from: R */
    public void m17255R(int i) {
        m17254S(i, null);
    }

    /* renamed from: S */
    public void m17254S(int i, Object obj) {
        this.f16931r.mo13786b(i);
        m17271B(i, false, true, obj);
    }

    /* renamed from: T */
    public void m17253T(int i, boolean z) {
        m17252U(i, z, false);
    }

    /* renamed from: U */
    public void m17252U(int i, boolean z, boolean z2) {
        String quantityString;
        Context m23840b;
        if (z2 || this.f16932s != i) {
            this.f16932s = i;
            ce0 ce0Var = this.f16931r;
            int mo13779i = ce0Var == null ? 0 : ce0Var.mo13779i(true);
            int i2 = this.f16932s;
            if (i2 == 0) {
                o01 o01Var = new o01();
                this.f16931r = o01Var;
                o01Var.m14659n(mo13779i, this);
                if (z && (m23840b = dx0.m23840b()) != null) {
                    quantityString = m23840b.getString(R.string.playback_shuffle_off);
                    m17230v(quantityString);
                }
                m17229w();
                f16926w.m12018a(Integer.valueOf(this.f16932s));
            }
            if (i2 == 1) {
                ArrayList arrayList = new ArrayList(this.f16930q.size());
                ArrayList arrayList2 = new ArrayList();
                int i3 = mo13779i < 0 ? 0 : mo13779i;
                if (i3 > this.f16930q.size()) {
                    i3 = this.f16930q.size() - 1;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList.add(Integer.valueOf(i4));
                }
                arrayList.add(Integer.valueOf(i3));
                for (int i5 = i3 + 1; i5 < this.f16930q.size(); i5++) {
                    arrayList2.add(Integer.valueOf(i5));
                }
                Collections.shuffle(arrayList2);
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    arrayList.add((Integer) arrayList2.get(i6));
                }
                if (arrayList.size() > 0) {
                    p01 p01Var = new p01();
                    this.f16931r = p01Var;
                    p01Var.m13775m(mo13779i, arrayList, this);
                    if (z && m17238n() != null) {
                        int size = arrayList2.size();
                        quantityString = m17238n().getQuantityString(R.plurals.x_items_shuffled, size, Integer.valueOf(size));
                        m17230v(quantityString);
                    }
                }
            }
            m17229w();
            f16926w.m12018a(Integer.valueOf(this.f16932s));
        }
    }

    @Override // com.daaw.ce0.InterfaceC0949a
    /* renamed from: a */
    public void mo17251a(ce0 ce0Var, boolean z, boolean z2) {
        int size = this.f16930q.size();
        for (int i = 0; i < size; i++) {
            ((q01) this.f16930q.m23267p(i)).m12810d(-1);
        }
        int mo13784d = ce0Var.mo13784d(this.f16930q.size());
        for (int i2 = 0; i2 < mo13784d; i2++) {
            int mo13782f = ce0Var.mo13782f(i2, this.f16930q.size());
            if (mo13782f < this.f16930q.size()) {
                ((q01) this.f16930q.m23267p(mo13782f)).m12810d(i2);
            }
        }
        m17229w();
        if (z2) {
            m17271B(this.f16931r.mo13779i(true), false, false, null);
        }
    }

    /* renamed from: b */
    public final int m17250b(Collection<tx0> collection, int i, boolean z, be0 be0Var, int i2, boolean z2) {
        int i3;
        int i4;
        boolean z3;
        be0 be0Var2;
        boolean z4;
        l01 l01Var;
        int i5;
        if (z) {
            this.f16930q.clear();
            i = 0;
        }
        if (i > this.f16930q.size()) {
            i = this.f16930q.size();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (int i6 = 0; i6 < collection.size(); i6++) {
            arrayList.add(i6, new q01(i2));
        }
        this.f16930q.m23273h(i, collection, arrayList);
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
        l01Var.m17226z(i5, i3, i4, z3, be0Var2, z4, z2);
        return i;
    }

    /* renamed from: d */
    public void m17248d(Collection<tx0> collection, int i, int i2) {
        m17269D(collection, -1, i, null, null, i2, true);
    }

    /* renamed from: e */
    public final int m17247e(vd0 vd0Var, int i) {
        vd0 vd0Var2;
        if (vd0Var == null) {
            return -1;
        }
        if (i < 0 || i >= this.f16930q.size() || (vd0Var2 = this.f16930q.get(i).f17577b) == null || !vd0Var2.equals(vd0Var)) {
            er0.C1215c<tx0, vd0> m23265r = this.f16930q.m23265r();
            while (m23265r.hasNext()) {
                int nextIndex = m23265r.nextIndex();
                vd0 vd0Var3 = m23265r.next().f17577b;
                if (vd0Var3 != null && vd0Var3.equals(vd0Var)) {
                    return nextIndex;
                }
            }
            return -1;
        }
        return i;
    }

    /* renamed from: k */
    public lo1<tx0, vd0> m17241k() {
        ce0 ce0Var = this.f16931r;
        int mo13779i = ce0Var == null ? 0 : ce0Var.mo13779i(true);
        if (mo13779i < 0 || mo13779i >= this.f16930q.size()) {
            return null;
        }
        return this.f16930q.get(mo13779i);
    }

    /* renamed from: l */
    public er0<tx0, vd0> m17240l() {
        return this.f16930q.m23261v();
    }

    /* renamed from: m */
    public int m17239m() {
        return this.f16931r.mo13779i(true);
    }

    /* renamed from: n */
    public final Resources m17238n() {
        Context m23840b = dx0.m23840b();
        if (m23840b == null) {
            return null;
        }
        return m23840b.getResources();
    }

    /* renamed from: o */
    public int m17237o() {
        return this.f16932s;
    }

    /* renamed from: p */
    public be0 m17236p() {
        return this.f16929p;
    }

    /* renamed from: q */
    public boolean m17235q() {
        int mo13780h = this.f16931r.mo13780h(false);
        return mo13780h == -1 || mo13780h >= this.f16930q.size();
    }

    /* renamed from: r */
    public void m17234r(int i, int i2, List<Integer> list, int i3) {
        lo1<tx0, vd0>[] lo1VarArr = new lo1[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue = list.get(i4).intValue() + i;
            lo1VarArr[i4] = new lo1<>(this.f16930q.m23268o(intValue), this.f16930q.m23267p(intValue));
            lo1VarArr[i4].f17577b.mo7246b(i3);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f16930q.remove(list.get(size).intValue() + i);
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            this.f16930q.add(Math.max(0, Math.min(this.f16930q.size(), list.get(size2).intValue() + i2)), lo1VarArr[size2]);
        }
        m17272A(list, i2, i, false, null);
    }

    /* renamed from: s */
    public void m17233s(Object obj) {
        m17271B(this.f16931r.mo13779i(true), this.f16931r.mo13783e(this.f16930q.size()), true, obj);
    }

    /* renamed from: t */
    public void m17232t() {
        m17231u(null);
    }

    /* renamed from: u */
    public void m17231u(Object obj) {
        if (m17235q()) {
            m17266G(obj);
        } else {
            m17233s(obj);
        }
    }

    /* renamed from: v */
    public final void m17230v(String str) {
        C3385vy.f30703a.m12018a(str);
    }

    /* renamed from: w */
    public final void m17229w() {
        f16925v.m10862a(m17240l(), this.f16929p);
    }

    /* renamed from: x */
    public void m17228x(Context context) {
        m17259N(context);
    }

    /* renamed from: y */
    public void m17227y(int i, int i2, int i3, boolean z, be0 be0Var) {
        m17226z(i, i2, i3, z, be0Var, false, true);
    }

    /* renamed from: z */
    public void m17226z(int i, int i2, int i3, boolean z, be0 be0Var, boolean z2, boolean z3) {
        String quantityString;
        this.f16929p = be0Var;
        if (i > i2) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= this.f16930q.size()) {
            i2 = this.f16930q.size() - 1;
        }
        if (z2) {
            m17253T(0, true);
        }
        this.f16931r.mo13777k(i, i2, i3, z, this.f16930q.size());
        if (z || !z3) {
            return;
        }
        int i4 = (i2 - i) + 1;
        if (m17238n() != null) {
            if (i3 == 1) {
                quantityString = m17238n().getQuantityString(R.plurals.x_items_added_to_queue, i4, Integer.valueOf(i4));
            } else if (i3 == -1) {
                quantityString = m17238n().getQuantityString(R.plurals.x_items_removed_from_queue, i4, Integer.valueOf(i4));
            } else if (i3 != 0 || !z2) {
                return;
            } else {
                quantityString = m17238n().getQuantityString(R.plurals.x_items_opened_in_queue, i4, Integer.valueOf(i4));
            }
            C3385vy.f30703a.m12018a(quantityString);
        }
    }
}
