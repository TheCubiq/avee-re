.class public final Lcom/daaw/pw3;
.super Lcom/daaw/sv3;
.source ""


# instance fields
.field public final p:Ljava/lang/String;

.field public final q:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/ads/rewarded/RewardItem;->getType()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/ads/rewarded/RewardItem;->getAmount()I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    :goto_1
    invoke-direct {p0, v0, p1}, Lcom/daaw/pw3;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/sv3;-><init>()V

    iput-object p1, p0, Lcom/daaw/pw3;->p:Ljava/lang/String;

    iput p2, p0, Lcom/daaw/pw3;->q:I

    return-void
.end method


# virtual methods
.method public final zze()I
    .locals 1

    iget v0, p0, Lcom/daaw/pw3;->q:I

    return v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw3;->p:Ljava/lang/String;

    return-object v0
.end method
