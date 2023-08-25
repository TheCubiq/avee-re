.class public final Lcom/daaw/ny4;
.super Lcom/daaw/kw4;
.source ""

# interfaces
.implements Lcom/daaw/q03;


# instance fields
.field public final q:Ljava/util/Map;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public final r:Landroid/content/Context;

.field public final s:Lcom/daaw/th6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Lcom/daaw/th6;)V
    .locals 1

    invoke-direct {p0, p2}, Lcom/daaw/kw4;-><init>(Ljava/util/Set;)V

    new-instance p2, Ljava/util/WeakHashMap;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Ljava/util/WeakHashMap;-><init>(I)V

    iput-object p2, p0, Lcom/daaw/ny4;->q:Ljava/util/Map;

    iput-object p1, p0, Lcom/daaw/ny4;->r:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/ny4;->s:Lcom/daaw/th6;

    return-void
.end method


# virtual methods
.method public final declared-synchronized C0(Landroid/view/View;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ny4;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/r03;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/r03;

    iget-object v1, p0, Lcom/daaw/ny4;->r:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/daaw/r03;-><init>(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v0, p0}, Lcom/daaw/r03;->c(Lcom/daaw/q03;)V

    iget-object v1, p0, Lcom/daaw/ny4;->q:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, Lcom/daaw/ny4;->s:Lcom/daaw/th6;

    iget-boolean p1, p1, Lcom/daaw/th6;->Y:Z

    if-eqz p1, :cond_1

    sget-object p1, Lcom/daaw/g93;->h1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/daaw/g93;->g1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r03;->g(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lcom/daaw/r03;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized D0(Landroid/view/View;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ny4;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ny4;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/r03;

    invoke-virtual {v0, p0}, Lcom/daaw/r03;->e(Lcom/daaw/q03;)V

    iget-object v0, p0, Lcom/daaw/ny4;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized e0(Lcom/daaw/p03;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/daaw/my4;

    invoke-direct {v0, p1}, Lcom/daaw/my4;-><init>(Lcom/daaw/p03;)V

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
