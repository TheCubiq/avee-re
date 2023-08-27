.class final synthetic Lcom/google/android/gms/internal/ads/zzacg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzase;


# instance fields
.field private final zzcbg:Lorg/json/JSONObject;

.field private final zzcbh:Lcom/google/android/gms/internal/ads/zzaqw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaqw;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzacg;->zzcbh:Lcom/google/android/gms/internal/ads/zzaqw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzacg;->zzcbg:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final zzly()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzacg;->zzcbh:Lcom/google/android/gms/internal/ads/zzaqw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzacg;->zzcbg:Lorg/json/JSONObject;

    const-string v2, "google.afma.nativeAds.renderVideo"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzb(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
