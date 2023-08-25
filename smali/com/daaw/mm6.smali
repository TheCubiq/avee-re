.class public final synthetic Lcom/daaw/mm6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vm6;

.field public final synthetic q:Lcom/daaw/gm6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vm6;Lcom/daaw/gm6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mm6;->p:Lcom/daaw/vm6;

    iput-object p2, p0, Lcom/daaw/mm6;->q:Lcom/daaw/gm6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mm6;->p:Lcom/daaw/vm6;

    iget-object v1, p0, Lcom/daaw/mm6;->q:Lcom/daaw/gm6;

    iget-object v0, v0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    invoke-static {v0}, Lcom/daaw/wm6;->c(Lcom/daaw/wm6;)Lcom/daaw/xm6;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/daaw/xm6;->d0(Lcom/daaw/gm6;)V

    return-void
.end method
