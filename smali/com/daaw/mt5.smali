.class public final Lcom/daaw/mt5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/s05;

.field public final c:Lcom/google/android/gms/internal/ads/zzchu;

.field public final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/s05;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mt5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/mt5;->c:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p3, p0, Lcom/daaw/mt5;->b:Lcom/daaw/s05;

    iput-object p4, p0, Lcom/daaw/mt5;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 7

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/daaw/oj6;

    iget-object v2, p0, Lcom/daaw/mt5;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v3, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p1, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzl(Lcom/daaw/yh6;)Ljava/lang/String;

    move-result-object v5

    iget-object p1, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v6, p1

    check-cast v6, Lcom/daaw/gn3;

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/oj6;->t(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/gn3;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/mt5;->b:Lcom/daaw/s05;

    new-instance v1, Lcom/daaw/rm4;

    iget-object v2, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/sz4;

    new-instance p2, Lcom/daaw/lt5;

    invoke-direct {p2, p0, p3}, Lcom/daaw/lt5;-><init>(Lcom/daaw/mt5;Lcom/daaw/tq5;)V

    const/4 v2, 0x0

    invoke-direct {p1, p2, v2}, Lcom/daaw/sz4;-><init>(Lcom/daaw/c15;Lcom/daaw/a74;)V

    invoke-virtual {v0, v1, p1}, Lcom/daaw/s05;->c(Lcom/daaw/rm4;Lcom/daaw/sz4;)Lcom/daaw/pz4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/am4;->c()Lcom/daaw/nr4;

    move-result-object p2

    new-instance v0, Lcom/daaw/eg4;

    iget-object v1, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/oj6;

    invoke-direct {v0, v1}, Lcom/daaw/eg4;-><init>(Lcom/daaw/oj6;)V

    iget-object v1, p0, Lcom/daaw/mt5;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/am4;->g()Lcom/daaw/nw5;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/ys5;->h3(Lcom/daaw/gn3;)V

    invoke-virtual {p1}, Lcom/daaw/pz4;->i()Lcom/daaw/oz4;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/tq5;ZLandroid/content/Context;Lcom/daaw/br4;)V
    .locals 1

    :try_start_0
    iget-object p4, p1, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast p4, Lcom/daaw/oj6;

    invoke-virtual {p4, p2}, Lcom/daaw/oj6;->A(Z)V

    iget-object p2, p0, Lcom/daaw/mt5;->c:Lcom/google/android/gms/internal/ads/zzchu;

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    sget-object p4, Lcom/daaw/g93;->B0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    if-ge p2, p4, :cond_0

    iget-object p1, p1, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/oj6;

    invoke-virtual {p1}, Lcom/daaw/oj6;->C()V

    return-void

    :cond_0
    iget-object p1, p1, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/oj6;

    invoke-virtual {p1, p3}, Lcom/daaw/oj6;->D(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Cannot show interstitial."

    invoke-static {p2}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    new-instance p2, Lcom/daaw/b15;

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/daaw/b15;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
