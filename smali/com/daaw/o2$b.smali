.class public final Lcom/daaw/o2$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/o2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/o2$c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/nl1$b;

.field public c:Lcom/daaw/o2$c;

.field public d:Lcom/daaw/o2$c;

.field public e:Lcom/daaw/nl1;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    new-instance v0, Lcom/daaw/nl1$b;

    invoke-direct {v0}, Lcom/daaw/nl1$b;-><init>()V

    iput-object v0, p0, Lcom/daaw/o2$b;->b:Lcom/daaw/nl1$b;

    sget-object v0, Lcom/daaw/nl1;->a:Lcom/daaw/nl1;

    iput-object v0, p0, Lcom/daaw/o2$b;->e:Lcom/daaw/nl1;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/o2$b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/daaw/o2$c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2$b;->c:Lcom/daaw/o2$c;

    return-object v0
.end method

.method public c()Lcom/daaw/o2$c;
    .locals 2

    iget-object v0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/o2$c;

    :goto_0
    return-object v0
.end method

.method public d()Lcom/daaw/o2$c;
    .locals 2

    iget-object v0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/o2$b;->e:Lcom/daaw/nl1;

    invoke-virtual {v0}, Lcom/daaw/nl1;->o()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/o2$b;->f:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/o2$c;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public e()Lcom/daaw/o2$c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o2$b;->d:Lcom/daaw/o2$c;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/o2$b;->f:Z

    return v0
.end method

.method public g(ILcom/daaw/bp0$a;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    new-instance v1, Lcom/daaw/o2$c;

    invoke-direct {v1, p1, p2}, Lcom/daaw/o2$c;-><init>(ILcom/daaw/bp0$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/daaw/o2$b;->e:Lcom/daaw/nl1;

    invoke-virtual {p1}, Lcom/daaw/nl1;->o()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/o2$b;->o()V

    :cond_0
    return-void
.end method

.method public h(ILcom/daaw/bp0$a;)V
    .locals 1

    new-instance v0, Lcom/daaw/o2$c;

    invoke-direct {v0, p1, p2}, Lcom/daaw/o2$c;-><init>(ILcom/daaw/bp0$a;)V

    iget-object p1, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/o2$b;->d:Lcom/daaw/o2$c;

    invoke-virtual {v0, p1}, Lcom/daaw/o2$c;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/o2$c;

    :goto_0
    iput-object p1, p0, Lcom/daaw/o2$b;->d:Lcom/daaw/o2$c;

    :cond_1
    return-void
.end method

.method public i(I)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/o2$b;->o()V

    return-void
.end method

.method public j(ILcom/daaw/bp0$a;)V
    .locals 1

    new-instance v0, Lcom/daaw/o2$c;

    invoke-direct {v0, p1, p2}, Lcom/daaw/o2$c;-><init>(ILcom/daaw/bp0$a;)V

    iput-object v0, p0, Lcom/daaw/o2$b;->d:Lcom/daaw/o2$c;

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/o2$b;->f:Z

    invoke-virtual {p0}, Lcom/daaw/o2$b;->o()V

    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/o2$b;->f:Z

    return-void
.end method

.method public m(Lcom/daaw/nl1;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/o2$c;

    invoke-virtual {p0, v2, p1}, Lcom/daaw/o2$b;->p(Lcom/daaw/o2$c;Lcom/daaw/nl1;)Lcom/daaw/o2$c;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/o2$b;->d:Lcom/daaw/o2$c;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/o2$b;->p(Lcom/daaw/o2$c;Lcom/daaw/nl1;)Lcom/daaw/o2$c;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/o2$b;->d:Lcom/daaw/o2$c;

    :cond_1
    iput-object p1, p0, Lcom/daaw/o2$b;->e:Lcom/daaw/nl1;

    invoke-virtual {p0}, Lcom/daaw/o2$b;->o()V

    return-void
.end method

.method public n(I)Lcom/daaw/bp0$a;
    .locals 8

    iget-object v0, p0, Lcom/daaw/o2$b;->e:Lcom/daaw/nl1;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/daaw/nl1;->h()I

    move-result v0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    iget-object v4, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_2

    iget-object v4, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/o2$c;

    iget-object v5, v4, Lcom/daaw/o2$c;->b:Lcom/daaw/bp0$a;

    iget v5, v5, Lcom/daaw/bp0$a;->a:I

    if-ge v5, v0, :cond_1

    iget-object v6, p0, Lcom/daaw/o2$b;->e:Lcom/daaw/nl1;

    iget-object v7, p0, Lcom/daaw/o2$b;->b:Lcom/daaw/nl1$b;

    invoke-virtual {v6, v5, v7}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object v5

    iget v5, v5, Lcom/daaw/nl1$b;->c:I

    if-ne v5, p1, :cond_1

    if-eqz v3, :cond_0

    return-object v1

    :cond_0
    iget-object v3, v4, Lcom/daaw/o2$c;->b:Lcom/daaw/bp0$a;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move-object v1, v3

    :cond_3
    return-object v1
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/o2$b;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/o2$c;

    iput-object v0, p0, Lcom/daaw/o2$b;->c:Lcom/daaw/o2$c;

    :cond_0
    return-void
.end method

.method public final p(Lcom/daaw/o2$c;Lcom/daaw/nl1;)Lcom/daaw/o2$c;
    .locals 4

    invoke-virtual {p2}, Lcom/daaw/nl1;->o()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/o2$b;->e:Lcom/daaw/nl1;

    invoke-virtual {v0}, Lcom/daaw/nl1;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/o2$b;->e:Lcom/daaw/nl1;

    iget-object v1, p1, Lcom/daaw/o2$c;->b:Lcom/daaw/bp0$a;

    iget v1, v1, Lcom/daaw/bp0$a;->a:I

    iget-object v2, p0, Lcom/daaw/o2$b;->b:Lcom/daaw/nl1$b;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    invoke-virtual {p2, v0}, Lcom/daaw/nl1;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    return-object p1

    :cond_1
    iget-object v1, p0, Lcom/daaw/o2$b;->b:Lcom/daaw/nl1$b;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object p2

    iget p2, p2, Lcom/daaw/nl1$b;->c:I

    new-instance v1, Lcom/daaw/o2$c;

    iget-object p1, p1, Lcom/daaw/o2$c;->b:Lcom/daaw/bp0$a;

    invoke-virtual {p1, v0}, Lcom/daaw/bp0$a;->a(I)Lcom/daaw/bp0$a;

    move-result-object p1

    invoke-direct {v1, p2, p1}, Lcom/daaw/o2$c;-><init>(ILcom/daaw/bp0$a;)V

    return-object v1

    :cond_2
    :goto_0
    return-object p1
.end method
