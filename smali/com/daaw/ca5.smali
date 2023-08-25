.class public final synthetic Lcom/daaw/ca5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic p:Lcom/daaw/ha5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ha5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ca5;->p:Lcom/daaw/ha5;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ca5;->p:Lcom/daaw/ha5;

    invoke-virtual {v0, p1}, Lcom/daaw/ha5;->f(Landroid/view/View;)V

    return-void
.end method
