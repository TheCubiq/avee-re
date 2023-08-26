.class Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$1;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;-><init>(Landroid/app/Activity;Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;)V
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

    .line 92
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$1;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$1;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$000(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;->onBillingClientSetupFinished()V

    const-string v0, "BillingManager"

    const-string v1, "Setup successful. Querying inventory."

    .line 98
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$1;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->queryPurchases()V

    return-void
.end method
