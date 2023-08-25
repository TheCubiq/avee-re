.class public final synthetic Lcom/daaw/q71;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# instance fields
.field public final synthetic a:Lcom/daaw/r71;

.field public final synthetic b:Lcom/daaw/sn1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r71;Lcom/daaw/sn1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q71;->a:Lcom/daaw/r71;

    iput-object p2, p0, Lcom/daaw/q71;->b:Lcom/daaw/sn1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/q71;->a:Lcom/daaw/r71;

    iget-object v1, p0, Lcom/daaw/q71;->b:Lcom/daaw/sn1;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lcom/daaw/r71;->V(Lcom/daaw/r71;Lcom/daaw/sn1;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
