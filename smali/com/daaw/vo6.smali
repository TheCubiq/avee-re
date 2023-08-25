.class public final Lcom/daaw/vo6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static y:Ljava/lang/Boolean;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/google/android/gms/internal/ads/zzchu;

.field public final r:Lcom/daaw/dp6;

.field public s:Ljava/lang/String;

.field public t:I

.field public final u:Lcom/daaw/sa5;

.field public v:Z

.field public final w:Lcom/daaw/vn5;

.field public final x:Lcom/daaw/yu3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/sa5;Lcom/daaw/vn5;Lcom/daaw/yu3;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/gp6;->M()Lcom/daaw/dp6;

    move-result-object p6

    iput-object p6, p0, Lcom/daaw/vo6;->r:Lcom/daaw/dp6;

    const/4 p6, 0x0

    iput-boolean p6, p0, Lcom/daaw/vo6;->v:Z

    iput-object p1, p0, Lcom/daaw/vo6;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/vo6;->q:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p3, p0, Lcom/daaw/vo6;->u:Lcom/daaw/sa5;

    iput-object p4, p0, Lcom/daaw/vo6;->w:Lcom/daaw/vn5;

    iput-object p5, p0, Lcom/daaw/vo6;->x:Lcom/daaw/yu3;

    return-void
.end method

.method public static declared-synchronized a()Z
    .locals 6

    const-class v0, Lcom/daaw/vo6;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/vo6;->y:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    sget-object v1, Lcom/daaw/ta3;->b:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    sput-object v1, Lcom/daaw/vo6;->y:Ljava/lang/Boolean;

    goto :goto_2

    :cond_0
    sget-object v1, Lcom/daaw/ta3;->a:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v3

    cmpg-double v5, v3, v1

    if-gez v5, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_2
    :goto_2
    sget-object v1, Lcom/daaw/vo6;->y:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    goto :goto_4

    :goto_3
    throw v1

    :goto_4
    goto :goto_3
.end method


# virtual methods
.method public final declared-synchronized b(Lcom/daaw/mo6;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/vo6;->v:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vo6;->c()V

    :cond_0
    invoke-static {}, Lcom/daaw/vo6;->a()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    if-nez p1, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/daaw/vo6;->r:Lcom/daaw/dp6;

    invoke-virtual {v0}, Lcom/daaw/dp6;->s()I

    move-result v0

    sget-object v1, Lcom/daaw/g93;->Q7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lt v0, v1, :cond_3

    monitor-exit p0

    return-void

    :cond_3
    :try_start_2
    iget-object v0, p0, Lcom/daaw/vo6;->r:Lcom/daaw/dp6;

    invoke-static {}, Lcom/daaw/fp6;->L()Lcom/daaw/ep6;

    move-result-object v1

    invoke-static {}, Lcom/daaw/bp6;->L()Lcom/daaw/ap6;

    move-result-object v2

    invoke-virtual {p1}, Lcom/daaw/mo6;->k()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->J(I)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->j()Z

    move-result v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->F(Z)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->b()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/daaw/ap6;->x(J)Lcom/daaw/ap6;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->L(I)Lcom/daaw/ap6;

    iget-object v3, p0, Lcom/daaw/vo6;->q:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->D(Ljava/lang/String;)Lcom/daaw/ap6;

    iget-object v3, p0, Lcom/daaw/vo6;->s:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->s(Ljava/lang/String;)Lcom/daaw/ap6;

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->B(Ljava/lang/String;)Lcom/daaw/ap6;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->G(I)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->m()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->K(I)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->A(I)Lcom/daaw/ap6;

    iget v3, p0, Lcom/daaw/vo6;->t:I

    int-to-long v3, v3

    invoke-virtual {v2, v3, v4}, Lcom/daaw/ap6;->v(J)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->l()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->I(I)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->t(Ljava/lang/String;)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->w(Ljava/lang/String;)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->y(Ljava/lang/String;)Lcom/daaw/ap6;

    iget-object v3, p0, Lcom/daaw/vo6;->u:Lcom/daaw/sa5;

    invoke-virtual {p1}, Lcom/daaw/mo6;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/daaw/sa5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->z(Ljava/lang/String;)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->C(Ljava/lang/String;)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->u(Ljava/lang/String;)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ap6;->H(Ljava/lang/String;)Lcom/daaw/ap6;

    invoke-virtual {p1}, Lcom/daaw/mo6;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/daaw/ap6;->E(Ljava/lang/String;)Lcom/daaw/ap6;

    invoke-virtual {v1, v2}, Lcom/daaw/ep6;->s(Lcom/daaw/ap6;)Lcom/daaw/ep6;

    invoke-virtual {v0, v1}, Lcom/daaw/dp6;->t(Lcom/daaw/ep6;)Lcom/daaw/dp6;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c()V
    .locals 8

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/vo6;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/daaw/vo6;->v:Z

    invoke-static {}, Lcom/daaw/vo6;->a()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/daaw/vo6;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzo(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/vo6;->s:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/x70;->f()Lcom/daaw/x70;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/vo6;->p:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/daaw/x70;->a(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/daaw/vo6;->t:I

    sget-object v0, Lcom/daaw/g93;->P7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v5, v0

    sget-object v1, Lcom/daaw/z04;->d:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v2, p0

    move-wide v3, v5

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 14

    monitor-enter p0

    :try_start_0
    new-instance v7, Lcom/daaw/on5;

    sget-object v0, Lcom/daaw/g93;->O7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const v2, 0xea60

    iget-object v0, p0, Lcom/daaw/vo6;->r:Lcom/daaw/dp6;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v0

    check-cast v0, Lcom/daaw/gp6;

    invoke-virtual {v0}, Lcom/daaw/hq7;->a()[B

    move-result-object v4

    const-string v5, "application/x-protobuf"

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/on5;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    iget-object v9, p0, Lcom/daaw/vo6;->p:Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/vo6;->q:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    iget-object v11, p0, Lcom/daaw/vo6;->x:Lcom/daaw/yu3;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v12

    new-instance v0, Lcom/daaw/un5;

    const/4 v13, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Lcom/daaw/un5;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/yu3;I[B)V

    invoke-virtual {v0, v7}, Lcom/daaw/un5;->a(Lcom/daaw/on5;)Lcom/daaw/pn5;

    iget-object v0, p0, Lcom/daaw/vo6;->r:Lcom/daaw/dp6;

    invoke-virtual {v0}, Lcom/daaw/dp6;->u()Lcom/daaw/dp6;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    instance-of v1, v0, Lcom/daaw/gi5;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/daaw/gi5;

    invoke-virtual {v1}, Lcom/daaw/gi5;->a()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/daaw/vo6;->r:Lcom/daaw/dp6;

    invoke-virtual {v0}, Lcom/daaw/dp6;->u()Lcom/daaw/dp6;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    const-string v2, "CuiMonitor.sendCuiPing"

    invoke-virtual {v1, v0, v2}, Lcom/daaw/qz3;->t(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized run()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/daaw/vo6;->a()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/vo6;->r:Lcom/daaw/dp6;

    invoke-virtual {v0}, Lcom/daaw/dp6;->s()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lcom/daaw/vo6;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
