.class public final Lcom/google/android/gms/internal/ads/zzoq;
.super Lcom/google/android/gms/internal/ads/zzqp;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzpc;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private mExtras:Landroid/os/Bundle;

.field private mLock:Ljava/lang/Object;

.field private zzbhw:Ljava/lang/String;

.field private zzbhx:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;"
        }
    .end annotation
.end field

.field private zzbhy:Ljava/lang/String;

.field private zzbia:Ljava/lang/String;

.field private zzbie:Lcom/google/android/gms/internal/ads/zzoj;

.field private zzbif:Lcom/google/android/gms/internal/ads/zzlo;

.field private zzbig:Landroid/view/View;

.field private zzbih:Lcom/google/android/gms/dynamic/IObjectWrapper;

.field private zzbii:Ljava/lang/String;

.field private zzbij:Lcom/google/android/gms/internal/ads/zzoz;

.field private zzbil:Lcom/google/android/gms/internal/ads/zzpw;

.field private zzbim:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzpw;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzoj;",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/internal/ads/zzlo;",
            "Landroid/view/View;",
            "Lcom/google/android/gms/dynamic/IObjectWrapper;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzqp;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->mLock:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhw:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhx:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhy:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbil:Lcom/google/android/gms/internal/ads/zzpw;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbia:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbim:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbie:Lcom/google/android/gms/internal/ads/zzoj;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzoq;->mExtras:Landroid/os/Bundle;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbif:Lcom/google/android/gms/internal/ads/zzlo;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbig:Landroid/view/View;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbih:Lcom/google/android/gms/dynamic/IObjectWrapper;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbii:Ljava/lang/String;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzoq;Lcom/google/android/gms/internal/ads/zzoz;)Lcom/google/android/gms/internal/ads/zzoz;
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    return-object p1
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzoq;)Lcom/google/android/gms/internal/ads/zzoz;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    return-object p0
.end method


# virtual methods
.method public final destroy()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzor;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzor;-><init>(Lcom/google/android/gms/internal/ads/zzoq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhw:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhx:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhy:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbil:Lcom/google/android/gms/internal/ads/zzpw;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbia:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbim:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbie:Lcom/google/android/gms/internal/ads/zzoj;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->mExtras:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->mLock:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbif:Lcom/google/android/gms/internal/ads/zzlo;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbig:Landroid/view/View;

    return-void
.end method

.method public final getAdvertiser()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbim:Ljava/lang/String;

    return-object v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhy:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallToAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbia:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomTemplateId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final getExtras()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getHeadline()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhw:Ljava/lang/String;

    return-object v0
.end method

.method public final getImages()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbhx:Ljava/util/List;

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbii:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/zzlo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbif:Lcom/google/android/gms/internal/ads/zzlo;

    return-object v0
.end method

.method public final performClick(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    if-nez v1, :cond_0

    const-string p1, "#001 Attempt to perform click before app native ad initialized."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->e(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzoz;->performClick(Landroid/os/Bundle;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final recordImpression(Landroid/os/Bundle;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    if-nez v1, :cond_0

    const-string p1, "#002 Attempt to record impression before native ad initialized."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->e(Ljava/lang/String;)V

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzoz;->recordImpression(Landroid/os/Bundle;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final reportTouchEvent(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    if-nez v1, :cond_0

    const-string p1, "#003 Attempt to report touch event before native ad initialized."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->e(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzoz;->reportTouchEvent(Landroid/os/Bundle;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzoz;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzka()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final zzkb()Ljava/lang/String;
    .locals 1

    const-string v0, "1"

    return-object v0
.end method

.method public final zzkc()Lcom/google/android/gms/internal/ads/zzoj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbie:Lcom/google/android/gms/internal/ads/zzoj;

    return-object v0
.end method

.method public final zzkd()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbig:Landroid/view/View;

    return-object v0
.end method

.method public final zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbih:Lcom/google/android/gms/dynamic/IObjectWrapper;

    return-object v0
.end method

.method public final zzkf()Lcom/google/android/gms/internal/ads/zzps;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbie:Lcom/google/android/gms/internal/ads/zzoj;

    return-object v0
.end method

.method public final zzkg()Lcom/google/android/gms/internal/ads/zzpw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzbil:Lcom/google/android/gms/internal/ads/zzpw;

    return-object v0
.end method
