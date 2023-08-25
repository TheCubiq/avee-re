.class public final synthetic Lcom/daaw/m57;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/o57;

.field public final synthetic q:Lcom/daaw/f77;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/o57;Lcom/daaw/f77;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m57;->p:Lcom/daaw/o57;

    iput-object p2, p0, Lcom/daaw/m57;->q:Lcom/daaw/f77;

    iput p3, p0, Lcom/daaw/m57;->r:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/m57;->p:Lcom/daaw/o57;

    iget-object v1, p0, Lcom/daaw/m57;->q:Lcom/daaw/f77;

    iget v2, p0, Lcom/daaw/m57;->r:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/o57;->T(Lcom/daaw/f77;I)V

    return-void
.end method
