.class public final Lcom/daaw/qm6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/gm6;

.field public final synthetic b:Lcom/daaw/vm6;


# direct methods
.method public constructor <init>(Lcom/daaw/vm6;Lcom/daaw/gm6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qm6;->b:Lcom/daaw/vm6;

    iput-object p2, p0, Lcom/daaw/qm6;->a:Lcom/daaw/gm6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/qm6;->b:Lcom/daaw/vm6;

    iget-object p1, p1, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    invoke-static {p1}, Lcom/daaw/wm6;->c(Lcom/daaw/wm6;)Lcom/daaw/xm6;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/qm6;->a:Lcom/daaw/gm6;

    invoke-interface {p1, v0}, Lcom/daaw/xm6;->T(Lcom/daaw/gm6;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qm6;->b:Lcom/daaw/vm6;

    iget-object v0, v0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    invoke-static {v0}, Lcom/daaw/wm6;->c(Lcom/daaw/wm6;)Lcom/daaw/xm6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/qm6;->a:Lcom/daaw/gm6;

    invoke-interface {v0, v1, p1}, Lcom/daaw/xm6;->M(Lcom/daaw/gm6;Ljava/lang/Throwable;)V

    return-void
.end method
