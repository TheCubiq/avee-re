.class public final Lcom/daaw/gk5;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile j:Lcom/daaw/gk5;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/ag;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Lcom/daaw/g5;

.field public final e:Ljava/util/List;

.field public f:I

.field public g:Z

.field public final h:Ljava/lang/String;

.field public volatile i:Lcom/daaw/ju3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p3, p4}, Lcom/daaw/gk5;->n(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string p2, "FA"

    :cond_1
    iput-object p2, p0, Lcom/daaw/gk5;->a:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/mq;->d()Lcom/daaw/ag;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/gk5;->b:Lcom/daaw/ag;

    invoke-static {}, Lcom/daaw/ko3;->a()Lcom/daaw/bl3;

    new-instance v7, Lcom/daaw/hu4;

    invoke-direct {v7, p0}, Lcom/daaw/hu4;-><init>(Lcom/daaw/gk5;)V

    new-instance p2, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    invoke-static {p2}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/gk5;->c:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lcom/daaw/g5;

    invoke-direct {p2, p0}, Lcom/daaw/g5;-><init>(Lcom/daaw/gk5;)V

    iput-object p2, p0, Lcom/daaw/gk5;->d:Lcom/daaw/g5;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/daaw/gk5;->e:Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lcom/daaw/ji6;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "google_app_id"

    invoke-static {p1, v1, p2}, Lcom/daaw/q38;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/daaw/gk5;->j()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/gk5;->h:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/daaw/gk5;->g:Z

    return-void

    :catch_0
    nop

    :cond_3
    :goto_0
    invoke-virtual {p0, p3, p4}, Lcom/daaw/gk5;->n(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    const-string p2, "fa"

    iput-object p2, p0, Lcom/daaw/gk5;->h:Ljava/lang/String;

    goto :goto_1

    :cond_4
    iput-object p3, p0, Lcom/daaw/gk5;->h:Ljava/lang/String;

    :goto_1
    new-instance p2, Lcom/daaw/ih4;

    move-object v0, p2

    move-object v1, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p1

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ih4;-><init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {p0, p2}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    if-nez p1, :cond_5

    return-void

    :cond_5
    new-instance p2, Lcom/daaw/dj5;

    invoke-direct {p2, p0}, Lcom/daaw/dj5;-><init>(Lcom/daaw/gk5;)V

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static bridge synthetic D(Lcom/daaw/gk5;Lcom/daaw/ju3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gk5;->i:Lcom/daaw/ju3;

    return-void
.end method

.method public static bridge synthetic E(Lcom/daaw/gk5;Ljava/lang/Exception;ZZ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/gk5;->k(Ljava/lang/Exception;ZZ)V

    return-void
.end method

.method public static bridge synthetic F(Lcom/daaw/gk5;Lcom/daaw/l75;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public static bridge synthetic h(Lcom/daaw/gk5;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/gk5;->g:Z

    return p0
.end method

.method public static bridge synthetic i(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/gk5;->n(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic s(Lcom/daaw/gk5;)Lcom/daaw/ju3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/gk5;->i:Lcom/daaw/ju3;

    return-object p0
.end method

.method public static u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/daaw/gk5;
    .locals 8

    invoke-static {p0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/daaw/gk5;->j:Lcom/daaw/gk5;

    if-nez v0, :cond_1

    const-class v0, Lcom/daaw/gk5;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/gk5;->j:Lcom/daaw/gk5;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/gk5;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/daaw/gk5;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    sput-object v1, Lcom/daaw/gk5;->j:Lcom/daaw/gk5;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/daaw/gk5;->j:Lcom/daaw/gk5;

    return-object p0
.end method

.method public static bridge synthetic v(Lcom/daaw/gk5;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/gk5;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    new-instance v1, Lcom/daaw/jl4;

    invoke-direct {v1, p0, v0}, Lcom/daaw/jl4;-><init>(Lcom/daaw/gk5;Lcom/daaw/oq3;)V

    invoke-virtual {p0, v1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/daaw/oq3;->g3(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final B(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    new-instance v1, Lcom/daaw/p84;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/daaw/p84;-><init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/oq3;)V

    invoke-virtual {p0, v1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    const-wide/16 p1, 0x1388

    invoke-virtual {v0, p1, p2}, Lcom/daaw/oq3;->I(J)Landroid/os/Bundle;

    move-result-object p1

    const-class p2, Ljava/util/List;

    invoke-static {p1, p2}, Lcom/daaw/oq3;->h3(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final C(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 8

    new-instance v6, Lcom/daaw/oq3;

    invoke-direct {v6}, Lcom/daaw/oq3;-><init>()V

    new-instance v7, Lcom/daaw/yq4;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/yq4;-><init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/oq3;)V

    invoke-virtual {p0, v7}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    const-wide/16 p1, 0x1388

    invoke-virtual {v6, p1, p2}, Lcom/daaw/oq3;->I(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/os/Bundle;->size()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p2, Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/os/Bundle;->size()I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_2

    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_2

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    :cond_2
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object p2

    :cond_4
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/li4;

    invoke-direct {v0, p0, p1}, Lcom/daaw/li4;-><init>(Lcom/daaw/gk5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final H(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/daaw/m74;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/m74;-><init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final I(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/oj4;

    invoke-direct {v0, p0, p1}, Lcom/daaw/oj4;-><init>(Lcom/daaw/gk5;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final J(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/gk5;->l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V

    return-void
.end method

.method public final a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    new-instance p1, Lcom/daaw/bs4;

    const/4 v2, 0x0

    const/4 v3, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lcom/daaw/bs4;-><init>(Lcom/daaw/gk5;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final b(Lcom/daaw/pl7;)V
    .locals 4

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gk5;->e:Ljava/util/List;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/daaw/gk5;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/daaw/gk5;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/daaw/q95;

    invoke-direct {v1, p1}, Lcom/daaw/q95;-><init>(Lcom/daaw/pl7;)V

    iget-object v2, p0, Lcom/daaw/gk5;->e:Ljava/util/List;

    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, p1, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/gk5;->i:Lcom/daaw/ju3;

    if-eqz p1, :cond_2

    :try_start_1
    iget-object p1, p0, Lcom/daaw/gk5;->i:Lcom/daaw/ju3;

    invoke-interface {p1, v1}, Lcom/daaw/ju3;->registerOnMeasurementEventListener(Lcom/daaw/v04;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/NetworkOnMainThreadException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    :cond_2
    new-instance p1, Lcom/daaw/a35;

    invoke-direct {p1, p0, v1}, Lcom/daaw/a35;-><init>(Lcom/daaw/gk5;Lcom/daaw/q95;)V

    invoke-virtual {p0, p1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final c(Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/daaw/j64;

    invoke-direct {v0, p0, p1}, Lcom/daaw/j64;-><init>(Lcom/daaw/gk5;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/daaw/zc4;

    invoke-direct {v0, p0, p1}, Lcom/daaw/zc4;-><init>(Lcom/daaw/gk5;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final e(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/ua4;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/ua4;-><init>(Lcom/daaw/gk5;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final f(Z)V
    .locals 1

    new-instance v0, Lcom/daaw/tz4;

    invoke-direct {v0, p0, p1}, Lcom/daaw/tz4;-><init>(Lcom/daaw/gk5;Z)V

    invoke-virtual {p0, v0}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 7

    new-instance v6, Lcom/daaw/i65;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/i65;-><init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    invoke-virtual {p0, v6}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final j()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.google.firebase.analytics.FirebaseAnalytics"

    const-class v2, Lcom/daaw/gk5;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :catch_0
    return v0
.end method

.method public final k(Ljava/lang/Exception;ZZ)V
    .locals 7

    iget-boolean v0, p0, Lcom/daaw/gk5;->g:Z

    or-int/2addr v0, p2

    iput-boolean v0, p0, Lcom/daaw/gk5;->g:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    if-eqz p3, :cond_1

    const/4 v2, 0x5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v3, "Error with data collection. Data lost."

    move-object v1, p0

    move-object v4, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/gk5;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V
    .locals 9

    new-instance v8, Lcom/daaw/f55;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/daaw/f55;-><init>(Lcom/daaw/gk5;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V

    invoke-virtual {p0, v8}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    return-void
.end method

.method public final m(Lcom/daaw/l75;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gk5;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/gk5;->j()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final o(Ljava/lang/String;)I
    .locals 3

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    new-instance v1, Lcom/daaw/kv4;

    invoke-direct {v1, p0, p1, v0}, Lcom/daaw/kv4;-><init>(Lcom/daaw/gk5;Ljava/lang/String;Lcom/daaw/oq3;)V

    invoke-virtual {p0, v1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Lcom/daaw/oq3;->I(J)Landroid/os/Bundle;

    move-result-object p1

    const-class v0, Ljava/lang/Integer;

    invoke-static {p1, v0}, Lcom/daaw/oq3;->h3(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/16 p1, 0x19

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final p()J
    .locals 5

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    new-instance v1, Lcom/daaw/pn4;

    invoke-direct {v1, p0, v0}, Lcom/daaw/pn4;-><init>(Lcom/daaw/gk5;Lcom/daaw/oq3;)V

    invoke-virtual {p0, v1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/daaw/oq3;->M(J)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/gk5;->b:Lcom/daaw/ag;

    invoke-interface {v3}, Lcom/daaw/ag;->a()J

    move-result-wide v3

    xor-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    iget v2, p0, Lcom/daaw/gk5;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/daaw/gk5;->f:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final q(Landroid/os/Bundle;Z)Landroid/os/Bundle;
    .locals 2

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    new-instance v1, Lcom/daaw/et4;

    invoke-direct {v1, p0, p1, v0}, Lcom/daaw/et4;-><init>(Lcom/daaw/gk5;Landroid/os/Bundle;Lcom/daaw/oq3;)V

    invoke-virtual {p0, v1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    if-eqz p2, :cond_0

    const-wide/16 p1, 0x1388

    invoke-virtual {v0, p1, p2}, Lcom/daaw/oq3;->I(J)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final r()Lcom/daaw/g5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gk5;->d:Lcom/daaw/g5;

    return-object v0
.end method

.method public final t(Landroid/content/Context;Z)Lcom/daaw/ju3;
    .locals 1

    :try_start_0
    sget-object p2, Lcom/google/android/gms/dynamite/DynamiteModule;->e:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v0, "com.google.android.gms.measurement.dynamite"

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p1

    const-string p2, "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lt3;->asInterface(Landroid/os/IBinder;)Lcom/daaw/ju3;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/gk5;->k(Ljava/lang/Exception;ZZ)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gk5;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final x()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    new-instance v1, Lcom/daaw/mm4;

    invoke-direct {v1, p0, v0}, Lcom/daaw/mm4;-><init>(Lcom/daaw/gk5;Lcom/daaw/oq3;)V

    invoke-virtual {p0, v1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/daaw/oq3;->g3(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    new-instance v1, Lcom/daaw/vp4;

    invoke-direct {v1, p0, v0}, Lcom/daaw/vp4;-><init>(Lcom/daaw/gk5;Lcom/daaw/oq3;)V

    invoke-virtual {p0, v1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/daaw/oq3;->g3(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/daaw/oq3;

    invoke-direct {v0}, Lcom/daaw/oq3;-><init>()V

    new-instance v1, Lcom/daaw/so4;

    invoke-direct {v1, p0, v0}, Lcom/daaw/so4;-><init>(Lcom/daaw/gk5;Lcom/daaw/oq3;)V

    invoke-virtual {p0, v1}, Lcom/daaw/gk5;->m(Lcom/daaw/l75;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/daaw/oq3;->g3(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
