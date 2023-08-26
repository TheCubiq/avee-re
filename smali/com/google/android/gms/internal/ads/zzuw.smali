.class public final Lcom/google/android/gms/internal/ads/zzuw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzuo;
.implements Lcom/google/android/gms/internal/ads/zzuu;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/ads/internal/zzw;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzarg;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzuw;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzel()Lcom/google/android/gms/internal/ads/zzarc;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzasi;->zzvq()Lcom/google/android/gms/internal/ads/zzasi;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhs;->zzhm()Lcom/google/android/gms/internal/ads/zzhs;

    move-result-object v10

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p1

    move-object v5, p3

    move-object v6, p2

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzarc;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzasi;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zznx;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzhs;)Lcom/google/android/gms/internal/ads/zzaqw;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzuw;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaqw;->getView()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method private static runOnUiThread(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzif()Lcom/google/android/gms/internal/ads/zzamu;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzamu;->zzsh()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzuw;)Lcom/google/android/gms/internal/ads/zzaqw;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzuw;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    return-object p0
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuw;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->destroy()V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzuv;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuw;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzuz;->zzb(Lcom/google/android/gms/internal/ads/zzuv;)Lcom/google/android/gms/internal/ads/zzase;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzasc;->zza(Lcom/google/android/gms/internal/ads/zzase;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "-",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuw;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzvd;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ads/zzvd;-><init>(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

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

.method public final zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "-",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuw;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzuy;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/zzuy;-><init>(Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/common/util/Predicate;)V

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

    const-string p1, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzva;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzva;-><init>(Lcom/google/android/gms/internal/ads/zzuw;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzuw;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzbc(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzvb;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzvb;-><init>(Lcom/google/android/gms/internal/ads/zzuw;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzuw;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzbd(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzvc;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzvc;-><init>(Lcom/google/android/gms/internal/ads/zzuw;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzuw;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzbe(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzux;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzux;-><init>(Lcom/google/android/gms/internal/ads/zzuw;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzuw;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic zzbi(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzuw;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzbe(Ljava/lang/String;)V

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
