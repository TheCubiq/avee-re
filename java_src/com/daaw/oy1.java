package com.daaw;

import android.os.Build;
import androidx.work.C0511b;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class oy1 {

    /* renamed from: a */
    public UUID f22103a;

    /* renamed from: b */
    public qy1 f22104b;

    /* renamed from: c */
    public Set<String> f22105c;

    /* renamed from: com.daaw.oy1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2494a<B extends AbstractC2494a<?, ?>, W extends oy1> {

        /* renamed from: c */
        public qy1 f22108c;

        /* renamed from: e */
        public Class<? extends ListenableWorker> f22110e;

        /* renamed from: a */
        public boolean f22106a = false;

        /* renamed from: d */
        public Set<String> f22109d = new HashSet();

        /* renamed from: b */
        public UUID f22107b = UUID.randomUUID();

        public AbstractC2494a(Class<? extends ListenableWorker> cls) {
            this.f22110e = cls;
            this.f22108c = new qy1(this.f22107b.toString(), cls.getName());
            m13867a(cls.getName());
        }

        /* renamed from: a */
        public final B m13867a(String str) {
            this.f22109d.add(str);
            return mo13864d();
        }

        /* renamed from: b */
        public final W m13866b() {
            W mo13865c = mo13865c();
            C2943sj c2943sj = this.f22108c.f24633j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && c2943sj.m10319e()) || c2943sj.m10318f() || c2943sj.m10317g() || (i >= 23 && c2943sj.m10316h());
            if (this.f22108c.f24640q && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f22107b = UUID.randomUUID();
            qy1 qy1Var = new qy1(this.f22108c);
            this.f22108c = qy1Var;
            qy1Var.f24624a = this.f22107b.toString();
            return mo13865c;
        }

        /* renamed from: c */
        public abstract W mo13865c();

        /* renamed from: d */
        public abstract B mo13864d();

        /* renamed from: e */
        public final B m13863e(C2943sj c2943sj) {
            this.f22108c.f24633j = c2943sj;
            return mo13864d();
        }

        /* renamed from: f */
        public final B m13862f(C0511b c0511b) {
            this.f22108c.f24628e = c0511b;
            return mo13864d();
        }
    }

    public oy1(UUID uuid, qy1 qy1Var, Set<String> set) {
        this.f22103a = uuid;
        this.f22104b = qy1Var;
        this.f22105c = set;
    }

    /* renamed from: a */
    public String m13870a() {
        return this.f22103a.toString();
    }

    /* renamed from: b */
    public Set<String> m13869b() {
        return this.f22105c;
    }

    /* renamed from: c */
    public qy1 m13868c() {
        return this.f22104b;
    }
}
