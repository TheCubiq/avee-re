.class public final synthetic Lcom/daaw/v61;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/dl0$b;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/dl0$b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v61;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/v61;->b:Lcom/daaw/dl0$b;

    iput-wide p3, p0, Lcom/daaw/v61;->c:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/v61;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/v61;->b:Lcom/daaw/dl0$b;

    iget-wide v2, p0, Lcom/daaw/v61;->c:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/daaw/r71;->T(Ljava/lang/String;Lcom/daaw/dl0$b;JLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
