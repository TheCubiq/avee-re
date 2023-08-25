.class public Lcom/daaw/ho$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ho;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/w40<",
        "Lcom/daaw/e0<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ho;


# direct methods
.method public constructor <init>(Lcom/daaw/ho;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ho$f;->a:Lcom/daaw/ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ho$f;->b()Lcom/daaw/e0;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/e0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/e0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ho$f;->a:Lcom/daaw/ho;

    iget-object v1, v0, Lcom/daaw/ho;->t:Lcom/daaw/no;

    invoke-static {v0}, Lcom/daaw/ho;->f(Lcom/daaw/ho;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/ho$f;->a:Lcom/daaw/ho;

    invoke-static {v2}, Lcom/daaw/ho;->g(Lcom/daaw/ho;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/daaw/no;->f(Ljava/util/List;Ljava/lang/String;)Lcom/daaw/e0;

    move-result-object v0

    return-object v0
.end method
