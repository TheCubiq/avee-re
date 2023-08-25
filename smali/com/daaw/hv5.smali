.class public final Lcom/daaw/hv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/o95;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/o95;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hv5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/hv5;->b:Lcom/daaw/o95;

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

    iget-object v0, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v0, v0, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->o:Lcom/daaw/bi6;

    iget v0, v0, Lcom/daaw/bi6;->a:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/daaw/dp3;

    iget-object v4, p2, Lcom/daaw/th6;->V:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v6, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p0, Lcom/daaw/hv5;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v7

    new-instance v8, Lcom/daaw/gv5;

    invoke-direct {v8, p0, p3, v2}, Lcom/daaw/gv5;-><init>(Lcom/daaw/hv5;Lcom/daaw/tq5;Lcom/daaw/fv5;)V

    iget-object p1, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v9, p1

    check-cast v9, Lcom/daaw/gn3;

    invoke-interface/range {v3 .. v9}, Lcom/daaw/dp3;->Z1(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/yd0;Lcom/daaw/ap3;Lcom/daaw/gn3;)V

    return-void

    :cond_0
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/daaw/dp3;

    iget-object v4, p2, Lcom/daaw/th6;->V:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v6, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p0, Lcom/daaw/hv5;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v7

    new-instance v8, Lcom/daaw/gv5;

    invoke-direct {v8, p0, p3, v2}, Lcom/daaw/gv5;-><init>(Lcom/daaw/hv5;Lcom/daaw/tq5;Lcom/daaw/fv5;)V

    iget-object p1, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v9, p1

    check-cast v9, Lcom/daaw/gn3;

    invoke-interface/range {v3 .. v9}, Lcom/daaw/dp3;->z1(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/yd0;Lcom/daaw/ap3;Lcom/daaw/gn3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Remote exception loading a rewarded RTB ad"

    invoke-static {p2, p1}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/daaw/kt5;

    iget-object v1, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/dp3;

    sget-object v2, Lcom/google/android/gms/ads/AdFormat;->REWARDED:Lcom/google/android/gms/ads/AdFormat;

    invoke-direct {v0, p2, v1, v2}, Lcom/daaw/kt5;-><init>(Lcom/daaw/th6;Lcom/daaw/dp3;Lcom/google/android/gms/ads/AdFormat;)V

    iget-object v1, p0, Lcom/daaw/hv5;->b:Lcom/daaw/o95;

    new-instance v2, Lcom/daaw/rm4;

    iget-object v3, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v2, p1, p2, v3}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/l95;

    invoke-direct {p1, v0}, Lcom/daaw/l95;-><init>(Lcom/daaw/c15;)V

    invoke-virtual {v1, v2, p1}, Lcom/daaw/o95;->b(Lcom/daaw/rm4;Lcom/daaw/l95;)Lcom/daaw/k95;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/am4;->b()Lcom/daaw/gr4;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/daaw/kt5;->b(Lcom/daaw/gr4;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/k95;->n()Lcom/daaw/gw5;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/ys5;->h3(Lcom/daaw/gn3;)V

    invoke-virtual {p1}, Lcom/daaw/k95;->k()Lcom/daaw/j95;

    move-result-object p1

    return-object p1
.end method
