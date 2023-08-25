.class public final Lcom/daaw/ns5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/zj4;

.field public c:Landroid/view/View;

.field public d:Lcom/daaw/mn3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/zj4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ns5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ns5;->b:Lcom/daaw/zj4;

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/ns5;Lcom/daaw/mn3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ns5;->d:Lcom/daaw/mn3;

    return-void
.end method

.method public static bridge synthetic e(Lcom/daaw/ns5;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ns5;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 10

    :try_start_0
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/dp3;

    iget-object v1, p2, Lcom/daaw/th6;->a0:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/daaw/dp3;->N2(Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/g93;->Z6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p2, Lcom/daaw/th6;->i0:Z

    if-eqz v0, :cond_0

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/daaw/dp3;

    iget-object v3, p2, Lcom/daaw/th6;->V:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p2, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p2, p2, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v5, p2, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p2, p0, Lcom/daaw/ns5;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v6

    new-instance v7, Lcom/daaw/ms5;

    invoke-direct {v7, p0, p3, v1}, Lcom/daaw/ms5;-><init>(Lcom/daaw/ns5;Lcom/daaw/tq5;Lcom/daaw/ls5;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v8, p2

    check-cast v8, Lcom/daaw/gn3;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v9, p1, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-interface/range {v2 .. v9}, Lcom/daaw/dp3;->c3(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/yd0;Lcom/daaw/ro3;Lcom/daaw/gn3;Lcom/google/android/gms/ads/internal/client/zzq;)V

    return-void

    :cond_0
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/daaw/dp3;

    iget-object v3, p2, Lcom/daaw/th6;->V:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p2, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p2, p2, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v5, p2, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p2, p0, Lcom/daaw/ns5;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v6

    new-instance v7, Lcom/daaw/ms5;

    invoke-direct {v7, p0, p3, v1}, Lcom/daaw/ms5;-><init>(Lcom/daaw/ns5;Lcom/daaw/tq5;Lcom/daaw/ls5;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v8, p2

    check-cast v8, Lcom/daaw/gn3;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v9, p1, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-interface/range {v2 .. v9}, Lcom/daaw/dp3;->s1(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/yd0;Lcom/daaw/ro3;Lcom/daaw/gn3;Lcom/google/android/gms/ads/internal/client/zzq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/daaw/wi6;

    invoke-direct {p2, p1}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw p2
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

    if-eqz v0, :cond_1

    iget-boolean v0, p2, Lcom/daaw/th6;->i0:Z

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ns5;->d:Lcom/daaw/mn3;

    invoke-interface {v0}, Lcom/daaw/mn3;->zze()Lcom/daaw/yd0;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v2, p0, Lcom/daaw/ns5;->d:Lcom/daaw/mn3;

    invoke-interface {v2}, Lcom/daaw/mn3;->zzf()Z

    move-result v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v0, :cond_0

    if-eqz v2, :cond_2

    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v2

    new-instance v3, Lcom/daaw/js5;

    invoke-direct {v3, p0, v0, p2}, Lcom/daaw/js5;-><init>(Lcom/daaw/ns5;Landroid/view/View;Lcom/daaw/th6;)V

    sget-object v0, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    invoke-static {v2, v3, v0}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;
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

    const-string p3, "BannerRtbAdapterWrapper interscrollerView should not be null"

    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_2
    move-exception p1

    new-instance p2, Lcom/daaw/wi6;

    invoke-direct {p2, p1}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    iget-object v0, p0, Lcom/daaw/ns5;->c:Landroid/view/View;

    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/daaw/ns5;->b:Lcom/daaw/zj4;

    new-instance v3, Lcom/daaw/rm4;

    iget-object v4, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v3, p1, p2, v4}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/gj4;

    new-instance v4, Lcom/daaw/ks5;

    invoke-direct {v4, p3}, Lcom/daaw/ks5;-><init>(Lcom/daaw/tq5;)V

    iget-object p2, p2, Lcom/daaw/th6;->v:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/uh6;

    invoke-direct {p1, v0, v1, v4, p2}, Lcom/daaw/gj4;-><init>(Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/uh6;)V

    invoke-virtual {v2, v3, p1}, Lcom/daaw/zj4;->a(Lcom/daaw/rm4;Lcom/daaw/gj4;)Lcom/daaw/aj4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/aj4;->i()Lcom/daaw/ny4;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/daaw/ny4;->C0(Landroid/view/View;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/am4;->f()Lcom/daaw/hw5;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/ys5;->h3(Lcom/daaw/gn3;)V

    invoke-virtual {p1}, Lcom/daaw/aj4;->h()Lcom/daaw/zi4;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Landroid/view/View;Lcom/daaw/th6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 0

    iget-object p3, p0, Lcom/daaw/ns5;->a:Landroid/content/Context;

    invoke-static {p3, p1, p2}, Lcom/daaw/qk4;->a(Landroid/content/Context;Landroid/view/View;Lcom/daaw/th6;)Lcom/daaw/qk4;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
