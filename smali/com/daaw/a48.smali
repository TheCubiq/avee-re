.class public final synthetic Lcom/daaw/a48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/j58;

.field public final synthetic q:Lcom/daaw/o68;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/j58;Lcom/daaw/o68;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a48;->p:Lcom/daaw/j58;

    iput-object p2, p0, Lcom/daaw/a48;->q:Lcom/daaw/o68;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/a48;->p:Lcom/daaw/j58;

    iget-object v1, p0, Lcom/daaw/a48;->q:Lcom/daaw/o68;

    invoke-virtual {v0, v1}, Lcom/daaw/j58;->t(Lcom/daaw/o68;)V

    return-void
.end method
