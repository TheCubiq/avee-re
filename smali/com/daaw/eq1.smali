.class public Lcom/daaw/eq1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/ba;

.field public final c:Lcom/daaw/ly;

.field public final d:Lcom/daaw/py1;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lcom/daaw/ri1;

.field public final g:Lcom/daaw/cg;

.field public final h:Lcom/daaw/cg;

.field public final i:Lcom/daaw/tf;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ba;Lcom/daaw/ly;Lcom/daaw/py1;Ljava/util/concurrent/Executor;Lcom/daaw/ri1;Lcom/daaw/cg;Lcom/daaw/cg;Lcom/daaw/tf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/eq1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/eq1;->b:Lcom/daaw/ba;

    iput-object p3, p0, Lcom/daaw/eq1;->c:Lcom/daaw/ly;

    iput-object p4, p0, Lcom/daaw/eq1;->d:Lcom/daaw/py1;

    iput-object p5, p0, Lcom/daaw/eq1;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    iput-object p7, p0, Lcom/daaw/eq1;->g:Lcom/daaw/cg;

    iput-object p8, p0, Lcom/daaw/eq1;->h:Lcom/daaw/cg;

    iput-object p9, p0, Lcom/daaw/eq1;->i:Lcom/daaw/tf;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/eq1;Lcom/daaw/sn1;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/eq1;->t(Lcom/daaw/sn1;ILjava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/eq1;Lcom/daaw/sn1;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/eq1;->l(Lcom/daaw/sn1;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/eq1;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/eq1;->q(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/eq1;Lcom/daaw/sn1;)Ljava/lang/Iterable;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/eq1;->m(Lcom/daaw/sn1;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/daaw/eq1;Ljava/lang/Iterable;Lcom/daaw/sn1;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/eq1;->n(Ljava/lang/Iterable;Lcom/daaw/sn1;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/eq1;Lcom/daaw/sn1;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/eq1;->r(Lcom/daaw/sn1;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/eq1;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/eq1;->o(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/daaw/eq1;Lcom/daaw/sn1;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/eq1;->s(Lcom/daaw/sn1;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/daaw/eq1;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/eq1;->p()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic l(Lcom/daaw/sn1;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eq1;->c:Lcom/daaw/ly;

    invoke-interface {v0, p1}, Lcom/daaw/ly;->l(Lcom/daaw/sn1;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Lcom/daaw/sn1;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eq1;->c:Lcom/daaw/ly;

    invoke-interface {v0, p1}, Lcom/daaw/ly;->y(Lcom/daaw/sn1;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Ljava/lang/Iterable;Lcom/daaw/sn1;J)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/eq1;->c:Lcom/daaw/ly;

    invoke-interface {v0, p1}, Lcom/daaw/ly;->O(Ljava/lang/Iterable;)V

    iget-object p1, p0, Lcom/daaw/eq1;->c:Lcom/daaw/ly;

    iget-object v0, p0, Lcom/daaw/eq1;->g:Lcom/daaw/cg;

    invoke-interface {v0}, Lcom/daaw/cg;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, p2, v0, v1}, Lcom/daaw/ly;->p(Lcom/daaw/sn1;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eq1;->c:Lcom/daaw/ly;

    invoke-interface {v0, p1}, Lcom/daaw/ly;->e(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eq1;->i:Lcom/daaw/tf;

    invoke-interface {v0}, Lcom/daaw/tf;->d()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic q(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/daaw/eq1;->i:Lcom/daaw/tf;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Lcom/daaw/dl0$b;->v:Lcom/daaw/dl0$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, v0}, Lcom/daaw/tf;->u(JLcom/daaw/dl0$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic r(Lcom/daaw/sn1;J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/eq1;->c:Lcom/daaw/ly;

    iget-object v1, p0, Lcom/daaw/eq1;->g:Lcom/daaw/cg;

    invoke-interface {v1}, Lcom/daaw/cg;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/ly;->p(Lcom/daaw/sn1;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(Lcom/daaw/sn1;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eq1;->d:Lcom/daaw/py1;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lcom/daaw/py1;->a(Lcom/daaw/sn1;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic t(Lcom/daaw/sn1;ILjava/lang/Runnable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    iget-object v1, p0, Lcom/daaw/eq1;->c:Lcom/daaw/ly;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/daaw/vp1;

    invoke-direct {v2, v1}, Lcom/daaw/vp1;-><init>(Lcom/daaw/ly;)V

    invoke-interface {v0, v2}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/daaw/eq1;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    new-instance v1, Lcom/daaw/zp1;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/zp1;-><init>(Lcom/daaw/eq1;Lcom/daaw/sn1;I)V

    invoke-interface {v0, v1}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/daaw/eq1;->u(Lcom/daaw/sn1;I)Lcom/daaw/da;
    :try_end_0
    .catch Lcom/daaw/qi1; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/eq1;->d:Lcom/daaw/py1;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lcom/daaw/py1;->a(Lcom/daaw/sn1;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    throw p1
.end method


# virtual methods
.method public j(Lcom/daaw/rn1;)Lcom/daaw/by;
    .locals 4

    iget-object v0, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    iget-object v1, p0, Lcom/daaw/eq1;->i:Lcom/daaw/tf;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/daaw/tp1;

    invoke-direct {v2, v1}, Lcom/daaw/tp1;-><init>(Lcom/daaw/tf;)V

    invoke-interface {v0, v2}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/wf;

    invoke-static {}, Lcom/daaw/by;->a()Lcom/daaw/by$a;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/eq1;->g:Lcom/daaw/cg;

    invoke-interface {v2}, Lcom/daaw/cg;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/by$a;->i(J)Lcom/daaw/by$a;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/eq1;->h:Lcom/daaw/cg;

    invoke-interface {v2}, Lcom/daaw/cg;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/by$a;->k(J)Lcom/daaw/by$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    invoke-virtual {v1, v2}, Lcom/daaw/by$a;->j(Ljava/lang/String;)Lcom/daaw/by$a;

    move-result-object v1

    new-instance v2, Lcom/daaw/ww;

    const-string v3, "proto"

    invoke-static {v3}, Lcom/daaw/bx;->b(Ljava/lang/String;)Lcom/daaw/bx;

    move-result-object v3

    invoke-virtual {v0}, Lcom/daaw/wf;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/daaw/ww;-><init>(Lcom/daaw/bx;[B)V

    invoke-virtual {v1, v2}, Lcom/daaw/by$a;->h(Lcom/daaw/ww;)Lcom/daaw/by$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/by$a;->d()Lcom/daaw/by;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/rn1;->b(Lcom/daaw/by;)Lcom/daaw/by;

    move-result-object p1

    return-object p1
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/eq1;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u(Lcom/daaw/sn1;I)Lcom/daaw/da;
    .locals 11

    iget-object v0, p0, Lcom/daaw/eq1;->b:Lcom/daaw/ba;

    invoke-virtual {p1}, Lcom/daaw/sn1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/ba;->a(Ljava/lang/String;)Lcom/daaw/rn1;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Lcom/daaw/da;->e(J)Lcom/daaw/da;

    move-result-object v3

    :cond_0
    :goto_0
    move-wide v8, v1

    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    new-instance v2, Lcom/daaw/xp1;

    invoke-direct {v2, p0, p1}, Lcom/daaw/xp1;-><init>(Lcom/daaw/eq1;Lcom/daaw/sn1;)V

    invoke-interface {v1, v2}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    new-instance v2, Lcom/daaw/yp1;

    invoke-direct {v2, p0, p1}, Lcom/daaw/yp1;-><init>(Lcom/daaw/eq1;Lcom/daaw/sn1;)V

    invoke-interface {v1, v2}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v3

    :cond_2
    if-nez v0, :cond_3

    const-string v1, "Uploader"

    const-string v2, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v1, v2, p1}, Lcom/daaw/nl0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/daaw/da;->a()Lcom/daaw/da;

    move-result-object v1

    :goto_2
    move-object v3, v1

    goto :goto_4

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/iw0;

    invoke-virtual {v3}, Lcom/daaw/iw0;->b()Lcom/daaw/by;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/daaw/sn1;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Lcom/daaw/eq1;->j(Lcom/daaw/rn1;)Lcom/daaw/by;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {}, Lcom/daaw/ca;->a()Lcom/daaw/ca$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/ca$a;->b(Ljava/lang/Iterable;)Lcom/daaw/ca$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/sn1;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/ca$a;->c([B)Lcom/daaw/ca$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/ca$a;->a()Lcom/daaw/ca;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/rn1;->a(Lcom/daaw/ca;)Lcom/daaw/da;

    move-result-object v1

    goto :goto_2

    :goto_4
    invoke-virtual {v3}, Lcom/daaw/da;->c()Lcom/daaw/da$a;

    move-result-object v1

    sget-object v2, Lcom/daaw/da$a;->q:Lcom/daaw/da$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_6

    iget-object v0, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    new-instance v1, Lcom/daaw/cq1;

    move-object v4, v1

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Lcom/daaw/cq1;-><init>(Lcom/daaw/eq1;Ljava/lang/Iterable;Lcom/daaw/sn1;J)V

    invoke-interface {v0, v1}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/eq1;->d:Lcom/daaw/py1;

    add-int/2addr p2, v10

    invoke-interface {v0, p1, p2, v10}, Lcom/daaw/py1;->b(Lcom/daaw/sn1;IZ)V

    return-object v3

    :cond_6
    iget-object v1, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    new-instance v2, Lcom/daaw/bq1;

    invoke-direct {v2, p0, v6}, Lcom/daaw/bq1;-><init>(Lcom/daaw/eq1;Ljava/lang/Iterable;)V

    invoke-interface {v1, v2}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/daaw/da;->c()Lcom/daaw/da$a;

    move-result-object v1

    sget-object v2, Lcom/daaw/da$a;->p:Lcom/daaw/da$a;

    if-ne v1, v2, :cond_7

    invoke-virtual {v3}, Lcom/daaw/da;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/daaw/sn1;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    new-instance v5, Lcom/daaw/wp1;

    invoke-direct {v5, p0}, Lcom/daaw/wp1;-><init>(Lcom/daaw/eq1;)V

    invoke-interface {v4, v5}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v3}, Lcom/daaw/da;->c()Lcom/daaw/da$a;

    move-result-object v1

    sget-object v2, Lcom/daaw/da$a;->s:Lcom/daaw/da$a;

    if-ne v1, v2, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/iw0;

    invoke-virtual {v4}, Lcom/daaw/iw0;->b()Lcom/daaw/by;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/by;->j()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_6

    :cond_8
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_6
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    iget-object v2, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    new-instance v4, Lcom/daaw/dq1;

    invoke-direct {v4, p0, v1}, Lcom/daaw/dq1;-><init>(Lcom/daaw/eq1;Ljava/util/Map;)V

    invoke-interface {v2, v4}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_a
    iget-object p2, p0, Lcom/daaw/eq1;->f:Lcom/daaw/ri1;

    new-instance v0, Lcom/daaw/aq1;

    invoke-direct {v0, p0, p1, v8, v9}, Lcom/daaw/aq1;-><init>(Lcom/daaw/eq1;Lcom/daaw/sn1;J)V

    invoke-interface {p2, v0}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public v(Lcom/daaw/sn1;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/eq1;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/up1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/up1;-><init>(Lcom/daaw/eq1;Lcom/daaw/sn1;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
