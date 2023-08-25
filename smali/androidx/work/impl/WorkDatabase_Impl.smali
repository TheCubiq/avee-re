.class public final Landroidx/work/impl/WorkDatabase_Impl;
.super Landroidx/work/impl/WorkDatabase;
.source ""


# instance fields
.field public volatile m:Lcom/daaw/ry1;

.field public volatile n:Lcom/daaw/bt;

.field public volatile o:Lcom/daaw/uy1;

.field public volatile p:Lcom/daaw/zi1;

.field public volatile q:Lcom/daaw/hy1;

.field public volatile r:Lcom/daaw/ky1;

.field public volatile s:Lcom/daaw/xy0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase;-><init>()V

    return-void
.end method

.method public static synthetic D(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic E(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic F(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic G(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic H(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic I(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic J(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic K(Landroidx/work/impl/WorkDatabase_Impl;Lcom/daaw/ji1;)Lcom/daaw/ji1;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b61;->a:Lcom/daaw/ji1;

    return-object p1
.end method

.method public static synthetic L(Landroidx/work/impl/WorkDatabase_Impl;Lcom/daaw/ji1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/b61;->m(Lcom/daaw/ji1;)V

    return-void
.end method

.method public static synthetic M(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic N(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public A()Lcom/daaw/ky1;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Lcom/daaw/ky1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Lcom/daaw/ky1;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Lcom/daaw/ky1;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/ly1;

    invoke-direct {v0, p0}, Lcom/daaw/ly1;-><init>(Lcom/daaw/b61;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Lcom/daaw/ky1;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Lcom/daaw/ky1;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public B()Lcom/daaw/ry1;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lcom/daaw/ry1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lcom/daaw/ry1;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lcom/daaw/ry1;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/sy1;

    invoke-direct {v0, p0}, Lcom/daaw/sy1;-><init>(Lcom/daaw/b61;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lcom/daaw/ry1;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lcom/daaw/ry1;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public C()Lcom/daaw/uy1;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lcom/daaw/uy1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lcom/daaw/uy1;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lcom/daaw/uy1;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/vy1;

    invoke-direct {v0, p0}, Lcom/daaw/vy1;-><init>(Lcom/daaw/b61;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lcom/daaw/uy1;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lcom/daaw/uy1;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public e()Landroidx/room/c;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/c;

    const-string v3, "Dependency"

    const-string v4, "WorkSpec"

    const-string v5, "WorkTag"

    const-string v6, "SystemIdInfo"

    const-string v7, "WorkName"

    const-string v8, "WorkProgress"

    const-string v9, "Preference"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/c;-><init>(Lcom/daaw/b61;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method public f(Lcom/daaw/sp;)Lcom/daaw/ki1;
    .locals 4

    new-instance v0, Lcom/daaw/d61;

    new-instance v1, Landroidx/work/impl/WorkDatabase_Impl$a;

    const/16 v2, 0xc

    invoke-direct {v1, p0, v2}, Landroidx/work/impl/WorkDatabase_Impl$a;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    const-string v2, "c103703e120ae8cc73c9248622f3cd1e"

    const-string v3, "49f946663a8deb7054212b8adda248c6"

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/daaw/d61;-><init>(Lcom/daaw/sp;Lcom/daaw/d61$a;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lcom/daaw/sp;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/daaw/ki1$b;->a(Landroid/content/Context;)Lcom/daaw/ki1$b$a;

    move-result-object v1

    iget-object v2, p1, Lcom/daaw/sp;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/daaw/ki1$b$a;->c(Ljava/lang/String;)Lcom/daaw/ki1$b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/ki1$b$a;->b(Lcom/daaw/ki1$a;)Lcom/daaw/ki1$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ki1$b$a;->a()Lcom/daaw/ki1$b;

    move-result-object v0

    iget-object p1, p1, Lcom/daaw/sp;->a:Lcom/daaw/ki1$c;

    invoke-interface {p1, v0}, Lcom/daaw/ki1$c;->a(Lcom/daaw/ki1$b;)Lcom/daaw/ki1;

    move-result-object p1

    return-object p1
.end method

.method public t()Lcom/daaw/bt;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lcom/daaw/bt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lcom/daaw/bt;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lcom/daaw/bt;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/ct;

    invoke-direct {v0, p0}, Lcom/daaw/ct;-><init>(Lcom/daaw/b61;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lcom/daaw/bt;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lcom/daaw/bt;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public x()Lcom/daaw/xy0;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Lcom/daaw/xy0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Lcom/daaw/xy0;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Lcom/daaw/xy0;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/yy0;

    invoke-direct {v0, p0}, Lcom/daaw/yy0;-><init>(Lcom/daaw/b61;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Lcom/daaw/xy0;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Lcom/daaw/xy0;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public y()Lcom/daaw/zi1;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lcom/daaw/zi1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lcom/daaw/zi1;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lcom/daaw/zi1;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/aj1;

    invoke-direct {v0, p0}, Lcom/daaw/aj1;-><init>(Lcom/daaw/b61;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lcom/daaw/zi1;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lcom/daaw/zi1;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public z()Lcom/daaw/hy1;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lcom/daaw/hy1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lcom/daaw/hy1;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lcom/daaw/hy1;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/iy1;

    invoke-direct {v0, p0}, Lcom/daaw/iy1;-><init>(Lcom/daaw/b61;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lcom/daaw/hy1;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lcom/daaw/hy1;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
