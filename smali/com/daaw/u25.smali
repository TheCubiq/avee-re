.class public final synthetic Lcom/daaw/u25;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/e35;

.field public final synthetic q:Lcom/daaw/k55;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e35;Lcom/daaw/k55;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/u25;->p:Lcom/daaw/e35;

    iput-object p2, p0, Lcom/daaw/u25;->q:Lcom/daaw/k55;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u25;->p:Lcom/daaw/e35;

    iget-object v1, p0, Lcom/daaw/u25;->q:Lcom/daaw/k55;

    invoke-virtual {v0, v1}, Lcom/daaw/e35;->W(Lcom/daaw/k55;)V

    return-void
.end method
