.class public Lcom/daaw/mk$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/mk$a;->c(Lcom/daaw/yj;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ir1$b<",
        "Lcom/daaw/lo1<",
        "Ljava/util/List<",
        "Lcom/daaw/h60;",
        ">;",
        "Lcom/daaw/wf1;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yj;

.field public final synthetic b:Lcom/daaw/mk$a;


# direct methods
.method public constructor <init>(Lcom/daaw/mk$a;Lcom/daaw/yj;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mk$a$a;->b:Lcom/daaw/mk$a;

    iput-object p2, p0, Lcom/daaw/mk$a$a;->a:Lcom/daaw/yj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Lcom/daaw/lo1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/mk$a$a;->b(Lcom/daaw/lo1;Z)V

    return-void
.end method

.method public b(Lcom/daaw/lo1;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lo1<",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;",
            "Lcom/daaw/wf1;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/wf1;

    invoke-virtual {v1}, Lcom/daaw/wf1;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p2, p0, Lcom/daaw/mk$a$a;->a:Lcom/daaw/yj;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/wf1;

    invoke-virtual {p1}, Lcom/daaw/wf1;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/yj;->O(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/mk$a$a;->a:Lcom/daaw/yj;

    invoke-virtual {p1, p2}, Lcom/daaw/yj;->O(Ljava/lang/String;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/daaw/mk$a$a;->a:Lcom/daaw/yj;

    invoke-virtual {p1, p2}, Lcom/daaw/yj;->O(Ljava/lang/String;)V

    :goto_1
    if-nez p2, :cond_3

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    iget-object p1, p0, Lcom/daaw/mk$a$a;->b:Lcom/daaw/mk$a;

    invoke-static {p1, p2}, Lcom/daaw/mk$a;->b(Lcom/daaw/mk$a;Ljava/util/List;)Ljava/util/List;

    iget-object p1, p0, Lcom/daaw/mk$a$a;->a:Lcom/daaw/yj;

    invoke-virtual {p1}, Lcom/daaw/yj;->A()Z

    return-void
.end method
