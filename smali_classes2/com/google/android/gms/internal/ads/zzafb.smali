.class final Lcom/google/android/gms/internal/ads/zzafb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzcgj:Lcom/google/android/gms/internal/ads/zzafa;

.field private final synthetic zzwg:Lcom/google/android/gms/internal/ads/zzaji;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzafa;Lcom/google/android/gms/internal/ads/zzaji;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafb;->zzcgj:Lcom/google/android/gms/internal/ads/zzafa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzafb;->zzwg:Lcom/google/android/gms/internal/ads/zzaji;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafb;->zzcgj:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzafa;->zza(Lcom/google/android/gms/internal/ads/zzafa;)Lcom/google/android/gms/internal/ads/zzadj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzafb;->zzwg:Lcom/google/android/gms/internal/ads/zzaji;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzadj;->zza(Lcom/google/android/gms/internal/ads/zzaji;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafb;->zzcgj:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzafa;->zzb(Lcom/google/android/gms/internal/ads/zzafa;)Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafb;->zzcgj:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzafa;->zzb(Lcom/google/android/gms/internal/ads/zzafa;)Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvs;->release()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafb;->zzcgj:Lcom/google/android/gms/internal/ads/zzafa;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzafa;->zza(Lcom/google/android/gms/internal/ads/zzafa;Lcom/google/android/gms/internal/ads/zzvs;)Lcom/google/android/gms/internal/ads/zzvs;

    :cond_0
    return-void
.end method
