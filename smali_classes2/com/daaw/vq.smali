.class public final Lcom/daaw/vq;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Z

.field public static final b:Lcom/daaw/gs;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/dj1;->e(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/daaw/vq;->a:Z

    invoke-static {}, Lcom/daaw/vq;->b()Lcom/daaw/gs;

    move-result-object v0

    sput-object v0, Lcom/daaw/vq;->b:Lcom/daaw/gs;

    return-void
.end method

.method public static final a()Lcom/daaw/gs;
    .locals 1

    sget-object v0, Lcom/daaw/vq;->b:Lcom/daaw/gs;

    return-object v0
.end method

.method public static final b()Lcom/daaw/gs;
    .locals 2

    sget-boolean v0, Lcom/daaw/vq;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/daaw/uq;->v:Lcom/daaw/uq;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/daaw/gu;->b()Lcom/daaw/rm0;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/um0;->c(Lcom/daaw/rm0;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, Lcom/daaw/gs;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, Lcom/daaw/gs;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Lcom/daaw/uq;->v:Lcom/daaw/uq;

    :goto_1
    return-object v0
.end method
