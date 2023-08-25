.class public Lcom/daaw/sx1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mj$a;


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lcom/daaw/rx1;

.field public final b:[Lcom/daaw/mj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/daaw/mj<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkConstraintsTracker"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/sx1;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/wj1;Lcom/daaw/rx1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p3, p0, Lcom/daaw/sx1;->a:Lcom/daaw/rx1;

    const/4 p3, 0x7

    new-array p3, p3, [Lcom/daaw/mj;

    new-instance v0, Lcom/daaw/jb;

    invoke-direct {v0, p1, p2}, Lcom/daaw/jb;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    const/4 v1, 0x0

    aput-object v0, p3, v1

    new-instance v0, Lcom/daaw/lb;

    invoke-direct {v0, p1, p2}, Lcom/daaw/lb;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    const/4 v1, 0x1

    aput-object v0, p3, v1

    new-instance v0, Lcom/daaw/ag1;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ag1;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    const/4 v1, 0x2

    aput-object v0, p3, v1

    new-instance v0, Lcom/daaw/ks0;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ks0;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    const/4 v1, 0x3

    aput-object v0, p3, v1

    new-instance v0, Lcom/daaw/rs0;

    invoke-direct {v0, p1, p2}, Lcom/daaw/rs0;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    const/4 v1, 0x4

    aput-object v0, p3, v1

    new-instance v0, Lcom/daaw/ns0;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ns0;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    const/4 v1, 0x5

    aput-object v0, p3, v1

    new-instance v0, Lcom/daaw/ms0;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ms0;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    const/4 p1, 0x6

    aput-object v0, p3, p1

    iput-object p3, p0, Lcom/daaw/sx1;->b:[Lcom/daaw/mj;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sx1;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/sx1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/daaw/sx1;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v3

    sget-object v4, Lcom/daaw/sx1;->d:Ljava/lang/String;

    const-string v5, "Constraints met for %s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v7, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v5, v6}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/sx1;->a:Lcom/daaw/rx1;

    if-eqz p1, :cond_2

    invoke-interface {p1, v1}, Lcom/daaw/rx1;->f(Ljava/util/List;)V

    :cond_2
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

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/sx1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/sx1;->a:Lcom/daaw/rx1;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lcom/daaw/rx1;->b(Ljava/util/List;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Ljava/lang/String;)Z
    .locals 8

    iget-object v0, p0, Lcom/daaw/sx1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/sx1;->b:[Lcom/daaw/mj;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_1

    aget-object v6, v1, v4

    invoke-virtual {v6, p1}, Lcom/daaw/mj;->d(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v1

    sget-object v2, Lcom/daaw/sx1;->d:Ljava/lang/String;

    const-string v4, "Work %s constrained by %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object p1, v7, v3

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v7, v5

    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v4, v3, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, p1, v4}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    monitor-exit v0

    return v3

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    monitor-exit v0

    return v5

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

.method public d(Ljava/lang/Iterable;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/daaw/qy1;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/sx1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/sx1;->b:[Lcom/daaw/mj;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lcom/daaw/mj;->g(Lcom/daaw/mj$a;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/sx1;->b:[Lcom/daaw/mj;

    array-length v2, v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    invoke-virtual {v5, p1}, Lcom/daaw/mj;->e(Ljava/lang/Iterable;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/daaw/sx1;->b:[Lcom/daaw/mj;

    array-length v1, p1

    :goto_2
    if-ge v3, v1, :cond_2

    aget-object v2, p1, v3

    invoke-virtual {v2, p0}, Lcom/daaw/mj;->g(Lcom/daaw/mj$a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method public e()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/sx1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/sx1;->b:[Lcom/daaw/mj;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lcom/daaw/mj;->f()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method
