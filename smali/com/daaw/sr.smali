.class public final synthetic Lcom/daaw/sr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ur;

.field public final synthetic q:Lcom/daaw/sn1;

.field public final synthetic r:Lcom/daaw/ao1;

.field public final synthetic s:Lcom/daaw/by;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ur;Lcom/daaw/sn1;Lcom/daaw/ao1;Lcom/daaw/by;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sr;->p:Lcom/daaw/ur;

    iput-object p2, p0, Lcom/daaw/sr;->q:Lcom/daaw/sn1;

    iput-object p3, p0, Lcom/daaw/sr;->r:Lcom/daaw/ao1;

    iput-object p4, p0, Lcom/daaw/sr;->s:Lcom/daaw/by;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/sr;->p:Lcom/daaw/ur;

    iget-object v1, p0, Lcom/daaw/sr;->q:Lcom/daaw/sn1;

    iget-object v2, p0, Lcom/daaw/sr;->r:Lcom/daaw/ao1;

    iget-object v3, p0, Lcom/daaw/sr;->s:Lcom/daaw/by;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/ur;->b(Lcom/daaw/ur;Lcom/daaw/sn1;Lcom/daaw/ao1;Lcom/daaw/by;)V

    return-void
.end method
