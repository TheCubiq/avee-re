.class Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->querySkuDetailsAsync(Ljava/lang/String;Ljava/util/List;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

.field final synthetic val$itemType:Ljava/lang/String;

.field final synthetic val$listener:Lcom/android/billingclient/api/SkuDetailsResponseListener;

.field final synthetic val$skuList:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Ljava/util/List;Ljava/lang/String;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    iput-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->val$skuList:Ljava/util/List;

    iput-object p3, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->val$itemType:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->val$listener:Lcom/android/billingclient/api/SkuDetailsResponseListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 169
    invoke-static {}, Lcom/android/billingclient/api/SkuDetailsParams;->newBuilder()Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    move-result-object v0

    .line 170
    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->val$skuList:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->setSkusList(Ljava/util/List;)Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->val$itemType:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->setType(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    .line 171
    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$200(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/android/billingclient/api/BillingClient;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->build()Lcom/android/billingclient/api/SkuDetailsParams;

    move-result-object v0

    new-instance v2, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3$1;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3$1;-><init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;)V

    invoke-virtual {v1, v0, v2}, Lcom/android/billingclient/api/BillingClient;->querySkuDetailsAsync(Lcom/android/billingclient/api/SkuDetailsParams;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V

    return-void
.end method
