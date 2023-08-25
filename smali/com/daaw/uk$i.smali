.class public Lcom/daaw/uk$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uk;->Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/uk;


# direct methods
.method public constructor <init>(Lcom/daaw/uk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk$i;->p:Lcom/daaw/uk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 4

    sget-object p1, Lcom/daaw/uk;->H:Lcom/daaw/sw1;

    iget-object v0, p0, Lcom/daaw/uk$i;->p:Lcom/daaw/uk;

    invoke-static {v0}, Lcom/daaw/uk;->P(Lcom/daaw/uk;)[Lcom/daaw/l0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uk$i;->p:Lcom/daaw/uk;

    iget-object v1, v1, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/uk$i;->p:Lcom/daaw/uk;

    iget-object v3, v3, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    invoke-virtual {p1, v0, v1, v3}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return v2
.end method
