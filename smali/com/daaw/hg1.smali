.class public Lcom/daaw/hg1;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static A:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static B:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public q:Landroid/widget/Button;

.field public r:Landroid/widget/LinearLayout;

.field public s:Landroid/view/View;

.field public t:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

.field public u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

.field public v:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

.field public w:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

.field public x:Landroid/widget/TextView;

.field public y:Z

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/hg1;->A:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/hg1;->B:Lcom/daaw/vw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/hg1;->p:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/hg1;->y:Z

    iput v0, p0, Lcom/daaw/hg1;->z:I

    return-void
.end method

.method public static synthetic a(Lcom/daaw/hg1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/hg1;->k(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/hg1;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/hg1;->l(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/hg1;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/hg1;->m(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/kz0;Lcom/daaw/kz0;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/hg1;->j(Lcom/daaw/kz0;Lcom/daaw/kz0;)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Lcom/daaw/hg1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/hg1;->n(Landroid/view/View;)V

    return-void
.end method

.method public static f(Lcom/daaw/al;)V
    .locals 2

    new-instance v0, Lcom/daaw/hg1;

    invoke-direct {v0}, Lcom/daaw/hg1;-><init>()V

    const-string v1, "StoreDialog"

    invoke-static {v0, v1, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-void
.end method

.method public static synthetic j(Lcom/daaw/kz0;Lcom/daaw/kz0;)I
    .locals 2

    invoke-static {p0}, Lcom/daaw/wb;->m(Lcom/daaw/kz0;)Lcom/daaw/kz0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/kz0$b;->c()J

    move-result-wide v0

    invoke-static {p1}, Lcom/daaw/wb;->m(Lcom/daaw/kz0;)Lcom/daaw/kz0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/kz0$b;->c()J

    move-result-wide p0

    sub-long/2addr v0, p0

    long-to-int p0, v0

    return p0
.end method

.method private synthetic k(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/hg1;->w:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->getSku()Ljava/lang/String;

    move-result-object p1

    :goto_0
    sget-object v0, Lcom/daaw/nc0;->o:Lcom/daaw/ww1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://play.google.com/store/account/subscriptions?sku="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&package="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "com.daaw.avee"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Landroid/app/DialogFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lcom/daaw/gr1;->j(Landroid/app/DialogFragment;)V

    sget-object v0, Lcom/daaw/hg1;->A:Lcom/daaw/qw1;

    invoke-virtual {v0, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private synthetic l(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/hg1;->h()V

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private synthetic m(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/hg1;->i()V

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private synthetic n(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/hg1;->w:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    if-eq p1, v0, :cond_1

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->setChecked(Z)V

    :cond_0
    check-cast p1, Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object p1, p0, Lcom/daaw/hg1;->w:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->setChecked(Z)V

    iget-object p1, p0, Lcom/daaw/hg1;->w:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    invoke-virtual {p0, p1}, Lcom/daaw/hg1;->o(Lcom/daaw/avee/comp/InAppBilling/StoreItem;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final g(I)Lcom/daaw/avee/comp/InAppBilling/StoreItem;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/hg1;->v:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/hg1;->u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/daaw/hg1;->t:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    return-object p1
.end method

.method public final h()V
    .locals 6

    sget-object v0, Lcom/daaw/nc0;->r:Lcom/daaw/vw1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v2, p0, Lcom/daaw/hg1;->r:Landroid/widget/LinearLayout;

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_1

    :try_start_0
    sget-object v2, Lcom/daaw/gg1;->p:Lcom/daaw/gg1;

    invoke-interface {v0, v2}, Ljava/util/List;->sort(Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/kz0;

    invoke-virtual {p0, v3}, Lcom/daaw/hg1;->g(I)Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->setDetails(Lcom/daaw/kz0;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v0, 0x3

    if-ge v3, v0, :cond_3

    invoke-virtual {p0, v3}, Lcom/daaw/hg1;->g(I)Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->setDetails(Lcom/daaw/kz0;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/daaw/hg1;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/daaw/hg1;->s:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/daaw/hg1;->q:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final i()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/hg1;->t:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->b()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/hg1;->u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->b()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/hg1;->v:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->b()V

    :cond_2
    iget-object v0, p0, Lcom/daaw/hg1;->w:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lcom/daaw/hg1;->o(Lcom/daaw/avee/comp/InAppBilling/StoreItem;)V

    :cond_3
    iget-object v0, p0, Lcom/daaw/hg1;->x:Landroid/widget/TextView;

    if-nez v0, :cond_4

    return-void

    :cond_4
    sget-object v0, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/daaw/nc0;->p:Lcom/daaw/vw1;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/hg1;->x:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public final o(Lcom/daaw/avee/comp/InAppBilling/StoreItem;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/hg1;->q:Landroid/widget/Button;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/daaw/nc0;->o:Lcom/daaw/ww1;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->getSku()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcom/daaw/hg1;->q:Landroid/widget/Button;

    if-eqz p1, :cond_1

    const v1, 0x7f100291

    goto :goto_0

    :cond_1
    const v1, 0x7f10028e

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    iget-object v0, p0, Lcom/daaw/hg1;->q:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setActivated(Z)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c006a

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090080

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/daaw/hg1;->q:Landroid/widget/Button;

    const v1, 0x7f0901ef

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/daaw/hg1;->r:Landroid/widget/LinearLayout;

    const v1, 0x7f09006f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/hg1;->s:Landroid/view/View;

    const v1, 0x7f09016f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object v1, p0, Lcom/daaw/hg1;->t:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    const v1, 0x7f090170

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object v1, p0, Lcom/daaw/hg1;->u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    const v1, 0x7f090171

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object v1, p0, Lcom/daaw/hg1;->v:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    const v1, 0x7f090185

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/hg1;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/daaw/hg1;->q:Landroid/widget/Button;

    new-instance v2, Lcom/daaw/cg1;

    invoke-direct {v2, p0}, Lcom/daaw/cg1;-><init>(Lcom/daaw/hg1;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/daaw/hg1;->t:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    invoke-virtual {p0, v1}, Lcom/daaw/hg1;->p(Lcom/daaw/avee/comp/InAppBilling/StoreItem;)V

    iget-object v1, p0, Lcom/daaw/hg1;->u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    invoke-virtual {p0, v1}, Lcom/daaw/hg1;->p(Lcom/daaw/avee/comp/InAppBilling/StoreItem;)V

    iget-object v1, p0, Lcom/daaw/hg1;->v:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    invoke-virtual {p0, v1}, Lcom/daaw/hg1;->p(Lcom/daaw/avee/comp/InAppBilling/StoreItem;)V

    iget-object v1, p0, Lcom/daaw/hg1;->u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->e()V

    iget-object v1, p0, Lcom/daaw/hg1;->u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->setChecked(Z)V

    iget-object v1, p0, Lcom/daaw/hg1;->u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object v1, p0, Lcom/daaw/hg1;->w:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    sget-object v1, Lcom/daaw/nc0;->q:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/eg1;

    invoke-direct {v2, p0}, Lcom/daaw/eg1;-><init>(Lcom/daaw/hg1;)V

    iget-object v3, p0, Lcom/daaw/hg1;->p:Ljava/util/List;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/daaw/hg1;->h()V

    sget-object v1, Lcom/daaw/nc0;->n:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/fg1;

    invoke-direct {v2, p0}, Lcom/daaw/fg1;-><init>(Lcom/daaw/hg1;)V

    iget-object v3, p0, Lcom/daaw/hg1;->p:Ljava/util/List;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/daaw/hg1;->i()V

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hg1;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/hg1;->r:Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/daaw/hg1;->s:Landroid/view/View;

    iput-object v0, p0, Lcom/daaw/hg1;->t:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object v0, p0, Lcom/daaw/hg1;->u:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object v0, p0, Lcom/daaw/hg1;->v:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object v0, p0, Lcom/daaw/hg1;->w:Lcom/daaw/avee/comp/InAppBilling/StoreItem;

    iput-object v0, p0, Lcom/daaw/hg1;->x:Landroid/widget/TextView;

    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroyView()V

    return-void
.end method

.method public final p(Lcom/daaw/avee/comp/InAppBilling/StoreItem;)V
    .locals 1

    new-instance v0, Lcom/daaw/dg1;

    invoke-direct {v0, p0}, Lcom/daaw/dg1;-><init>(Lcom/daaw/hg1;)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
