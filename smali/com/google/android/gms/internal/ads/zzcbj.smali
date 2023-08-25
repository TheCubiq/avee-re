.class public final Lcom/google/android/gms/internal/ads/zzcbj;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzcbj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:Ljava/lang/String;

.field public final q:I

.field public final r:Landroid/os/Bundle;

.field public final s:[B

.field public final t:Z

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ut3;

    invoke-direct {v0}, Lcom/daaw/ut3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzcbj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroid/os/Bundle;[BZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbj;->p:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzcbj;->q:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcbj;->r:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcbj;->s:[B

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzcbj;->t:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzcbj;->u:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzcbj;->v:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbj;->p:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzcbj;->q:I

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbj;->r:Landroid/os/Bundle;

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbj;->s:[B

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->f(Landroid/os/Parcel;I[BZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcbj;->t:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbj;->u:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbj;->v:Ljava/lang/String;

    const/4 v1, 0x7

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method
