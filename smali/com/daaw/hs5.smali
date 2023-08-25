.class public final Lcom/daaw/hs5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/zj4;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/zj4;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hs5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/hs5;->b:Lcom/daaw/zj4;

    iput-object p3, p0, Lcom/daaw/hs5;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 9

    iget-object v0, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v0, v0, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/client/zzq;->zzn:Z

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v2, p0, Lcom/daaw/hs5;->a:Landroid/content/Context;

    iget v3, v0, Lcom/google/android/gms/ads/internal/client/zzq;->zze:I

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/zzq;->zzb:I

    invoke-static {v3, v0}, Lcom/google/android/gms/ads/zzb;->zzd(II)Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/ads/internal/client/zzq;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    :goto_0
    move-object v4, v1

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/daaw/g93;->Z6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p2, Lcom/daaw/th6;->i0:Z

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v2, p0, Lcom/daaw/hs5;->a:Landroid/content/Context;

    iget v3, v0, Lcom/google/android/gms/ads/internal/client/zzq;->zze:I

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/zzq;->zzb:I

    invoke-static {v3, v0}, Lcom/google/android/gms/ads/zzb;->zze(II)Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/ads/internal/client/zzq;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/hs5;->a:Landroid/content/Context;

    iget-object v1, p2, Lcom/daaw/th6;->v:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/daaw/vi6;->a(Landroid/content/Context;Ljava/util/List;)Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v1

    goto :goto_0

    :goto_1
    sget-object v0, Lcom/daaw/g93;->Z6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p2, Lcom/daaw/th6;->i0:Z

    if-eqz v0, :cond_2

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/daaw/oj6;

    iget-object v3, p0, Lcom/daaw/hs5;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v5, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzl(Lcom/daaw/yh6;)Ljava/lang/String;

    move-result-object v7

    iget-object p1, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v8, p1

    check-cast v8, Lcom/daaw/gn3;

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/oj6;->s(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/gn3;)V

    return-void

    :cond_2
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/daaw/oj6;

    iget-object v3, p0, Lcom/daaw/hs5;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v5, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzl(Lcom/daaw/yh6;)Ljava/lang/String;

    move-result-object v7

    iget-object p1, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v8, p1

    check-cast v8, Lcom/daaw/gn3;

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/oj6;->r(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/gn3;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lcom/daaw/g93;->Z6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v0, p2, Lcom/daaw/th6;->i0:Z

    if-eqz v0, :cond_2

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    invoke-virtual {v0}, Lcom/daaw/oj6;->h()Lcom/daaw/mn3;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {v0}, Lcom/daaw/mn3;->zze()Lcom/daaw/yd0;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-interface {v0}, Lcom/daaw/mn3;->zzf()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v2, :cond_0

    if-eqz v0, :cond_3

    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v3, Lcom/daaw/gs5;

    invoke-direct {v3, p0, v2, p2}, Lcom/daaw/gs5;-><init>(Lcom/daaw/hs5;Landroid/view/View;Lcom/daaw/th6;)V

    sget-object v2, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    invoke-static {v0, v3, v2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance p2, Lcom/daaw/wi6;

    invoke-direct {p2, p1}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    new-instance p1, Lcom/daaw/wi6;

    new-instance p2, Ljava/lang/Exception;

    const-string p3, "BannerAdapterWrapper interscrollerView should not be null"

    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_2
    move-exception p1

    new-instance p2, Lcom/daaw/wi6;

    invoke-direct {p2, p1}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    const-string p1, "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    new-instance p2, Lcom/daaw/wi6;

    new-instance p3, Ljava/lang/Exception;

    invoke-direct {p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p3}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    invoke-virtual {v0}, Lcom/daaw/oj6;->f()Landroid/view/View;

    move-result-object v2

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/daaw/hs5;->b:Lcom/daaw/zj4;

    new-instance v3, Lcom/daaw/rm4;

    iget-object v4, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v3, p1, p2, v4}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/gj4;

    iget-object v4, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v4, Lcom/daaw/oj6;

    new-instance v5, Lcom/daaw/cs5;

    invoke-direct {v5, v4}, Lcom/daaw/cs5;-><init>(Lcom/daaw/oj6;)V

    iget-object p2, p2, Lcom/daaw/th6;->v:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/uh6;

    invoke-direct {p1, v2, v1, v5, p2}, Lcom/daaw/gj4;-><init>(Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/uh6;)V

    invoke-virtual {v0, v3, p1}, Lcom/daaw/zj4;->a(Lcom/daaw/rm4;Lcom/daaw/gj4;)Lcom/daaw/aj4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/aj4;->i()Lcom/daaw/ny4;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/daaw/ny4;->C0(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/daaw/am4;->c()Lcom/daaw/nr4;

    move-result-object p2

    new-instance v0, Lcom/daaw/eg4;

    iget-object v1, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/oj6;

    invoke-direct {v0, v1}, Lcom/daaw/eg4;-><init>(Lcom/daaw/oj6;)V

    iget-object v1, p0, Lcom/daaw/hs5;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/am4;->g()Lcom/daaw/nw5;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/ys5;->h3(Lcom/daaw/gn3;)V

    invoke-virtual {p1}, Lcom/daaw/aj4;->h()Lcom/daaw/zi4;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Landroid/view/View;Lcom/daaw/th6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 0

    iget-object p3, p0, Lcom/daaw/hs5;->a:Landroid/content/Context;

    invoke-static {p3, p1, p2}, Lcom/daaw/qk4;->a(Landroid/content/Context;Landroid/view/View;Lcom/daaw/th6;)Lcom/daaw/qk4;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
