.class Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->queryPurchases()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)V
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 288
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$200(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/android/billingclient/api/BillingClient;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 290
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 291
    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v2}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$200(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/android/billingclient/api/BillingClient;

    move-result-object v2

    const-string v3, "inapp"

    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/BillingClient;->queryPurchases(Ljava/lang/String;)Lcom/android/billingclient/api/Purchase$PurchasesResult;

    move-result-object v2

    .line 292
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Querying purchases elapsed time: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "ms"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "BillingManager"

    invoke-static {v5, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 295
    iget-object v3, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->areSubscriptionsSupported()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 296
    iget-object v3, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    .line 297
    invoke-static {v3}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$200(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/android/billingclient/api/BillingClient;

    move-result-object v3

    const-string v6, "subs"

    invoke-virtual {v3, v6}, Lcom/android/billingclient/api/BillingClient;->queryPurchases(Ljava/lang/String;)Lcom/android/billingclient/api/Purchase$PurchasesResult;

    move-result-object v3

    .line 298
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Querying purchases and subscriptions elapsed time: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v0

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 298
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 300
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Querying subscriptions result code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    invoke-virtual {v3}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " res: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    invoke-virtual {v3}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getPurchasesList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v3}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getPurchasesList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 300
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 304
    invoke-virtual {v3}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getResponseCode()I

    move-result v0

    if-nez v0, :cond_2

    .line 305
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getPurchasesList()Ljava/util/List;

    move-result-object v0

    .line 306
    invoke-virtual {v3}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getPurchasesList()Ljava/util/List;

    move-result-object v1

    .line 305
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    const-string v0, "Got an error response trying to query subscription purchases"

    .line 308
    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 310
    :cond_3
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getResponseCode()I

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "Skipped subscription purchases query since they are not supported"

    .line 311
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 313
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryPurchases() got an error response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 313
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 316
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v0, v2}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$300(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Lcom/android/billingclient/api/Purchase$PurchasesResult;)V

    return-void
.end method
