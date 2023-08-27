.class public Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;
.super Ljava/lang/Object;
.source "IabHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;,
        Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;,
        Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;,
        Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;,
        Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabSetupFinishedListener;
    }
.end annotation


# static fields
.field public static final BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE:I = 0x3

.field public static final BILLING_RESPONSE_RESULT_DEVELOPER_ERROR:I = 0x5

.field public static final BILLING_RESPONSE_RESULT_ERROR:I = 0x6

.field public static final BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED:I = 0x7

.field public static final BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED:I = 0x8

.field public static final BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE:I = 0x4

.field public static final BILLING_RESPONSE_RESULT_OK:I = 0x0

.field public static final BILLING_RESPONSE_RESULT_USER_CANCELED:I = 0x1

.field public static final GET_SKU_DETAILS_ITEM_LIST:Ljava/lang/String; = "ITEM_ID_LIST"

.field public static final GET_SKU_DETAILS_ITEM_TYPE_LIST:Ljava/lang/String; = "ITEM_TYPE_LIST"

.field public static final IABHELPER_BAD_RESPONSE:I = -0x3ea

.field public static final IABHELPER_ERROR_BASE:I = -0x3e8

.field public static final IABHELPER_INVALID_CONSUMPTION:I = -0x3f2

.field public static final IABHELPER_MISSING_TOKEN:I = -0x3ef

.field public static final IABHELPER_REMOTE_EXCEPTION:I = -0x3e9

.field public static final IABHELPER_SEND_INTENT_FAILED:I = -0x3ec

.field public static final IABHELPER_SUBSCRIPTIONS_NOT_AVAILABLE:I = -0x3f1

.field public static final IABHELPER_UNKNOWN_ERROR:I = -0x3f0

.field public static final IABHELPER_UNKNOWN_PURCHASE_RESPONSE:I = -0x3ee

.field public static final IABHELPER_USER_CANCELLED:I = -0x3ed

.field public static final IABHELPER_VERIFICATION_FAILED:I = -0x3eb

.field public static final INAPP_CONTINUATION_TOKEN:Ljava/lang/String; = "INAPP_CONTINUATION_TOKEN"

.field public static final ITEM_TYPE_INAPP:Ljava/lang/String; = "inapp"

.field public static final ITEM_TYPE_SUBS:Ljava/lang/String; = "subs"

.field public static final RESPONSE_BUY_INTENT:Ljava/lang/String; = "BUY_INTENT"

.field public static final RESPONSE_CODE:Ljava/lang/String; = "RESPONSE_CODE"

.field public static final RESPONSE_GET_SKU_DETAILS_LIST:Ljava/lang/String; = "DETAILS_LIST"

.field public static final RESPONSE_INAPP_ITEM_LIST:Ljava/lang/String; = "INAPP_PURCHASE_ITEM_LIST"

.field public static final RESPONSE_INAPP_PURCHASE_DATA:Ljava/lang/String; = "INAPP_PURCHASE_DATA"

.field public static final RESPONSE_INAPP_PURCHASE_DATA_LIST:Ljava/lang/String; = "INAPP_PURCHASE_DATA_LIST"

.field public static final RESPONSE_INAPP_SIGNATURE:Ljava/lang/String; = "INAPP_DATA_SIGNATURE"

.field public static final RESPONSE_INAPP_SIGNATURE_LIST:Ljava/lang/String; = "INAPP_DATA_SIGNATURE_LIST"

.field public static requestSignatureBase64:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field mAsyncInProgress:Z

.field mAsyncOperation:Ljava/lang/String;

.field mContext:Landroid/content/Context;

.field mDebugLog:Z

.field mDisposed:Z

.field mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

.field mPurchasingItemType:Ljava/lang/String;

.field mRequestCode:I

.field mService:Lcom/android/vending/billing/IInAppBillingService;

.field mServiceConn:Landroid/content/ServiceConnection;

.field mSetupDone:Z

.field mSignatureBase64:Ljava/lang/String;

.field mSubscriptionsSupported:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 77
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->requestSignatureBase64:Lcom/daaw/avee/Common/Events/WeakEventR1;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 80
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDebugLog:Z

    .line 84
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSetupDone:Z

    .line 87
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDisposed:Z

    .line 90
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSubscriptionsSupported:Z

    .line 94
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncInProgress:Z

    const-string v0, ""

    .line 98
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncOperation:Ljava/lang/String;

    const/4 v0, 0x0

    .line 114
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSignatureBase64:Ljava/lang/String;

    .line 170
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    .line 171
    iput-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSignatureBase64:Ljava/lang/String;

    const-string p1, "IAB helper created."

    .line 172
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    return-void
.end method

.method private checkNotDisposed()V
    .locals 2

    .line 310
    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDisposed:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "IabHelper was disposed of, so it cannot be used."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getResponseDesc(I)Ljava/lang/String;
    .locals 14

    const/16 v0, 0x9

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "OK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v4, "User Canceled"

    const/4 v5, 0x1

    aput-object v4, v1, v5

    const-string v4, "Unknown"

    const/4 v6, 0x2

    aput-object v4, v1, v6

    const-string v4, "Billing Unavailable"

    const/4 v7, 0x3

    aput-object v4, v1, v7

    const-string v4, "Item unavailable"

    const/4 v8, 0x4

    aput-object v4, v1, v8

    const-string v4, "Developer Error"

    const/4 v9, 0x5

    aput-object v4, v1, v9

    const-string v4, "Error"

    const/4 v10, 0x6

    aput-object v4, v1, v10

    const-string v4, "Item Already Owned"

    const/4 v11, 0x7

    aput-object v4, v1, v11

    const-string v4, "Item not owned"

    const/16 v12, 0x8

    aput-object v4, v1, v12

    const/16 v4, 0xb

    new-array v13, v4, [Ljava/lang/String;

    aput-object v2, v13, v3

    const-string v2, "Remote exception during initialization"

    aput-object v2, v13, v5

    const-string v2, "Bad response received"

    aput-object v2, v13, v6

    const-string v2, "Purchase signature verification failed"

    aput-object v2, v13, v7

    const-string v2, "Send intent failed"

    aput-object v2, v13, v8

    const-string v2, "User cancelled"

    aput-object v2, v13, v9

    const-string v2, "Unknown purchase response"

    aput-object v2, v13, v10

    const-string v2, "Missing token"

    aput-object v2, v13, v11

    const-string v2, "Unknown error"

    aput-object v2, v13, v12

    const-string v2, "Subscriptions not available"

    aput-object v2, v13, v0

    const/16 v2, 0xa

    const-string v3, "Invalid consumption attempt"

    aput-object v3, v13, v2

    const/16 v2, -0x3e8

    if-gt p0, v2, :cond_1

    sub-int/2addr v2, p0

    if-ltz v2, :cond_0

    if-ge v2, v4, :cond_0

    .line 804
    aget-object p0, v13, v2

    return-object p0

    .line 805
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":Unknown IAB Helper Error"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    if-ltz p0, :cond_3

    if-lt p0, v0, :cond_2

    goto :goto_0

    .line 810
    :cond_2
    aget-object p0, v1, p0

    return-object p0

    .line 808
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":Unknown"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method checkSetupDone(Ljava/lang/String;)V
    .locals 3

    .line 816
    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSetupDone:Z

    if-eqz v0, :cond_0

    return-void

    .line 817
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Illegal state for operation ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "): IAB helper is not set up."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 818
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IAB helper is not set up. Can\'t perform operation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method consume(Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/daaw/avee/comp/InAppBilling/util/IabException;
        }
    .end annotation

    .line 669
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    const-string v0, "consume"

    .line 670
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 672
    iget-object v0, p1, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;->mItemType:Ljava/lang/String;

    const-string v1, "inapp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 678
    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;->getToken()Ljava/lang/String;

    move-result-object v0

    .line 679
    invoke-virtual {p1}, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;->getSku()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1

    const-string v2, ""

    .line 680
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 686
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Consuming sku: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 687
    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, v0}, Lcom/android/vending/billing/IInAppBillingService;->consumePurchase(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 689
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Successfully consumed sku: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    return-void

    .line 692
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error consuming consuming sku "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 693
    new-instance v2, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error consuming sku "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;)V

    throw v2

    .line 681
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t consume "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". No token."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 682
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const/16 v2, -0x3ef

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PurchaseInfo is missing token for sku: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 697
    new-instance v1, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const/16 v2, -0x3e9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Remote exception while consuming. PurchaseInfo: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 673
    :cond_2
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const/16 v1, -0x3f2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Items of type \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;->mItemType:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' can\'t be consumed."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method public consumeAsync(Lcom/daaw/avee/comp/InAppBilling/util/Purchase;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;)V
    .locals 1

    .line 737
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    const-string v0, "consume"

    .line 738
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 739
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 740
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 741
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->consumeAsyncInternal(Ljava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;)V

    return-void
.end method

.method public consumeAsync(Ljava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/InAppBilling/util/Purchase;",
            ">;",
            "Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;",
            ")V"
        }
    .end annotation

    .line 750
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    const-string v0, "consume"

    .line 751
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 752
    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->consumeAsyncInternal(Ljava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;)V

    return-void
.end method

.method consumeAsyncInternal(Ljava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/InAppBilling/util/Purchase;",
            ">;",
            "Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;",
            "Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;",
            ")V"
        }
    .end annotation

    .line 982
    new-instance v4, Landroid/os/Handler;

    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    const-string v0, "consume"

    .line 983
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagStartAsync(Ljava/lang/String;)V

    .line 984
    new-instance v6, Ljava/lang/Thread;

    new-instance v7, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;-><init>(Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;Ljava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;Landroid/os/Handler;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;)V

    invoke-direct {v6, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1013
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public dispose()V
    .locals 2

    const-string v0, "Disposing."

    .line 296
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 297
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSetupDone:Z

    .line 298
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_0

    const-string v0, "Unbinding from service."

    .line 299
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 300
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_0
    const/4 v0, 0x1

    .line 302
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDisposed:Z

    const/4 v0, 0x0

    .line 303
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    .line 304
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    .line 305
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 306
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    return-void
.end method

.method public enableDebugLogging(Z)V
    .locals 0

    .line 185
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    .line 186
    iput-boolean p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDebugLog:Z

    return-void
.end method

.method public enableDebugLogging(ZLjava/lang/String;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    .line 180
    iput-boolean p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDebugLog:Z

    return-void
.end method

.method flagEndAsync()V
    .locals 2

    .line 863
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ending async operation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncOperation:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    const-string v0, ""

    .line 864
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncOperation:Ljava/lang/String;

    const/4 v0, 0x0

    .line 865
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncInProgress:Z

    return-void
.end method

.method flagStartAsync(Ljava/lang/String;)V
    .locals 3

    .line 855
    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncInProgress:Z

    if-nez v0, :cond_0

    .line 857
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncOperation:Ljava/lang/String;

    const/4 v0, 0x1

    .line 858
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncInProgress:Z

    .line 859
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Starting async operation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    return-void

    .line 855
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t start async operation ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") because another async operation("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mAsyncOperation:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") is in progress."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method getResponseCodeFromBundle(Landroid/os/Bundle;)I
    .locals 3

    const-string v0, "RESPONSE_CODE"

    .line 824
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Bundle with null response code, assuming OK (known issue)"

    .line 826
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    .line 829
    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 830
    :cond_1
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int p1, v0

    return p1

    :cond_2
    const-string v0, "Unexpected type for bundle response code."

    .line 832
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 833
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 834
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type for bundle response code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method getResponseCodeFromIntent(Landroid/content/Intent;)I
    .locals 3

    .line 840
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "RESPONSE_CODE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Intent with no response code, assuming OK (known issue)"

    .line 842
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    .line 845
    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 846
    :cond_1
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int p1, v0

    return p1

    :cond_2
    const-string v0, "Unexpected type for intent response code."

    .line 848
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 849
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 850
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type for intent response code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public handleActivityResult(IILandroid/content/Intent;)Z
    .locals 8

    .line 447
    iget v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mRequestCode:I

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    return v1

    .line 449
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    const-string p1, "handleActivityResult"

    .line 450
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 453
    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagEndAsync()V

    const/16 p1, -0x3ea

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-nez p3, :cond_2

    const-string p2, "Null data in IAB activity result."

    .line 456
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 457
    new-instance p2, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const-string p3, "Null data in IAB result"

    invoke-direct {p2, p1, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 458
    iget-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz p1, :cond_1

    invoke-interface {p1, p2, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    :cond_1
    return v2

    .line 462
    :cond_2
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseCodeFromIntent(Landroid/content/Intent;)I

    move-result v3

    const-string v4, "INAPP_PURCHASE_DATA"

    .line 463
    invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "INAPP_DATA_SIGNATURE"

    .line 464
    invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, -0x1

    if-ne p2, v6, :cond_9

    if-nez v3, :cond_9

    const-string p2, "Successful resultcode from purchase activity."

    .line 467
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 468
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Purchase data: "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 469
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Data signature: "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 470
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Extras: "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 471
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Expected item type: "

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchasingItemType:Ljava/lang/String;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    if-eqz v4, :cond_7

    if-nez v5, :cond_3

    goto/16 :goto_0

    .line 483
    :cond_3
    :try_start_0
    new-instance p2, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;

    iget-object p3, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchasingItemType:Ljava/lang/String;

    invoke-direct {p2, p3, v4, v5}, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    invoke-virtual {p2}, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;->getSku()Ljava/lang/String;

    move-result-object p3

    .line 487
    sget-object v3, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->requestSignatureBase64:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-array v6, v2, [Ljava/lang/String;

    iget-object v7, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSignatureBase64:Ljava/lang/String;

    aput-object v7, v6, v1

    iget-object v7, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSignatureBase64:Ljava/lang/String;

    invoke-virtual {v3, v6, v7}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/daaw/avee/comp/InAppBilling/util/Security;->verifyPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 488
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Purchase signature verification FAILED for sku "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 489
    new-instance v1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/16 v3, -0x3eb

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Signature verification failed for sku "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v1, v3, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 490
    iget-object p3, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    invoke-interface {p3, v1, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    :cond_4
    return v2

    :cond_5
    const-string p3, "Purchase signature successfully verified."

    .line 493
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 503
    iget-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz p1, :cond_c

    .line 504
    new-instance p3, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const-string v0, "Success"

    invoke-direct {p3, v1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, p3, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    goto/16 :goto_1

    :catch_0
    nop

    const-string p2, "Failed to parse purchase data."

    .line 496
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 498
    new-instance p3, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    invoke-direct {p3, p1, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 499
    iget-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz p1, :cond_6

    invoke-interface {p1, p3, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    :cond_6
    return v2

    :cond_7
    :goto_0
    const-string p1, "BUG: either purchaseData or dataSignature is null."

    .line 474
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 475
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 476
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/16 p2, -0x3f0

    const-string p3, "IAB returned null purchaseData or dataSignature"

    invoke-direct {p1, p2, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 477
    iget-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz p2, :cond_8

    invoke-interface {p2, p1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    :cond_8
    return v2

    :cond_9
    if-ne p2, v6, :cond_a

    .line 509
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Result code was OK but in-app billing response was not OK: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 510
    iget-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz p1, :cond_c

    .line 511
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const-string p2, "Problem purchashing item."

    invoke-direct {p1, v3, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 512
    iget-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    invoke-interface {p2, p1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    goto :goto_1

    :cond_a
    if-nez p2, :cond_b

    .line 516
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Purchase canceled - Response: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 517
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/16 p2, -0x3ed

    const-string p3, "User canceled."

    invoke-direct {p1, p2, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 518
    iget-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz p2, :cond_c

    invoke-interface {p2, p1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    goto :goto_1

    .line 521
    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Purchase failed. Result code: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ". Response: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    invoke-static {v3}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 521
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 523
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/16 p2, -0x3ee

    const-string p3, "Unknown purchase response."

    invoke-direct {p1, p2, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 524
    iget-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz p2, :cond_c

    invoke-interface {p2, p1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    :cond_c
    :goto_1
    return v2
.end method

.method public launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;)V
    .locals 6

    const-string v5, ""

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    .line 341
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V

    return-void
.end method

.method public launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V
    .locals 7

    const-string v3, "inapp"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 346
    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V

    return-void
.end method

.method public launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V
    .locals 9

    .line 379
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    const-string v0, "launchPurchaseFlow"

    .line 380
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 381
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagStartAsync(Ljava/lang/String;)V

    const-string v0, "subs"

    .line 384
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSubscriptionsSupported:Z

    if-nez v0, :cond_1

    .line 385
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/16 p2, -0x3f1

    const-string p3, "Subscriptions are not available."

    invoke-direct {p1, p2, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 387
    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagEndAsync()V

    if-eqz p5, :cond_0

    .line 388
    invoke-interface {p5, p1, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    :cond_0
    return-void

    .line 393
    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Constructing buy intent for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", item type: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 394
    iget-object v2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v3, 0x3

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    move-object v5, p2

    move-object v6, p3

    move-object v7, p6

    invoke-interface/range {v2 .. v7}, Lcom/android/vending/billing/IInAppBillingService;->getBuyIntent(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p6

    .line 395
    invoke-virtual {p0, p6}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;)I

    move-result v0

    if-eqz v0, :cond_3

    .line 397
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unable to buy item, Error response: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 398
    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagEndAsync()V

    .line 399
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const-string p3, "Unable to buy item"

    invoke-direct {p1, v0, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    if-eqz p5, :cond_2

    .line 400
    invoke-interface {p5, p1, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    :cond_2
    return-void

    :cond_3
    const-string v0, "BUY_INTENT"

    .line 404
    invoke-virtual {p6, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p6

    check-cast p6, Landroid/app/PendingIntent;

    .line 405
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Launching buy intent for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Request code: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 406
    iput p4, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mRequestCode:I

    .line 407
    iput-object p5, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchaseListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    .line 408
    iput-object p3, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mPurchasingItemType:Ljava/lang/String;

    .line 409
    invoke-virtual {p6}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v3

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    const/4 p3, 0x0

    .line 411
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 412
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object v2, p1

    move v4, p4

    .line 409
    invoke-virtual/range {v2 .. v8}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 423
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RemoteException while launching purchase flow for sku "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 425
    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagEndAsync()V

    .line 427
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/16 p2, -0x3e9

    const-string p3, "Remote exception while starting purchase flow"

    invoke-direct {p1, p2, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    if-eqz p5, :cond_4

    .line 428
    invoke-interface {p5, p1, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    goto :goto_0

    :catch_1
    nop

    .line 415
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "SendIntentException while launching purchase flow for sku "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    .line 417
    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagEndAsync()V

    .line 419
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/16 p2, -0x3ec

    const-string p3, "Failed to send intent."

    invoke-direct {p1, p2, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    if-eqz p5, :cond_4

    .line 420
    invoke-interface {p5, p1, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public launchSubscriptionPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;)V
    .locals 6

    const-string v5, ""

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    .line 351
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->launchSubscriptionPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V

    return-void
.end method

.method public launchSubscriptionPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V
    .locals 7

    const-string v3, "subs"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 356
    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V

    return-void
.end method

.method logDebug(Ljava/lang/String;)V
    .locals 1

    .line 1017
    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mDebugLog:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method logError(Ljava/lang/String;)V
    .locals 2

    .line 1021
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In-app billing error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lcom/daaw/avee/Common/tlog;->e(Ljava/lang/Exception;Ljava/lang/String;)V

    return-void
.end method

.method logWarn(Ljava/lang/String;)V
    .locals 2

    .line 1025
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In-app billing warning: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void
.end method

.method public queryInventory(ZLjava/util/List;)Lcom/daaw/avee/comp/InAppBilling/util/Inventory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/daaw/avee/comp/InAppBilling/util/Inventory;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/daaw/avee/comp/InAppBilling/util/IabException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 530
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->queryInventory(ZLjava/util/List;Ljava/util/List;)Lcom/daaw/avee/comp/InAppBilling/util/Inventory;

    move-result-object p1

    return-object p1
.end method

.method public queryInventory(ZLjava/util/List;Ljava/util/List;)Lcom/daaw/avee/comp/InAppBilling/util/Inventory;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/daaw/avee/comp/InAppBilling/util/Inventory;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/daaw/avee/comp/InAppBilling/util/IabException;
        }
    .end annotation

    const-string p3, "subs"

    const-string v0, "inapp"

    .line 548
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    const-string v1, "queryInventory"

    .line 549
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 551
    :try_start_0
    new-instance v1, Lcom/daaw/avee/comp/InAppBilling/util/Inventory;

    invoke-direct {v1}, Lcom/daaw/avee/comp/InAppBilling/util/Inventory;-><init>()V

    .line 552
    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->queryPurchases(Lcom/daaw/avee/comp/InAppBilling/util/Inventory;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_5

    if-eqz p1, :cond_1

    .line 558
    invoke-virtual {p0, v0, v1, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->querySkuDetails(Ljava/lang/String;Lcom/daaw/avee/comp/InAppBilling/util/Inventory;Ljava/util/List;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 560
    :cond_0
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const-string p2, "Error refreshing inventory (querying prices of items)."

    invoke-direct {p1, v0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;)V

    throw p1

    .line 565
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSubscriptionsSupported:Z

    if-eqz v0, :cond_4

    .line 566
    invoke-virtual {p0, v1, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->queryPurchases(Lcom/daaw/avee/comp/InAppBilling/util/Inventory;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    if-eqz p1, :cond_4

    .line 572
    invoke-virtual {p0, p3, v1, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->querySkuDetails(Ljava/lang/String;Lcom/daaw/avee/comp/InAppBilling/util/Inventory;Ljava/util/List;)I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    .line 574
    :cond_2
    new-instance p2, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const-string p3, "Error refreshing inventory (querying prices of subscriptions)."

    invoke-direct {p2, p1, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;)V

    throw p2

    .line 568
    :cond_3
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const-string p2, "Error refreshing inventory (querying owned subscriptions)."

    invoke-direct {p1, v0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-object v1

    .line 554
    :cond_5
    new-instance p1, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const-string p2, "Error refreshing inventory (querying owned items)."

    invoke-direct {p1, v2, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 585
    new-instance p2, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const/16 p3, -0x3ea

    const-string v0, "Error parsing JSON response while refreshing inventory."

    invoke-direct {p2, p3, v0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    move-exception p1

    .line 582
    new-instance p2, Lcom/daaw/avee/comp/InAppBilling/util/IabException;

    const/16 p3, -0x3e9

    const-string v0, "Remote exception while refreshing inventory."

    invoke-direct {p2, p3, v0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public queryInventoryAsync(Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 651
    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;)V

    return-void
.end method

.method public queryInventoryAsync(ZLcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 655
    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;)V

    return-void
.end method

.method public queryInventoryAsync(ZLjava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;",
            ")V"
        }
    .end annotation

    .line 616
    new-instance v5, Landroid/os/Handler;

    invoke-direct {v5}, Landroid/os/Handler;-><init>()V

    .line 617
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    const-string v0, "queryInventory"

    .line 618
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    const-string v0, "refresh inventory"

    .line 619
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->flagStartAsync(Ljava/lang/String;)V

    .line 620
    new-instance v6, Ljava/lang/Thread;

    new-instance v7, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$2;-><init>(Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;ZLjava/util/List;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$QueryInventoryFinishedListener;Landroid/os/Handler;)V

    invoke-direct {v6, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 647
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method queryPurchases(Lcom/daaw/avee/comp/InAppBilling/util/Inventory;Ljava/lang/String;)I
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 871
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Querying owned items, item type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 872
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Package name: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 877
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Calling getPurchases with continuation token: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 878
    iget-object v5, v0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v6, 0x3

    iget-object v7, v0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7, v1, v3}, Lcom/android/vending/billing/IInAppBillingService;->getPurchases(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    .line 881
    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;)I

    move-result v5

    .line 882
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Owned items response: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    if-eqz v5, :cond_1

    .line 884
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPurchases() failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    return v5

    :cond_1
    const-string v5, "INAPP_PURCHASE_ITEM_LIST"

    .line 887
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    const-string v6, "INAPP_PURCHASE_DATA_LIST"

    .line 888
    invoke-virtual {v3, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    const-string v7, "INAPP_DATA_SIGNATURE_LIST"

    .line 889
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_2

    .line 894
    :cond_2
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 896
    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    .line 898
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    const/4 v8, 0x0

    .line 901
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_5

    .line 902
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 903
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 904
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 905
    sget-object v12, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->requestSignatureBase64:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const/4 v13, 0x1

    new-array v14, v13, [Ljava/lang/String;

    iget-object v15, v0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSignatureBase64:Ljava/lang/String;

    aput-object v15, v14, v2

    invoke-virtual {v12, v14, v15}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12, v9, v10}, Lcom/daaw/avee/comp/InAppBilling/util/Security;->verifyPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    .line 906
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Sku is owned: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 907
    new-instance v11, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;

    invoke-direct {v11, v1, v9, v10}, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 909
    invoke-virtual {v11}, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;->getToken()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_3

    const-string v10, "BUG: empty/null token!"

    .line 910
    invoke-virtual {v0, v10}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logWarn(Ljava/lang/String;)V

    .line 911
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Purchase data: "

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    :cond_3
    move-object/from16 v12, p1

    .line 915
    invoke-virtual {v12, v11}, Lcom/daaw/avee/comp/InAppBilling/util/Inventory;->addPurchase(Lcom/daaw/avee/comp/InAppBilling/util/Purchase;)V

    goto :goto_1

    :cond_4
    move-object/from16 v12, p1

    const-string v4, "Purchase signature verification **FAILED**. Not adding item."

    .line 918
    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logWarn(Ljava/lang/String;)V

    .line 919
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "   Purchase data: "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 920
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "   Signature: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    :cond_5
    move-object/from16 v12, p1

    const-string v5, "INAPP_CONTINUATION_TOKEN"

    .line 925
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 926
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Continuation token: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 927
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    if-eqz v4, :cond_6

    const/16 v2, -0x3eb

    :cond_6
    return v2

    :cond_7
    :goto_2
    const-string v1, "Bundle returned from getPurchases() doesn\'t contain required fields."

    .line 890
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    const/16 v1, -0x3ea

    return v1
.end method

.method querySkuDetails(Ljava/lang/String;Lcom/daaw/avee/comp/InAppBilling/util/Inventory;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/InAppBilling/util/Inventory;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "Querying SKU details."

    .line 934
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 935
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 936
    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/InAppBilling/util/Inventory;->getAllOwnedSkus(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz p3, :cond_1

    .line 938
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 939
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 940
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 945
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/4 v1, 0x0

    if-nez p3, :cond_2

    const-string p1, "queryPrices: nothing to do because there are no SKUs."

    .line 946
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    return v1

    .line 950
    :cond_2
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    const-string v2, "ITEM_ID_LIST"

    .line 951
    invoke-virtual {p3, v2, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 952
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3, p1, p3}, Lcom/android/vending/billing/IInAppBillingService;->getSkuDetails(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p3

    const-string v0, "DETAILS_LIST"

    .line 955
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 956
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;)I

    move-result p1

    if-eqz p1, :cond_3

    .line 958
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "getSkuDetails() failed: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    return p1

    :cond_3
    const-string p1, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    .line 962
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logError(Ljava/lang/String;)V

    const/16 p1, -0x3ea

    return p1

    .line 967
    :cond_4
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p3

    .line 970
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 971
    new-instance v2, Lcom/daaw/avee/comp/InAppBilling/util/SkuDetails;

    invoke-direct {v2, p1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/SkuDetails;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 972
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got sku details: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 973
    invoke-virtual {p2, v2}, Lcom/daaw/avee/comp/InAppBilling/util/Inventory;->addSkuDetails(Lcom/daaw/avee/comp/InAppBilling/util/SkuDetails;)V

    goto :goto_1

    :cond_5
    return v1
.end method

.method public startSetup(Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabSetupFinishedListener;)V
    .locals 3

    .line 211
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    .line 212
    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSetupDone:Z

    if-nez v0, :cond_2

    const-string v0, "Starting in-app billing setup."

    .line 215
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 216
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$1;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$1;-><init>(Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabSetupFinishedListener;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    .line 271
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    .line 272
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 273
    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 274
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 276
    iget-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 279
    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    if-eqz p1, :cond_1

    .line 282
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    const/4 v1, 0x3

    const-string v2, "Billing service unavailable on device."

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnIabSetupFinishedListener;->onIabSetupFinished(Lcom/daaw/avee/comp/InAppBilling/util/IabResult;)V

    :cond_1
    :goto_0
    return-void

    .line 212
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "IAB helper is already set up."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public subscriptionsSupported()Z
    .locals 1

    .line 315
    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->checkNotDisposed()V

    .line 316
    iget-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->mSubscriptionsSupported:Z

    return v0
.end method
