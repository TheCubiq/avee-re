.class Lcom/android/billingclient/api/BillingClientImpl$1;
.super Landroid/content/BroadcastReceiver;
.source "BillingClientImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/BillingClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/billingclient/api/BillingClientImpl;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/BillingClientImpl;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$1;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 124
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$1;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1}, Lcom/android/billingclient/api/BillingClientImpl;->access$000(Lcom/android/billingclient/api/BillingClientImpl;)Lcom/android/billingclient/api/BillingBroadcastManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingBroadcastManager;->getListener()Lcom/android/billingclient/api/PurchasesUpdatedListener;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "BillingClient"

    const-string p2, "PurchasesUpdatedListener is null - no way to return the response."

    .line 126
    invoke-static {p1, p2}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x6

    const-string v1, "response_code_key"

    .line 133
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "response_bundle_key"

    .line 134
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    .line 135
    invoke-static {p2}, Lcom/android/billingclient/util/BillingHelper;->extractPurchases(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p2

    .line 136
    invoke-interface {p1, v0, p2}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(ILjava/util/List;)V

    return-void
.end method
