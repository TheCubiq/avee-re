.class public final synthetic Lcom/daaw/q1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/r1;

.field public final synthetic q:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r1;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q1;->p:Lcom/daaw/r1;

    iput-object p2, p0, Lcom/daaw/q1;->q:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/q1;->p:Lcom/daaw/r1;

    iget-object v1, p0, Lcom/daaw/q1;->q:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lcom/daaw/r1;->b(Lcom/daaw/r1;Ljava/lang/Integer;)V

    return-void
.end method
