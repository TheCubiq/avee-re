.class public final Lcom/daaw/k75;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ri6;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/ia5;

.field public final d:Lcom/daaw/a95;

.field public final e:Landroid/content/Context;

.field public final f:Lcom/daaw/kd5;

.field public final g:Lcom/daaw/on6;

.field public final h:Lcom/daaw/op6;

.field public final i:Lcom/daaw/cq5;


# direct methods
.method public constructor <init>(Lcom/daaw/ri6;Ljava/util/concurrent/Executor;Lcom/daaw/ia5;Landroid/content/Context;Lcom/daaw/kd5;Lcom/daaw/on6;Lcom/daaw/op6;Lcom/daaw/cq5;Lcom/daaw/a95;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k75;->a:Lcom/daaw/ri6;

    iput-object p2, p0, Lcom/daaw/k75;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/k75;->c:Lcom/daaw/ia5;

    iput-object p4, p0, Lcom/daaw/k75;->e:Landroid/content/Context;

    iput-object p5, p0, Lcom/daaw/k75;->f:Lcom/daaw/kd5;

    iput-object p6, p0, Lcom/daaw/k75;->g:Lcom/daaw/on6;

    iput-object p7, p0, Lcom/daaw/k75;->h:Lcom/daaw/op6;

    iput-object p8, p0, Lcom/daaw/k75;->i:Lcom/daaw/cq5;

    iput-object p9, p0, Lcom/daaw/k75;->d:Lcom/daaw/a95;

    return-void
.end method

.method public static final i(Lcom/daaw/a74;)V
    .locals 2

    sget-object v0, Lcom/daaw/yg3;->h:Lcom/daaw/zg3;

    const-string v1, "/videoClicked"

    invoke-interface {p0, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    invoke-interface {p0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/t84;->Z(Z)V

    sget-object v0, Lcom/daaw/g93;->k3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/yg3;->s:Lcom/daaw/zg3;

    const-string v1, "/getNativeAdViewSignals"

    invoke-interface {p0, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_0
    sget-object v0, Lcom/daaw/yg3;->t:Lcom/daaw/zg3;

    const-string v1, "/getNativeClickMeta"

    invoke-interface {p0, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Lcom/daaw/f77;
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/a75;

    invoke-direct {v1, p0}, Lcom/daaw/a75;-><init>(Lcom/daaw/k75;)V

    iget-object v2, p0, Lcom/daaw/k75;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/b75;

    invoke-direct {v1, p0, p1}, Lcom/daaw/b75;-><init>(Lcom/daaw/k75;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/daaw/k75;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/th6;Lcom/daaw/wh6;Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/f77;
    .locals 9

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v8, Lcom/daaw/d75;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p5

    move-object v4, p3

    move-object v5, p4

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lcom/daaw/d75;-><init>(Lcom/daaw/k75;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/k75;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v8, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lorg/json/JSONObject;Lcom/daaw/a74;)Lcom/daaw/f77;
    .locals 3

    invoke-static {p2}, Lcom/daaw/d14;->e(Ljava/lang/Object;)Lcom/daaw/d14;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/k75;->a:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->b:Lcom/google/android/gms/internal/ads/zzbsl;

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/daaw/v84;->d()Lcom/daaw/v84;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/v84;->e()Lcom/daaw/v84;

    move-result-object v1

    :goto_0
    invoke-interface {p2, v1}, Lcom/daaw/a74;->Q(Lcom/daaw/v84;)V

    invoke-interface {p2}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v1

    new-instance v2, Lcom/daaw/z65;

    invoke-direct {v2, p0, p2, v0}, Lcom/daaw/z65;-><init>(Lcom/daaw/k75;Lcom/daaw/a74;Lcom/daaw/d14;)V

    invoke-interface {v1, v2}, Lcom/daaw/t84;->E(Lcom/daaw/o84;)V

    const-string v1, "google.afma.nativeAds.renderVideo"

    invoke-interface {p2, v1, p1}, Lcom/daaw/kk3;->C0(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public final synthetic d(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/k75;->c:Lcom/daaw/ia5;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/ia5;->a(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/d14;->e(Ljava/lang/Object;)Lcom/daaw/d14;

    move-result-object v2

    iget-object v3, v0, Lcom/daaw/k75;->a:Lcom/daaw/ri6;

    iget-object v3, v3, Lcom/daaw/ri6;->b:Lcom/google/android/gms/internal/ads/zzbsl;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/k75;->h(Lcom/daaw/a74;)V

    invoke-static {}, Lcom/daaw/v84;->d()Lcom/daaw/v84;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/daaw/a74;->Q(Lcom/daaw/v84;)V

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/daaw/k75;->d:Lcom/daaw/a95;

    invoke-virtual {v3}, Lcom/daaw/a95;->b()Lcom/daaw/x85;

    move-result-object v10

    move-object v6, v10

    move-object v8, v10

    move-object/from16 v21, v10

    move-object v9, v10

    move-object v7, v10

    invoke-interface {v1}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v5

    new-instance v3, Lcom/google/android/gms/ads/internal/zzb;

    move-object v13, v3

    iget-object v11, v0, Lcom/daaw/k75;->e:Landroid/content/Context;

    invoke-direct {v3, v11, v4, v4}, Lcom/google/android/gms/ads/internal/zzb;-><init>(Landroid/content/Context;Lcom/daaw/cx3;Lcom/google/android/gms/internal/ads/zzcbh;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    iget-object v3, v0, Lcom/daaw/k75;->i:Lcom/daaw/cq5;

    move-object/from16 v16, v3

    iget-object v3, v0, Lcom/daaw/k75;->h:Lcom/daaw/op6;

    move-object/from16 v17, v3

    iget-object v3, v0, Lcom/daaw/k75;->f:Lcom/daaw/kd5;

    move-object/from16 v18, v3

    iget-object v3, v0, Lcom/daaw/k75;->g:Lcom/daaw/on6;

    move-object/from16 v19, v3

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-interface/range {v5 .. v23}, Lcom/daaw/t84;->J(Lcom/google/android/gms/ads/internal/client/zza;Lcom/daaw/mf3;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/daaw/of3;Lcom/google/android/gms/ads/internal/overlay/zzz;ZLcom/daaw/bh3;Lcom/google/android/gms/ads/internal/zzb;Lcom/daaw/iq3;Lcom/daaw/cx3;Lcom/daaw/cq5;Lcom/daaw/op6;Lcom/daaw/kd5;Lcom/daaw/on6;Lcom/daaw/rh3;Lcom/daaw/vy4;Lcom/daaw/qh3;Lcom/daaw/kh3;)V

    invoke-static {v1}, Lcom/daaw/k75;->i(Lcom/daaw/a74;)V

    :goto_0
    invoke-interface {v1}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v3

    new-instance v5, Lcom/daaw/e75;

    invoke-direct {v5, v0, v1, v2}, Lcom/daaw/e75;-><init>(Lcom/daaw/k75;Lcom/daaw/a74;Lcom/daaw/d14;)V

    invoke-interface {v3, v5}, Lcom/daaw/t84;->E(Lcom/daaw/o84;)V

    move-object/from16 v3, p4

    move-object/from16 v5, p5

    invoke-interface {v1, v3, v5, v4}, Lcom/daaw/a74;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public final synthetic e(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 3

    iget-object p1, p0, Lcom/daaw/k75;->c:Lcom/daaw/ia5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzq;->zzc()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lcom/daaw/ia5;->a(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/d14;->e(Ljava/lang/Object;)Lcom/daaw/d14;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/daaw/k75;->h(Lcom/daaw/a74;)V

    invoke-interface {p1}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v1

    new-instance v2, Lcom/daaw/c75;

    invoke-direct {v2, v0}, Lcom/daaw/c75;-><init>(Lcom/daaw/d14;)V

    invoke-interface {v1, v2}, Lcom/daaw/t84;->y0(Lcom/daaw/s84;)V

    sget-object v1, Lcom/daaw/g93;->j3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Lcom/daaw/a74;->loadUrl(Ljava/lang/String;)V

    return-object v0
.end method

.method public final synthetic f(Lcom/daaw/a74;Lcom/daaw/d14;Z)V
    .locals 0

    iget-object p3, p0, Lcom/daaw/k75;->a:Lcom/daaw/ri6;

    iget-object p3, p3, Lcom/daaw/ri6;->a:Lcom/google/android/gms/ads/internal/client/zzfl;

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->zzs()Lcom/daaw/z74;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->zzs()Lcom/daaw/z74;

    move-result-object p1

    iget-object p3, p0, Lcom/daaw/k75;->a:Lcom/daaw/ri6;

    iget-object p3, p3, Lcom/daaw/ri6;->a:Lcom/google/android/gms/ads/internal/client/zzfl;

    invoke-virtual {p1, p3}, Lcom/daaw/z74;->j3(Lcom/google/android/gms/ads/internal/client/zzfl;)V

    :cond_0
    invoke-virtual {p2}, Lcom/daaw/d14;->g()V

    return-void
.end method

.method public final synthetic g(Lcom/daaw/a74;Lcom/daaw/d14;Z)V
    .locals 1

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/daaw/k75;->a:Lcom/daaw/ri6;

    iget-object p3, p3, Lcom/daaw/ri6;->a:Lcom/google/android/gms/ads/internal/client/zzfl;

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->zzs()Lcom/daaw/z74;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->zzs()Lcom/daaw/z74;

    move-result-object p1

    iget-object p3, p0, Lcom/daaw/k75;->a:Lcom/daaw/ri6;

    iget-object p3, p3, Lcom/daaw/ri6;->a:Lcom/google/android/gms/ads/internal/client/zzfl;

    invoke-virtual {p1, p3}, Lcom/daaw/z74;->j3(Lcom/google/android/gms/ads/internal/client/zzfl;)V

    :cond_0
    invoke-virtual {p2}, Lcom/daaw/d14;->g()V

    return-void

    :cond_1
    new-instance p1, Lcom/daaw/yu5;

    const/4 p3, 0x1

    const-string v0, "Html video Web View failed to load."

    invoke-direct {p1, p3, v0}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final h(Lcom/daaw/a74;)V
    .locals 8

    invoke-static {p1}, Lcom/daaw/k75;->i(Lcom/daaw/a74;)V

    sget-object v0, Lcom/daaw/yg3;->l:Lcom/daaw/zg3;

    const-string v1, "/video"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v0, Lcom/daaw/yg3;->m:Lcom/daaw/zg3;

    const-string v1, "/videoMeta"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    new-instance v0, Lcom/daaw/k54;

    invoke-direct {v0}, Lcom/daaw/k54;-><init>()V

    const-string v1, "/precache"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v0, Lcom/daaw/yg3;->p:Lcom/daaw/zg3;

    const-string v1, "/delayPageLoaded"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v0, Lcom/daaw/yg3;->n:Lcom/daaw/zg3;

    const-string v1, "/instrument"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object v0, Lcom/daaw/yg3;->g:Lcom/daaw/zg3;

    const-string v1, "/log"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/yg3;->a(Lcom/daaw/vy4;)Lcom/daaw/zg3;

    move-result-object v0

    const-string v1, "/click"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v0, p0, Lcom/daaw/k75;->a:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->b:Lcom/google/android/gms/internal/ads/zzbsl;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/t84;->t0(Z)V

    new-instance v0, Lcom/daaw/jh3;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/daaw/jh3;-><init>(Lcom/google/android/gms/ads/internal/zzb;Lcom/daaw/bq3;Lcom/daaw/cq5;Lcom/daaw/kd5;Lcom/daaw/on6;)V

    const-string v1, "/open"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/daaw/t84;->t0(Z)V

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzn()Lcom/daaw/ky3;

    move-result-object v0

    invoke-interface {p1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ky3;->z(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/daaw/eh3;

    invoke-interface {p1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/eh3;-><init>(Landroid/content/Context;)V

    const-string v1, "/logScionEvent"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    :cond_1
    return-void
.end method
