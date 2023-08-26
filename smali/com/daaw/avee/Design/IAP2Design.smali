.class public Lcom/daaw/avee/Design/IAP2Design;
.super Ljava/lang/Object;
.source "IAP2Design.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Design/IAP2Design$UpdateListener;
    }
.end annotation


# static fields
.field static final SKU_ID_PREMIUM:Ljava/lang/String; = "premium"

.field private static final enableDebugging:Z = false

.field static onPremium:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Lcom/android/billingclient/api/Purchase;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field static onPurchasedSuccessfully:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static premium:Z

.field static verifyDeveloperPayload:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Lcom/android/billingclient/api/Purchase;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

.field private mUpdateListener:Lcom/daaw/avee/Design/IAP2Design$UpdateListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/IAP2Design;->verifyDeveloperPayload:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/IAP2Design;->onPremium:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 49
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/IAP2Design;->onPurchasedSuccessfully:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const/4 v0, 0x0

    .line 62
    sput-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    .line 104
    new-instance v0, Lcom/daaw/avee/Design/IAP2Design$UpdateListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/avee/Design/IAP2Design$UpdateListener;-><init>(Lcom/daaw/avee/Design/IAP2Design;Lcom/daaw/avee/Design/IAP2Design$1;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/IAP2Design;->mUpdateListener:Lcom/daaw/avee/Design/IAP2Design$UpdateListener;

    .line 107
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$1;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 114
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;->onTouch:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$2;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 124
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->onTouch:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$3;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 134
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrButton;->onTouch:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$4;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 144
    sget-object v0, Lcom/daaw/avee/MainActivity;->onResume:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$5;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 152
    sget-object v0, Lcom/daaw/avee/MainActivity;->onDestroy:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$6;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 159
    sget-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->onBuyAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$7;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 166
    sget-object v0, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$8;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 202
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$r3nlAJ7rGlF2pVYynPF_4JLPp2Q;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$r3nlAJ7rGlF2pVYynPF_4JLPp2Q;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 204
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$b0Czg3oJeIZvbZJFQDYvmheJheA;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$b0Czg3oJeIZvbZJFQDYvmheJheA;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 206
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->hasPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$uWkSafkDqmYdI-UEs3_NljTDsrY;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$uWkSafkDqmYdI-UEs3_NljTDsrY;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 208
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrButton;->hasPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$SvDTyshre8iDPzCr2mMj4qzb10g;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$SvDTyshre8iDPzCr2mMj4qzb10g;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 210
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrImageButton;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$V1sXN681JfC7bpnPWsNp09haZMk;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$V1sXN681JfC7bpnPWsNp09haZMk;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 212
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$H39sRMCmKgYOGqgghrP8ajYXrJg;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$H39sRMCmKgYOGqgghrP8ajYXrJg;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 214
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR1;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$I9yYUUozWyMWInNYIuAtPcc0nnE;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$I9yYUUozWyMWInNYIuAtPcc0nnE;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 216
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR1;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$cEFyNTpOeYSV8uS0Y1Bi6NcxBbo;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$cEFyNTpOeYSV8uS0Y1Bi6NcxBbo;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 218
    sget-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$xQrBhkLZY6c24qLusiJ-xMVA338;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$xQrBhkLZY6c24qLusiJ-xMVA338;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 220
    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestIsPremiumIsPremiumAvailable:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/IAP2Design$12;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/IAP2Design$12;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 227
    sget-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->onRequestIsPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$pqCsfkFhp2eJfmEuWmoIkeG3MAs;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$IAP2Design$pqCsfkFhp2eJfmEuWmoIkeG3MAs;

    iget-object v2, p0, Lcom/daaw/avee/Design/IAP2Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/IAP2Design;Landroid/app/Activity;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/IAP2Design;->createHelper(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/IAP2Design;Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/IAP2Design;->showStore(Lcom/daaw/avee/ContextData;)V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/IAP2Design;Landroid/app/Activity;Z)Z
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/IAP2Design;->startSetup(Landroid/app/Activity;Z)Z

    move-result p0

    return p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/Design/IAP2Design;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/daaw/avee/Design/IAP2Design;->killHelper()V

    return-void
.end method

.method static synthetic access$500(Lcom/daaw/avee/Design/IAP2Design;Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/IAP2Design;->doOnBuy(Lcom/daaw/avee/ContextData;)V

    return-void
.end method

.method private createHelper(Landroid/app/Activity;)V
    .locals 2

    .line 345
    iget-object v0, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    if-nez v0, :cond_0

    .line 346
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    iget-object v1, p0, Lcom/daaw/avee/Design/IAP2Design;->mUpdateListener:Lcom/daaw/avee/Design/IAP2Design$UpdateListener;

    invoke-direct {v0, p1, v1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;-><init>(Landroid/app/Activity;Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager$BillingUpdatesListener;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    :cond_0
    return-void
.end method

.method private displayAnErrorIfNeeded()V
    .locals 4

    .line 261
    iget-object v0, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    if-nez v0, :cond_0

    return-void

    .line 266
    :cond_0
    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->getBillingClientResponseCode()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x3

    const-string v2, ""

    if-eq v0, v1, :cond_1

    .line 281
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 283
    sget-object v1, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x7f10006f

    invoke-virtual {v0, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    .line 275
    :cond_1
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 277
    sget-object v1, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x7f100070

    invoke-virtual {v0, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private doOnBuy(Lcom/daaw/avee/ContextData;)V
    .locals 3

    .line 474
    iget-object p1, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    if-eqz p1, :cond_1

    .line 475
    invoke-virtual {p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->getBillingClientResponseCode()I

    move-result p1

    const/4 v0, -0x1

    if-le p1, v0, :cond_1

    const/4 p1, 0x3

    .line 478
    iget-object v0, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->getBillingClientResponseCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 479
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 481
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x7f100070

    invoke-virtual {p1, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 483
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/Design/IAP2Design;->onBillingManagerSetupFinished()V

    const/4 p1, 0x1

    .line 494
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/IAP2Design;->setWaitScreen(Z)V

    new-array p1, p1, [I

    const/4 v0, 0x0

    aput v0, p1, v0

    .line 498
    invoke-static {p1}, Lcom/daaw/avee/comp/InAppBilling/BSecLoad;->getLoad([I)Ljava/lang/String;

    .line 513
    :try_start_0
    iget-object p1, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    const-string v0, "premium"

    const-string v1, "inapp"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->initiatePurchaseFlow(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 516
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "launchPurchaseFlow exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 520
    :goto_0
    invoke-direct {p0}, Lcom/daaw/avee/Design/IAP2Design;->onPremiumUpdated()V

    return-void

    .line 486
    :cond_1
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 488
    sget-object p1, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    const-string v0, "Billing manager not initialized"

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private killHelper()V
    .locals 1

    const-string v0, "killHelper"

    .line 65
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Lcom/daaw/avee/Design/IAP2Design;->onDestroy2()V

    return-void
.end method

.method private killHelperAfter(I)V
    .locals 0

    return-void
.end method

.method static synthetic lambda$new$0()Ljava/lang/Boolean;
    .locals 1

    .line 202
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$1()Ljava/lang/Boolean;
    .locals 1

    .line 204
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$2()Ljava/lang/Boolean;
    .locals 1

    .line 206
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$3()Ljava/lang/Boolean;
    .locals 1

    .line 208
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$4()Ljava/lang/Boolean;
    .locals 1

    .line 210
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$5()Ljava/lang/Boolean;
    .locals 1

    .line 212
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$6(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    .line 214
    sget-boolean p0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$new$7(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    .line 216
    sget-boolean p0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$new$8()Ljava/lang/Boolean;
    .locals 1

    .line 218
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$new$9()Ljava/lang/Boolean;
    .locals 1

    .line 227
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private onPremiumUpdated()V
    .locals 1

    .line 526
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 528
    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->updatePremiumMenu()V

    :cond_0
    return-void
.end method

.method private onPurchaseFinished(Z)V
    .locals 2

    const/16 v0, 0x3a98

    .line 572
    invoke-direct {p0, v0}, Lcom/daaw/avee/Design/IAP2Design;->killHelperAfter(I)V

    if-eqz p1, :cond_0

    .line 575
    sget-object v0, Lcom/daaw/avee/Design/IAP2Design;->onPurchasedSuccessfully:Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private onResume2(Landroid/app/Activity;)V
    .locals 0

    .line 239
    iget-object p1, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    if-eqz p1, :cond_0

    .line 240
    invoke-virtual {p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->getBillingClientResponseCode()I

    move-result p1

    if-nez p1, :cond_0

    .line 241
    iget-object p1, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->queryPurchases()V

    :cond_0
    return-void
.end method

.method private setWaitScreen(Z)V
    .locals 0

    return-void
.end method

.method private showNotAvailableInVersion(Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 580
    invoke-static {p1}, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;->createAndShowStoreNotAvailableVerDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;

    return-void
.end method

.method private showStore(Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 539
    invoke-static {p1}, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->createAndShowStoreDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/InAppBilling/StoreDialog;

    const/16 p1, 0x3a98

    .line 541
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/IAP2Design;->killHelperAfter(I)V

    return-void
.end method

.method private startSetup(Landroid/app/Activity;Z)Z
    .locals 0

    .line 351
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/IAP2Design;->onResume2(Landroid/app/Activity;)V

    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method alert(Ljava/lang/String;)V
    .locals 2

    .line 550
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getActivityContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 553
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 554
    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const/4 p1, 0x0

    const-string v0, "OK"

    .line 555
    invoke-virtual {v1, v0, p1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 557
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    :cond_0
    return-void
.end method

.method complain(Ljava/lang/String;)V
    .locals 0

    .line 545
    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/IAP2Design;->alert(Ljava/lang/String;)V

    return-void
.end method

.method public isPremium()Ljava/lang/Boolean;
    .locals 1

    .line 231
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method onBillingManagerSetupFinished()V
    .locals 1

    const/4 v0, 0x1

    .line 466
    invoke-direct {p0, v0}, Lcom/daaw/avee/Design/IAP2Design;->setWaitScreen(Z)V

    .line 467
    invoke-virtual {p0}, Lcom/daaw/avee/Design/IAP2Design;->querySkuDetails()V

    return-void
.end method

.method public onDestroy2()V
    .locals 1

    const-string v0, "Destroying helper."

    .line 246
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 247
    iget-object v0, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    if-eqz v0, :cond_0

    .line 248
    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->destroy()V

    :cond_0
    const/4 v0, 0x0

    .line 251
    iput-object v0, p0, Lcom/daaw/avee/Design/IAP2Design;->mBillingManager:Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;

    return-void
.end method

.method public querySkuDetails()V
    .locals 0

    return-void
.end method

.method public updateUi()V
    .locals 0

    .line 567
    invoke-direct {p0}, Lcom/daaw/avee/Design/IAP2Design;->onPremiumUpdated()V

    return-void
.end method
