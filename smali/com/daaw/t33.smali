.class public final Lcom/daaw/t33;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/j33;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public b:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public final c:Landroid/content/Context;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/t33;->d:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/t33;->c:Landroid/content/Context;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/t33;)Lcom/daaw/j33;
    .locals 0

    iget-object p0, p0, Lcom/daaw/t33;->a:Lcom/daaw/j33;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/t33;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/t33;->d:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/t33;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/t33;->b:Z

    return-void
.end method

.method public static bridge synthetic e(Lcom/daaw/t33;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/t33;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/t33;->a:Lcom/daaw/j33;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/pa;->disconnect()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/t33;->a:Lcom/daaw/j33;

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic f(Lcom/daaw/t33;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/t33;->b:Z

    return p0
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/internal/ads/zzbei;)Ljava/util/concurrent/Future;
    .locals 6

    new-instance v0, Lcom/daaw/n33;

    invoke-direct {v0, p0}, Lcom/daaw/n33;-><init>(Lcom/daaw/t33;)V

    new-instance v1, Lcom/daaw/r33;

    invoke-direct {v1, p0, p1, v0}, Lcom/daaw/r33;-><init>(Lcom/daaw/t33;Lcom/google/android/gms/internal/ads/zzbei;Lcom/daaw/e14;)V

    new-instance p1, Lcom/daaw/s33;

    invoke-direct {p1, p0, v0}, Lcom/daaw/s33;-><init>(Lcom/daaw/t33;Lcom/daaw/e14;)V

    iget-object v2, p0, Lcom/daaw/t33;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    new-instance v3, Lcom/daaw/j33;

    iget-object v4, p0, Lcom/daaw/t33;->c:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzt()Lcom/google/android/gms/ads/internal/util/zzbv;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/ads/internal/util/zzbv;->zzb()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v3, v4, v5, v1, p1}, Lcom/daaw/j33;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/pa$a;Lcom/daaw/pa$b;)V

    iput-object v3, p0, Lcom/daaw/t33;->a:Lcom/daaw/j33;

    invoke-virtual {v3}, Lcom/daaw/pa;->checkAvailabilityAndConnect()V

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
