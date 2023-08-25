.class public Lcom/daaw/tc1$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/tc1;->c(Ljava/lang/String;)Lcom/daaw/me0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/r40<",
        "Lcom/daaw/lo1<",
        "Ljava/util/List<",
        "Lcom/daaw/h60;",
        ">;",
        "Lcom/daaw/wf1;",
        ">;",
        "Lcom/daaw/lo1<",
        "Ljava/util/List<",
        "Lcom/daaw/h60;",
        ">;",
        "Lcom/daaw/wf1;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tc1$g;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/lo1;

    invoke-virtual {p0, p1}, Lcom/daaw/tc1$g;->b(Lcom/daaw/lo1;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/lo1;)Lcom/daaw/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lo1<",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;",
            "Lcom/daaw/wf1;",
            ">;)",
            "Lcom/daaw/lo1<",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;",
            "Lcom/daaw/wf1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/tc1$g;->a:Ljava/lang/String;

    iget-object v1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/daaw/tc1;->b(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/tc1$g;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v1, v2}, Lcom/daaw/tc1;->a(Ljava/lang/String;Ljava/util/List;)Lcom/daaw/h60;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v1, Lcom/daaw/lo1;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/wf1;

    invoke-direct {v1, v0, p1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
