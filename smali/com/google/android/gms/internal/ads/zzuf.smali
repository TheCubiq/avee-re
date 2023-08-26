.class public final Lcom/google/android/gms/internal/ads/zzuf;
.super Lcom/google/android/gms/internal/ads/zzus;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzuo;
.implements Lcom/google/android/gms/internal/ads/zzuu;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzus<",
        "Lcom/google/android/gms/internal/ads/zzwb;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzuo;",
        "Lcom/google/android/gms/internal/ads/zzuu;"
    }
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final zzbpj:Lcom/google/android/gms/internal/ads/zzasv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzarg;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzus;-><init>()V

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzasv;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzash;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzash;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzasv;-><init>(Lcom/google/android/gms/internal/ads/zzash;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzasv;->setWillNotDraw(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzug;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzug;-><init>(Lcom/google/android/gms/internal/ads/zzuf;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzass;->zza(Lcom/google/android/gms/internal/ads/zzasx;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzuh;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzuh;-><init>(Lcom/google/android/gms/internal/ads/zzuf;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzass;->zza(Lcom/google/android/gms/internal/ads/zzasz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzun;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzun;-><init>(Lcom/google/android/gms/internal/ads/zzur;Lcom/google/android/gms/internal/ads/zzum;)V

    const-string v2, "GoogleJsInterface"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzass;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/zzakk;

    move-result-object v0

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzang;->zzcw:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzasv;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzakk;->zza(Landroid/content/Context;Ljava/lang/String;Landroid/webkit/WebSettings;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzarg;

    const-string v0, "Init failed."

    invoke-direct {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzarg;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzasv;->destroy()V

    return-void
.end method

.method public final bridge synthetic getReference()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzuv;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzuk;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzuk;-><init>(Lcom/google/android/gms/internal/ads/zzuv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzass;->zza(Lcom/google/android/gms/internal/ads/zzata;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzup;->zza(Lcom/google/android/gms/internal/ads/zzuo;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzup;->zzb(Lcom/google/android/gms/internal/ads/zzuo;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzup;->zza(Lcom/google/android/gms/internal/ads/zzuo;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final zzbb(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzuf;->zzbc(Ljava/lang/String;)V

    return-void
.end method

.method public final zzbc(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzui;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzui;-><init>(Lcom/google/android/gms/internal/ads/zzuf;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzbd(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzuj;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzuj;-><init>(Lcom/google/android/gms/internal/ads/zzuf;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzbe(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzul;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzul;-><init>(Lcom/google/android/gms/internal/ads/zzuf;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic zzbf(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzass;->zzbe(Ljava/lang/String;)V

    return-void
.end method

.method final synthetic zzbg(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzass;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method final synthetic zzbh(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuf;->zzbpj:Lcom/google/android/gms/internal/ads/zzasv;

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzasv;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final zzf(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzup;->zza(Lcom/google/android/gms/internal/ads/zzuo;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final zzlw()Lcom/google/android/gms/internal/ads/zzwc;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzwd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzwd;-><init>(Lcom/google/android/gms/internal/ads/zzwb;)V

    return-object v0
.end method
