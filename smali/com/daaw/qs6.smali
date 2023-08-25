.class public final Lcom/daaw/qs6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$a;
.implements Lcom/daaw/pa$b;


# instance fields
.field public final a:Lcom/daaw/qt6;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/concurrent/LinkedBlockingQueue;

.field public final e:Landroid/os/HandlerThread;

.field public final f:Lcom/daaw/es6;

.field public final g:J

.field public final h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/es6;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/daaw/qs6;->b:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/qs6;->h:I

    iput-object p5, p0, Lcom/daaw/qs6;->c:Ljava/lang/String;

    iput-object p7, p0, Lcom/daaw/qs6;->f:Lcom/daaw/es6;

    new-instance p2, Landroid/os/HandlerThread;

    const-string p3, "GassDGClient"

    invoke-direct {p2, p3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/daaw/qs6;->e:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->start()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    iput-wide p3, p0, Lcom/daaw/qs6;->g:J

    new-instance p3, Lcom/daaw/qt6;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    const v5, 0x12b6488

    move-object v0, p3

    move-object v1, p1

    move-object v3, p0

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/qt6;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/pa$a;Lcom/daaw/pa$b;I)V

    iput-object p3, p0, Lcom/daaw/qs6;->a:Lcom/daaw/qt6;

    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lcom/daaw/qs6;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p3}, Lcom/daaw/pa;->checkAvailabilityAndConnect()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/zzfts;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfts;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfts;-><init>([BI)V

    return-object v0
.end method


# virtual methods
.method public final D(I)V
    .locals 3

    :try_start_0
    iget-wide v0, p0, Lcom/daaw/qs6;->g:J

    const/16 p1, 0xfab

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/daaw/qs6;->e(IJLjava/lang/Exception;)V

    iget-object p1, p0, Lcom/daaw/qs6;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {}, Lcom/daaw/qs6;->a()Lcom/google/android/gms/internal/ads/zzfts;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    :try_start_0
    iget-wide v0, p0, Lcom/daaw/qs6;->g:J

    const/16 p1, 0xfac

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/daaw/qs6;->e(IJLjava/lang/Exception;)V

    iget-object p1, p0, Lcom/daaw/qs6;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {}, Lcom/daaw/qs6;->a()Lcom/google/android/gms/internal/ads/zzfts;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/qs6;->d()Lcom/daaw/tt6;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzftq;

    const/4 v1, 0x1

    iget v2, p0, Lcom/daaw/qs6;->h:I

    iget-object v3, p0, Lcom/daaw/qs6;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/qs6;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzftq;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/daaw/tt6;->i3(Lcom/google/android/gms/internal/ads/zzftq;)Lcom/google/android/gms/internal/ads/zzfts;

    move-result-object p1

    iget-wide v0, p0, Lcom/daaw/qs6;->g:J

    const/16 v2, 0x1393

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v0, v1, v3}, Lcom/daaw/qs6;->e(IJLjava/lang/Exception;)V

    iget-object v0, p0, Lcom/daaw/qs6;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/qs6;->c()V

    iget-object p1, p0, Lcom/daaw/qs6;->e:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->quit()Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    const/16 p1, 0x7da

    iget-wide v1, p0, Lcom/daaw/qs6;->g:J

    invoke-virtual {p0, p1, v1, v2, v0}, Lcom/daaw/qs6;->e(IJLjava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/qs6;->c()V

    iget-object v0, p0, Lcom/daaw/qs6;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    throw p1

    :cond_0
    return-void
.end method

.method public final b(I)Lcom/google/android/gms/internal/ads/zzfts;
    .locals 4

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/qs6;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    const-wide/32 v1, 0xc350

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfts;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v1, 0x7d9

    iget-wide v2, p0, Lcom/daaw/qs6;->g:J

    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/daaw/qs6;->e(IJLjava/lang/Exception;)V

    move-object v0, p1

    :goto_0
    const/16 v1, 0xbbc

    iget-wide v2, p0, Lcom/daaw/qs6;->g:J

    invoke-virtual {p0, v1, v2, v3, p1}, Lcom/daaw/qs6;->e(IJLjava/lang/Exception;)V

    if-eqz v0, :cond_1

    iget p1, v0, Lcom/google/android/gms/internal/ads/zzfts;->r:I

    const/4 v1, 0x7

    if-ne p1, v1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :cond_0
    const/4 p1, 0x2

    :goto_1
    invoke-static {p1}, Lcom/daaw/es6;->g(I)V

    :cond_1
    if-nez v0, :cond_2

    invoke-static {}, Lcom/daaw/qs6;->a()Lcom/google/android/gms/internal/ads/zzfts;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qs6;->a:Lcom/daaw/qt6;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/pa;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qs6;->a:Lcom/daaw/qt6;

    invoke-virtual {v0}, Lcom/daaw/pa;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/qs6;->a:Lcom/daaw/qt6;

    invoke-virtual {v0}, Lcom/daaw/pa;->disconnect()V

    :cond_1
    return-void
.end method

.method public final d()Lcom/daaw/tt6;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/qs6;->a:Lcom/daaw/qt6;

    invoke-virtual {v0}, Lcom/daaw/qt6;->J()Lcom/daaw/tt6;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e(IJLjava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/qs6;->f:Lcom/daaw/es6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p2

    invoke-virtual {v0, p1, v1, v2, p4}, Lcom/daaw/es6;->c(IJLjava/lang/Exception;)Lcom/daaw/rj1;

    return-void
.end method
