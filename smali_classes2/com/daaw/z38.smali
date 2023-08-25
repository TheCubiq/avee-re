.class public final Lcom/daaw/z38;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/os/Bundle;

.field public final synthetic q:Lcom/daaw/t38;

.field public final synthetic r:Lcom/daaw/t38;

.field public final synthetic s:J

.field public final synthetic t:Lcom/daaw/r48;


# direct methods
.method public constructor <init>(Lcom/daaw/r48;Landroid/os/Bundle;Lcom/daaw/t38;Lcom/daaw/t38;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z38;->t:Lcom/daaw/r48;

    iput-object p2, p0, Lcom/daaw/z38;->p:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/daaw/z38;->q:Lcom/daaw/t38;

    iput-object p4, p0, Lcom/daaw/z38;->r:Lcom/daaw/t38;

    iput-wide p5, p0, Lcom/daaw/z38;->s:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/z38;->t:Lcom/daaw/r48;

    iget-object v1, p0, Lcom/daaw/z38;->p:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/daaw/z38;->q:Lcom/daaw/t38;

    iget-object v3, p0, Lcom/daaw/z38;->r:Lcom/daaw/t38;

    iget-wide v4, p0, Lcom/daaw/z38;->s:J

    invoke-static/range {v0 .. v5}, Lcom/daaw/r48;->w(Lcom/daaw/r48;Landroid/os/Bundle;Lcom/daaw/t38;Lcom/daaw/t38;J)V

    return-void
.end method
