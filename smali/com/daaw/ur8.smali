.class public final synthetic Lcom/daaw/ur8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/yr8;

.field public final synthetic q:Lcom/daaw/zr8;

.field public final synthetic r:Lcom/daaw/ar8;

.field public final synthetic s:Lcom/daaw/lr8;

.field public final synthetic t:Ljava/io/IOException;

.field public final synthetic u:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yr8;Lcom/daaw/zr8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ur8;->p:Lcom/daaw/yr8;

    iput-object p2, p0, Lcom/daaw/ur8;->q:Lcom/daaw/zr8;

    iput-object p3, p0, Lcom/daaw/ur8;->r:Lcom/daaw/ar8;

    iput-object p4, p0, Lcom/daaw/ur8;->s:Lcom/daaw/lr8;

    iput-object p5, p0, Lcom/daaw/ur8;->t:Ljava/io/IOException;

    iput-boolean p6, p0, Lcom/daaw/ur8;->u:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/ur8;->p:Lcom/daaw/yr8;

    iget-object v1, p0, Lcom/daaw/ur8;->q:Lcom/daaw/zr8;

    iget-object v4, p0, Lcom/daaw/ur8;->r:Lcom/daaw/ar8;

    iget-object v5, p0, Lcom/daaw/ur8;->s:Lcom/daaw/lr8;

    iget-object v6, p0, Lcom/daaw/ur8;->t:Ljava/io/IOException;

    iget-boolean v7, p0, Lcom/daaw/ur8;->u:Z

    iget v2, v0, Lcom/daaw/yr8;->a:I

    iget-object v3, v0, Lcom/daaw/yr8;->b:Lcom/daaw/pr8;

    invoke-interface/range {v1 .. v7}, Lcom/daaw/zr8;->N(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V

    return-void
.end method
