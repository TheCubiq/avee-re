.class public final synthetic Lcom/daaw/p34;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/t34;

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/t34;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p34;->p:Lcom/daaw/t34;

    iput p2, p0, Lcom/daaw/p34;->q:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/p34;->p:Lcom/daaw/t34;

    iget v1, p0, Lcom/daaw/p34;->q:I

    invoke-virtual {v0, v1}, Lcom/daaw/t34;->N(I)V

    return-void
.end method
