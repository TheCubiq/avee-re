.class public final Lcom/google/android/gms/internal/ads/zzoo;
.super Lcom/google/android/gms/internal/ads/zzql;

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

.field private zzbhz:Lcom/google/android/gms/internal/ads/zzpw;

.field private zzbia:Ljava/lang/String;

.field private zzbib:D

.field private zzbic:Ljava/lang/String;

.field private zzbid:Ljava/lang/String;

.field private zzbie:Lcom/google/android/gms/internal/ads/zzoj;

.field private zzbif:Lcom/google/android/gms/internal/ads/zzlo;

.field private zzbig:Landroid/view/View;

.field private zzbih:Lcom/google/android/gms/dynamic/IObjectWrapper;

.field private zzbii:Ljava/lang/String;

.field private zzbij:Lcom/google/android/gms/internal/ads/zzoz;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;)V
    .locals 3
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
            "D",
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

    move-object v0, p0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzql;-><init>()V

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->mLock:Ljava/lang/Object;

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhw:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhx:Ljava/util/List;

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhy:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhz:Lcom/google/android/gms/internal/ads/zzpw;

    move-object v1, p5

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbia:Ljava/lang/String;

    move-wide v1, p6

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbib:D

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbic:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbid:Ljava/lang/String;

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbie:Lcom/google/android/gms/internal/ads/zzoj;

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->mExtras:Landroid/os/Bundle;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbif:Lcom/google/android/gms/internal/ads/zzlo;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbig:Landroid/view/View;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbih:Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzoo;->zzbii:Ljava/lang/String;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzoo;Lcom/google/android/gms/internal/ads/zzoz;)Lcom/google/android/gms/internal/ads/zzoz;
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    return-object p1
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzoo;)Lcom/google/android/gms/internal/ads/zzoz;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    return-object p0
.end method


# virtual methods
.method public final destroy()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzop;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzop;-><init>(Lcom/google/android/gms/internal/ads/zzoo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhw:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhx:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhy:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhz:Lcom/google/android/gms/internal/ads/zzpw;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbia:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbib:D

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbic:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbid:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbie:Lcom/google/android/gms/internal/ads/zzoj;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->mExtras:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->mLock:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbif:Lcom/google/android/gms/internal/ads/zzlo;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbig:Landroid/view/View;

    return-void
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhy:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallToAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbia:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomTemplateId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final getExtras()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getHeadline()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhw:Ljava/lang/String;

    return-object v0
.end method

.method public final getImages()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhx:Ljava/util/List;

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbii:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbid:Ljava/lang/String;

    return-object v0
.end method

.method public final getStarRating()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbib:D

    return-wide v0
.end method

.method public final getStore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbic:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/zzlo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbif:Lcom/google/android/gms/internal/ads/zzlo;

    return-object v0
.end method

.method public final performClick(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    if-nez v1, :cond_0

    const-string p1, "#001 Attempt to perform click before app native ad initialized."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->e(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    if-nez v1, :cond_0

    const-string p1, "#002 Attempt to record impression before native ad initialized."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->e(Ljava/lang/String;)V

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    if-nez v1, :cond_0

    const-string p1, "#003 Attempt to report touch event before native ad initialized."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->e(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzjz()Lcom/google/android/gms/internal/ads/zzpw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbhz:Lcom/google/android/gms/internal/ads/zzpw;

    return-object v0
.end method

.method public final zzka()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbij:Lcom/google/android/gms/internal/ads/zzoz;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final zzkb()Ljava/lang/String;
    .locals 1

    const-string v0, "2"

    return-object v0
.end method

.method public final zzkc()Lcom/google/android/gms/internal/ads/zzoj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbie:Lcom/google/android/gms/internal/ads/zzoj;

    return-object v0
.end method

.method public final zzkd()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbig:Landroid/view/View;

    return-object v0
.end method

.method public final zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbih:Lcom/google/android/gms/dynamic/IObjectWrapper;

    return-object v0
.end method

.method public final zzkf()Lcom/google/android/gms/internal/ads/zzps;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoo;->zzbie:Lcom/google/android/gms/internal/ads/zzoj;

    return-object v0
.end method
