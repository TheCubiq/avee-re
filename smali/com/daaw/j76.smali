.class public final synthetic Lcom/daaw/j76;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/l76;

.field public final synthetic q:J

.field public final synthetic r:Lcom/daaw/i76;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l76;JLcom/daaw/i76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j76;->p:Lcom/daaw/l76;

    iput-wide p2, p0, Lcom/daaw/j76;->q:J

    iput-object p4, p0, Lcom/daaw/j76;->r:Lcom/daaw/i76;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/j76;->p:Lcom/daaw/l76;

    iget-wide v1, p0, Lcom/daaw/j76;->q:J

    iget-object v3, p0, Lcom/daaw/j76;->r:Lcom/daaw/i76;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/l76;->b(JLcom/daaw/i76;)V

    return-void
.end method
