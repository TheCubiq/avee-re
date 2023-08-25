.class public final Lcom/daaw/vj5;
.super Lcom/daaw/xj5;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/xj5;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzt()Lcom/google/android/gms/ads/internal/util/zzbv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/util/zzbv;->zzb()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/daaw/pt3;

    invoke-direct {v1, p1, v0, p0, p0}, Lcom/daaw/pt3;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/pa$a;Lcom/daaw/pa$b;)V

    iput-object v1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    return-void
.end method


# virtual methods
.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    const-string p1, "Cannot connect to remote service, fallback to local instance."

    invoke-static {p1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v0, Lcom/daaw/pk5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/pk5;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 4

    iget-object p1, p0, Lcom/daaw/xj5;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/xj5;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xj5;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {v1}, Lcom/daaw/pt3;->J()Lcom/daaw/xt3;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/xj5;->e:Lcom/google/android/gms/internal/ads/zzccb;

    new-instance v3, Lcom/daaw/wj5;

    invoke-direct {v3, p0}, Lcom/daaw/wj5;-><init>(Lcom/daaw/xj5;)V

    invoke-interface {v1, v2, v3}, Lcom/daaw/xt3;->L2(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/hu3;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v2

    const-string v3, "RemoteAdRequestClientTask.onConnected"

    invoke-virtual {v2, v1, v3}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/pk5;

    invoke-direct {v2, v0}, Lcom/daaw/pk5;-><init>(I)V

    :goto_0
    invoke-virtual {v1, v2}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    goto :goto_1

    :catch_0
    iget-object v1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/pk5;

    invoke-direct {v2, v0}, Lcom/daaw/pk5;-><init>(I)V

    goto :goto_0

    :cond_0
    :goto_1
    monitor-exit p1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method
