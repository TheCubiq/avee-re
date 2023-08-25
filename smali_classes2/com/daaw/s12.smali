.class public final Lcom/daaw/s12;
.super Lcom/daaw/mz1;
.source ""


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lcom/daaw/mz1;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final g3(Lcom/google/android/gms/signin/internal/zai;Lcom/daaw/p12;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/mz1;->D()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/s02;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lcom/daaw/s02;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lcom/daaw/mz1;->I(ILandroid/os/Parcel;)V

    return-void
.end method
