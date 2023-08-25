.class public final synthetic Lcom/daaw/q14;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/c24;

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/c24;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q14;->p:Lcom/daaw/c24;

    iput p2, p0, Lcom/daaw/q14;->q:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/q14;->p:Lcom/daaw/c24;

    iget v1, p0, Lcom/daaw/q14;->q:I

    invoke-virtual {v0, v1}, Lcom/daaw/c24;->c(I)V

    return-void
.end method
