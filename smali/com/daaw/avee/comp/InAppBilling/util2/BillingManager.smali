.class public Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/PurchasesUpdatedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$ServiceConnectedListener;,
        Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;
    }
.end annotation


# static fields
.field private static final BASE_64_ENCODED_PUBLIC_KEY:Ljava/lang/String; = "M"

.field public static final BILLING_MANAGER_NOT_INITIALIZED:I = -0x1

.field private static final TAG:Ljava/lang/String; = "BillingManager"

.field public static final onRequestBase64PublicKey:Lcom/daaw/avee/Common/Events/WeakDelegateR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegateR1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mActivity:Landroid/app/Activity;

.field private mBillingClient:Lcom/android/billingclient/api/BillingClient;

.field private mBillingClientResponseCode:I

.field private final mBillingUpdatesListener:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;

.field private mIsServiceConnected:Z

.field private final mPurchases:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;"
        }
    .end annotation
.end field

.field private mTokensToBeConsumed:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegateR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->onRequestBase64PublicKey:Lcom/daaw/avee/Common/Events/WeakDelegateR1;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;)V
    .locals 2

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mPurchases:Ljava/util/List;

    const/4 v0, -0x1

    .line 49
    iput v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClientResponseCode:I

    const-string v0, "BillingManager"

    const-string v1, "Creating Billing client."

    .line 82
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mActivity:Landroid/app/Activity;

    .line 84
    iput-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingUpdatesListener:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;

    .line 85
    invoke-static {p1}, Lcom/android/billingclient/api/BillingClient;->newBuilder(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/billingclient/api/BillingClient$Builder;->setListener(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingClient$Builder;->build()Lcom/android/billingclient/api/BillingClient;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    const-string p1, "Starting setup."

    .line 87
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$1;

    invoke-direct {p1, p0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$1;-><init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)V

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->startServiceConnection(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingUpdatesListener:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Landroid/app/Activity;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)Lcom/android/billingclient/api/BillingClient;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Lcom/android/billingclient/api/Purchase$PurchasesResult;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->onQueryPurchasesFinished(Lcom/android/billingclient/api/Purchase$PurchasesResult;)V

    return-void
.end method

.method static synthetic access$402(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Z)Z
    .locals 0

    .line 25
    iput-boolean p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mIsServiceConnected:Z

    return p1
.end method

.method static synthetic access$502(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;I)I
    .locals 0

    .line 25
    iput p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClientResponseCode:I

    return p1
.end method

.method private executeServiceRequest(Ljava/lang/Runnable;)V
    .locals 1

    .line 346
    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mIsServiceConnected:Z

    if-eqz v0, :cond_0

    .line 347
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 351
    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->startServiceConnection(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method private handlePurchase(Lcom/android/billingclient/api/Purchase;)V
    .locals 3

    .line 236
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getOriginalJson()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getSignature()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->verifyValidSignature(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const-string v1, "BillingManager"

    if-nez v0, :cond_0

    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got a purchase: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; but signature is bad. Skipping..."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 241
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got a verified purchase: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 243
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mPurchases:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private onQueryPurchasesFinished(Lcom/android/billingclient/api/Purchase$PurchasesResult;)V
    .locals 3

    .line 251
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    const-string v1, "BillingManager"

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getResponseCode()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Query inventory was successful."

    .line 257
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mPurchases:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 261
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getPurchasesList()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->onPurchasesUpdated(ILjava/util/List;)V

    return-void

    .line 252
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Billing client was null or result code ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase$PurchasesResult;->getResponseCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") was bad - quitting"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private verifyValidSignature(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 370
    sget-object v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->onRequestBase64PublicKey:Lcom/daaw/avee/Common/Events/WeakDelegateR1;

    const-string v1, "M"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegateR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 373
    :try_start_0
    invoke-static {v0, p1, p2}, Lcom/daaw/avee/comp/InAppBilling/util2/Security;->verifyPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 375
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Got an exception trying to validate a purchase: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "BillingManager"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public areSubscriptionsSupported()Z
    .locals 3

    .line 272
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    const-string v1, "subscriptions"

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingClient;->isFeatureSupported(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "areSubscriptionsSupported() got an error response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BillingManager"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public consumeAsync(Ljava/lang/String;)V
    .locals 2

    .line 189
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mTokensToBeConsumed:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 190
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mTokensToBeConsumed:Ljava/util/Set;

    goto :goto_0

    .line 191
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingManager"

    const-string v0, "Token was already scheduled to be consumed - skipping..."

    .line 192
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 195
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mTokensToBeConsumed:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 198
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$4;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$4;-><init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)V

    .line 208
    new-instance v1, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;

    invoke-direct {v1, p0, p1, v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$5;-><init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V

    .line 216
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->executeServiceRequest(Ljava/lang/Runnable;)V

    return-void
.end method

.method public destroy()V
    .locals 2

    const-string v0, "BillingManager"

    const-string v1, "Destroying the manager."

    .line 154
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient;->endConnection()V

    const/4 v0, 0x0

    .line 158
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    :cond_0
    return-void
.end method

.method public getBillingClientResponseCode()I
    .locals 1

    .line 224
    iget v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClientResponseCode:I

    return v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mActivity:Landroid/app/Activity;

    return-object v0
.end method

.method public initiatePurchaseFlow(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 125
    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->initiatePurchaseFlow(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method

.method public initiatePurchaseFlow(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 133
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;

    invoke-direct {v0, p0, p2, p1, p3}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$2;-><init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->executeServiceRequest(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onPurchasesUpdated(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    .line 110
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/Purchase;

    .line 111
    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->handlePurchase(Lcom/android/billingclient/api/Purchase;)V

    goto :goto_0

    .line 113
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingUpdatesListener:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;

    iget-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mPurchases:Ljava/util/List;

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;->onPurchasesUpdated(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    const-string v0, "BillingManager"

    if-ne p1, p2, :cond_2

    const-string p1, "onPurchasesUpdated() - user cancelled the purchase flow - skipping"

    .line 115
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 117
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPurchasesUpdated() got unknown resultCode: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method

.method public queryPurchases()V
    .locals 1

    .line 284
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$6;-><init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;)V

    .line 320
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->executeServiceRequest(Ljava/lang/Runnable;)V

    return-void
.end method

.method public querySkuDetailsAsync(Ljava/lang/String;Ljava/util/List;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/android/billingclient/api/SkuDetailsResponseListener;",
            ")V"
        }
    .end annotation

    .line 165
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;

    invoke-direct {v0, p0, p2, p1, p3}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$3;-><init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Ljava/util/List;Ljava/lang/String;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V

    .line 182
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->executeServiceRequest(Ljava/lang/Runnable;)V

    return-void
.end method

.method public startServiceConnection(Ljava/lang/Runnable;)V
    .locals 2

    .line 324
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    new-instance v1, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$7;-><init>(Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingClient;->startConnection(Lcom/android/billingclient/api/BillingClientStateListener;)V

    return-void
.end method
