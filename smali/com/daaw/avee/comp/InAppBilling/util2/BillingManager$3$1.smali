.class Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3$1;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/SkuDetailsResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3$1;->this$1:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSkuDetailsResponse(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;)V"
        }
    .end annotation

    .line 176
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3$1;->this$1:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;

    iget-object v0, v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;->val$listener:Lcom/android/billingclient/api/SkuDetailsResponseListener;

    invoke-interface {v0, p1, p2}, Lcom/android/billingclient/api/SkuDetailsResponseListener;->onSkuDetailsResponse(ILjava/util/List;)V

    return-void
.end method
