package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class gh0 {
    public static vw1<be0> a = new vw1<>();
    public static vw1<er0<tx0, vd0>> b = new vw1<>();
    public static rw1<al, List<d>> c = new rw1<>();
    public static rw1<al, Collection<tx0>> d = new rw1<>();
    public static qw1<Integer> e = new qw1<>();
    public static rw1<Collection<tx0>, Integer> f = new rw1<>();
    public static sw1<List<tx0>, Integer, be0> g = new sw1<>();
    public static tw1<Context, List<tx0>, Boolean, al> h = new tw1<>();

    /* loaded from: classes.dex */
    public static class a extends ch0 {
        public static ch0 g = new a();

        /* renamed from: com.daaw.gh0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0051a extends l0 {
            public AbstractC0051a() {
                super(a.g);
            }

            public abstract void c(Context context, Object obj, List<tx0> list);
        }

        public a() {
            super(3, true, R.drawable.ic_playlist4, R.string.libItemAction_enqueueAll);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0051a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            gh0.f.a(arrayList, 3);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ch0 {
        public static ch0 g = new b();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(b.g);
            }

            public abstract void c(Context context, Object obj, List<tx0> list);
        }

        public b() {
            super(3, true, R.drawable.ic_playlist4, R.string.libItemAction_enqueue);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            gh0.f.a(arrayList, 3);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ch0 {
        public static ch0 g = new c();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(c.g);
            }

            public abstract void c(Context context, Object obj, List<tx0> list);
        }

        public c() {
            super(3, true, R.drawable.ic_playlist4, R.string.libItemAction_enqueueNext);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            gh0.f.a(arrayList, 2);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public tx0 a;

        public d(tx0 tx0Var) {
            this.a = tx0Var;
        }

        public tx0 a() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends ch0 {
        public static ch0 g = new e();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(e.g);
            }

            public abstract mo1<Integer, be0, Boolean> c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var);
        }

        public e() {
            super(2, false, true, R.drawable.ic_playlist4, R.string.libItemAction_playAll, true);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            be0 be0Var = null;
            be0 a2 = gh0.a.a(null);
            er0<tx0, vd0> a3 = gh0.b.a(new er0<>());
            boolean z = false;
            be0 be0Var2 = null;
            boolean z2 = false;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                mo1<Integer, be0, Boolean> c = ((a) list2.get(i2)).c(alVar.b(), list.get(i2), arrayList, a2, a3);
                i = c.a.intValue();
                be0Var2 = c.b;
                z2 = c.c.booleanValue();
            }
            if (list.size() > 1) {
                i = 0;
            } else {
                z = z2;
                be0Var = be0Var2;
            }
            if (z) {
                gh0.e.a(Integer.valueOf(i));
            } else {
                gh0.g.a(arrayList, Integer.valueOf(i), be0Var);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ch0 {
        public static ch0 g = new f();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(f.g);
            }

            public abstract void c(Context context, Object obj, List<tx0> list);
        }

        public f() {
            super(2, true, false, R.drawable.ic_playlist4, R.string.libItemAction_playAllMulti, true);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            gh0.g.a(arrayList, 0, null);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends ch0 {
        public static ch0 g = new g();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(g.g);
            }

            public abstract void c(Context context, Object obj, List<tx0> list);
        }

        public g() {
            super(1, false, true, R.drawable.ic_playlist4, R.string.libItemAction_play, true);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            gh0.g.a(arrayList, 0, null);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends ch0 {
        public static ch0 g = new h();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(h.g);
            }

            public abstract void c(Context context, Object obj, List<tx0> list);
        }

        public h() {
            super(4, true, R.drawable.ic_add2, R.string.libItemAction_sendTo);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            gh0.h.a(alVar.b(), arrayList, Boolean.FALSE, alVar);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends ch0 {
        public static ch0 g = new i();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(i.g);
            }

            public abstract void c(Context context, Object obj, List<tx0> list);
        }

        public i() {
            super(7, false, true, R.drawable.ic_gear, R.string.libItemAction_setAsRingtone);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            gh0.d.a(alVar, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends ch0 {
        public static ch0 g = new j();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(j.g);
            }

            public abstract d c(Context context, Object obj);
        }

        public j() {
            super(6, false, true, R.drawable.ic_gear, R.string.libItemAction_details);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(((a) list2.get(i)).c(alVar.b(), list.get(i)));
            }
            gh0.c.a(alVar, arrayList);
        }
    }
}
