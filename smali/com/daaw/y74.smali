.class public final synthetic Lcom/daaw/y74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/z74;

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Z

.field public final synthetic t:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/z74;IIZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y74;->p:Lcom/daaw/z74;

    iput p2, p0, Lcom/daaw/y74;->q:I

    iput p3, p0, Lcom/daaw/y74;->r:I

    iput-boolean p4, p0, Lcom/daaw/y74;->s:Z

    iput-boolean p5, p0, Lcom/daaw/y74;->t:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/y74;->p:Lcom/daaw/z74;

    iget v1, p0, Lcom/daaw/y74;->q:I

    iget v2, p0, Lcom/daaw/y74;->r:I

    iget-boolean v3, p0, Lcom/daaw/y74;->s:Z

    iget-boolean v4, p0, Lcom/daaw/y74;->t:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/z74;->h3(IIZZ)V

    return-void
.end method
