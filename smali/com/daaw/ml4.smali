.class public final Lcom/daaw/ml4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fs4;
.implements Lcom/daaw/ir4;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/a74;

.field public final r:Lcom/daaw/th6;

.field public final s:Lcom/google/android/gms/internal/ads/zzchu;

.field public t:Lcom/daaw/yd0;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public u:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/a74;Lcom/daaw/th6;Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ml4;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ml4;->q:Lcom/daaw/a74;

    iput-object p3, p0, Lcom/daaw/ml4;->r:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/ml4;->s:Lcom/google/android/gms/internal/ads/zzchu;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 12

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ml4;->r:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->U:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/ml4;->q:Lcom/daaw/a74;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ml4;->p:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/daaw/nq5;->d(Landroid/content/Context;)Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/daaw/ml4;->s:Lcom/google/android/gms/internal/ads/zzchu;

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzchu;->q:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/ml4;->r:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->W:Lcom/daaw/ui6;

    invoke-virtual {v0}, Lcom/daaw/ui6;->a()Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, Lcom/daaw/ml4;->r:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->W:Lcom/daaw/ui6;

    invoke-virtual {v0}, Lcom/daaw/ui6;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    sget-object v0, Lcom/daaw/oq5;->s:Lcom/daaw/oq5;

    sget-object v2, Lcom/daaw/pq5;->r:Lcom/daaw/pq5;

    :goto_0
    move-object v10, v0

    move-object v9, v2

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/daaw/oq5;->q:Lcom/daaw/oq5;

    iget-object v2, p0, Lcom/daaw/ml4;->r:Lcom/daaw/th6;

    iget v2, v2, Lcom/daaw/th6;->f:I

    if-ne v2, v1, :cond_4

    sget-object v2, Lcom/daaw/pq5;->s:Lcom/daaw/pq5;

    goto :goto_0

    :cond_4
    sget-object v2, Lcom/daaw/pq5;->q:Lcom/daaw/pq5;

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/ml4;->q:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->h()Landroid/webkit/WebView;

    move-result-object v5

    const-string v6, ""

    const-string v7, "javascript"

    iget-object v0, p0, Lcom/daaw/ml4;->r:Lcom/daaw/th6;

    iget-object v11, v0, Lcom/daaw/th6;->n0:Ljava/lang/String;

    invoke-interface/range {v3 .. v11}, Lcom/daaw/nq5;->c(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/pq5;Lcom/daaw/oq5;Ljava/lang/String;)Lcom/daaw/yd0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ml4;->t:Lcom/daaw/yd0;

    iget-object v2, p0, Lcom/daaw/ml4;->q:Lcom/daaw/a74;

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v0

    iget-object v3, p0, Lcom/daaw/ml4;->t:Lcom/daaw/yd0;

    check-cast v2, Landroid/view/View;

    invoke-interface {v0, v3, v2}, Lcom/daaw/nq5;->b(Lcom/daaw/yd0;Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/ml4;->q:Lcom/daaw/a74;

    iget-object v2, p0, Lcom/daaw/ml4;->t:Lcom/daaw/yd0;

    invoke-interface {v0, v2}, Lcom/daaw/a74;->R(Lcom/daaw/yd0;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/ml4;->t:Lcom/daaw/yd0;

    invoke-interface {v0, v2}, Lcom/daaw/nq5;->zzd(Lcom/daaw/yd0;)V

    iput-boolean v1, p0, Lcom/daaw/ml4;->u:Z

    iget-object v0, p0, Lcom/daaw/ml4;->q:Lcom/daaw/a74;

    new-instance v1, Lcom/daaw/g6;

    invoke-direct {v1}, Lcom/daaw/g6;-><init>()V

    const-string v2, "onSdkLoaded"

    invoke-interface {v0, v2, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public final declared-synchronized zzl()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/ml4;->u:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ml4;->a()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/ml4;->r:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->U:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ml4;->t:Lcom/daaw/yd0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ml4;->q:Lcom/daaw/a74;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/daaw/g6;

    invoke-direct {v1}, Lcom/daaw/g6;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzn()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/ml4;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/daaw/ml4;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
