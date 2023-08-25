.class public Lcom/daaw/d20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e20;


# static fields
.field public static final m:Ljava/lang/Object;

.field public static final n:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final a:Lcom/daaw/s10;

.field public final b:Lcom/daaw/z10;

.field public final c:Lcom/daaw/jw0;

.field public final d:Lcom/daaw/ar1;

.field public final e:Lcom/daaw/xi0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xi0<",
            "Lcom/daaw/ve0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lcom/daaw/b31;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/ExecutorService;

.field public final i:Ljava/util/concurrent/ExecutorService;

.field public j:Ljava/lang/String;

.field public k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/p00;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/mf1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/d20;->m:Ljava/lang/Object;

    new-instance v0, Lcom/daaw/d20$a;

    invoke-direct {v0}, Lcom/daaw/d20$a;-><init>()V

    sput-object v0, Lcom/daaw/d20;->n:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/s10;Lcom/daaw/b01;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/s10;",
            "Lcom/daaw/b01<",
            "Lcom/daaw/va0;",
            ">;)V"
        }
    .end annotation

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sget-object v7, Lcom/daaw/d20;->n:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x1e

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v3, Lcom/daaw/z10;

    invoke-virtual {p1}, Lcom/daaw/s10;->j()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0, p2}, Lcom/daaw/z10;-><init>(Landroid/content/Context;Lcom/daaw/b01;)V

    new-instance v4, Lcom/daaw/jw0;

    invoke-direct {v4, p1}, Lcom/daaw/jw0;-><init>(Lcom/daaw/s10;)V

    invoke-static {}, Lcom/daaw/ar1;->c()Lcom/daaw/ar1;

    move-result-object v5

    new-instance v6, Lcom/daaw/xi0;

    new-instance p2, Lcom/daaw/a20;

    invoke-direct {p2, p1}, Lcom/daaw/a20;-><init>(Lcom/daaw/s10;)V

    invoke-direct {v6, p2}, Lcom/daaw/xi0;-><init>(Lcom/daaw/b01;)V

    new-instance v7, Lcom/daaw/b31;

    invoke-direct {v7}, Lcom/daaw/b31;-><init>()V

    move-object v0, p0

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lcom/daaw/d20;-><init>(Ljava/util/concurrent/ExecutorService;Lcom/daaw/s10;Lcom/daaw/z10;Lcom/daaw/jw0;Lcom/daaw/ar1;Lcom/daaw/xi0;Lcom/daaw/b31;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Lcom/daaw/s10;Lcom/daaw/z10;Lcom/daaw/jw0;Lcom/daaw/ar1;Lcom/daaw/xi0;Lcom/daaw/b31;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ExecutorService;",
            "Lcom/daaw/s10;",
            "Lcom/daaw/z10;",
            "Lcom/daaw/jw0;",
            "Lcom/daaw/ar1;",
            "Lcom/daaw/xi0<",
            "Lcom/daaw/ve0;",
            ">;",
            "Lcom/daaw/b31;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/daaw/d20;->g:Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, v0, Lcom/daaw/d20;->k:Ljava/util/Set;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/daaw/d20;->l:Ljava/util/List;

    move-object v1, p2

    iput-object v1, v0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    move-object v1, p3

    iput-object v1, v0, Lcom/daaw/d20;->b:Lcom/daaw/z10;

    move-object v1, p4

    iput-object v1, v0, Lcom/daaw/d20;->c:Lcom/daaw/jw0;

    move-object v1, p5

    iput-object v1, v0, Lcom/daaw/d20;->d:Lcom/daaw/ar1;

    move-object/from16 v1, p6

    iput-object v1, v0, Lcom/daaw/d20;->e:Lcom/daaw/xi0;

    move-object/from16 v1, p7

    iput-object v1, v0, Lcom/daaw/d20;->f:Lcom/daaw/b31;

    move-object v1, p1

    iput-object v1, v0, Lcom/daaw/d20;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sget-object v8, Lcom/daaw/d20;->n:Ljava/util/concurrent/ThreadFactory;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-wide/16 v4, 0x1e

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v9, v0, Lcom/daaw/d20;->i:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/s10;)Lcom/daaw/ve0;
    .locals 0

    invoke-static {p0}, Lcom/daaw/d20;->u(Lcom/daaw/s10;)Lcom/daaw/ve0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/d20;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/d20;->t()V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/d20;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/d20;->s(Z)V

    return-void
.end method

.method public static m()Lcom/daaw/d20;
    .locals 1

    invoke-static {}, Lcom/daaw/s10;->k()Lcom/daaw/s10;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/d20;->n(Lcom/daaw/s10;)Lcom/daaw/d20;

    move-result-object v0

    return-object v0
.end method

.method public static n(Lcom/daaw/s10;)Lcom/daaw/d20;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Null is not a valid value of FirebaseApp."

    invoke-static {v0, v1}, Lcom/daaw/ry0;->b(ZLjava/lang/Object;)V

    const-class v0, Lcom/daaw/e20;

    invoke-virtual {p0, v0}, Lcom/daaw/s10;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/d20;

    return-object p0
.end method

.method private synthetic s(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/d20;->f(Z)V

    return-void
.end method

.method private synthetic t()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/d20;->g(Z)V

    return-void
.end method

.method public static synthetic u(Lcom/daaw/s10;)Lcom/daaw/ve0;
    .locals 1

    new-instance v0, Lcom/daaw/ve0;

    invoke-direct {v0, p0}, Lcom/daaw/ve0;-><init>(Lcom/daaw/s10;)V

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized A(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/daaw/d20;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized B(Lcom/daaw/kw0;Lcom/daaw/kw0;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/d20;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/kw0;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/daaw/kw0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/d20;->k:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/p00;

    invoke-virtual {p2}, Lcom/daaw/kw0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/p00;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final d()Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    new-instance v1, Lcom/daaw/i60;

    invoke-direct {v1, v0}, Lcom/daaw/i60;-><init>(Lcom/daaw/tj1;)V

    invoke-virtual {p0, v1}, Lcom/daaw/d20;->e(Lcom/daaw/mf1;)V

    invoke-virtual {v0}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lcom/daaw/mf1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/d20;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/d20;->l:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final f(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/d20;->o()Lcom/daaw/kw0;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/kw0;->i()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/daaw/kw0;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/d20;->d:Lcom/daaw/ar1;

    invoke-virtual {p1, v0}, Lcom/daaw/ar1;->f(Lcom/daaw/kw0;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/d20;->h(Lcom/daaw/kw0;)Lcom/daaw/kw0;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0, v0}, Lcom/daaw/d20;->x(Lcom/daaw/kw0;)Lcom/daaw/kw0;

    move-result-object p1
    :try_end_0
    .catch Lcom/daaw/f20; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    invoke-virtual {p0, p1}, Lcom/daaw/d20;->r(Lcom/daaw/kw0;)V

    invoke-virtual {p0, v0, p1}, Lcom/daaw/d20;->B(Lcom/daaw/kw0;Lcom/daaw/kw0;)V

    invoke-virtual {p1}, Lcom/daaw/kw0;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/daaw/kw0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/d20;->A(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p1}, Lcom/daaw/kw0;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Lcom/daaw/f20;

    sget-object v0, Lcom/daaw/f20$a;->p:Lcom/daaw/f20$a;

    invoke-direct {p1, v0}, Lcom/daaw/f20;-><init>(Lcom/daaw/f20$a;)V

    :goto_3
    invoke-virtual {p0, p1}, Lcom/daaw/d20;->y(Ljava/lang/Exception;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/daaw/kw0;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    invoke-virtual {p0, p1}, Lcom/daaw/d20;->z(Lcom/daaw/kw0;)V

    :goto_4
    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lcom/daaw/d20;->y(Ljava/lang/Exception;)V

    return-void
.end method

.method public final g(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/d20;->p()Lcom/daaw/kw0;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/kw0;->p()Lcom/daaw/kw0;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/d20;->z(Lcom/daaw/kw0;)V

    iget-object v0, p0, Lcom/daaw/d20;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/daaw/c20;

    invoke-direct {v1, p0, p1}, Lcom/daaw/c20;-><init>(Lcom/daaw/d20;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getId()Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/d20;->v()V

    invoke-virtual {p0}, Lcom/daaw/d20;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/d20;->d()Lcom/daaw/rj1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d20;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/daaw/b20;

    invoke-direct {v2, p0}, Lcom/daaw/b20;-><init>(Lcom/daaw/d20;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final h(Lcom/daaw/kw0;)Lcom/daaw/kw0;
    .locals 6

    iget-object v0, p0, Lcom/daaw/d20;->b:Lcom/daaw/z10;

    invoke-virtual {p0}, Lcom/daaw/d20;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/kw0;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/daaw/d20;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/daaw/kw0;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/z10;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/bm1;

    move-result-object v0

    sget-object v1, Lcom/daaw/d20$b;->b:[I

    invoke-virtual {v0}, Lcom/daaw/bm1;->b()Lcom/daaw/bm1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/d20;->A(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/daaw/kw0;->r()Lcom/daaw/kw0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/daaw/f20;

    sget-object v0, Lcom/daaw/f20$a;->q:Lcom/daaw/f20$a;

    const-string v1, "Firebase Installations Service is unavailable. Please try again later."

    invoke-direct {p1, v1, v0}, Lcom/daaw/f20;-><init>(Ljava/lang/String;Lcom/daaw/f20$a;)V

    throw p1

    :cond_1
    const-string v0, "BAD CONFIG"

    invoke-virtual {p1, v0}, Lcom/daaw/kw0;->q(Ljava/lang/String;)Lcom/daaw/kw0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/bm1;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/bm1;->d()J

    move-result-wide v2

    iget-object v0, p0, Lcom/daaw/d20;->d:Lcom/daaw/ar1;

    invoke-virtual {v0}, Lcom/daaw/ar1;->b()J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/kw0;->o(Ljava/lang/String;JJ)Lcom/daaw/kw0;

    move-result-object p1

    return-object p1
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    invoke-virtual {v0}, Lcom/daaw/s10;->m()Lcom/daaw/h20;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/h20;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    invoke-virtual {v0}, Lcom/daaw/s10;->m()Lcom/daaw/h20;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/h20;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized k()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/d20;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final l()Lcom/daaw/ve0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d20;->e:Lcom/daaw/xi0;

    invoke-virtual {v0}, Lcom/daaw/xi0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ve0;

    return-object v0
.end method

.method public final o()Lcom/daaw/kw0;
    .locals 3

    sget-object v0, Lcom/daaw/d20;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    invoke-virtual {v1}, Lcom/daaw/s10;->j()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lcom/daaw/in;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/in;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lcom/daaw/d20;->c:Lcom/daaw/jw0;

    invoke-virtual {v2}, Lcom/daaw/jw0;->d()Lcom/daaw/kw0;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Lcom/daaw/in;->b()V

    :cond_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/daaw/in;->b()V

    :cond_1
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final p()Lcom/daaw/kw0;
    .locals 5

    sget-object v0, Lcom/daaw/d20;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    invoke-virtual {v1}, Lcom/daaw/s10;->j()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lcom/daaw/in;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/in;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lcom/daaw/d20;->c:Lcom/daaw/jw0;

    invoke-virtual {v2}, Lcom/daaw/jw0;->d()Lcom/daaw/kw0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/kw0;->j()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Lcom/daaw/d20;->w(Lcom/daaw/kw0;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/d20;->c:Lcom/daaw/jw0;

    invoke-virtual {v2, v3}, Lcom/daaw/kw0;->t(Ljava/lang/String;)Lcom/daaw/kw0;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/daaw/jw0;->b(Lcom/daaw/kw0;)Lcom/daaw/kw0;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    if-eqz v1, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lcom/daaw/in;->b()V

    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/daaw/in;->b()V

    :cond_2
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    invoke-virtual {v0}, Lcom/daaw/s10;->m()Lcom/daaw/h20;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/h20;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final r(Lcom/daaw/kw0;)V
    .locals 3

    sget-object v0, Lcom/daaw/d20;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    invoke-virtual {v1}, Lcom/daaw/s10;->j()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lcom/daaw/in;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/in;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lcom/daaw/d20;->c:Lcom/daaw/jw0;

    invoke-virtual {v2, p1}, Lcom/daaw/jw0;->b(Lcom/daaw/kw0;)Lcom/daaw/kw0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Lcom/daaw/in;->b()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/daaw/in;->b()V

    :cond_1
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final v()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/d20;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v1}, Lcom/daaw/ry0;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/d20;->q()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v2}, Lcom/daaw/ry0;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/d20;->i()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v2}, Lcom/daaw/ry0;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/d20;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ar1;->h(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0, v1}, Lcom/daaw/ry0;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/d20;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ar1;->g(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0, v2}, Lcom/daaw/ry0;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public final w(Lcom/daaw/kw0;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    invoke-virtual {v0}, Lcom/daaw/s10;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CHIME_ANDROID_SDK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/d20;->a:Lcom/daaw/s10;

    invoke-virtual {v0}, Lcom/daaw/s10;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/kw0;->m()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/daaw/d20;->f:Lcom/daaw/b31;

    invoke-virtual {p1}, Lcom/daaw/b31;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/d20;->l()Lcom/daaw/ve0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ve0;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/daaw/d20;->f:Lcom/daaw/b31;

    invoke-virtual {p1}, Lcom/daaw/b31;->a()Ljava/lang/String;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final x(Lcom/daaw/kw0;)Lcom/daaw/kw0;
    .locals 10

    invoke-virtual {p1}, Lcom/daaw/kw0;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/kw0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/d20;->l()Lcom/daaw/ve0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ve0;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v6, v0

    iget-object v1, p0, Lcom/daaw/d20;->b:Lcom/daaw/z10;

    invoke-virtual {p0}, Lcom/daaw/d20;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/daaw/kw0;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/daaw/d20;->q()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/daaw/d20;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/z10;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ig0;

    move-result-object v0

    sget-object v1, Lcom/daaw/d20$b;->a:[I

    invoke-virtual {v0}, Lcom/daaw/ig0;->e()Lcom/daaw/ig0$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    const-string v0, "BAD CONFIG"

    invoke-virtual {p1, v0}, Lcom/daaw/kw0;->q(Ljava/lang/String;)Lcom/daaw/kw0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/f20;

    sget-object v0, Lcom/daaw/f20$a;->q:Lcom/daaw/f20$a;

    const-string v1, "Firebase Installations Service is unavailable. Please try again later."

    invoke-direct {p1, v1, v0}, Lcom/daaw/f20;-><init>(Ljava/lang/String;Lcom/daaw/f20$a;)V

    throw p1

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/ig0;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/daaw/ig0;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/daaw/d20;->d:Lcom/daaw/ar1;

    invoke-virtual {v1}, Lcom/daaw/ar1;->b()J

    move-result-wide v5

    invoke-virtual {v0}, Lcom/daaw/ig0;->b()Lcom/daaw/bm1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/bm1;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/daaw/ig0;->b()Lcom/daaw/bm1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/bm1;->d()J

    move-result-wide v8

    move-object v2, p1

    invoke-virtual/range {v2 .. v9}, Lcom/daaw/kw0;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lcom/daaw/kw0;

    move-result-object p1

    return-object p1
.end method

.method public final y(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/d20;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/d20;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/mf1;

    invoke-interface {v2, p1}, Lcom/daaw/mf1;->a(Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final z(Lcom/daaw/kw0;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/d20;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/d20;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/mf1;

    invoke-interface {v2, p1}, Lcom/daaw/mf1;->b(Lcom/daaw/kw0;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
