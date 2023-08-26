.class Lcom/android/billingclient/api/BillingClientImpl$4$1;
.super Ljava/lang/Object;
.source "BillingClientImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/BillingClientImpl$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/billingclient/api/BillingClientImpl$4;

.field final synthetic val$result:Lcom/android/billingclient/api/Purchase$PurchasesResult;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/BillingClientImpl$4;Lcom/android/billingclient/api/Purchase$PurchasesResult;)V
    .locals 0

    .line 490
    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$4$1;->this$1:Lcom/android/billingclient/api/BillingClientImpl$4;

    iput-object p2, p0, Lcom/android/billingclient/api/BillingClientImpl$4$1;->val$result:Lcom/android/billingclient/api/Purchase$PurchasesResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 493
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl$4$1;->this$1:Lcom/android/billingclient/api/BillingClientImpl$4;

    iget-object v0, v0, Lcom/android/billingclient/api/BillingClientImpl$4;->val$listener:Lcom/android/billingclient/api/PurchaseHistoryResponseListener;

    iget-object v1, p0, Lcom/android/billingclient/api/BillingClientImpl$4$1;->val$result:Lcom/android/billingclient/api/Purchase$PurchasesResult;

    .line 494
    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getResponseCode()I

    move-result v1

    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$4$1;->val$result:Lcom/android/billingclient/api/Purchase$PurchasesResult;

    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getPurchasesList()Ljava/util/List;

    move-result-object v2

    .line 493
    invoke-interface {v0, v1, v2}, Lcom/android/billingclient/api/PurchaseHistoryResponseListener;->onPurchaseHistoryResponse(ILjava/util/List;)V

    return-void
.end method
