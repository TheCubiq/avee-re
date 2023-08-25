.class public final synthetic Lcom/daaw/cp5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/dp5;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dp5;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cp5;->a:Lcom/daaw/dp5;

    iput-wide p2, p0, Lcom/daaw/cp5;->b:J

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp5;->a:Lcom/daaw/dp5;

    iget-wide v1, p0, Lcom/daaw/cp5;->b:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Lcom/daaw/ip5;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/t63;->T()Lcom/daaw/s63;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/s63;->z(J)Lcom/daaw/s63;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v0

    check-cast v0, Lcom/daaw/t63;

    invoke-virtual {v0}, Lcom/daaw/hq7;->a()[B

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {p1, v3, v3}, Lcom/daaw/kp5;->g(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    invoke-static {p1, v1, v2, v0}, Lcom/daaw/kp5;->d(Landroid/database/sqlite/SQLiteDatabase;J[B)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
