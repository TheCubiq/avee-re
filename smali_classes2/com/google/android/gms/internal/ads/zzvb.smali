.class final Lcom/google/android/gms/internal/ads/zzvb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbpt:Ljava/lang/String;

.field private final synthetic zzbpu:Lcom/google/android/gms/internal/ads/zzuw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzuw;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvb;->zzbpu:Lcom/google/android/gms/internal/ads/zzuw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvb;->zzbpt:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvb;->zzbpu:Lcom/google/android/gms/internal/ads/zzuw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzuw;->zza(Lcom/google/android/gms/internal/ads/zzuw;)Lcom/google/android/gms/internal/ads/zzaqw;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvb;->zzbpt:Ljava/lang/String;

    const-string v2, "text/html"

    const-string v3, "UTF-8"

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzaqw;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
