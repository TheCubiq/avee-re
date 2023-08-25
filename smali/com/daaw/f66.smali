.class public final Lcom/daaw/f66;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Lcom/daaw/px5;

.field public final d:Landroid/content/Context;

.field public final e:Lcom/daaw/ri6;

.field public final f:Lcom/daaw/lx5;

.field public final g:Lcom/daaw/ya5;

.field public final h:Lcom/daaw/hg5;

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/String;Lcom/daaw/px5;Landroid/content/Context;Lcom/daaw/ri6;Lcom/daaw/lx5;Lcom/daaw/ya5;Lcom/daaw/hg5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/f66;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/f66;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/daaw/f66;->i:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/f66;->c:Lcom/daaw/px5;

    iput-object p5, p0, Lcom/daaw/f66;->d:Landroid/content/Context;

    iput-object p6, p0, Lcom/daaw/f66;->e:Lcom/daaw/ri6;

    iput-object p7, p0, Lcom/daaw/f66;->f:Lcom/daaw/lx5;

    iput-object p8, p0, Lcom/daaw/f66;->g:Lcom/daaw/ya5;

    iput-object p9, p0, Lcom/daaw/f66;->h:Lcom/daaw/hg5;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/f66;)Lcom/daaw/f77;
    .locals 12

    sget-object v0, Lcom/daaw/g93;->Z8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/f66;->e:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->f:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/f66;->e:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->f:Ljava/lang/String;

    :goto_0
    iget-object v1, p0, Lcom/daaw/f66;->c:Lcom/daaw/px5;

    iget-object v2, p0, Lcom/daaw/f66;->i:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/daaw/px5;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->w1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/f66;->h:Lcom/daaw/hg5;

    invoke-virtual {v1}, Lcom/daaw/hg5;->a()Landroid/os/Bundle;

    move-result-object v1

    goto :goto_1

    :cond_1
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Lcom/daaw/b27;

    invoke-virtual {v0}, Lcom/daaw/b27;->g()Lcom/daaw/d27;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/util/List;

    iget-object v3, p0, Lcom/daaw/f66;->e:Lcom/daaw/ri6;

    iget-object v3, v3, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/client/zzl;->zzm:Landroid/os/Bundle;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    :cond_2
    move-object v9, v4

    const/4 v10, 0x1

    const/4 v11, 0x1

    move-object v6, p0

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/f66;->c(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lcom/daaw/j67;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/daaw/f66;->c:Lcom/daaw/px5;

    invoke-virtual {v0}, Lcom/daaw/px5;->b()Ljava/util/Map;

    move-result-object v0

    check-cast v0, Lcom/daaw/b27;

    invoke-virtual {v0}, Lcom/daaw/b27;->g()Lcom/daaw/d27;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/xx5;

    iget-object v6, v3, Lcom/daaw/xx5;->a:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/f66;->e:Lcom/daaw/ri6;

    iget-object v5, v5, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/client/zzl;->zzm:Landroid/os/Bundle;

    if-eqz v5, :cond_4

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    move-object v8, v5

    goto :goto_4

    :cond_4
    move-object v8, v4

    :goto_4
    iget-object v5, v3, Lcom/daaw/xx5;->d:Landroid/os/Bundle;

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    iget-boolean v9, v3, Lcom/daaw/xx5;->b:Z

    iget-boolean v10, v3, Lcom/daaw/xx5;->c:Z

    move-object v5, p0

    invoke-virtual/range {v5 .. v10}, Lcom/daaw/f66;->c(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lcom/daaw/j67;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {v2}, Lcom/daaw/s67;->c(Ljava/lang/Iterable;)Lcom/daaw/r67;

    move-result-object v0

    new-instance v3, Lcom/daaw/c66;

    invoke-direct {v3, v2, v1}, Lcom/daaw/c66;-><init>(Ljava/util/List;Landroid/os/Bundle;)V

    iget-object p0, p0, Lcom/daaw/f66;->a:Lcom/daaw/g77;

    invoke-virtual {v0, v3, p0}, Lcom/daaw/r67;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic b(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lcom/daaw/f77;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    new-instance v8, Lcom/daaw/e14;

    invoke-direct {v8}, Lcom/daaw/e14;-><init>()V

    const/4 v2, 0x0

    if-eqz p5, :cond_0

    iget-object v0, v1, Lcom/daaw/f66;->f:Lcom/daaw/lx5;

    invoke-virtual {v0, v3}, Lcom/daaw/lx5;->b(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/daaw/f66;->f:Lcom/daaw/lx5;

    invoke-virtual {v0, v3}, Lcom/daaw/lx5;->a(Ljava/lang/String;)Lcom/daaw/dp3;

    move-result-object v0

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v0, v1, Lcom/daaw/f66;->g:Lcom/daaw/ya5;

    invoke-virtual {v0, v3}, Lcom/daaw/ya5;->b(Ljava/lang/String;)Lcom/daaw/dp3;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v4, "Couldn\'t create RTB adapter : "

    invoke-static {v4, v0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v9, v2

    :goto_1
    if-nez v9, :cond_2

    sget-object v0, Lcom/daaw/g93;->n1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v3, v8}, Lcom/daaw/wx5;->g3(Ljava/lang/String;Lcom/daaw/e14;)V

    goto :goto_2

    :cond_1
    throw v2

    :cond_2
    new-instance v15, Lcom/daaw/wx5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v6

    move-object v2, v15

    move-object/from16 v3, p1

    move-object v4, v9

    move-object v5, v8

    invoke-direct/range {v2 .. v7}, Lcom/daaw/wx5;-><init>(Ljava/lang/String;Lcom/daaw/dp3;Lcom/daaw/e14;J)V

    sget-object v0, Lcom/daaw/g93;->s1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v1, Lcom/daaw/f66;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/daaw/b66;

    invoke-direct {v2, v15}, Lcom/daaw/b66;-><init>(Lcom/daaw/wx5;)V

    sget-object v3, Lcom/daaw/g93;->l1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_3
    if-eqz p4, :cond_4

    iget-object v0, v1, Lcom/daaw/f66;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v10

    iget-object v11, v1, Lcom/daaw/f66;->i:Ljava/lang/String;

    const/4 v0, 0x0

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/os/Bundle;

    iget-object v0, v1, Lcom/daaw/f66;->e:Lcom/daaw/ri6;

    iget-object v14, v0, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    move-object/from16 v12, p3

    invoke-interface/range {v9 .. v15}, Lcom/daaw/dp3;->U(Lcom/daaw/yd0;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/gp3;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v15}, Lcom/daaw/wx5;->zzd()V

    :goto_2
    return-object v8
.end method

.method public final c(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lcom/daaw/j67;
    .locals 8

    new-instance v7, Lcom/daaw/d66;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/d66;-><init>(Lcom/daaw/f66;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)V

    iget-object p2, p0, Lcom/daaw/f66;->a:Lcom/daaw/g77;

    invoke-static {v7, p2}, Lcom/daaw/s67;->l(Lcom/daaw/v57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p2

    sget-object p3, Lcom/daaw/g93;->s1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_0

    sget-object p3, Lcom/daaw/g93;->l1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, Lcom/daaw/f66;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p2, p3, p4, p5, v0}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object p2

    check-cast p2, Lcom/daaw/j67;

    :cond_0
    new-instance p3, Lcom/daaw/e66;

    invoke-direct {p3, p1}, Lcom/daaw/e66;-><init>(Ljava/lang/String;)V

    const-class p1, Ljava/lang/Throwable;

    iget-object p4, p0, Lcom/daaw/f66;->a:Lcom/daaw/g77;

    invoke-static {p2, p1, p3, p4}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    check-cast p1, Lcom/daaw/j67;

    return-object p1
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    new-instance v0, Lcom/daaw/a66;

    invoke-direct {v0, p0}, Lcom/daaw/a66;-><init>(Lcom/daaw/f66;)V

    iget-object v1, p0, Lcom/daaw/f66;->a:Lcom/daaw/g77;

    invoke-static {v0, v1}, Lcom/daaw/s67;->l(Lcom/daaw/v57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
