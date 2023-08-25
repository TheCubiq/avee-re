.class public Lcom/daaw/ch;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/xg$b;)Lcom/daaw/bh;
    .locals 1

    sget-object v0, Lcom/daaw/ch$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    new-instance p0, Lcom/daaw/s20;

    invoke-direct {p0}, Lcom/daaw/s20;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "wrong WHEEL_TYPE"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/daaw/dd1;

    invoke-direct {p0}, Lcom/daaw/dd1;-><init>()V

    return-object p0
.end method
