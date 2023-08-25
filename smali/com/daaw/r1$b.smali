.class public final Lcom/daaw/r1$b;
.super Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/r1;->t(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/r1;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Lcom/daaw/r1;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/r1$b;->a:Lcom/daaw/r1;

    iput p2, p0, Lcom/daaw/r1$b;->b:I

    invoke-direct {p0}, Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/ads/rewarded/RewardedAd;)V
    .locals 2

    const-string v0, "ad"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/AdLoadCallback;->onAdLoaded(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/r1$b;->a:Lcom/daaw/r1;

    invoke-static {v0}, Lcom/daaw/r1;->o(Lcom/daaw/r1;)Ljava/util/HashMap;

    move-result-object v0

    iget v1, p0, Lcom/daaw/r1$b;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lcom/daaw/r1;->f:Lcom/daaw/r1$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/r1$a;->b(Z)V

    return-void
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/AdLoadCallback;->onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V

    iget-object v0, p0, Lcom/daaw/r1$b;->a:Lcom/daaw/r1;

    invoke-virtual {v0, p1}, Lcom/daaw/r1;->v(Lcom/google/android/gms/ads/LoadAdError;)V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/ads/rewarded/RewardedAd;

    invoke-virtual {p0, p1}, Lcom/daaw/r1$b;->a(Lcom/google/android/gms/ads/rewarded/RewardedAd;)V

    return-void
.end method
