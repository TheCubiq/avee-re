.class final synthetic Lcom/google/android/gms/internal/ads/zzaow;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzcsi:I

.field private final zzcxe:Lcom/google/android/gms/internal/ads/zzaov;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaov;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzcxe:Lcom/google/android/gms/internal/ads/zzaov;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzcsi:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzcxe:Lcom/google/android/gms/internal/ads/zzaov;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzcsi:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaov;->zzah(I)V

    return-void
.end method
