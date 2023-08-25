.class public final Lcom/daaw/vs5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/ws5;


# direct methods
.method public constructor <init>(Lcom/daaw/ws5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vs5;->a:Lcom/daaw/ws5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/zi4;

    invoke-virtual {p1}, Lcom/daaw/zl4;->b()V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vs5;->a:Lcom/daaw/ws5;

    invoke-static {v0}, Lcom/daaw/ws5;->d(Lcom/daaw/ws5;)Lcom/daaw/zj4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/zj4;->d()Lcom/daaw/jn4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/jn4;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/vs5;->a:Lcom/daaw/ws5;

    invoke-static {v1}, Lcom/daaw/ws5;->e(Lcom/daaw/ws5;)Lcom/daaw/nq4;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/nq4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    const-string v1, "DelayedBannerAd.onFailure"

    invoke-static {v0, p1, v1}, Lcom/daaw/nj6;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
