package com.daaw;

import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class oy1 {
    public UUID a;
    public qy1 b;
    public Set<String> c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends oy1> {
        public qy1 c;
        public Class<? extends ListenableWorker> e;
        public boolean a = false;
        public Set<String> d = new HashSet();
        public UUID b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.e = cls;
            this.c = new qy1(this.b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.d.add(str);
            return d();
        }

        public final W b() {
            W c = c();
            sj sjVar = this.c.j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && sjVar.e()) || sjVar.f() || sjVar.g() || (i >= 23 && sjVar.h());
            if (this.c.q && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.b = UUID.randomUUID();
            qy1 qy1Var = new qy1(this.c);
            this.c = qy1Var;
            qy1Var.a = this.b.toString();
            return c;
        }

        public abstract W c();

        public abstract B d();

        public final B e(sj sjVar) {
            this.c.j = sjVar;
            return d();
        }

        public final B f(androidx.work.b bVar) {
            this.c.e = bVar;
            return d();
        }
    }

    public oy1(UUID uuid, qy1 qy1Var, Set<String> set) {
        this.a = uuid;
        this.b = qy1Var;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }

    public Set<String> b() {
        return this.c;
    }

    public qy1 c() {
        return this.b;
    }
}
