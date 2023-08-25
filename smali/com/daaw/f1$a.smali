.class public Lcom/daaw/f1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/f1;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/widget/EditText;

.field public final synthetic q:Lcom/daaw/f1;


# direct methods
.method public constructor <init>(Lcom/daaw/f1;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    iput-object p2, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const v1, 0x7f10009d

    :goto_0
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setText(I)V

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const v1, 0x7f10009e

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const v1, 0x7f10009f

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_3

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const v1, 0x7f1000a0

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    const/4 v1, 0x4

    if-ne p1, v1, :cond_4

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const-string v1, "http://yt-dash-mse-test.commondatastorage.googleapis.com/media/oops-20120802-manifest.mpd"

    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    const/4 v1, 0x5

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const-string v1, "http://wams.edgesuite.net/media/MPTExpressionData02/BigBuckBunny_1080p24_IYUV_2ch.ism/manifest(format=mpd-time-csf)"

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    const/4 v1, 0x6

    if-ne p1, v1, :cond_6

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const-string v1, "http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720.ism/Manifest"

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    const/4 v1, 0x7

    if-ne p1, v1, :cond_7

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const-string v1, "http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720_688.ismv"

    goto :goto_1

    :cond_7
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result p1

    const/16 v1, 0x8

    if-ne p1, v1, :cond_8

    iget-object p1, p0, Lcom/daaw/f1$a;->p:Landroid/widget/EditText;

    const-string v1, "http://techslides.com/demos/sample-videos/small.flv"

    goto :goto_1

    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/daaw/f1$a;->q:Lcom/daaw/f1;

    invoke-static {p1}, Lcom/daaw/f1;->a(Lcom/daaw/f1;)I

    move-result v1

    add-int/2addr v1, v0

    rem-int/lit8 v1, v1, 0x9

    invoke-static {p1, v1}, Lcom/daaw/f1;->b(Lcom/daaw/f1;I)I

    return-void
.end method
