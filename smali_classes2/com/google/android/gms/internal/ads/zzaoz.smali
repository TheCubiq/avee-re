.class final Lcom/google/android/gms/internal/ads/zzaoz;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzcxf:Lcom/google/android/gms/internal/ads/zzaov;

.field private final synthetic zzcxg:Ljava/lang/String;

.field private final synthetic zzcxh:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaov;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoz;->zzcxf:Lcom/google/android/gms/internal/ads/zzaov;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaoz;->zzcxg:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaoz;->zzcxh:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoz;->zzcxf:Lcom/google/android/gms/internal/ads/zzaov;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaov;->zza(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzapf;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoz;->zzcxf:Lcom/google/android/gms/internal/ads/zzaov;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaov;->zza(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzapf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaoz;->zzcxg:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaoz;->zzcxh:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzapf;->zzg(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
