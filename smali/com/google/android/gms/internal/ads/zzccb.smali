.class public final Lcom/google/android/gms/internal/ads/zzccb;
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
            "Lcom/google/android/gms/internal/ads/zzccb;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Z

.field public final p:Landroid/os/Bundle;

.field public final q:Lcom/google/android/gms/internal/ads/zzchu;

.field public final r:Landroid/content/pm/ApplicationInfo;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/util/List;

.field public final u:Landroid/content/pm/PackageInfo;

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public x:Lcom/google/android/gms/internal/ads/zzfkz;

.field public y:Ljava/lang/String;

.field public final z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/nu3;

    invoke-direct {v0}, Lcom/daaw/nu3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzccb;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzchu;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfkz;Ljava/lang/String;ZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzccb;->q:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzccb;->s:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzccb;->r:Landroid/content/pm/ApplicationInfo;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzccb;->t:Ljava/util/List;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzccb;->u:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzccb;->v:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzccb;->w:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzccb;->x:Lcom/google/android/gms/internal/ads/zzfkz;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzccb;->y:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/internal/ads/zzccb;->z:Z

    iput-boolean p12, p0, Lcom/google/android/gms/internal/ads/zzccb;->A:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lcom/daaw/z71;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->q:Lcom/google/android/gms/internal/ads/zzchu;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Lcom/daaw/z71;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->r:Landroid/content/pm/ApplicationInfo;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Lcom/daaw/z71;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->s:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->t:Ljava/util/List;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Lcom/daaw/z71;->s(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->u:Landroid/content/pm/PackageInfo;

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, p2, v3}, Lcom/daaw/z71;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->v:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->w:Ljava/lang/String;

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, v3}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccb;->x:Lcom/google/android/gms/internal/ads/zzfkz;

    const/16 v2, 0xa

    invoke-static {p1, v2, v1, p2, v3}, Lcom/daaw/z71;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzccb;->y:Ljava/lang/String;

    const/16 v1, 0xb

    invoke-static {p1, v1, p2, v3}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzccb;->z:Z

    const/16 v1, 0xc

    invoke-static {p1, v1, p2}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzccb;->A:Z

    const/16 v1, 0xd

    invoke-static {p1, v1, p2}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method
