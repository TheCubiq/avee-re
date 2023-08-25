.class public Lcom/daaw/wb1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zb1;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/ac1;

.field public final c:Lcom/daaw/xb1;

.field public final d:Lcom/daaw/mn;

.field public final e:Lcom/daaw/hd;

.field public final f:Lcom/daaw/bc1;

.field public final g:Lcom/daaw/ep;

.field public final h:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/daaw/tb1;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/daaw/tj1<",
            "Lcom/daaw/tb1;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ac1;Lcom/daaw/mn;Lcom/daaw/xb1;Lcom/daaw/hd;Lcom/daaw/bc1;Lcom/daaw/ep;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/daaw/wb1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lcom/daaw/tj1;

    invoke-direct {v2}, Lcom/daaw/tj1;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/wb1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lcom/daaw/wb1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/wb1;->b:Lcom/daaw/ac1;

    iput-object p3, p0, Lcom/daaw/wb1;->d:Lcom/daaw/mn;

    iput-object p4, p0, Lcom/daaw/wb1;->c:Lcom/daaw/xb1;

    iput-object p5, p0, Lcom/daaw/wb1;->e:Lcom/daaw/hd;

    iput-object p6, p0, Lcom/daaw/wb1;->f:Lcom/daaw/bc1;

    iput-object p7, p0, Lcom/daaw/wb1;->g:Lcom/daaw/ep;

    invoke-static {p3}, Lcom/daaw/wr;->b(Lcom/daaw/mn;)Lcom/daaw/tb1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/wb1;)Lcom/daaw/ac1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb1;->b:Lcom/daaw/ac1;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/wb1;)Lcom/daaw/bc1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb1;->f:Lcom/daaw/bc1;

    return-object p0
.end method

.method public static synthetic e(Lcom/daaw/wb1;)Lcom/daaw/xb1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb1;->c:Lcom/daaw/xb1;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/wb1;)Lcom/daaw/hd;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb1;->e:Lcom/daaw/hd;

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/wb1;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/wb1;->q(Lorg/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lcom/daaw/wb1;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/wb1;->r(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(Lcom/daaw/wb1;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static synthetic j(Lcom/daaw/wb1;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static l(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/ue0;Lcom/daaw/vb0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/h10;Lcom/daaw/ep;)Lcom/daaw/wb1;
    .locals 15

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/ue0;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v10, Lcom/daaw/wi1;

    invoke-direct {v10}, Lcom/daaw/wi1;-><init>()V

    new-instance v11, Lcom/daaw/xb1;

    invoke-direct {v11, v10}, Lcom/daaw/xb1;-><init>(Lcom/daaw/mn;)V

    new-instance v12, Lcom/daaw/hd;

    move-object/from16 v1, p6

    invoke-direct {v12, v1}, Lcom/daaw/hd;-><init>(Lcom/daaw/h10;)V

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string v5, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"

    invoke-static {v1, v5, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v13, Lcom/daaw/xr;

    move-object/from16 v3, p3

    invoke-direct {v13, v1, v3}, Lcom/daaw/xr;-><init>(Ljava/lang/String;Lcom/daaw/vb0;)V

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/ue0;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/ue0;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/ue0;->j()Ljava/lang/String;

    move-result-object v6

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {p0}, Lcom/daaw/fh;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v1, v4

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p5, v1, v2

    const/4 v2, 0x3

    aput-object p4, v1, v2

    invoke-static {v1}, Lcom/daaw/fh;->h([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0}, Lcom/daaw/ws;->a(Ljava/lang/String;)Lcom/daaw/ws;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ws;->b()I

    move-result v9

    new-instance v14, Lcom/daaw/ac1;

    move-object v0, v14

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v5

    move-object v4, v6

    move-object/from16 v5, p2

    move-object v6, v7

    move-object/from16 v7, p5

    move-object/from16 v8, p4

    invoke-direct/range {v0 .. v9}, Lcom/daaw/ac1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hg0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v0, Lcom/daaw/wb1;

    move-object v1, v0

    move-object v2, p0

    move-object v3, v14

    move-object v4, v10

    move-object v5, v11

    move-object v6, v12

    move-object v7, v13

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/daaw/wb1;-><init>(Landroid/content/Context;Lcom/daaw/ac1;Lcom/daaw/mn;Lcom/daaw/xb1;Lcom/daaw/hd;Lcom/daaw/bc1;Lcom/daaw/ep;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Lcom/daaw/tb1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/wb1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/tj1;

    invoke-virtual {v0}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/tb1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wb1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/tb1;

    return-object v0
.end method

.method public k()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/wb1;->n()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wb1;->b:Lcom/daaw/ac1;

    iget-object v1, v1, Lcom/daaw/ac1;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final m(Lcom/daaw/vb1;)Lcom/daaw/tb1;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/daaw/vb1;->q:Lcom/daaw/vb1;

    invoke-virtual {v1, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/daaw/wb1;->e:Lcom/daaw/hd;

    invoke-virtual {v1}, Lcom/daaw/hd;->b()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/daaw/wb1;->c:Lcom/daaw/xb1;

    invoke-virtual {v2, v1}, Lcom/daaw/xb1;->b(Lorg/json/JSONObject;)Lcom/daaw/tb1;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "Loaded cached settings: "

    invoke-virtual {p0, v1, v3}, Lcom/daaw/wb1;->q(Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/wb1;->d:Lcom/daaw/mn;

    invoke-interface {v1}, Lcom/daaw/mn;->a()J

    move-result-wide v3

    sget-object v1, Lcom/daaw/vb1;->r:Lcom/daaw/vb1;

    invoke-virtual {v1, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v2, v3, v4}, Lcom/daaw/tb1;->a(J)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v1, "Cached settings have expired."

    invoke-virtual {p1, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v0, "Returning cached settings."

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v2

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v0, v2

    goto :goto_1

    :cond_2
    :try_start_2
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v1, "Failed to parse cached settings data."

    invoke-virtual {p1, v1, v0}, Lcom/daaw/ml0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_3
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v1, "No cached settings data found."

    invoke-virtual {p1, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    :goto_1
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v1

    const-string v2, "Failed to get cached settings"

    invoke-virtual {v1, v2, p1}, Lcom/daaw/ml0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/daaw/wb1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/fh;->r(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "existing_instance_identifier"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public o(Lcom/daaw/vb1;Ljava/util/concurrent/Executor;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vb1;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/wb1;->k()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/wb1;->m(Lcom/daaw/vb1;)Lcom/daaw/tb1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/daaw/wb1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/daaw/wb1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/tj1;

    invoke-virtual {p2, p1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/daaw/vb1;->r:Lcom/daaw/vb1;

    invoke-virtual {p0, p1}, Lcom/daaw/wb1;->m(Lcom/daaw/vb1;)Lcom/daaw/tb1;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/wb1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/wb1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/tj1;

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    :cond_1
    iget-object p1, p0, Lcom/daaw/wb1;->g:Lcom/daaw/ep;

    invoke-virtual {p1, p2}, Lcom/daaw/ep;->h(Ljava/util/concurrent/Executor;)Lcom/daaw/rj1;

    move-result-object p1

    new-instance v0, Lcom/daaw/wb1$a;

    invoke-direct {v0, p0}, Lcom/daaw/wb1$a;-><init>(Lcom/daaw/wb1;)V

    invoke-virtual {p1, p2, v0}, Lcom/daaw/rj1;->p(Ljava/util/concurrent/Executor;Lcom/daaw/ai1;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public p(Ljava/util/concurrent/Executor;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/vb1;->p:Lcom/daaw/vb1;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/wb1;->o(Lcom/daaw/vb1;Ljava/util/concurrent/Executor;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final q(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final r(Ljava/lang/String;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/wb1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/fh;->r(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "existing_instance_identifier"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 p1, 0x1

    return p1
.end method
