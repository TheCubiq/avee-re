.class public final Lcom/daaw/ou0;
.super Lcom/daaw/oy1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ou0$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/daaw/ou0$a;)V
    .locals 2

    iget-object v0, p1, Lcom/daaw/oy1$a;->b:Ljava/util/UUID;

    iget-object v1, p1, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    iget-object p1, p1, Lcom/daaw/oy1$a;->d:Ljava/util/Set;

    invoke-direct {p0, v0, v1, p1}, Lcom/daaw/oy1;-><init>(Ljava/util/UUID;Lcom/daaw/qy1;Ljava/util/Set;)V

    return-void
.end method

.method public static d(Ljava/lang/Class;)Lcom/daaw/ou0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)",
            "Lcom/daaw/ou0;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/ou0$a;

    invoke-direct {v0, p0}, Lcom/daaw/ou0$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lcom/daaw/oy1$a;->b()Lcom/daaw/oy1;

    move-result-object p0

    check-cast p0, Lcom/daaw/ou0;

    return-object p0
.end method
