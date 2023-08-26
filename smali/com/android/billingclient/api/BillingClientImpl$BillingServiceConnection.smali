.class final Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;
.super Ljava/lang/Object;
.source "BillingClientImpl.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/BillingClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "BillingServiceConnection"
.end annotation


# instance fields
.field private final mListener:Lcom/android/billingclient/api/BillingClientStateListener;

.field final synthetic this$0:Lcom/android/billingclient/api/BillingClientImpl;


# direct methods
.method private constructor <init>(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/billingclient/api/BillingClientStateListener;)V
    .locals 0

    .line 803
    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 807
    iput-object p2, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->mListener:Lcom/android/billingclient/api/BillingClientStateListener;

    return-void

    .line 805
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Please specify a listener to know when init is done."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/billingclient/api/BillingClientStateListener;Lcom/android/billingclient/api/BillingClientImpl$1;)V
    .locals 0

    .line 800
    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;-><init>(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/billingclient/api/BillingClientStateListener;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 7

    const-string p1, "inapp"

    const-string v0, "subs"

    const-string v1, "BillingClient"

    const-string v2, "Billing service connected."

    .line 820
    invoke-static {v1, v2}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 822
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p2}, Lcom/android/vending/billing/IInAppBillingService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object p2

    invoke-static {v2, p2}, Lcom/android/billingclient/api/BillingClientImpl;->access$502(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/vending/billing/IInAppBillingService;)Lcom/android/vending/billing/IInAppBillingService;

    .line 823
    iget-object p2, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p2}, Lcom/android/billingclient/api/BillingClientImpl;->access$700(Lcom/android/billingclient/api/BillingClientImpl;)Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    .line 824
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/android/billingclient/api/BillingClientImpl;->access$802(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    .line 825
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {v2, v3}, Lcom/android/billingclient/api/BillingClientImpl;->access$902(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    .line 826
    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {v2, v3}, Lcom/android/billingclient/api/BillingClientImpl;->access$1002(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    const/4 v2, 0x0

    .line 839
    :try_start_0
    iget-object v4, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {v4}, Lcom/android/billingclient/api/BillingClientImpl;->access$500(Lcom/android/billingclient/api/BillingClientImpl;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object v4

    const/4 v5, 0x6

    invoke-interface {v4, v5, p2, v0}, Lcom/android/vending/billing/IInAppBillingService;->isBillingSupported(ILjava/lang/String;Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x1

    if-nez v4, :cond_0

    const-string p1, "In-app billing API version 6 with subs is supported."

    .line 842
    invoke-static {v1, p1}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 843
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v6}, Lcom/android/billingclient/api/BillingClientImpl;->access$1002(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    .line 844
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v6}, Lcom/android/billingclient/api/BillingClientImpl;->access$802(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    .line 845
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v6}, Lcom/android/billingclient/api/BillingClientImpl;->access$902(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    goto :goto_0

    .line 850
    :cond_0
    iget-object v4, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {v4}, Lcom/android/billingclient/api/BillingClientImpl;->access$500(Lcom/android/billingclient/api/BillingClientImpl;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object v4

    invoke-interface {v4, v5, p2, p1}, Lcom/android/vending/billing/IInAppBillingService;->isBillingSupported(ILjava/lang/String;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "In-app billing API without subs version 6 supported."

    .line 853
    invoke-static {v1, v4}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 854
    iget-object v4, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {v4, v6}, Lcom/android/billingclient/api/BillingClientImpl;->access$1002(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    .line 860
    :cond_1
    iget-object v4, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {v4}, Lcom/android/billingclient/api/BillingClientImpl;->access$500(Lcom/android/billingclient/api/BillingClientImpl;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object v4

    const/4 v5, 0x5

    invoke-interface {v4, v5, p2, v0}, Lcom/android/vending/billing/IInAppBillingService;->isBillingSupported(ILjava/lang/String;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_2

    const-string p1, "In-app billing API version 5 supported."

    .line 863
    invoke-static {v1, p1}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 864
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v6}, Lcom/android/billingclient/api/BillingClientImpl;->access$902(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    .line 865
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v6}, Lcom/android/billingclient/api/BillingClientImpl;->access$802(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    goto :goto_0

    .line 869
    :cond_2
    iget-object v4, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {v4}, Lcom/android/billingclient/api/BillingClientImpl;->access$500(Lcom/android/billingclient/api/BillingClientImpl;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object v4

    const/4 v5, 0x3

    invoke-interface {v4, v5, p2, v0}, Lcom/android/vending/billing/IInAppBillingService;->isBillingSupported(ILjava/lang/String;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_3

    const-string p1, "In-app billing API version 3 with subscriptions is supported."

    .line 872
    invoke-static {v1, p1}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 874
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v6}, Lcom/android/billingclient/api/BillingClientImpl;->access$802(Lcom/android/billingclient/api/BillingClientImpl;Z)Z

    goto :goto_0

    .line 875
    :cond_3
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {v0}, Lcom/android/billingclient/api/BillingClientImpl;->access$1000(Lcom/android/billingclient/api/BillingClientImpl;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v4, 0x0

    goto :goto_0

    .line 883
    :cond_4
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    .line 884
    invoke-static {v0}, Lcom/android/billingclient/api/BillingClientImpl;->access$500(Lcom/android/billingclient/api/BillingClientImpl;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object v0

    invoke-interface {v0, v5, p2, p1}, Lcom/android/vending/billing/IInAppBillingService;->isBillingSupported(ILjava/lang/String;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_5

    const-string p1, "In-app billing API version 3 with in-app items is supported."

    .line 887
    invoke-static {v1, p1}, Lcom/android/billingclient/util/BillingHelper;->logVerbose(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    const-string p1, "Even billing API version 3 is not supported on this device."

    .line 890
    invoke-static {v1, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-nez v4, :cond_6

    .line 898
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    const/4 p2, 0x2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/BillingClientImpl;->access$602(Lcom/android/billingclient/api/BillingClientImpl;I)I

    goto :goto_1

    .line 900
    :cond_6
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v3}, Lcom/android/billingclient/api/BillingClientImpl;->access$602(Lcom/android/billingclient/api/BillingClientImpl;I)I

    .line 901
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v2}, Lcom/android/billingclient/api/BillingClientImpl;->access$502(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/vending/billing/IInAppBillingService;)Lcom/android/vending/billing/IInAppBillingService;

    .line 903
    :goto_1
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->mListener:Lcom/android/billingclient/api/BillingClientStateListener;

    invoke-interface {p1, v4}, Lcom/android/billingclient/api/BillingClientStateListener;->onBillingSetupFinished(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 905
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "RemoteException while setting up in-app billing"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 906
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v3}, Lcom/android/billingclient/api/BillingClientImpl;->access$602(Lcom/android/billingclient/api/BillingClientImpl;I)I

    .line 907
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    invoke-static {p1, v2}, Lcom/android/billingclient/api/BillingClientImpl;->access$502(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/vending/billing/IInAppBillingService;)Lcom/android/vending/billing/IInAppBillingService;

    .line 908
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->mListener:Lcom/android/billingclient/api/BillingClientStateListener;

    const/4 p2, -0x1

    invoke-interface {p1, p2}, Lcom/android/billingclient/api/BillingClientStateListener;->onBillingSetupFinished(I)V

    :goto_2
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "BillingClient"

    const-string v0, "Billing service disconnected."

    .line 812
    invoke-static {p1, v0}, Lcom/android/billingclient/util/BillingHelper;->logWarn(Ljava/lang/String;Ljava/lang/String;)V

    .line 813
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/BillingClientImpl;->access$502(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/vending/billing/IInAppBillingService;)Lcom/android/vending/billing/IInAppBillingService;

    .line 814
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/BillingClientImpl;->access$602(Lcom/android/billingclient/api/BillingClientImpl;I)I

    .line 815
    iget-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$BillingServiceConnection;->mListener:Lcom/android/billingclient/api/BillingClientStateListener;

    invoke-interface {p1}, Lcom/android/billingclient/api/BillingClientStateListener;->onBillingServiceDisconnected()V

    return-void
.end method
