.class Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/BillingClientStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->startServiceConnection(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

.field final synthetic val$executeOnSuccess:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Ljava/lang/Runnable;)V
    .locals 0

    .line 324
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    iput-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;->val$executeOnSuccess:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBillingServiceDisconnected()V
    .locals 2

    .line 340
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$402(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Z)Z

    return-void
.end method

.method public onBillingSetupFinished(I)V
    .locals 2

    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setup finished. Response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BillingManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p1, :cond_0

    .line 330
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$402(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Z)Z

    .line 331
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;->val$executeOnSuccess:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 332
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 335
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$502(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;I)I

    return-void
.end method
