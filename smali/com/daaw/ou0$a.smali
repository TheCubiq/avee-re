.class public final Lcom/daaw/ou0$a;
.super Lcom/daaw/oy1$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ou0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/oy1$a<",
        "Lcom/daaw/ou0$a;",
        "Lcom/daaw/ou0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/daaw/oy1$a;-><init>(Ljava/lang/Class;)V

    iget-object p1, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    const-class v0, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/daaw/qy1;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Lcom/daaw/oy1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ou0$a;->g()Lcom/daaw/ou0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/daaw/oy1$a;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ou0$a;->h()Lcom/daaw/ou0$a;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/daaw/ou0;
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/oy1$a;->a:Z

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    iget-object v0, v0, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {v0}, Lcom/daaw/sj;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set backoff criteria on an idle mode job"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lcom/daaw/ou0;

    invoke-direct {v0, p0}, Lcom/daaw/ou0;-><init>(Lcom/daaw/ou0$a;)V

    return-object v0
.end method

.method public h()Lcom/daaw/ou0$a;
    .locals 0

    return-object p0
.end method
