.class public final synthetic Lcom/daaw/n57;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/o57;

.field public final synthetic q:Lcom/daaw/t17;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/o57;Lcom/daaw/t17;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n57;->p:Lcom/daaw/o57;

    iput-object p2, p0, Lcom/daaw/n57;->q:Lcom/daaw/t17;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n57;->p:Lcom/daaw/o57;

    iget-object v1, p0, Lcom/daaw/n57;->q:Lcom/daaw/t17;

    invoke-virtual {v0, v1}, Lcom/daaw/o57;->U(Lcom/daaw/t17;)V

    return-void
.end method
