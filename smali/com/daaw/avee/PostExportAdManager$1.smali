.class final Lcom/daaw/avee/PostExportAdManager$1;
.super Ljava/lang/Object;
.source "PostExportAdManager.kt"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/PostExportAdManager;-><init>(Lcom/daaw/avee/Common/Events/WeakEventR;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/app/Activity;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/PostExportAdManager;


# direct methods
.method constructor <init>(Lcom/daaw/avee/PostExportAdManager;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/PostExportAdManager$1;->this$0:Lcom/daaw/avee/PostExportAdManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/app/Activity;)V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/daaw/avee/PostExportAdManager$1;->this$0:Lcom/daaw/avee/PostExportAdManager;

    new-instance v1, Lcom/google/android/gms/ads/InterstitialAd;

    check-cast p1, Landroid/content/Context;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/InterstitialAd;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/daaw/avee/PostExportAdManager;->access$setAd$p(Lcom/daaw/avee/PostExportAdManager;Lcom/google/android/gms/ads/InterstitialAd;)V

    .line 27
    iget-object p1, p0, Lcom/daaw/avee/PostExportAdManager$1;->this$0:Lcom/daaw/avee/PostExportAdManager;

    invoke-static {p1}, Lcom/daaw/avee/PostExportAdManager;->access$getAd$p(Lcom/daaw/avee/PostExportAdManager;)Lcom/google/android/gms/ads/InterstitialAd;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/PostExportAdManager$1;->this$0:Lcom/daaw/avee/PostExportAdManager;

    invoke-static {v0}, Lcom/daaw/avee/PostExportAdManager;->access$getAdId$p(Lcom/daaw/avee/PostExportAdManager;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/InterstitialAd;->setAdUnitId(Ljava/lang/String;)V

    .line 28
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/PostExportAdManager$1;->this$0:Lcom/daaw/avee/PostExportAdManager;

    invoke-static {p1}, Lcom/daaw/avee/PostExportAdManager;->access$getAd$p(Lcom/daaw/avee/PostExportAdManager;)Lcom/google/android/gms/ads/InterstitialAd;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/PostExportAdManager$1;->this$0:Lcom/daaw/avee/PostExportAdManager;

    check-cast v0, Lcom/google/android/gms/ads/AdListener;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/InterstitialAd;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 29
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/PostExportAdManager$1;->this$0:Lcom/daaw/avee/PostExportAdManager;

    invoke-static {p1}, Lcom/daaw/avee/PostExportAdManager;->access$getAd$p(Lcom/daaw/avee/PostExportAdManager;)Lcom/google/android/gms/ads/InterstitialAd;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/InterstitialAd;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 11
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/PostExportAdManager$1;->invoke(Landroid/app/Activity;)V

    return-void
.end method
