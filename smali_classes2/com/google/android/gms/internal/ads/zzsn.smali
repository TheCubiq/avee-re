.class final Lcom/google/android/gms/internal/ads/zzsn;
.super Lcom/google/android/gms/internal/ads/zzaoj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzaoj<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbnn:Lcom/google/android/gms/internal/ads/zzsm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzsm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsn;->zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsn;->zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzsm;->zza(Lcom/google/android/gms/internal/ads/zzsm;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzaoj;->cancel(Z)Z

    move-result p1

    return p1
.end method
