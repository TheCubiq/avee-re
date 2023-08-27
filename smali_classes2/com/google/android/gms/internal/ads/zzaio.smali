.class public final Lcom/google/android/gms/internal/ads/zzaio;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaiu;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private zzcnc:Lcom/google/android/gms/internal/ads/zzaiv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaiv;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaio;->zzcnc:Lcom/google/android/gms/internal/ads/zzaiv;

    return-void
.end method


# virtual methods
.method public final zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zzaej;)Lcom/google/android/gms/internal/ads/zzait;
    .locals 7

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzaej;->zzcfk:Lcom/google/android/gms/internal/ads/zzaiq;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v6, Lcom/google/android/gms/internal/ads/zzaii;

    iget-object v3, p3, Lcom/google/android/gms/internal/ads/zzaej;->zzcfk:Lcom/google/android/gms/internal/ads/zzaiq;

    iget-object v4, p3, Lcom/google/android/gms/internal/ads/zzaej;->zzbyq:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzaio;->zzcnc:Lcom/google/android/gms/internal/ads/zzaiv;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzaii;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zzaiq;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaiv;)V

    return-object v6
.end method
