.class public Lcom/daaw/qv1$s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Lcom/daaw/dv1;",
        "Ljava/lang/Integer;",
        "Landroid/content/Intent;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/dv1;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Landroid/content/Intent;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/qv1$s;->b(Lcom/daaw/dv1;Ljava/lang/Integer;Landroid/content/Intent;)V

    return-void
.end method

.method public b(Lcom/daaw/dv1;Ljava/lang/Integer;Landroid/content/Intent;)V
    .locals 16

    move-object/from16 v1, p0

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x35

    if-ne v0, v2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x36

    if-ne v0, v2, :cond_5

    if-eqz p3, :cond_4

    invoke-virtual/range {p3 .. p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual/range {p3 .. p3}, Landroid/content/Intent;->getFlags()I

    move-result v0

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_1

    const-string v0, "offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->O(Lcom/daaw/qv1;)Lcom/daaw/dv1$d;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/daaw/k10;->b(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v8, v4

    goto :goto_1

    :cond_2
    move-object v8, v3

    :goto_1
    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v5, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    new-instance v6, Lcom/daaw/al;

    invoke-virtual/range {p1 .. p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/daaw/al;-><init>(Landroid/app/Activity;)V

    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->O(Lcom/daaw/qv1;)Lcom/daaw/dv1$d;

    move-result-object v7

    const/4 v9, 0x0

    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->P(Lcom/daaw/qv1;)J

    move-result-wide v10

    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->Q(Lcom/daaw/qv1;)J

    move-result-wide v12

    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->R(Lcom/daaw/qv1;)J

    move-result-wide v14

    invoke-virtual/range {v5 .. v15}, Lcom/daaw/qv1;->h0(Lcom/daaw/al;Lcom/daaw/dv1$d;Ljava/io/File;Ljava/io/OutputStream;JJJ)V

    goto :goto_3

    :cond_3
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    :goto_2
    move-object v8, v3

    iget-object v4, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    new-instance v5, Lcom/daaw/al;

    invoke-virtual/range {p1 .. p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/daaw/al;-><init>(Landroid/app/Activity;)V

    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->O(Lcom/daaw/qv1;)Lcom/daaw/dv1$d;

    move-result-object v6

    const/4 v7, 0x0

    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->P(Lcom/daaw/qv1;)J

    move-result-wide v9

    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->Q(Lcom/daaw/qv1;)J

    move-result-wide v11

    iget-object v0, v1, Lcom/daaw/qv1$s;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->R(Lcom/daaw/qv1;)J

    move-result-wide v13

    invoke-virtual/range {v4 .. v14}, Lcom/daaw/qv1;->h0(Lcom/daaw/al;Lcom/daaw/dv1$d;Ljava/io/File;Ljava/io/OutputStream;JJJ)V

    goto :goto_3

    :cond_4
    const-string v0, "PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_5
    :goto_3
    return-void
.end method
