.class Lcom/daaw/avee/Design/IAP2Design$UpdateListener;
.super Ljava/lang/Object;
.source "IAP2Design.java"

# interfaces
.implements Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Design/IAP2Design;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "UpdateListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/IAP2Design;


# direct methods
.method private constructor <init>(Lcom/daaw/avee/Design/IAP2Design;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/daaw/avee/Design/IAP2Design$UpdateListener;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/daaw/avee/Design/IAP2Design;Lcom/daaw/avee/Design/IAP2Design$1;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/IAP2Design$UpdateListener;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    return-void
.end method


# virtual methods
.method public onBillingClientSetupFinished()V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/Design/IAP2Design$UpdateListener;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-virtual {v0}, Lcom/daaw/avee/Design/IAP2Design;->onBillingManagerSetupFinished()V

    return-void
.end method

.method public onConsumeFinished(Ljava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public onPurchasesUpdated(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 87
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/Purchase;

    .line 88
    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->getSku()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x12fb31a9

    const/4 v5, 0x0

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "premium"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    .line 90
    sput-boolean v1, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    .line 91
    sget-object v1, Lcom/daaw/avee/Design/IAP2Design;->onPremium:Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 96
    :cond_3
    iget-object p1, p0, Lcom/daaw/avee/Design/IAP2Design$UpdateListener;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/IAP2Design;->updateUi()V

    return-void
.end method
