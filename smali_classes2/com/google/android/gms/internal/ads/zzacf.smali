.class final synthetic Lcom/google/android/gms/internal/ads/zzacf;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbns:Lcom/google/android/gms/internal/ads/zzaoj;

.field private final zzcbf:Lcom/google/android/gms/internal/ads/zzace;

.field private final zzcbg:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzace;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzaoj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzacf;->zzcbf:Lcom/google/android/gms/internal/ads/zzace;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzacf;->zzcbg:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzacf;->zzbns:Lcom/google/android/gms/internal/ads/zzaoj;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzacf;->zzcbf:Lcom/google/android/gms/internal/ads/zzace;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzacf;->zzcbg:Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzacf;->zzbns:Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzace;->zza(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzaoj;)V

    return-void
.end method
