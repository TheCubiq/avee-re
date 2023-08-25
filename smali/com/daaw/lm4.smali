.class public final Lcom/daaw/lm4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/o67;

.field public final synthetic b:Lcom/daaw/qm4;


# direct methods
.method public constructor <init>(Lcom/daaw/qm4;Lcom/daaw/o67;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lm4;->b:Lcom/daaw/qm4;

    iput-object p2, p0, Lcom/daaw/lm4;->a:Lcom/daaw/o67;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/daaw/gm4;

    iget-object v0, p0, Lcom/daaw/lm4;->b:Lcom/daaw/qm4;

    iget-object p1, p1, Lcom/daaw/gm4;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/lm4;->a:Lcom/daaw/o67;

    invoke-static {v0, p1, v1}, Lcom/daaw/qm4;->b(Lcom/daaw/qm4;Ljava/util/List;Lcom/daaw/o67;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lm4;->a:Lcom/daaw/o67;

    invoke-interface {v0, p1}, Lcom/daaw/o67;->b(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/daaw/lm4;->b:Lcom/daaw/qm4;

    invoke-static {p1}, Lcom/daaw/qm4;->c(Lcom/daaw/qm4;)V

    return-void
.end method
