.class final Lcom/google/android/gms/internal/ads/zzage;
.super Ljava/lang/Object;


# instance fields
.field public final zzckl:J

.field public final zzckm:Lcom/google/android/gms/internal/ads/zzaga;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzagc;Lcom/google/android/gms/internal/ads/zzaga;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzer()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzage;->zzckl:J

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzage;->zzckm:Lcom/google/android/gms/internal/ads/zzaga;

    return-void
.end method
