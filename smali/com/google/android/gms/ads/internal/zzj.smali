.class public final Lcom/google/android/gms/ads/internal/zzj;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/zzj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:Z

.field public final zzb:Z

.field public final zzc:Ljava/lang/String;

.field public final zzd:Z

.field public final zze:F

.field public final zzf:I

.field public final zzg:Z

.field public final zzh:Z

.field public final zzi:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/zzk;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/zzk;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/zzj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;ZFIZZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzj;->zza:Z

    iput-boolean p2, p0, Lcom/google/android/gms/ads/internal/zzj;->zzb:Z

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzj;->zzc:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/ads/internal/zzj;->zzd:Z

    iput p5, p0, Lcom/google/android/gms/ads/internal/zzj;->zze:F

    iput p6, p0, Lcom/google/android/gms/ads/internal/zzj;->zzf:I

    iput-boolean p7, p0, Lcom/google/android/gms/ads/internal/zzj;->zzg:Z

    iput-boolean p8, p0, Lcom/google/android/gms/ads/internal/zzj;->zzh:Z

    iput-boolean p9, p0, Lcom/google/android/gms/ads/internal/zzj;->zzi:Z

    return-void
.end method

.method public constructor <init>(ZZZFIZZZ)V
    .locals 10

    const/4 v3, 0x0

    const/4 v6, -0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/ads/internal/zzj;-><init>(ZZLjava/lang/String;ZFIZZZ)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zza:Z

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zzb:Z

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zzc:Ljava/lang/String;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zzd:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zze:F

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->h(Landroid/os/Parcel;IF)V

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zzf:I

    const/4 v1, 0x7

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->k(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zzg:Z

    const/16 v1, 0x8

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zzh:Z

    const/16 v1, 0x9

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzj;->zzi:Z

    const/16 v1, 0xa

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method
