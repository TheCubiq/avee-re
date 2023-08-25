.class public final synthetic Lcom/daaw/i45;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/l45;

.field public final synthetic q:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l45;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i45;->p:Lcom/daaw/l45;

    iput-object p2, p0, Lcom/daaw/i45;->q:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/i45;->p:Lcom/daaw/l45;

    iget-object v1, p0, Lcom/daaw/i45;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lcom/daaw/l45;->a(Landroid/view/ViewGroup;)V

    return-void
.end method
