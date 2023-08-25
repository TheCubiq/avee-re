.class public final Lcom/daaw/avee/a;
.super Lcom/daaw/ot;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/a$a;
    }
.end annotation


# static fields
.field public static final H0:Lcom/daaw/avee/a$a;

.field public static I0:Z


# instance fields
.field public G0:Landroid/widget/CheckBox;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/avee/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/avee/a$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/avee/a;->H0:Lcom/daaw/avee/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ot;-><init>()V

    return-void
.end method

.method public static final synthetic V1()Z
    .locals 1

    sget-boolean v0, Lcom/daaw/avee/a;->I0:Z

    return v0
.end method

.method public static final synthetic W1(Z)V
    .locals 0

    sput-boolean p0, Lcom/daaw/avee/a;->I0:Z

    return-void
.end method


# virtual methods
.method public N0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    const-string v0, "view"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->N0(Landroid/view/View;Landroid/os/Bundle;)V

    const p2, 0x7f0900b7

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/CheckBox;

    iput-object p2, p0, Lcom/daaw/avee/a;->G0:Landroid/widget/CheckBox;

    new-instance p2, Lcom/daaw/avee/a$b;

    invoke-direct {p2, p0}, Lcom/daaw/avee/a$b;-><init>(Lcom/daaw/avee/a;)V

    const v0, 0x7f0900e4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    new-instance v6, Landroid/text/SpannableString;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    const v0, 0x7f100134

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->T(I)Ljava/lang/String;

    move-result-object v7

    const-string v0, "getString(R.string.legac\u2026um_description_clickable)"

    invoke-static {v7, v0}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, v7

    invoke-static/range {v0 .. v5}, Lcom/daaw/oh1;->n(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    const/16 v2, 0x21

    invoke-virtual {v6, p2, v0, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    sget-object p2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, v6, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    return-void
.end method

.method public N1(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    new-instance p1, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o1()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f11023f

    invoke-direct {p1, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/daaw/ot;->onDismiss(Landroid/content/DialogInterface;)V

    iget-object p1, p0, Lcom/daaw/avee/a;->G0:Landroid/widget/CheckBox;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/az0;

    invoke-direct {v0}, Lcom/daaw/az0;-><init>()V

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lcom/daaw/az0;->f(Z)V

    :goto_0
    const/4 p1, 0x0

    sput-boolean p1, Lcom/daaw/avee/a;->I0:Z

    return-void
.end method

.method public s0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0c0064

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string p2, "inflater.inflate(R.layou\u2026m_info, container, false)"

    invoke-static {p1, p2}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public v0()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/ot;->v0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/avee/a;->G0:Landroid/widget/CheckBox;

    return-void
.end method
