.class public final Lcom/daaw/c48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/t38;

.field public final synthetic q:Lcom/daaw/t38;

.field public final synthetic r:J

.field public final synthetic s:Z

.field public final synthetic t:Lcom/daaw/r48;


# direct methods
.method public constructor <init>(Lcom/daaw/r48;Lcom/daaw/t38;Lcom/daaw/t38;JZ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c48;->t:Lcom/daaw/r48;

    iput-object p2, p0, Lcom/daaw/c48;->p:Lcom/daaw/t38;

    iput-object p3, p0, Lcom/daaw/c48;->q:Lcom/daaw/t38;

    iput-wide p4, p0, Lcom/daaw/c48;->r:J

    iput-boolean p6, p0, Lcom/daaw/c48;->s:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/c48;->t:Lcom/daaw/r48;

    iget-object v1, p0, Lcom/daaw/c48;->p:Lcom/daaw/t38;

    iget-object v2, p0, Lcom/daaw/c48;->q:Lcom/daaw/t38;

    iget-wide v3, p0, Lcom/daaw/c48;->r:J

    iget-boolean v5, p0, Lcom/daaw/c48;->s:Z

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/daaw/r48;->v(Lcom/daaw/r48;Lcom/daaw/t38;Lcom/daaw/t38;JZLandroid/os/Bundle;)V

    return-void
.end method
