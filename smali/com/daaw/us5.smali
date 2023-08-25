.class public final synthetic Lcom/daaw/us5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ws5;

.field public final synthetic q:Lcom/daaw/fi6;

.field public final synthetic r:Lcom/daaw/th6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ws5;Lcom/daaw/fi6;Lcom/daaw/th6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/us5;->p:Lcom/daaw/ws5;

    iput-object p2, p0, Lcom/daaw/us5;->q:Lcom/daaw/fi6;

    iput-object p3, p0, Lcom/daaw/us5;->r:Lcom/daaw/th6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/us5;->p:Lcom/daaw/ws5;

    iget-object v1, p0, Lcom/daaw/us5;->q:Lcom/daaw/fi6;

    iget-object v2, p0, Lcom/daaw/us5;->r:Lcom/daaw/th6;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ws5;->f(Lcom/daaw/fi6;Lcom/daaw/th6;)V

    return-void
.end method
