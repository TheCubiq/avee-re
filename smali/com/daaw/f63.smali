.class public final Lcom/daaw/f63;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/os7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/d63;

    invoke-direct {v0}, Lcom/daaw/d63;-><init>()V

    sput-object v0, Lcom/daaw/f63;->a:Lcom/daaw/os7;

    return-void
.end method

.method public static a(I)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    const/4 v1, 0x2

    if-eq p0, v0, :cond_2

    if-eq p0, v1, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x5

    return p0

    :cond_1
    const/4 p0, 0x3

    return p0

    :cond_2
    return v1

    :cond_3
    return v0
.end method
