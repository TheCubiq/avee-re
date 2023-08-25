.class public final Lcom/google/android/gms/ads/internal/util/zzby;
.super Lcom/google/android/gms/ads/internal/util/zzb;
.source ""


# instance fields
.field public final c:Lcom/daaw/p04;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/util/zzs;->zzc(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/util/zzb;-><init>()V

    new-instance p2, Lcom/daaw/p04;

    invoke-direct {p2, p1}, Lcom/daaw/p04;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/util/zzby;->c:Lcom/daaw/p04;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/util/zzby;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/zzby;->c:Lcom/daaw/p04;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/util/zzby;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/p04;->zza(Ljava/lang/String;)Z

    return-void
.end method
