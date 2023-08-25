.class public final synthetic Lcom/daaw/p1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/OnUserEarnedRewardListener;


# instance fields
.field public final synthetic a:Lcom/daaw/r1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p1;->a:Lcom/daaw/r1;

    return-void
.end method


# virtual methods
.method public final onUserEarnedReward(Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p1;->a:Lcom/daaw/r1;

    invoke-static {v0, p1}, Lcom/daaw/r1;->a(Lcom/daaw/r1;Lcom/google/android/gms/ads/rewarded/RewardItem;)V

    return-void
.end method
