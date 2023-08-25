.class public Lcom/daaw/rv1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/iv1;",
        "Lcom/daaw/sv1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/rv1;


# direct methods
.method public constructor <init>(Lcom/daaw/rv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rv1$a;->a:Lcom/daaw/rv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/iv1;Lcom/daaw/sv1;)V
    .locals 16

    move-object/from16 v0, p2

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v6

    iget v1, v0, Lcom/daaw/sv1;->a:I

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/pv1;->O(I[I)Lcom/daaw/vn;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v1}, Lcom/daaw/vn;->p()Ljava/lang/String;

    move-result-object v12

    sget-object v9, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "visualizer_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/daaw/sv1;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    iget v0, v0, Lcom/daaw/sv1;->a:I

    invoke-static {v0}, Lcom/daaw/j5;->a(I)Ljava/io/File;

    move-result-object v0

    const/4 v14, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-array v0, v14, [Ljava/io/File;

    :goto_0
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    move-object/from16 v15, p0

    iget-object v7, v15, Lcom/daaw/rv1$a;->a:Lcom/daaw/rv1;

    invoke-virtual/range {p1 .. p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v8

    const-string v11, ".viz"

    invoke-static/range {v7 .. v13}, Lcom/daaw/rv1;->e(Lcom/daaw/rv1;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/daaw/cr1;->r(Landroid/content/Context;Ljava/lang/String;)V

    const v0, 0x7f10023c

    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x2

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v7}, Lcom/daaw/cr1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "text/plain"

    move-object v1, v6

    move-object v2, v8

    invoke-static/range {v0 .. v5}, Lcom/daaw/qv1;->g0(ILandroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "text/plain"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x4000000

    invoke-static {v6, v14, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    const-string v1, "notification"

    invoke-virtual {v6, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    new-instance v2, Lcom/daaw/dt0$d;

    invoke-direct {v2, v6}, Lcom/daaw/dt0$d;-><init>(Landroid/content/Context;)V

    invoke-static {v7}, Lcom/daaw/cr1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/dt0$d;->i(Ljava/lang/CharSequence;)Lcom/daaw/dt0$d;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/daaw/dt0$d;->h(Ljava/lang/CharSequence;)Lcom/daaw/dt0$d;

    move-result-object v3

    const v4, 0x7f08011a

    invoke-virtual {v3, v4}, Lcom/daaw/dt0$d;->n(I)Lcom/daaw/dt0$d;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/daaw/dt0$d;->g(Landroid/app/PendingIntent;)Lcom/daaw/dt0$d;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/daaw/dt0$d;->l(Z)Lcom/daaw/dt0$d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/daaw/dt0$d;->e(Z)Lcom/daaw/dt0$d;

    const/4 v0, 0x2

    invoke-virtual {v2}, Lcom/daaw/dt0$d;->b()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    sget-object v0, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {v0, v8}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void

    :cond_3
    :goto_1
    move-object/from16 v15, p0

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/iv1;

    check-cast p2, Lcom/daaw/sv1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/rv1$a;->a(Lcom/daaw/iv1;Lcom/daaw/sv1;)V

    return-void
.end method
