.class public Lcom/daaw/ba1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ba1;->O(Lcom/daaw/wc0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wc0;

.field public final synthetic q:Lcom/daaw/ba1;


# direct methods
.method public constructor <init>(Lcom/daaw/ba1;Lcom/daaw/wc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ba1$b;->q:Lcom/daaw/ba1;

    iput-object p2, p0, Lcom/daaw/ba1$b;->p:Lcom/daaw/wc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/ba1$b;->p:Lcom/daaw/wc0;

    invoke-interface {p1}, Lcom/daaw/wc0;->z()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Lcom/daaw/wc0;->c(Z)V

    iget-object p1, p0, Lcom/daaw/ba1$b;->q:Lcom/daaw/ba1;

    iget-object v0, p0, Lcom/daaw/ba1$b;->p:Lcom/daaw/wc0;

    invoke-interface {v0}, Lcom/daaw/wc0;->z()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/ba1;->Q(Z)V

    return-void
.end method
