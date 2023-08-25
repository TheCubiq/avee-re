.class public Lcom/google/firebase/concurrent/ExecutorsRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ThreadPoolCreation"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/xi0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xi0<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/daaw/xi0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xi0<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/daaw/xi0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xi0<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lcom/daaw/xi0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xi0<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/xi0;

    sget-object v1, Lcom/daaw/kz;->a:Lcom/daaw/kz;

    invoke-direct {v0, v1}, Lcom/daaw/xi0;-><init>(Lcom/daaw/b01;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lcom/daaw/xi0;

    new-instance v0, Lcom/daaw/xi0;

    sget-object v1, Lcom/daaw/jz;->a:Lcom/daaw/jz;

    invoke-direct {v0, v1}, Lcom/daaw/xi0;-><init>(Lcom/daaw/b01;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lcom/daaw/xi0;

    new-instance v0, Lcom/daaw/xi0;

    sget-object v1, Lcom/daaw/iz;->a:Lcom/daaw/iz;

    invoke-direct {v0, v1}, Lcom/daaw/xi0;-><init>(Lcom/daaw/b01;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lcom/daaw/xi0;

    new-instance v0, Lcom/daaw/xi0;

    sget-object v1, Lcom/daaw/hz;->a:Lcom/daaw/hz;

    invoke-direct {v0, v1}, Lcom/daaw/xi0;-><init>(Lcom/daaw/b01;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Lcom/daaw/xi0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->m(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->s()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->r()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->q()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lcom/daaw/bi;)Ljava/util/concurrent/Executor;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->o(Lcom/daaw/bi;)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->n(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->p()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->l(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p0

    return-object p0
.end method

.method public static i()Landroid/os/StrictMode$ThreadPolicy;
    .locals 3

    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectResourceMismatches()Landroid/os/StrictMode$ThreadPolicy$Builder;

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectUnbufferedIo()Landroid/os/StrictMode$ThreadPolicy$Builder;

    :cond_0
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;
    .locals 2

    new-instance v0, Lcom/daaw/go;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/daaw/go;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    return-object v0
.end method

.method public static k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    new-instance v0, Lcom/daaw/go;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/go;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    return-object v0
.end method

.method public static synthetic l(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lcom/daaw/xi0;

    invoke-virtual {p0}, Lcom/daaw/xi0;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic m(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lcom/daaw/xi0;

    invoke-virtual {p0}, Lcom/daaw/xi0;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic n(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lcom/daaw/xi0;

    invoke-virtual {p0}, Lcom/daaw/xi0;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic o(Lcom/daaw/bi;)Ljava/util/concurrent/Executor;
    .locals 0

    sget-object p0, Lcom/daaw/dp1;->p:Lcom/daaw/dp1;

    return-object p0
.end method

.method public static synthetic p()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->i()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    const-string v1, "Firebase Background"

    const/16 v2, 0xa

    invoke-static {v1, v2, v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->u(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 4

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->t()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v1

    const-string v2, "Firebase Lite"

    const/4 v3, 0x0

    invoke-static {v2, v3, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->u(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    const-string v0, "Firebase Blocking"

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->u(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic s()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    const-string v0, "Firebase Scheduler"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static t()Landroid/os/StrictMode$ThreadPolicy;
    .locals 1

    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static u(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    new-instance v0, Lcom/daaw/us;

    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Lcom/daaw/xi0;

    invoke-virtual {v1}, Lcom/daaw/xi0;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0, v1}, Lcom/daaw/us;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/vh<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/daaw/vh;

    const-class v1, Lcom/daaw/ea;

    const-class v2, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v1, v2}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [Lcom/daaw/i01;

    const-class v4, Lcom/daaw/ea;

    const-class v5, Ljava/util/concurrent/ExecutorService;

    invoke-static {v4, v5}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-class v4, Lcom/daaw/ea;

    const-class v6, Ljava/util/concurrent/Executor;

    invoke-static {v4, v6}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-static {v1, v3}, Lcom/daaw/vh;->d(Lcom/daaw/i01;[Lcom/daaw/i01;)Lcom/daaw/vh$b;

    move-result-object v1

    sget-object v3, Lcom/daaw/gz;->a:Lcom/daaw/gz;

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object v1

    aput-object v1, v0, v5

    const-class v1, Lcom/daaw/gc;

    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v1, v3}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v1

    new-array v3, v2, [Lcom/daaw/i01;

    const-class v4, Lcom/daaw/gc;

    const-class v7, Ljava/util/concurrent/ExecutorService;

    invoke-static {v4, v7}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v4

    aput-object v4, v3, v5

    const-class v4, Lcom/daaw/gc;

    const-class v7, Ljava/util/concurrent/Executor;

    invoke-static {v4, v7}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v1, v3}, Lcom/daaw/vh;->d(Lcom/daaw/i01;[Lcom/daaw/i01;)Lcom/daaw/vh$b;

    move-result-object v1

    sget-object v3, Lcom/daaw/dz;->a:Lcom/daaw/dz;

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object v1

    aput-object v1, v0, v6

    const-class v1, Lcom/daaw/wj0;

    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v1, v3}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v1

    new-array v3, v2, [Lcom/daaw/i01;

    const-class v4, Lcom/daaw/wj0;

    const-class v7, Ljava/util/concurrent/ExecutorService;

    invoke-static {v4, v7}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v4

    aput-object v4, v3, v5

    const-class v4, Lcom/daaw/wj0;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v1, v3}, Lcom/daaw/vh;->d(Lcom/daaw/i01;[Lcom/daaw/i01;)Lcom/daaw/vh$b;

    move-result-object v1

    sget-object v3, Lcom/daaw/fz;->a:Lcom/daaw/fz;

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object v1

    aput-object v1, v0, v2

    const-class v1, Lcom/daaw/ep1;

    const-class v2, Ljava/util/concurrent/Executor;

    invoke-static {v1, v2}, Lcom/daaw/i01;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/vh;->c(Lcom/daaw/i01;)Lcom/daaw/vh$b;

    move-result-object v1

    sget-object v2, Lcom/daaw/ez;->a:Lcom/daaw/ez;

    invoke-virtual {v1, v2}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
