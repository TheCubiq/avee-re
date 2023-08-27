.class final Lcom/google/android/gms/internal/ads/zzpq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbki:Lcom/google/android/gms/internal/ads/zzpd;

.field private final synthetic zzbkj:Lcom/google/android/gms/internal/ads/zzpp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzpp;Lcom/google/android/gms/internal/ads/zzpd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpq;->zzbkj:Lcom/google/android/gms/internal/ads/zzpp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpq;->zzbki:Lcom/google/android/gms/internal/ads/zzpd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpq;->zzbkj:Lcom/google/android/gms/internal/ads/zzpp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpq;->zzbki:Lcom/google/android/gms/internal/ads/zzpd;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzpp;->zza(Lcom/google/android/gms/internal/ads/zzpp;Lcom/google/android/gms/internal/ads/zzpd;)V

    return-void
.end method
