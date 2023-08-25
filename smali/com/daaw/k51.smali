.class public final synthetic Lcom/daaw/k51;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/j51$f;

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/j51$f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k51;->p:Lcom/daaw/j51$f;

    iput p2, p0, Lcom/daaw/k51;->q:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k51;->p:Lcom/daaw/j51$f;

    iget v1, p0, Lcom/daaw/k51;->q:I

    invoke-static {v0, v1}, Lcom/daaw/j51$f;->a(Lcom/daaw/j51$f;I)V

    return-void
.end method
