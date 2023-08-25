package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class gh0 {

    /* renamed from: a */
    public static vw1<be0> f11244a = new vw1<>();

    /* renamed from: b */
    public static vw1<er0<tx0, vd0>> f11245b = new vw1<>();

    /* renamed from: c */
    public static rw1<C0645al, List<C1408d>> f11246c = new rw1<>();

    /* renamed from: d */
    public static rw1<C0645al, Collection<tx0>> f11247d = new rw1<>();

    /* renamed from: e */
    public static qw1<Integer> f11248e = new qw1<>();

    /* renamed from: f */
    public static rw1<Collection<tx0>, Integer> f11249f = new rw1<>();

    /* renamed from: g */
    public static sw1<List<tx0>, Integer, be0> f11250g = new sw1<>();

    /* renamed from: h */
    public static tw1<Context, List<tx0>, Boolean, C0645al> f11251h = new tw1<>();

    /* renamed from: com.daaw.gh0$a */
    /* loaded from: classes.dex */
    public static class C1402a extends ch0 {

        /* renamed from: g */
        public static ch0 f11252g = new C1402a();

        /* renamed from: com.daaw.gh0$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1403a extends AbstractC2004l0 {
            public AbstractC1403a() {
                super(C1402a.f11252g);
            }

            /* renamed from: c */
            public abstract void mo2227c(Context context, Object obj, List<tx0> list);
        }

        public C1402a() {
            super(3, true, R.drawable.ic_playlist4, R.string.libItemAction_enqueueAll);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1403a) list2.get(i)).mo2227c(c0645al.m27377b(), list.get(i), arrayList);
            }
            gh0.f11249f.m10862a(arrayList, 3);
        }
    }

    /* renamed from: com.daaw.gh0$b */
    /* loaded from: classes.dex */
    public static class C1404b extends ch0 {

        /* renamed from: g */
        public static ch0 f11253g = new C1404b();

        /* renamed from: com.daaw.gh0$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1405a extends AbstractC2004l0 {
            public AbstractC1405a() {
                super(C1404b.f11253g);
            }

            /* renamed from: c */
            public abstract void mo2216c(Context context, Object obj, List<tx0> list);
        }

        public C1404b() {
            super(3, true, R.drawable.ic_playlist4, R.string.libItemAction_enqueue);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1405a) list2.get(i)).mo2216c(c0645al.m27377b(), list.get(i), arrayList);
            }
            gh0.f11249f.m10862a(arrayList, 3);
        }
    }

    /* renamed from: com.daaw.gh0$c */
    /* loaded from: classes.dex */
    public static class C1406c extends ch0 {

        /* renamed from: g */
        public static ch0 f11254g = new C1406c();

        /* renamed from: com.daaw.gh0$c$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1407a extends AbstractC2004l0 {
            public AbstractC1407a() {
                super(C1406c.f11254g);
            }

            /* renamed from: c */
            public abstract void mo2221c(Context context, Object obj, List<tx0> list);
        }

        public C1406c() {
            super(3, true, R.drawable.ic_playlist4, R.string.libItemAction_enqueueNext);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1407a) list2.get(i)).mo2221c(c0645al.m27377b(), list.get(i), arrayList);
            }
            gh0.f11249f.m10862a(arrayList, 2);
        }
    }

    /* renamed from: com.daaw.gh0$d */
    /* loaded from: classes.dex */
    public static class C1408d {

        /* renamed from: a */
        public tx0 f11255a;

        public C1408d(tx0 tx0Var) {
            this.f11255a = tx0Var;
        }

        /* renamed from: a */
        public tx0 m21635a() {
            return this.f11255a;
        }
    }

    /* renamed from: com.daaw.gh0$e */
    /* loaded from: classes.dex */
    public static class C1409e extends ch0 {

        /* renamed from: g */
        public static ch0 f11256g = new C1409e();

        /* renamed from: com.daaw.gh0$e$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1410a extends AbstractC2004l0 {
            public AbstractC1410a() {
                super(C1409e.f11256g);
            }

            /* renamed from: c */
            public abstract mo1<Integer, be0, Boolean> mo2218c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var);
        }

        public C1409e() {
            super(2, false, true, R.drawable.ic_playlist4, R.string.libItemAction_playAll, true);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            be0 be0Var = null;
            be0 m6692a = gh0.f11244a.m6692a(null);
            er0<tx0, vd0> m6692a2 = gh0.f11245b.m6692a(new er0<>());
            boolean z = false;
            be0 be0Var2 = null;
            boolean z2 = false;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                mo1<Integer, be0, Boolean> mo2218c = ((AbstractC1410a) list2.get(i2)).mo2218c(c0645al.m27377b(), list.get(i2), arrayList, m6692a, m6692a2);
                i = mo2218c.f19022a.intValue();
                be0Var2 = mo2218c.f19023b;
                z2 = mo2218c.f19024c.booleanValue();
            }
            if (list.size() > 1) {
                i = 0;
            } else {
                z = z2;
                be0Var = be0Var2;
            }
            if (z) {
                gh0.f11248e.m12018a(Integer.valueOf(i));
            } else {
                gh0.f11250g.m9795a(arrayList, Integer.valueOf(i), be0Var);
            }
        }
    }

    /* renamed from: com.daaw.gh0$f */
    /* loaded from: classes.dex */
    public static class C1411f extends ch0 {

        /* renamed from: g */
        public static ch0 f11257g = new C1411f();

        /* renamed from: com.daaw.gh0$f$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1412a extends AbstractC2004l0 {
            public AbstractC1412a() {
                super(C1411f.f11257g);
            }

            /* renamed from: c */
            public abstract void mo2217c(Context context, Object obj, List<tx0> list);
        }

        public C1411f() {
            super(2, true, false, R.drawable.ic_playlist4, R.string.libItemAction_playAllMulti, true);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1412a) list2.get(i)).mo2217c(c0645al.m27377b(), list.get(i), arrayList);
            }
            gh0.f11250g.m9795a(arrayList, 0, null);
        }
    }

    /* renamed from: com.daaw.gh0$g */
    /* loaded from: classes.dex */
    public static class C1413g extends ch0 {

        /* renamed from: g */
        public static ch0 f11258g = new C1413g();

        /* renamed from: com.daaw.gh0$g$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1414a extends AbstractC2004l0 {
            public AbstractC1414a() {
                super(C1413g.f11258g);
            }

            /* renamed from: c */
            public abstract void mo2222c(Context context, Object obj, List<tx0> list);
        }

        public C1413g() {
            super(1, false, true, R.drawable.ic_playlist4, R.string.libItemAction_play, true);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1414a) list2.get(i)).mo2222c(c0645al.m27377b(), list.get(i), arrayList);
            }
            gh0.f11250g.m9795a(arrayList, 0, null);
        }
    }

    /* renamed from: com.daaw.gh0$h */
    /* loaded from: classes.dex */
    public static class C1415h extends ch0 {

        /* renamed from: g */
        public static ch0 f11259g = new C1415h();

        /* renamed from: com.daaw.gh0$h$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1416a extends AbstractC2004l0 {
            public AbstractC1416a() {
                super(C1415h.f11259g);
            }

            /* renamed from: c */
            public abstract void mo2220c(Context context, Object obj, List<tx0> list);
        }

        public C1415h() {
            super(4, true, R.drawable.ic_add2, R.string.libItemAction_sendTo);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1416a) list2.get(i)).mo2220c(c0645al.m27377b(), list.get(i), arrayList);
            }
            gh0.f11251h.m8756a(c0645al.m27377b(), arrayList, Boolean.FALSE, c0645al);
        }
    }

    /* renamed from: com.daaw.gh0$i */
    /* loaded from: classes.dex */
    public static class C1417i extends ch0 {

        /* renamed from: g */
        public static ch0 f11260g = new C1417i();

        /* renamed from: com.daaw.gh0$i$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1418a extends AbstractC2004l0 {
            public AbstractC1418a() {
                super(C1417i.f11260g);
            }

            /* renamed from: c */
            public abstract void mo2228c(Context context, Object obj, List<tx0> list);
        }

        public C1417i() {
            super(7, false, true, R.drawable.ic_gear, R.string.libItemAction_setAsRingtone);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1418a) list2.get(i)).mo2228c(c0645al.m27377b(), list.get(i), arrayList);
            }
            gh0.f11247d.m10862a(c0645al, arrayList);
        }
    }

    /* renamed from: com.daaw.gh0$j */
    /* loaded from: classes.dex */
    public static class C1419j extends ch0 {

        /* renamed from: g */
        public static ch0 f11261g = new C1419j();

        /* renamed from: com.daaw.gh0$j$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1420a extends AbstractC2004l0 {
            public AbstractC1420a() {
                super(C1419j.f11261g);
            }

            /* renamed from: c */
            public abstract C1408d mo2229c(Context context, Object obj);
        }

        public C1419j() {
            super(6, false, true, R.drawable.ic_gear, R.string.libItemAction_details);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(((AbstractC1420a) list2.get(i)).mo2229c(c0645al.m27377b(), list.get(i)));
            }
            gh0.f11246c.m10862a(c0645al, arrayList);
        }
    }
}
