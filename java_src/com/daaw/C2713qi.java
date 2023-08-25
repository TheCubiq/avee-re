package com.daaw;

import com.daaw.C2713qi;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.daaw.qi */
/* loaded from: classes2.dex */
public class C2713qi implements InterfaceC0842bi, InterfaceC1538hi {

    /* renamed from: h */
    public static final b01<Set<Object>> f23972h = new b01() { // from class: com.daaw.ni
        @Override // com.daaw.b01
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    public final Map<C3330vh<?>, b01<?>> f23973a;

    /* renamed from: b */
    public final Map<i01<?>, b01<?>> f23974b;

    /* renamed from: c */
    public final Map<i01<?>, bj0<?>> f23975c;

    /* renamed from: d */
    public final List<b01<ComponentRegistrar>> f23976d;

    /* renamed from: e */
    public final C3913zx f23977e;

    /* renamed from: f */
    public final AtomicReference<Boolean> f23978f;

    /* renamed from: g */
    public final InterfaceC2040li f23979g;

    /* renamed from: com.daaw.qi$b */
    /* loaded from: classes2.dex */
    public static final class C2715b {

        /* renamed from: a */
        public final Executor f23980a;

        /* renamed from: b */
        public final List<b01<ComponentRegistrar>> f23981b = new ArrayList();

        /* renamed from: c */
        public final List<C3330vh<?>> f23982c = new ArrayList();

        /* renamed from: d */
        public InterfaceC2040li f23983d = InterfaceC2040li.f17420a;

        public C2715b(Executor executor) {
            this.f23980a = executor;
        }

        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m12477f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: b */
        public C2715b m12481b(C3330vh<?> c3330vh) {
            this.f23982c.add(c3330vh);
            return this;
        }

        /* renamed from: c */
        public C2715b m12480c(final ComponentRegistrar componentRegistrar) {
            this.f23981b.add(new b01() { // from class: com.daaw.ri
                @Override // com.daaw.b01
                public final Object get() {
                    ComponentRegistrar m12477f;
                    m12477f = C2713qi.C2715b.m12477f(ComponentRegistrar.this);
                    return m12477f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public C2715b m12479d(Collection<b01<ComponentRegistrar>> collection) {
            this.f23981b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C2713qi m12478e() {
            return new C2713qi(this.f23980a, this.f23981b, this.f23982c, this.f23983d);
        }

        /* renamed from: g */
        public C2715b m12476g(InterfaceC2040li interfaceC2040li) {
            this.f23983d = interfaceC2040li;
            return this;
        }
    }

    public C2713qi(Executor executor, Iterable<b01<ComponentRegistrar>> iterable, Collection<C3330vh<?>> collection, InterfaceC2040li interfaceC2040li) {
        this.f23973a = new HashMap();
        this.f23974b = new HashMap();
        this.f23975c = new HashMap();
        this.f23978f = new AtomicReference<>();
        C3913zx c3913zx = new C3913zx(executor);
        this.f23977e = c3913zx;
        this.f23979g = interfaceC2040li;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3330vh.m7159s(c3913zx, C3913zx.class, sh1.class, e01.class));
        arrayList.add(C3330vh.m7159s(this, InterfaceC1538hi.class, new Class[0]));
        for (C3330vh<?> c3330vh : collection) {
            if (c3330vh != null) {
                arrayList.add(c3330vh);
            }
        }
        this.f23976d = m12490q(iterable);
        m12493n(arrayList);
    }

    /* renamed from: m */
    public static C2715b m12494m(Executor executor) {
        return new C2715b(executor);
    }

    /* renamed from: q */
    public static <T> List<T> m12490q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m12489r(C3330vh c3330vh) {
        return c3330vh.m7170h().mo3451a(new o51(c3330vh, this));
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: a */
    public /* synthetic */ Object mo12506a(Class cls) {
        return C0628ai.m27473b(this, cls);
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: b */
    public synchronized <T> b01<Set<T>> mo12505b(i01<T> i01Var) {
        bj0<?> bj0Var = this.f23975c.get(i01Var);
        if (bj0Var != null) {
            return bj0Var;
        }
        return (b01<Set<T>>) f23972h;
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: c */
    public /* synthetic */ Object mo12504c(i01 i01Var) {
        return C0628ai.m27474a(this, i01Var);
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: d */
    public /* synthetic */ b01 mo12503d(Class cls) {
        return C0628ai.m27471d(this, cls);
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: e */
    public /* synthetic */ Set mo12502e(i01 i01Var) {
        return C0628ai.m27470e(this, i01Var);
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: f */
    public /* synthetic */ Set mo12501f(Class cls) {
        return C0628ai.m27469f(this, cls);
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: g */
    public synchronized <T> b01<T> mo12500g(i01<T> i01Var) {
        sy0.m9733c(i01Var, "Null interface requested.");
        return (b01<T>) this.f23974b.get(i01Var);
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: h */
    public <T> InterfaceC1216es<T> mo12499h(i01<T> i01Var) {
        b01<T> mo12500g = mo12500g(i01Var);
        return mo12500g == null ? wu0.m5789e() : mo12500g instanceof wu0 ? (wu0) mo12500g : wu0.m5785i(mo12500g);
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: i */
    public /* synthetic */ InterfaceC1216es mo12498i(Class cls) {
        return C0628ai.m27472c(this, cls);
    }

    /* renamed from: n */
    public final void m12493n(List<C3330vh<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<b01<ComponentRegistrar>> it = this.f23976d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f23979g.mo16944a(componentRegistrar));
                        it.remove();
                    }
                } catch (yg0 unused) {
                    it.remove();
                }
            }
            if (this.f23973a.isEmpty()) {
                C2959so.m10140a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f23973a.keySet());
                arrayList2.addAll(list);
                C2959so.m10140a(arrayList2);
            }
            for (final C3330vh<?> c3330vh : list) {
                this.f23973a.put(c3330vh, new xi0(new b01() { // from class: com.daaw.mi
                    @Override // com.daaw.b01
                    public final Object get() {
                        Object m12489r;
                        m12489r = C2713qi.this.m12489r(c3330vh);
                        return m12489r;
                    }
                }));
            }
            arrayList.addAll(m12484w(list));
            arrayList.addAll(m12483x());
            m12485v();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m12486u();
    }

    /* renamed from: o */
    public final void m12492o(Map<C3330vh<?>, b01<?>> map, boolean z) {
        for (Map.Entry<C3330vh<?>, b01<?>> entry : map.entrySet()) {
            C3330vh<?> key = entry.getKey();
            b01<?> value = entry.getValue();
            if (key.m7164n() || (key.m7163o() && z)) {
                value.get();
            }
        }
        this.f23977e.m1815c();
    }

    /* renamed from: p */
    public void m12491p(boolean z) {
        HashMap hashMap;
        if (this.f23978f.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f23973a);
            }
            m12492o(hashMap, z);
        }
    }

    /* renamed from: u */
    public final void m12486u() {
        Boolean bool = this.f23978f.get();
        if (bool != null) {
            m12492o(this.f23973a, bool.booleanValue());
        }
    }

    /* renamed from: v */
    public final void m12485v() {
        Map map;
        i01<?> m3356c;
        Object m5789e;
        for (C3330vh<?> c3330vh : this.f23973a.keySet()) {
            for (C3740ys c3740ys : c3330vh.m7171g()) {
                if (c3740ys.m3352g() && !this.f23975c.containsKey(c3740ys.m3356c())) {
                    map = this.f23975c;
                    m3356c = c3740ys.m3356c();
                    m5789e = bj0.m26131b(Collections.emptySet());
                } else if (this.f23974b.containsKey(c3740ys.m3356c())) {
                    continue;
                } else if (c3740ys.m3353f()) {
                    throw new jq0(String.format("Unsatisfied dependency for component %s: %s", c3330vh, c3740ys.m3356c()));
                } else {
                    if (!c3740ys.m3352g()) {
                        map = this.f23974b;
                        m3356c = c3740ys.m3356c();
                        m5789e = wu0.m5789e();
                    }
                }
                map.put(m3356c, m5789e);
            }
        }
    }

    /* renamed from: w */
    public final List<Runnable> m12484w(List<C3330vh<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C3330vh<?> c3330vh : list) {
            if (c3330vh.m7162p()) {
                final b01<?> b01Var = this.f23973a.get(c3330vh);
                for (i01<? super Object> i01Var : c3330vh.m7168j()) {
                    if (this.f23974b.containsKey(i01Var)) {
                        final wu0 wu0Var = (wu0) this.f23974b.get(i01Var);
                        arrayList.add(new Runnable() { // from class: com.daaw.pi
                            @Override // java.lang.Runnable
                            public final void run() {
                                wu0.this.m5784j(b01Var);
                            }
                        });
                    } else {
                        this.f23974b.put(i01Var, b01Var);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    public final List<Runnable> m12483x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C3330vh<?>, b01<?>> entry : this.f23973a.entrySet()) {
            C3330vh<?> key = entry.getKey();
            if (!key.m7162p()) {
                b01<?> value = entry.getValue();
                for (i01<? super Object> i01Var : key.m7168j()) {
                    if (!hashMap.containsKey(i01Var)) {
                        hashMap.put(i01Var, new HashSet());
                    }
                    ((Set) hashMap.get(i01Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f23975c.containsKey(entry2.getKey())) {
                final bj0<?> bj0Var = this.f23975c.get(entry2.getKey());
                for (final b01 b01Var : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.daaw.oi
                        @Override // java.lang.Runnable
                        public final void run() {
                            bj0.this.m26132a(b01Var);
                        }
                    });
                }
            } else {
                this.f23975c.put((i01) entry2.getKey(), bj0.m26131b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }
}
