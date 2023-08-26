.class public Lcom/daaw/avee/Design/AdsDesign;
.super Ljava/lang/Object;
.source "AdsDesign.java"


# static fields
.field public static onCreateAfterAdsInitialized:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/AdsDesign;->onCreateAfterAdsInitialized:Lcom/daaw/avee/Common/Events/WeakEvent1;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/AdsDesign;->listenerRefHolder:Ljava/util/List;

    .line 33
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$AdsDesign$lRPC4Wleee3HB6t4w0uIeomhSvg;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$AdsDesign$lRPC4Wleee3HB6t4w0uIeomhSvg;

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 41
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onShowAdView:Lcom/daaw/avee/Common/Events/WeakEventR3;

    new-instance v1, Lcom/daaw/avee/Design/AdsDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/AdsDesign$1;-><init>(Lcom/daaw/avee/Design/AdsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR3$Handler;Ljava/util/List;)V

    .line 73
    sget-object v0, Lcom/daaw/avee/Design/IAP2Design;->onPurchasedSuccessfully:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/AdsDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/AdsDesign$2;-><init>(Lcom/daaw/avee/Design/AdsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AdsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic lambda$new$0(Landroid/app/Activity;)V
    .locals 1

    const v0, 0x7f10001b

    .line 34
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-static {p0, v0}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    sget-object v0, Lcom/daaw/avee/Design/AdsDesign;->onCreateAfterAdsInitialized:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method onPurchasedSuccessfully(Z)Z
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 84
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 86
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    const-string v2, "pref_disableHeaderAds"

    invoke-virtual {v1, p1, v2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesSetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 87
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    const-string v2, "pref_alwaysHideAppLogo"

    invoke-virtual {v1, p1, v2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesSetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_0
    return v0
.end method
