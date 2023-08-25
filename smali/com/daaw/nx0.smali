.class public final synthetic Lcom/daaw/nx0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g0;


# instance fields
.field public final synthetic a:Lcom/daaw/ox0$a;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:J

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ox0$a;Landroid/app/Activity;JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nx0;->a:Lcom/daaw/ox0$a;

    iput-object p2, p0, Lcom/daaw/nx0;->b:Landroid/app/Activity;

    iput-wide p3, p0, Lcom/daaw/nx0;->c:J

    iput-boolean p5, p0, Lcom/daaw/nx0;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/nx0;->a:Lcom/daaw/ox0$a;

    iget-object v1, p0, Lcom/daaw/nx0;->b:Landroid/app/Activity;

    iget-wide v2, p0, Lcom/daaw/nx0;->c:J

    iget-boolean v4, p0, Lcom/daaw/nx0;->d:Z

    move-object v5, p1

    check-cast v5, [J

    move-object v6, p2

    check-cast v6, Ljava/util/ArrayList;

    move-object v7, p3

    check-cast v7, Ljava/util/ArrayList;

    invoke-static/range {v0 .. v7}, Lcom/daaw/ox0$a;->a(Lcom/daaw/ox0$a;Landroid/app/Activity;JZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
