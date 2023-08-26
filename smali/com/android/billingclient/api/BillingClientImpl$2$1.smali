.class Lcom/android/billingclient/api/BillingClientImpl$2$1;
.super Ljava/lang/Object;
.source "BillingClientImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/BillingClientImpl$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/billingclient/api/BillingClientImpl$2;

.field final synthetic val$result:Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/BillingClientImpl$2;Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$2$1;->this$1:Lcom/android/billingclient/api/BillingClientImpl$2;

    iput-object p2, p0, Lcom/android/billingclient/api/BillingClientImpl$2$1;->val$result:Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 441
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl$2$1;->this$1:Lcom/android/billingclient/api/BillingClientImpl$2;

    iget-object v0, v0, Lcom/android/billingclient/api/BillingClientImpl$2;->val$listener:Lcom/android/billingclient/api/SkuDetailsResponseListener;

    iget-object v1, p0, Lcom/android/billingclient/api/BillingClientImpl$2$1;->val$result:Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    .line 442
    invoke-virtual {v1}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;->getResponseCode()I

    move-result v1

    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$2$1;->val$result:Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;->getSkuDetailsList()Ljava/util/List;

    move-result-object v2

    .line 441
    invoke-interface {v0, v1, v2}, Lcom/android/billingclient/api/SkuDetailsResponseListener;->onSkuDetailsResponse(ILjava/util/List;)V

    return-void
.end method
