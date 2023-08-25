.class public final Lcom/daaw/d84;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/e84;

.field public final b:Lcom/daaw/c84;


# direct methods
.method public constructor <init>(Lcom/daaw/e84;Lcom/daaw/c84;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/d84;->b:Lcom/daaw/c84;

    iput-object p1, p0, Lcom/daaw/d84;->a:Lcom/daaw/e84;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d84;->b:Lcom/daaw/c84;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, v0, Lcom/daaw/c84;->a:Lcom/daaw/a74;

    check-cast v0, Lcom/daaw/w74;

    invoke-virtual {v0}, Lcom/daaw/w74;->E0()Lcom/daaw/h74;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "Unable to pass GMSG, no AdWebViewClient for AdWebView!"

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p1}, Lcom/daaw/t84;->k0(Landroid/net/Uri;)V

    return-void
.end method

.method public getClickSignals(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    const-string p1, "Click string is empty, not proceeding."

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/d84;->a:Lcom/daaw/e84;

    invoke-interface {v0}, Lcom/daaw/l84;->a()Lcom/daaw/sl2;

    move-result-object v2

    if-nez v2, :cond_1

    const-string p1, "Signal utils is empty, ignoring."

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/daaw/sl2;->c()Lcom/daaw/ol2;

    move-result-object v2

    if-nez v2, :cond_2

    const-string p1, "Signals object is empty, ignoring."

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Lcom/daaw/e84;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_3

    const-string p1, "Context is null, ignoring."

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/daaw/d84;->a:Lcom/daaw/e84;

    invoke-interface {v0}, Lcom/daaw/e84;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d84;->a:Lcom/daaw/e84;

    invoke-interface {v1}, Lcom/daaw/e84;->zzk()Landroid/app/Activity;

    move-result-object v3

    check-cast v1, Landroid/view/View;

    invoke-interface {v2, v0, p1, v1, v3}, Lcom/daaw/ol2;->zzf(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getViewSignals()Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lcom/daaw/d84;->a:Lcom/daaw/e84;

    invoke-interface {v0}, Lcom/daaw/l84;->a()Lcom/daaw/sl2;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    const-string v0, "Signal utils is empty, ignoring."

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    return-object v2

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/sl2;->c()Lcom/daaw/ol2;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v0, "Signals object is empty, ignoring."

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lcom/daaw/e84;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "Context is null, ignoring."

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/d84;->a:Lcom/daaw/e84;

    invoke-interface {v0}, Lcom/daaw/e84;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/d84;->a:Lcom/daaw/e84;

    invoke-interface {v2}, Lcom/daaw/e84;->zzk()Landroid/app/Activity;

    move-result-object v3

    check-cast v2, Landroid/view/View;

    invoke-interface {v1, v0, v2, v3}, Lcom/daaw/ol2;->zzh(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public notify(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "URL is empty, ignoring message"

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v1, Lcom/daaw/b84;

    invoke-direct {v1, p0, p1}, Lcom/daaw/b84;-><init>(Lcom/daaw/d84;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
