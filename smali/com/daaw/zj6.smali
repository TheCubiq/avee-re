.class public final Lcom/daaw/zj6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/oq4;


# instance fields
.field public final p:Ljava/util/HashSet;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public final q:Landroid/content/Context;

.field public final r:Lcom/daaw/xz3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/xz3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/zj6;->p:Ljava/util/HashSet;

    iput-object p1, p0, Lcom/daaw/zj6;->q:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/zj6;->r:Lcom/daaw/xz3;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lcom/daaw/zj6;->r:Lcom/daaw/xz3;

    iget-object v1, p0, Lcom/daaw/zj6;->q:Landroid/content/Context;

    invoke-virtual {v0, v1, p0}, Lcom/daaw/xz3;->j(Landroid/content/Context;Lcom/daaw/zj6;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized b(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/zj6;->r:Lcom/daaw/xz3;

    iget-object v0, p0, Lcom/daaw/zj6;->p:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Lcom/daaw/xz3;->h(Ljava/util/HashSet;)V
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

.method public final declared-synchronized c(Ljava/util/HashSet;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zj6;->p:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    iget-object v0, p0, Lcom/daaw/zj6;->p:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
