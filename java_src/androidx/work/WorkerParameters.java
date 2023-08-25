package androidx.work;

import android.net.Network;
import android.net.Uri;
import com.daaw.j30;
import com.daaw.mz0;
import com.daaw.wj1;
import com.daaw.yy1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    public UUID f2426a;

    /* renamed from: b */
    public C0511b f2427b;

    /* renamed from: c */
    public Set<String> f2428c;

    /* renamed from: d */
    public C0506a f2429d;

    /* renamed from: e */
    public int f2430e;

    /* renamed from: f */
    public Executor f2431f;

    /* renamed from: g */
    public wj1 f2432g;

    /* renamed from: h */
    public yy1 f2433h;

    /* renamed from: i */
    public mz0 f2434i;

    /* renamed from: j */
    public j30 f2435j;

    /* renamed from: androidx.work.WorkerParameters$a */
    /* loaded from: classes.dex */
    public static class C0506a {

        /* renamed from: a */
        public List<String> f2436a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f2437b = Collections.emptyList();

        /* renamed from: c */
        public Network f2438c;
    }

    public WorkerParameters(UUID uuid, C0511b c0511b, Collection<String> collection, C0506a c0506a, int i, Executor executor, wj1 wj1Var, yy1 yy1Var, mz0 mz0Var, j30 j30Var) {
        this.f2426a = uuid;
        this.f2427b = c0511b;
        this.f2428c = new HashSet(collection);
        this.f2429d = c0506a;
        this.f2430e = i;
        this.f2431f = executor;
        this.f2432g = wj1Var;
        this.f2433h = yy1Var;
        this.f2434i = mz0Var;
        this.f2435j = j30Var;
    }

    /* renamed from: a */
    public Executor m27999a() {
        return this.f2431f;
    }

    /* renamed from: b */
    public j30 m27998b() {
        return this.f2435j;
    }

    /* renamed from: c */
    public UUID m27997c() {
        return this.f2426a;
    }

    /* renamed from: d */
    public C0511b m27996d() {
        return this.f2427b;
    }

    /* renamed from: e */
    public Network m27995e() {
        return this.f2429d.f2438c;
    }

    /* renamed from: f */
    public mz0 m27994f() {
        return this.f2434i;
    }

    /* renamed from: g */
    public int m27993g() {
        return this.f2430e;
    }

    /* renamed from: h */
    public Set<String> m27992h() {
        return this.f2428c;
    }

    /* renamed from: i */
    public wj1 m27991i() {
        return this.f2432g;
    }

    /* renamed from: j */
    public List<String> m27990j() {
        return this.f2429d.f2436a;
    }

    /* renamed from: k */
    public List<Uri> m27989k() {
        return this.f2429d.f2437b;
    }

    /* renamed from: l */
    public yy1 m27988l() {
        return this.f2433h;
    }
}
