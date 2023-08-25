.class public final synthetic Lcom/daaw/lg4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/pg4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/pg4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lg4;->p:Lcom/daaw/pg4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lg4;->p:Lcom/daaw/pg4;

    invoke-virtual {v0}, Lcom/daaw/pg4;->F()V

    return-void
.end method
