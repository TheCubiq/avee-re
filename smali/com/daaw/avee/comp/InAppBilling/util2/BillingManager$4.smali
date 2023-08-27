.class Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$4;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/ConsumeResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->consumeAsync(Ljava/lang/String;)V
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

    .line 198
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$4;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConsumeResponse(ILjava/lang/String;)V
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$4;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$000(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;->onConsumeFinished(Ljava/lang/String;I)V

    return-void
.end method
