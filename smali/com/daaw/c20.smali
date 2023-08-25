.class public final synthetic Lcom/daaw/c20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/d20;

.field public final synthetic q:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/d20;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c20;->p:Lcom/daaw/d20;

    iput-boolean p2, p0, Lcom/daaw/c20;->q:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/c20;->p:Lcom/daaw/d20;

    iget-boolean v1, p0, Lcom/daaw/c20;->q:Z

    invoke-static {v0, v1}, Lcom/daaw/d20;->c(Lcom/daaw/d20;Z)V

    return-void
.end method
