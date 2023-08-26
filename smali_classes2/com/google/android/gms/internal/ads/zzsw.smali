.class final Lcom/google/android/gms/internal/ads/zzsw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzts;


# instance fields
.field private final synthetic zzbnx:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzsu;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzsw;->zzbnx:I

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

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zztt;->zzxs:Lcom/google/android/gms/internal/ads/zzkh;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zztt;->zzxs:Lcom/google/android/gms/internal/ads/zzkh;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsw;->zzbnx:I

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzkh;->onAdFailedToLoad(I)V

    :cond_0
    return-void
.end method
