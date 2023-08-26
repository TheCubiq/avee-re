.class Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;
.super Ljava/lang/Object;
.source "SkuDetails.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/SkuDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SkuDetailsResult"
.end annotation


# instance fields
.field private mResponseCode:I

.field private mSkuDetailsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;)V"
        }
    .end annotation

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-object p2, p0, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;->mSkuDetailsList:Ljava/util/List;

    .line 159
    iput p1, p0, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;->mResponseCode:I

    return-void
.end method


# virtual methods
.method getResponseCode()I
    .locals 1

    .line 168
    iget v0, p0, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;->mResponseCode:I

    return v0
.end method

.method getSkuDetailsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;"
        }
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;->mSkuDetailsList:Ljava/util/List;

    return-object v0
.end method
