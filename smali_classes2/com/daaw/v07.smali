.class public final Lcom/daaw/v07;
.super Lcom/daaw/y22;
.source ""


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.appset.internal.IAppSetService"

    invoke-direct {p0, p1, v0}, Lcom/daaw/y22;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final M(Lcom/google/android/gms/appset/zza;Lcom/daaw/a86;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y22;->D()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/rr3;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lcom/daaw/rr3;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/y22;->I(ILandroid/os/Parcel;)V

    return-void
.end method
