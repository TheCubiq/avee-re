.class public Lcom/daaw/ox0;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static A:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field

.field public static x:Lcom/daaw/uw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uw1<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static y:Lcom/daaw/uw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uw1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static z:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Lcom/daaw/er0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public p:Landroid/widget/LinearLayout;

.field public q:Landroid/widget/LinearLayout;

.field public r:Z

.field public s:Z

.field public t:Lcom/daaw/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g0<",
            "[J",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/tx0;",
            ">;>;"
        }
    .end annotation
.end field

.field public u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation
.end field

.field public v:[J

.field public w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/uw1;

    invoke-direct {v0}, Lcom/daaw/uw1;-><init>()V

    sput-object v0, Lcom/daaw/ox0;->x:Lcom/daaw/uw1;

    new-instance v0, Lcom/daaw/uw1;

    invoke-direct {v0}, Lcom/daaw/uw1;-><init>()V

    sput-object v0, Lcom/daaw/ox0;->y:Lcom/daaw/uw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/ox0;->z:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/ox0;->A:Lcom/daaw/sw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ox0;->r:Z

    iput-boolean v0, p0, Lcom/daaw/ox0;->s:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/ox0;->t:Lcom/daaw/g0;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/ox0;->u:Ljava/util/ArrayList;

    new-array v1, v0, [J

    iput-object v1, p0, Lcom/daaw/ox0;->v:[J

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/ox0;->w:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/ox0;Lcom/daaw/g0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ox0;->d(Lcom/daaw/g0;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/ox0;Ljava/util/ArrayList;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ox0;->f(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static c(Lcom/daaw/al;Ljava/util/List;Ljava/lang/Boolean;)Lcom/daaw/ox0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/al;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/daaw/ox0;"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Lcom/daaw/ox0;->e(Ljava/util/List;Z)Lcom/daaw/ox0;

    move-result-object p1

    const-string p2, "PlaylistPickerDialog"

    invoke-static {p1, p2, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-object p1
.end method

.method public static e(Ljava/util/List;Z)Lcom/daaw/ox0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;Z)",
            "Lcom/daaw/ox0;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/ox0;

    invoke-direct {v0}, Lcom/daaw/ox0;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/tx0;

    invoke-virtual {v2}, Lcom/daaw/tx0;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "arg1"

    invoke-virtual {p0, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "arg2"

    invoke-virtual {p0, p1, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v0, p0}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public final d(Lcom/daaw/g0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/g0<",
            "[J",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/tx0;",
            ">;>;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/ox0;->s:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ox0;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/daaw/ox0;->q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iput-object p1, p0, Lcom/daaw/ox0;->t:Lcom/daaw/g0;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ox0;->v:[J

    iget-object v1, p0, Lcom/daaw/ox0;->w:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/daaw/ox0;->u:Ljava/util/ArrayList;

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/g0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final f(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/tx0;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/daaw/ox0;->v:[J

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/tx0;

    iget-object v5, p0, Lcom/daaw/ox0;->v:[J

    invoke-virtual {v3}, Lcom/daaw/tx0;->l()J

    move-result-wide v6

    aput-wide v6, v5, v2

    add-int/2addr v2, v4

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ox0;->p:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/daaw/ox0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iput-boolean v4, p0, Lcom/daaw/ox0;->s:Z

    iget-boolean v0, p0, Lcom/daaw/ox0;->r:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ox0;->t:Lcom/daaw/g0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/ox0;->v:[J

    iget-object v2, p0, Lcom/daaw/ox0;->w:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2, p1}, Lcom/daaw/g0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final g(Landroid/widget/ArrayAdapter;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1001ed

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 17

    move-object/from16 v6, p0

    new-instance v7, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "arg1"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v1, "arg2"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    new-instance v11, Landroid/app/AlertDialog$Builder;

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v11, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v0, 0x7f1000b9

    invoke-virtual {v11, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c003b

    const/4 v12, 0x0

    invoke-static {v0, v1, v12}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f0900d2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v6, Lcom/daaw/ox0;->p:Landroid/widget/LinearLayout;

    const v1, 0x7f0900d1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v6, Lcom/daaw/ox0;->q:Landroid/widget/LinearLayout;

    const v1, 0x7f090285

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TabHost;

    invoke-virtual {v1}, Landroid/widget/TabHost;->setup()V

    const-string v3, "Tab One"

    invoke-virtual {v1, v3}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v3

    const v4, 0x7f090283

    invoke-virtual {v3, v4}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f100243

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;)Landroid/widget/TabHost$TabSpec;

    invoke-virtual {v1, v3}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    const-string v3, "Tab Two"

    invoke-virtual {v1, v3}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v3

    const v4, 0x7f090284

    invoke-virtual {v3, v4}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f100242

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;)Landroid/widget/TabHost$TabSpec;

    invoke-virtual {v1, v3}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    const v1, 0x7f0900b5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/widget/CheckBox;

    const v1, 0x7f0900b6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/CheckBox;

    invoke-virtual {v4, v9}, Landroid/widget/CheckBox;->setChecked(Z)V

    if-eqz v2, :cond_1

    invoke-virtual {v3, v8}, Landroid/widget/CheckBox;->setVisibility(I)V

    invoke-virtual {v3, v9}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    invoke-virtual {v3, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    :goto_1
    const v1, 0x7f090197

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    invoke-virtual {v1, v9}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    new-instance v5, Landroid/widget/ArrayAdapter;

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v13

    const v14, 0x7f0c0021

    invoke-direct {v5, v13, v14}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v5}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const v13, 0x7f090198

    invoke-virtual {v0, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/ListView;

    invoke-virtual {v13, v9}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v15

    invoke-direct {v0, v15, v14}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v13, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v12

    invoke-static {v12, v14, v15}, Lcom/daaw/dr1;->c(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v6, v5, v15}, Lcom/daaw/ox0;->g(Landroid/widget/ArrayAdapter;Ljava/util/Collection;)V

    sget-object v5, Lcom/daaw/ox0;->z:Lcom/daaw/vw1;

    new-instance v12, Lcom/daaw/er0;

    invoke-direct {v12}, Lcom/daaw/er0;-><init>()V

    invoke-virtual {v5, v12}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/er0;

    new-instance v12, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lcom/daaw/er0;->size()I

    move-result v15

    invoke-direct {v12, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v8, v16

    check-cast v8, Lcom/daaw/lo1;

    iget-object v8, v8, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Lcom/daaw/hk;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v6, v0, v12}, Lcom/daaw/ox0;->g(Landroid/widget/ArrayAdapter;Ljava/util/Collection;)V

    new-instance v0, Lcom/daaw/ox0$a;

    invoke-direct {v0, v6, v2, v3, v14}, Lcom/daaw/ox0$a;-><init>(Lcom/daaw/ox0;ZLandroid/widget/CheckBox;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    new-instance v8, Lcom/daaw/ox0$b;

    move-object v0, v8

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ox0$b;-><init>(Lcom/daaw/ox0;ZLandroid/widget/CheckBox;Landroid/widget/CheckBox;Lcom/daaw/er0;)V

    invoke-virtual {v13, v8}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f1000b8

    new-instance v1, Lcom/daaw/ox0$c;

    invoke-direct {v1, v6}, Lcom/daaw/ox0$c;-><init>(Lcom/daaw/ox0;)V

    invoke-virtual {v11, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f1000a6

    new-instance v1, Lcom/daaw/ox0$d;

    invoke-direct {v1, v6}, Lcom/daaw/ox0$d;-><init>(Lcom/daaw/ox0;)V

    invoke-virtual {v11, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, v6, Lcom/daaw/ox0;->u:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, v6, Lcom/daaw/ox0;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, v6, Lcom/daaw/ox0;->w:Ljava/util/ArrayList;

    new-array v0, v9, [I

    const/4 v1, 0x0

    aput v1, v0, v1

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Lcom/daaw/tx0;

    invoke-direct {v3, v2}, Lcom/daaw/tx0;-><init>(Ljava/lang/String;)V

    iget-object v2, v6, Lcom/daaw/ox0;->u:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v6, Lcom/daaw/ox0;->w:Ljava/util/ArrayList;

    invoke-virtual {v3}, Lcom/daaw/tx0;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/daaw/ox0$e;

    invoke-direct {v2, v6, v0, v10}, Lcom/daaw/ox0$e;-><init>(Lcom/daaw/ox0;[ILjava/util/ArrayList;)V

    const/4 v4, 0x0

    invoke-virtual {v3, v7, v2, v4, v4}, Lcom/daaw/tx0;->i(Landroid/os/Handler;Lcom/daaw/tx0$d;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/tx0$b;

    goto :goto_3

    :cond_3
    invoke-virtual {v11}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method
