.class public Lcom/daaw/e30;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "None"

    const-string v1, "Vortex"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/e30;->a:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/qd0;)Lcom/daaw/qd0;
    .locals 2

    invoke-static {p1}, Lcom/daaw/e30;->b(Lcom/daaw/qd0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const-string v0, "Vortex"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "None"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object p1

    :cond_1
    const/4 p0, 0x0

    return-object p0

    :cond_2
    new-instance p0, Lcom/daaw/aw1;

    invoke-direct {p0}, Lcom/daaw/aw1;-><init>()V

    return-object p0
.end method

.method public static b(Lcom/daaw/qd0;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, "None"

    return-object p0

    :cond_0
    instance-of p0, p0, Lcom/daaw/aw1;

    if-eqz p0, :cond_1

    const-string p0, "Vortex"

    return-object p0

    :cond_1
    const-string p0, "unknown instance type"

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const-string p0, "unk"

    return-object p0
.end method
