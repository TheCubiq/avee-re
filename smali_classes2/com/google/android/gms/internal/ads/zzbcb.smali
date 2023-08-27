.class public Lcom/google/android/gms/internal/ads/zzbcb;
.super Ljava/lang/Object;


# static fields
.field private static final zzdph:Lcom/google/android/gms/internal/ads/zzbbb;


# instance fields
.field private zzdvk:Lcom/google/android/gms/internal/ads/zzbah;

.field private volatile zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

.field private volatile zzdvm:Lcom/google/android/gms/internal/ads/zzbah;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbb;->zzacr()Lcom/google/android/gms/internal/ads/zzbbb;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdph:Lcom/google/android/gms/internal/ads/zzbbb;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final zzk(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpq:Lcom/google/android/gms/internal/ads/zzbah;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzbbu; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbah;->zzdpq:Lcom/google/android/gms/internal/ads/zzbah;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    return-object p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbcb;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbcb;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbcb;->zzaav()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbcb;->zzaav()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbah;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbcu;->zzadg()Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/zzbcb;->zzk(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzbcu;->zzadg()Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbcb;->zzk(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzaav()Lcom/google/android/gms/internal/ads/zzbah;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpq:Lcom/google/android/gms/internal/ads/zzbah;

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbcu;->zzaav()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public final zzacw()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbah;->size()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbcu;->zzacw()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final zzl(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvk:Lcom/google/android/gms/internal/ads/zzbah;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvm:Lcom/google/android/gms/internal/ads/zzbah;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcb;->zzdvl:Lcom/google/android/gms/internal/ads/zzbcu;

    return-object v0
.end method
