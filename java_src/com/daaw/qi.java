package com.daaw;

import com.daaw.qi;
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
/* loaded from: classes2.dex */
public class qi implements bi, hi {
    public static final b01<Set<Object>> h = new b01() { // from class: com.daaw.ni
        @Override // com.daaw.b01
        public final Object get() {
            return Collections.emptySet();
        }
    };
    public final Map<vh<?>, b01<?>> a;
    public final Map<i01<?>, b01<?>> b;
    public final Map<i01<?>, bj0<?>> c;
    public final List<b01<ComponentRegistrar>> d;
    public final zx e;
    public final AtomicReference<Boolean> f;
    public final li g;

    /* loaded from: classes2.dex */
    public static final class b {
        public final Executor a;
        public final List<b01<ComponentRegistrar>> b = new ArrayList();
        public final List<vh<?>> c = new ArrayList();
        public li d = li.a;

        public b(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(vh<?> vhVar) {
            this.c.add(vhVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new b01() { // from class: com.daaw.ri
                @Override // com.daaw.b01
                public final Object get() {
                    ComponentRegistrar f;
                    f = qi.b.f(ComponentRegistrar.this);
                    return f;
                }
            });
            return this;
        }

        public b d(Collection<b01<ComponentRegistrar>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public qi e() {
            return new qi(this.a, this.b, this.c, this.d);
        }

        public b g(li liVar) {
            this.d = liVar;
            return this;
        }
    }

    public qi(Executor executor, Iterable<b01<ComponentRegistrar>> iterable, Collection<vh<?>> collection, li liVar) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.f = new AtomicReference<>();
        zx zxVar = new zx(executor);
        this.e = zxVar;
        this.g = liVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vh.s(zxVar, zx.class, sh1.class, e01.class));
        arrayList.add(vh.s(this, hi.class, new Class[0]));
        for (vh<?> vhVar : collection) {
            if (vhVar != null) {
                arrayList.add(vhVar);
            }
        }
        this.d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    public static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(vh vhVar) {
        return vhVar.h().a(new o51(vhVar, this));
    }

    @Override // com.daaw.bi
    public /* synthetic */ Object a(Class cls) {
        return ai.b(this, cls);
    }

    @Override // com.daaw.bi
    public synchronized <T> b01<Set<T>> b(i01<T> i01Var) {
        bj0<?> bj0Var = this.c.get(i01Var);
        if (bj0Var != null) {
            return bj0Var;
        }
        return (b01<Set<T>>) h;
    }

    @Override // com.daaw.bi
    public /* synthetic */ Object c(i01 i01Var) {
        return ai.a(this, i01Var);
    }

    @Override // com.daaw.bi
    public /* synthetic */ b01 d(Class cls) {
        return ai.d(this, cls);
    }

    @Override // com.daaw.bi
    public /* synthetic */ Set e(i01 i01Var) {
        return ai.e(this, i01Var);
    }

    @Override // com.daaw.bi
    public /* synthetic */ Set f(Class cls) {
        return ai.f(this, cls);
    }

    @Override // com.daaw.bi
    public synchronized <T> b01<T> g(i01<T> i01Var) {
        sy0.c(i01Var, "Null interface requested.");
        return (b01<T>) this.b.get(i01Var);
    }

    @Override // com.daaw.bi
    public <T> es<T> h(i01<T> i01Var) {
        b01<T> g = g(i01Var);
        return g == null ? wu0.e() : g instanceof wu0 ? (wu0) g : wu0.i(g);
    }

    @Override // com.daaw.bi
    public /* synthetic */ es i(Class cls) {
        return ai.c(this, cls);
    }

    public final void n(List<vh<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<b01<ComponentRegistrar>> it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (yg0 unused) {
                    it.remove();
                }
            }
            if (this.a.isEmpty()) {
                so.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                so.a(arrayList2);
            }
            for (final vh<?> vhVar : list) {
                this.a.put(vhVar, new xi0(new b01() { // from class: com.daaw.mi
                    @Override // com.daaw.b01
                    public final Object get() {
                        Object r;
                        r = qi.this.r(vhVar);
                        return r;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        u();
    }

    public final void o(Map<vh<?>, b01<?>> map, boolean z) {
        for (Map.Entry<vh<?>, b01<?>> entry : map.entrySet()) {
            vh<?> key = entry.getKey();
            b01<?> value = entry.getValue();
            if (key.n() || (key.o() && z)) {
                value.get();
            }
        }
        this.e.c();
    }

    public void p(boolean z) {
        HashMap hashMap;
        if (this.f.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.a);
            }
            o(hashMap, z);
        }
    }

    public final void u() {
        Boolean bool = this.f.get();
        if (bool != null) {
            o(this.a, bool.booleanValue());
        }
    }

    public final void v() {
        Map map;
        i01<?> c;
        Object e;
        for (vh<?> vhVar : this.a.keySet()) {
            for (ys ysVar : vhVar.g()) {
                if (ysVar.g() && !this.c.containsKey(ysVar.c())) {
                    map = this.c;
                    c = ysVar.c();
                    e = bj0.b(Collections.emptySet());
                } else if (this.b.containsKey(ysVar.c())) {
                    continue;
                } else if (ysVar.f()) {
                    throw new jq0(String.format("Unsatisfied dependency for component %s: %s", vhVar, ysVar.c()));
                } else {
                    if (!ysVar.g()) {
                        map = this.b;
                        c = ysVar.c();
                        e = wu0.e();
                    }
                }
                map.put(c, e);
            }
        }
    }

    public final List<Runnable> w(List<vh<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (vh<?> vhVar : list) {
            if (vhVar.p()) {
                final b01<?> b01Var = this.a.get(vhVar);
                for (i01<? super Object> i01Var : vhVar.j()) {
                    if (this.b.containsKey(i01Var)) {
                        final wu0 wu0Var = (wu0) this.b.get(i01Var);
                        arrayList.add(new Runnable() { // from class: com.daaw.pi
                            @Override // java.lang.Runnable
                            public final void run() {
                                wu0.this.j(b01Var);
                            }
                        });
                    } else {
                        this.b.put(i01Var, b01Var);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<vh<?>, b01<?>> entry : this.a.entrySet()) {
            vh<?> key = entry.getKey();
            if (!key.p()) {
                b01<?> value = entry.getValue();
                for (i01<? super Object> i01Var : key.j()) {
                    if (!hashMap.containsKey(i01Var)) {
                        hashMap.put(i01Var, new HashSet());
                    }
                    ((Set) hashMap.get(i01Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.c.containsKey(entry2.getKey())) {
                final bj0<?> bj0Var = this.c.get(entry2.getKey());
                for (final b01 b01Var : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.daaw.oi
                        @Override // java.lang.Runnable
                        public final void run() {
                            bj0.this.a(b01Var);
                        }
                    });
                }
            } else {
                this.c.put((i01) entry2.getKey(), bj0.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }
}
