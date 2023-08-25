package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import com.daaw.fk0;
import com.daaw.g30;
import com.daaw.sb1;
import com.daaw.wj1;
import com.daaw.yy1;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context p;
    public WorkerParameters q;
    public volatile boolean r;
    public boolean s;
    public boolean t;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0031a extends a {
            public final androidx.work.b a;

            public C0031a() {
                this(androidx.work.b.c);
            }

            public C0031a(androidx.work.b bVar) {
                this.a = bVar;
            }

            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0031a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0031a) obj).a);
            }

            public int hashCode() {
                return (C0031a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            public final androidx.work.b a;

            public c() {
                this(androidx.work.b.c);
            }

            public c(androidx.work.b bVar) {
                this.a = bVar;
            }

            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }
        }

        public static a a() {
            return new C0031a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.p = context;
        this.q = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.p;
    }

    public Executor getBackgroundExecutor() {
        return this.q.a();
    }

    public fk0<g30> getForegroundInfoAsync() {
        sb1 u = sb1.u();
        u.r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u;
    }

    public final UUID getId() {
        return this.q.c();
    }

    public final b getInputData() {
        return this.q.d();
    }

    public final Network getNetwork() {
        return this.q.e();
    }

    public final int getRunAttemptCount() {
        return this.q.g();
    }

    public final Set<String> getTags() {
        return this.q.h();
    }

    public wj1 getTaskExecutor() {
        return this.q.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.q.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.q.k();
    }

    public yy1 getWorkerFactory() {
        return this.q.l();
    }

    public boolean isRunInForeground() {
        return this.t;
    }

    public final boolean isStopped() {
        return this.r;
    }

    public final boolean isUsed() {
        return this.s;
    }

    public void onStopped() {
    }

    public final fk0<Void> setForegroundAsync(g30 g30Var) {
        this.t = true;
        return this.q.b().a(getApplicationContext(), getId(), g30Var);
    }

    public fk0<Void> setProgressAsync(b bVar) {
        return this.q.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z) {
        this.t = z;
    }

    public final void setUsed() {
        this.s = true;
    }

    public abstract fk0<a> startWork();

    public final void stop() {
        this.r = true;
        onStopped();
    }
}
