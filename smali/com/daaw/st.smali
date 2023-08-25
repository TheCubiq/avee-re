.class public Lcom/daaw/st;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static t:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "Lcom/daaw/al;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public q:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public r:Landroid/widget/EditText;

.field public s:Ljava/io/File;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/st;->t:Lcom/daaw/sw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/st;->p:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/st;Ljava/io/File;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/st;->k(Ljava/io/File;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/st;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lcom/daaw/st;->s:Ljava/io/File;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/st;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/st;->l(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/st;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/daaw/st;->p:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic e(Lcom/daaw/st;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/daaw/st;->r:Landroid/widget/EditText;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/st;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/st;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static g(Lcom/daaw/al;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/st;
    .locals 3

    new-instance v0, Lcom/daaw/st;

    invoke-direct {v0}, Lcom/daaw/st;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "arg1"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "arg2"

    invoke-virtual {v1, p2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "arg3"

    invoke-virtual {v1, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    const-string p1, "DirectoryPickerDialog"

    invoke-static {v0, p1, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-object v0
.end method

.method public static h([Ljava/io/File;ZZ)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/io/File;",
            "ZZ)",
            "Ljava/util/ArrayList<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p0, v2

    if-eqz p1, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->isHidden()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method public static i(Ljava/util/ArrayList;)[Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/io/File;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/daaw/st;->t:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/daaw/al;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Ljava/io/File;)V
    .locals 3

    if-nez p1, :cond_0

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/daaw/st;->s:Ljava/io/File;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/daaw/st;->s:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/daaw/st;->h([Ljava/io/File;ZZ)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/st;->p:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/daaw/st;->i(Ljava/util/ArrayList;)[Ljava/lang/String;

    move-result-object p1

    array-length v2, p1

    if-ge v2, v0, :cond_1

    new-array p1, v0, [Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f1000ac

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v1

    :cond_1
    iget-object v0, p0, Lcom/daaw/st;->q:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    iget-object v0, p0, Lcom/daaw/st;->q:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->addAll([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/st;->q:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    :try_start_0
    iget-object p1, p0, Lcom/daaw/st;->s:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p1, ""

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    const-string p1, "/"

    :cond_2
    iget-object v0, p0, Lcom/daaw/st;->r:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Lcom/daaw/st;->k(Ljava/io/File;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 11

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "arg1"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "arg2"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "arg3"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v3, 0x7f0c0020

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const/4 v3, 0x5

    new-array v3, v3, [Landroid/view/View;

    const v4, 0x7f090143

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const v4, 0x7f090144

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const v4, 0x7f090147

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v7, 0x2

    aput-object v4, v3, v7

    const v4, 0x7f090145

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v8, 0x3

    aput-object v4, v3, v8

    const v4, 0x7f090146

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v9, 0x4

    aput-object v4, v3, v9

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/j5;->v()Z

    move-result v4

    aget-object v10, v3, v9

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    const/16 v4, 0x8

    :goto_0
    invoke-virtual {v10, v4}, Landroid/view/View;->setVisibility(I)V

    aget-object v4, v3, v5

    new-instance v5, Lcom/daaw/st$a;

    invoke-direct {v5, p0}, Lcom/daaw/st$a;-><init>(Lcom/daaw/st;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object v4, v3, v6

    new-instance v5, Lcom/daaw/st$b;

    invoke-direct {v5, p0}, Lcom/daaw/st$b;-><init>(Lcom/daaw/st;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object v4, v3, v7

    new-instance v5, Lcom/daaw/st$c;

    invoke-direct {v5, p0}, Lcom/daaw/st$c;-><init>(Lcom/daaw/st;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object v4, v3, v8

    new-instance v5, Lcom/daaw/st$d;

    invoke-direct {v5, p0}, Lcom/daaw/st$d;-><init>(Lcom/daaw/st;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object v3, v3, v9

    new-instance v4, Lcom/daaw/st$e;

    invoke-direct {v4, p0}, Lcom/daaw/st$e;-><init>(Lcom/daaw/st;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f0902e6

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/daaw/st;->r:Landroid/widget/EditText;

    const v3, 0x7f090091

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    new-instance v4, Lcom/daaw/st$f;

    invoke-direct {v4, p0}, Lcom/daaw/st$f;-><init>(Lcom/daaw/st;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f090195

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    new-instance v3, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const v5, 0x7f0c0021

    invoke-direct {v3, v4, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    iput-object v3, p0, Lcom/daaw/st;->q:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {p0, v1}, Lcom/daaw/st;->l(Ljava/lang/String;)V

    new-instance v1, Lcom/daaw/st$g;

    invoke-direct {v1, p0}, Lcom/daaw/st$g;-><init>(Lcom/daaw/st;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f1000a8

    new-instance v1, Lcom/daaw/st$h;

    invoke-direct {v1, p0, p1}, Lcom/daaw/st$h;-><init>(Lcom/daaw/st;Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f1000a6

    new-instance v0, Lcom/daaw/st$i;

    invoke-direct {v0, p0}, Lcom/daaw/st$i;-><init>(Lcom/daaw/st;)V

    invoke-virtual {v2, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
