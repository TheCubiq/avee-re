.class public final Lcom/google/android/gms/internal/ads/zzaib;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final zzbtp:Lcom/google/android/gms/internal/ads/zzxq;

.field private final zzcmi:Lcom/google/android/gms/internal/ads/zzahv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzxq;Lcom/google/android/gms/internal/ads/zzahu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaib;->zzbtp:Lcom/google/android/gms/internal/ads/zzxq;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzahv;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzahv;-><init>(Lcom/google/android/gms/internal/ads/zzahu;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaib;->zzcmi:Lcom/google/android/gms/internal/ads/zzahv;

    return-void
.end method


# virtual methods
.method public final zzpe()Lcom/google/android/gms/internal/ads/zzxq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaib;->zzbtp:Lcom/google/android/gms/internal/ads/zzxq;

    return-object v0
.end method

.method public final zzpf()Lcom/google/android/gms/internal/ads/zzahv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaib;->zzcmi:Lcom/google/android/gms/internal/ads/zzahv;

    return-object v0
.end method
