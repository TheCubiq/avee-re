.class public abstract Lcom/daaw/yc0$a;
.super Landroid/os/Binder;
.source ""

# interfaces
.implements Lcom/daaw/yc0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/yc0$a$a;
    }
.end annotation


# direct methods
.method public static D(Landroid/os/IBinder;)Lcom/daaw/yc0;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "android.support.customtabs.ICustomTabsService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/daaw/yc0;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/yc0;

    return-object v0

    :cond_1
    new-instance v0, Lcom/daaw/yc0$a$a;

    invoke-direct {v0, p0}, Lcom/daaw/yc0$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static I()Lcom/daaw/yc0;
    .locals 1

    sget-object v0, Lcom/daaw/yc0$a$a;->q:Lcom/daaw/yc0;

    return-object v0
.end method
