.class public Lcom/daaw/uk$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wc0;

.field public final synthetic q:Lcom/daaw/uk;


# direct methods
.method public constructor <init>(Lcom/daaw/uk;Lcom/daaw/wc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk$a;->q:Lcom/daaw/uk;

    iput-object p2, p0, Lcom/daaw/uk$a;->p:Lcom/daaw/wc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uk$a;->p:Lcom/daaw/wc0;

    iget-object v1, p0, Lcom/daaw/uk$a;->q:Lcom/daaw/uk;

    iget v1, v1, Lcom/daaw/uk;->v:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/daaw/wc0;->m(ILandroid/content/Context;)Z

    return-void
.end method
