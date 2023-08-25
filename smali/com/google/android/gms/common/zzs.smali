.class public final Lcom/google/android/gms/common/zzs;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/zzs;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:Ljava/lang/String;

.field public final q:Lcom/daaw/l68;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final r:Z

.field public final s:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/gs8;

    invoke-direct {v0}, Lcom/daaw/gs8;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/zzs;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/IBinder;ZZ)V
    .locals 0
    .param p2    # Landroid/os/IBinder;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/zzs;->p:Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/daaw/my8;->I(Landroid/os/IBinder;)Lcom/daaw/tz8;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/tz8;->zzd()Lcom/daaw/yd0;

    move-result-object p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p2, :cond_1

    move-object p2, p1

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    :goto_0
    if-eqz p2, :cond_2

    new-instance p1, Lcom/daaw/m98;

    invoke-direct {p1, p2}, Lcom/daaw/m98;-><init>([B)V

    :catch_0
    :cond_2
    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/common/zzs;->q:Lcom/daaw/l68;

    iput-boolean p3, p0, Lcom/google/android/gms/common/zzs;->r:Z

    iput-boolean p4, p0, Lcom/google/android/gms/common/zzs;->s:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/l68;ZZ)V
    .locals 0
    .param p2    # Lcom/daaw/l68;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/zzs;->p:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/common/zzs;->q:Lcom/daaw/l68;

    iput-boolean p3, p0, Lcom/google/android/gms/common/zzs;->r:Z

    iput-boolean p4, p0, Lcom/google/android/gms/common/zzs;->s:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/common/zzs;->p:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/common/zzs;->q:Lcom/daaw/l68;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    const/4 v1, 0x2

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/google/android/gms/common/zzs;->r:Z

    invoke-static {p1, v0, v1}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    iget-boolean v1, p0, Lcom/google/android/gms/common/zzs;->s:Z

    invoke-static {p1, v0, v1}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method
