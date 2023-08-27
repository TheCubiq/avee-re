.class final Lcom/google/android/gms/internal/ads/zzaqf;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzdax:Lcom/google/android/gms/internal/ads/zzaqe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaqe;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzdax:Lcom/google/android/gms/internal/ads/zzaqe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzff()Lcom/google/android/gms/internal/ads/zzaqg;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzdax:Lcom/google/android/gms/internal/ads/zzaqe;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaqg;->zzb(Lcom/google/android/gms/internal/ads/zzaqe;)V

    return-void
.end method
