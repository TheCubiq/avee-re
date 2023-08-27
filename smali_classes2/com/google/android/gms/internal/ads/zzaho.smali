.class final Lcom/google/android/gms/internal/ads/zzaho;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzclu:Lcom/google/android/gms/internal/ads/zzxq;

.field private final synthetic zzclv:Lcom/google/android/gms/internal/ads/zzahn;

.field private final synthetic zzyh:Lcom/google/android/gms/internal/ads/zzjj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzahn;Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/zzxq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzclv:Lcom/google/android/gms/internal/ads/zzahn;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzyh:Lcom/google/android/gms/internal/ads/zzjj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzclu:Lcom/google/android/gms/internal/ads/zzxq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzclv:Lcom/google/android/gms/internal/ads/zzahn;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzyh:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzclu:Lcom/google/android/gms/internal/ads/zzxq;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzahn;->zza(Lcom/google/android/gms/internal/ads/zzahn;Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/zzxq;)V

    return-void
.end method
