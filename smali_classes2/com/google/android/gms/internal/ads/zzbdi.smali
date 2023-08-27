.class final Lcom/google/android/gms/internal/ads/zzbdi;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcs;


# instance fields
.field private final info:Ljava/lang/String;

.field private final zzdwl:Lcom/google/android/gms/internal/ads/zzbcu;

.field private final zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbcu;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdwl:Lcom/google/android/gms/internal/ads/zzbcu;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbdi;->info:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzbdj;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    return-void
.end method


# virtual methods
.method public final getFieldCount()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzd(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    return v0
.end method

.method public final zzaeh()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zza(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    sget v0, Lcom/google/android/gms/internal/ads/zzbbo$zze;->zzdui:I

    return v0

    :cond_0
    sget v0, Lcom/google/android/gms/internal/ads/zzbbo$zze;->zzduj:I

    return v0
.end method

.method public final zzaei()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zza(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzaej()Lcom/google/android/gms/internal/ads/zzbcu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdwl:Lcom/google/android/gms/internal/ads/zzbcu;

    return-object v0
.end method

.method final zzaeq()Lcom/google/android/gms/internal/ads/zzbdj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    return-object v0
.end method

.method public final zzaer()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzb(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    return v0
.end method

.method public final zzaes()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzc(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    return v0
.end method

.method public final zzaet()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zze(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    return v0
.end method

.method public final zzaeu()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzf(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    return v0
.end method

.method final zzaev()[I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzg(Lcom/google/android/gms/internal/ads/zzbdj;)[I

    move-result-object v0

    return-object v0
.end method

.method public final zzaew()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzh(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    return v0
.end method

.method public final zzaex()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdi;->zzdxe:Lcom/google/android/gms/internal/ads/zzbdj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzi(Lcom/google/android/gms/internal/ads/zzbdj;)I

    move-result v0

    return v0
.end method
