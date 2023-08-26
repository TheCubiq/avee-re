.class public final Lcom/google/android/gms/internal/ads/zzok;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final zzaad:Lcom/google/android/gms/internal/ads/zzacm;

.field private zzbhm:Lcom/google/android/gms/internal/ads/zzro;

.field private zzbhn:Lcom/google/android/gms/ads/internal/gmsg/zzv;

.field zzbho:Ljava/lang/String;

.field zzbhp:Ljava/lang/Long;

.field zzbhq:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzacm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzok;)Lcom/google/android/gms/internal/ads/zzro;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhm:Lcom/google/android/gms/internal/ads/zzro;

    return-object p0
.end method

.method private final zzjx()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbho:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhp:Ljava/lang/Long;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhq:Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhq:Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final cancelUnconfirmedClick()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhm:Lcom/google/android/gms/internal/ads/zzro;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhp:Ljava/lang/Long;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzok;->zzjx()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhm:Lcom/google/android/gms/internal/ads/zzro;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzro;->onUnconfirmedClickCancelled()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzane;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhq:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbho:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhp:Ljava/lang/Long;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v0, "id"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbho:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "time_interval"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzer()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhp:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "messageType"

    const-string v1, "onePointFiveClick"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    const-string v1, "sendMessageToNativeJs"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzacm;->zza(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Unable to dispatch sendMessageToNativeJs event"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzok;->zzjx()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzro;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhm:Lcom/google/android/gms/internal/ads/zzro;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhn:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v0, "/unconfirmedClick"

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    invoke-interface {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzacm;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzol;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzol;-><init>(Lcom/google/android/gms/internal/ads/zzok;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhn:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzok;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    invoke-interface {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzacm;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    return-void
.end method

.method public final zzjw()Lcom/google/android/gms/internal/ads/zzro;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzok;->zzbhm:Lcom/google/android/gms/internal/ads/zzro;

    return-object v0
.end method
