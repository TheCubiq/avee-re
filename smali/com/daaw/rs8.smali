.class public final synthetic Lcom/daaw/rs8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ys8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ys8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rs8;->p:Lcom/daaw/ys8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rs8;->p:Lcom/daaw/ys8;

    invoke-virtual {v0}, Lcom/daaw/ys8;->r()V

    return-void
.end method
