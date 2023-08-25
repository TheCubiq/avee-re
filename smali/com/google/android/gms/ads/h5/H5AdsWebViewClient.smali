.class public final Lcom/google/android/gms/ads/h5/H5AdsWebViewClient;
.super Lcom/daaw/sh3;
.source ""


# instance fields
.field public final a:Lcom/daaw/ii3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/webkit/WebView;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/sh3;-><init>()V

    new-instance v0, Lcom/daaw/ii3;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ii3;-><init>(Landroid/content/Context;Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/h5/H5AdsWebViewClient;->a:Lcom/daaw/ii3;

    return-void
.end method


# virtual methods
.method public a()Landroid/webkit/WebViewClient;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/h5/H5AdsWebViewClient;->a:Lcom/daaw/ii3;

    return-object v0
.end method

.method public clearAdObjects()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/h5/H5AdsWebViewClient;->a:Lcom/daaw/ii3;

    invoke-virtual {v0}, Lcom/daaw/ii3;->b()V

    return-void
.end method

.method public getDelegateWebViewClient()Landroid/webkit/WebViewClient;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/h5/H5AdsWebViewClient;->a:Lcom/daaw/ii3;

    invoke-virtual {v0}, Lcom/daaw/ii3;->a()Landroid/webkit/WebViewClient;

    move-result-object v0

    return-object v0
.end method

.method public setDelegateWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/h5/H5AdsWebViewClient;->a:Lcom/daaw/ii3;

    invoke-virtual {v0, p1}, Lcom/daaw/ii3;->c(Landroid/webkit/WebViewClient;)V

    return-void
.end method
