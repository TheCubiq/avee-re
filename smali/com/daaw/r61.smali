.class public final synthetic Lcom/daaw/r61;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# instance fields
.field public final synthetic a:Lcom/daaw/r71;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r71;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r61;->a:Lcom/daaw/r71;

    iput-object p2, p0, Lcom/daaw/r61;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/r61;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/r61;->a:Lcom/daaw/r71;

    iget-object v1, p0, Lcom/daaw/r61;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/r61;->c:Ljava/lang/String;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/r71;->c0(Lcom/daaw/r71;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
