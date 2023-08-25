.class public Lcom/daaw/dm;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/s10;

.field public final c:Lcom/daaw/ep;

.field public final d:Lcom/daaw/fu0;

.field public final e:J

.field public f:Lcom/daaw/em;

.field public g:Lcom/daaw/em;

.field public h:Z

.field public i:Lcom/daaw/bm;

.field public final j:Lcom/daaw/ue0;

.field public final k:Lcom/daaw/h10;

.field public final l:Lcom/daaw/pc;

.field public final m:Lcom/daaw/v2;

.field public final n:Ljava/util/concurrent/ExecutorService;

.field public final o:Lcom/daaw/zl;

.field public final p:Lcom/daaw/fm;


# direct methods
.method public constructor <init>(Lcom/daaw/s10;Lcom/daaw/ue0;Lcom/daaw/fm;Lcom/daaw/ep;Lcom/daaw/pc;Lcom/daaw/v2;Lcom/daaw/h10;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dm;->b:Lcom/daaw/s10;

    iput-object p4, p0, Lcom/daaw/dm;->c:Lcom/daaw/ep;

    invoke-virtual {p1}, Lcom/daaw/s10;->j()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dm;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/dm;->j:Lcom/daaw/ue0;

    iput-object p3, p0, Lcom/daaw/dm;->p:Lcom/daaw/fm;

    iput-object p5, p0, Lcom/daaw/dm;->l:Lcom/daaw/pc;

    iput-object p6, p0, Lcom/daaw/dm;->m:Lcom/daaw/v2;

    iput-object p8, p0, Lcom/daaw/dm;->n:Ljava/util/concurrent/ExecutorService;

    iput-object p7, p0, Lcom/daaw/dm;->k:Lcom/daaw/h10;

    new-instance p1, Lcom/daaw/zl;

    invoke-direct {p1, p8}, Lcom/daaw/zl;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/daaw/dm;->o:Lcom/daaw/zl;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/dm;->e:J

    new-instance p1, Lcom/daaw/fu0;

    invoke-direct {p1}, Lcom/daaw/fu0;-><init>()V

    iput-object p1, p0, Lcom/daaw/dm;->d:Lcom/daaw/fu0;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/dm;Lcom/daaw/zb1;)Lcom/daaw/rj1;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dm;->f(Lcom/daaw/zb1;)Lcom/daaw/rj1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/dm;)Lcom/daaw/em;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dm;->f:Lcom/daaw/em;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/dm;)Lcom/daaw/bm;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dm;->i:Lcom/daaw/bm;

    return-object p0
.end method

.method public static i()Ljava/lang/String;
    .locals 1

    const-string v0, "18.3.3"

    return-object v0
.end method

.method public static j(Ljava/lang/String;Z)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p0

    const-string p1, "Configured not to require a build ID."

    invoke-virtual {p0, p1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm;->o:Lcom/daaw/zl;

    new-instance v1, Lcom/daaw/dm$d;

    invoke-direct {v1, p0}, Lcom/daaw/dm$d;-><init>(Lcom/daaw/dm;)V

    invoke-virtual {v0, v1}, Lcom/daaw/zl;->h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lcom/daaw/yq1;->d(Lcom/daaw/rj1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/dm;->h:Z

    return-void

    :catch_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm;->f:Lcom/daaw/em;

    invoke-virtual {v0}, Lcom/daaw/em;->c()Z

    move-result v0

    return v0
.end method

.method public final f(Lcom/daaw/zb1;)Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zb1;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    invoke-virtual {p0}, Lcom/daaw/dm;->n()V

    :try_start_0
    iget-object v1, p0, Lcom/daaw/dm;->l:Lcom/daaw/pc;

    new-instance v2, Lcom/daaw/cm;

    invoke-direct {v2, p0}, Lcom/daaw/cm;-><init>(Lcom/daaw/dm;)V

    invoke-interface {v1, v2}, Lcom/daaw/pc;->a(Lcom/daaw/oc;)V

    invoke-interface {p1}, Lcom/daaw/zb1;->b()Lcom/daaw/tb1;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/tb1;->b:Lcom/daaw/tb1$a;

    iget-boolean v1, v1, Lcom/daaw/tb1$a;->a:Z

    if-nez v1, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/dk1;->d(Ljava/lang/Exception;)Lcom/daaw/rj1;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/daaw/dm;->m()V

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/dm;->i:Lcom/daaw/bm;

    invoke-virtual {v0, p1}, Lcom/daaw/bm;->z(Lcom/daaw/zb1;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Previous sessions could not be finalized."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/daaw/dm;->i:Lcom/daaw/bm;

    invoke-interface {p1}, Lcom/daaw/zb1;->a()Lcom/daaw/rj1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/bm;->N(Lcom/daaw/rj1;)Lcom/daaw/rj1;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Lcom/daaw/dm;->m()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    invoke-virtual {v0, v1, p1}, Lcom/daaw/ml0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lcom/daaw/dk1;->d(Ljava/lang/Exception;)Lcom/daaw/rj1;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Lcom/daaw/dm;->m()V

    return-object p1

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/dm;->m()V

    throw p1
.end method

.method public g(Lcom/daaw/zb1;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zb1;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dm;->n:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/daaw/dm$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/dm$a;-><init>(Lcom/daaw/dm;Lcom/daaw/zb1;)V

    invoke-static {v0, v1}, Lcom/daaw/yq1;->f(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lcom/daaw/zb1;)V
    .locals 3

    new-instance v0, Lcom/daaw/dm$b;

    invoke-direct {v0, p0, p1}, Lcom/daaw/dm$b;-><init>(Lcom/daaw/dm;Lcom/daaw/zb1;)V

    iget-object p1, p0, Lcom/daaw/dm;->n:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    const-wide/16 v0, 0x4

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Crashlytics timed out during initialization."

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during initialization."

    goto :goto_0

    :catch_2
    move-exception p1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Crashlytics was interrupted during initialization."

    :goto_0
    invoke-virtual {v0, v1, p1}, Lcom/daaw/ml0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/dm;->e:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/daaw/dm;->i:Lcom/daaw/bm;

    invoke-virtual {v2, v0, v1, p1}, Lcom/daaw/bm;->R(JLjava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm;->i:Lcom/daaw/bm;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/daaw/bm;->Q(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm;->o:Lcom/daaw/zl;

    new-instance v1, Lcom/daaw/dm$c;

    invoke-direct {v1, p0}, Lcom/daaw/dm$c;-><init>(Lcom/daaw/dm;)V

    invoke-virtual {v0, v1}, Lcom/daaw/zl;->h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm;->o:Lcom/daaw/zl;

    invoke-virtual {v0}, Lcom/daaw/zl;->b()V

    iget-object v0, p0, Lcom/daaw/dm;->f:Lcom/daaw/em;

    invoke-virtual {v0}, Lcom/daaw/em;->a()Z

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Initialization marker file was created."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    return-void
.end method

.method public o(Lcom/daaw/a5;Lcom/daaw/zb1;)Z
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-object v2, v1, Lcom/daaw/dm;->a:Landroid/content/Context;

    const-string v3, "com.crashlytics.RequireBuildId"

    const/4 v11, 0x1

    invoke-static {v2, v3, v11}, Lcom/daaw/fh;->k(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v15, p1

    iget-object v3, v15, Lcom/daaw/a5;->b:Ljava/lang/String;

    invoke-static {v3, v2}, Lcom/daaw/dm;->j(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/daaw/fd;

    iget-object v3, v1, Lcom/daaw/dm;->j:Lcom/daaw/ue0;

    invoke-direct {v2, v3}, Lcom/daaw/fd;-><init>(Lcom/daaw/ue0;)V

    invoke-virtual {v2}, Lcom/daaw/fd;->toString()Ljava/lang/String;

    move-result-object v14

    const/16 v25, 0x0

    :try_start_0
    new-instance v2, Lcom/daaw/em;

    const-string v3, "crash_marker"

    iget-object v4, v1, Lcom/daaw/dm;->k:Lcom/daaw/h10;

    invoke-direct {v2, v3, v4}, Lcom/daaw/em;-><init>(Ljava/lang/String;Lcom/daaw/h10;)V

    iput-object v2, v1, Lcom/daaw/dm;->g:Lcom/daaw/em;

    new-instance v2, Lcom/daaw/em;

    const-string v3, "initialization_marker"

    iget-object v4, v1, Lcom/daaw/dm;->k:Lcom/daaw/h10;

    invoke-direct {v2, v3, v4}, Lcom/daaw/em;-><init>(Ljava/lang/String;Lcom/daaw/h10;)V

    iput-object v2, v1, Lcom/daaw/dm;->f:Lcom/daaw/em;

    new-instance v13, Lcom/daaw/nq1;

    iget-object v2, v1, Lcom/daaw/dm;->k:Lcom/daaw/h10;

    iget-object v3, v1, Lcom/daaw/dm;->o:Lcom/daaw/zl;

    invoke-direct {v13, v14, v2, v3}, Lcom/daaw/nq1;-><init>(Ljava/lang/String;Lcom/daaw/h10;Lcom/daaw/zl;)V

    new-instance v12, Lcom/daaw/fl0;

    iget-object v2, v1, Lcom/daaw/dm;->k:Lcom/daaw/h10;

    invoke-direct {v12, v2}, Lcom/daaw/fl0;-><init>(Lcom/daaw/h10;)V

    new-instance v8, Lcom/daaw/eq0;

    const/16 v2, 0x400

    new-array v3, v11, [Lcom/daaw/ef1;

    new-instance v4, Lcom/daaw/t31;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Lcom/daaw/t31;-><init>(I)V

    aput-object v4, v3, v25

    invoke-direct {v8, v2, v3}, Lcom/daaw/eq0;-><init>(I[Lcom/daaw/ef1;)V

    iget-object v2, v1, Lcom/daaw/dm;->a:Landroid/content/Context;

    iget-object v3, v1, Lcom/daaw/dm;->j:Lcom/daaw/ue0;

    iget-object v4, v1, Lcom/daaw/dm;->k:Lcom/daaw/h10;

    iget-object v10, v1, Lcom/daaw/dm;->d:Lcom/daaw/fu0;

    move-object/from16 v5, p1

    move-object v6, v12

    move-object v7, v13

    move-object/from16 v9, p2

    invoke-static/range {v2 .. v10}, Lcom/daaw/pb1;->g(Landroid/content/Context;Lcom/daaw/ue0;Lcom/daaw/h10;Lcom/daaw/a5;Lcom/daaw/fl0;Lcom/daaw/nq1;Lcom/daaw/ef1;Lcom/daaw/zb1;Lcom/daaw/fu0;)Lcom/daaw/pb1;

    move-result-object v22

    new-instance v2, Lcom/daaw/bm;

    iget-object v3, v1, Lcom/daaw/dm;->a:Landroid/content/Context;

    iget-object v4, v1, Lcom/daaw/dm;->o:Lcom/daaw/zl;

    iget-object v5, v1, Lcom/daaw/dm;->j:Lcom/daaw/ue0;

    iget-object v6, v1, Lcom/daaw/dm;->c:Lcom/daaw/ep;

    iget-object v7, v1, Lcom/daaw/dm;->k:Lcom/daaw/h10;

    iget-object v8, v1, Lcom/daaw/dm;->g:Lcom/daaw/em;

    iget-object v9, v1, Lcom/daaw/dm;->p:Lcom/daaw/fm;

    iget-object v10, v1, Lcom/daaw/dm;->m:Lcom/daaw/v2;

    move-object/from16 v21, v12

    move-object v12, v2

    move-object/from16 v20, v13

    move-object v13, v3

    move-object v3, v14

    move-object v14, v4

    move-object v15, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v19, p1

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    invoke-direct/range {v12 .. v24}, Lcom/daaw/bm;-><init>(Landroid/content/Context;Lcom/daaw/zl;Lcom/daaw/ue0;Lcom/daaw/ep;Lcom/daaw/h10;Lcom/daaw/em;Lcom/daaw/a5;Lcom/daaw/nq1;Lcom/daaw/fl0;Lcom/daaw/pb1;Lcom/daaw/fm;Lcom/daaw/v2;)V

    iput-object v2, v1, Lcom/daaw/dm;->i:Lcom/daaw/bm;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/dm;->e()Z

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/dm;->d()V

    iget-object v4, v1, Lcom/daaw/dm;->i:Lcom/daaw/bm;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v5

    invoke-virtual {v4, v3, v5, v0}, Lcom/daaw/bm;->x(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/daaw/zb1;)V

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/daaw/dm;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/daaw/fh;->c(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v2

    const-string v3, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    invoke-virtual {v2, v3}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/daaw/dm;->h(Lcom/daaw/zb1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v25

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v2, "Successfully configured exception handler."

    invoke-virtual {v0, v2}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    return v11

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v2

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    invoke-virtual {v2, v3, v0}, Lcom/daaw/ml0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lcom/daaw/dm;->i:Lcom/daaw/bm;

    return v25

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
