.class final Lcom/google/android/gms/internal/ads/zzaea;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaoo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzaoo<",
        "Lcom/google/android/gms/internal/ads/zzaef;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzccr:Lcom/google/android/gms/internal/ads/zzaen;

.field private final synthetic zzccs:Lcom/google/android/gms/internal/ads/zzadz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzadz;Lcom/google/android/gms/internal/ads/zzaen;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzccs:Lcom/google/android/gms/internal/ads/zzadz;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzccr:Lcom/google/android/gms/internal/ads/zzaen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zze(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzccs:Lcom/google/android/gms/internal/ads/zzadz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzccr:Lcom/google/android/gms/internal/ads/zzaen;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzadz;->zza(Lcom/google/android/gms/internal/ads/zzaen;Lcom/google/android/gms/internal/ads/zzaef;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaea;->zzccs:Lcom/google/android/gms/internal/ads/zzadz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzadz;->zznz()V

    :cond_0
    return-void
.end method
