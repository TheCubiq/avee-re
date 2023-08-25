.class public final synthetic Lcom/daaw/x25;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/e35;

.field public final synthetic q:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e35;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x25;->p:Lcom/daaw/e35;

    iput-boolean p2, p0, Lcom/daaw/x25;->q:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/x25;->p:Lcom/daaw/e35;

    iget-boolean v1, p0, Lcom/daaw/x25;->q:Z

    invoke-virtual {v0, v1}, Lcom/daaw/e35;->U(Z)V

    return-void
.end method
