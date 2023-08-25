.class public final synthetic Lcom/daaw/fp5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/gp5;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Lcom/daaw/o63;

.field public final synthetic e:Lcom/daaw/x63;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/gp5;ZLjava/util/ArrayList;Lcom/daaw/o63;Lcom/daaw/x63;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fp5;->a:Lcom/daaw/gp5;

    iput-boolean p2, p0, Lcom/daaw/fp5;->b:Z

    iput-object p3, p0, Lcom/daaw/fp5;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/daaw/fp5;->d:Lcom/daaw/o63;

    iput-object p5, p0, Lcom/daaw/fp5;->e:Lcom/daaw/x63;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/daaw/fp5;->a:Lcom/daaw/gp5;

    iget-boolean v1, p0, Lcom/daaw/fp5;->b:Z

    iget-object v2, p0, Lcom/daaw/fp5;->c:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/daaw/fp5;->d:Lcom/daaw/o63;

    iget-object v4, p0, Lcom/daaw/fp5;->e:Lcom/daaw/x63;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    iget-object v5, v0, Lcom/daaw/gp5;->b:Lcom/daaw/hp5;

    invoke-virtual {v5}, Lcom/daaw/ip5;->a()Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, v0, Lcom/daaw/gp5;->b:Lcom/daaw/hp5;

    invoke-static {v5, v1, v2, v3, v4}, Lcom/daaw/hp5;->f(Lcom/daaw/hp5;ZLjava/util/ArrayList;Lcom/daaw/o63;Lcom/daaw/x63;)[B

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {p1, v1, v3}, Lcom/daaw/kp5;->g(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    iget-object v0, v0, Lcom/daaw/gp5;->b:Lcom/daaw/hp5;

    invoke-static {v0}, Lcom/daaw/hp5;->d(Lcom/daaw/hp5;)Lcom/daaw/zo5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/zo5;->d()J

    move-result-wide v0

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/kp5;->d(Landroid/database/sqlite/SQLiteDatabase;J[B)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
