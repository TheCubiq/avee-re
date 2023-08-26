.class Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Ljava/lang/Runnable;


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

.field final synthetic val$onConsumeListener:Lcom/android/billingclient/api/ConsumeResponseListener;

.field final synthetic val$purchaseToken:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    iput-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;->val$purchaseToken:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;->val$onConsumeListener:Lcom/android/billingclient/api/ConsumeResponseListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 212
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;->this$0:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-static {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->access$200(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/android/billingclient/api/BillingClient;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;->val$purchaseToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;->val$onConsumeListener:Lcom/android/billingclient/api/ConsumeResponseListener;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/BillingClient;->consumeAsync(Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V

    return-void
.end method
