.class public final Lcom/daaw/fg5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public final d:J

.field public final e:Lcom/daaw/e14;

.field public final f:Landroid/content/Context;

.field public final g:Ljava/lang/ref/WeakReference;

.field public final h:Lcom/daaw/ya5;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Ljava/util/concurrent/Executor;

.field public final k:Ljava/util/concurrent/ScheduledExecutorService;

.field public final l:Lcom/daaw/td5;

.field public final m:Lcom/google/android/gms/internal/ads/zzchu;

.field public final n:Ljava/util/Map;

.field public final o:Lcom/daaw/wx4;

.field public final p:Lcom/daaw/vo6;

.field public q:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/content/Context;Ljava/lang/ref/WeakReference;Ljava/util/concurrent/Executor;Lcom/daaw/ya5;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/td5;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/wx4;Lcom/daaw/vo6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/fg5;->a:Z

    iput-boolean v0, p0, Lcom/daaw/fg5;->b:Z

    iput-boolean v0, p0, Lcom/daaw/fg5;->c:Z

    new-instance v1, Lcom/daaw/e14;

    invoke-direct {v1}, Lcom/daaw/e14;-><init>()V

    iput-object v1, p0, Lcom/daaw/fg5;->e:Lcom/daaw/e14;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lcom/daaw/fg5;->n:Ljava/util/Map;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/fg5;->q:Z

    iput-object p5, p0, Lcom/daaw/fg5;->h:Lcom/daaw/ya5;

    iput-object p2, p0, Lcom/daaw/fg5;->f:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/fg5;->g:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lcom/daaw/fg5;->i:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/daaw/fg5;->k:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Lcom/daaw/fg5;->j:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/daaw/fg5;->l:Lcom/daaw/td5;

    iput-object p8, p0, Lcom/daaw/fg5;->m:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p9, p0, Lcom/daaw/fg5;->o:Lcom/daaw/wx4;

    iput-object p10, p0, Lcom/daaw/fg5;->p:Lcom/daaw/vo6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ag;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/fg5;->d:J

    const-string p1, "com.google.android.gms.ads.MobileAds"

    const-string p2, ""

    invoke-virtual {p0, p1, v0, p2, v0}, Lcom/daaw/fg5;->v(Ljava/lang/String;ZLjava/lang/String;I)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/fg5;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/fg5;->d:J

    return-wide v0
.end method

.method public static bridge synthetic b(Lcom/daaw/fg5;)Lcom/daaw/e14;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fg5;->e:Lcom/daaw/e14;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/fg5;)Lcom/daaw/wx4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fg5;->o:Lcom/daaw/wx4;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/fg5;)Lcom/daaw/td5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fg5;->l:Lcom/daaw/td5;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/fg5;)Lcom/daaw/vo6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fg5;->p:Lcom/daaw/vo6;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/daaw/fg5;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fg5;->i:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/daaw/fg5;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/fg5;->c:Z

    return-void
.end method

.method public static bridge synthetic j(Lcom/daaw/fg5;Ljava/lang/String;)V
    .locals 22

    move-object/from16 v9, p0

    const-string v10, "data"

    iget-object v0, v9, Lcom/daaw/fg5;->f:Landroid/content/Context;

    const/4 v11, 0x5

    invoke-static {v0, v11}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v12

    invoke-interface {v12}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    :try_start_0
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "initializer_settings"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "config"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v15

    invoke-virtual {v15}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, v9, Lcom/daaw/fg5;->f:Landroid/content/Context;

    invoke-static {v1, v11}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v8

    invoke-interface {v8}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    invoke-interface {v8, v0}, Lcom/daaw/io6;->l(Ljava/lang/String;)Lcom/daaw/io6;

    new-instance v17, Ljava/lang/Object;

    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lcom/daaw/e14;

    invoke-direct {v6}, Lcom/daaw/e14;-><init>()V

    sget-object v1, Lcom/daaw/g93;->D1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, v9, Lcom/daaw/fg5;->k:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v6, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v7

    iget-object v1, v9, Lcom/daaw/fg5;->l:Lcom/daaw/td5;

    invoke-virtual {v1, v0}, Lcom/daaw/td5;->c(Ljava/lang/String;)V

    iget-object v1, v9, Lcom/daaw/fg5;->o:Lcom/daaw/wx4;

    invoke-virtual {v1, v0}, Lcom/daaw/wx4;->m(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->b()J

    move-result-wide v18

    new-instance v5, Lcom/daaw/wf5;

    move-object v1, v5

    move-object/from16 v2, p0

    move-object/from16 v3, v17

    move-object v4, v6

    move-object v11, v5

    move-object v5, v0

    move-object/from16 v20, v6

    move-object v13, v7

    move-wide/from16 v6, v18

    move-object/from16 v21, v8

    invoke-direct/range {v1 .. v8}, Lcom/daaw/wf5;-><init>(Lcom/daaw/fg5;Ljava/lang/Object;Lcom/daaw/e14;Ljava/lang/String;JLcom/daaw/io6;)V

    iget-object v1, v9, Lcom/daaw/fg5;->i:Ljava/util/concurrent/Executor;

    invoke-interface {v13, v11, v1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v11, Lcom/daaw/eg5;

    move-object v1, v11

    move-object/from16 v2, p0

    move-object/from16 v3, v17

    move-object v4, v0

    move-wide/from16 v5, v18

    move-object/from16 v7, v21

    move-object/from16 v8, v20

    invoke-direct/range {v1 .. v8}, Lcom/daaw/eg5;-><init>(Lcom/daaw/fg5;Ljava/lang/Object;Ljava/lang/String;JLcom/daaw/io6;Lcom/daaw/e14;)V

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    const-string v7, ""

    if-eqz v1, :cond_1

    :try_start_1
    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "format"

    invoke-virtual {v3, v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    move-object/from16 p1, v1

    invoke-virtual {v3, v13, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v13, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p1

    goto :goto_2

    :cond_0
    move-object/from16 p1, v1

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbsj;

    invoke-direct {v1, v4, v6}, Lcom/google/android/gms/internal/ads/zzbsj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v1, p1

    goto :goto_1

    :catch_0
    :cond_1
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v9, v0, v1, v7, v1}, Lcom/daaw/fg5;->v(Ljava/lang/String;ZLjava/lang/String;I)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    iget-object v1, v9, Lcom/daaw/fg5;->h:Lcom/daaw/ya5;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, v0, v2}, Lcom/daaw/ya5;->c(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/daaw/oj6;

    move-result-object v3

    iget-object v8, v9, Lcom/daaw/fg5;->j:Ljava/util/concurrent/Executor;

    new-instance v13, Lcom/daaw/ag5;

    move-object v1, v13

    move-object/from16 v2, p0

    move-object v4, v11

    move-object v6, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/ag5;-><init>(Lcom/daaw/fg5;Lcom/daaw/oj6;Lcom/daaw/dj3;Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v8, v13}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Lcom/daaw/wi6; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_1
    :try_start_4
    const-string v0, "Failed to create Adapter."

    invoke-interface {v11, v0}, Lcom/daaw/dj3;->a(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    :goto_3
    const/4 v11, 0x5

    goto/16 :goto_0

    :catch_2
    move-exception v0

    :try_start_5
    invoke-static {v7, v0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_2
    invoke-static {v14}, Lcom/daaw/s67;->a(Ljava/lang/Iterable;)Lcom/daaw/r67;

    move-result-object v0

    new-instance v1, Lcom/daaw/xf5;

    invoke-direct {v1, v9, v12}, Lcom/daaw/xf5;-><init>(Lcom/daaw/fg5;Lcom/daaw/io6;)V

    iget-object v2, v9, Lcom/daaw/fg5;->i:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r67;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3

    return-void

    :catch_3
    move-exception v0

    const-string v1, "Malformed CLD response"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, v9, Lcom/daaw/fg5;->o:Lcom/daaw/wx4;

    const-string v2, "MalformedJson"

    invoke-virtual {v1, v2}, Lcom/daaw/wx4;->zza(Ljava/lang/String;)V

    iget-object v1, v9, Lcom/daaw/fg5;->l:Lcom/daaw/td5;

    invoke-virtual {v1, v2}, Lcom/daaw/td5;->a(Ljava/lang/String;)V

    iget-object v1, v9, Lcom/daaw/fg5;->e:Lcom/daaw/e14;

    invoke-virtual {v1, v0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    const-string v2, "AdapterInitializer.updateAdapterStatus"

    invoke-virtual {v1, v0, v2}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, v9, Lcom/daaw/fg5;->p:Lcom/daaw/vo6;

    invoke-interface {v12, v0}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    const/4 v2, 0x0

    invoke-interface {v12, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v12}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    return-void
.end method

.method public static bridge synthetic k(Lcom/daaw/fg5;Ljava/lang/String;ZLjava/lang/String;I)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/fg5;->v(Ljava/lang/String;ZLjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final synthetic f(Lcom/daaw/io6;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/fg5;->e:Lcom/daaw/e14;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/fg5;->p:Lcom/daaw/vo6;

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {p1}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final g()Ljava/util/List;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/fg5;->n:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/fg5;->n:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzbrz;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzbrz;

    iget-boolean v5, v3, Lcom/google/android/gms/internal/ads/zzbrz;->q:Z

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzbrz;->r:I

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzbrz;->s:Ljava/lang/String;

    invoke-direct {v4, v2, v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzbrz;-><init>(Ljava/lang/String;ZILjava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/fg5;->q:Z

    return-void
.end method

.method public final synthetic m()V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/fg5;->c:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const-string v0, "com.google.android.gms.ads.MobileAds"

    const/4 v1, 0x0

    const-string v2, "Timeout."

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/ag;->b()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/daaw/fg5;->d:J

    sub-long/2addr v3, v5

    long-to-int v4, v3

    invoke-virtual {p0, v0, v1, v2, v4}, Lcom/daaw/fg5;->v(Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v0, p0, Lcom/daaw/fg5;->l:Lcom/daaw/td5;

    const-string v1, "com.google.android.gms.ads.MobileAds"

    const-string v2, "timeout"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/td5;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/fg5;->o:Lcom/daaw/wx4;

    const-string v1, "com.google.android.gms.ads.MobileAds"

    const-string v2, "timeout"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/wx4;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/fg5;->e:Lcom/daaw/e14;

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final synthetic n(Lcom/daaw/oj6;Lcom/daaw/dj3;Ljava/util/List;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/fg5;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/fg5;->f:Landroid/content/Context;

    :goto_0
    invoke-virtual {p1, v0, p2, p3}, Lcom/daaw/oj6;->n(Landroid/content/Context;Lcom/daaw/dj3;Ljava/util/List;)V
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to initialize adapter. "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " does not implement the initialize() method."

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/daaw/dj3;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    const-string p2, ""

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final synthetic o(Lcom/daaw/e14;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fg5;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/rf5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/rf5;-><init>(Lcom/daaw/fg5;Lcom/daaw/e14;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic p()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fg5;->l:Lcom/daaw/td5;

    invoke-virtual {v0}, Lcom/daaw/td5;->e()V

    iget-object v0, p0, Lcom/daaw/fg5;->o:Lcom/daaw/wx4;

    invoke-virtual {v0}, Lcom/daaw/wx4;->zze()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/fg5;->b:Z

    return-void
.end method

.method public final synthetic q(Ljava/lang/Object;Lcom/daaw/e14;Ljava/lang/String;JLcom/daaw/io6;)V
    .locals 3

    monitor-enter p1

    :try_start_0
    invoke-virtual {p2}, Lcom/daaw/e14;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Timeout."

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->b()J

    move-result-wide v1

    sub-long/2addr v1, p4

    long-to-int p4, v1

    const/4 p5, 0x0

    invoke-virtual {p0, p3, p5, v0, p4}, Lcom/daaw/fg5;->v(Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object p4, p0, Lcom/daaw/fg5;->l:Lcom/daaw/td5;

    const-string v0, "timeout"

    invoke-virtual {p4, p3, v0}, Lcom/daaw/td5;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p4, p0, Lcom/daaw/fg5;->o:Lcom/daaw/wx4;

    const-string v0, "timeout"

    invoke-virtual {p4, p3, v0}, Lcom/daaw/wx4;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/daaw/fg5;->p:Lcom/daaw/vo6;

    const-string p4, "Timeout"

    invoke-interface {p6, p4}, Lcom/daaw/io6;->m(Ljava/lang/String;)Lcom/daaw/io6;

    invoke-interface {p6, p5}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {p6}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p3}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final r()V
    .locals 6

    sget-object v0, Lcom/daaw/kb3;->a:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/fg5;->m:Lcom/google/android/gms/internal/ads/zzchu;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    sget-object v2, Lcom/daaw/g93;->C1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_3

    iget-boolean v0, p0, Lcom/daaw/fg5;->q:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/fg5;->a:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/fg5;->a:Z

    if-eqz v0, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    iget-object v0, p0, Lcom/daaw/fg5;->l:Lcom/daaw/td5;

    invoke-virtual {v0}, Lcom/daaw/td5;->f()V

    iget-object v0, p0, Lcom/daaw/fg5;->o:Lcom/daaw/wx4;

    invoke-virtual {v0}, Lcom/daaw/wx4;->zzf()V

    iget-object v0, p0, Lcom/daaw/fg5;->e:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/sf5;

    invoke-direct {v2, p0}, Lcom/daaw/sf5;-><init>(Lcom/daaw/fg5;)V

    iget-object v3, p0, Lcom/daaw/fg5;->i:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v3}, Lcom/daaw/e14;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iput-boolean v1, p0, Lcom/daaw/fg5;->a:Z

    invoke-virtual {p0}, Lcom/daaw/fg5;->u()Lcom/daaw/f77;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/fg5;->k:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/daaw/yf5;

    invoke-direct {v2, p0}, Lcom/daaw/yf5;-><init>(Lcom/daaw/fg5;)V

    sget-object v3, Lcom/daaw/g93;->E1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    new-instance v1, Lcom/daaw/dg5;

    invoke-direct {v1, p0}, Lcom/daaw/dg5;-><init>(Lcom/daaw/fg5;)V

    iget-object v2, p0, Lcom/daaw/fg5;->i:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/fg5;->a:Z

    if-nez v0, :cond_4

    const-string v0, "com.google.android.gms.ads.MobileAds"

    const-string v2, ""

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/fg5;->v(Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v0, p0, Lcom/daaw/fg5;->e:Lcom/daaw/e14;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    iput-boolean v1, p0, Lcom/daaw/fg5;->a:Z

    iput-boolean v1, p0, Lcom/daaw/fg5;->b:Z

    :cond_4
    return-void
.end method

.method public final s(Lcom/daaw/gj3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fg5;->e:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/zf5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/zf5;-><init>(Lcom/daaw/fg5;Lcom/daaw/gj3;)V

    iget-object p1, p0, Lcom/daaw/fg5;->j:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/e14;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/fg5;->b:Z

    return v0
.end method

.method public final declared-synchronized u()Lcom/daaw/f77;
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzh()Lcom/daaw/kz3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/kz3;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v1

    new-instance v2, Lcom/daaw/bg5;

    invoke-direct {v2, p0, v0}, Lcom/daaw/bg5;-><init>(Lcom/daaw/fg5;Lcom/daaw/e14;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/ads/internal/util/zzg;->zzq(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final v(Ljava/lang/String;ZLjava/lang/String;I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fg5;->n:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbrz;

    invoke-direct {v1, p1, p2, p4, p3}, Lcom/google/android/gms/internal/ads/zzbrz;-><init>(Ljava/lang/String;ZILjava/lang/String;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
