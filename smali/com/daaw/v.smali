.class public final Lcom/daaw/v;
.super Landroid/text/style/ClickableSpan;
.source ""


# instance fields
.field public final p:I

.field public final q:Lcom/daaw/y;

.field public final r:I


# direct methods
.method public constructor <init>(ILcom/daaw/y;I)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, Lcom/daaw/v;->p:I

    iput-object p2, p0, Lcom/daaw/v;->q:Lcom/daaw/y;

    iput p3, p0, Lcom/daaw/v;->r:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Lcom/daaw/v;->p:I

    const-string v1, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/daaw/v;->q:Lcom/daaw/y;

    iget v1, p0, Lcom/daaw/v;->r:I

    invoke-virtual {v0, v1, p1}, Lcom/daaw/y;->R(ILandroid/os/Bundle;)Z

    return-void
.end method
