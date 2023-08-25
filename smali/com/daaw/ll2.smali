.class public final Lcom/daaw/ll2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ol2;


# static fields
.field public static F:Lcom/daaw/ll2;


# instance fields
.field public volatile A:J

.field public final B:Ljava/lang/Object;

.field public volatile C:Z

.field public volatile D:Z

.field public final E:I

.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/wt6;

.field public final r:Lcom/daaw/bu6;

.field public final s:Lcom/daaw/du6;

.field public final t:Lcom/daaw/qm2;

.field public final u:Lcom/daaw/es6;

.field public final v:Ljava/util/concurrent/Executor;

.field public final w:Lcom/daaw/au6;

.field public final x:Ljava/util/concurrent/CountDownLatch;

.field public final y:Lcom/daaw/gn2;

.field public final z:Lcom/daaw/xm2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/es6;Lcom/daaw/wt6;Lcom/daaw/bu6;Lcom/daaw/du6;Lcom/daaw/qm2;Ljava/util/concurrent/Executor;Lcom/daaw/zr6;ILcom/daaw/gn2;Lcom/daaw/xm2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/ll2;->A:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/ll2;->B:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ll2;->D:Z

    iput-object p1, p0, Lcom/daaw/ll2;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    iput-object p3, p0, Lcom/daaw/ll2;->q:Lcom/daaw/wt6;

    iput-object p4, p0, Lcom/daaw/ll2;->r:Lcom/daaw/bu6;

    iput-object p5, p0, Lcom/daaw/ll2;->s:Lcom/daaw/du6;

    iput-object p6, p0, Lcom/daaw/ll2;->t:Lcom/daaw/qm2;

    iput-object p7, p0, Lcom/daaw/ll2;->v:Ljava/util/concurrent/Executor;

    iput p9, p0, Lcom/daaw/ll2;->E:I

    iput-object p10, p0, Lcom/daaw/ll2;->y:Lcom/daaw/gn2;

    iput-object p11, p0, Lcom/daaw/ll2;->z:Lcom/daaw/xm2;

    iput-boolean v0, p0, Lcom/daaw/ll2;->D:Z

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/ll2;->x:Ljava/util/concurrent/CountDownLatch;

    new-instance p1, Lcom/daaw/jl2;

    invoke-direct {p1, p0, p8}, Lcom/daaw/jl2;-><init>(Lcom/daaw/ll2;Lcom/daaw/zr6;)V

    iput-object p1, p0, Lcom/daaw/ll2;->w:Lcom/daaw/au6;

    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;Landroid/content/Context;ZZ)Lcom/daaw/ll2;
    .locals 2

    const-class v0, Lcom/daaw/ll2;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-static {p0, p1, v1, p2, p3}, Lcom/daaw/ll2;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/concurrent/Executor;ZZ)Lcom/daaw/ll2;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;Landroid/content/Context;Ljava/util/concurrent/Executor;ZZ)Lcom/daaw/ll2;
    .locals 22
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    const-class v13, Lcom/daaw/ll2;

    monitor-enter v13

    :try_start_0
    sget-object v1, Lcom/daaw/ll2;->F:Lcom/daaw/ll2;

    if-nez v1, :cond_3

    invoke-static {}, Lcom/daaw/js6;->a()Lcom/daaw/is6;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v1, v2}, Lcom/daaw/is6;->a(Ljava/lang/String;)Lcom/daaw/is6;

    move/from16 v2, p3

    invoke-virtual {v1, v2}, Lcom/daaw/is6;->c(Z)Lcom/daaw/is6;

    invoke-virtual {v1}, Lcom/daaw/is6;->d()Lcom/daaw/js6;

    move-result-object v15

    move/from16 v1, p4

    invoke-static {v0, v8, v1}, Lcom/daaw/es6;->a(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Lcom/daaw/es6;

    move-result-object v3

    sget-object v1, Lcom/daaw/g93;->S2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static/range {p1 .. p1}, Lcom/daaw/wl2;->c(Landroid/content/Context;)Lcom/daaw/wl2;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_0

    :cond_0
    move-object/from16 v19, v2

    :goto_0
    sget-object v1, Lcom/daaw/g93;->T2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static/range {p1 .. p2}, Lcom/daaw/gn2;->d(Landroid/content/Context;Ljava/util/concurrent/Executor;)Lcom/daaw/gn2;

    move-result-object v1

    move-object v11, v1

    goto :goto_1

    :cond_1
    move-object v11, v2

    :goto_1
    sget-object v1, Lcom/daaw/g93;->l2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/daaw/xm2;

    invoke-direct {v1}, Lcom/daaw/xm2;-><init>()V

    move-object v12, v1

    goto :goto_2

    :cond_2
    move-object v12, v2

    :goto_2
    invoke-static {v0, v8, v3, v15}, Lcom/daaw/at6;->e(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/es6;Lcom/daaw/js6;)Lcom/daaw/at6;

    move-result-object v16

    new-instance v1, Lcom/daaw/pm2;

    invoke-direct {v1, v0}, Lcom/daaw/pm2;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/daaw/en2;

    invoke-direct {v2, v0, v1}, Lcom/daaw/en2;-><init>(Landroid/content/Context;Lcom/daaw/pm2;)V

    new-instance v7, Lcom/daaw/qm2;

    move-object v14, v7

    move-object/from16 v17, v2

    move-object/from16 v18, v1

    move-object/from16 v20, v11

    move-object/from16 v21, v12

    invoke-direct/range {v14 .. v21}, Lcom/daaw/qm2;-><init>(Lcom/daaw/js6;Lcom/daaw/at6;Lcom/daaw/en2;Lcom/daaw/pm2;Lcom/daaw/wl2;Lcom/daaw/gn2;Lcom/daaw/xm2;)V

    invoke-static {v0, v3}, Lcom/daaw/mt6;->b(Landroid/content/Context;Lcom/daaw/es6;)I

    move-result v10

    new-instance v9, Lcom/daaw/zr6;

    invoke-direct {v9}, Lcom/daaw/zr6;-><init>()V

    new-instance v14, Lcom/daaw/ll2;

    new-instance v4, Lcom/daaw/wt6;

    invoke-direct {v4, v0, v10}, Lcom/daaw/wt6;-><init>(Landroid/content/Context;I)V

    new-instance v5, Lcom/daaw/bu6;

    new-instance v1, Lcom/daaw/el2;

    invoke-direct {v1, v3}, Lcom/daaw/el2;-><init>(Lcom/daaw/es6;)V

    sget-object v2, Lcom/daaw/g93;->U1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-direct {v5, v0, v10, v1, v2}, Lcom/daaw/bu6;-><init>(Landroid/content/Context;ILcom/daaw/nt6;Z)V

    new-instance v6, Lcom/daaw/du6;

    invoke-direct {v6, v0, v7, v3, v9}, Lcom/daaw/du6;-><init>(Landroid/content/Context;Lcom/daaw/eu6;Lcom/daaw/es6;Lcom/daaw/zr6;)V

    move-object v1, v14

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    invoke-direct/range {v1 .. v12}, Lcom/daaw/ll2;-><init>(Landroid/content/Context;Lcom/daaw/es6;Lcom/daaw/wt6;Lcom/daaw/bu6;Lcom/daaw/du6;Lcom/daaw/qm2;Ljava/util/concurrent/Executor;Lcom/daaw/zr6;ILcom/daaw/gn2;Lcom/daaw/xm2;)V

    sput-object v14, Lcom/daaw/ll2;->F:Lcom/daaw/ll2;

    invoke-virtual {v14}, Lcom/daaw/ll2;->g()V

    sget-object v0, Lcom/daaw/ll2;->F:Lcom/daaw/ll2;

    invoke-virtual {v0}, Lcom/daaw/ll2;->h()V

    :cond_3
    sget-object v0, Lcom/daaw/ll2;->F:Lcom/daaw/ll2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v13

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v13

    throw v0
.end method

.method public static bridge synthetic c(Lcom/daaw/ll2;)Lcom/daaw/es6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/ll2;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ll2;->B:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/ll2;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ll2;->C:Z

    return-void
.end method

.method public static bridge synthetic f(Lcom/daaw/ll2;)V
    .locals 12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lcom/daaw/ll2;->l(I)Lcom/daaw/vt6;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/daaw/vt6;->a()Lcom/daaw/ap2;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/ap2;->U()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/daaw/vt6;->a()Lcom/daaw/ap2;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/ap2;->T()Ljava/lang/String;

    move-result-object v3

    move-object v9, v3

    move-object v8, v4

    goto :goto_0

    :cond_0
    move-object v8, v4

    move-object v9, v8

    :goto_0
    :try_start_0
    iget-object v5, p0, Lcom/daaw/ll2;->p:Landroid/content/Context;

    const/4 v6, 0x1

    iget v7, p0, Lcom/daaw/ll2;->E:I

    const-string v10, "1"

    iget-object v11, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    invoke-static/range {v5 .. v11}, Lcom/daaw/rs6;->a(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/es6;)Lcom/google/android/gms/internal/ads/zzfts;

    move-result-object v3

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzfts;->q:[B

    if-eqz v4, :cond_c

    array-length v5, v4
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_1

    goto/16 :goto_6

    :cond_1
    :try_start_1
    invoke-static {v4}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object v4

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/daaw/xo2;->M(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/xo2;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/daaw/xs7; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v4}, Lcom/daaw/xo2;->N()Lcom/daaw/ap2;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/ap2;->U()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_b

    invoke-virtual {v4}, Lcom/daaw/xo2;->N()Lcom/daaw/ap2;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/ap2;->T()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_b

    invoke-virtual {v4}, Lcom/daaw/xo2;->O()Lcom/daaw/yq7;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/yq7;->j()[B

    move-result-object v5

    array-length v5, v5

    if-nez v5, :cond_2

    goto/16 :goto_5

    :cond_2
    invoke-virtual {p0, v2}, Lcom/daaw/ll2;->l(I)Lcom/daaw/vt6;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lcom/daaw/vt6;->a()Lcom/daaw/ap2;

    move-result-object v5

    invoke-virtual {v4}, Lcom/daaw/xo2;->N()Lcom/daaw/ap2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/ap2;->U()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/daaw/ap2;->U()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v4}, Lcom/daaw/xo2;->N()Lcom/daaw/ap2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/ap2;->T()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/daaw/ap2;->T()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    :cond_4
    :goto_1
    iget-object v5, p0, Lcom/daaw/ll2;->w:Lcom/daaw/au6;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzfts;->r:I

    sget-object v6, Lcom/daaw/g93;->S1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, 0x3

    if-ne v3, v6, :cond_5

    iget-object v3, p0, Lcom/daaw/ll2;->r:Lcom/daaw/bu6;

    invoke-virtual {v3, v4}, Lcom/daaw/bu6;->a(Lcom/daaw/xo2;)Z

    move-result v3

    goto :goto_2

    :cond_5
    const/4 v6, 0x4

    if-ne v3, v6, :cond_7

    iget-object v3, p0, Lcom/daaw/ll2;->r:Lcom/daaw/bu6;

    invoke-virtual {v3, v4, v5}, Lcom/daaw/bu6;->b(Lcom/daaw/xo2;Lcom/daaw/au6;)Z

    move-result v3

    goto :goto_2

    :cond_6
    iget-object v3, p0, Lcom/daaw/ll2;->q:Lcom/daaw/wt6;

    invoke-virtual {v3, v4, v5}, Lcom/daaw/wt6;->a(Lcom/daaw/xo2;Lcom/daaw/au6;)Z

    move-result v3

    :goto_2
    if-nez v3, :cond_9

    :cond_7
    iget-object v2, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v3, 0xfa9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    :goto_3
    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Lcom/daaw/es6;->d(IJ)Lcom/daaw/rj1;
    :try_end_2
    .catch Lcom/daaw/xs7; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_8
    :goto_4
    iget-object p0, p0, Lcom/daaw/ll2;->x:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :cond_9
    :try_start_3
    invoke-virtual {p0, v2}, Lcom/daaw/ll2;->l(I)Lcom/daaw/vt6;

    move-result-object v3

    if-eqz v3, :cond_8

    iget-object v4, p0, Lcom/daaw/ll2;->s:Lcom/daaw/du6;

    invoke-virtual {v4, v3}, Lcom/daaw/du6;->c(Lcom/daaw/vt6;)Z

    move-result v3

    if-eqz v3, :cond_a

    iput-boolean v2, p0, Lcom/daaw/ll2;->D:Z

    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/ll2;->A:J

    goto :goto_4

    :cond_b
    :goto_5
    iget-object v2, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v3, 0x1392

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    goto :goto_3

    :catch_0
    iget-object v2, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v3, 0x7ee

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    goto :goto_3

    :cond_c
    :goto_6
    iget-object v2, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v3, 0x1391

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4
    :try_end_3
    .catch Lcom/daaw/xs7; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v2

    :try_start_4
    iget-object v3, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v4, 0xfa2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v0

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/daaw/es6;->c(IJLjava/lang/Exception;)Lcom/daaw/rj1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :goto_7
    iget-object p0, p0, Lcom/daaw/ll2;->x:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_9

    :goto_8
    throw v0

    :goto_9
    goto :goto_8
.end method

.method public static bridge synthetic i(Lcom/daaw/ll2;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ll2;->C:Z

    return p0
.end method


# virtual methods
.method public final declared-synchronized g()V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lcom/daaw/ll2;->l(I)Lcom/daaw/vt6;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v0, p0, Lcom/daaw/ll2;->s:Lcom/daaw/du6;

    invoke-virtual {v0, v3}, Lcom/daaw/du6;->c(Lcom/daaw/vt6;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v2, p0, Lcom/daaw/ll2;->D:Z

    iget-object v0, p0, Lcom/daaw/ll2;->x:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v2, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v3, 0xfad

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Lcom/daaw/es6;->d(IJ)Lcom/daaw/rj1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final h()V
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/ll2;->C:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/ll2;->B:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/ll2;->C:Z

    if-nez v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iget-wide v3, p0, Lcom/daaw/ll2;->A:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0xe10

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/ll2;->s:Lcom/daaw/du6;

    invoke-virtual {v1}, Lcom/daaw/du6;->b()Lcom/daaw/vt6;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v3, v4}, Lcom/daaw/vt6;->d(J)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget v1, p0, Lcom/daaw/ll2;->E:I

    invoke-static {v1}, Lcom/daaw/mt6;->a(I)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/ll2;->v:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/daaw/kl2;

    invoke-direct {v2, p0}, Lcom/daaw/kl2;-><init>(Lcom/daaw/ll2;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_3
    return-void
.end method

.method public final declared-synchronized j()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/ll2;->D:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ll2;->y:Lcom/daaw/gn2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/gn2;->h()V

    :cond_0
    return-void
.end method

.method public final l(I)Lcom/daaw/vt6;
    .locals 1

    iget p1, p0, Lcom/daaw/ll2;->E:I

    invoke-static {p1}, Lcom/daaw/mt6;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object p1, Lcom/daaw/g93;->S1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ll2;->r:Lcom/daaw/bu6;

    invoke-virtual {p1, v0}, Lcom/daaw/bu6;->c(I)Lcom/daaw/vt6;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/daaw/ll2;->q:Lcom/daaw/wt6;

    invoke-virtual {p1, v0}, Lcom/daaw/wt6;->c(I)Lcom/daaw/vt6;

    move-result-object p1

    return-object p1
.end method

.method public final zze(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/ll2;->zzf(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final zzf(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ll2;->k()V

    sget-object v1, Lcom/daaw/g93;->l2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/daaw/ll2;->z:Lcom/daaw/xm2;

    invoke-virtual {v1}, Lcom/daaw/xm2;->i()V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ll2;->h()V

    iget-object v1, v0, Lcom/daaw/ll2;->s:Lcom/daaw/du6;

    invoke-virtual {v1}, Lcom/daaw/du6;->a()Lcom/daaw/ks6;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const/4 v4, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-interface/range {v2 .. v7}, Lcom/daaw/ks6;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1

    iget-object v10, v0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v11, 0x1388

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v12, v2, v8

    const/4 v15, 0x0

    move-object v14, v1

    invoke-virtual/range {v10 .. v15}, Lcom/daaw/es6;->f(IJLjava/lang/String;Ljava/util/Map;)Lcom/daaw/rj1;

    return-object v1

    :cond_1
    const-string v1, ""

    return-object v1
.end method

.method public final zzg(Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    invoke-virtual {p0}, Lcom/daaw/ll2;->k()V

    sget-object v0, Lcom/daaw/g93;->l2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ll2;->z:Lcom/daaw/xm2;

    invoke-virtual {v0}, Lcom/daaw/xm2;->j()V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ll2;->h()V

    iget-object v0, p0, Lcom/daaw/ll2;->s:Lcom/daaw/du6;

    invoke-virtual {v0}, Lcom/daaw/du6;->a()Lcom/daaw/ks6;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-interface {v0, p1, v3}, Lcom/daaw/ks6;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v5, 0x1389

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v1

    const/4 v9, 0x0

    move-object v8, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/es6;->f(IJLjava/lang/String;Ljava/util/Map;)Lcom/daaw/rj1;

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method public final zzh(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 10

    invoke-virtual {p0}, Lcom/daaw/ll2;->k()V

    sget-object v0, Lcom/daaw/g93;->l2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ll2;->z:Lcom/daaw/xm2;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/xm2;->k(Landroid/content/Context;Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ll2;->h()V

    iget-object v0, p0, Lcom/daaw/ll2;->s:Lcom/daaw/du6;

    invoke-virtual {v0}, Lcom/daaw/du6;->a()Lcom/daaw/ks6;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-interface {v0, p1, v3, p2, p3}, Lcom/daaw/ks6;->d(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    const/16 v5, 0x138a

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    sub-long v6, p2, v1

    const/4 v9, 0x0

    move-object v8, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/es6;->f(IJLjava/lang/String;Ljava/util/Map;)Lcom/daaw/rj1;

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method public final zzk(Landroid/view/MotionEvent;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ll2;->s:Lcom/daaw/du6;

    invoke-virtual {v0}, Lcom/daaw/du6;->a()Lcom/daaw/ks6;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0, v1, p1}, Lcom/daaw/ks6;->b(Ljava/lang/String;Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Lcom/daaw/cu6; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/ll2;->u:Lcom/daaw/es6;

    invoke-virtual {p1}, Lcom/daaw/cu6;->a()I

    move-result v1

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/es6;->c(IJLjava/lang/Exception;)Lcom/daaw/rj1;

    :cond_0
    return-void
.end method

.method public final zzl(III)V
    .locals 0

    return-void
.end method

.method public final zzn(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ll2;->t:Lcom/daaw/qm2;

    invoke-virtual {v0, p1}, Lcom/daaw/qm2;->a(Landroid/view/View;)V

    return-void
.end method
