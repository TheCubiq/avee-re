.class public Lcom/daaw/y2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "unset"

    const-string v1, "start"

    const-string v2, "center"

    const-string v3, "end"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/y2;->a:[Ljava/lang/String;

    return-void
.end method

.method public static a(II)Ljava/lang/String;
    .locals 7

    const-string v0, "unset"

    if-eqz p0, :cond_7

    const-string v1, "start"

    const/4 v2, 0x1

    if-eq p0, v2, :cond_6

    const-string v3, "center"

    const/4 v4, 0x2

    if-eq p0, v4, :cond_5

    const-string v5, "end"

    const/4 v6, 0x3

    if-eq p0, v6, :cond_4

    if-eqz p1, :cond_3

    if-eq p1, v2, :cond_2

    if-eq p1, v4, :cond_1

    if-eq p1, v6, :cond_0

    const-string p0, "unknown instance type"

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object v0

    :cond_0
    return-object v5

    :cond_1
    return-object v3

    :cond_2
    return-object v1

    :cond_3
    return-object v0

    :cond_4
    return-object v5

    :cond_5
    return-object v3

    :cond_6
    return-object v1

    :cond_7
    return-object v0
.end method
