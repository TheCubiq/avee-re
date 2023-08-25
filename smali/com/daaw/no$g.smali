.class public Lcom/daaw/no$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->o(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:Lcom/daaw/un;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/daaw/e0;

.field public final synthetic f:[Landroid/widget/SeekBar;

.field public final synthetic g:Lcom/daaw/w40;


# direct methods
.method public constructor <init>(FFLcom/daaw/un;Ljava/lang/String;Lcom/daaw/e0;[Landroid/widget/SeekBar;Lcom/daaw/w40;)V
    .locals 0

    iput p1, p0, Lcom/daaw/no$g;->a:F

    iput p2, p0, Lcom/daaw/no$g;->b:F

    iput-object p3, p0, Lcom/daaw/no$g;->c:Lcom/daaw/un;

    iput-object p4, p0, Lcom/daaw/no$g;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/no$g;->e:Lcom/daaw/e0;

    iput-object p6, p0, Lcom/daaw/no$g;->f:[Landroid/widget/SeekBar;

    iput-object p7, p0, Lcom/daaw/no$g;->g:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    if-eqz p3, :cond_1

    int-to-float p1, p2

    iget p2, p0, Lcom/daaw/no$g;->a:F

    mul-float p1, p1, p2

    iget p2, p0, Lcom/daaw/no$g;->b:F

    add-float/2addr p1, p2

    iget-object p2, p0, Lcom/daaw/no$g;->c:Lcom/daaw/un;

    iget-object p3, p0, Lcom/daaw/no$g;->d:Ljava/lang/String;

    invoke-virtual {p2, p3, p1}, Lcom/daaw/un;->Q(Ljava/lang/String;F)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/no$g;->e:Lcom/daaw/e0;

    iget-object p2, p0, Lcom/daaw/no$g;->f:[Landroid/widget/SeekBar;

    const/4 p3, 0x0

    aget-object p2, p2, p3

    invoke-interface {p1, p2}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/no$g;->g:Lcom/daaw/w40;

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
