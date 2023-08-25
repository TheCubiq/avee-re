.class public final synthetic Lcom/daaw/j71;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/daaw/sn1;


# direct methods
.method public synthetic constructor <init>(JLcom/daaw/sn1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/j71;->a:J

    iput-object p3, p0, Lcom/daaw/j71;->b:Lcom/daaw/sn1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Lcom/daaw/j71;->a:J

    iget-object v2, p0, Lcom/daaw/j71;->b:Lcom/daaw/sn1;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/r71;->M(JLcom/daaw/sn1;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
