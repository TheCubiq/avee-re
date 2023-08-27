.class Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->initiatePurchaseFlow(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

.field final synthetic val$billingType:Ljava/lang/String;

.field final synthetic val$oldSkus:Ljava/util/ArrayList;

.field final synthetic val$skuId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    iput-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->val$oldSkus:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->val$skuId:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->val$billingType:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Launching in-app purchase flow. Replace old SKU? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->val$oldSkus:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BillingManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->val$skuId:Ljava/lang/String;

    .line 138
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSku(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->val$billingType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setType(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->val$oldSkus:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setOldSkus(Ljava/util/ArrayList;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object v0

    .line 139
    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$200(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/android/billingclient/api/BillingClient;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v2}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$100(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/android/billingclient/api/BillingClient;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)I

    return-void
.end method
