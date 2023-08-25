.class public Lcom/daaw/no$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->t(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/un;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Lcom/daaw/e0;

.field public final synthetic f:[Landroid/widget/SeekBar;

.field public final synthetic g:Lcom/daaw/w40;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;FFLcom/daaw/e0;[Landroid/widget/SeekBar;Lcom/daaw/w40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$j;->a:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$j;->b:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/no$j;->c:F

    iput p4, p0, Lcom/daaw/no$j;->d:F

    iput-object p5, p0, Lcom/daaw/no$j;->e:Lcom/daaw/e0;

    iput-object p6, p0, Lcom/daaw/no$j;->f:[Landroid/widget/SeekBar;

    iput-object p7, p0, Lcom/daaw/no$j;->g:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    if-eqz p3, :cond_1

    iget-object p1, p0, Lcom/daaw/no$j;->a:Lcom/daaw/un;

    iget-object p3, p0, Lcom/daaw/no$j;->b:Ljava/lang/String;

    new-instance v0, Lcom/daaw/bs1;

    iget v1, p0, Lcom/daaw/no$j;->c:F

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    invoke-virtual {p1, p3, v0}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object p1

    new-instance p3, Lcom/daaw/bs1;

    int-to-float p2, p2

    iget v0, p0, Lcom/daaw/no$j;->d:F

    mul-float p2, p2, v0

    iget v0, p0, Lcom/daaw/no$j;->c:F

    add-float/2addr p2, v0

    iget p1, p1, Lcom/daaw/bs1;->b:F

    invoke-direct {p3, p2, p1}, Lcom/daaw/bs1;-><init>(FF)V

    iget-object p1, p0, Lcom/daaw/no$j;->a:Lcom/daaw/un;

    iget-object p2, p0, Lcom/daaw/no$j;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/un;->l0(Ljava/lang/String;Lcom/daaw/bs1;)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/no$j;->e:Lcom/daaw/e0;

    iget-object p2, p0, Lcom/daaw/no$j;->f:[Landroid/widget/SeekBar;

    const/4 p3, 0x0

    aget-object p2, p2, p3

    invoke-interface {p1, p2}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/no$j;->g:Lcom/daaw/w40;

    invoke-interface {p1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e0;

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
