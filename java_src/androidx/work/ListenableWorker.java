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

    /* renamed from: p */
    public Context f2416p;

    /* renamed from: q */
    public WorkerParameters f2417q;

    /* renamed from: r */
    public volatile boolean f2418r;

    /* renamed from: s */
    public boolean f2419s;

    /* renamed from: t */
    public boolean f2420t;

    /* renamed from: androidx.work.ListenableWorker$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0501a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        /* loaded from: classes.dex */
        public static final class C0502a extends AbstractC0501a {

            /* renamed from: a */
            public final C0511b f2421a;

            public C0502a() {
                this(C0511b.f2466c);
            }

            public C0502a(C0511b c0511b) {
                this.f2421a = c0511b;
            }

            /* renamed from: e */
            public C0511b m28002e() {
                return this.f2421a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0502a.class != obj.getClass()) {
                    return false;
                }
                return this.f2421a.equals(((C0502a) obj).f2421a);
            }

            public int hashCode() {
                return (C0502a.class.getName().hashCode() * 31) + this.f2421a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f2421a + '}';
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        /* loaded from: classes.dex */
        public static final class C0503b extends AbstractC0501a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C0503b.class == obj.getClass();
            }

            public int hashCode() {
                return C0503b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        /* loaded from: classes.dex */
        public static final class C0504c extends AbstractC0501a {

            /* renamed from: a */
            public final C0511b f2422a;

            public C0504c() {
                this(C0511b.f2466c);
            }

            public C0504c(C0511b c0511b) {
                this.f2422a = c0511b;
            }

            /* renamed from: e */
            public C0511b m28001e() {
                return this.f2422a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0504c.class != obj.getClass()) {
                    return false;
                }
                return this.f2422a.equals(((C0504c) obj).f2422a);
            }

            public int hashCode() {
                return (C0504c.class.getName().hashCode() * 31) + this.f2422a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f2422a + '}';
            }
        }

        /* renamed from: a */
        public static AbstractC0501a m28006a() {
            return new C0502a();
        }

        /* renamed from: b */
        public static AbstractC0501a m28005b() {
            return new C0503b();
        }

        /* renamed from: c */
        public static AbstractC0501a m28004c() {
            return new C0504c();
        }

        /* renamed from: d */
        public static AbstractC0501a m28003d(C0511b c0511b) {
            return new C0504c(c0511b);
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
        this.f2416p = context;
        this.f2417q = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f2416p;
    }

    public Executor getBackgroundExecutor() {
        return this.f2417q.m27999a();
    }

    public fk0<g30> getForegroundInfoAsync() {
        sb1 m10470u = sb1.m10470u();
        m10470u.mo10472r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return m10470u;
    }

    public final UUID getId() {
        return this.f2417q.m27997c();
    }

    public final C0511b getInputData() {
        return this.f2417q.m27996d();
    }

    public final Network getNetwork() {
        return this.f2417q.m27995e();
    }

    public final int getRunAttemptCount() {
        return this.f2417q.m27993g();
    }

    public final Set<String> getTags() {
        return this.f2417q.m27992h();
    }

    public wj1 getTaskExecutor() {
        return this.f2417q.m27991i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f2417q.m27990j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f2417q.m27989k();
    }

    public yy1 getWorkerFactory() {
        return this.f2417q.m27988l();
    }

    public boolean isRunInForeground() {
        return this.f2420t;
    }

    public final boolean isStopped() {
        return this.f2418r;
    }

    public final boolean isUsed() {
        return this.f2419s;
    }

    public void onStopped() {
    }

    public final fk0<Void> setForegroundAsync(g30 g30Var) {
        this.f2420t = true;
        return this.f2417q.m27998b().mo4415a(getApplicationContext(), getId(), g30Var);
    }

    public fk0<Void> setProgressAsync(C0511b c0511b) {
        return this.f2417q.m27994f().mo15655a(getApplicationContext(), getId(), c0511b);
    }

    public void setRunInForeground(boolean z) {
        this.f2420t = z;
    }

    public final void setUsed() {
        this.f2419s = true;
    }

    public abstract fk0<AbstractC0501a> startWork();

    public final void stop() {
        this.f2418r = true;
        onStopped();
    }
}
