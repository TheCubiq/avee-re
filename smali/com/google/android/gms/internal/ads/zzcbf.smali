.class public final Lcom/google/android/gms/internal/ads/zzcbf;
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
            "Lcom/google/android/gms/internal/ads/zzcbf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:Landroid/content/pm/ApplicationInfo;

.field public final q:Ljava/lang/String;

.field public final r:Landroid/content/pm/PackageInfo;

.field public final s:Ljava/lang/String;

.field public final t:I

.field public final u:Ljava/lang/String;

.field public final v:Ljava/util/List;

.field public final w:Z

.field public final x:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/st3;

    invoke-direct {v0}, Lcom/daaw/st3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzcbf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Landroid/content/pm/PackageInfo;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbf;->q:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbf;->p:Landroid/content/pm/ApplicationInfo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcbf;->r:Landroid/content/pm/PackageInfo;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcbf;->s:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzcbf;->t:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzcbf;->u:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzcbf;->v:Ljava/util/List;

    iput-boolean p8, p0, Lcom/google/android/gms/internal/ads/zzcbf;->w:Z

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zzcbf;->x:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcbf;->p:Landroid/content/pm/ApplicationInfo;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/daaw/z71;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcbf;->q:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, v3}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcbf;->r:Landroid/content/pm/PackageInfo;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Lcom/daaw/z71;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbf;->s:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget p2, p0, Lcom/google/android/gms/internal/ads/zzcbf;->t:I

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Lcom/daaw/z71;->k(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbf;->u:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {p1, v1, p2, v3}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbf;->v:Ljava/util/List;

    const/4 v1, 0x7

    invoke-static {p1, v1, p2, v3}, Lcom/daaw/z71;->s(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcbf;->w:Z

    const/16 v1, 0x8

    invoke-static {p1, v1, p2}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcbf;->x:Z

    const/16 v1, 0x9

    invoke-static {p1, v1, p2}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method
