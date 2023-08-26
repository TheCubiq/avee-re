.class final Lcom/google/android/gms/internal/ads/zztp;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzts;


# instance fields
.field private final synthetic zzbnx:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzti;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/internal/ads/zztp;->zzbnx:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/ads/zztt;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zztt;->zzboh:Lcom/google/android/gms/internal/ads/zzahe;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zztt;->zzboh:Lcom/google/android/gms/internal/ads/zzahe;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zztp;->zzbnx:I

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzahe;->onRewardedVideoAdFailedToLoad(I)V

    :cond_0
    return-void
.end method
