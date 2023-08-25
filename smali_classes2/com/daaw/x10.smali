.class public Lcom/daaw/x10;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/dm;


# direct methods
.method public constructor <init>(Lcom/daaw/dm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x10;->a:Lcom/daaw/dm;

    return-void
.end method

.method public static a()Lcom/daaw/x10;
    .locals 2

    invoke-static {}, Lcom/daaw/s10;->k()Lcom/daaw/s10;

    move-result-object v0

    const-class v1, Lcom/daaw/x10;

    invoke-virtual {v0, v1}, Lcom/daaw/s10;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/x10;

    const-string v1, "FirebaseCrashlytics component is not present."

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public static b(Lcom/daaw/s10;Lcom/daaw/e20;Lcom/daaw/es;Lcom/daaw/es;)Lcom/daaw/x10;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/s10;",
            "Lcom/daaw/e20;",
            "Lcom/daaw/es<",
            "Lcom/daaw/fm;",
            ">;",
            "Lcom/daaw/es<",
            "Lcom/daaw/p2;",
            ">;)",
            "Lcom/daaw/x10;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/s10;->j()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Initializing Firebase Crashlytics "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/dm;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ml0;->g(Ljava/lang/String;)V

    new-instance v13, Lcom/daaw/h10;

    invoke-direct {v13, v1}, Lcom/daaw/h10;-><init>(Landroid/content/Context;)V

    new-instance v14, Lcom/daaw/ep;

    move-object/from16 v2, p0

    invoke-direct {v14, v2}, Lcom/daaw/ep;-><init>(Lcom/daaw/s10;)V

    new-instance v3, Lcom/daaw/ue0;

    move-object/from16 v4, p1

    invoke-direct {v3, v1, v0, v4, v14}, Lcom/daaw/ue0;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/e20;Lcom/daaw/ep;)V

    new-instance v7, Lcom/daaw/im;

    move-object/from16 v0, p2

    invoke-direct {v7, v0}, Lcom/daaw/im;-><init>(Lcom/daaw/es;)V

    new-instance v0, Lcom/daaw/u2;

    move-object/from16 v4, p3

    invoke-direct {v0, v4}, Lcom/daaw/u2;-><init>(Lcom/daaw/es;)V

    const-string v4, "Crashlytics Exception Handler"

    invoke-static {v4}, Lcom/daaw/cz;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v12

    new-instance v15, Lcom/daaw/dm;

    invoke-virtual {v0}, Lcom/daaw/u2;->e()Lcom/daaw/pc;

    move-result-object v9

    invoke-virtual {v0}, Lcom/daaw/u2;->d()Lcom/daaw/v2;

    move-result-object v10

    move-object v4, v15

    move-object/from16 v5, p0

    move-object v6, v3

    move-object v8, v14

    move-object v11, v13

    invoke-direct/range {v4 .. v12}, Lcom/daaw/dm;-><init>(Lcom/daaw/s10;Lcom/daaw/ue0;Lcom/daaw/fm;Lcom/daaw/ep;Lcom/daaw/pc;Lcom/daaw/v2;Lcom/daaw/h10;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/s10;->m()Lcom/daaw/h20;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/h20;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/daaw/fh;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Mapping file ID is: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    new-instance v4, Lcom/daaw/mt;

    invoke-direct {v4, v1}, Lcom/daaw/mt;-><init>(Landroid/content/Context;)V

    :try_start_0
    invoke-static {v1, v3, v2, v0, v4}, Lcom/daaw/a5;->a(Landroid/content/Context;Lcom/daaw/ue0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/mt;)Lcom/daaw/a5;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Installer package name is: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v0, Lcom/daaw/a5;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    const-string v4, "com.google.firebase.crashlytics.startup"

    invoke-static {v4}, Lcom/daaw/cz;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v9

    new-instance v4, Lcom/daaw/vb0;

    invoke-direct {v4}, Lcom/daaw/vb0;-><init>()V

    iget-object v5, v0, Lcom/daaw/a5;->e:Ljava/lang/String;

    iget-object v6, v0, Lcom/daaw/a5;->f:Ljava/lang/String;

    move-object v7, v13

    move-object v8, v14

    invoke-static/range {v1 .. v8}, Lcom/daaw/wb1;->l(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/ue0;Lcom/daaw/vb0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/h10;Lcom/daaw/ep;)Lcom/daaw/wb1;

    move-result-object v1

    invoke-virtual {v1, v9}, Lcom/daaw/wb1;->p(Ljava/util/concurrent/Executor;)Lcom/daaw/rj1;

    move-result-object v2

    new-instance v3, Lcom/daaw/x10$a;

    invoke-direct {v3}, Lcom/daaw/x10$a;-><init>()V

    invoke-virtual {v2, v9, v3}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    invoke-virtual {v15, v0, v1}, Lcom/daaw/dm;->o(Lcom/daaw/a5;Lcom/daaw/zb1;)Z

    move-result v0

    new-instance v2, Lcom/daaw/x10$b;

    invoke-direct {v2, v0, v15, v1}, Lcom/daaw/x10$b;-><init>(ZLcom/daaw/dm;Lcom/daaw/wb1;)V

    invoke-static {v9, v2}, Lcom/daaw/dk1;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    new-instance v0, Lcom/daaw/x10;

    invoke-direct {v0, v15}, Lcom/daaw/x10;-><init>(Lcom/daaw/dm;)V

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v2, "Error retrieving app package info."

    invoke-virtual {v0, v2, v1}, Lcom/daaw/ml0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/x10;->a:Lcom/daaw/dm;

    invoke-virtual {v0, p1}, Lcom/daaw/dm;->k(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v0, "A null value was passed to recordException. Ignoring."

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/x10;->a:Lcom/daaw/dm;

    invoke-virtual {v0, p1}, Lcom/daaw/dm;->l(Ljava/lang/Throwable;)V

    return-void
.end method
