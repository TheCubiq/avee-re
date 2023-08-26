.class final Lcom/google/android/gms/internal/ads/zzgm;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzaik:Lcom/google/android/gms/internal/ads/zzgk;

.field private zzail:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic zzaim:Lcom/google/android/gms/internal/ads/zzge;

.field final synthetic zzain:Landroid/webkit/WebView;

.field final synthetic zzaio:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzgk;Lcom/google/android/gms/internal/ads/zzge;Landroid/webkit/WebView;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzaik:Lcom/google/android/gms/internal/ads/zzgk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzaim:Lcom/google/android/gms/internal/ads/zzge;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzain:Landroid/webkit/WebView;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzaio:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzgn;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzgn;-><init>(Lcom/google/android/gms/internal/ads/zzgm;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzail:Landroid/webkit/ValueCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzain:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzain:Landroid/webkit/WebView;

    const-string v1, "(function() { return  {text:document.body.innerText}})();"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzail:Landroid/webkit/ValueCallback;

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgm;->zzail:Landroid/webkit/ValueCallback;

    const-string v1, ""

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
