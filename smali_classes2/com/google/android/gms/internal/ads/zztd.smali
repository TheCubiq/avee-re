.class final Lcom/google/android/gms/internal/ads/zztd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzts;


# instance fields
.field private final synthetic val$name:Ljava/lang/String;

.field private final synthetic zzbny:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zztc;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztd;->val$name:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztd;->zzbny:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/ads/zztt;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zztt;->zzboe:Lcom/google/android/gms/internal/ads/zzla;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zztt;->zzboe:Lcom/google/android/gms/internal/ads/zzla;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztd;->val$name:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztd;->zzbny:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzla;->onAppEvent(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
