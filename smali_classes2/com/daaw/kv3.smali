.class public final Lcom/daaw/kv3;
.super Lcom/daaw/hc3;
.source ""

# interfaces
.implements Lcom/daaw/ox3;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.measurement.api.internal.IBundleReceiver"

    invoke-direct {p0, p1, v0}, Lcom/daaw/hc3;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final T0(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/hc3;->D()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/ne3;->e(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/hc3;->M(ILandroid/os/Parcel;)V

    return-void
.end method
