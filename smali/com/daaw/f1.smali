.class public Lcom/daaw/f1;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static q:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/al;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/f1;->q:Lcom/daaw/rw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/f1;->p:I

    return-void
.end method

.method public static synthetic a(Lcom/daaw/f1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/f1;->p:I

    return p0
.end method

.method public static synthetic b(Lcom/daaw/f1;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/f1;->p:I

    return p1
.end method

.method public static c(Lcom/daaw/al;)Lcom/daaw/f1;
    .locals 2

    new-instance v0, Lcom/daaw/f1;

    invoke-direct {v0}, Lcom/daaw/f1;-><init>()V

    const-string v1, "AddLinkDialog"

    invoke-static {v0, v1, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c003a

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f090102

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    const v2, 0x7f10009c

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(I)V

    const v2, 0x7f0902f9

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v2, Lcom/daaw/f1$a;

    invoke-direct {v2, p0, v1}, Lcom/daaw/f1$a;-><init>(Lcom/daaw/f1;Landroid/widget/EditText;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f1000a1

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    new-instance v0, Lcom/daaw/f1$b;

    invoke-direct {v0, p0, v1}, Lcom/daaw/f1$b;-><init>(Lcom/daaw/f1;Landroid/widget/EditText;)V

    const v1, 0x7f10009a

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    new-instance v0, Lcom/daaw/f1$c;

    invoke-direct {v0, p0}, Lcom/daaw/f1$c;-><init>(Lcom/daaw/f1;)V

    const v1, 0x7f1000a6

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
