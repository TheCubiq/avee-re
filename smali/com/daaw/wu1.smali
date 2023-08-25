.class public final synthetic Lcom/daaw/wu1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic p:Lcom/daaw/dv1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dv1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wu1;->p:Lcom/daaw/dv1;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/wu1;->p:Lcom/daaw/dv1;

    invoke-static {v0, p1}, Lcom/daaw/dv1;->b(Lcom/daaw/dv1;Landroid/view/View;)V

    return-void
.end method
