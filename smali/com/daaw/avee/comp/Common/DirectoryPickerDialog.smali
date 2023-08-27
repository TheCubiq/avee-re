.class public Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;
.super Landroid/app/DialogFragment;
.source "DirectoryPickerDialog.java"


# static fields
.field private static final arg1:Ljava/lang/String; = "arg1"

.field private static final arg2:Ljava/lang/String; = "arg2"

.field private static final arg3:Ljava/lang/String; = "arg3"

.field public static onSubmitValue:Lcom/daaw/avee/Common/Events/WeakEvent3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final onlyDirs:Z = true

.field private static final showHidden:Z = false


# instance fields
.field private adapter:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private currentFiles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private dir:Ljava/io/File;

.field private textView:Landroid/widget/EditText;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->onSubmitValue:Lcom/daaw/avee/Common/Events/WeakEvent3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->currentFiles:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/io/File;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->setCurrentPath(Ljava/io/File;)V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Ljava/io/File;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->dir:Ljava/io/File;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->setCurrentPath(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Ljava/util/ArrayList;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->currentFiles:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Landroid/widget/EditText;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->textView:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->returnDir(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static createAndShowDialog(Lcom/daaw/avee/ContextData;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;
    .locals 3

    .line 51
    new-instance v0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;-><init>()V

    .line 53
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "arg1"

    .line 54
    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "arg2"

    .line 55
    invoke-virtual {v1, p2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "arg3"

    .line 56
    invoke-virtual {v1, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->setArguments(Landroid/os/Bundle;)V

    const-string p1, "DirectoryPickerDialog"

    .line 60
    invoke-static {v0, p1, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object v0
.end method

.method private static filter([Ljava/io/File;ZZ)Ljava/util/ArrayList;
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

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    .line 72
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p0, v2

    if-eqz p1, :cond_1

    .line 73
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    .line 75
    invoke-virtual {v3}, Ljava/io/File;->isHidden()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 77
    :cond_2
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 79
    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method private static names(Ljava/util/ArrayList;)[Ljava/lang/String;
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

    .line 84
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    .line 86
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

    .line 87
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private returnDir(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 266
    sget-object v0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->onSubmitValue:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private setCurrentPath(Ljava/io/File;)V
    .locals 3

    if-nez p1, :cond_0

    .line 227
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->dir:Ljava/io/File;

    goto :goto_0

    .line 230
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 238
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->dir:Ljava/io/File;

    .line 244
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->dir:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->filter([Ljava/io/File;ZZ)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->currentFiles:Ljava/util/ArrayList;

    .line 245
    invoke-static {p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->names(Ljava/util/ArrayList;)[Ljava/lang/String;

    move-result-object p1

    .line 247
    array-length v2, p1

    if-ge v2, v1, :cond_1

    new-array p1, v1, [Ljava/lang/String;

    .line 248
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f10004a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    .line 250
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->adapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    .line 251
    iget-object v0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->adapter:Landroid/widget/ArrayAdapter;

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->addAll([Ljava/lang/Object;)V

    .line 252
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->adapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 256
    :try_start_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->dir:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p1, ""

    .line 259
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    const-string p1, "/"

    .line 262
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->textView:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method

.method private setCurrentPath(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 217
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 220
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 222
    :goto_1
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->setCurrentPath(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 11

    .line 96
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "arg1"

    .line 97
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "arg2"

    .line 98
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "arg3"

    .line 99
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 101
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 102
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 104
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v3, 0x7f0c001f

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 105
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const/4 v3, 0x5

    new-array v3, v3, [Landroid/view/View;

    const v4, 0x7f090102

    .line 109
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const v4, 0x7f090103

    .line 110
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const v4, 0x7f090106

    .line 111
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v7, 0x2

    aput-object v4, v3, v7

    const v4, 0x7f090104

    .line 112
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v8, 0x3

    aput-object v4, v3, v8

    const v4, 0x7f090105

    .line 113
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v9, 0x4

    aput-object v4, v3, v9

    .line 116
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-static {v4}, Lcom/AOSPutils/Context_storage;->hasExternalSDCard(Landroid/content/Context;)Z

    move-result v4

    .line 117
    aget-object v10, v3, v9

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    const/16 v4, 0x8

    :goto_0
    invoke-virtual {v10, v4}, Landroid/view/View;->setVisibility(I)V

    .line 119
    aget-object v4, v3, v5

    new-instance v5, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$1;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$1;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    aget-object v4, v3, v6

    new-instance v5, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$2;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$2;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    aget-object v4, v3, v7

    new-instance v5, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$3;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$3;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    aget-object v4, v3, v8

    new-instance v5, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$4;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$4;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    aget-object v3, v3, v9

    new-instance v4, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$5;

    invoke-direct {v4, p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$5;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f090246

    .line 168
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->textView:Landroid/widget/EditText;

    const v3, 0x7f090077

    .line 170
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 171
    new-instance v4, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$6;

    invoke-direct {v4, p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$6;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f09013d

    .line 180
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 181
    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    .line 183
    new-instance v3, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const v5, 0x7f0c0020

    invoke-direct {v3, v4, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    iput-object v3, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->adapter:Landroid/widget/ArrayAdapter;

    .line 184
    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 186
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->setCurrentPath(Ljava/lang/String;)V

    .line 188
    new-instance v1, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$7;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f100046

    .line 198
    new-instance v1, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$8;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f100044

    .line 205
    new-instance v0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$9;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$9;-><init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V

    invoke-virtual {v2, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 211
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
