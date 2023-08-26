.class final Lcom/google/android/gms/internal/ads/zzpf;
.super Ljava/lang/Object;


# instance fields
.field private final zzbjg:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;"
        }
    .end annotation
.end field

.field private zzbjh:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaqw;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpf;->zzbjg:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzpf;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpf;->zzbjh:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzpf;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzpf;->zzbjg:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzpf;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzpf;->zzbjh:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzacm;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzpg;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzpg;-><init>(Lcom/google/android/gms/internal/ads/zzpf;Lcom/google/android/gms/internal/ads/zzacm;)V

    const-string v1, "/loadHtml"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzacm;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzpi;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzpi;-><init>(Lcom/google/android/gms/internal/ads/zzpf;Lcom/google/android/gms/internal/ads/zzacm;)V

    const-string v1, "/showOverlay"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzacm;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzpj;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzpj;-><init>(Lcom/google/android/gms/internal/ads/zzpf;Lcom/google/android/gms/internal/ads/zzacm;)V

    const-string v1, "/hideOverlay"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzacm;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpf;->zzbjg:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzpk;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzpk;-><init>(Lcom/google/android/gms/internal/ads/zzpf;Lcom/google/android/gms/internal/ads/zzacm;)V

    const-string p1, "/sendMessageToSdk"

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_0
    return-void
.end method
