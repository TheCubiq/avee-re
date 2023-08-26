.class final Lcom/google/android/gms/internal/ads/zzaim;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzanl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzanl<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzcnb:Lcom/google/android/gms/internal/ads/zzanz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaii;Lcom/google/android/gms/internal/ads/zzanz;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaim;->zzcnb:Lcom/google/android/gms/internal/ads/zzanz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaii;->zzpl()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaim;->zzcnb:Lcom/google/android/gms/internal/ads/zzanz;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic zzh(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaii;->zzpl()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaim;->zzcnb:Lcom/google/android/gms/internal/ads/zzanz;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
