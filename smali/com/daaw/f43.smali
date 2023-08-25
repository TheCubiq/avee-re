.class public final Lcom/daaw/f43;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public b:I

.field public final synthetic c:Lcom/daaw/g43;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/g43;[BLcom/daaw/e43;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f43;->c:Lcom/daaw/g43;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/f43;->a:[B

    return-void
.end method

.method public static synthetic b(Lcom/daaw/f43;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/f43;->d()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/daaw/f43;
    .locals 0

    iput p1, p0, Lcom/daaw/f43;->b:I

    return-object p0
.end method

.method public final declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/g93;->h9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/f43;->c:Lcom/daaw/g43;

    invoke-static {v0}, Lcom/daaw/g43;->a(Lcom/daaw/g43;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/daaw/a43;

    invoke-direct {v1, p0}, Lcom/daaw/a43;-><init>(Lcom/daaw/f43;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/daaw/f43;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/f43;->c:Lcom/daaw/g43;

    iget-boolean v1, v0, Lcom/daaw/g43;->b:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/daaw/g43;->a:Lcom/daaw/gp2;

    iget-object v1, p0, Lcom/daaw/f43;->a:[B

    invoke-interface {v0, v1}, Lcom/daaw/gp2;->w([B)V

    iget-object v0, p0, Lcom/daaw/f43;->c:Lcom/daaw/g43;

    iget-object v0, v0, Lcom/daaw/g43;->a:Lcom/daaw/gp2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/daaw/gp2;->C(I)V

    iget-object v0, p0, Lcom/daaw/f43;->c:Lcom/daaw/g43;

    iget-object v0, v0, Lcom/daaw/g43;->a:Lcom/daaw/gp2;

    iget v1, p0, Lcom/daaw/f43;->b:I

    invoke-interface {v0, v1}, Lcom/daaw/gp2;->c(I)V

    iget-object v0, p0, Lcom/daaw/f43;->c:Lcom/daaw/g43;

    iget-object v0, v0, Lcom/daaw/g43;->a:Lcom/daaw/gp2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/daaw/gp2;->E([I)V

    iget-object v0, p0, Lcom/daaw/f43;->c:Lcom/daaw/g43;

    iget-object v0, v0, Lcom/daaw/g43;->a:Lcom/daaw/gp2;

    invoke-interface {v0}, Lcom/daaw/gp2;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Clearcut log failed"

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzf(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0

    throw v0
.end method
