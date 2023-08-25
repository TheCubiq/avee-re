.class public final Lcom/google/android/gms/internal/ads/zzbro;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzbro;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:Z

.field public final q:Ljava/lang/String;

.field public final r:I

.field public final s:[B

.field public final t:[Ljava/lang/String;

.field public final u:[Ljava/lang/String;

.field public final v:Z

.field public final w:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/mi3;

    invoke-direct {v0}, Lcom/daaw/mi3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbro;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;I[B[Ljava/lang/String;[Ljava/lang/String;ZJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzbro;->p:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbro;->q:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbro;->r:I

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbro;->s:[B

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzbro;->t:[Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzbro;->u:[Ljava/lang/String;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/zzbro;->v:Z

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzbro;->w:J

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbro;->p:Z

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbro;->q:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbro;->r:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbro;->s:[B

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->f(Landroid/os/Parcel;I[BZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbro;->t:[Ljava/lang/String;

    const/4 v1, 0x5

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->r(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbro;->u:[Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->r(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbro;->v:Z

    const/4 v1, 0x7

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzbro;->w:J

    const/16 v2, 0x8

    invoke-static {p1, v2, v0, v1}, Lcom/daaw/z71;->n(Landroid/os/Parcel;IJ)V

    invoke-static {p1, p2}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method
