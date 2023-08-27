.class Lcom/daaw/avee/Design/AdsDesign$1;
.super Ljava/lang/Object;
.source "AdsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AdsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR3$Handler<",
        "Lcom/daaw/avee/comp/Common/AdViewHolder;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AdsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AdsDesign;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/daaw/avee/Design/AdsDesign$1;->this$0:Lcom/daaw/avee/Design/AdsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Common/AdViewHolder;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 6

    .line 44
    iget-object v0, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v0, :cond_0

    return-object v2

    .line 46
    :cond_0
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    const-string v3, "pref_disableHeaderAds"

    const/16 v4, 0x8

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    iget-object v5, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v5}, Lcom/google/android/gms/ads/AdView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v0, v5, v3, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {p1, v4}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    return-object v2

    .line 50
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v5, 0x1

    if-nez v0, :cond_2

    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v5, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x2

    if-ne p2, v0, :cond_5

    .line 54
    :cond_3
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x7

    if-ge p2, v0, :cond_4

    .line 55
    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {p1, v4}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    return-object v2

    .line 58
    :cond_4
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 p3, 0xa

    if-le p2, p3, :cond_5

    .line 59
    sget-boolean p2, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    if-eqz p2, :cond_5

    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    iget-object p3, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {p3}, Lcom/google/android/gms/ads/AdView;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p2, p3, v3, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 60
    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {p1, v4}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    return-object v2

    .line 66
    :cond_5
    :goto_0
    new-instance p2, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {p2}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object p2

    .line 67
    iget-object p1, p1, Lcom/daaw/avee/comp/Common/AdViewHolder;->adView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 69
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Lcom/daaw/avee/comp/Common/AdViewHolder;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/AdsDesign$1;->invoke(Lcom/daaw/avee/comp/Common/AdViewHolder;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
