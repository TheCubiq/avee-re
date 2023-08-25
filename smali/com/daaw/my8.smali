.class public abstract Lcom/daaw/my8;
.super Lcom/daaw/wx2;
.source ""

# interfaces
.implements Lcom/daaw/tz8;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.ICertData"

    invoke-direct {p0, v0}, Lcom/daaw/wx2;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static I(Landroid/os/IBinder;)Lcom/daaw/tz8;
    .locals 2

    const-string v0, "com.google.android.gms.common.internal.ICertData"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/tz8;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/tz8;

    return-object v0

    :cond_0
    new-instance v0, Lcom/daaw/gx8;

    invoke-direct {v0, p0}, Lcom/daaw/gx8;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public final D(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p4, 0x2

    if-eq p1, p4, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p0}, Lcom/daaw/tz8;->zzc()I

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lcom/daaw/tz8;->zzd()Lcom/daaw/yd0;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    :goto_0
    return p2
.end method
