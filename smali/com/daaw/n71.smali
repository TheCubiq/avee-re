.class public final synthetic Lcom/daaw/n71;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# instance fields
.field public final synthetic a:Lcom/daaw/r71;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r71;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n71;->a:Lcom/daaw/r71;

    iput-wide p2, p0, Lcom/daaw/n71;->b:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/n71;->a:Lcom/daaw/r71;

    iget-wide v1, p0, Lcom/daaw/n71;->b:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/r71;->h0(Lcom/daaw/r71;JLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
