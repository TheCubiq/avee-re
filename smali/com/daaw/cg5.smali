.class public final synthetic Lcom/daaw/cg5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/dg5;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dg5;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cg5;->p:Lcom/daaw/dg5;

    iput-object p2, p0, Lcom/daaw/cg5;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cg5;->p:Lcom/daaw/dg5;

    iget-object v1, p0, Lcom/daaw/cg5;->q:Ljava/lang/String;

    iget-object v0, v0, Lcom/daaw/dg5;->a:Lcom/daaw/fg5;

    invoke-static {v0, v1}, Lcom/daaw/fg5;->j(Lcom/daaw/fg5;Ljava/lang/String;)V

    return-void
.end method
