.class Lcom/android/billingclient/api/BillingBroadcastManager;
.super Ljava/lang/Object;
.source "BillingBroadcastManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;
    }
.end annotation


# static fields
.field private static final ACTION:Ljava/lang/String; = "com.android.vending.billing.PURCHASES_UPDATED"

.field private static final TAG:Ljava/lang/String; = "BillingBroadcastManager"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mReceiver:Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/android/billingclient/api/PurchasesUpdatedListener;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/android/billingclient/api/BillingBroadcastManager;->mContext:Landroid/content/Context;

    .line 43
    new-instance p1, Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;-><init>(Lcom/android/billingclient/api/BillingBroadcastManager;Lcom/android/billingclient/api/PurchasesUpdatedListener;Lcom/android/billingclient/api/BillingBroadcastManager$1;)V

    iput-object p1, p0, Lcom/android/billingclient/api/BillingBroadcastManager;->mReceiver:Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;

    return-void
.end method

.method static synthetic access$200(Lcom/android/billingclient/api/BillingBroadcastManager;)Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/android/billingclient/api/BillingBroadcastManager;->mReceiver:Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;

    return-object p0
.end method


# virtual methods
.method destroy()V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/android/billingclient/api/BillingBroadcastManager;->mReceiver:Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;

    iget-object v1, p0, Lcom/android/billingclient/api/BillingBroadcastManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;->unRegister(Landroid/content/Context;)V

    return-void
.end method

.method getListener()Lcom/android/billingclient/api/PurchasesUpdatedListener;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/android/billingclient/api/BillingBroadcastManager;->mReceiver:Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;

    invoke-static {v0}, Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;->access$100(Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;)Lcom/android/billingclient/api/PurchasesUpdatedListener;

    move-result-object v0

    return-object v0
.end method

.method registerReceiver()V
    .locals 4

    .line 47
    iget-object v0, p0, Lcom/android/billingclient/api/BillingBroadcastManager;->mReceiver:Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;

    iget-object v1, p0, Lcom/android/billingclient/api/BillingBroadcastManager;->mContext:Landroid/content/Context;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/BillingBroadcastManager$BillingBroadcastReceiver;->register(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method
