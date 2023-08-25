.class public final Lcom/daaw/s31;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/s31$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/daaw/s31;)Landroid/app/RemoteInput;
    .locals 0

    invoke-static {p0}, Lcom/daaw/s31$a;->b(Lcom/daaw/s31;)Landroid/app/RemoteInput;

    move-result-object p0

    return-object p0
.end method

.method public static b([Lcom/daaw/s31;)[Landroid/app/RemoteInput;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    array-length v1, p0

    new-array v1, v1, [Landroid/app/RemoteInput;

    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_1

    aget-object v3, p0, v2

    invoke-static {v0}, Lcom/daaw/s31;->a(Lcom/daaw/s31;)Landroid/app/RemoteInput;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method
