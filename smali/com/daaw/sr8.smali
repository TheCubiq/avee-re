.class public final synthetic Lcom/daaw/sr8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/yr8;

.field public final synthetic q:Lcom/daaw/zr8;

.field public final synthetic r:Lcom/daaw/lr8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yr8;Lcom/daaw/zr8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sr8;->p:Lcom/daaw/yr8;

    iput-object p2, p0, Lcom/daaw/sr8;->q:Lcom/daaw/zr8;

    iput-object p3, p0, Lcom/daaw/sr8;->r:Lcom/daaw/lr8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/sr8;->p:Lcom/daaw/yr8;

    iget-object v1, p0, Lcom/daaw/sr8;->q:Lcom/daaw/zr8;

    iget-object v2, p0, Lcom/daaw/sr8;->r:Lcom/daaw/lr8;

    iget v3, v0, Lcom/daaw/yr8;->a:I

    iget-object v0, v0, Lcom/daaw/yr8;->b:Lcom/daaw/pr8;

    invoke-interface {v1, v3, v0, v2}, Lcom/daaw/zr8;->d(ILcom/daaw/pr8;Lcom/daaw/lr8;)V

    return-void
.end method
