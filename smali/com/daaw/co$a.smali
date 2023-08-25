.class public final Lcom/daaw/co$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/co;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:Lcom/daaw/zn$a;

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/os/Bundle;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public g:Landroid/os/Bundle;

.field public h:I

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    new-instance v0, Lcom/daaw/zn$a;

    invoke-direct {v0}, Lcom/daaw/zn$a;-><init>()V

    iput-object v0, p0, Lcom/daaw/co$a;->b:Lcom/daaw/zn$a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/co$a;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/co$a;->i:Z

    return-void
.end method

.method public constructor <init>(Lcom/daaw/eo;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    new-instance v0, Lcom/daaw/zn$a;

    invoke-direct {v0}, Lcom/daaw/zn$a;-><init>()V

    iput-object v0, p0, Lcom/daaw/co$a;->b:Lcom/daaw/zn$a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/co$a;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/co$a;->i:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/co$a;->b(Lcom/daaw/eo;)Lcom/daaw/co$a;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/co;
    .locals 3

    iget-object v0, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    const-string v1, "android.support.customtabs.extra.SESSION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lcom/daaw/co$a;->c(Landroid/os/IBinder;Landroid/app/PendingIntent;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/co$a;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    const-string v2, "android.support.customtabs.extra.MENU_ITEMS"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_1
    iget-object v0, p0, Lcom/daaw/co$a;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    const-string v2, "android.support.customtabs.extra.TOOLBAR_ITEMS"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_2
    iget-object v0, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    iget-boolean v1, p0, Lcom/daaw/co$a;->i:Z

    const-string v2, "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    iget-object v1, p0, Lcom/daaw/co$a;->b:Lcom/daaw/zn$a;

    invoke-virtual {v1}, Lcom/daaw/zn$a;->a()Lcom/daaw/zn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/zn;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/daaw/co$a;->g:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    iget-object v0, p0, Lcom/daaw/co$a;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/daaw/co$a;->f:Landroid/util/SparseArray;

    const-string v2, "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    iget-object v1, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_4
    iget-object v0, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    iget v1, p0, Lcom/daaw/co$a;->h:I

    const-string v2, "androidx.browser.customtabs.extra.SHARE_STATE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    new-instance v0, Lcom/daaw/co;

    iget-object v1, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    iget-object v2, p0, Lcom/daaw/co$a;->d:Landroid/os/Bundle;

    invoke-direct {v0, v1, v2}, Lcom/daaw/co;-><init>(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public b(Lcom/daaw/eo;)Lcom/daaw/co$a;
    .locals 2

    iget-object v0, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/daaw/eo;->b()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/daaw/eo;->a()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/eo;->c()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/co$a;->c(Landroid/os/IBinder;Landroid/app/PendingIntent;)V

    return-object p0
.end method

.method public final c(Landroid/os/IBinder;Landroid/app/PendingIntent;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "android.support.customtabs.extra.SESSION"

    invoke-static {v0, v1, p1}, Lcom/daaw/yc;->b(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V

    if-eqz p2, :cond_0

    const-string p1, "android.support.customtabs.extra.SESSION_ID"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/co$a;->a:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    return-void
.end method
