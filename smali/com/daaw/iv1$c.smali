.class public Lcom/daaw/iv1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


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

    iput-object p1, p0, Lcom/daaw/iv1$c;->p:Lcom/daaw/iv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 1

    sget-object p1, Lcom/daaw/iv1;->B:Lcom/daaw/qw1;

    iget-object v0, p0, Lcom/daaw/iv1$c;->p:Lcom/daaw/iv1;

    invoke-static {v0}, Lcom/daaw/iv1;->a(Lcom/daaw/iv1;)Lcom/daaw/sv1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
