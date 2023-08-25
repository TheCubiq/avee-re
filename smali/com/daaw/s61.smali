.class public final synthetic Lcom/daaw/s61;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# instance fields
.field public final synthetic a:Lcom/daaw/r71;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lcom/daaw/wf$a;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r71;Ljava/lang/String;Ljava/util/Map;Lcom/daaw/wf$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/s61;->a:Lcom/daaw/r71;

    iput-object p2, p0, Lcom/daaw/s61;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/s61;->c:Ljava/util/Map;

    iput-object p4, p0, Lcom/daaw/s61;->d:Lcom/daaw/wf$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/s61;->a:Lcom/daaw/r71;

    iget-object v1, p0, Lcom/daaw/s61;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/s61;->c:Ljava/util/Map;

    iget-object v3, p0, Lcom/daaw/s61;->d:Lcom/daaw/wf$a;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/daaw/r71;->Y(Lcom/daaw/r71;Ljava/lang/String;Ljava/util/Map;Lcom/daaw/wf$a;Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/wf;

    move-result-object p1

    return-object p1
.end method
