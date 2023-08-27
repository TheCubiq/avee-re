.class final synthetic Lcom/google/android/gms/internal/ads/zzug;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzasx;


# instance fields
.field private final zzbpk:Lcom/google/android/gms/internal/ads/zzuf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzuf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzug;->zzbpk:Lcom/google/android/gms/internal/ads/zzuf;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzasu;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzug;->zzbpk:Lcom/google/android/gms/internal/ads/zzuf;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzasu;->uri:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzus;->zzf(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
