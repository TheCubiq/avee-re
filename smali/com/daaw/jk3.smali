.class public final Lcom/daaw/jk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bk3;
.implements Lcom/daaw/wj3;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final p:Lcom/daaw/a74;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/sl2;Lcom/google/android/gms/ads/internal/zza;)V
    .locals 14

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzz()Lcom/daaw/p74;

    invoke-static {}, Lcom/daaw/v84;->a()Lcom/daaw/v84;

    move-result-object v1

    invoke-static {}, Lcom/daaw/x33;->a()Lcom/daaw/x33;

    move-result-object v11

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, p1

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v13}, Lcom/daaw/p74;->a(Landroid/content/Context;Lcom/daaw/v84;Ljava/lang/String;ZZLcom/daaw/sl2;Lcom/daaw/ja3;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/v93;Lcom/google/android/gms/ads/internal/zzl;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/x33;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v0

    move-object v1, p0

    iput-object v0, v1, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    check-cast v0, Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method public static final Z(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzb()Lcom/daaw/d04;

    invoke-static {}, Lcom/daaw/d04;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final B0(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    new-instance v1, Lcom/daaw/ik3;

    invoke-direct {v1, p0, p2}, Lcom/daaw/ik3;-><init>(Lcom/daaw/jk3;Lcom/daaw/zg3;)V

    invoke-interface {v0, p1, v1}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void
.end method

.method public final synthetic C0(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vj3;->d(Lcom/daaw/wj3;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic E(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    invoke-interface {v0, p1}, Lcom/daaw/kk3;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic G(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/a74;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic J(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    invoke-interface {v0, p1}, Lcom/daaw/a74;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic S(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/a74;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic T(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vj3;->a(Lcom/daaw/wj3;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final synthetic c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vj3;->c(Lcom/daaw/wj3;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d0(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    new-instance v1, Lcom/daaw/dk3;

    invoke-direct {v1, p2}, Lcom/daaw/dk3;-><init>(Lcom/daaw/zg3;)V

    invoke-interface {v0, p1, v1}, Lcom/daaw/a74;->c0(Ljava/lang/String;Lcom/daaw/uy0;)V

    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/fk3;

    invoke-direct {v0, p0, p1}, Lcom/daaw/fk3;-><init>(Lcom/daaw/jk3;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/jk3;->Z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic l(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vj3;->b(Lcom/daaw/wj3;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final m(Lcom/daaw/pk3;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v0

    new-instance v1, Lcom/daaw/ck3;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/daaw/ck3;-><init>(Lcom/daaw/pk3;[B)V

    invoke-interface {v0, v1}, Lcom/daaw/t84;->y0(Lcom/daaw/s84;)V

    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/hk3;

    invoke-direct {v0, p0, p1}, Lcom/daaw/hk3;-><init>(Lcom/daaw/jk3;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/jk3;->Z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/ek3;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ek3;-><init>(Lcom/daaw/jk3;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/jk3;->Z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzc()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->destroy()V

    return-void
.end method

.method public final zzh(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/daaw/gk3;

    invoke-direct {v0, p0, p1}, Lcom/daaw/gk3;-><init>(Lcom/daaw/jk3;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/jk3;->Z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzi()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/jk3;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->o0()Z

    move-result v0

    return v0
.end method

.method public final zzj()Lcom/daaw/ll3;
    .locals 1

    new-instance v0, Lcom/daaw/ll3;

    invoke-direct {v0, p0}, Lcom/daaw/ll3;-><init>(Lcom/daaw/kl3;)V

    return-object v0
.end method
