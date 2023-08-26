.class Lcom/android/billingclient/api/BillingClientImpl;
.super Lcom/android/billingclient/api/BillingClient;
.source "BillingClientImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;,
        Lcom/android/billingclient/api/BillingClientImpl$ClientState;
    }
.end annotation


# static fields
.field private static final GET_SKU_DETAILS_ITEM_LIST:Ljava/lang/String; = "ITEM_ID_LIST"

.field private static final LIBRARY_VERSION:Ljava/lang/String; = "1.1"

.field private static final LIBRARY_VERSION_KEY:Ljava/lang/String; = "libraryVersion"

.field private static final MAX_SKU_DETAILS_ITEMS_PER_REQUEST:I = 0x14

.field private static final TAG:Ljava/lang/String; = "BillingClient"


# instance fields
.field private final mApplicationContext:Landroid/content/Context;

.field private final mBroadcastManager:Lcom/android/billingclient/api/BillingBroadcastManager;

.field private mClientState:I

.field private mExecutorService:Ljava/util/concurrent/ExecutorService;

.field private mIABv6Supported:Z

.field private mService:Lcom/android/vending/billing/IInAppBillingService;

.field private mServiceConnection:Landroid/content/ServiceConnection;

.field private mSubscriptionUpdateSupported:Z

.field private mSubscriptionsSupported:Z

.field private final mUiThreadHandler:Landroid/os/Handler;

.field private final onPurchaseFinishedReceiver:Landroid/content/BroadcastReceiver;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/android/billingclient/api/PurchasesUpdatedListener;)V
    .locals 1

    .line 141
    invoke-direct {p0}, Lcom/android/billingclient/api/BillingClient;-><init>()V

    const/4 v0, 0x0

    .line 71
    iput v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mClientState:I

    .line 83
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mUiThreadHandler:Landroid/os/Handler;

    .line 120
    new-instance v0, Lcom/android/billingclient/api/BillingClientImpl$1;

    invoke-direct {v0, p0}, Lcom/android/billingclient/api/BillingClientImpl$1;-><init>(Lcom/android/billingclient/api/BillingClientImpl;)V

    iput-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->onPurchaseFinishedReceiver:Landroid/content/BroadcastReceiver;

    .line 142
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 143
    new-instance v0, Lcom/android/billingclient/api/BillingBroadcastManager;

    invoke-direct {v0, p1, p2}, Lcom/android/billingclient/api/BillingBroadcastManager;-><init>(Landroid/content/Context;Lcom/android/billingclient/api/PurchasesUpdatedListener;)V

    iput-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mBroadcastManager:Lcom/android/billingclient/api/BillingBroadcastManager;

    return-void
.end method

.method static synthetic access$000(Lcom/android/billingclient/api/BillingClientImpl;)Lcom/android/billingclient/api/BillingBroadcastManager;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mBroadcastManager:Lcom/android/billingclient/api/BillingBroadcastManager;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/android/billingclient/api/BillingClientImpl;)Z
    .locals 0

    .line 43
    iget-boolean p0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mIABv6Supported:Z

    return p0
.end method

.method static synthetic access$1002(Lcom/android/billingclient/api/BillingClientImpl;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mIABv6Supported:Z

    return p1
.end method

.method static synthetic access$200(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/Runnable;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/BillingClientImpl;->postToUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$300(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/BillingClientImpl;->consumeInternal(Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V

    return-void
.end method

.method static synthetic access$400(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/String;Z)Lcom/android/billingclient/api/Purchase$PurchasesResult;
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/BillingClientImpl;->queryPurchasesInternal(Ljava/lang/String;Z)Lcom/android/billingclient/api/Purchase$PurchasesResult;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Lcom/android/billingclient/api/BillingClientImpl;)Lcom/android/vending/billing/IInAppBillingService;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    return-object p0
.end method

.method static synthetic access$502(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/vending/billing/IInAppBillingService;)Lcom/android/vending/billing/IInAppBillingService;
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    return-object p1
.end method

.method static synthetic access$602(Lcom/android/billingclient/api/BillingClientImpl;I)I
    .locals 0

    .line 43
    iput p1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mClientState:I

    return p1
.end method

.method static synthetic access$700(Lcom/android/billingclient/api/BillingClientImpl;)Landroid/content/Context;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$802(Lcom/android/billingclient/api/BillingClientImpl;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mSubscriptionsSupported:Z

    return p1
.end method

.method static synthetic access$902(Lcom/android/billingclient/api/BillingClientImpl;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mSubscriptionUpdateSupported:Z

    return p1
.end method

.method private broadcastFailureAndReturnBillingResponse(I)I
    .locals 2

    .line 387
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mBroadcastManager:Lcom/android/billingclient/api/BillingBroadcastManager;

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingBroadcastManager;->getListener()Lcom/android/billingclient/api/PurchasesUpdatedListener;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(ILjava/util/List;)V

    return p1
.end method

.method private constructExtraParams(Lcom/android/billingclient/api/BillingFlowParams;)Landroid/os/Bundle;
    .locals 4

    .line 502
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 504
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams;->getReplaceSkusProrationMode()I

    move-result v1

    if-eqz v1, :cond_0

    .line 508
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams;->getReplaceSkusProrationMode()I

    move-result v1

    const-string v2, "prorationMode"

    .line 506
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 510
    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams;->getAccountId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 511
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams;->getAccountId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "accountId"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    :cond_1
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams;->getVrPurchaseFlow()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    const-string v1, "vr"

    .line 514
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 516
    :cond_2
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams;->getOldSku()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 517
    new-instance v1, Ljava/util/ArrayList;

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    .line 519
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams;->getOldSku()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "skusToReplace"

    .line 517
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_3
    return-object v0
.end method

.method private consumeInternal(Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V
    .locals 4

    const-string v0, "BillingClient"

    .line 758
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Consuming purchase with token: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    iget-object v1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 761
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 760
    invoke-interface {v1, v2, v3, p1}, Lcom/android/vending/billing/IInAppBillingService;->consumePurchase(ILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    const-string v2, "Successfully consumed purchase."

    .line 764
    invoke-static {v0, v2}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 766
    new-instance v0, Lcom/android/billingclient/api/BillingClientImpl$5;

    invoke-direct {v0, p0, p2, v1, p1}, Lcom/android/billingclient/api/BillingClientImpl$5;-><init>(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/billingclient/api/ConsumeResponseListener;ILjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/BillingClientImpl;->postToUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 775
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error consuming purchase with token. Response code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 778
    new-instance v0, Lcom/android/billingclient/api/BillingClientImpl$6;

    invoke-direct {v0, p0, p2, v1, p1}, Lcom/android/billingclient/api/BillingClientImpl$6;-><init>(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/billingclient/api/ConsumeResponseListener;ILjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/BillingClientImpl;->postToUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 788
    new-instance v1, Lcom/android/billingclient/api/BillingClientImpl$7;

    invoke-direct {v1, p0, v0, p2, p1}, Lcom/android/billingclient/api/BillingClientImpl$7;-><init>(Lcom/android/billingclient/api/BillingClientImpl;Landroid/os/RemoteException;Lcom/android/billingclient/api/ConsumeResponseListener;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/android/billingclient/api/BillingClientImpl;->postToUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private executeAsync(Ljava/lang/Runnable;)V
    .locals 1

    .line 527
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 528
    sget v0, Lcom/android/billingclient/util/BillingHelper;->NUMBER_OF_CORES:I

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 531
    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method private generateVrBundle()Landroid/os/Bundle;
    .locals 3

    .line 558
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "vr"

    const/4 v2, 0x1

    .line 559
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private isBillingSupportedOnVr(Ljava/lang/String;)I
    .locals 4

    .line 537
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 540
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 542
    invoke-direct {p0}, Lcom/android/billingclient/api/BillingClientImpl;->generateVrBundle()Landroid/os/Bundle;

    move-result-object v3

    .line 538
    invoke-interface {v0, v1, v2, p1, v3}, Lcom/android/vending/billing/IInAppBillingService;->isBillingSupportedExtraParams(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x2

    :goto_0
    return p1

    :catch_0
    const-string p1, "BillingClient"

    const-string v0, "RemoteException while checking if billing is supported; try to reconnect"

    .line 547
    invoke-static {p1, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1
.end method

.method private postToUiThread(Ljava/lang/Runnable;)V
    .locals 1

    .line 751
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mUiThreadHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private queryPurchasesInternal(Ljava/lang/String;Z)Lcom/android/billingclient/api/Purchase$PurchasesResult;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v8, p2

    .line 643
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Querying owned items, item type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; history: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v9, "BillingClient"

    invoke-static {v9, v2}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const/4 v11, 0x0

    move-object v6, v11

    :cond_0
    if-eqz v8, :cond_2

    .line 654
    :try_start_0
    iget-boolean v2, v1, Lcom/android/billingclient/api/BillingClientImpl;->mIABv6Supported:Z

    if-nez v2, :cond_1

    const-string v0, "getPurchaseHistory is not supported on current device"

    .line 655
    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    const/4 v2, -0x2

    invoke-direct {v0, v2, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    .line 659
    :cond_1
    iget-object v2, v1, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v3, 0x6

    iget-object v4, v1, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 662
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    move-object/from16 v5, p1

    .line 660
    invoke-interface/range {v2 .. v7}, Lcom/android/vending/billing/IInAppBillingService;->getPurchaseHistory(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_0

    .line 667
    :cond_2
    iget-object v2, v1, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v3, 0x3

    iget-object v4, v1, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 669
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 668
    invoke-interface {v2, v3, v4, v0, v6}, Lcom/android/vending/billing/IInAppBillingService;->getPurchases(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    const/4 v3, 0x6

    if-nez v2, :cond_3

    const-string v0, "queryPurchases got null owned items list"

    .line 678
    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 679
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    invoke-direct {v0, v3, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    .line 682
    :cond_3
    invoke-static {v2, v9}, Lcom/android/billingclient/util/BillingHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_4

    .line 685
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPurchases() failed. Response code: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    invoke-direct {v0, v4, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    :cond_4
    const-string v4, "INAPP_PURCHASE_ITEM_LIST"

    .line 689
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    const-string v5, "INAPP_PURCHASE_DATA_LIST"

    .line 690
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    const-string v6, "INAPP_DATA_SIGNATURE_LIST"

    .line 691
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    goto/16 :goto_2

    .line 698
    :cond_5
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 700
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 702
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    if-nez v4, :cond_6

    const-string v0, "Bundle returned from getPurchases() contains null SKUs list."

    .line 705
    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 706
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    invoke-direct {v0, v3, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    :cond_6
    if-nez v5, :cond_7

    const-string v0, "Bundle returned from getPurchases() contains null purchases list."

    .line 710
    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 712
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    invoke-direct {v0, v3, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    :cond_7
    if-nez v6, :cond_8

    const-string v0, "Bundle returned from getPurchases() contains null signatures list."

    .line 716
    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 718
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    invoke-direct {v0, v3, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    :cond_8
    const/4 v12, 0x0

    .line 721
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v12, v13, :cond_a

    .line 722
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 723
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 724
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 726
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Sku is owned: "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    :try_start_1
    new-instance v3, Lcom/android/billingclient/api/Purchase;

    invoke-direct {v3, v13, v14}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 735
    invoke-virtual {v3}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_9

    const-string v7, "BUG: empty/null token!"

    .line 736
    invoke-static {v9, v7}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    :cond_9
    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    const/4 v3, 0x6

    goto :goto_1

    :catch_0
    move-exception v0

    .line 731
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got an exception trying to decode the purchase: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 732
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    const/4 v2, 0x6

    invoke-direct {v0, v2, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    :cond_a
    const-string v3, "INAPP_CONTINUATION_TOKEN"

    .line 742
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 743
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Continuation token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 744
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 746
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v10}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    :cond_b
    :goto_2
    const-string v0, "Bundle returned from getPurchases() doesn\'t contain required fields."

    .line 692
    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    const/4 v2, 0x6

    invoke-direct {v0, v2, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0

    :catch_1
    move-exception v0

    .line 672
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got exception trying to get purchases: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "; try to reconnect"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    new-instance v0, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v11}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public consumeAsync(Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V
    .locals 2

    .line 451
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingClientImpl;->isReady()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    const/4 v0, 0x0

    .line 452
    invoke-interface {p2, p1, v0}, Lcom/android/billingclient/api/ConsumeResponseListener;->onConsumeResponse(ILjava/lang/String;)V

    return-void

    .line 457
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "BillingClient"

    const-string v1, "Please provide a valid purchase token got from queryPurchases result."

    .line 458
    invoke-static {v0, v1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    .line 460
    invoke-interface {p2, v0, p1}, Lcom/android/billingclient/api/ConsumeResponseListener;->onConsumeResponse(ILjava/lang/String;)V

    return-void

    .line 464
    :cond_1
    new-instance v0, Lcom/android/billingclient/api/BillingClientImpl$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/billingclient/api/BillingClientImpl$3;-><init>(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/BillingClientImpl;->executeAsync(Ljava/lang/Runnable;)V

    return-void
.end method

.method public endConnection()V
    .locals 5

    const-string v0, "BillingClient"

    const/4 v1, 0x3

    .line 263
    :try_start_0
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/android/billingclient/api/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Lcom/android/billingclient/api/LocalBroadcastManager;

    move-result-object v2

    iget-object v3, p0, Lcom/android/billingclient/api/BillingClientImpl;->onPurchaseFinishedReceiver:Landroid/content/BroadcastReceiver;

    .line 264
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 265
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl;->mBroadcastManager:Lcom/android/billingclient/api/BillingBroadcastManager;

    invoke-virtual {v2}, Lcom/android/billingclient/api/BillingBroadcastManager;->destroy()V

    .line 266
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl;->mServiceConnection:Landroid/content/ServiceConnection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    if-eqz v2, :cond_0

    const-string v2, "Unbinding from service."

    .line 267
    invoke-static {v0, v2}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    iget-object v4, p0, Lcom/android/billingclient/api/BillingClientImpl;->mServiceConnection:Landroid/content/ServiceConnection;

    invoke-virtual {v2, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 269
    iput-object v3, p0, Lcom/android/billingclient/api/BillingClientImpl;->mServiceConnection:Landroid/content/ServiceConnection;

    .line 271
    :cond_0
    iput-object v3, p0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 272
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    if-eqz v2, :cond_1

    .line 273
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 274
    iput-object v3, p0, Lcom/android/billingclient/api/BillingClientImpl;->mExecutorService:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 277
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "There was an exception while ending connection: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 279
    :cond_1
    :goto_0
    iput v1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mClientState:I

    return-void

    :goto_1
    iput v1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mClientState:I

    throw v0
.end method

.method public isFeatureSupported(Ljava/lang/String;)I
    .locals 6

    .line 148
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingClientImpl;->isReady()Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 152
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "subscriptions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "subscriptionsOnVr"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "inAppItemsOnVr"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "subscriptionsUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    const/4 v0, -0x2

    if-eqz v1, :cond_6

    if-eq v1, v4, :cond_4

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported feature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BillingClient"

    invoke-static {v0, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x5

    return p1

    :cond_2
    const-string p1, "subs"

    .line 165
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/BillingClientImpl;->isBillingSupportedOnVr(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_3
    const-string p1, "inapp"

    .line 162
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/BillingClientImpl;->isBillingSupportedOnVr(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 157
    :cond_4
    iget-boolean p1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mSubscriptionUpdateSupported:Z

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v5, -0x2

    :goto_1
    return v5

    .line 154
    :cond_6
    iget-boolean p1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mSubscriptionsSupported:Z

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v5, -0x2

    :goto_2
    return v5

    :sswitch_data_0
    .sparse-switch
        -0x1928a0a1 -> :sswitch_3
        0x116ae57f -> :sswitch_2
        0x48aff111 -> :sswitch_1
        0x7674caf6 -> :sswitch_0
    .end sparse-switch
.end method

.method public isReady()Z
    .locals 2

    .line 175
    iget v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mClientState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mServiceConnection:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "BUY_INTENT"

    .line 285
    invoke-virtual/range {p0 .. p0}, Lcom/android/billingclient/api/BillingClientImpl;->isReady()Z

    move-result v3

    const/4 v4, -0x1

    if-nez v3, :cond_0

    .line 286
    invoke-direct {v0, v4}, Lcom/android/billingclient/api/BillingClientImpl;->broadcastFailureAndReturnBillingResponse(I)I

    move-result v1

    return v1

    .line 289
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/BillingFlowParams;->getSkuType()Ljava/lang/String;

    move-result-object v9

    .line 290
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/BillingFlowParams;->getSku()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x5

    const-string v15, "BillingClient"

    if-nez v3, :cond_1

    const-string v1, "Please fix the input params. SKU can\'t be null."

    .line 294
    invoke-static {v15, v1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    invoke-direct {v0, v5}, Lcom/android/billingclient/api/BillingClientImpl;->broadcastFailureAndReturnBillingResponse(I)I

    move-result v1

    return v1

    :cond_1
    if-nez v9, :cond_2

    const-string v1, "Please fix the input params. SkuType can\'t be null."

    .line 299
    invoke-static {v15, v1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    invoke-direct {v0, v5}, Lcom/android/billingclient/api/BillingClientImpl;->broadcastFailureAndReturnBillingResponse(I)I

    move-result v1

    return v1

    :cond_2
    const-string v5, "subs"

    .line 304
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, -0x2

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/android/billingclient/api/BillingClientImpl;->mSubscriptionsSupported:Z

    if-nez v5, :cond_3

    const-string v1, "Current client doesn\'t support subscriptions."

    .line 305
    invoke-static {v15, v1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    invoke-direct {v0, v6}, Lcom/android/billingclient/api/BillingClientImpl;->broadcastFailureAndReturnBillingResponse(I)I

    move-result v1

    return v1

    .line 309
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/BillingFlowParams;->getOldSku()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    const/16 v17, 0x0

    if-eqz v5, :cond_4

    const/4 v5, 0x1

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_5

    .line 311
    iget-boolean v8, v0, Lcom/android/billingclient/api/BillingClientImpl;->mSubscriptionUpdateSupported:Z

    if-nez v8, :cond_5

    const-string v1, "Current client doesn\'t support subscriptions update."

    .line 312
    invoke-static {v15, v1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    invoke-direct {v0, v6}, Lcom/android/billingclient/api/BillingClientImpl;->broadcastFailureAndReturnBillingResponse(I)I

    move-result v1

    return v1

    .line 316
    :cond_5
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/BillingFlowParams;->hasExtraParams()Z

    move-result v8

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/android/billingclient/api/BillingClientImpl;->mIABv6Supported:Z

    if-nez v8, :cond_6

    const-string v1, "Current client doesn\'t support extra params for buy intent."

    .line 317
    invoke-static {v15, v1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    invoke-direct {v0, v6}, Lcom/android/billingclient/api/BillingClientImpl;->broadcastFailureAndReturnBillingResponse(I)I

    move-result v1

    return v1

    .line 322
    :cond_6
    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Constructing buy intent for "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", item type: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    iget-boolean v6, v0, Lcom/android/billingclient/api/BillingClientImpl;->mIABv6Supported:Z

    if-eqz v6, :cond_8

    move-object/from16 v6, p2

    .line 328
    invoke-direct {v0, v6}, Lcom/android/billingclient/api/BillingClientImpl;->constructExtraParams(Lcom/android/billingclient/api/BillingFlowParams;)Landroid/os/Bundle;

    move-result-object v11

    const-string v5, "libraryVersion"

    const-string v7, "1.1"

    .line 329
    invoke-virtual {v11, v5, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/BillingFlowParams;->getVrPurchaseFlow()Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v5, 0x7

    const/4 v6, 0x7

    goto :goto_1

    :cond_7
    const/4 v5, 0x6

    const/4 v6, 0x6

    .line 331
    :goto_1
    iget-object v5, v0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    iget-object v7, v0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 334
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    move-object v8, v3

    .line 332
    invoke-interface/range {v5 .. v11}, Lcom/android/vending/billing/IInAppBillingService;->getBuyIntentExtraParams(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v5

    move-object v11, v15

    goto :goto_2

    :cond_8
    move-object/from16 v6, p2

    if-eqz v5, :cond_9

    .line 341
    iget-object v10, v0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v11, 0x5

    iget-object v5, v0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 344
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    new-array v5, v7, [Ljava/lang/String;

    .line 345
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/BillingFlowParams;->getOldSku()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v17

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v5, "subs"
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v16, 0x0

    move-object v14, v3

    move-object v8, v15

    move-object v15, v5

    .line 342
    :try_start_1
    invoke-interface/range {v10 .. v16}, Lcom/android/vending/billing/IInAppBillingService;->getBuyIntentToReplaceSkus(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    move-object v11, v8

    goto :goto_2

    :cond_9
    move-object v8, v15

    .line 350
    iget-object v5, v0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v6, 0x3

    iget-object v7, v0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 353
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v10, 0x0

    move-object v11, v8

    move-object v8, v3

    .line 351
    :try_start_2
    invoke-interface/range {v5 .. v10}, Lcom/android/vending/billing/IInAppBillingService;->getBuyIntent(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    .line 359
    :goto_2
    invoke-static {v5, v11}, Lcom/android/billingclient/util/BillingHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_a

    .line 361
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to buy item, Error response code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    invoke-direct {v0, v6}, Lcom/android/billingclient/api/BillingClientImpl;->broadcastFailureAndReturnBillingResponse(I)I

    move-result v1

    return v1

    .line 365
    :cond_a
    new-instance v6, Landroid/content/Intent;

    const-class v7, Lcom/android/billingclient/api/ProxyBillingActivity;

    invoke-direct {v6, v1, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 366
    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Landroid/app/PendingIntent;

    .line 367
    invoke-virtual {v6, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 372
    invoke-virtual {v1, v6}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    return v17

    :catch_0
    move-object v11, v8

    goto :goto_3

    :catch_1
    move-object v11, v15

    .line 374
    :catch_2
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RemoteException while launching launching replace subscriptions flow: ; for sku: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; try to reconnect"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 379
    invoke-static {v11, v1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    invoke-direct {v0, v4}, Lcom/android/billingclient/api/BillingClientImpl;->broadcastFailureAndReturnBillingResponse(I)I

    move-result v1

    return v1
.end method

.method public queryPurchaseHistoryAsync(Ljava/lang/String;Lcom/android/billingclient/api/PurchaseHistoryResponseListener;)V
    .locals 1

    .line 476
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingClientImpl;->isReady()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    const/4 v0, 0x0

    .line 477
    invoke-interface {p2, p1, v0}, Lcom/android/billingclient/api/PurchaseHistoryResponseListener;->onPurchaseHistoryResponse(ILjava/util/List;)V

    return-void

    .line 482
    :cond_0
    new-instance v0, Lcom/android/billingclient/api/BillingClientImpl$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/billingclient/api/BillingClientImpl$4;-><init>(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/String;Lcom/android/billingclient/api/PurchaseHistoryResponseListener;)V

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/BillingClientImpl;->executeAsync(Ljava/lang/Runnable;)V

    return-void
.end method

.method public queryPurchases(Ljava/lang/String;)Lcom/android/billingclient/api/Purchase$PurchasesResult;
    .locals 2

    .line 393
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingClientImpl;->isReady()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 394
    new-instance p1, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v1}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object p1

    .line 398
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid SKU type."

    .line 399
    invoke-static {p1, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    new-instance p1, Lcom/android/billingclient/api/Purchase$PurchasesResult;

    const/4 v0, 0x5

    invoke-direct {p1, v0, v1}, Lcom/android/billingclient/api/Purchase$PurchasesResult;-><init>(ILjava/util/List;)V

    return-object p1

    :cond_1
    const/4 v0, 0x0

    .line 403
    invoke-direct {p0, p1, v0}, Lcom/android/billingclient/api/BillingClientImpl;->queryPurchasesInternal(Ljava/lang/String;Z)Lcom/android/billingclient/api/Purchase$PurchasesResult;

    move-result-object p1

    return-object p1
.end method

.method public querySkuDetailsAsync(Lcom/android/billingclient/api/SkuDetailsParams;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V
    .locals 5

    .line 409
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingClientImpl;->isReady()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    .line 410
    invoke-interface {p2, p1, v1}, Lcom/android/billingclient/api/SkuDetailsResponseListener;->onSkuDetailsResponse(ILjava/util/List;)V

    return-void

    .line 415
    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/SkuDetailsParams;->getSkuType()Ljava/lang/String;

    move-result-object v0

    .line 416
    invoke-virtual {p1}, Lcom/android/billingclient/api/SkuDetailsParams;->getSkusList()Ljava/util/List;

    move-result-object p1

    .line 419
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x5

    const-string v4, "BillingClient"

    if-eqz v2, :cond_1

    const-string p1, "Please fix the input params. SKU type can\'t be empty."

    .line 420
    invoke-static {v4, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    invoke-interface {p2, v3, v1}, Lcom/android/billingclient/api/SkuDetailsResponseListener;->onSkuDetailsResponse(ILjava/util/List;)V

    return-void

    :cond_1
    if-nez p1, :cond_2

    const-string p1, "Please fix the input params. The list of SKUs can\'t be empty."

    .line 426
    invoke-static {v4, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    invoke-interface {p2, v3, v1}, Lcom/android/billingclient/api/SkuDetailsResponseListener;->onSkuDetailsResponse(ILjava/util/List;)V

    return-void

    .line 431
    :cond_2
    new-instance v1, Lcom/android/billingclient/api/BillingClientImpl$2;

    invoke-direct {v1, p0, v0, p1, p2}, Lcom/android/billingclient/api/BillingClientImpl$2;-><init>(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/String;Ljava/util/List;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V

    invoke-direct {p0, v1}, Lcom/android/billingclient/api/BillingClientImpl;->executeAsync(Ljava/lang/Runnable;)V

    return-void
.end method

.method querySkuDetailsInternal(Ljava/lang/String;Ljava/util/List;)Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;"
        }
    .end annotation

    const-string v0, "BillingClient"

    .line 565
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 569
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_6

    add-int/lit8 v5, v4, 0x14

    if-le v5, v2, :cond_0

    move v6, v2

    goto :goto_1

    :cond_0
    move v6, v5

    .line 576
    :goto_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {p2, v4, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 577
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v6, "ITEM_ID_LIST"

    .line 578
    invoke-virtual {v4, v6, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v6, "libraryVersion"

    const-string v7, "1.1"

    .line 579
    invoke-virtual {v4, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x0

    .line 582
    :try_start_0
    iget-object v7, p0, Lcom/android/billingclient/api/BillingClientImpl;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v8, 0x3

    iget-object v9, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 583
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v9, p1, v4}, Lcom/android/vending/billing/IInAppBillingService;->getSkuDetails(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v7, 0x4

    if-nez v4, :cond_1

    const-string p1, "querySkuDetailsAsync got null sku details list"

    .line 592
    invoke-static {v0, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 593
    new-instance p1, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    invoke-direct {p1, v7, v6}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;-><init>(ILjava/util/List;)V

    return-object p1

    :cond_1
    const-string v8, "DETAILS_LIST"

    .line 596
    invoke-virtual {v4, v8}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v9

    const/4 v10, 0x6

    if-nez v9, :cond_3

    .line 598
    invoke-static {v4, v0}, Lcom/android/billingclient/util/BillingHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_2

    .line 601
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getSkuDetails() failed. Response code: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 602
    new-instance p2, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    invoke-direct {p2, p1, v1}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;-><init>(ILjava/util/List;)V

    return-object p2

    :cond_2
    const-string p1, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    .line 604
    invoke-static {v0, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 607
    new-instance p1, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    invoke-direct {p1, v10, v1}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;-><init>(ILjava/util/List;)V

    return-object p1

    .line 612
    :cond_3
    invoke-virtual {v4, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    if-nez v4, :cond_4

    const-string p1, "querySkuDetailsAsync got null response list"

    .line 615
    invoke-static {v0, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    new-instance p1, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    invoke-direct {p1, v7, v6}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;-><init>(ILjava/util/List;)V

    return-object p1

    :cond_4
    const/4 v7, 0x0

    .line 619
    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v7, v8, :cond_5

    .line 620
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 623
    :try_start_1
    new-instance v9, Lcom/android/billingclient/api/SkuDetails;

    invoke-direct {v9, v8}, Lcom/android/billingclient/api/SkuDetails;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 628
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Got sku details: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :catch_0
    const-string p1, "Got a JSON exception trying to decode SkuDetails"

    .line 625
    invoke-static {v0, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 626
    new-instance p1, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    invoke-direct {p1, v10, v6}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;-><init>(ILjava/util/List;)V

    return-object p1

    :cond_5
    move v4, v5

    goto/16 :goto_0

    :catch_1
    move-exception p1

    .line 585
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "querySkuDetailsAsync got a remote exception (try to reconnect): "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 586
    invoke-static {v0, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    new-instance p1, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    const/4 p2, -0x1

    invoke-direct {p1, p2, v6}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;-><init>(ILjava/util/List;)V

    return-object p1

    .line 636
    :cond_6
    new-instance p1, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    invoke-direct {p1, v3, v1}, Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;-><init>(ILjava/util/List;)V

    return-object p1
.end method

.method public startConnection(Lcom/android/billingclient/api/BillingClientStateListener;)V
    .locals 8

    .line 180
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingClientImpl;->isReady()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "BillingClient"

    if-eqz v0, :cond_0

    const-string v0, "Service connection is valid. No need to re-initialize."

    .line 181
    invoke-static {v2, v0}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    invoke-interface {p1, v1}, Lcom/android/billingclient/api/BillingClientStateListener;->onBillingSetupFinished(I)V

    return-void

    .line 186
    :cond_0
    iget v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mClientState:I

    const/4 v3, 0x5

    const/4 v4, 0x1

    if-ne v0, v4, :cond_1

    const-string v0, "Client is already in the process of connecting to billing service."

    .line 187
    invoke-static {v2, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    invoke-interface {p1, v3}, Lcom/android/billingclient/api/BillingClientStateListener;->onBillingSetupFinished(I)V

    return-void

    :cond_1
    const/4 v5, 0x3

    if-ne v0, v5, :cond_2

    const-string v0, "Client was already closed and can\'t be reused. Please create another instance."

    .line 194
    invoke-static {v2, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-interface {p1, v3}, Lcom/android/billingclient/api/BillingClientStateListener;->onBillingSetupFinished(I)V

    return-void

    .line 201
    :cond_2
    iput v4, p0, Lcom/android/billingclient/api/BillingClientImpl;->mClientState:I

    .line 204
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mBroadcastManager:Lcom/android/billingclient/api/BillingBroadcastManager;

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingBroadcastManager;->registerReceiver()V

    .line 208
    new-instance v0, Landroid/content/IntentFilter;

    const-string v3, "proxy_activity_response_intent_action"

    invoke-direct {v0, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 209
    iget-object v3, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/android/billingclient/api/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Lcom/android/billingclient/api/LocalBroadcastManager;

    move-result-object v3

    iget-object v6, p0, Lcom/android/billingclient/api/BillingClientImpl;->onPurchaseFinishedReceiver:Landroid/content/BroadcastReceiver;

    .line 210
    invoke-virtual {v3, v6, v0}, Lcom/android/billingclient/api/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    const-string v0, "Starting in-app billing setup."

    .line 213
    invoke-static {v2, v0}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    new-instance v0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;-><init>(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/billingclient/api/BillingClientStateListener;Lcom/android/billingclient/api/BillingClientImpl$1;)V

    iput-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mServiceConnection:Landroid/content/ServiceConnection;

    .line 216
    new-instance v0, Landroid/content/Intent;

    const-string v3, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.android.vending"

    .line 217
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 218
    iget-object v6, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    .line 219
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v6, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 221
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_5

    .line 223
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/pm/ResolveInfo;

    .line 224
    iget-object v7, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v7, :cond_5

    .line 225
    iget-object v7, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v7, v7, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 226
    iget-object v6, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v6, v6, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 227
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v6, :cond_4

    .line 228
    new-instance v3, Landroid/content/ComponentName;

    invoke-direct {v3, v7, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 234
    invoke-virtual {v6, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v0, "libraryVersion"

    const-string v3, "1.1"

    .line 235
    invoke-virtual {v6, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl;->mApplicationContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/android/billingclient/api/BillingClientImpl;->mServiceConnection:Landroid/content/ServiceConnection;

    .line 237
    invoke-virtual {v0, v6, v3, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "Service was bonded successfully."

    .line 241
    invoke-static {v2, p1}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "Connection to Billing service is blocked."

    .line 246
    invoke-static {v2, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string v0, "The device doesn\'t have valid Play Store."

    .line 250
    invoke-static {v2, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    :cond_5
    :goto_0
    iput v1, p0, Lcom/android/billingclient/api/BillingClientImpl;->mClientState:I

    const-string v0, "Billing service unavailable on device."

    .line 256
    invoke-static {v2, v0}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    invoke-interface {p1, v5}, Lcom/android/billingclient/api/BillingClientStateListener;->onBillingSetupFinished(I)V

    return-void
.end method
