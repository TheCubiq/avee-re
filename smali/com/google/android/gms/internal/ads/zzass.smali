.class public Lcom/google/android/gms/internal/ads/zzass;
.super Landroid/webkit/WebView;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzasx;
.implements Lcom/google/android/gms/internal/ads/zzasz;
.implements Lcom/google/android/gms/internal/ads/zzata;
.implements Lcom/google/android/gms/internal/ads/zzatb;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final zzdew:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzasx;",
            ">;"
        }
    .end annotation
.end field

.field private final zzdex:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzatb;",
            ">;"
        }
    .end annotation
.end field

.field private final zzdey:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzasz;",
            ">;"
        }
    .end annotation
.end field

.field private final zzdez:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzata;",
            ">;"
        }
    .end annotation
.end field

.field private final zzdfa:Lcom/google/android/gms/internal/ads/zzash;

.field protected final zzdfb:Landroid/webkit/WebViewClient;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzash;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdew:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdex:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdey:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdez:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdfa:Lcom/google/android/gms/internal/ads/zzash;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzass;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzass;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/zzakq;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzass;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzakq;->zza(Landroid/content/Context;Landroid/webkit/WebSettings;)Z

    const-string v0, "accessibility"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzass;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "accessibilityTraversal"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzass;->removeJavascriptInterface(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzass;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unable to enable Javascript."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzass;->setLayerType(ILandroid/graphics/Paint;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzast;

    invoke-direct {p1, p0, p0, p0, p0}, Lcom/google/android/gms/internal/ads/zzast;-><init>(Lcom/google/android/gms/internal/ads/zzasx;Lcom/google/android/gms/internal/ads/zzatb;Lcom/google/android/gms/internal/ads/zzasz;Lcom/google/android/gms/internal/ads/zzata;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdfb:Landroid/webkit/WebViewClient;

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method


# virtual methods
.method public addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "Ignore addJavascriptInterface due to low Android version."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IncompatibleClassChangeError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v0

    const-string v1, "CoreWebView.loadUrl"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzajm;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 0

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzasx;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdew:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzasz;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdey:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzata;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdez:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzatb;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdex:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzasu;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdew:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzasx;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzasx;->zza(Lcom/google/android/gms/internal/ads/zzasu;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzasu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdey:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzasz;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzasz;->zzb(Lcom/google/android/gms/internal/ads/zzasu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public zzbe(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzasy;->zza(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public zzc(Lcom/google/android/gms/internal/ads/zzasu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdez:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzata;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzata;->zzc(Lcom/google/android/gms/internal/ads/zzasu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzasu;)Landroid/webkit/WebResourceResponse;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdex:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzatb;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzatb;->zzd(Lcom/google/android/gms/internal/ads/zzasu;)Landroid/webkit/WebResourceResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected final zzvv()Lcom/google/android/gms/internal/ads/zzash;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzass;->zzdfa:Lcom/google/android/gms/internal/ads/zzash;

    return-object v0
.end method
