.class public Landroidx/activity/result/a$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/c;

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/lifecycle/d;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Landroidx/activity/result/a$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/d;

    iget-object v2, p0, Landroidx/activity/result/a$c;->a:Landroidx/lifecycle/c;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/c;->c(Lcom/daaw/rj0;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/activity/result/a$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
