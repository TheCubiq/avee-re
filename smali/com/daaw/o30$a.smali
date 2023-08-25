.class public Lcom/daaw/o30$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/o30;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/o30;


# direct methods
.method public constructor <init>(Lcom/daaw/o30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o30$a;->a:Lcom/daaw/o30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    iget-object p1, p0, Lcom/daaw/o30$a;->a:Lcom/daaw/o30;

    invoke-static {p1}, Lcom/daaw/o30;->a(Lcom/daaw/o30;)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/daaw/o30$a$a;

    invoke-direct {p2, p0, p4, p5}, Lcom/daaw/o30$a$a;-><init>(Lcom/daaw/o30$a;II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
