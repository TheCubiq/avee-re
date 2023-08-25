.class public final synthetic Lcom/daaw/tr8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/yr8;

.field public final synthetic q:Lcom/daaw/zr8;

.field public final synthetic r:Lcom/daaw/ar8;

.field public final synthetic s:Lcom/daaw/lr8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yr8;Lcom/daaw/zr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tr8;->p:Lcom/daaw/yr8;

    iput-object p2, p0, Lcom/daaw/tr8;->q:Lcom/daaw/zr8;

    iput-object p3, p0, Lcom/daaw/tr8;->r:Lcom/daaw/ar8;

    iput-object p4, p0, Lcom/daaw/tr8;->s:Lcom/daaw/lr8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/tr8;->p:Lcom/daaw/yr8;

    iget-object v1, p0, Lcom/daaw/tr8;->q:Lcom/daaw/zr8;

    iget-object v2, p0, Lcom/daaw/tr8;->r:Lcom/daaw/ar8;

    iget-object v3, p0, Lcom/daaw/tr8;->s:Lcom/daaw/lr8;

    iget v4, v0, Lcom/daaw/yr8;->a:I

    iget-object v0, v0, Lcom/daaw/yr8;->b:Lcom/daaw/pr8;

    invoke-interface {v1, v4, v0, v2, v3}, Lcom/daaw/zr8;->W(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    return-void
.end method
