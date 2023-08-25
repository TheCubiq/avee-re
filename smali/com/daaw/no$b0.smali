.class public Lcom/daaw/no$b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->E(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/no;


# direct methods
.method public constructor <init>(Lcom/daaw/no;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$b0;->p:Lcom/daaw/no;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object p1, p0, Lcom/daaw/no$b0;->p:Lcom/daaw/no;

    invoke-static {p1}, Lcom/daaw/no;->g(Lcom/daaw/no;)Lcom/daaw/un;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/no$b0;->p:Lcom/daaw/no;

    invoke-static {v0}, Lcom/daaw/no;->g(Lcom/daaw/no;)Lcom/daaw/un;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ho;->c(Lcom/daaw/un;Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
