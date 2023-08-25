.class public Lcom/daaw/dn;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static p:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "Ljava/lang/String;",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public static q:Lcom/daaw/uw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uw1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/kx0;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/dn;->p:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/uw1;

    invoke-direct {v0}, Lcom/daaw/uw1;-><init>()V

    sput-object v0, Lcom/daaw/dn;->q:Lcom/daaw/uw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static a(Lcom/daaw/al;[JLjava/util/List;)Lcom/daaw/dn;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/al;",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/daaw/dn;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/daaw/dn;->b([JLjava/util/List;)Lcom/daaw/dn;

    move-result-object p1

    const-string p2, "CreatePlaylistDialog"

    invoke-static {p1, p2, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-object p1
.end method

.method public static b([JLjava/util/List;)Lcom/daaw/dn;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/daaw/dn;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/dn;

    invoke-direct {v0}, Lcom/daaw/dn;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "arg1"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "arg2"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p1, Ljava/util/ArrayList;

    const-string v2, "arg3"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string p1, "arg4"

    invoke-virtual {v1, p1, p0}, Landroid/os/Bundle;->putLongArray(Ljava/lang/String;[J)V

    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 12

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "arg1"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "arg2"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "arg3"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    const-string v2, "arg4"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getLongArray(Ljava/lang/String;)[J

    move-result-object v7

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {p1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0c003f

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v3, 0x7f090105

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Landroid/widget/EditText;

    if-nez v1, :cond_0

    const v1, 0x7f1000a4

    invoke-virtual {v5, v1}, Landroid/widget/EditText;->setText(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const v1, 0x7f090265

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/Spinner;

    sget-object v1, Lcom/daaw/kx0;->d:[Lcom/daaw/kx0;

    array-length v1, v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v9, 0x7f1001ee

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    aput-object v4, v1, v9

    const/4 v4, 0x0

    :goto_1
    sget-object v10, Lcom/daaw/kx0;->d:[Lcom/daaw/kx0;

    array-length v11, v10

    if-ge v4, v11, :cond_1

    add-int/lit8 v11, v4, 0x1

    aget-object v4, v10, v4

    iget-object v4, v4, Lcom/daaw/kx0;->a:Ljava/lang/String;

    aput-object v4, v1, v11

    move v4, v11

    goto :goto_1

    :cond_1
    new-instance v4, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v10

    const v11, 0x1090008

    invoke-direct {v4, v10, v11, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    const v1, 0x7f0902e2

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-nez v7, :cond_2

    if-nez v8, :cond_2

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    :cond_2
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v7, :cond_3

    array-length v2, v7

    goto :goto_2

    :cond_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v10, 0x7f0e000d

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v3, v9

    invoke-virtual {v4, v10, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    if-nez v0, :cond_4

    const v0, 0x7f1000a5

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f1000aa

    new-instance v1, Lcom/daaw/dn$a;

    move-object v3, v1

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/daaw/dn$a;-><init>(Lcom/daaw/dn;Landroid/widget/EditText;Landroid/widget/Spinner;[JLjava/util/ArrayList;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_4
    const v0, 0x7f1000a6

    new-instance v1, Lcom/daaw/dn$b;

    invoke-direct {v1, p0}, Lcom/daaw/dn$b;-><init>(Lcom/daaw/dn;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
