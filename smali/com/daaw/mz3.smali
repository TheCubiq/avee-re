.class public final Lcom/daaw/mz3;
.super Lcom/google/android/gms/ads/internal/util/zzb;
.source ""


# instance fields
.field public final synthetic c:Lcom/daaw/qz3;


# direct methods
.method public constructor <init>(Lcom/daaw/qz3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mz3;->c:Lcom/daaw/qz3;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/util/zzb;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    new-instance v0, Lcom/daaw/j93;

    iget-object v1, p0, Lcom/daaw/mz3;->c:Lcom/daaw/qz3;

    invoke-static {v1}, Lcom/daaw/qz3;->b(Lcom/daaw/qz3;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v1}, Lcom/daaw/qz3;->i(Lcom/daaw/qz3;)Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Lcom/daaw/j93;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/mz3;->c:Lcom/daaw/qz3;

    invoke-static {v1}, Lcom/daaw/qz3;->l(Lcom/daaw/qz3;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zze()Lcom/daaw/m93;

    iget-object v2, p0, Lcom/daaw/mz3;->c:Lcom/daaw/qz3;

    invoke-static {v2}, Lcom/daaw/qz3;->e(Lcom/daaw/qz3;)Lcom/daaw/l93;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/daaw/m93;->a(Lcom/daaw/l93;Lcom/daaw/j93;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    const-string v2, "Cannot config CSI reporter."

    invoke-static {v2, v0}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
