.class public Lcom/daaw/pn1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/sl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sl0<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/g6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g6<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/g6;

    invoke-direct {v0}, Lcom/daaw/g6;-><init>()V

    iput-object v0, p0, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/daaw/pn1;->b:Landroid/util/SparseArray;

    new-instance v0, Lcom/daaw/sl0;

    invoke-direct {v0}, Lcom/daaw/sl0;-><init>()V

    iput-object v0, p0, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    new-instance v0, Lcom/daaw/g6;

    invoke-direct {v0}, Lcom/daaw/g6;-><init>()V

    iput-object v0, p0, Lcom/daaw/pn1;->d:Lcom/daaw/g6;

    return-void
.end method
