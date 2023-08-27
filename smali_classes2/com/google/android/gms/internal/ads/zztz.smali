.class final Lcom/google/android/gms/internal/ads/zztz;
.super Ljava/lang/Object;


# instance fields
.field zzbor:Lcom/google/android/gms/ads/internal/zzal;

.field zzbos:Lcom/google/android/gms/internal/ads/zzjj;

.field zzbot:Lcom/google/android/gms/internal/ads/zzst;

.field zzbou:J

.field zzbov:Z

.field private final synthetic zzbow:Lcom/google/android/gms/internal/ads/zzty;

.field zzwa:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzty;Lcom/google/android/gms/internal/ads/zzss;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbow:Lcom/google/android/gms/internal/ads/zzty;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzty;->zza(Lcom/google/android/gms/internal/ads/zzty;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzss;->zzaw(Ljava/lang/String;)Lcom/google/android/gms/ads/internal/zzal;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzst;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzst;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbot:Lcom/google/android/gms/internal/ads/zzst;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzsu;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzsu;-><init>(Lcom/google/android/gms/internal/ads/zzst;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/zzkh;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zztc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zztc;-><init>(Lcom/google/android/gms/internal/ads/zzst;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/zzla;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzte;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzte;-><init>(Lcom/google/android/gms/internal/ads/zzst;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/zzod;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zztg;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zztg;-><init>(Lcom/google/android/gms/internal/ads/zzst;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/zzke;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzti;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzti;-><init>(Lcom/google/android/gms/internal/ads/zzst;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/zzahe;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ads/zzty;Lcom/google/android/gms/internal/ads/zzss;Lcom/google/android/gms/internal/ads/zzjj;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zztz;-><init>(Lcom/google/android/gms/internal/ads/zzty;Lcom/google/android/gms/internal/ads/zzss;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbos:Lcom/google/android/gms/internal/ads/zzjj;

    return-void
.end method


# virtual methods
.method final load()Z
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztz;->zzwa:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbos:Lcom/google/android/gms/internal/ads/zzjj;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbow:Lcom/google/android/gms/internal/ads/zzty;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzty;->zzb(Lcom/google/android/gms/internal/ads/zzty;)Lcom/google/android/gms/internal/ads/zzjj;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zztw;->zzi(Lcom/google/android/gms/internal/ads/zzjj;)Lcom/google/android/gms/internal/ads/zzjj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbor:Lcom/google/android/gms/ads/internal/zzal;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbov:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztz;->zzwa:Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzer()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zztz;->zzbou:J

    return v0
.end method
