.class public final synthetic Lcom/daaw/b20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/d20;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/d20;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b20;->p:Lcom/daaw/d20;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/b20;->p:Lcom/daaw/d20;

    invoke-static {v0}, Lcom/daaw/d20;->b(Lcom/daaw/d20;)V

    return-void
.end method
