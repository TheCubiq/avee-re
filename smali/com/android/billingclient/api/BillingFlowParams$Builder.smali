.class public Lcom/android/billingclient/api/BillingFlowParams$Builder;
.super Ljava/lang/Object;
.source "BillingFlowParams.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/BillingFlowParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mAccountId:Ljava/lang/String;

.field private mOldSku:Ljava/lang/String;

.field private mReplaceSkusProrationMode:I

.field private mSku:Ljava/lang/String;

.field private mSkuType:Ljava/lang/String;

.field private mVrPurchaseFlow:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 124
    iput v0, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mReplaceSkusProrationMode:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/BillingFlowParams$1;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public addOldSku(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 206
    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mOldSku:Ljava/lang/String;

    return-object p0
.end method

.method public build()Lcom/android/billingclient/api/BillingFlowParams;
    .locals 2

    .line 280
    new-instance v0, Lcom/android/billingclient/api/BillingFlowParams;

    invoke-direct {v0}, Lcom/android/billingclient/api/BillingFlowParams;-><init>()V

    .line 281
    iget-object v1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mSku:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams;->access$102(Lcom/android/billingclient/api/BillingFlowParams;Ljava/lang/String;)Ljava/lang/String;

    .line 282
    iget-object v1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mSkuType:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams;->access$202(Lcom/android/billingclient/api/BillingFlowParams;Ljava/lang/String;)Ljava/lang/String;

    .line 283
    iget-object v1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mOldSku:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams;->access$302(Lcom/android/billingclient/api/BillingFlowParams;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    iget-object v1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mAccountId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams;->access$402(Lcom/android/billingclient/api/BillingFlowParams;Ljava/lang/String;)Ljava/lang/String;

    .line 285
    iget-boolean v1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mVrPurchaseFlow:Z

    invoke-static {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams;->access$502(Lcom/android/billingclient/api/BillingFlowParams;Z)Z

    .line 286
    iget v1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mReplaceSkusProrationMode:I

    invoke-static {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams;->access$602(Lcom/android/billingclient/api/BillingFlowParams;I)I

    return-object v0
.end method

.method public setAccountId(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 0

    .line 258
    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mAccountId:Ljava/lang/String;

    return-object p0
.end method

.method public setOldSku(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mOldSku:Ljava/lang/String;

    return-object p0
.end method

.method public setOldSkus(Ljava/util/ArrayList;)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/android/billingclient/api/BillingFlowParams$Builder;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    .line 175
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 176
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mOldSku:Ljava/lang/String;

    :cond_0
    return-object p0
.end method

.method public setReplaceSkusProrationMode(I)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 0

    .line 235
    iput p1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mReplaceSkusProrationMode:I

    return-object p0
.end method

.method public setSku(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mSku:Ljava/lang/String;

    return-object p0
.end method

.method public setType(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mSkuType:Ljava/lang/String;

    return-object p0
.end method

.method public setVrPurchaseFlow(Z)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 0

    .line 274
    iput-boolean p1, p0, Lcom/android/billingclient/api/BillingFlowParams$Builder;->mVrPurchaseFlow:Z

    return-object p0
.end method
