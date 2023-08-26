.class Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;

.field final synthetic val$handler:Landroid/os/Handler;

.field final synthetic val$listener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;

.field final synthetic val$moreSkus:Ljava/util/List;

.field final synthetic val$querySkuDetails:Z


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;ZLjava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;Landroid/os/Handler;)V
    .locals 0

    .line 620
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->this$0:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;

    iput-boolean p2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->val$querySkuDetails:Z

    iput-object p3, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->val$moreSkus:Ljava/util/List;

    iput-object p4, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->val$listener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;

    iput-object p5, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 622
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/4 v1, 0x0

    const-string v2, "Inventory refresh successful."

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x0

    .line 625
    :try_start_0
    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->this$0:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;

    iget-boolean v2, v2, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDisposed:Z

    if-nez v2, :cond_0

    .line 626
    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->this$0:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;

    iget-boolean v3, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->val$querySkuDetails:Z

    iget-object v4, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->val$moreSkus:Ljava/util/List;

    invoke-virtual {v2, v3, v4}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->queryInventory(ZLjava/util/List;)Lcom/daaw/avee/comp/InAppBilling/util/Inventory;

    move-result-object v1
    :try_end_0
    .catch Lcom/daaw/avee/comp/InAppBilling/util/IabException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 632
    :catch_0
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/4 v2, 0x6

    const-string v3, "Error type #ME"

    invoke-direct {v0, v2, v3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 629
    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;->getResult()Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    move-result-object v0

    .line 635
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->this$0:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagEndAsync()V

    .line 639
    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->this$0:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;

    iget-boolean v2, v2, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDisposed:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->val$listener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;

    if-eqz v2, :cond_1

    .line 640
    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;->val$handler:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2$1;-><init>(Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Inventory;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
