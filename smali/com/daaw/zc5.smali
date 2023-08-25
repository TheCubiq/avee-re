.class public final synthetic Lcom/daaw/zc5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/bi5;

.field public final synthetic q:Lcom/daaw/ow8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bi5;Lcom/daaw/ow8;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zc5;->p:Lcom/daaw/bi5;

    iput-object p2, p0, Lcom/daaw/zc5;->q:Lcom/daaw/ow8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zc5;->p:Lcom/daaw/bi5;

    iget-object v1, p0, Lcom/daaw/zc5;->q:Lcom/daaw/ow8;

    invoke-virtual {v0}, Lcom/daaw/bi5;->a()I

    move-result v0

    iget-object v1, v1, Lcom/daaw/ow8;->a:Lcom/daaw/qw8;

    invoke-static {v1, v0}, Lcom/daaw/qw8;->e(Lcom/daaw/qw8;I)V

    return-void
.end method
