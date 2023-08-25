.class public Lcom/daaw/ti$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wc0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ti;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public p:I

.field public final synthetic q:Lcom/daaw/ti;


# direct methods
.method public constructor <init>(Lcom/daaw/ti;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ti$c;->q:Lcom/daaw/ti;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/ti$c;->p:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ti$c;->q:Lcom/daaw/ti;

    invoke-static {v0}, Lcom/daaw/ti;->k(Lcom/daaw/ti;)Lcom/daaw/wc0$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/daaw/ti$c;->p:I

    invoke-static {v2}, Lcom/daaw/ti;->v(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/daaw/wc0$b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/daaw/qw1$a;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/qw1$a<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ti$c;->q:Lcom/daaw/ti;

    invoke-static {v0}, Lcom/daaw/ti;->k(Lcom/daaw/ti;)Lcom/daaw/wc0$b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/wc0$b;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ti$c;->q:Lcom/daaw/ti;

    invoke-static {v0}, Lcom/daaw/ti;->k(Lcom/daaw/ti;)Lcom/daaw/wc0$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/wc0$b;->c()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ti$c;->q:Lcom/daaw/ti;

    invoke-static {v0}, Lcom/daaw/ti;->k(Lcom/daaw/ti;)Lcom/daaw/wc0$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/wc0$b;->d()I

    move-result v0

    return v0
.end method

.method public e(Lcom/daaw/qw1$a;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/qw1$a<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ti$c;->q:Lcom/daaw/ti;

    invoke-static {v0}, Lcom/daaw/ti;->k(Lcom/daaw/ti;)Lcom/daaw/wc0$b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/wc0$b;->e(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ti$c;->q:Lcom/daaw/ti;

    invoke-static {v0}, Lcom/daaw/ti;->k(Lcom/daaw/ti;)Lcom/daaw/wc0$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/daaw/ti$c;->p:I

    invoke-static {v2}, Lcom/daaw/ti;->v(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/daaw/wc0$b;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/daaw/qw1$a;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/qw1$a<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ti$c;->q:Lcom/daaw/ti;

    invoke-static {v0}, Lcom/daaw/ti;->k(Lcom/daaw/ti;)Lcom/daaw/wc0$b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/wc0$b;->g(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method
