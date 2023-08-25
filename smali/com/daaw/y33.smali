.class public final synthetic Lcom/daaw/y33;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/g43;

.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/g43;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y33;->p:Lcom/daaw/g43;

    iput-object p2, p0, Lcom/daaw/y33;->q:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y33;->p:Lcom/daaw/g43;

    iget-object v1, p0, Lcom/daaw/y33;->q:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/daaw/g43;->b(Landroid/content/Context;)V

    return-void
.end method
