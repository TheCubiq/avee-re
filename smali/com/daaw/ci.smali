.class public final synthetic Lcom/daaw/ci;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/di;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/di;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ci;->p:Lcom/daaw/di;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ci;->p:Lcom/daaw/di;

    invoke-static {v0}, Lcom/daaw/di;->b(Lcom/daaw/di;)V

    return-void
.end method
