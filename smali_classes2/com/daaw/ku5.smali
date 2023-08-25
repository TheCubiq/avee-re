.class public final Lcom/daaw/ku5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Z

.field public final synthetic q:Lcom/daaw/nv5;


# direct methods
.method public constructor <init>(Lcom/daaw/nv5;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ku5;->q:Lcom/daaw/nv5;

    iput-boolean p2, p0, Lcom/daaw/ku5;->p:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ku5;->q:Lcom/daaw/nv5;

    invoke-static {v0}, Lcom/daaw/nv5;->a(Lcom/daaw/nv5;)Lcom/daaw/yb8;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/ku5;->p:Z

    invoke-virtual {v0, v1}, Lcom/daaw/yb8;->n(Z)V

    return-void
.end method
