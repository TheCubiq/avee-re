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
    public UUID a;
    public b b;
    public Set<String> c;
    public a d;
    public int e;
    public Executor f;
    public wj1 g;
    public yy1 h;
    public mz0 i;
    public j30 j;

    /* loaded from: classes.dex */
    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i, Executor executor, wj1 wj1Var, yy1 yy1Var, mz0 mz0Var, j30 j30Var) {
        this.a = uuid;
        this.b = bVar;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.f = executor;
        this.g = wj1Var;
        this.h = yy1Var;
        this.i = mz0Var;
        this.j = j30Var;
    }

    public Executor a() {
        return this.f;
    }

    public j30 b() {
        return this.j;
    }

    public UUID c() {
        return this.a;
    }

    public b d() {
        return this.b;
    }

    public Network e() {
        return this.d.c;
    }

    public mz0 f() {
        return this.i;
    }

    public int g() {
        return this.e;
    }

    public Set<String> h() {
        return this.c;
    }

    public wj1 i() {
        return this.g;
    }

    public List<String> j() {
        return this.d.a;
    }

    public List<Uri> k() {
        return this.d.b;
    }

    public yy1 l() {
        return this.h;
    }
}
