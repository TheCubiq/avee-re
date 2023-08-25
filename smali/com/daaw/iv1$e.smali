.class public Lcom/daaw/iv1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/iv1;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/iv1;


# direct methods
.method public constructor <init>(Lcom/daaw/iv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/iv1$e;->p:Lcom/daaw/iv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/daaw/iv1;->E:Lcom/daaw/rw1;

    invoke-static {}, Lcom/daaw/iv1;->e()Lcom/daaw/iv1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/iv1$e;->p:Lcom/daaw/iv1;

    invoke-static {v1}, Lcom/daaw/iv1;->b(Lcom/daaw/iv1;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
