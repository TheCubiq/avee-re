.class final Lcom/google/android/gms/ads/internal/gmsg/zzx;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbmk:Lorg/json/JSONObject;

.field private final synthetic zzbml:Lcom/google/android/gms/ads/internal/gmsg/zzw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/gmsg/zzw;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/gmsg/zzx;->zzbml:Lcom/google/android/gms/ads/internal/gmsg/zzw;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/gmsg/zzx;->zzbmk:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/gmsg/zzx;->zzbml:Lcom/google/android/gms/ads/internal/gmsg/zzw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/gmsg/zzw;->zzbmi:Lcom/google/android/gms/internal/ads/zzue;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/gmsg/zzx;->zzbmk:Lorg/json/JSONObject;

    const-string v2, "fetchHttpRequestCompleted"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzue;->zza(Ljava/lang/String;Lorg/json/JSONObject;)V

    const-string v0, "Dispatched http response."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzck(Ljava/lang/String;)V

    return-void
.end method
