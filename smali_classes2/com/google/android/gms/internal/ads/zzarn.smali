.class final synthetic Lcom/google/android/gms/internal/ads/zzarn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzcsi:I

.field private final zzcsj:I

.field private final zzdcp:Z

.field private final zzdcq:Z

.field private final zzdel:Lcom/google/android/gms/internal/ads/zzarl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzarl;IIZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzdel:Lcom/google/android/gms/internal/ads/zzarl;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzcsi:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzcsj:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzdcp:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzdcq:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzdel:Lcom/google/android/gms/internal/ads/zzarl;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzcsi:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzcsj:I

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzdcp:Z

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzarn;->zzdcq:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzarl;->zza(IIZZ)V

    return-void
.end method
