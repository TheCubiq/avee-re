.class public final Lcom/daaw/fu5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/q15;

.field public c:Lcom/daaw/sn3;

.field public final d:Lcom/google/android/gms/internal/ads/zzchu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/q15;Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fu5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/fu5;->b:Lcom/daaw/q15;

    iput-object p3, p0, Lcom/daaw/fu5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/fu5;Lcom/daaw/sn3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fu5;->c:Lcom/daaw/sn3;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 11

    :try_start_0
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/dp3;

    iget-object v1, p2, Lcom/daaw/th6;->a0:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/daaw/dp3;->N2(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/fu5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    sget-object v1, Lcom/daaw/g93;->x1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

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

    iget-object p1, p0, Lcom/daaw/fu5;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v7

    new-instance v8, Lcom/daaw/eu5;

    invoke-direct {v8, p0, p3, v2}, Lcom/daaw/eu5;-><init>(Lcom/daaw/fu5;Lcom/daaw/tq5;Lcom/daaw/du5;)V

    iget-object p1, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v9, p1

    check-cast v9, Lcom/daaw/gn3;

    invoke-interface/range {v3 .. v9}, Lcom/daaw/dp3;->y2(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/yd0;Lcom/daaw/xo3;Lcom/daaw/gn3;)V

    return-void

    :cond_0
    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/daaw/dp3;

    iget-object v4, p2, Lcom/daaw/th6;->V:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p2, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p2, p2, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v6, p2, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p2, p0, Lcom/daaw/fu5;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v7

    new-instance v8, Lcom/daaw/eu5;

    invoke-direct {v8, p0, p3, v2}, Lcom/daaw/eu5;-><init>(Lcom/daaw/fu5;Lcom/daaw/tq5;Lcom/daaw/du5;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v9, p2

    check-cast v9, Lcom/daaw/gn3;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v10, p1, Lcom/daaw/ri6;->i:Lcom/google/android/gms/internal/ads/zzblz;

    invoke-interface/range {v3 .. v10}, Lcom/daaw/dp3;->b1(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/yd0;Lcom/daaw/xo3;Lcom/daaw/gn3;Lcom/google/android/gms/internal/ads/zzblz;)V
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
    .locals 4

    iget-object v0, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v0, v0, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->g:Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/fu5;->c:Lcom/daaw/sn3;

    invoke-static {v0}, Lcom/daaw/j35;->a0(Lcom/daaw/sn3;)Lcom/daaw/j35;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v1, v1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/daaw/j35;->K()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/fu5;->b:Lcom/daaw/q15;

    new-instance v2, Lcom/daaw/rm4;

    iget-object v3, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v2, p1, p2, v3}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/v35;

    invoke-direct {p1, v0}, Lcom/daaw/v35;-><init>(Lcom/daaw/j35;)V

    new-instance p2, Lcom/daaw/p55;

    iget-object v0, p0, Lcom/daaw/fu5;->c:Lcom/daaw/sn3;

    const/4 v3, 0x0

    invoke-direct {p2, v3, v3, v0, v3}, Lcom/daaw/p55;-><init>(Lcom/daaw/pn3;Lcom/daaw/on3;Lcom/daaw/sn3;[B)V

    invoke-virtual {v1, v2, p1, p2}, Lcom/daaw/q15;->d(Lcom/daaw/rm4;Lcom/daaw/v35;Lcom/daaw/p55;)Lcom/daaw/l35;

    move-result-object p1

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/am4;->f()Lcom/daaw/hw5;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/ys5;->h3(Lcom/daaw/gn3;)V

    invoke-virtual {p1}, Lcom/daaw/m35;->h()Lcom/daaw/e35;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/daaw/yu5;

    const/4 p2, 0x1

    const-string p3, "No corresponding native ad listener"

    invoke-direct {p1, p2, p3}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/daaw/yu5;

    const/4 p2, 0x2

    const-string p3, "Unified must be used for RTB."

    invoke-direct {p1, p2, p3}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    throw p1
.end method
