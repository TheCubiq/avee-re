.class public Lcom/daaw/or0;
.super Lcom/daaw/or;
.source ""


# instance fields
.field public e:Lcom/daaw/avee/comp/playback/e$b;

.field public f:Lcom/daaw/ne0;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/e$b;Lcom/daaw/ne0;ILandroid/content/Context;I)V
    .locals 0

    invoke-direct {p0, p4, p5}, Lcom/daaw/or;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, Lcom/daaw/or0;->e:Lcom/daaw/avee/comp/playback/e$b;

    iput-object p2, p0, Lcom/daaw/or0;->f:Lcom/daaw/ne0;

    iput p3, p0, Lcom/daaw/or0;->g:I

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Lcom/daaw/yu;[Lcom/daaw/m7;Landroid/os/Handler;Lcom/daaw/n7;ILjava/util/ArrayList;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;[",
            "Lcom/daaw/m7;",
            "Landroid/os/Handler;",
            "Lcom/daaw/n7;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/a41;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    new-instance v13, Lcom/daaw/nr0;

    iget-object v2, v0, Lcom/daaw/or0;->f:Lcom/daaw/ne0;

    iget v3, v0, Lcom/daaw/or0;->g:I

    new-instance v4, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v4, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v6, Lcom/daaw/eo0;->a:Lcom/daaw/eo0;

    invoke-static {p1}, Lcom/daaw/g7;->a(Landroid/content/Context;)Lcom/daaw/g7;

    move-result-object v11

    const/4 v8, 0x1

    move-object v1, v13

    move-object v5, p1

    move-object/from16 v7, p2

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v12, p3

    invoke-direct/range {v1 .. v12}, Lcom/daaw/nr0;-><init>(Lcom/daaw/ne0;ILjava/lang/ref/WeakReference;Landroid/content/Context;Lcom/daaw/eo0;Lcom/daaw/yu;ZLandroid/os/Handler;Lcom/daaw/n7;Lcom/daaw/g7;[Lcom/daaw/m7;)V

    move-object/from16 v1, p7

    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
