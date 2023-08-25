.class public final synthetic Lcom/daaw/j45;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/l45;

.field public final synthetic q:Lcom/daaw/k55;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l45;Lcom/daaw/k55;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j45;->p:Lcom/daaw/l45;

    iput-object p2, p0, Lcom/daaw/j45;->q:Lcom/daaw/k55;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/j45;->p:Lcom/daaw/l45;

    iget-object v1, p0, Lcom/daaw/j45;->q:Lcom/daaw/k55;

    invoke-virtual {v0, v1}, Lcom/daaw/l45;->b(Lcom/daaw/k55;)V

    return-void
.end method
